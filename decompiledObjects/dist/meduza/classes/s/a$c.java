package s;

public final class a$c
{
  public final Throwable a;
  
  static
  {
    new c(new a());
  }
  
  public a$c(Throwable paramThrowable)
  {
    boolean bool = a.d;
    paramThrowable.getClass();
    a = paramThrowable;
  }
  
  public final class a
    extends Throwable
  {
    public a()
    {
      super();
    }
    
    public final Throwable fillInStackTrace()
    {
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     s.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */