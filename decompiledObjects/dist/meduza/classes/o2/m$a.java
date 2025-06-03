package o2;

import f;

public abstract class m$a
{
  public static final class a
    extends m.a
  {
    public final Throwable a;
    
    public a(Throwable paramThrowable)
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
  
  public static final class b
    extends m.a
  {
    public final String toString()
    {
      return "IN_PROGRESS";
    }
  }
  
  public static final class c
    extends m.a
  {
    public final String toString()
    {
      return "SUCCESS";
    }
  }
}

/* Location:
 * Qualified Name:     o2.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */