package androidx.core.text;

import android.icu.util.ULocale;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
class ICUCompat$Api24Impl
{
  @DoNotInline
  public static ULocale addLikelySubtags(Object paramObject)
  {
    return ULocale.addLikelySubtags((ULocale)paramObject);
  }
  
  @DoNotInline
  public static ULocale forLocale(Locale paramLocale)
  {
    return ULocale.forLocale(paramLocale);
  }
  
  @DoNotInline
  public static String getScript(Object paramObject)
  {
    return ((ULocale)paramObject).getScript();
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.ICUCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */