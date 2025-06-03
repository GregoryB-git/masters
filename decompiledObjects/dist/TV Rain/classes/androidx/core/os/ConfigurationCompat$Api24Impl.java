package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class ConfigurationCompat$Api24Impl
{
  @DoNotInline
  public static LocaleList getLocales(Configuration paramConfiguration)
  {
    return paramConfiguration.getLocales();
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ConfigurationCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */