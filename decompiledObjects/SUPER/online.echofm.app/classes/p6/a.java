package p6;

import X5.d;
import X5.g;
import g6.p;

public abstract class a
  extends x0
  implements q0, d, I
{
  public final g q;
  
  public a(g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBoolean2);
    if (paramBoolean1) {
      e0((q0)paramg.b(q0.n));
    }
    q = paramg.k(this);
  }
  
  public void G0(Object paramObject)
  {
    F(paramObject);
  }
  
  public void H0(Throwable paramThrowable, boolean paramBoolean) {}
  
  public void I0(Object paramObject) {}
  
  public final void J0(K paramK, Object paramObject, p paramp)
  {
    paramK.e(paramp, paramObject, this);
  }
  
  public String N()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(M.a(this));
    localStringBuilder.append(" was cancelled");
    return localStringBuilder.toString();
  }
  
  public boolean a()
  {
    return super.a();
  }
  
  public final void d0(Throwable paramThrowable)
  {
    H.a(q, paramThrowable);
  }
  
  public g f()
  {
    return q;
  }
  
  public final g getContext()
  {
    return q;
  }
  
  public String l0()
  {
    String str = E.b(q);
    if (str == null) {
      return super.l0();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('"');
    localStringBuilder.append(str);
    localStringBuilder.append("\":");
    localStringBuilder.append(super.l0());
    return localStringBuilder.toString();
  }
  
  public final void q0(Object paramObject)
  {
    if ((paramObject instanceof z))
    {
      paramObject = (z)paramObject;
      H0(a, ((z)paramObject).a());
    }
    else
    {
      I0(paramObject);
    }
  }
  
  public final void resumeWith(Object paramObject)
  {
    paramObject = j0(D.d(paramObject, null, 1, null));
    if (paramObject == y0.b) {
      return;
    }
    G0(paramObject);
  }
}

/* Location:
 * Qualified Name:     p6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */