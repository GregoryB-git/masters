package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ConfigurationCompat
{
  @NonNull
  public static LocaleListCompat getLocales(@NonNull Configuration paramConfiguration)
  {
    return LocaleListCompat.wrap(Api24Impl.getLocales(paramConfiguration));
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static LocaleList getLocales(Configuration paramConfiguration)
    {
      return paramConfiguration.getLocales();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ConfigurationCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */