package o2;

import f;

public final class m$a$a
  extends m.a
{
  public final Throwable a;
  
  public m$a$a(Throwable paramThrowable)
  {
    a = paramThrowable;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FAILURE (");
    localStringBuilder.append(a.getMessage());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o2.m.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */