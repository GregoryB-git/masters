package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class F
  extends A
{
  public F()
  {
    a.add(Z.r);
    a.add(Z.A);
    a.add(Z.B);
    a.add(Z.C);
    a.add(Z.I);
    a.add(Z.E);
    a.add(Z.J);
    a.add(Z.O);
    a.add(Z.e0);
    a.add(Z.r0);
    a.add(Z.u0);
    a.add(Z.x0);
    a.add(Z.y0);
  }
  
  public static s c(f3 paramf3, List paramList)
  {
    C2.j(Z.O, 2, paramList);
    s locals = paramf3.b((s)paramList.get(0));
    Object localObject = paramf3.b((s)paramList.get(1));
    if ((localObject instanceof g))
    {
      List localList = ((g)localObject).a0();
      localObject = new ArrayList();
      if (paramList.size() > 2) {
        localObject = paramList.subList(2, paramList.size());
      }
      return new t(locals.g(), localList, (List)localObject, paramf3);
    }
    throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[] { localObject.getClass().getCanonicalName() }));
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    int i = I.a[C2.c(paramString).ordinal()];
    int j = 0;
    Object localObject2;
    switch (i)
    {
    default: 
      return super.a(paramString);
    case 13: 
      C2.f(Z.y0, 3, paramList);
      if (paramf3.b((s)paramList.get(0)).d().booleanValue()) {
        return paramf3.b((s)paramList.get(1));
      }
      return paramf3.b((s)paramList.get(2));
    case 12: 
      C2.f(Z.x0, 3, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      localObject1 = paramf3.b((s)paramList.get(1));
      localObject2 = paramf3.b((s)paramList.get(2));
      if ((localObject1 instanceof g))
      {
        if ((localObject2 instanceof g))
        {
          paramList = (g)localObject1;
          localObject2 = (g)localObject2;
          i = 0;
          while (j < paramList.U())
          {
            if ((i != 0) || (paramString.equals(paramf3.b(paramList.M(j)))))
            {
              localObject1 = paramf3.b(((g)localObject2).M(j));
              if ((localObject1 instanceof l))
              {
                if (((l)localObject1).b().equals("break")) {
                  break label383;
                }
                return (s)localObject1;
              }
              i = 1;
            }
            j++;
          }
          if (paramList.U() + 1 == ((g)localObject2).U())
          {
            paramString = paramf3.b(((g)localObject2).M(paramList.U()));
            if ((paramString instanceof l))
            {
              paramf3 = ((l)paramString).b();
              if ((paramf3.equals("return")) || (paramf3.equals("continue"))) {
                return paramString;
              }
            }
          }
          return s.d;
        }
        throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
      }
      throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
    case 11: 
      if (paramList.isEmpty()) {
        return s.h;
      }
      C2.f(Z.u0, 1, paramList);
      return new l("return", paramf3.b((s)paramList.get(0)));
    case 10: 
      return new g(paramList);
    case 9: 
      C2.j(Z.e0, 2, paramList);
      localObject1 = paramf3.b((s)paramList.get(0));
      localObject2 = paramf3.b((s)paramList.get(1));
      if (paramList.size() > 2) {
        paramString = paramf3.b((s)paramList.get(2));
      } else {
        paramString = null;
      }
      paramList = s.d;
      if (((s)localObject1).d().booleanValue()) {
        paramString = paramf3.a((g)localObject2);
      } else if (paramString != null) {
        paramString = paramf3.a((g)paramString);
      } else {
        paramString = paramList;
      }
      if ((paramString instanceof l)) {
        return paramString;
      }
      return paramList;
    case 8: 
      return c(paramf3, paramList);
    case 7: 
      C2.j(Z.J, 2, paramList);
      paramList = (t)c(paramf3, paramList);
      if (paramList.e() == null) {}
      for (paramString = "";; paramString = paramList.e())
      {
        paramf3.h(paramString, paramList);
        break;
      }
      return paramList;
    case 6: 
      C2.f(Z.B, 0, paramList);
      return s.f;
    case 4: 
    case 5: 
      if (!paramList.isEmpty())
      {
        paramString = paramf3.b((s)paramList.get(0));
        if ((paramString instanceof g)) {
          return paramf3.a((g)paramString);
        }
      }
      return s.d;
    case 3: 
      C2.f(Z.B, 0, paramList);
      return s.g;
    case 2: 
      label383:
      return paramf3.d().a(new g(paramList));
    }
    C2.f(Z.r, 3, paramList);
    paramString = paramf3.b((s)paramList.get(0));
    Object localObject1 = paramf3.b((s)paramList.get(1)).g();
    paramList = paramf3.b((s)paramList.get(2));
    if ((paramList instanceof g))
    {
      if (!((String)localObject1).isEmpty()) {
        return paramString.s((String)localObject1, paramf3, ((g)paramList).a0());
      }
      throw new IllegalArgumentException("Function name for apply is undefined");
    }
    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[] { paramList.getClass().getCanonicalName() }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */