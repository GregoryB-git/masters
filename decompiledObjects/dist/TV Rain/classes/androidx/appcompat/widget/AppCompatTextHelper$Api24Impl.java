package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class AppCompatTextHelper$Api24Impl
{
  @DoNotInline
  public static LocaleList forLanguageTags(String paramString)
  {
    return LocaleList.forLanguageTags(paramString);
  }
  
  @DoNotInline
  public static void setTextLocales(TextView paramTextView, LocaleList paramLocaleList)
  {
    paramTextView.setTextLocales(paramLocaleList);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */