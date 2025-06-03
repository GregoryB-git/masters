package nc;

import f;

public final class u0
  extends i
{
  public final t0 a;
  
  public u0(t0 paramt0)
  {
    a = paramt0;
  }
  
  public final void h(Throwable paramThrowable)
  {
    a.dispose();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DisposeOnCancel[");
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */