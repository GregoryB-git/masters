package androidx.core.app;

import android.app.LocaleManager;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
class LocaleManagerCompat$Api33Impl
{
  @DoNotInline
  public static LocaleList localeManagerGetSystemLocales(Object paramObject)
  {
    return ((LocaleManager)paramObject).getSystemLocales();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.LocaleManagerCompat.Api33Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */