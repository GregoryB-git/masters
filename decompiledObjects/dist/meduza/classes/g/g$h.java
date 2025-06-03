package g;

import a0.i;
import a0.l;
import android.content.res.Configuration;
import android.os.LocaleList;

public final class g$h
{
  public static void a(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    LocaleList localLocaleList = paramConfiguration1.getLocales();
    paramConfiguration1 = paramConfiguration2.getLocales();
    if (!localLocaleList.equals(paramConfiguration1))
    {
      paramConfiguration3.setLocales(paramConfiguration1);
      locale = locale;
    }
  }
  
  public static i b(Configuration paramConfiguration)
  {
    return i.b(paramConfiguration.getLocales().toLanguageTags());
  }
  
  public static void c(i parami)
  {
    LocaleList.setDefault(LocaleList.forLanguageTags(a.a()));
  }
  
  public static void d(Configuration paramConfiguration, i parami)
  {
    paramConfiguration.setLocales(LocaleList.forLanguageTags(a.a()));
  }
}

/* Location:
 * Qualified Name:     g.g.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */