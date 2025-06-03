package i9;

import f9.j;
import j9.q;
import ja.a.b;
import ka.a0.c;
import ka.z;
import m9.e0;
import ma.w.a;
import q0.g;
import u7.m;

public final class i0
  implements a
{
  public final y0 a;
  public final i b;
  
  public i0(y0 paramy0, i parami)
  {
    a = paramy0;
    b = parami;
  }
  
  public final f9.e a(String paramString)
  {
    y0.d locald = a.H("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?");
    locald.a(new Object[] { paramString });
    return (f9.e)locald.c(new e(paramString, 3));
  }
  
  public final void b(f9.e parame)
  {
    a.G("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", new Object[] { a, Integer.valueOf(b), Long.valueOf(c.a.a), Integer.valueOf(c.a.b), Integer.valueOf(d), Long.valueOf(e) });
  }
  
  public final void c(j paramj)
  {
    Object localObject1 = b;
    Object localObject2 = b;
    a0.c localc = a.l(a);
    localObject1 = ja.a.M();
    if (g.b(b, 1)) {
      localObject2 = a.b.b;
    } else {
      localObject2 = a.b.c;
    }
    ((w.a)localObject1).m();
    ja.a.I((ja.a)b, (a.b)localObject2);
    localObject2 = localc.J();
    ((w.a)localObject1).m();
    ja.a.G((ja.a)b, (String)localObject2);
    localObject2 = localc.K();
    ((w.a)localObject1).m();
    ja.a.H((ja.a)b, (z)localObject2);
    localObject2 = (ja.a)((w.a)localObject1).k();
    a.G("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", new Object[] { a, Long.valueOf(c.a.a), Integer.valueOf(c.a.b), ((ma.a)localObject2).j() });
  }
  
  public final j d(String paramString)
  {
    y0.d locald = a.H("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?");
    locald.a(new Object[] { paramString });
    return (j)locald.c(new h0(this, paramString));
  }
}

/* Location:
 * Qualified Name:     i9.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */