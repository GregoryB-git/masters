package androidx.core.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

@RequiresApi(24)
class LocaleManagerCompat$Api24Impl
{
  @DoNotInline
  public static LocaleListCompat getLocales(Configuration paramConfiguration)
  {
    return LocaleListCompat.forLanguageTags(paramConfiguration.getLocales().toLanguageTags());
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.LocaleManagerCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */