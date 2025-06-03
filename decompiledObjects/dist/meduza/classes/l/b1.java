package l;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import d2.e;

public final class b1
{
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      a.a(paramView, paramCharSequence);
    }
    else
    {
      c1 localc1 = c1.s;
      if ((localc1 != null) && (a == paramView)) {
        c1.b(null);
      }
      if (TextUtils.isEmpty(paramCharSequence))
      {
        paramCharSequence = c1.t;
        if ((paramCharSequence != null) && (a == paramView)) {
          paramCharSequence.a();
        }
        paramView.setOnLongClickListener(null);
        paramView.setLongClickable(false);
        paramView.setOnHoverListener(null);
      }
      else
      {
        new c1(paramView, paramCharSequence);
      }
    }
  }
  
  public static final class a
  {
    public static void a(View paramView, CharSequence paramCharSequence)
    {
      e.q(paramView, paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     l.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */