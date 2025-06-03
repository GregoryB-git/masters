package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Comparator;

class CoordinatorLayout$ViewElevationComparator
  implements Comparator<View>
{
  public int compare(View paramView1, View paramView2)
  {
    float f1 = ViewCompat.getZ(paramView1);
    float f2 = ViewCompat.getZ(paramView2);
    if (f1 > f2) {
      return -1;
    }
    if (f1 < f2) {
      return 1;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.ViewElevationComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */