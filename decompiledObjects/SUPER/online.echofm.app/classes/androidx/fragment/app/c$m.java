package androidx.fragment.app;

import E.c;

public class c$m
  extends c.l
{
  public final Object c;
  public final boolean d;
  public final Object e;
  
  public c$m(B.e parame, c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parame, paramc);
    if (parame.e() == B.e.c.p)
    {
      paramc = parame.f();
      if (paramBoolean1) {
        paramc = paramc.H();
      } else {
        paramc = paramc.u();
      }
      c = paramc;
      paramc = parame.f();
      if (paramBoolean1) {
        bool = paramc.p();
      }
    }
    for (boolean bool = paramc.o();; bool = true)
    {
      d = bool;
      break;
      paramc = parame.f();
      if (paramBoolean1) {
        paramc = paramc.K();
      } else {
        paramc = paramc.w();
      }
      c = paramc;
    }
    if (paramBoolean2)
    {
      parame = parame.f();
      if (paramBoolean1) {
        parame = parame.M();
      }
    }
    for (;;)
    {
      e = parame;
      break;
      parame = parame.L();
      continue;
      parame = null;
    }
  }
  
  public y e()
  {
    Object localObject = f(c);
    y localy = f(e);
    if ((localObject != null) && (localy != null) && (localObject != localy))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      ((StringBuilder)localObject).append(b().f());
      ((StringBuilder)localObject).append(" returned Transition ");
      ((StringBuilder)localObject).append(c);
      ((StringBuilder)localObject).append(" which uses a different Transition  type than its shared element transition ");
      ((StringBuilder)localObject).append(e);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    if (localObject == null) {
      localObject = localy;
    }
    return (y)localObject;
  }
  
  public final y f(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = w.b;
    if ((localObject != null) && (((y)localObject).e(paramObject))) {
      return (y)localObject;
    }
    localObject = w.c;
    if ((localObject != null) && (((y)localObject).e(paramObject))) {
      return (y)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Transition ");
    ((StringBuilder)localObject).append(paramObject);
    ((StringBuilder)localObject).append(" for fragment ");
    ((StringBuilder)localObject).append(b().f());
    ((StringBuilder)localObject).append(" is not a valid framework Transition or AndroidX Transition");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public Object g()
  {
    return e;
  }
  
  public Object h()
  {
    return c;
  }
  
  public boolean i()
  {
    boolean bool;
    if (e != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.c.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */