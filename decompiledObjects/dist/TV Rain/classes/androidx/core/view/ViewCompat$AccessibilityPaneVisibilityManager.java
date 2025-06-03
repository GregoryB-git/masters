package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

class ViewCompat$AccessibilityPaneVisibilityManager
  implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
{
  private final WeakHashMap<View, Boolean> mPanesToVisible = new WeakHashMap();
  
  @RequiresApi(19)
  private void checkPaneVisibility(View paramView, boolean paramBoolean)
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
      ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(paramView, i);
      mPanesToVisible.put(paramView, Boolean.valueOf(bool));
    }
  }
  
  @RequiresApi(19)
  private void registerForLayoutCallback(View paramView)
  {
    paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
  }
  
  @RequiresApi(19)
  private void unregisterForLayoutCallback(View paramView)
  {
    ViewCompat.Api16Impl.removeOnGlobalLayoutListener(paramView.getViewTreeObserver(), this);
  }
  
  @RequiresApi(19)
  public void addAccessibilityPane(View paramView)
  {
    WeakHashMap localWeakHashMap = mPanesToVisible;
    boolean bool;
    if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    localWeakHashMap.put(paramView, Boolean.valueOf(bool));
    paramView.addOnAttachStateChangeListener(this);
    if (ViewCompat.Api19Impl.isAttachedToWindow(paramView)) {
      registerForLayoutCallback(paramView);
    }
  }
  
  @RequiresApi(19)
  public void onGlobalLayout()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Iterator localIterator = mPanesToVisible.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        checkPaneVisibility((View)localEntry.getKey(), ((Boolean)localEntry.getValue()).booleanValue());
      }
    }
  }
  
  @RequiresApi(19)
  public void onViewAttachedToWindow(View paramView)
  {
    registerForLayoutCallback(paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
  
  @RequiresApi(19)
  public void removeAccessibilityPane(View paramView)
  {
    mPanesToVisible.remove(paramView);
    paramView.removeOnAttachStateChangeListener(this);
    unregisterForLayoutCallback(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */