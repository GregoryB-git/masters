package E3;

import J3.B.a;
import J3.D;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class d
  implements a
{
  public static final g c = new b(null);
  public final r4.a a;
  public final AtomicReference b = new AtomicReference(null);
  
  public d(r4.a parama)
  {
    a = parama;
    parama.a(new b(this));
  }
  
  public g a(String paramString)
  {
    a locala = (a)b.get();
    if (locala == null) {
      paramString = c;
    } else {
      paramString = locala.a(paramString);
    }
    return paramString;
  }
  
  public boolean b()
  {
    a locala = (a)b.get();
    boolean bool;
    if ((locala != null) && (locala.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c(String paramString1, String paramString2, long paramLong, D paramD)
  {
    f localf = f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Deferring native open session: ");
    localStringBuilder.append(paramString1);
    localf.i(localStringBuilder.toString());
    a.a(new c(paramString1, paramString2, paramLong, paramD));
  }
  
  public boolean d(String paramString)
  {
    a locala = (a)b.get();
    boolean bool;
    if ((locala != null) && (locala.d(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class b
    implements g
  {
    public File a()
    {
      return null;
    }
    
    public File b()
    {
      return null;
    }
    
    public File c()
    {
      return null;
    }
    
    public B.a d()
    {
      return null;
    }
    
    public File e()
    {
      return null;
    }
    
    public File f()
    {
      return null;
    }
    
    public File g()
    {
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     E3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */