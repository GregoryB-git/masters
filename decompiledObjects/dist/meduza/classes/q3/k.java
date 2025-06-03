package q3;

import android.content.Context;
import b9.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.h.a;
import k3.p;
import k3.s;
import o9.l;

public final class k
{
  public final Context a;
  public final l3.e b;
  public final r3.d c;
  public final n d;
  public final Executor e;
  public final s3.b f;
  public final t3.a g;
  public final t3.a h;
  public final r3.c i;
  
  public k(Context paramContext, l3.e parame, r3.d paramd, n paramn, Executor paramExecutor, s3.b paramb, t3.a parama1, t3.a parama2, r3.c paramc)
  {
    a = paramContext;
    b = parame;
    c = paramd;
    d = paramn;
    e = paramExecutor;
    f = paramb;
    g = parama1;
    h = parama2;
    i = paramc;
  }
  
  public final void a(s params, int paramInt)
  {
    l3.m localm = b.a(params.b());
    new l3.b(1, 0L);
    long l1 = 0L;
    for (;;)
    {
      Object localObject1 = f;
      int j = 0;
      Object localObject2;
      Object localObject3;
      int k;
      Object localObject4;
      n3.a locala;
      h.a locala1;
      g localg;
      if (((Boolean)((s3.b)localObject1).f(new h(0, this, params))).booleanValue())
      {
        localObject2 = (Iterable)f.f(new k1.a(1, this, params));
        if (!((Iterable)localObject2).iterator().hasNext()) {
          return;
        }
        if (localm == null)
        {
          o3.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", params);
          localObject1 = new l3.b(3, -1L);
        }
        else
        {
          localObject1 = new ArrayList();
          localObject3 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject3).hasNext()) {
            ((ArrayList)localObject1).add(((r3.i)((Iterator)localObject3).next()).a());
          }
          if (params.c() != null) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0)
          {
            localObject3 = f;
            localObject4 = i;
            Objects.requireNonNull(localObject4);
            locala = (n3.a)((s3.b)localObject3).f(new d(localObject4, 2));
            locala1 = new h.a();
            f = new HashMap();
            d = Long.valueOf(g.a());
            e = Long.valueOf(h.a());
            locala1.d("GDT_CLIENT_METRICS");
            localObject4 = new h3.c("proto");
            locala.getClass();
            localg = p.a;
            localg.getClass();
            localObject3 = new ByteArrayOutputStream();
          }
        }
      }
      try
      {
        localg.a(locala, (ByteArrayOutputStream)localObject3);
        locala1.c(new k3.m((h3.c)localObject4, ((ByteArrayOutputStream)localObject3).toByteArray()));
        ((ArrayList)localObject1).add(localm.a(locala1.b()));
        localObject1 = localm.b(new l3.a((Iterable)localObject1, params.c()));
        if (a == 2)
        {
          f.f(new i(this, (Iterable)localObject2, params, l1));
          d.a(params, paramInt + 1, true);
          return;
        }
        f.f(new l(0, this, localObject2));
        k = a;
        if (k == 1)
        {
          long l2 = Math.max(l1, b);
          k = j;
          if (params.c() != null) {
            k = 1;
          }
          l1 = l2;
          if (k == 0) {
            continue;
          }
          f.f(new e(this, 3));
          l1 = l2;
          continue;
        }
        if (k != 4) {
          continue;
        }
        localObject3 = new HashMap();
        localObject4 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject2 = ((r3.i)((Iterator)localObject4).next()).a().k();
          if (!((HashMap)localObject3).containsKey(localObject2)) {
            localObject1 = Integer.valueOf(1);
          } else {
            localObject1 = Integer.valueOf(((Integer)((HashMap)localObject3).get(localObject2)).intValue() + 1);
          }
          ((HashMap)localObject3).put(localObject2, localObject1);
        }
        f.f(new k1.a(2, this, localObject3));
        continue;
        f.f(new j(this, params, l1));
        return;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     q3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */