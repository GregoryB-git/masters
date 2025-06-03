package R2;

import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.y1;

public final class c
  extends d
{
  public A1 g;
  
  public c(b6 paramb6, String paramString, int paramInt, A1 paramA1)
  {
    super(paramString, paramInt);
    g = paramA1;
  }
  
  public final int a()
  {
    return g.k();
  }
  
  public final boolean i()
  {
    return false;
  }
  
  public final boolean j()
  {
    return true;
  }
  
  public final boolean k(Long paramLong1, Long paramLong2, h2 paramh2, boolean paramBoolean)
  {
    int i;
    if ((A6.a()) && (h.f().D(a, K.h0))) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool1 = g.M();
    boolean bool2 = g.N();
    boolean bool3 = g.O();
    int j;
    if ((!bool1) && (!bool2) && (!bool3)) {
      j = 0;
    } else {
      j = 1;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    if ((paramBoolean) && (j == 0))
    {
      paramLong2 = h.j().K();
      i = b;
      paramLong1 = (Long)localObject2;
      if (g.P()) {
        paramLong1 = Integer.valueOf(g.k());
      }
      paramLong2.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i), paramLong1);
      return true;
    }
    localObject2 = g.I();
    bool1 = ((y1)localObject2).N();
    Object localObject3;
    if (paramh2.d0()) {
      if (!((y1)localObject2).P())
      {
        localObject2 = h.j().L();
        localObject3 = h.h().g(paramh2.Z());
        localObject4 = "No number filter for long property. property";
      }
    }
    for (;;)
    {
      ((a2)localObject2).b((String)localObject4, localObject3);
      localObject2 = localObject1;
      break;
      localObject2 = d.c(paramh2.U(), ((y1)localObject2).K());
      for (;;)
      {
        localObject2 = d.d((Boolean)localObject2, bool1);
        break label516;
        if (paramh2.b0())
        {
          if (!((y1)localObject2).P())
          {
            localObject2 = h.j().L();
            localObject3 = h.h().g(paramh2.Z());
            localObject4 = "No number filter for double property. property";
            break;
          }
          localObject2 = d.b(paramh2.G(), ((y1)localObject2).K());
          continue;
        }
        if (!paramh2.f0()) {
          break label481;
        }
        if (!((y1)localObject2).R())
        {
          if (!((y1)localObject2).P())
          {
            localObject2 = h.j().L();
            localObject3 = h.h().g(paramh2.Z());
            localObject4 = "No string or number filter defined. property";
            break;
          }
          if (N5.f0(paramh2.a0()))
          {
            localObject2 = d.e(paramh2.a0(), ((y1)localObject2).K());
            continue;
          }
          h.j().L().c("Invalid user property value for Numeric number filter. property, value", h.h().g(paramh2.Z()), paramh2.a0());
          localObject2 = localObject1;
          break label516;
        }
        localObject2 = d.g(paramh2.a0(), ((y1)localObject2).L(), h.j());
      }
      label481:
      localObject2 = h.j().L();
      localObject3 = h.h().g(paramh2.Z());
      localObject4 = "User property has no value, property";
    }
    label516:
    Object localObject4 = h.j().K();
    if (localObject2 == null) {
      localObject3 = "null";
    } else {
      localObject3 = localObject2;
    }
    ((a2)localObject4).b("Property filter result", localObject3);
    if (localObject2 == null) {
      return false;
    }
    c = Boolean.TRUE;
    if ((bool3) && (!((Boolean)localObject2).booleanValue())) {
      return true;
    }
    if ((!paramBoolean) || (g.M())) {
      d = ((Boolean)localObject2);
    }
    if ((((Boolean)localObject2).booleanValue()) && (j != 0) && (paramh2.e0()))
    {
      long l1 = paramh2.W();
      if (paramLong1 != null) {
        l1 = paramLong1.longValue();
      }
      long l2 = l1;
      if (i != 0)
      {
        l2 = l1;
        if (g.M())
        {
          l2 = l1;
          if (!g.N())
          {
            l2 = l1;
            if (paramLong2 != null) {
              l2 = paramLong2.longValue();
            }
          }
        }
      }
      if (g.N()) {
        f = Long.valueOf(l2);
      } else {
        e = Long.valueOf(l2);
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     R2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */