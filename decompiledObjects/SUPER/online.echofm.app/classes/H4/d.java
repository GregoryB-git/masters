package H4;

import F4.a;
import M4.b;
import N4.m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  extends e
{
  public static final a b = ;
  public final m a;
  
  public d(m paramm)
  {
    a = paramm;
  }
  
  public boolean c()
  {
    a locala;
    StringBuilder localStringBuilder;
    if (!o(a, 0))
    {
      locala = b;
      localStringBuilder = new StringBuilder();
    }
    for (String str = "Invalid Trace:";; str = "Invalid Counters for Trace:")
    {
      localStringBuilder.append(str);
      localStringBuilder.append(a.r0());
      locala.j(localStringBuilder.toString());
      return false;
      if ((!j(a)) || (h(a))) {
        break;
      }
      locala = b;
      localStringBuilder = new StringBuilder();
    }
    return true;
  }
  
  public final boolean g(Map paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      try
      {
        e.d((String)localEntry.getKey(), (String)localEntry.getValue());
      }
      catch (IllegalArgumentException paramMap)
      {
        b.j(paramMap.getLocalizedMessage());
        return false;
      }
    }
    return true;
  }
  
  public final boolean h(m paramm)
  {
    return i(paramm, 0);
  }
  
  public final boolean i(m paramm, int paramInt)
  {
    if (paramm == null) {
      return false;
    }
    if (paramInt > 1)
    {
      paramm = b;
      localObject = "Exceed MAX_SUBTRACE_DEEP:1";
      paramm.j((String)localObject);
      return false;
    }
    Object localObject = paramm.l0().entrySet().iterator();
    label40:
    if (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      if (!l((String)localEntry.getKey()))
      {
        paramm = b;
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("invalid CounterId:");
        ((StringBuilder)localObject).append((String)localEntry.getKey());
      }
      for (;;)
      {
        localObject = ((StringBuilder)localObject).toString();
        break;
        if (m((Long)localEntry.getValue())) {
          break label40;
        }
        paramm = b;
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("invalid CounterValue:");
        ((StringBuilder)localObject).append(localEntry.getValue());
      }
    }
    paramm = paramm.t0().iterator();
    while (paramm.hasNext()) {
      if (!i((m)paramm.next(), paramInt + 1)) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean j(m paramm)
  {
    if (paramm.k0() > 0) {
      return true;
    }
    paramm = paramm.t0().iterator();
    while (paramm.hasNext()) {
      if (((m)paramm.next()).k0() > 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean k(m paramm)
  {
    return paramm.r0().startsWith("_st_");
  }
  
  public final boolean l(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    paramString = paramString.trim();
    if (paramString.isEmpty()) {
      paramString = b;
    }
    for (String str = "counterId is empty";; str = "counterId exceeded max length 100")
    {
      paramString.j(str);
      return false;
      if (paramString.length() <= 100) {
        break;
      }
      paramString = b;
    }
    return true;
  }
  
  public final boolean m(Long paramLong)
  {
    boolean bool;
    if (paramLong != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean n(m paramm)
  {
    paramm = (Long)paramm.l0().get(b.s.toString());
    boolean bool;
    if ((paramm != null) && (paramm.compareTo(Long.valueOf(0L)) > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean o(m paramm, int paramInt)
  {
    if (paramm == null)
    {
      b.j("TraceMetric is null");
      return false;
    }
    if (paramInt > 1)
    {
      b.j("Exceed MAX_SUBTRACE_DEEP:1");
      return false;
    }
    Object localObject1;
    if (!q(paramm.r0()))
    {
      localObject1 = b;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("invalid TraceId:");
      ((StringBuilder)localObject2).append(paramm.r0());
      ((a)localObject1).j(((StringBuilder)localObject2).toString());
      return false;
    }
    if (!p(paramm))
    {
      localObject2 = b;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("invalid TraceDuration:");
      ((StringBuilder)localObject1).append(paramm.o0());
      ((a)localObject2).j(((StringBuilder)localObject1).toString());
      return false;
    }
    if (!paramm.u0())
    {
      b.j("clientStartTimeUs is null.");
      return false;
    }
    if ((k(paramm)) && (!n(paramm)))
    {
      localObject1 = b;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("non-positive totalFrames in screen trace ");
      ((StringBuilder)localObject2).append(paramm.r0());
      ((a)localObject1).j(((StringBuilder)localObject2).toString());
      return false;
    }
    Object localObject2 = paramm.t0().iterator();
    while (((Iterator)localObject2).hasNext()) {
      if (!o((m)((Iterator)localObject2).next(), paramInt + 1)) {
        return false;
      }
    }
    return g(paramm.m0());
  }
  
  public final boolean p(m paramm)
  {
    boolean bool;
    if ((paramm != null) && (paramm.o0() > 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean q(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {
      return false;
    }
    paramString = paramString.trim();
    boolean bool2 = bool1;
    if (!paramString.isEmpty())
    {
      bool2 = bool1;
      if (paramString.length() <= 100) {
        bool2 = true;
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     H4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */