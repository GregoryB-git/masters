package pa;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import ec.i;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import t5.k.a;
import t5.r;
import t5.r.a;
import t5.s.a;
import t5.v;
import u5.n;
import v5.e0;

public final class h
  implements k.a
{
  public final Context a;
  public final long b;
  public final long c;
  public r.a d;
  
  public h(Context paramContext, long paramLong1, long paramLong2, s.a parama)
  {
    a = paramContext;
    b = paramLong1;
    c = paramLong2;
    Context localContext = paramContext.getApplicationContext();
    int i = e0.a;
    Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
    if (localObject != null)
    {
      localObject = ((TelephonyManager)localObject).getNetworkCountryIso();
      if (!TextUtils.isEmpty((CharSequence)localObject)) {}
    }
    else
    {
      localObject = Locale.getDefault().getCountry();
    }
    localObject = t5.q.j(x6.b.y0((String)localObject));
    HashMap localHashMap = new HashMap(8);
    localHashMap.put(Integer.valueOf(0), Long.valueOf(1000000L));
    o7.l0 locall0 = t5.q.n;
    localHashMap.put(Integer.valueOf(2), (Long)locall0.get(localObject[0]));
    localHashMap.put(Integer.valueOf(3), (Long)t5.q.o.get(localObject[1]));
    localHashMap.put(Integer.valueOf(4), (Long)t5.q.p.get(localObject[2]));
    localHashMap.put(Integer.valueOf(5), (Long)t5.q.q.get(localObject[3]));
    localHashMap.put(Integer.valueOf(10), (Long)t5.q.r.get(localObject[4]));
    localHashMap.put(Integer.valueOf(9), (Long)t5.q.s.get(localObject[5]));
    localHashMap.put(Integer.valueOf(7), (Long)locall0.get(localObject[0]));
    localObject = new t5.q(localContext, localHashMap, 2000, v5.c.a, true);
    paramContext = new r.a(paramContext, parama);
    d = paramContext;
    c = ((t5.l0)localObject);
  }
  
  public final u5.c b()
  {
    Object localObject1 = f.a;
    Object localObject2 = a;
    long l = b;
    localObject1.getClass();
    i.e(localObject2, "context");
    if (f.b == null) {
      try
      {
        if (f.b == null)
        {
          u5.q localq = new u5/q;
          File localFile = new java/io/File;
          localFile.<init>(((Context)localObject2).getCacheDir(), "betterPlayerCache");
          localObject1 = new u5/n;
          ((n)localObject1).<init>(l);
          y3.c localc = new y3/c;
          localc.<init>((Context)localObject2);
          localq.<init>(localFile, (n)localObject1, localc);
          f.b = localq;
        }
        localObject2 = rb.h.a;
      }
      finally {}
    }
    localObject1 = f.b;
    if (localObject1 != null)
    {
      Object localObject4 = d;
      if (localObject4 != null) {
        localObject4 = ((r.a)localObject4).b();
      } else {
        localObject4 = null;
      }
      return new u5.c((u5.q)localObject1, (r)localObject4, new v(), new u5.b((u5.q)localObject1, c));
    }
    throw new IllegalStateException("Cache can't be null.");
  }
}

/* Location:
 * Qualified Name:     pa.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */