package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(17)
class TextUtilsCompat$Api17Impl
{
  @DoNotInline
  public static int getLayoutDirectionFromLocale(Locale paramLocale)
  {
    return TextUtils.getLayoutDirectionFromLocale(paramLocale);
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.TextUtilsCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */