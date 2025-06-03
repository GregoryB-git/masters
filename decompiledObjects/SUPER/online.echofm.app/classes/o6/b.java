package o6;

public abstract class b
{
  public static final boolean a = false;
  public static final ThreadLocal[] b;
  
  static
  {
    ThreadLocal[] arrayOfThreadLocal = new ThreadLocal[4];
    for (int i = 0; i < 4; i++) {
      arrayOfThreadLocal[i] = new ThreadLocal();
    }
    b = arrayOfThreadLocal;
  }
  
  public static final boolean a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     o6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */