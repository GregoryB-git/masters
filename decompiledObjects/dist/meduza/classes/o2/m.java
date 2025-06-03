package o2;

import f;

public abstract interface m
{
  public static final m.a.c a = new m.a.c();
  public static final m.a.b b = new m.a.b();
  
  public static abstract class a
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
}

/* Location:
 * Qualified Name:     o2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */