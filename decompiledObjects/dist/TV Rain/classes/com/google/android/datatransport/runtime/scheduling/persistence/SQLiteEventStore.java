package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal.Builder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import z2;

@Singleton
@WorkerThread
public class SQLiteEventStore
  implements EventStore, SynchronizationGuard, ClientHealthMetricsStore
{
  private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
  private static final String LOG_TAG = "SQLiteEventStore";
  public static final int MAX_RETRIES = 16;
  private static final Encoding PROTOBUF_ENCODING = Encoding.of("proto");
  private final EventStoreConfig config;
  private final Clock monotonicClock;
  private final Provider<String> packageName;
  private final SchemaManager schemaManager;
  private final Clock wallClock;
  
  @Inject
  public SQLiteEventStore(@WallTime Clock paramClock1, @Monotonic Clock paramClock2, EventStoreConfig paramEventStoreConfig, SchemaManager paramSchemaManager, @Named("PACKAGE_NAME") Provider<String> paramProvider)
  {
    schemaManager = paramSchemaManager;
    wallClock = paramClock1;
    monotonicClock = paramClock2;
    config = paramEventStoreConfig;
    packageName = paramProvider;
  }
  
  private LogEventDropped.Reason convertToReason(int paramInt)
  {
    LogEventDropped.Reason localReason1 = LogEventDropped.Reason.REASON_UNKNOWN;
    if (paramInt == localReason1.getNumber()) {
      return localReason1;
    }
    LogEventDropped.Reason localReason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
    if (paramInt == localReason2.getNumber()) {
      return localReason2;
    }
    localReason2 = LogEventDropped.Reason.CACHE_FULL;
    if (paramInt == localReason2.getNumber()) {
      return localReason2;
    }
    localReason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
    if (paramInt == localReason2.getNumber()) {
      return localReason2;
    }
    localReason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
    if (paramInt == localReason2.getNumber()) {
      return localReason2;
    }
    localReason2 = LogEventDropped.Reason.INVALID_PAYLOD;
    if (paramInt == localReason2.getNumber()) {
      return localReason2;
    }
    localReason2 = LogEventDropped.Reason.SERVER_ERROR;
    if (paramInt == localReason2.getNumber()) {
      return localReason2;
    }
    Logging.d("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(paramInt));
    return localReason1;
  }
  
  private void ensureBeginTransaction(SQLiteDatabase paramSQLiteDatabase)
  {
    retryIfDbLocked(new b(paramSQLiteDatabase, 2), new a(6));
  }
  
  private long ensureTransportContext(SQLiteDatabase paramSQLiteDatabase, TransportContext paramTransportContext)
  {
    Object localObject = getTransportContextId(paramSQLiteDatabase, paramTransportContext);
    if (localObject != null) {
      return ((Long)localObject).longValue();
    }
    localObject = new ContentValues();
    ((ContentValues)localObject).put("backend_name", paramTransportContext.getBackendName());
    ((ContentValues)localObject).put("priority", Integer.valueOf(PriorityMapping.toInt(paramTransportContext.getPriority())));
    ((ContentValues)localObject).put("next_request_ms", Integer.valueOf(0));
    if (paramTransportContext.getExtras() != null) {
      ((ContentValues)localObject).put("extras", Base64.encodeToString(paramTransportContext.getExtras(), 0));
    }
    return paramSQLiteDatabase.insert("transport_contexts", null, (ContentValues)localObject);
  }
  
  private GlobalMetrics getGlobalMetrics()
  {
    return GlobalMetrics.newBuilder().setStorageMetrics(StorageMetrics.newBuilder().setCurrentCacheSizeBytes(getByteSize()).setMaxCacheSizeBytes(EventStoreConfig.DEFAULT.getMaxStorageSizeInBytes()).build()).build();
  }
  
  private long getPageCount()
  {
    return getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
  }
  
  private long getPageSize()
  {
    return getDb().compileStatement("PRAGMA page_size").simpleQueryForLong();
  }
  
  private TimeWindow getTimeWindow()
  {
    return (TimeWindow)inTransaction(new d(wallClock.getTime(), 0));
  }
  
  @Nullable
  private Long getTransportContextId(SQLiteDatabase paramSQLiteDatabase, TransportContext paramTransportContext)
  {
    StringBuilder localStringBuilder = new StringBuilder("backend_name = ? and priority = ?");
    Object localObject = new ArrayList(Arrays.asList(new String[] { paramTransportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(paramTransportContext.getPriority())) }));
    if (paramTransportContext.getExtras() != null)
    {
      localStringBuilder.append(" and extras = ?");
      ((ArrayList)localObject).add(Base64.encodeToString(paramTransportContext.getExtras(), 0));
    }
    else
    {
      localStringBuilder.append(" and extras is null");
    }
    paramTransportContext = localStringBuilder.toString();
    localObject = (String[])((ArrayList)localObject).toArray(new String[0]);
    return (Long)tryWithCursor(paramSQLiteDatabase.query("transport_contexts", new String[] { "_id" }, paramTransportContext, (String[])localObject, null, null, null), new a(9));
  }
  
  private boolean isStorageAtLimit()
  {
    boolean bool;
    if (getPageCount() * getPageSize() >= config.getMaxStorageSizeInBytes()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private List<PersistedEvent> join(List<PersistedEvent> paramList, Map<Long, Set<Metadata>> paramMap)
  {
    ListIterator localListIterator = paramList.listIterator();
    while (localListIterator.hasNext())
    {
      PersistedEvent localPersistedEvent = (PersistedEvent)localListIterator.next();
      if (paramMap.containsKey(Long.valueOf(localPersistedEvent.getId())))
      {
        EventInternal.Builder localBuilder = localPersistedEvent.getEvent().toBuilder();
        Iterator localIterator = ((Set)paramMap.get(Long.valueOf(localPersistedEvent.getId()))).iterator();
        while (localIterator.hasNext())
        {
          Metadata localMetadata = (Metadata)localIterator.next();
          localBuilder.addMetadata(key, value);
        }
        localListIterator.set(PersistedEvent.create(localPersistedEvent.getId(), localPersistedEvent.getTransportContext(), localBuilder.build()));
      }
    }
    return paramList;
  }
  
  private List<PersistedEvent> loadEvents(SQLiteDatabase paramSQLiteDatabase, TransportContext paramTransportContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = getTransportContextId(paramSQLiteDatabase, paramTransportContext);
    if (localObject == null) {
      return localArrayList;
    }
    localObject = ((Long)localObject).toString();
    tryWithCursor(paramSQLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { localObject }, null, null, null, String.valueOf(paramInt)), new e(this, localArrayList, paramTransportContext, 2));
    return localArrayList;
  }
  
  private Map<Long, Set<Metadata>> loadMetadata(SQLiteDatabase paramSQLiteDatabase, List<PersistedEvent> paramList)
  {
    HashMap localHashMap = new HashMap();
    StringBuilder localStringBuilder = new StringBuilder("event_id IN (");
    for (int i = 0; i < paramList.size(); i++)
    {
      localStringBuilder.append(((PersistedEvent)paramList.get(i)).getId());
      if (i < paramList.size() - 1) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append(')');
    paramList = localStringBuilder.toString();
    tryWithCursor(paramSQLiteDatabase.query("event_metadata", new String[] { "event_id", "name", "value" }, paramList, null, null, null, null), new b(localHashMap, 0));
    return localHashMap;
  }
  
  private static byte[] maybeBase64Decode(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Base64.decode(paramString, 0);
  }
  
  private void populateLogSourcesMetrics(ClientMetrics.Builder paramBuilder, Map<String, List<LogEventDropped>> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      paramBuilder.addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource((String)paramMap.getKey()).setLogEventDroppedList((List)paramMap.getValue()).build());
    }
  }
  
  private byte[] readPayload(long paramLong)
  {
    return (byte[])tryWithCursor(getDb().query("event_payloads", new String[] { "bytes" }, "event_id = ?", new String[] { String.valueOf(paramLong) }, null, null, "sequence_num"), new a(1));
  }
  
  private <T> T retryIfDbLocked(Producer<T> paramProducer, Function<Throwable, T> paramFunction)
  {
    long l = monotonicClock.getTime();
    for (;;)
    {
      try
      {
        Object localObject = paramProducer.produce();
        return (T)localObject;
      }
      catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
      {
        if (monotonicClock.getTime() >= config.getCriticalSectionEnterTimeoutMs() + l) {
          return (T)paramFunction.apply(localSQLiteDatabaseLockedException);
        }
        SystemClock.sleep(50L);
      }
    }
  }
  
  private static Encoding toEncoding(@Nullable String paramString)
  {
    if (paramString == null) {
      return PROTOBUF_ENCODING;
    }
    return Encoding.of(paramString);
  }
  
  private static String toIdList(Iterable<PersistedEvent> paramIterable)
  {
    StringBuilder localStringBuilder = new StringBuilder("(");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localStringBuilder.append(((PersistedEvent)paramIterable.next()).getId());
      if (paramIterable.hasNext()) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  @VisibleForTesting
  public static <T> T tryWithCursor(Cursor paramCursor, Function<Cursor, T> paramFunction)
  {
    try
    {
      paramFunction = paramFunction.apply(paramCursor);
      return paramFunction;
    }
    finally
    {
      paramCursor.close();
    }
  }
  
  public int cleanUp()
  {
    return ((Integer)inTransaction(new i(this, wallClock.getTime() - config.getEventCleanUpAge()))).intValue();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public void clearDb()
  {
    inTransaction(new a(0));
  }
  
  public void close()
  {
    schemaManager.close();
  }
  
  @VisibleForTesting
  public long getByteSize()
  {
    return getPageCount() * getPageSize();
  }
  
  @VisibleForTesting
  public SQLiteDatabase getDb()
  {
    SchemaManager localSchemaManager = schemaManager;
    Objects.requireNonNull(localSchemaManager);
    return (SQLiteDatabase)retryIfDbLocked(new b(localSchemaManager, 1), new a(4));
  }
  
  public long getNextCallTime(TransportContext paramTransportContext)
  {
    return ((Long)tryWithCursor(getDb().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { paramTransportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(paramTransportContext.getPriority())) }), new a(5))).longValue();
  }
  
  public boolean hasPendingEventsFor(TransportContext paramTransportContext)
  {
    return ((Boolean)inTransaction(new f(this, paramTransportContext, 0))).booleanValue();
  }
  
  @VisibleForTesting
  public <T> T inTransaction(Function<SQLiteDatabase, T> paramFunction)
  {
    SQLiteDatabase localSQLiteDatabase = getDb();
    localSQLiteDatabase.beginTransaction();
    try
    {
      paramFunction = paramFunction.apply(localSQLiteDatabase);
      localSQLiteDatabase.setTransactionSuccessful();
      return paramFunction;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public Iterable<TransportContext> loadActiveContexts()
  {
    return (Iterable)inTransaction(new a(2));
  }
  
  public Iterable<PersistedEvent> loadBatch(TransportContext paramTransportContext)
  {
    return (Iterable)inTransaction(new f(this, paramTransportContext, 1));
  }
  
  public ClientMetrics loadClientMetrics()
  {
    ClientMetrics.Builder localBuilder = ClientMetrics.newBuilder();
    return (ClientMetrics)inTransaction(new c(this, new HashMap(), localBuilder));
  }
  
  @Nullable
  public PersistedEvent persist(TransportContext paramTransportContext, EventInternal paramEventInternal)
  {
    Logging.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[] { paramTransportContext.getPriority(), paramEventInternal.getTransportName(), paramTransportContext.getBackendName() });
    long l = ((Long)inTransaction(new e(this, paramEventInternal, paramTransportContext, 1))).longValue();
    if (l < 1L) {
      return null;
    }
    return PersistedEvent.create(l, paramTransportContext, paramEventInternal);
  }
  
  public void recordFailure(Iterable<PersistedEvent> paramIterable)
  {
    if (!paramIterable.iterator().hasNext()) {
      return;
    }
    StringBuilder localStringBuilder = z2.t("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
    localStringBuilder.append(toIdList(paramIterable));
    inTransaction(new e(this, localStringBuilder.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 3));
  }
  
  public void recordLogEventDropped(long paramLong, LogEventDropped.Reason paramReason, String paramString)
  {
    inTransaction(new g(paramLong, paramReason, paramString));
  }
  
  public void recordNextCallTime(TransportContext paramTransportContext, long paramLong)
  {
    inTransaction(new i(paramTransportContext, paramLong));
  }
  
  public void recordSuccess(Iterable<PersistedEvent> paramIterable)
  {
    if (!paramIterable.iterator().hasNext()) {
      return;
    }
    StringBuilder localStringBuilder = z2.t("DELETE FROM events WHERE _id in ");
    localStringBuilder.append(toIdList(paramIterable));
    paramIterable = localStringBuilder.toString();
    getDb().compileStatement(paramIterable).execute();
  }
  
  public void resetClientMetrics()
  {
    inTransaction(new h(this, 1));
  }
  
  public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> paramCriticalSection)
  {
    SQLiteDatabase localSQLiteDatabase = getDb();
    ensureBeginTransaction(localSQLiteDatabase);
    try
    {
      paramCriticalSection = paramCriticalSection.execute();
      localSQLiteDatabase.setTransactionSuccessful();
      return paramCriticalSection;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static abstract interface Function<T, U>
  {
    public abstract U apply(T paramT);
  }
  
  public static class Metadata
  {
    public final String key;
    public final String value;
    
    private Metadata(String paramString1, String paramString2)
    {
      key = paramString1;
      value = paramString2;
    }
  }
  
  public static abstract interface Producer<T>
  {
    public abstract T produce();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */