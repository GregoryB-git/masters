package p6;

import g6.l;

public final class n0
  extends j
{
  public final l o;
  
  public n0(l paraml)
  {
    o = paraml;
  }
  
  public void a(Throwable paramThrowable)
  {
    o.invoke(paramThrowable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("InvokeOnCancel[");
    localStringBuilder.append(M.a(o));
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(this));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */