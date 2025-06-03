package androidx.core.app;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(21)
class LocaleManagerCompat$Api21Impl
{
  @DoNotInline
  public static String toLanguageTag(Locale paramLocale)
  {
    return paramLocale.toLanguageTag();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.LocaleManagerCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */