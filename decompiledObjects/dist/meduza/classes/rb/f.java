package rb;

import ec.i;

public final class f
{
  public static final e.a a(Throwable paramThrowable)
  {
    i.e(paramThrowable, "exception");
    return new e.a(paramThrowable);
  }
  
  public static final void b(Object paramObject)
  {
    if (!(paramObject instanceof e.a)) {
      return;
    }
    throw a;
  }
}

/* Location:
 * Qualified Name:     rb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */