package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

class ViewPager$ViewPositionComparator
  implements Comparator<View>
{
  public int compare(View paramView1, View paramView2)
  {
    paramView1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
    paramView2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
    boolean bool = isDecor;
    if (bool != isDecor)
    {
      int i;
      if (bool) {
        i = 1;
      } else {
        i = -1;
      }
      return i;
    }
    return position - position;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.ViewPositionComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */