package n2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import android.util.Base64;
import f2.i;
import f2.i.a;
import i2.a.a;
import i2.c.b;
import i2.d.a;
import i2.e.a;
import i2.f;
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

public class M
  implements d, o2.b, c
{
  public static final c2.b t = c2.b.b("proto");
  public final U o;
  public final p2.a p;
  public final p2.a q;
  public final e r;
  public final U5.a s;
  
  public M(p2.a parama1, p2.a parama2, e parame, U paramU, U5.a parama)
  {
    o = paramU;
    p = parama1;
    q = parama2;
    r = parame;
    s = parama;
  }
  
  public static byte[] A0(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Base64.decode(paramString, 0);
  }
  
  public static c2.b E0(String paramString)
  {
    if (paramString == null) {
      return t;
    }
    return c2.b.b(paramString);
  }
  
  public static String F0(Iterable paramIterable)
  {
    StringBuilder localStringBuilder = new StringBuilder("(");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localStringBuilder.append(((k)paramIterable.next()).c());
      if (paramIterable.hasNext()) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static Object G0(Cursor paramCursor, b paramb)
  {
    try
    {
      paramb = paramb.apply(paramCursor);
      return paramb;
    }
    finally
    {
      paramCursor.close();
    }
  }
  
  public Iterable A(f2.p paramp)
  {
    return (Iterable)W(new L(this, paramp));
  }
  
  public final void B0(a.a parama, Map paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      parama.a(i2.d.c().c((String)localEntry.getKey()).b((List)localEntry.getValue()).a());
    }
  }
  
  public final byte[] C0(long paramLong)
  {
    return (byte[])G0(Q().query("event_payloads", new String[] { "bytes" }, "event_id = ?", new String[] { String.valueOf(paramLong) }, null, null, "sequence_num"), new B());
  }
  
  public final Object D0(d paramd, b paramb)
  {
    long l = q.a();
    for (;;)
    {
      try
      {
        Object localObject = paramd.a();
        return localObject;
      }
      catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
      {
        if (q.a() >= r.b() + l) {
          return paramb.apply(localSQLiteDatabaseLockedException);
        }
        SystemClock.sleep(50L);
      }
    }
  }
  
  public final c.b M(int paramInt)
  {
    c.b localb1 = c.b.p;
    if (paramInt == localb1.g()) {
      return localb1;
    }
    c.b localb2 = c.b.q;
    if (paramInt == localb2.g()) {
      return localb2;
    }
    localb2 = c.b.r;
    if (paramInt == localb2.g()) {
      return localb2;
    }
    localb2 = c.b.s;
    if (paramInt == localb2.g()) {
      return localb2;
    }
    localb2 = c.b.t;
    if (paramInt == localb2.g()) {
      return localb2;
    }
    localb2 = c.b.u;
    if (paramInt == localb2.g()) {
      return localb2;
    }
    localb2 = c.b.v;
    if (paramInt == localb2.g()) {
      return localb2;
    }
    j2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(paramInt));
    return localb1;
  }
  
  public final void N(SQLiteDatabase paramSQLiteDatabase)
  {
    D0(new l(paramSQLiteDatabase), new w());
  }
  
  public final long O(SQLiteDatabase paramSQLiteDatabase, f2.p paramp)
  {
    Object localObject = V(paramSQLiteDatabase, paramp);
    if (localObject != null) {
      return ((Long)localObject).longValue();
    }
    localObject = new ContentValues();
    ((ContentValues)localObject).put("backend_name", paramp.b());
    ((ContentValues)localObject).put("priority", Integer.valueOf(q2.a.a(paramp.d())));
    ((ContentValues)localObject).put("next_request_ms", Integer.valueOf(0));
    if (paramp.c() != null) {
      ((ContentValues)localObject).put("extras", Base64.encodeToString(paramp.c(), 0));
    }
    return paramSQLiteDatabase.insert("transport_contexts", null, (ContentValues)localObject);
  }
  
  public long P()
  {
    return S() * T();
  }
  
  public SQLiteDatabase Q()
  {
    U localU = o;
    Objects.requireNonNull(localU);
    return (SQLiteDatabase)D0(new E(localU), new F());
  }
  
  public final i2.b R()
  {
    return i2.b.b().b(i2.e.c().b(P()).c(e.a.f()).a()).a();
  }
  
  public final long S()
  {
    return Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
  }
  
  public final long T()
  {
    return Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
  }
  
  public final f U()
  {
    return (f)W(new C(p.a()));
  }
  
  public final Long V(SQLiteDatabase paramSQLiteDatabase, f2.p paramp)
  {
    StringBuilder localStringBuilder = new StringBuilder("backend_name = ? and priority = ?");
    Object localObject = new ArrayList(Arrays.asList(new String[] { paramp.b(), String.valueOf(q2.a.a(paramp.d())) }));
    if (paramp.c() != null)
    {
      localStringBuilder.append(" and extras = ?");
      ((ArrayList)localObject).add(Base64.encodeToString(paramp.c(), 0));
    }
    else
    {
      localStringBuilder.append(" and extras is null");
    }
    paramp = localStringBuilder.toString();
    localObject = (String[])((ArrayList)localObject).toArray(new String[0]);
    return (Long)G0(paramSQLiteDatabase.query("transport_contexts", new String[] { "_id" }, paramp, (String[])localObject, null, null, null), new x());
  }
  
  public Object W(b paramb)
  {
    SQLiteDatabase localSQLiteDatabase = Q();
    localSQLiteDatabase.beginTransaction();
    try
    {
      paramb = paramb.apply(localSQLiteDatabase);
      localSQLiteDatabase.setTransactionSuccessful();
      return paramb;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final boolean X()
  {
    boolean bool;
    if (S() * T() >= r.f()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final List Y(List paramList, Map paramMap)
  {
    ListIterator localListIterator = paramList.listIterator();
    while (localListIterator.hasNext())
    {
      k localk = (k)localListIterator.next();
      if (paramMap.containsKey(Long.valueOf(localk.c())))
      {
        i.a locala = localk.b().l();
        Iterator localIterator = ((Set)paramMap.get(Long.valueOf(localk.c()))).iterator();
        while (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          locala.c(a, b);
        }
        localListIterator.set(k.a(localk.c(), localk.d(), locala.d()));
      }
    }
    return paramList;
  }
  
  public Object a(o2.b.a parama)
  {
    SQLiteDatabase localSQLiteDatabase = Q();
    N(localSQLiteDatabase);
    try
    {
      parama = parama.e();
      localSQLiteDatabase.setTransactionSuccessful();
      return parama;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public i2.a b()
  {
    a.a locala = i2.a.e();
    return (i2.a)W(new s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), locala));
  }
  
  public void c(long paramLong, c.b paramb, String paramString)
  {
    W(new q(paramString, paramb, paramLong));
  }
  
  public void close()
  {
    o.close();
  }
  
  public void d(f2.p paramp, long paramLong)
  {
    W(new o(paramLong, paramp));
  }
  
  public void e()
  {
    W(new p(this));
  }
  
  public int f()
  {
    return ((Integer)W(new I(this, p.a() - r.c()))).intValue();
  }
  
  public void g(Iterable paramIterable)
  {
    if (!paramIterable.iterator().hasNext()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DELETE FROM events WHERE _id in ");
    localStringBuilder.append(F0(paramIterable));
    paramIterable = localStringBuilder.toString();
    Q().compileStatement(paramIterable).execute();
  }
  
  public boolean j(f2.p paramp)
  {
    return ((Boolean)W(new n(this, paramp))).booleanValue();
  }
  
  public Iterable o()
  {
    return (Iterable)W(new G());
  }
  
  public long p(f2.p paramp)
  {
    return ((Long)G0(Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { paramp.b(), String.valueOf(q2.a.a(paramp.d())) }), new H())).longValue();
  }
  
  public void y(Iterable paramIterable)
  {
    if (!paramIterable.iterator().hasNext()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
    localStringBuilder.append(F0(paramIterable));
    W(new K(this, localStringBuilder.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
  }
  
  public final List y0(SQLiteDatabase paramSQLiteDatabase, f2.p paramp, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = V(paramSQLiteDatabase, paramp);
    if (localObject == null) {
      return localArrayList;
    }
    localObject = ((Long)localObject).toString();
    G0(paramSQLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { localObject }, null, null, null, String.valueOf(paramInt)), new v(this, localArrayList, paramp));
    return localArrayList;
  }
  
  public k z(f2.p paramp, i parami)
  {
    j2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[] { paramp.d(), parami.j(), paramp.b() });
    long l = ((Long)W(new m(this, parami, paramp))).longValue();
    if (l < 1L) {
      return null;
    }
    return k.a(l, paramp, parami);
  }
  
  public final Map z0(SQLiteDatabase paramSQLiteDatabase, List paramList)
  {
    HashMap localHashMap = new HashMap();
    StringBuilder localStringBuilder = new StringBuilder("event_id IN (");
    for (int i = 0; i < paramList.size(); i++)
    {
      localStringBuilder.append(((k)paramList.get(i)).c());
      if (i < paramList.size() - 1) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append(')');
    paramList = localStringBuilder.toString();
    G0(paramSQLiteDatabase.query("event_metadata", new String[] { "event_id", "name", "value" }, paramList, null, null, null, null), new z(localHashMap));
    return localHashMap;
  }
  
  public static abstract interface b
  {
    public abstract Object apply(Object paramObject);
  }
  
  public static class c
  {
    public final String a;
    public final String b;
    
    public c(String paramString1, String paramString2)
    {
      a = paramString1;
      b = paramString2;
    }
  }
  
  public static abstract interface d
  {
    public abstract Object a();
  }
}

/* Location:
 * Qualified Name:     n2.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */