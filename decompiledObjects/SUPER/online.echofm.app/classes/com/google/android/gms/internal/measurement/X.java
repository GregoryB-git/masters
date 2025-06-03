package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class X
  extends A
{
  public X()
  {
    a.add(Z.s);
    a.add(Z.D);
    a.add(Z.G);
    a.add(Z.H);
    a.add(Z.N);
    a.add(Z.W);
    a.add(Z.Y);
    a.add(Z.Z);
    a.add(Z.m0);
    a.add(Z.v0);
    a.add(Z.z0);
    a.add(Z.A0);
    a.add(Z.B0);
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    int i = W.a[C2.c(paramString).ordinal()];
    int j = 0;
    int k = 0;
    int m = 0;
    label316:
    Object localObject;
    switch (i)
    {
    default: 
      return super.a(paramString);
    case 13: 
      C2.j(Z.B0, 1, paramList);
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        paramList = paramf3.b((s)paramString.next());
        if ((paramList instanceof u)) {
          paramf3.e(paramList.g(), s.d);
        } else {
          throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[] { paramList.getClass().getCanonicalName() }));
        }
      }
      return s.d;
    case 12: 
      C2.f(Z.A0, 0, paramList);
      return s.d;
    case 11: 
      C2.f(Z.z0, 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof z))
      {
        paramString = "undefined";
      }
      else if ((paramString instanceof h))
      {
        paramString = "boolean";
      }
      else if ((paramString instanceof k))
      {
        paramString = "number";
      }
      else if ((paramString instanceof u))
      {
        paramString = "string";
      }
      else if ((paramString instanceof t))
      {
        paramString = "function";
      }
      else
      {
        if (((paramString instanceof v)) || ((paramString instanceof l))) {
          break label316;
        }
        paramString = "object";
      }
      return new u(paramString);
      throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[] { paramString }));
    case 10: 
      C2.f(Z.v0, 3, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      localObject = paramf3.b((s)paramList.get(1));
      paramf3 = paramf3.b((s)paramList.get(2));
      if ((paramString != s.d) && (paramString != s.e))
      {
        if (((paramString instanceof g)) && ((localObject instanceof k))) {
          ((g)paramString).X(((s)localObject).f().intValue(), paramf3);
        } else if ((paramString instanceof m)) {
          ((m)paramString).a(((s)localObject).g(), paramf3);
        }
        return paramf3;
      }
      throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[] { ((s)localObject).g(), paramString.g() }));
    case 9: 
      C2.f(Z.m0, 0, paramList);
      return s.e;
    case 7: 
    case 8: 
      C2.f(Z.Z, 2, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      paramf3 = paramf3.b((s)paramList.get(1));
      if (((paramString instanceof g)) && (C2.l(paramf3))) {
        return ((g)paramString).M(paramf3.f().intValue());
      }
      if ((paramString instanceof m)) {
        return ((m)paramString).i(paramf3.g());
      }
      if ((paramString instanceof u))
      {
        if ("length".equals(paramf3.g())) {
          return new k(Double.valueOf(paramString.g().length()));
        }
        if ((C2.l(paramf3)) && (paramf3.f().doubleValue() < paramString.g().length())) {
          return new u(String.valueOf(paramString.g().charAt(paramf3.f().intValue())));
        }
      }
      return s.d;
    case 6: 
      C2.f(Z.W, 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof u)) {
        return paramf3.c(paramString.g());
      }
      throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[] { paramString.getClass().getCanonicalName() }));
    case 5: 
      C2.j(Z.N, 1, paramList);
      paramString = s.d;
      while (m < paramList.size())
      {
        paramString = paramf3.b((s)paramList.get(m));
        if (!(paramString instanceof l)) {
          m++;
        } else {
          throw new IllegalStateException("ControlValue cannot be in an expression list");
        }
      }
      return paramString;
    case 4: 
      if (paramList.isEmpty()) {
        return new r();
      }
      if (paramList.size() % 2 == 0)
      {
        paramString = new r();
        m = j;
        while (m < paramList.size() - 1)
        {
          localObject = paramf3.b((s)paramList.get(m));
          s locals = paramf3.b((s)paramList.get(m + 1));
          if ((!(localObject instanceof l)) && (!(locals instanceof l)))
          {
            paramString.a(((s)localObject).g(), locals);
            m += 2;
          }
          else
          {
            throw new IllegalStateException("Failed to evaluate map entry");
          }
        }
        return paramString;
      }
      throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[] { Integer.valueOf(paramList.size()) }));
    case 3: 
      if (paramList.isEmpty()) {
        return new g();
      }
      paramString = new g();
      localObject = paramList.iterator();
      m = k;
      while (((Iterator)localObject).hasNext())
      {
        paramList = paramf3.b((s)((Iterator)localObject).next());
        if (!(paramList instanceof l))
        {
          paramString.X(m, paramList);
          m++;
        }
        else
        {
          throw new IllegalStateException("Failed to evaluate array element");
        }
      }
      return paramString;
    case 2: 
      C2.j(Z.D, 2, paramList);
      if (paramList.size() % 2 == 0)
      {
        m = 0;
        while (m < paramList.size() - 1)
        {
          paramString = paramf3.b((s)paramList.get(m));
          if ((paramString instanceof u))
          {
            paramf3.f(paramString.g(), paramf3.b((s)paramList.get(m + 1)));
            m += 2;
          }
          else
          {
            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[] { paramString.getClass().getCanonicalName() }));
          }
        }
        return s.d;
      }
      throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[] { Integer.valueOf(paramList.size()) }));
    }
    C2.f(Z.s, 2, paramList);
    paramString = paramf3.b((s)paramList.get(0));
    if ((paramString instanceof u))
    {
      if (paramf3.g(paramString.g()))
      {
        paramList = paramf3.b((s)paramList.get(1));
        paramf3.h(paramString.g(), paramList);
        return paramList;
      }
      throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[] { paramString.g() }));
    }
    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[] { paramString.getClass().getCanonicalName() }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */