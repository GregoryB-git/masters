package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(17)
class AppCompatTextHelper$Api17Impl
{
  @DoNotInline
  public static Drawable[] getCompoundDrawablesRelative(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawablesRelative();
  }
  
  @DoNotInline
  public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  @DoNotInline
  public static void setTextLocale(TextView paramTextView, Locale paramLocale)
  {
    paramTextView.setTextLocale(paramLocale);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */