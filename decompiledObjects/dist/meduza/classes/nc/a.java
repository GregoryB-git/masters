package nc;

import b.a0;
import dc.p;
import ec.i;
import ec.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p2.m0;
import rb.f;

public abstract class a<T>
  extends o1
  implements ub.e<T>, d0
{
  public final ub.h c;
  
  public a(ub.h paramh, boolean paramBoolean)
  {
    super(paramBoolean);
    J((j1)paramh.get(j1.b.a));
    c = paramh.plus(this);
  }
  
  public final void H(n7.w paramw)
  {
    c0.a(c, paramw);
  }
  
  public String N()
  {
    return super.N();
  }
  
  public final void R(Object paramObject)
  {
    if ((paramObject instanceof u))
    {
      u localu = (u)paramObject;
      paramObject = a;
      localu.getClass();
      boolean bool;
      if (u.b.get(localu) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      a0((Throwable)paramObject, bool);
    }
    else
    {
      c0(paramObject);
    }
  }
  
  public void Z(Object paramObject)
  {
    p(paramObject);
  }
  
  public void a0(Throwable paramThrowable, boolean paramBoolean) {}
  
  public void c0(T paramT) {}
  
  public final void d0(int paramInt, a parama, p paramp)
  {
    if (paramInt != 0)
    {
      paramInt--;
      if (paramInt != 0)
      {
        if (paramInt == 1) {
          break label148;
        }
        if (paramInt != 2)
        {
          if (paramInt == 3) {
            try
            {
              ub.h localh = c;
              Object localObject = sc.w.c(localh, null);
              resumeWith(parama);
            }
            finally
            {
              try
              {
                v.a(2, paramp);
                parama = paramp.invoke(parama, this);
                sc.w.a(localh, localObject);
                if (parama == vb.a.a) {
                  break label148;
                }
              }
              finally
              {
                sc.w.a(localh, localObject);
              }
              parama = finally;
            }
          } else {
            throw new n7.w();
          }
        }
        else
        {
          i.e(paramp, "<this>");
          m0.P(m0.u(parama, this, paramp)).resumeWith(rb.h.a);
        }
      }
      try
      {
        a0.C(m0.P(m0.u(parama, this, paramp)), rb.h.a, null);
        label148:
        return;
      }
      finally
      {
        resumeWith(f.a(parama));
      }
    }
    throw null;
  }
  
  public final ub.h f()
  {
    return c;
  }
  
  public final ub.h getContext()
  {
    return c;
  }
  
  public boolean isActive()
  {
    return super.isActive();
  }
  
  public final void resumeWith(Object paramObject)
  {
    Throwable localThrowable = rb.e.a(paramObject);
    if (localThrowable != null) {
      paramObject = new u(localThrowable, false);
    }
    paramObject = L(paramObject);
    if (paramObject == m0.u) {
      return;
    }
    Z(paramObject);
  }
  
  public final String u()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(" was cancelled");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */