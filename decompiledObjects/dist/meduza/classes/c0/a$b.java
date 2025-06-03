package c0;

import android.icu.util.ULocale;
import java.util.Locale;

public final class a$b
{
  public static ULocale a(Object paramObject)
  {
    return ULocale.addLikelySubtags((ULocale)paramObject);
  }
  
  public static ULocale b(Locale paramLocale)
  {
    return ULocale.forLocale(paramLocale);
  }
  
  public static String c(Object paramObject)
  {
    return ((ULocale)paramObject).getScript();
  }
}

/* Location:
 * Qualified Name:     c0.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */