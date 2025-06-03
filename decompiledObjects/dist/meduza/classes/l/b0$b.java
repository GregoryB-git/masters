package l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

public final class b0$b
{
  public static Drawable[] a(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawablesRelative();
  }
  
  public static void b(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void c(TextView paramTextView, Locale paramLocale)
  {
    paramTextView.setTextLocale(paramLocale);
  }
}

/* Location:
 * Qualified Name:     l.b0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */