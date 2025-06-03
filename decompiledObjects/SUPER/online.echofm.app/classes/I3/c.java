package I3;

import M3.g;
import java.io.File;

public class c
{
  public static final b c = new b(null);
  public final g a;
  public a b;
  
  public c(g paramg)
  {
    a = paramg;
    b = c;
  }
  
  public c(g paramg, String paramString)
  {
    this(paramg);
    e(paramString);
  }
  
  public void a()
  {
    b.d();
  }
  
  public byte[] b()
  {
    return b.c();
  }
  
  public String c()
  {
    return b.b();
  }
  
  public final File d(String paramString)
  {
    return a.o(paramString, "userlog");
  }
  
  public final void e(String paramString)
  {
    b.a();
    b = c;
    if (paramString == null) {
      return;
    }
    f(d(paramString), 65536);
  }
  
  public void f(File paramFile, int paramInt)
  {
    b = new f(paramFile, paramInt);
  }
  
  public void g(long paramLong, String paramString)
  {
    b.e(paramLong, paramString);
  }
  
  public static final class b
    implements a
  {
    public void a() {}
    
    public String b()
    {
      return null;
    }
    
    public byte[] c()
    {
      return null;
    }
    
    public void d() {}
    
    public void e(long paramLong, String paramString) {}
  }
}

/* Location:
 * Qualified Name:     I3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */