package V2;

public final class c
  extends IllegalStateException
{
  public c(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public static IllegalStateException a(j paramj)
  {
    if (!paramj.m()) {
      return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
    Exception localException = paramj.i();
    if (localException != null) {
      paramj = "failure";
    } else if (paramj.n()) {
      paramj = "result ".concat(String.valueOf(paramj.j()));
    } else if (paramj.l()) {
      paramj = "cancellation";
    } else {
      paramj = "unknown issue";
    }
    return new c("Complete with: ".concat(paramj), localException);
  }
}

/* Location:
 * Qualified Name:     V2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */