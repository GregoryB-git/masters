package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.ICUCompat;
import java.util.Locale;

@RequiresApi(21)
class LocaleListCompat$Api21Impl
{
  private static final Locale[] PSEUDO_LOCALE = { new Locale("en", "XA"), new Locale("ar", "XB") };
  
  @DoNotInline
  public static Locale forLanguageTag(String paramString)
  {
    return Locale.forLanguageTag(paramString);
  }
  
  private static boolean isPseudoLocale(Locale paramLocale)
  {
    Locale[] arrayOfLocale = PSEUDO_LOCALE;
    int i = arrayOfLocale.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfLocale[j].equals(paramLocale)) {
        return true;
      }
    }
    return false;
  }
  
  @DoNotInline
  public static boolean matchesLanguageAndScript(@NonNull Locale paramLocale1, @NonNull Locale paramLocale2)
  {
    boolean bool1 = paramLocale1.equals(paramLocale2);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if (!paramLocale1.getLanguage().equals(paramLocale2.getLanguage())) {
      return false;
    }
    if ((!isPseudoLocale(paramLocale1)) && (!isPseudoLocale(paramLocale2)))
    {
      String str = ICUCompat.maximizeAndGetScript(paramLocale1);
      if (str.isEmpty())
      {
        paramLocale1 = paramLocale1.getCountry();
        bool1 = bool2;
        if (!paramLocale1.isEmpty()) {
          if (paramLocale1.equals(paramLocale2.getCountry())) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
        return bool1;
      }
      return str.equals(ICUCompat.maximizeAndGetScript(paramLocale2));
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.LocaleListCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */