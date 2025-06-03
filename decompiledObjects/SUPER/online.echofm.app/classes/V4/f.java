package V4;

public abstract class f
  extends Exception
{
  public static final boolean o;
  public static final StackTraceElement[] p = new StackTraceElement[0];
  
  static
  {
    boolean bool;
    if (System.getProperty("surefire.test.class.path") != null) {
      bool = true;
    } else {
      bool = false;
    }
    o = bool;
  }
  
  public final Throwable fillInStackTrace()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     V4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */