package u;

public final class a$d
{
  public static final d b = new d(new a("Failure occurred while trying to finish a future."));
  public final Throwable a;
  
  public a$d(Throwable paramThrowable)
  {
    a = ((Throwable)a.l(paramThrowable));
  }
  
  public class a
    extends Throwable
  {
    public a()
    {
      super();
    }
    
    public Throwable fillInStackTrace()
    {
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     u.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */