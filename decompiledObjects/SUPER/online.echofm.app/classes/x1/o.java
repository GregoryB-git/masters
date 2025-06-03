package x1;

import O1.n.b;
import U1.e;
import java.util.Random;

public class o
  extends RuntimeException
{
  public static final a o = new a(null);
  public static final long serialVersionUID = 1L;
  
  public o() {}
  
  public o(String paramString)
  {
    super(paramString);
    Object localObject = new Random();
    if ((paramString != null) && (B.F()) && (((Random)localObject).nextInt(100) > 50))
    {
      localObject = O1.n.a;
      O1.n.a(n.b.M, new n(paramString));
    }
  }
  
  public o(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public o(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public static final void b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      e.g(paramString);
      return;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
  
  public String toString()
  {
    String str1 = getMessage();
    String str2 = str1;
    if (str1 == null) {
      str2 = "";
    }
    return str2;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     x1.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */