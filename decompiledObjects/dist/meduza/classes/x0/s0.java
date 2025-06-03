package x0;

import android.view.View;
import f;

public final class s0
{
  public static int a(View paramView)
  {
    int i;
    if (paramView.getAlpha() == 0.0F) {
      i = 1;
    } else {
      i = 0;
    }
    int j = 4;
    if ((i != 0) && (paramView.getVisibility() == 0))
    {
      i = j;
    }
    else
    {
      int k = paramView.getVisibility();
      if (k != 0)
      {
        i = j;
        if (k != 4) {
          if (k == 8) {
            i = 3;
          } else {
            throw new IllegalArgumentException(f.h("Unknown visibility ", k));
          }
        }
      }
      else
      {
        i = 2;
      }
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     x0.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */