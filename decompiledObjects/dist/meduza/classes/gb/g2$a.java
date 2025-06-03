package gb;

import b.z;
import eb.c.b;
import eb.e1.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import n7.g;
import n7.g.a;
import x6.b;

public final class g2$a
{
  public static final c.b<a> g = new c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
  public final Long a;
  public final Boolean b;
  public final Integer c;
  public final Integer d;
  public final a3 e;
  public final x0 f;
  
  public g2$a(Map<String, ?> paramMap, boolean paramBoolean, int paramInt1, int paramInt2)
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
    g.a locala = g.b(this);
    locala.a(a, "timeoutNanos");
    locala.a(b, "waitForReady");
    locala.a(c, "maxInboundMessageSize");
    locala.a(d, "maxOutboundMessageSize");
    locala.a(e, "retryPolicy");
    locala.a(f, "hedgingPolicy");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.g2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */