package androidx.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(17)
class TextViewCompat$Api17Impl
{
  @DoNotInline
  public static Drawable[] getCompoundDrawablesRelative(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawablesRelative();
  }
  
  @DoNotInline
  public static int getLayoutDirection(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  @DoNotInline
  public static int getTextDirection(View paramView)
  {
    return paramView.getTextDirection();
  }
  
  @DoNotInline
  public static Locale getTextLocale(TextView paramTextView)
  {
    return paramTextView.getTextLocale();
  }
  
  @DoNotInline
  public static void setCompoundDrawablesRelative(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  @DoNotInline
  public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @DoNotInline
  public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  @DoNotInline
  public static void setTextDirection(View paramView, int paramInt)
  {
    paramView.setTextDirection(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */