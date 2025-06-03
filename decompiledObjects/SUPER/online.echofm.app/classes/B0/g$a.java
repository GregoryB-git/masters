package B0;

import A0.y;
import d0.q;
import d0.z;
import g0.a;
import java.util.regex.Pattern;

public abstract class g$a
{
  public static final Pattern a = Pattern.compile(".*-.*");
  
  public static String b(y paramy)
  {
    boolean bool;
    if (paramy != null) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    int i = z.k(mn);
    int j = i;
    if (i == -1) {
      j = z.k(mm);
    }
    if (j == 1) {
      return "a";
    }
    if (j == 2) {
      return "v";
    }
    return null;
  }
  
  public abstract g a();
  
  public abstract a c(long paramLong);
  
  public abstract a d(String paramString);
  
  public abstract a e(String paramString);
  
  public abstract a f(String paramString);
}

/* Location:
 * Qualified Name:     B0.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */