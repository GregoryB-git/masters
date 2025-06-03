package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class L
  extends A
{
  public L()
  {
    a.add(Z.P);
    a.add(Z.Q);
    a.add(Z.R);
    a.add(Z.S);
    a.add(Z.T);
    a.add(Z.U);
    a.add(Z.V);
    a.add(Z.C0);
  }
  
  public static s c(P paramP, s params1, s params2)
  {
    return d(paramP, params1.k(), params2);
  }
  
  public static s d(P paramP, Iterator paramIterator, s params)
  {
    if (paramIterator != null) {
      while (paramIterator.hasNext())
      {
        Object localObject = paramP.a((s)paramIterator.next()).a((g)params);
        if ((localObject instanceof l))
        {
          localObject = (l)localObject;
          if ("break".equals(((l)localObject).b())) {
            return s.d;
          }
          if ("return".equals(((l)localObject).b())) {
            return (s)localObject;
          }
        }
      }
    }
    return s.d;
  }
  
  public static s e(P paramP, s params1, s params2)
  {
    if ((params1 instanceof Iterable)) {
      return d(paramP, ((Iterable)params1).iterator(), params2);
    }
    throw new IllegalArgumentException("Non-iterable type in for...of loop.");
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    Object localObject1;
    Object localObject2;
    switch (O.a[C2.c(paramString).ordinal()])
    {
    default: 
      return super.a(paramString);
    case 8: 
      C2.f(Z.C0, 4, paramList);
      paramString = (s)paramList.get(0);
      localObject1 = (s)paramList.get(1);
      localObject2 = (s)paramList.get(2);
      paramList = paramf3.b((s)paramList.get(3));
      if (paramf3.b((s)localObject2).d().booleanValue())
      {
        localObject2 = paramf3.a((g)paramList);
        if ((localObject2 instanceof l))
        {
          localObject2 = (l)localObject2;
          if ("break".equals(((l)localObject2).b())) {
            break label271;
          }
          if ("return".equals(((l)localObject2).b())) {
            return (s)localObject2;
          }
        }
      }
      while (paramf3.b(paramString).d().booleanValue())
      {
        localObject2 = paramf3.a((g)paramList);
        if ((localObject2 instanceof l))
        {
          localObject2 = (l)localObject2;
          if ("break".equals(((l)localObject2).b())) {
            break;
          }
          if ("return".equals(((l)localObject2).b())) {
            return (s)localObject2;
          }
        }
        paramf3.b((s)localObject1);
      }
      return s.d;
    case 7: 
      C2.f(Z.V, 3, paramList);
      if ((paramList.get(0) instanceof u))
      {
        paramString = ((s)paramList.get(0)).g();
        localObject1 = paramf3.b((s)paramList.get(1));
        paramList = paramf3.b((s)paramList.get(2));
        return e(new Q(paramf3, paramString), (s)localObject1, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
    case 6: 
      C2.f(Z.U, 3, paramList);
      if ((paramList.get(0) instanceof u))
      {
        localObject1 = ((s)paramList.get(0)).g();
        paramString = paramf3.b((s)paramList.get(1));
        paramList = paramf3.b((s)paramList.get(2));
        return e(new N(paramf3, (String)localObject1), paramString, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
    case 5: 
      C2.f(Z.T, 3, paramList);
      if ((paramList.get(0) instanceof u))
      {
        localObject1 = ((s)paramList.get(0)).g();
        paramString = paramf3.b((s)paramList.get(1));
        paramList = paramf3.b((s)paramList.get(2));
        return e(new T(paramf3, (String)localObject1), paramString, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
    case 4: 
      C2.f(Z.S, 4, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof g))
      {
        localObject1 = (g)paramString;
        s locals1 = (s)paramList.get(1);
        localObject2 = (s)paramList.get(2);
        s locals2 = paramf3.b((s)paramList.get(3));
        paramList = paramf3.d();
        for (int i = 0;; i++)
        {
          paramString = paramList;
          if (i >= ((g)localObject1).U()) {
            break;
          }
          paramString = ((g)localObject1).M(i).g();
          paramList.h(paramString, paramf3.c(paramString));
        }
        while (paramf3.b(locals1).d().booleanValue())
        {
          paramList = paramf3.a((g)locals2);
          if ((paramList instanceof l))
          {
            paramList = (l)paramList;
            if ("break".equals(paramList.b())) {
              break;
            }
            if ("return".equals(paramList.b())) {
              return paramList;
            }
          }
          paramList = paramf3.d();
          for (i = 0; i < ((g)localObject1).U(); i++)
          {
            String str = ((g)localObject1).M(i).g();
            paramList.h(str, paramString.c(str));
          }
          paramList.b((s)localObject2);
          paramString = paramList;
        }
        return s.d;
      }
      throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
    case 3: 
      C2.f(Z.R, 3, paramList);
      if ((paramList.get(0) instanceof u))
      {
        localObject1 = ((s)paramList.get(0)).g();
        paramString = paramf3.b((s)paramList.get(1));
        paramList = paramf3.b((s)paramList.get(2));
        return c(new Q(paramf3, (String)localObject1), paramString, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
    case 2: 
      label271:
      C2.f(Z.Q, 3, paramList);
      if ((paramList.get(0) instanceof u))
      {
        localObject1 = ((s)paramList.get(0)).g();
        paramString = paramf3.b((s)paramList.get(1));
        paramList = paramf3.b((s)paramList.get(2));
        return c(new N(paramf3, (String)localObject1), paramString, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
    }
    C2.f(Z.P, 3, paramList);
    if ((paramList.get(0) instanceof u))
    {
      paramString = ((s)paramList.get(0)).g();
      localObject1 = paramf3.b((s)paramList.get(1));
      paramList = paramf3.b((s)paramList.get(2));
      return c(new T(paramf3, paramString), (s)localObject1, paramList);
    }
    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */