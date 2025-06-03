package z2;

import A2.c;
import A2.l;
import A2.o;
import A2.p;
import V2.j;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

public final class G
  implements V2.e
{
  public final e a;
  public final int b;
  public final b c;
  public final long d;
  public final long e;
  
  public G(e parame, int paramInt, b paramb, long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    a = parame;
    b = paramInt;
    c = paramb;
    d = paramLong1;
    e = paramLong2;
  }
  
  public static G b(e parame, int paramInt, b paramb)
  {
    if (!parame.f()) {
      return null;
    }
    Object localObject1 = o.b().a();
    boolean bool2;
    if (localObject1 != null)
    {
      if (!((p)localObject1).f()) {
        return null;
      }
      boolean bool1 = ((p)localObject1).g();
      localObject1 = parame.w(paramb);
      bool2 = bool1;
      if (localObject1 != null)
      {
        if (!(((x)localObject1).t() instanceof c)) {
          return null;
        }
        Object localObject2 = (c)((x)localObject1).t();
        bool2 = bool1;
        if (((c)localObject2).J())
        {
          bool2 = bool1;
          if (!((c)localObject2).i())
          {
            localObject2 = c((x)localObject1, (c)localObject2, paramInt);
            if (localObject2 == null) {
              return null;
            }
            ((x)localObject1).F();
            bool2 = ((A2.e)localObject2).i();
          }
        }
      }
    }
    else
    {
      bool2 = true;
    }
    long l1;
    if (bool2) {
      l1 = System.currentTimeMillis();
    } else {
      l1 = 0L;
    }
    long l2;
    if (bool2) {
      l2 = SystemClock.elapsedRealtime();
    } else {
      l2 = 0L;
    }
    return new G(parame, paramInt, paramb, l1, l2, null, null);
  }
  
  public static A2.e c(x paramx, c paramc, int paramInt)
  {
    paramc = paramc.H();
    if ((paramc != null) && (paramc.g()))
    {
      int[] arrayOfInt = paramc.d();
      if (arrayOfInt == null)
      {
        arrayOfInt = paramc.f();
        if ((arrayOfInt != null) && (E2.b.a(arrayOfInt, paramInt))) {
          break label72;
        }
      }
      else
      {
        if (!E2.b.a(arrayOfInt, paramInt)) {
          break label72;
        }
      }
      if (paramx.r() < paramc.a()) {
        return paramc;
      }
    }
    label72:
    return null;
  }
  
  public final void a(j paramj)
  {
    if (!a.f()) {
      return;
    }
    Object localObject = o.b().a();
    if ((localObject != null) && (!((p)localObject).f())) {
      return;
    }
    x localx = a.w(c);
    if ((localx != null) && ((localx.t() instanceof c)))
    {
      c localc = (c)localx.t();
      long l1 = d;
      int i = 1;
      int j = 0;
      int k;
      if (l1 > 0L) {
        k = 1;
      } else {
        k = 0;
      }
      int m = localc.z();
      int i1;
      int i2;
      int i3;
      int i4;
      if (localObject != null)
      {
        int n = k & ((p)localObject).g();
        i1 = ((p)localObject).a();
        i2 = ((p)localObject).d();
        i3 = ((p)localObject).i();
        k = n;
        i4 = i2;
        if (localc.J())
        {
          k = n;
          i4 = i2;
          if (!localc.i())
          {
            localObject = c(localx, localc, b);
            if (localObject == null) {
              return;
            }
            if ((((A2.e)localObject).i()) && (d > 0L)) {
              k = i;
            } else {
              k = 0;
            }
            i4 = ((A2.e)localObject).a();
          }
        }
        i = i4;
        i2 = k;
      }
      else
      {
        i3 = 0;
        i = 100;
        i1 = 5000;
        i2 = k;
      }
      localObject = a;
      if (paramj.n())
      {
        i4 = 0;
        k = j;
      }
      else
      {
        if (paramj.l()) {}
        for (k = 100;; k = 101)
        {
          i4 = -1;
          break;
          paramj = paramj.i();
          if ((paramj instanceof y2.b))
          {
            paramj = ((y2.b)paramj).a();
            j = paramj.d();
            paramj = paramj.a();
            if (paramj == null) {
              k = -1;
            } else {
              k = paramj.a();
            }
            i4 = k;
            k = j;
            break;
          }
        }
      }
      long l2;
      if (i2 != 0)
      {
        l1 = d;
        l2 = System.currentTimeMillis();
        i2 = (int)(SystemClock.elapsedRealtime() - e);
      }
      else
      {
        l1 = 0L;
        l2 = l1;
        i2 = -1;
      }
      ((e)localObject).E(new l(b, k, i4, l1, l2, null, null, m, i2), i3, i1, i);
    }
  }
}

/* Location:
 * Qualified Name:     z2.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */