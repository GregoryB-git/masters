package r3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import f;
import io.flutter.plugins.firebase.auth.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k3.s;
import n3.a.a;
import n3.c.a;
import s3.b.a;

public final class t
  implements d, s3.b, c
{
  public static final h3.c f = new h3.c("proto");
  public final z a;
  public final t3.a b;
  public final t3.a c;
  public final e d;
  public final qb.a<String> e;
  
  public t(t3.a parama1, t3.a parama2, e parame, z paramz, qb.a<String> parama)
  {
    a = paramz;
    b = parama1;
    c = parama2;
    d = parame;
    e = parama;
  }
  
  public static Long Q(SQLiteDatabase paramSQLiteDatabase, s params)
  {
    StringBuilder localStringBuilder = new StringBuilder("backend_name = ? and priority = ?");
    Object localObject = new ArrayList(Arrays.asList(new String[] { params.b(), String.valueOf(u3.a.a(params.d())) }));
    if (params.c() != null)
    {
      localStringBuilder.append(" and extras = ?");
      ((ArrayList)localObject).add(Base64.encodeToString(params.c(), 0));
    }
    else
    {
      localStringBuilder.append(" and extras is null");
    }
    params = localStringBuilder.toString();
    localObject = (String[])((ArrayList)localObject).toArray(new String[0]);
    return (Long)k0(paramSQLiteDatabase.query("transport_contexts", new String[] { "_id" }, params, (String[])localObject, null, null, null), new j(2));
  }
  
  public static h3.c h0(String paramString)
  {
    if (paramString == null) {
      return f;
    }
    return new h3.c(paramString);
  }
  
  public static String i0(Iterable<i> paramIterable)
  {
    StringBuilder localStringBuilder = new StringBuilder("(");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localStringBuilder.append(((i)paramIterable.next()).b());
      if (paramIterable.hasNext()) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static <T> T k0(Cursor paramCursor, a<Cursor, T> parama)
  {
    try
    {
      parama = parama.apply(paramCursor);
      return parama;
    }
    finally
    {
      paramCursor.close();
    }
  }
  
  public final boolean B(s params)
  {
    return ((Boolean)b0(new l(0, this, params))).booleanValue();
  }
  
  public final void C(long paramLong, c.a parama, String paramString)
  {
    b0(new m(paramLong, parama, paramString));
  }
  
  public final n3.a H()
  {
    int i = n3.a.e;
    a.a locala = new a.a();
    HashMap localHashMap = new HashMap();
    SQLiteDatabase localSQLiteDatabase = I();
    localSQLiteDatabase.beginTransaction();
    try
    {
      Object localObject1 = localSQLiteDatabase.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]);
      r localr = new r3/r;
      localr.<init>(this, localHashMap, locala, 1);
      localObject1 = (n3.a)k0((Cursor)localObject1, localr);
      localSQLiteDatabase.setTransactionSuccessful();
      return (n3.a)localObject1;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final SQLiteDatabase I()
  {
    z localz = a;
    Objects.requireNonNull(localz);
    j localj = new j(0);
    long l = c.a();
    for (;;)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = localz.getWritableDatabase();
      }
      catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
      {
        if (c.a() < d.a() + l) {
          break label79;
        }
      }
      Object localObject = localj.apply(localSQLiteDatabaseLockedException);
      return (SQLiteDatabase)localObject;
      label79:
      SystemClock.sleep(50L);
    }
  }
  
  public final long M()
  {
    return I().compileStatement("PRAGMA page_count").simpleQueryForLong();
  }
  
  public final long N(s params)
  {
    return ((Long)k0(I().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { params.b(), String.valueOf(u3.a.a(params.d())) }), new e0.d(2))).longValue();
  }
  
  public final void P(long paramLong, s params)
  {
    b0(new n(paramLong, params));
  }
  
  public final int a()
  {
    return ((Integer)b0(new k(this, b.a() - d.b()))).intValue();
  }
  
  public final <T> T b0(a<SQLiteDatabase, T> parama)
  {
    SQLiteDatabase localSQLiteDatabase = I();
    localSQLiteDatabase.beginTransaction();
    try
    {
      parama = parama.apply(localSQLiteDatabase);
      localSQLiteDatabase.setTransactionSuccessful();
      return parama;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final ArrayList c0(SQLiteDatabase paramSQLiteDatabase, s params, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = Q(paramSQLiteDatabase, params);
    if (localObject == null) {
      return localArrayList;
    }
    localObject = ((Long)localObject).toString();
    k0(paramSQLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob" }, "context_id = ?", new String[] { localObject }, null, null, null, String.valueOf(paramInt)), new r(this, localArrayList, params, 0));
    return localArrayList;
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final <T> T f(b.a<T> parama)
  {
    SQLiteDatabase localSQLiteDatabase = I();
    long l = c.a();
    try
    {
      localSQLiteDatabase.beginTransaction();
      try
      {
        parama = parama.a();
        localSQLiteDatabase.setTransactionSuccessful();
        return parama;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
    {
      while (c.a() < d.a() + l) {
        SystemClock.sleep(50L);
      }
      throw new s3.a("Timed out while trying to acquire the lock.", localSQLiteDatabaseLockedException);
    }
  }
  
  public final void g()
  {
    b0(new g(this, 3));
  }
  
  public final void i(Iterable<i> paramIterable)
  {
    if (!paramIterable.iterator().hasNext()) {
      return;
    }
    StringBuilder localStringBuilder = f.l("DELETE FROM events WHERE _id in ");
    localStringBuilder.append(i0(paramIterable));
    paramIterable = localStringBuilder.toString();
    I().compileStatement(paramIterable).execute();
  }
  
  public final b j(s params, k3.n paramn)
  {
    h3.e locale = params.d();
    String str1 = paramn.k();
    String str2 = params.b();
    String str3 = o3.a.c("SQLiteEventStore");
    if (Log.isLoggable(str3, 3)) {
      Log.d(str3, String.format("Storing event with priority=%s, name=%s for destination %s", new Object[] { locale, str1, str2 }));
    }
    long l = ((Long)b0(new p3.b(this, paramn, params))).longValue();
    if (l < 1L) {
      return null;
    }
    return new b(l, params, paramn);
  }
  
  public final void s0(Iterable<i> paramIterable)
  {
    if (!paramIterable.iterator().hasNext()) {
      return;
    }
    StringBuilder localStringBuilder = f.l("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
    localStringBuilder.append(i0(paramIterable));
    b0(new o(this, localStringBuilder.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
  }
  
  public final List x()
  {
    SQLiteDatabase localSQLiteDatabase = I();
    localSQLiteDatabase.beginTransaction();
    try
    {
      Cursor localCursor = localSQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
      Object localObject1 = new e0/d;
      ((e0.d)localObject1).<init>(3);
      localObject1 = (List)k0(localCursor, (a)localObject1);
      localSQLiteDatabase.setTransactionSuccessful();
      return (List)localObject1;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final Iterable<i> z(s params)
  {
    return (Iterable)b0(new o9.l(1, this, params));
  }
  
  public static abstract interface a<T, U>
  {
    public abstract U apply(T paramT);
  }
  
  public static final class b
  {
    public final String a;
    public final String b;
    
    public b(String paramString1, String paramString2)
    {
      a = paramString1;
      b = paramString2;
    }
  }
}

/* Location:
 * Qualified Name:     r3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */