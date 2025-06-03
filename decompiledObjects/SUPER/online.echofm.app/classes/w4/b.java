package w4;

public class b
  implements a
{
  public static b a;
  
  public static b b()
  {
    if (a == null) {
      a = new b();
    }
    return a;
  }
  
  public long a()
  {
    return System.currentTimeMillis();
  }
}

/* Location:
 * Qualified Name:     w4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */