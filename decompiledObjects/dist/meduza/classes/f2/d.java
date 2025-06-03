package f2;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import ec.t;

public final class d
{
  public static final d a = new d();
  
  static
  {
    t.a(d.class).e();
  }
  
  public static int a()
  {
    int i;
    try
    {
      i = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
    }
    catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
    {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     f2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */