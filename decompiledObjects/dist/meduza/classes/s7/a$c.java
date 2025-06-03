package s7;

public final class a$c
{
  public final Throwable a;
  
  static
  {
    new c(new a());
  }
  
  public a$c(Throwable paramThrowable)
  {
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
 * Qualified Name:     s7.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */