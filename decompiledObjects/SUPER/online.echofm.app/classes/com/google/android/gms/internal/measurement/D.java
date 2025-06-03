package com.google.android.gms.internal.measurement;

import java.util.List;

public final class D
  extends A
{
  public D()
  {
    a.add(Z.M);
    a.add(Z.a0);
    a.add(Z.b0);
    a.add(Z.c0);
    a.add(Z.d0);
    a.add(Z.f0);
    a.add(Z.g0);
    a.add(Z.l0);
  }
  
  public static boolean c(s params1, s params2)
  {
    s locals = params1;
    boolean bool1;
    for (;;)
    {
      if (locals.getClass().equals(params2.getClass()))
      {
        if ((!(locals instanceof z)) && (!(locals instanceof q)))
        {
          if ((locals instanceof k)) {
            return (!Double.isNaN(locals.f().doubleValue())) && (!Double.isNaN(params2.f().doubleValue())) && (locals.f().doubleValue() == params2.f().doubleValue());
          }
          if ((locals instanceof u)) {
            return locals.g().equals(params2.g());
          }
          if ((locals instanceof h)) {
            return locals.d().equals(params2.d());
          }
          return locals == params2;
        }
        return true;
      }
      if ((((locals instanceof z)) || ((locals instanceof q))) && (((params2 instanceof z)) || ((params2 instanceof q)))) {
        break label380;
      }
      bool1 = locals instanceof k;
      if ((!bool1) || (!(params2 instanceof u))) {
        break;
      }
      params1 = new k(params2.f());
      label217:
      params2 = params1;
    }
    boolean bool2 = locals instanceof u;
    if ((bool2) && ((params2 instanceof k))) {
      params1 = new k(locals.f());
    }
    for (;;)
    {
      locals = params1;
      break;
      if ((locals instanceof h))
      {
        params1 = new k(locals.f());
      }
      else
      {
        if ((params2 instanceof h))
        {
          params1 = new k(params2.f());
          break label217;
        }
        if (((bool2) || (bool1)) && ((params2 instanceof m)))
        {
          params1 = new u(params2.g());
          break label217;
        }
        if ((!(locals instanceof m)) || ((!(params2 instanceof u)) && (!(params2 instanceof k)))) {
          break label378;
        }
        params1 = new u(locals.g());
      }
    }
    label378:
    return false;
    label380:
    return true;
  }
  
  public static boolean d(s params1, s params2)
  {
    Object localObject = params1;
    if ((params1 instanceof m)) {
      localObject = new u(params1.g());
    }
    params1 = params2;
    if ((params2 instanceof m)) {
      params1 = new u(params2.g());
    }
    if (((localObject instanceof u)) && ((params1 instanceof u))) {
      return ((s)localObject).g().compareTo(params1.g()) < 0;
    }
    double d1 = ((s)localObject).f().doubleValue();
    double d2 = params1.f().doubleValue();
    if ((!Double.isNaN(d1)) && (!Double.isNaN(d2)))
    {
      if (((d1 == 0.0D) && (d2 == 0.0D)) || ((d1 == 0.0D) && (d2 == 0.0D))) {
        return false;
      }
      if (Double.compare(d1, d2) < 0) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean e(s params1, s params2)
  {
    Object localObject = params1;
    if ((params1 instanceof m)) {
      localObject = new u(params1.g());
    }
    params1 = params2;
    if ((params2 instanceof m)) {
      params1 = new u(params2.g());
    }
    return (((localObject instanceof u)) && ((params1 instanceof u))) || ((!Double.isNaN(((s)localObject).f().doubleValue())) && (!Double.isNaN(params1.f().doubleValue())) && (!d(params1, (s)localObject)));
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    C2.f(C2.c(paramString), 2, paramList);
    s locals = paramf3.b((s)paramList.get(0));
    paramf3 = paramf3.b((s)paramList.get(1));
    boolean bool;
    switch (G.a[C2.c(paramString).ordinal()])
    {
    default: 
      return super.a(paramString);
    case 8: 
    case 7: 
    case 6: 
    case 5: 
      for (bool = c(locals, paramf3);; bool = C2.h(locals, paramf3))
      {
        bool ^= true;
        break;
        bool = e(locals, paramf3);
        break;
        bool = d(locals, paramf3);
        break;
      }
    case 4: 
      bool = C2.h(locals, paramf3);
      break;
    case 3: 
      bool = e(paramf3, locals);
      break;
    case 2: 
      bool = d(paramf3, locals);
      break;
    case 1: 
      bool = c(locals, paramf3);
    }
    if (bool) {
      return s.i;
    }
    return s.j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */