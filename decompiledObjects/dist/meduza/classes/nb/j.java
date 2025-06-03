package nb;

import eb.e1;
import eb.k0;
import eb.k0.e;
import eb.l0;
import eb.m0;
import eb.u0.b;
import f;
import gb.g3;
import gb.g3.b;
import gb.n1;
import java.util.List;
import java.util.Map;
import x6.b;

public final class j
  extends l0
{
  public static u0.b f(Map paramMap)
  {
    Object localObject1 = n1.i("interval", paramMap);
    Object localObject2 = n1.i("baseEjectionTime", paramMap);
    Long localLong = n1.i("maxEjectionTime", paramMap);
    Integer localInteger1 = n1.f("maxEjectionPercentage", paramMap);
    if (localObject1 == null) {
      localObject1 = Long.valueOf(10000000000L);
    }
    if (localObject2 == null) {
      localObject2 = Long.valueOf(30000000000L);
    }
    if (localLong == null) {
      localLong = Long.valueOf(300000000000L);
    }
    if (localInteger1 == null) {
      localInteger1 = Integer.valueOf(10);
    }
    Object localObject3 = n1.g("successRateEjection", paramMap);
    Object localObject4;
    Object localObject5;
    Object localObject8;
    boolean bool;
    if (localObject3 != null)
    {
      localObject4 = Integer.valueOf(1900);
      localObject5 = Integer.valueOf(100);
      localObject6 = n1.f("stdevFactor", (Map)localObject3);
      localObject7 = n1.f("enforcementPercentage", (Map)localObject3);
      localObject8 = n1.f("minimumHosts", (Map)localObject3);
      localObject3 = n1.f("requestVolume", (Map)localObject3);
      if (localObject6 != null) {
        localObject4 = localObject6;
      }
      if (localObject7 != null)
      {
        if ((((Integer)localObject7).intValue() >= 0) && (((Integer)localObject7).intValue() <= 100)) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
      }
      else
      {
        localObject7 = localObject5;
      }
      if (localObject8 != null)
      {
        if (((Integer)localObject8).intValue() >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
      }
      else
      {
        localObject8 = Integer.valueOf(5);
      }
      if (localObject3 != null)
      {
        if (((Integer)localObject3).intValue() >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
        localObject5 = localObject3;
      }
      localObject5 = new i.f.b((Integer)localObject4, (Integer)localObject7, (Integer)localObject8, (Integer)localObject5);
    }
    else
    {
      localObject5 = null;
    }
    Object localObject6 = n1.g("failurePercentageEjection", paramMap);
    if (localObject6 != null)
    {
      localObject4 = Integer.valueOf(85);
      localObject7 = Integer.valueOf(100);
      localObject8 = Integer.valueOf(5);
      localObject3 = Integer.valueOf(50);
      Integer localInteger2 = n1.f("threshold", (Map)localObject6);
      Integer localInteger3 = n1.f("enforcementPercentage", (Map)localObject6);
      Integer localInteger4 = n1.f("minimumHosts", (Map)localObject6);
      localObject6 = n1.f("requestVolume", (Map)localObject6);
      if (localInteger2 != null)
      {
        if ((localInteger2.intValue() >= 0) && (localInteger2.intValue() <= 100)) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
        localObject4 = localInteger2;
      }
      if (localInteger3 != null)
      {
        if ((localInteger3.intValue() >= 0) && (localInteger3.intValue() <= 100)) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
        localObject7 = localInteger3;
      }
      if (localInteger4 != null)
      {
        if (localInteger4.intValue() >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
        localObject8 = localInteger4;
      }
      if (localObject6 != null)
      {
        if (((Integer)localObject6).intValue() >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.t(bool);
        localObject3 = localObject6;
      }
      localObject4 = new i.f.a((Integer)localObject4, (Integer)localObject7, (Integer)localObject8, (Integer)localObject3);
    }
    else
    {
      localObject4 = null;
    }
    Object localObject7 = n1.c("childPolicy", paramMap);
    if (localObject7 == null) {
      localObject7 = null;
    } else {
      n1.a((List)localObject7);
    }
    localObject7 = g3.d((List)localObject7);
    if ((localObject7 != null) && (!((List)localObject7).isEmpty()))
    {
      paramMap = g3.c((List)localObject7, m0.a());
      if (a != null) {
        return paramMap;
      }
      paramMap = (g3.b)b;
      if (paramMap != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.J(bool);
      if (paramMap != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.J(bool);
      return new u0.b(new i.f((Long)localObject1, (Long)localObject2, localLong, localInteger1, (i.f.b)localObject5, (i.f.a)localObject4, paramMap));
    }
    localObject2 = e1.m;
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("No child policy in outlier_detection_experimental LB policy: ");
    ((StringBuilder)localObject1).append(paramMap);
    return new u0.b(((e1)localObject2).g(((StringBuilder)localObject1).toString()));
  }
  
  public final k0 a(k0.e parame)
  {
    return new i(parame);
  }
  
  public String b()
  {
    return "outlier_detection_experimental";
  }
  
  public int c()
  {
    return 5;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public u0.b e(Map<String, ?> paramMap)
  {
    try
    {
      paramMap = f(paramMap);
      return paramMap;
    }
    catch (RuntimeException paramMap)
    {
      e1 locale1 = e1.n.f(paramMap);
      paramMap = f.l("Failed parsing configuration for ");
      paramMap.append(b());
      return new u0.b(locale1.g(paramMap.toString()));
    }
  }
}

/* Location:
 * Qualified Name:     nb.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */