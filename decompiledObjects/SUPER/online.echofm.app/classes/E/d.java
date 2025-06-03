package E;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;

public abstract class d
{
  public static g a(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return g.d(a.a(paramConfiguration));
    }
    return g.a(new Locale[] { locale });
  }
  
  public static abstract class a
  {
    public static LocaleList a(Configuration paramConfiguration)
    {
      return paramConfiguration.getLocales();
    }
  }
}

/* Location:
 * Qualified Name:     E.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */