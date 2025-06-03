package p6;

import kotlin.jvm.internal.Intrinsics;

public abstract class w0
  extends B
  implements X, l0
{
  public x0 r;
  
  public boolean a()
  {
    return true;
  }
  
  public void b()
  {
    w().u0(this);
  }
  
  public C0 g()
  {
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(M.a(this));
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(this));
    localStringBuilder.append("[job@");
    localStringBuilder.append(M.b(w()));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public final x0 w()
  {
    x0 localx0 = r;
    if (localx0 != null) {
      return localx0;
    }
    Intrinsics.n("job");
    return null;
  }
  
  public final void x(x0 paramx0)
  {
    r = paramx0;
  }
}

/* Location:
 * Qualified Name:     p6.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */