package H3;

import E3.f;
import java.util.concurrent.Callable;

public class s$c
  implements Callable
{
  public s$c(s params) {}
  
  public Boolean a()
  {
    boolean bool;
    try
    {
      bool = s.b(o).d();
      if (!bool) {
        f.f().k("Initialization marker file was not properly removed.");
      }
    }
    catch (Exception localException)
    {
      break label35;
    }
    return Boolean.valueOf(bool);
    label35:
    f.f().e("Problem encountered deleting Crashlytics initialization marker.", localException);
    return Boolean.FALSE;
  }
}

/* Location:
 * Qualified Name:     H3.s.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */