package L5;

import Q3.e;
import Q3.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class A
{
  public final List a;
  public p b;
  
  public A(e parame, List paramList)
  {
    b = parame;
    a = paramList;
  }
  
  public p a()
  {
    if (a.isEmpty()) {
      return b;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      Map localMap = (Map)localIterator.next();
      Object localObject = localMap.get("type");
      Objects.requireNonNull(localObject);
      localObject = (String)localObject;
      int i = ((String)localObject).hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 102976443: 
        if (((String)localObject).equals("limit")) {
          j = 2;
        }
        break;
      case -1207110587: 
        if (((String)localObject).equals("orderBy")) {
          j = 1;
        }
        break;
      case -1349119146: 
        if (((String)localObject).equals("cursor")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        break;
      case 2: 
        e(localMap);
        break;
      case 1: 
        f(localMap);
        break;
      case 0: 
        b(localMap);
      }
    }
    return b;
  }
  
  public final void b(Map paramMap)
  {
    Object localObject = paramMap.get("name");
    Objects.requireNonNull(localObject);
    localObject = (String)localObject;
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1108304954: 
      if (((String)localObject).equals("endBefore")) {
        j = 3;
      }
      break;
    case 96650862: 
      if (((String)localObject).equals("endAt")) {
        j = 2;
      }
      break;
    case -1601257830: 
      if (((String)localObject).equals("startAfter")) {
        j = 1;
      }
      break;
    case -1897186251: 
      if (((String)localObject).equals("startAt")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 3: 
      d(paramMap);
      break;
    case 2: 
      c(paramMap);
      break;
    case 1: 
      g(paramMap);
      break;
    case 0: 
      h(paramMap);
    }
  }
  
  public final void c(Map paramMap)
  {
    Object localObject = paramMap.get("value");
    paramMap = (String)paramMap.get("key");
    if ((localObject instanceof Boolean)) {
      if (paramMap == null) {
        paramMap = b.i(((Boolean)localObject).booleanValue());
      }
    }
    for (;;)
    {
      b = paramMap;
      break;
      paramMap = b.j(((Boolean)localObject).booleanValue(), paramMap);
      continue;
      if ((localObject instanceof Number))
      {
        if (paramMap == null) {
          paramMap = b.d(((Number)localObject).doubleValue());
        } else {
          paramMap = b.e(((Number)localObject).doubleValue(), paramMap);
        }
      }
      else if (paramMap == null) {
        paramMap = b.g((String)localObject);
      } else {
        paramMap = b.h((String)localObject, paramMap);
      }
    }
  }
  
  public final void d(Map paramMap)
  {
    Object localObject = paramMap.get("value");
    paramMap = (String)paramMap.get("key");
    if ((localObject instanceof Boolean)) {
      if (paramMap == null) {
        paramMap = b.p(((Boolean)localObject).booleanValue());
      }
    }
    for (;;)
    {
      b = paramMap;
      break;
      paramMap = b.q(((Boolean)localObject).booleanValue(), paramMap);
      continue;
      if ((localObject instanceof Number))
      {
        if (paramMap == null) {
          paramMap = b.k(((Number)localObject).doubleValue());
        } else {
          paramMap = b.l(((Number)localObject).doubleValue(), paramMap);
        }
      }
      else if (paramMap == null) {
        paramMap = b.n((String)localObject);
      } else {
        paramMap = b.o((String)localObject, paramMap);
      }
    }
  }
  
  public final void e(Map paramMap)
  {
    Object localObject = paramMap.get("name");
    Objects.requireNonNull(localObject);
    localObject = (String)localObject;
    paramMap = paramMap.get("limit");
    Objects.requireNonNull(paramMap);
    int i = ((Integer)paramMap).intValue();
    if ("limitToFirst".equals(localObject)) {}
    for (paramMap = b.w(i);; paramMap = b.x(i))
    {
      b = paramMap;
      break;
      if (!"limitToLast".equals(localObject)) {
        break;
      }
    }
  }
  
  public final void f(Map paramMap)
  {
    Object localObject = paramMap.get("name");
    Objects.requireNonNull(localObject);
    localObject = (String)localObject;
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1217630252: 
      if (((String)localObject).equals("orderByValue")) {
        j = 3;
      }
      break;
    case 1200288727: 
      if (((String)localObject).equals("orderByChild")) {
        j = 2;
      }
      break;
    case 729747418: 
      if (((String)localObject).equals("orderByKey")) {
        j = 1;
      }
      break;
    case -626148087: 
      if (((String)localObject).equals("orderByPriority")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 3: 
      paramMap = b.B();
    case 2: 
    case 1: 
    case 0: 
      for (;;)
      {
        b = paramMap;
        break;
        paramMap = paramMap.get("path");
        Objects.requireNonNull(paramMap);
        paramMap = (String)paramMap;
        paramMap = b.y(paramMap);
        continue;
        paramMap = b.z();
        continue;
        paramMap = b.A();
      }
    }
  }
  
  public final void g(Map paramMap)
  {
    Object localObject = paramMap.get("value");
    paramMap = (String)paramMap.get("key");
    if ((localObject instanceof Boolean)) {
      if (paramMap == null) {
        paramMap = b.K(((Boolean)localObject).booleanValue());
      }
    }
    for (;;)
    {
      b = paramMap;
      break;
      paramMap = b.L(((Boolean)localObject).booleanValue(), paramMap);
      continue;
      if ((localObject instanceof Number))
      {
        if (paramMap == null) {
          paramMap = b.F(((Number)localObject).doubleValue());
        } else {
          paramMap = b.G(((Number)localObject).doubleValue(), paramMap);
        }
      }
      else if (paramMap == null) {
        paramMap = b.I((String)localObject);
      } else {
        paramMap = b.J((String)localObject, paramMap);
      }
    }
  }
  
  public final void h(Map paramMap)
  {
    Object localObject = paramMap.get("value");
    paramMap = (String)paramMap.get("key");
    if ((localObject instanceof Boolean)) {
      if (paramMap == null) {
        paramMap = b.R(((Boolean)localObject).booleanValue());
      }
    }
    for (;;)
    {
      b = paramMap;
      break;
      paramMap = b.S(((Boolean)localObject).booleanValue(), paramMap);
      continue;
      if ((localObject instanceof Number))
      {
        if (paramMap == null) {
          paramMap = b.M(((Number)localObject).doubleValue());
        } else {
          paramMap = b.N(((Number)localObject).doubleValue(), paramMap);
        }
      }
      else if (paramMap == null) {
        paramMap = b.P((String)localObject);
      } else {
        paramMap = b.Q((String)localObject, paramMap);
      }
    }
  }
}

/* Location:
 * Qualified Name:     L5.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */