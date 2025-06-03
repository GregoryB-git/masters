package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class X5
  extends r
{
  public final d p;
  
  public X5(d paramd)
  {
    p = paramd;
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1570616835: 
      if (paramString.equals("setEventName")) {
        j = 5;
      }
      break;
    case 920706790: 
      if (paramString.equals("setParamValue")) {
        j = 4;
      }
      break;
    case 700587132: 
      if (paramString.equals("getParams")) {
        j = 3;
      }
      break;
    case 146575578: 
      if (paramString.equals("getParamValue")) {
        j = 2;
      }
      break;
    case 45521504: 
      if (paramString.equals("getTimestamp")) {
        j = 1;
      }
      break;
    case 21624207: 
      if (paramString.equals("getEventName")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return super.s(paramString, paramf3, paramList);
    case 5: 
      C2.g("setEventName", 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((!s.d.equals(paramString)) && (!s.e.equals(paramString)))
      {
        p.d().f(paramString.g());
        return new u(paramString.g());
      }
      throw new IllegalArgumentException("Illegal event name");
    case 4: 
      C2.g("setParamValue", 2, paramList);
      paramString = paramf3.b((s)paramList.get(0)).g();
      paramf3 = paramf3.b((s)paramList.get(1));
      p.d().d(paramString, C2.d(paramf3));
      return paramf3;
    case 3: 
      C2.g("getParams", 0, paramList);
      paramf3 = p.d().g();
      paramString = new r();
      Iterator localIterator = paramf3.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        paramString.a(paramList, b4.b(paramf3.get(paramList)));
      }
      return paramString;
    case 2: 
      C2.g("getParamValue", 1, paramList);
      paramString = paramf3.b((s)paramList.get(0)).g();
      return b4.b(p.d().b(paramString));
    case 1: 
      C2.g("getTimestamp", 0, paramList);
      return new k(Double.valueOf(p.d().a()));
    }
    C2.g("getEventName", 0, paramList);
    return new u(p.d().e());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.X5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */