package a;

public abstract class b
{
  public static final String a = "_COROUTINE";
  
  public static final StackTraceElement b(Throwable paramThrowable, String paramString)
  {
    StackTraceElement localStackTraceElement = paramThrowable.getStackTrace()[0];
    paramThrowable = new StringBuilder();
    paramThrowable.append(a);
    paramThrowable.append('.');
    paramThrowable.append(paramString);
    return new StackTraceElement(paramThrowable.toString(), "_", localStackTraceElement.getFileName(), localStackTraceElement.getLineNumber());
  }
}

/* Location:
 * Qualified Name:     a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */