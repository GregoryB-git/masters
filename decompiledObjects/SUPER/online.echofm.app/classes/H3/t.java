package H3;

import E3.f;
import M3.g;
import java.io.File;
import java.io.IOException;

public class t
{
  public final String a;
  public final g b;
  
  public t(String paramString, g paramg)
  {
    a = paramString;
    b = paramg;
  }
  
  public boolean a()
  {
    boolean bool;
    try
    {
      bool = b().createNewFile();
    }
    catch (IOException localIOException)
    {
      f localf = f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Error creating marker: ");
      localStringBuilder.append(a);
      localf.e(localStringBuilder.toString(), localIOException);
      bool = false;
    }
    return bool;
  }
  
  public final File b()
  {
    return b.e(a);
  }
  
  public boolean c()
  {
    return b().exists();
  }
  
  public boolean d()
  {
    return b().delete();
  }
}

/* Location:
 * Qualified Name:     H3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */