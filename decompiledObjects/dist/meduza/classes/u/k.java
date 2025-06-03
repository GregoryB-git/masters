package u;

import android.app.LocaleManager;
import android.os.LocaleList;

public final class k
{
  public static LocaleList a(Object paramObject)
  {
    return ((LocaleManager)paramObject).getApplicationLocales();
  }
  
  public static LocaleList b(Object paramObject)
  {
    return ((LocaleManager)paramObject).getSystemLocales();
  }
}

/* Location:
 * Qualified Name:     u.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */