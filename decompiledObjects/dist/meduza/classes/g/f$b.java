package g;

import android.app.LocaleManager;
import android.os.LocaleList;

public final class f$b
{
  public static LocaleList a(Object paramObject)
  {
    return ((LocaleManager)paramObject).getApplicationLocales();
  }
  
  public static void b(Object paramObject, LocaleList paramLocaleList)
  {
    ((LocaleManager)paramObject).setApplicationLocales(paramLocaleList);
  }
}

/* Location:
 * Qualified Name:     g.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */