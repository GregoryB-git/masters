package mc;

public final class b
{
  static
  {
    ThreadLocal[] arrayOfThreadLocal = new ThreadLocal[4];
    for (int i = 0; i < 4; i++) {
      arrayOfThreadLocal[i] = new ThreadLocal();
    }
  }
}

/* Location:
 * Qualified Name:     mc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */