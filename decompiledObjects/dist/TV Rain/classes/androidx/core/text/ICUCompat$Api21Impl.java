package androidx.core.text;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(21)
class ICUCompat$Api21Impl
{
  @DoNotInline
  public static String getScript(Locale paramLocale)
  {
    return paramLocale.getScript();
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.ICUCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */