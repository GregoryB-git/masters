package androidx.core.widget;

import android.icu.text.DecimalFormatSymbols;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
class TextViewCompat$Api24Impl
{
  @DoNotInline
  public static DecimalFormatSymbols getInstance(Locale paramLocale)
  {
    return DecimalFormatSymbols.getInstance(paramLocale);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */