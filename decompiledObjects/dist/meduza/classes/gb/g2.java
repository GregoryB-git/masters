package gb;

import b.z;
import eb.c.b;
import eb.d0;
import eb.d0.a;
import eb.e1;
import eb.e1.a;
import eb.t0;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n7.g.a;
import n7.i;
import x6.b;

public final class g2
{
  public final a a;
  public final Map<String, a> b;
  public final Map<String, a> c;
  public final y2.b0 d;
  public final Object e;
  public final Map<String, ?> f;
  
  public g2(a parama, HashMap paramHashMap1, HashMap paramHashMap2, y2.b0 paramb0, Object paramObject, Map paramMap)
  {
    a = parama;
    b = g.i(paramHashMap1);
    c = g.i(paramHashMap2);
    d = paramb0;
    e = paramObject;
    if (paramMap != null) {
      parama = Collections.unmodifiableMap(new HashMap(paramMap));
    } else {
      parama = null;
    }
    f = parama;
  }
  
  public static g2 a(Map<String, ?> paramMap, boolean paramBoolean, int paramInt1, int paramInt2, Object paramObject)
  {
    Object localObject1;
    boolean bool;
    if (paramBoolean)
    {
      if (paramMap != null)
      {
        localObject1 = n1.g("retryThrottling", paramMap);
        if (localObject1 != null) {}
      }
      else
      {
        localObject1 = null;
        break label113;
      }
      float f1 = n1.e("maxTokens", (Map)localObject1).floatValue();
      float f2 = n1.e("tokenRatio", (Map)localObject1).floatValue();
      if (f1 > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "maxToken should be greater than zero");
      if (f2 > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "tokenRatio should be greater than zero");
      localObject1 = new y2.b0(f1, f2);
    }
    else
    {
      label113:
      localObject1 = null;
    }
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Map localMap;
    if (paramMap == null) {
      localMap = null;
    } else {
      localMap = n1.g("healthCheckConfig", paramMap);
    }
    Object localObject2 = n1.c("methodConfig", paramMap);
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      n1.a((List)localObject2);
    }
    if (localObject2 == null) {
      return new g2(null, localHashMap1, localHashMap2, (y2.b0)localObject1, paramObject, localMap);
    }
    Iterator localIterator1 = ((List)localObject2).iterator();
    localObject2 = null;
    while (localIterator1.hasNext())
    {
      Object localObject3 = (Map)localIterator1.next();
      a locala = new a((Map)localObject3, paramBoolean, paramInt1, paramInt2);
      localObject3 = n1.c("name", (Map)localObject3);
      if (localObject3 == null) {
        localObject3 = null;
      } else {
        n1.a((List)localObject3);
      }
      if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
      {
        Iterator localIterator2 = ((List)localObject3).iterator();
        localObject3 = localObject2;
        for (;;)
        {
          localObject2 = localObject3;
          if (!localIterator2.hasNext()) {
            break;
          }
          Object localObject4 = (Map)localIterator2.next();
          localObject2 = n1.h("service", (Map)localObject4);
          localObject4 = n1.h("method", (Map)localObject4);
          if (i.a((String)localObject2))
          {
            b.n(localObject4, "missing service name for method %s", i.a((String)localObject4));
            if (localObject3 == null) {
              bool = true;
            } else {
              bool = false;
            }
            b.n(paramMap, "Duplicate default method config in service config %s", bool);
            localObject3 = locala;
          }
          else if (i.a((String)localObject4))
          {
            b.n(localObject2, "Duplicate service %s", localHashMap2.containsKey(localObject2) ^ true);
            localHashMap2.put(localObject2, locala);
          }
          else
          {
            localObject2 = t0.a((String)localObject2, (String)localObject4);
            b.n(localObject2, "Duplicate method name %s", localHashMap1.containsKey(localObject2) ^ true);
            localHashMap1.put(localObject2, locala);
          }
        }
      }
    }
    return new g2((a)localObject2, localHashMap1, localHashMap2, (y2.b0)localObject1, paramObject, localMap);
  }
  
  public final b b()
  {
    if ((c.isEmpty()) && (b.isEmpty()) && (a == null)) {
      return null;
    }
    return new b(this);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (g2.class == paramObject.getClass()))
    {
      paramObject = (g2)paramObject;
      if ((!b.Q(a, a)) || (!b.Q(b, b)) || (!b.Q(c, c)) || (!b.Q(d, d)) || (!b.Q(e, e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, e });
  }
  
  public final String toString()
  {
    g.a locala = n7.g.b(this);
    locala.a(a, "defaultMethodConfig");
    locala.a(b, "serviceMethodMap");
    locala.a(c, "serviceMap");
    locala.a(d, "retryThrottling");
    locala.a(e, "loadBalancingConfig");
    return locala.toString();
  }
  
  public static final class a
  {
    public static final c.b<a> g = new c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    public final Long a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final a3 e;
    public final x0 f;
    
    public a(Map<String, ?> paramMap, boolean paramBoolean, int paramInt1, int paramInt2)
    {
      a = n1.i("timeout", paramMap);
      b = n1.b("waitForReady", paramMap);
      Object localObject1 = n1.f("maxResponseMessageBytes", paramMap);
      c = ((Integer)localObject1);
      boolean bool;
      if (localObject1 != null)
      {
        if (((Integer)localObject1).intValue() >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.n(localObject1, "maxInboundMessageSize %s exceeds bounds", bool);
      }
      localObject1 = n1.f("maxRequestMessageBytes", paramMap);
      d = ((Integer)localObject1);
      if (localObject1 != null)
      {
        if (((Integer)localObject1).intValue() >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.n(localObject1, "maxOutboundMessageSize %s exceeds bounds", bool);
      }
      if (paramBoolean) {
        localObject1 = n1.g("retryPolicy", paramMap);
      } else {
        localObject1 = null;
      }
      long l1;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        Object localObject2 = n1.f("maxAttempts", (Map)localObject1);
        b.y(localObject2, "maxAttempts cannot be empty");
        int i = ((Integer)localObject2).intValue();
        if (i >= 2) {
          bool = true;
        } else {
          bool = false;
        }
        b.l(i, "maxAttempts must be greater than 1: %s", bool);
        paramInt1 = Math.min(i, paramInt1);
        localObject2 = n1.i("initialBackoff", (Map)localObject1);
        b.y(localObject2, "initialBackoff cannot be empty");
        l1 = ((Long)localObject2).longValue();
        if (l1 > 0L) {
          bool = true;
        } else {
          bool = false;
        }
        b.m(l1, "initialBackoffNanos must be greater than 0: %s", bool);
        localObject2 = n1.i("maxBackoff", (Map)localObject1);
        b.y(localObject2, "maxBackoff cannot be empty");
        long l2 = ((Long)localObject2).longValue();
        if (l2 > 0L) {
          bool = true;
        } else {
          bool = false;
        }
        b.m(l2, "maxBackoff must be greater than 0: %s", bool);
        localObject2 = n1.e("backoffMultiplier", (Map)localObject1);
        b.y(localObject2, "backoffMultiplier cannot be empty");
        double d1 = ((Double)localObject2).doubleValue();
        if (d1 > 0.0D) {
          bool = true;
        } else {
          bool = false;
        }
        b.n(Double.valueOf(d1), "backoffMultiplier must be greater than 0: %s", bool);
        localObject2 = n1.i("perAttemptRecvTimeout", (Map)localObject1);
        if ((localObject2 != null) && (((Long)localObject2).longValue() < 0L)) {
          bool = false;
        } else {
          bool = true;
        }
        b.n(localObject2, "perAttemptRecvTimeout cannot be negative: %s", bool);
        localObject1 = g3.a("retryableStatusCodes", (Map)localObject1);
        if (localObject1 != null) {
          bool = true;
        } else {
          bool = false;
        }
        z.r("retryableStatusCodes", "%s is required in retry policy", bool);
        z.r("retryableStatusCodes", "%s must not contain OK", ((Set)localObject1).contains(e1.a.c) ^ true);
        if ((localObject2 == null) && (((Set)localObject1).isEmpty())) {
          bool = false;
        } else {
          bool = true;
        }
        b.s("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", bool);
        localObject1 = new a3(paramInt1, l1, l2, d1, (Long)localObject2, (Set)localObject1);
      }
      e = ((a3)localObject1);
      if (paramBoolean) {
        paramMap = n1.g("hedgingPolicy", paramMap);
      } else {
        paramMap = null;
      }
      if (paramMap == null)
      {
        paramMap = null;
      }
      else
      {
        localObject1 = n1.f("maxAttempts", paramMap);
        b.y(localObject1, "maxAttempts cannot be empty");
        paramInt1 = ((Integer)localObject1).intValue();
        if (paramInt1 >= 2) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        b.l(paramInt1, "maxAttempts must be greater than 1: %s", paramBoolean);
        paramInt1 = Math.min(paramInt1, paramInt2);
        localObject1 = n1.i("hedgingDelay", paramMap);
        b.y(localObject1, "hedgingDelay cannot be empty");
        l1 = ((Long)localObject1).longValue();
        if (l1 >= 0L) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        b.m(l1, "hedgingDelay must not be negative: %s", paramBoolean);
        paramMap = g3.a("nonFatalStatusCodes", paramMap);
        if (paramMap == null) {
          paramMap = Collections.unmodifiableSet(EnumSet.noneOf(e1.a.class));
        } else {
          z.r("nonFatalStatusCodes", "%s must not contain OK", paramMap.contains(e1.a.c) ^ true);
        }
        paramMap = new x0(paramInt1, l1, paramMap);
      }
      f = paramMap;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (a)paramObject;
      bool1 = bool2;
      if (b.Q(a, a))
      {
        bool1 = bool2;
        if (b.Q(b, b))
        {
          bool1 = bool2;
          if (b.Q(c, c))
          {
            bool1 = bool2;
            if (b.Q(d, d))
            {
              bool1 = bool2;
              if (b.Q(e, e))
              {
                bool1 = bool2;
                if (b.Q(f, f)) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b, c, d, e, f });
    }
    
    public final String toString()
    {
      g.a locala = n7.g.b(this);
      locala.a(a, "timeoutNanos");
      locala.a(b, "waitForReady");
      locala.a(c, "maxInboundMessageSize");
      locala.a(d, "maxOutboundMessageSize");
      locala.a(e, "retryPolicy");
      locala.a(f, "hedgingPolicy");
      return locala.toString();
    }
  }
  
  public static final class b
    extends d0
  {
    public final g2 b;
    
    public b(g2 paramg2)
    {
      b = paramg2;
    }
    
    public final d0.a a()
    {
      g2 localg2 = b;
      b.y(localg2, "config");
      return new d0.a(e1.e, localg2);
    }
  }
}

/* Location:
 * Qualified Name:     gb.g2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */