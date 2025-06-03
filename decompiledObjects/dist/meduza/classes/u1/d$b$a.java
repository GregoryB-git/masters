package u1;

public final class d$b$a
  extends RuntimeException
{
  public final int a;
  public final Throwable b;
  
  public d$b$a(int paramInt, Throwable paramThrowable)
  {
    super(paramThrowable);
    a = paramInt;
    b = paramThrowable;
  }
  
  public final Throwable getCause()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     u1.d.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */