package n7;

public final class c$e
  extends c.c
{
  public static final int b = Integer.numberOfLeadingZeros(31);
  public static final e c = new e();
  
  public c$e()
  {
    super("CharMatcher.whitespace()");
  }
  
  public final boolean b(char paramChar)
  {
    boolean bool;
    if (" 　\r   　 \013　   　 \t     \f 　 　　 \n 　".charAt(1682554634 * paramChar >>> b) == paramChar) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     n7.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */