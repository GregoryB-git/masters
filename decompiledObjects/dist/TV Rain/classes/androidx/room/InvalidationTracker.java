package androidx.room;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import z2;

public class InvalidationTracker
{
  private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
  private static final String INVALIDATED_COLUMN_NAME = "invalidated";
  @VisibleForTesting
  public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
  @VisibleForTesting
  public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
  private static final String TABLE_ID_COLUMN_NAME = "table_id";
  private static final String[] TRIGGERS = { "UPDATE", "DELETE", "INSERT" };
  private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
  public volatile SupportSQLiteStatement mCleanupStatement;
  public final RoomDatabase mDatabase;
  private volatile boolean mInitialized;
  private final InvalidationLiveDataContainer mInvalidationLiveDataContainer;
  private MultiInstanceInvalidationClient mMultiInstanceInvalidationClient;
  private ObservedTableTracker mObservedTableTracker;
  @SuppressLint({"RestrictedApi"})
  @VisibleForTesting
  public final SafeIterableMap<Observer, ObserverWrapper> mObserverMap;
  public AtomicBoolean mPendingRefresh;
  @VisibleForTesting
  public Runnable mRefreshRunnable;
  @NonNull
  public final HashMap<String, Integer> mTableIdLookup;
  public final String[] mTableNames;
  @NonNull
  private Map<String, Set<String>> mViewTables;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public InvalidationTracker(RoomDatabase paramRoomDatabase, Map<String, String> paramMap, Map<String, Set<String>> paramMap1, String... paramVarArgs)
  {
    int i = 0;
    mPendingRefresh = new AtomicBoolean(false);
    mInitialized = false;
    mObserverMap = new SafeIterableMap();
    mRefreshRunnable = new Runnable()
    {
      private Set<Integer> checkUpdatedTable()
      {
        HashSet localHashSet = new HashSet();
        Cursor localCursor = mDatabase.query(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        try
        {
          while (localCursor.moveToNext()) {
            localHashSet.add(Integer.valueOf(localCursor.getInt(0)));
          }
          localCursor.close();
          if (!localHashSet.isEmpty()) {
            mCleanupStatement.executeUpdateDelete();
          }
          return localHashSet;
        }
        finally
        {
          localCursor.close();
        }
      }
      
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   4: getfield 27	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   7: invokevirtual 87	androidx/room/RoomDatabase:getCloseLock	()Ljava/util/concurrent/locks/Lock;
        //   10: astore_1
        //   11: aconst_null
        //   12: astore_2
        //   13: aconst_null
        //   14: astore_3
        //   15: aconst_null
        //   16: astore 4
        //   18: aload_2
        //   19: astore 5
        //   21: aload_3
        //   22: astore 6
        //   24: aload_1
        //   25: invokeinterface 92 1 0
        //   30: aload_2
        //   31: astore 5
        //   33: aload_3
        //   34: astore 6
        //   36: aload_0
        //   37: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   40: invokevirtual 95	androidx/room/InvalidationTracker:ensureInitialization	()Z
        //   43: istore 7
        //   45: iload 7
        //   47: ifne +10 -> 57
        //   50: aload_1
        //   51: invokeinterface 98 1 0
        //   56: return
        //   57: aload_2
        //   58: astore 5
        //   60: aload_3
        //   61: astore 6
        //   63: aload_0
        //   64: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   67: getfield 102	androidx/room/InvalidationTracker:mPendingRefresh	Ljava/util/concurrent/atomic/AtomicBoolean;
        //   70: iconst_1
        //   71: iconst_0
        //   72: invokevirtual 108	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
        //   75: istore 7
        //   77: iload 7
        //   79: ifne +10 -> 89
        //   82: aload_1
        //   83: invokeinterface 98 1 0
        //   88: return
        //   89: aload_2
        //   90: astore 5
        //   92: aload_3
        //   93: astore 6
        //   95: aload_0
        //   96: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   99: getfield 27	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   102: invokevirtual 111	androidx/room/RoomDatabase:inTransaction	()Z
        //   105: istore 7
        //   107: iload 7
        //   109: ifeq +10 -> 119
        //   112: aload_1
        //   113: invokeinterface 98 1 0
        //   118: return
        //   119: aload_2
        //   120: astore 5
        //   122: aload_3
        //   123: astore 6
        //   125: aload_0
        //   126: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   129: getfield 27	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   132: astore 8
        //   134: aload_2
        //   135: astore 5
        //   137: aload_3
        //   138: astore 6
        //   140: aload 8
        //   142: getfield 115	androidx/room/RoomDatabase:mWriteAheadLoggingEnabled	Z
        //   145: ifeq +91 -> 236
        //   148: aload_2
        //   149: astore 5
        //   151: aload_3
        //   152: astore 6
        //   154: aload 8
        //   156: invokevirtual 119	androidx/room/RoomDatabase:getOpenHelper	()Landroidx/sqlite/db/SupportSQLiteOpenHelper;
        //   159: invokeinterface 125 1 0
        //   164: astore 8
        //   166: aload_2
        //   167: astore 5
        //   169: aload_3
        //   170: astore 6
        //   172: aload 8
        //   174: invokeinterface 130 1 0
        //   179: aload_0
        //   180: invokespecial 132	androidx/room/InvalidationTracker$1:checkUpdatedTable	()Ljava/util/Set;
        //   183: astore_2
        //   184: aload_2
        //   185: astore 4
        //   187: aload 8
        //   189: invokeinterface 135 1 0
        //   194: aload_2
        //   195: astore 5
        //   197: aload_2
        //   198: astore 6
        //   200: aload 8
        //   202: invokeinterface 138 1 0
        //   207: goto +72 -> 279
        //   210: astore_2
        //   211: aload 4
        //   213: astore 5
        //   215: aload 4
        //   217: astore 6
        //   219: aload 8
        //   221: invokeinterface 138 1 0
        //   226: aload 4
        //   228: astore 5
        //   230: aload 4
        //   232: astore 6
        //   234: aload_2
        //   235: athrow
        //   236: aload_2
        //   237: astore 5
        //   239: aload_3
        //   240: astore 6
        //   242: aload_0
        //   243: invokespecial 132	androidx/room/InvalidationTracker$1:checkUpdatedTable	()Ljava/util/Set;
        //   246: astore_2
        //   247: goto +32 -> 279
        //   250: astore 6
        //   252: goto +120 -> 372
        //   255: astore 4
        //   257: aload 5
        //   259: astore 6
        //   261: goto +5 -> 266
        //   264: astore 4
        //   266: ldc -116
        //   268: ldc -114
        //   270: aload 4
        //   272: invokestatic 148	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   275: pop
        //   276: aload 6
        //   278: astore_2
        //   279: aload_1
        //   280: invokeinterface 98 1 0
        //   285: aload_2
        //   286: ifnull +85 -> 371
        //   289: aload_2
        //   290: invokeinterface 151 1 0
        //   295: ifne +76 -> 371
        //   298: aload_0
        //   299: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   302: getfield 155	androidx/room/InvalidationTracker:mObserverMap	Landroidx/arch/core/internal/SafeIterableMap;
        //   305: astore 6
        //   307: aload 6
        //   309: monitorenter
        //   310: aload_0
        //   311: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   314: getfield 155	androidx/room/InvalidationTracker:mObserverMap	Landroidx/arch/core/internal/SafeIterableMap;
        //   317: invokevirtual 161	androidx/arch/core/internal/SafeIterableMap:iterator	()Ljava/util/Iterator;
        //   320: astore 5
        //   322: aload 5
        //   324: invokeinterface 166 1 0
        //   329: ifeq +28 -> 357
        //   332: aload 5
        //   334: invokeinterface 170 1 0
        //   339: checkcast 172	java/util/Map$Entry
        //   342: invokeinterface 175 1 0
        //   347: checkcast 177	androidx/room/InvalidationTracker$ObserverWrapper
        //   350: aload_2
        //   351: invokevirtual 181	androidx/room/InvalidationTracker$ObserverWrapper:notifyByTableInvalidStatus	(Ljava/util/Set;)V
        //   354: goto -32 -> 322
        //   357: aload 6
        //   359: monitorexit
        //   360: goto +11 -> 371
        //   363: astore 5
        //   365: aload 6
        //   367: monitorexit
        //   368: aload 5
        //   370: athrow
        //   371: return
        //   372: aload_1
        //   373: invokeinterface 98 1 0
        //   378: aload 6
        //   380: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	381	0	this	1
        //   10	363	1	localLock	Lock
        //   12	186	2	localSet1	Set
        //   210	27	2	localObject1	Object
        //   246	105	2	localObject2	Object
        //   14	226	3	localObject3	Object
        //   16	215	4	localSet2	Set
        //   255	1	4	localSQLiteException	SQLiteException
        //   264	7	4	localIllegalStateException	IllegalStateException
        //   19	314	5	localObject4	Object
        //   363	6	5	localObject5	Object
        //   22	219	6	localObject6	Object
        //   250	1	6	localObject7	Object
        //   259	120	6	localObject8	Object
        //   43	65	7	bool	boolean
        //   132	88	8	localObject9	Object
        // Exception table:
        //   from	to	target	type
        //   179	184	210	finally
        //   187	194	210	finally
        //   24	30	250	finally
        //   36	45	250	finally
        //   63	77	250	finally
        //   95	107	250	finally
        //   125	134	250	finally
        //   140	148	250	finally
        //   154	166	250	finally
        //   172	179	250	finally
        //   200	207	250	finally
        //   219	226	250	finally
        //   234	236	250	finally
        //   242	247	250	finally
        //   266	276	250	finally
        //   24	30	255	android/database/sqlite/SQLiteException
        //   36	45	255	android/database/sqlite/SQLiteException
        //   63	77	255	android/database/sqlite/SQLiteException
        //   95	107	255	android/database/sqlite/SQLiteException
        //   125	134	255	android/database/sqlite/SQLiteException
        //   140	148	255	android/database/sqlite/SQLiteException
        //   154	166	255	android/database/sqlite/SQLiteException
        //   172	179	255	android/database/sqlite/SQLiteException
        //   200	207	255	android/database/sqlite/SQLiteException
        //   219	226	255	android/database/sqlite/SQLiteException
        //   234	236	255	android/database/sqlite/SQLiteException
        //   242	247	255	android/database/sqlite/SQLiteException
        //   24	30	264	java/lang/IllegalStateException
        //   36	45	264	java/lang/IllegalStateException
        //   63	77	264	java/lang/IllegalStateException
        //   95	107	264	java/lang/IllegalStateException
        //   125	134	264	java/lang/IllegalStateException
        //   140	148	264	java/lang/IllegalStateException
        //   154	166	264	java/lang/IllegalStateException
        //   172	179	264	java/lang/IllegalStateException
        //   200	207	264	java/lang/IllegalStateException
        //   219	226	264	java/lang/IllegalStateException
        //   234	236	264	java/lang/IllegalStateException
        //   242	247	264	java/lang/IllegalStateException
        //   310	322	363	finally
        //   322	354	363	finally
        //   357	360	363	finally
        //   365	368	363	finally
      }
    };
    mDatabase = paramRoomDatabase;
    mObservedTableTracker = new ObservedTableTracker(paramVarArgs.length);
    mTableIdLookup = new HashMap();
    mViewTables = paramMap1;
    mInvalidationLiveDataContainer = new InvalidationLiveDataContainer(paramRoomDatabase);
    int j = paramVarArgs.length;
    mTableNames = new String[j];
    while (i < j)
    {
      paramMap1 = paramVarArgs[i];
      paramRoomDatabase = Locale.US;
      paramMap1 = paramMap1.toLowerCase(paramRoomDatabase);
      mTableIdLookup.put(paramMap1, Integer.valueOf(i));
      String str = (String)paramMap.get(paramVarArgs[i]);
      if (str != null) {
        mTableNames[i] = str.toLowerCase(paramRoomDatabase);
      } else {
        mTableNames[i] = paramMap1;
      }
      i++;
    }
    paramRoomDatabase = paramMap.entrySet().iterator();
    while (paramRoomDatabase.hasNext())
    {
      paramMap1 = (Map.Entry)paramRoomDatabase.next();
      paramMap = (String)paramMap1.getValue();
      paramVarArgs = Locale.US;
      paramMap = paramMap.toLowerCase(paramVarArgs);
      if (mTableIdLookup.containsKey(paramMap))
      {
        paramVarArgs = ((String)paramMap1.getKey()).toLowerCase(paramVarArgs);
        paramMap1 = mTableIdLookup;
        paramMap1.put(paramVarArgs, paramMap1.get(paramMap));
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public InvalidationTracker(RoomDatabase paramRoomDatabase, String... paramVarArgs)
  {
    this(paramRoomDatabase, new HashMap(), Collections.emptyMap(), paramVarArgs);
  }
  
  private static void appendTriggerName(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    a.C(paramStringBuilder, "`", "room_table_modification_trigger_", paramString1, "_");
    paramStringBuilder.append(paramString2);
    paramStringBuilder.append("`");
  }
  
  private String[] resolveViews(String[] paramArrayOfString)
  {
    HashSet localHashSet = new HashSet();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str1 = paramArrayOfString[j];
      String str2 = str1.toLowerCase(Locale.US);
      if (mViewTables.containsKey(str2)) {
        localHashSet.addAll((Collection)mViewTables.get(str2));
      } else {
        localHashSet.add(str1);
      }
    }
    return (String[])localHashSet.toArray(new String[localHashSet.size()]);
  }
  
  private void startTrackingTable(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(", 0)");
    paramSupportSQLiteDatabase.execSQL(((StringBuilder)localObject).toString());
    localObject = mTableNames[paramInt];
    StringBuilder localStringBuilder = new StringBuilder();
    for (String str : TRIGGERS)
    {
      localStringBuilder.setLength(0);
      localStringBuilder.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
      appendTriggerName(localStringBuilder, (String)localObject, str);
      a.C(localStringBuilder, " AFTER ", str, " ON `", (String)localObject);
      a.C(localStringBuilder, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
      a.C(localStringBuilder, " = 1", " WHERE ", "table_id", " = ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" AND ");
      localStringBuilder.append("invalidated");
      localStringBuilder.append(" = 0");
      localStringBuilder.append("; END");
      paramSupportSQLiteDatabase.execSQL(localStringBuilder.toString());
    }
  }
  
  private void stopTrackingTable(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt)
  {
    String str1 = mTableNames[paramInt];
    StringBuilder localStringBuilder = new StringBuilder();
    for (String str2 : TRIGGERS)
    {
      localStringBuilder.setLength(0);
      localStringBuilder.append("DROP TRIGGER IF EXISTS ");
      appendTriggerName(localStringBuilder, str1, str2);
      paramSupportSQLiteDatabase.execSQL(localStringBuilder.toString());
    }
  }
  
  private String[] validateAndResolveTableNames(String[] paramArrayOfString)
  {
    String[] arrayOfString = resolveViews(paramArrayOfString);
    int i = arrayOfString.length;
    int j = 0;
    while (j < i)
    {
      paramArrayOfString = arrayOfString[j];
      if (mTableIdLookup.containsKey(paramArrayOfString.toLowerCase(Locale.US))) {
        j++;
      } else {
        throw new IllegalArgumentException(z2.o("There is no table with name ", paramArrayOfString));
      }
    }
    return arrayOfString;
  }
  
  @SuppressLint({"RestrictedApi"})
  @WorkerThread
  public void addObserver(@NonNull Observer paramObserver)
  {
    ??? = resolveViews(mTables);
    int[] arrayOfInt = new int[???.length];
    int i = ???.length;
    int j = 0;
    while (j < i)
    {
      localObject2 = (Integer)mTableIdLookup.get(???[j].toLowerCase(Locale.US));
      if (localObject2 != null)
      {
        arrayOfInt[j] = ((Integer)localObject2).intValue();
        j++;
      }
      else
      {
        paramObserver = z2.t("There is no table with name ");
        paramObserver.append(???[j]);
        throw new IllegalArgumentException(paramObserver.toString());
      }
    }
    Object localObject2 = new ObserverWrapper(paramObserver, arrayOfInt, (String[])???);
    synchronized (mObserverMap)
    {
      paramObserver = (ObserverWrapper)mObserverMap.putIfAbsent(paramObserver, localObject2);
      if ((paramObserver == null) && (mObservedTableTracker.onAdded(arrayOfInt))) {
        syncTriggers();
      }
      return;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void addWeakObserver(Observer paramObserver)
  {
    addObserver(new WeakObserver(this, paramObserver));
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public <T> LiveData<T> createLiveData(String[] paramArrayOfString, Callable<T> paramCallable)
  {
    return createLiveData(paramArrayOfString, false, paramCallable);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public <T> LiveData<T> createLiveData(String[] paramArrayOfString, boolean paramBoolean, Callable<T> paramCallable)
  {
    return mInvalidationLiveDataContainer.create(validateAndResolveTableNames(paramArrayOfString), paramBoolean, paramCallable);
  }
  
  public boolean ensureInitialization()
  {
    if (!mDatabase.isOpen()) {
      return false;
    }
    if (!mInitialized) {
      mDatabase.getOpenHelper().getWritableDatabase();
    }
    if (!mInitialized)
    {
      Log.e("ROOM", "database is not initialized even though it is open");
      return false;
    }
    return true;
  }
  
  public void internalInit(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    try
    {
      if (mInitialized)
      {
        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
        return;
      }
      paramSupportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
      paramSupportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
      paramSupportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
      syncTriggers(paramSupportSQLiteDatabase);
      mCleanupStatement = paramSupportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
      mInitialized = true;
      return;
    }
    finally {}
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  @VisibleForTesting(otherwise=3)
  public void notifyObserversByTableNames(String... paramVarArgs)
  {
    synchronized (mObserverMap)
    {
      Iterator localIterator = mObserverMap.iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (!((Observer)localEntry.getKey()).isRemote()) {
          ((ObserverWrapper)localEntry.getValue()).notifyByTableNames(paramVarArgs);
        }
      }
      return;
    }
  }
  
  public void refreshVersionsAsync()
  {
    if (mPendingRefresh.compareAndSet(false, true)) {
      mDatabase.getQueryExecutor().execute(mRefreshRunnable);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  @WorkerThread
  public void refreshVersionsSync()
  {
    syncTriggers();
    mRefreshRunnable.run();
  }
  
  @SuppressLint({"RestrictedApi"})
  @WorkerThread
  public void removeObserver(@NonNull Observer paramObserver)
  {
    synchronized (mObserverMap)
    {
      paramObserver = (ObserverWrapper)mObserverMap.remove(paramObserver);
      if ((paramObserver != null) && (mObservedTableTracker.onRemoved(mTableIds))) {
        syncTriggers();
      }
      return;
    }
  }
  
  public void startMultiInstanceInvalidation(Context paramContext, String paramString)
  {
    mMultiInstanceInvalidationClient = new MultiInstanceInvalidationClient(paramContext, paramString, this, mDatabase.getQueryExecutor());
  }
  
  public void stopMultiInstanceInvalidation()
  {
    MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = mMultiInstanceInvalidationClient;
    if (localMultiInstanceInvalidationClient != null)
    {
      localMultiInstanceInvalidationClient.stop();
      mMultiInstanceInvalidationClient = null;
    }
  }
  
  public void syncTriggers()
  {
    if (!mDatabase.isOpen()) {
      return;
    }
    syncTriggers(mDatabase.getOpenHelper().getWritableDatabase());
  }
  
  public void syncTriggers(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    if (paramSupportSQLiteDatabase.inTransaction()) {
      return;
    }
    try
    {
      for (;;)
      {
        Lock localLock = mDatabase.getCloseLock();
        localLock.lock();
        try
        {
          int[] arrayOfInt = mObservedTableTracker.getTablesToSync();
          if (arrayOfInt == null) {
            return;
          }
          int i = arrayOfInt.length;
          paramSupportSQLiteDatabase.beginTransaction();
          int j = 0;
          for (;;)
          {
            if (j < i)
            {
              int k = arrayOfInt[j];
              if ((k != 1) && (k != 2)) {}
            }
            try
            {
              stopTrackingTable(paramSupportSQLiteDatabase, j);
              break label101;
              startTrackingTable(paramSupportSQLiteDatabase, j);
              label101:
              j++;
            }
            finally {}
          }
          paramSupportSQLiteDatabase.setTransactionSuccessful();
          paramSupportSQLiteDatabase.endTransaction();
          mObservedTableTracker.onSyncCompleted();
          localLock.unlock();
        }
        finally
        {
          localLock.unlock();
        }
      }
      Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", paramSupportSQLiteDatabase);
    }
    catch (SQLiteException paramSupportSQLiteDatabase) {}catch (IllegalStateException paramSupportSQLiteDatabase) {}
  }
  
  public static class ObservedTableTracker
  {
    public static final int ADD = 1;
    public static final int NO_OP = 0;
    public static final int REMOVE = 2;
    public boolean mNeedsSync;
    public boolean mPendingSync;
    public final long[] mTableObservers;
    public final int[] mTriggerStateChanges;
    public final boolean[] mTriggerStates;
    
    public ObservedTableTracker(int paramInt)
    {
      long[] arrayOfLong = new long[paramInt];
      mTableObservers = arrayOfLong;
      boolean[] arrayOfBoolean = new boolean[paramInt];
      mTriggerStates = arrayOfBoolean;
      mTriggerStateChanges = new int[paramInt];
      Arrays.fill(arrayOfLong, 0L);
      Arrays.fill(arrayOfBoolean, false);
    }
    
    @Nullable
    public int[] getTablesToSync()
    {
      try
      {
        if ((mNeedsSync) && (!mPendingSync))
        {
          int i = mTableObservers.length;
          for (int j = 0;; j++)
          {
            int k = 1;
            if (j >= i) {
              break;
            }
            int m;
            if (mTableObservers[j] > 0L) {
              m = 1;
            } else {
              m = 0;
            }
            localObject1 = mTriggerStates;
            if (m != localObject1[j])
            {
              int[] arrayOfInt = mTriggerStateChanges;
              if (m == 0) {
                k = 2;
              }
              arrayOfInt[j] = k;
            }
            else
            {
              mTriggerStateChanges[j] = 0;
            }
            localObject1[j] = m;
          }
          mPendingSync = true;
          mNeedsSync = false;
          Object localObject1 = mTriggerStateChanges;
          return (int[])localObject1;
        }
        return null;
      }
      finally {}
    }
    
    public boolean onAdded(int... paramVarArgs)
    {
      try
      {
        int i = paramVarArgs.length;
        int j = 0;
        boolean bool = false;
        while (j < i)
        {
          int k = paramVarArgs[j];
          long[] arrayOfLong = mTableObservers;
          long l = arrayOfLong[k];
          arrayOfLong[k] = (1L + l);
          if (l == 0L)
          {
            mNeedsSync = true;
            bool = true;
          }
          j++;
        }
        return bool;
      }
      finally {}
    }
    
    public boolean onRemoved(int... paramVarArgs)
    {
      try
      {
        int i = paramVarArgs.length;
        int j = 0;
        boolean bool = false;
        while (j < i)
        {
          int k = paramVarArgs[j];
          long[] arrayOfLong = mTableObservers;
          long l = arrayOfLong[k];
          arrayOfLong[k] = (l - 1L);
          if (l == 1L)
          {
            mNeedsSync = true;
            bool = true;
          }
          j++;
        }
        return bool;
      }
      finally {}
    }
    
    public void onSyncCompleted()
    {
      try
      {
        mPendingSync = false;
        return;
      }
      finally {}
    }
  }
  
  public static abstract class Observer
  {
    public final String[] mTables;
    
    public Observer(@NonNull String paramString, String... paramVarArgs)
    {
      String[] arrayOfString = (String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length + 1);
      mTables = arrayOfString;
      arrayOfString[paramVarArgs.length] = paramString;
    }
    
    public Observer(@NonNull String[] paramArrayOfString)
    {
      mTables = ((String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
    }
    
    public boolean isRemote()
    {
      return false;
    }
    
    public abstract void onInvalidated(@NonNull Set<String> paramSet);
  }
  
  public static class ObserverWrapper
  {
    public final InvalidationTracker.Observer mObserver;
    private final Set<String> mSingleTableSet;
    public final int[] mTableIds;
    private final String[] mTableNames;
    
    public ObserverWrapper(InvalidationTracker.Observer paramObserver, int[] paramArrayOfInt, String[] paramArrayOfString)
    {
      mObserver = paramObserver;
      mTableIds = paramArrayOfInt;
      mTableNames = paramArrayOfString;
      if (paramArrayOfInt.length == 1)
      {
        paramObserver = new HashSet();
        paramObserver.add(paramArrayOfString[0]);
        mSingleTableSet = Collections.unmodifiableSet(paramObserver);
      }
      else
      {
        mSingleTableSet = null;
      }
    }
    
    public void notifyByTableInvalidStatus(Set<Integer> paramSet)
    {
      int i = mTableIds.length;
      Object localObject1 = null;
      int j = 0;
      while (j < i)
      {
        Object localObject2 = localObject1;
        if (paramSet.contains(Integer.valueOf(mTableIds[j]))) {
          if (i == 1)
          {
            localObject2 = mSingleTableSet;
          }
          else
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new HashSet(i);
            }
            ((Set)localObject2).add(mTableNames[j]);
          }
        }
        j++;
        localObject1 = localObject2;
      }
      if (localObject1 != null) {
        mObserver.onInvalidated((Set)localObject1);
      }
    }
    
    public void notifyByTableNames(String[] paramArrayOfString)
    {
      int i = mTableNames.length;
      Object localObject1 = null;
      int j;
      if (i == 1)
      {
        j = paramArrayOfString.length;
        for (i = 0;; i++)
        {
          localObject2 = localObject1;
          if (i >= j) {
            break;
          }
          if (paramArrayOfString[i].equalsIgnoreCase(mTableNames[0]))
          {
            localObject2 = mSingleTableSet;
            break;
          }
        }
      }
      HashSet localHashSet = new HashSet();
      int k = paramArrayOfString.length;
      for (i = 0; i < k; i++)
      {
        localObject2 = paramArrayOfString[i];
        for (String str : mTableNames) {
          if (str.equalsIgnoreCase((String)localObject2))
          {
            localHashSet.add(str);
            break;
          }
        }
      }
      Object localObject2 = localObject1;
      if (localHashSet.size() > 0) {
        localObject2 = localHashSet;
      }
      if (localObject2 != null) {
        mObserver.onInvalidated((Set)localObject2);
      }
    }
  }
  
  public static class WeakObserver
    extends InvalidationTracker.Observer
  {
    public final WeakReference<InvalidationTracker.Observer> mDelegateRef;
    public final InvalidationTracker mTracker;
    
    public WeakObserver(InvalidationTracker paramInvalidationTracker, InvalidationTracker.Observer paramObserver)
    {
      super();
      mTracker = paramInvalidationTracker;
      mDelegateRef = new WeakReference(paramObserver);
    }
    
    public void onInvalidated(@NonNull Set<String> paramSet)
    {
      InvalidationTracker.Observer localObserver = (InvalidationTracker.Observer)mDelegateRef.get();
      if (localObserver == null) {
        mTracker.removeObserver(this);
      } else {
        localObserver.onInvalidated(paramSet);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */