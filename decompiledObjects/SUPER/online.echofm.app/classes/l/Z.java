package l;

import android.os.Build.VERSION;
import android.view.View;

public abstract class Z
{
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Y.a(paramView, paramCharSequence);
    } else {
      a0.f(paramView, paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     l.Z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */