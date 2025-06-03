package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
class LocaleListCompat$Api24Impl
{
  @DoNotInline
  public static LocaleList createLocaleList(Locale... paramVarArgs)
  {
    return new LocaleList(paramVarArgs);
  }
  
  @DoNotInline
  public static LocaleList getAdjustedDefault()
  {
    return LocaleList.getAdjustedDefault();
  }
  
  @DoNotInline
  public static LocaleList getDefault()
  {
    return LocaleList.getDefault();
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.LocaleListCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */