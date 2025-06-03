package L;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public abstract class h$b
{
  public static Drawable[] a(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawablesRelative();
  }
  
  public static int b(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public static int c(View paramView)
  {
    return paramView.getTextDirection();
  }
  
  public static Locale d(TextView paramTextView)
  {
    return paramTextView.getTextLocale();
  }
  
  public static void e(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void f(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void g(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void h(View paramView, int paramInt)
  {
    paramView.setTextDirection(paramInt);
  }
}

/* Location:
 * Qualified Name:     L.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */