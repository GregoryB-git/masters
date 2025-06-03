package I;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class s$e
  implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
{
  public final WeakHashMap o = new WeakHashMap();
  
  public final void a(View paramView, boolean paramBoolean)
  {
    boolean bool;
    if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    if (paramBoolean != bool)
    {
      int i;
      if (bool) {
        i = 16;
      } else {
        i = 32;
      }
      s.v(paramView, i);
      o.put(paramView, Boolean.valueOf(bool));
    }
  }
  
  public final void b(View paramView)
  {
    paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
  }
  
  public void onGlobalLayout()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Iterator localIterator = o.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        a((View)localEntry.getKey(), ((Boolean)localEntry.getValue()).booleanValue());
      }
    }
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    b(paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     I.s.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */