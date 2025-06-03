package e0;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class d0$a
  implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
{
  public final WeakHashMap<View, Boolean> a = new WeakHashMap();
  
  public final void onGlobalLayout()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        View localView = (View)localEntry.getKey();
        boolean bool1 = ((Boolean)localEntry.getValue()).booleanValue();
        boolean bool2;
        if ((localView.isShown()) && (localView.getWindowVisibility() == 0)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        if (bool1 != bool2)
        {
          int i;
          if (bool2) {
            i = 16;
          } else {
            i = 32;
          }
          d0.e(i, localView);
          localEntry.setValue(Boolean.valueOf(bool2));
        }
      }
    }
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
  }
  
  public final void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     e0.d0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */