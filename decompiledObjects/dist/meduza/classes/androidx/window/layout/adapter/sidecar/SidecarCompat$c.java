package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import ec.i;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class SidecarCompat$c
  implements View.OnAttachStateChangeListener
{
  public final SidecarCompat a;
  public final WeakReference<Activity> b;
  
  public SidecarCompat$c(SidecarCompat paramSidecarCompat, Activity paramActivity)
  {
    a = paramSidecarCompat;
    b = new WeakReference(paramActivity);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    i.e(paramView, "view");
    paramView.removeOnAttachStateChangeListener(this);
    Activity localActivity = (Activity)b.get();
    if (localActivity != null)
    {
      paramView = localActivity.getWindow();
      if (paramView != null)
      {
        paramView = paramView.getAttributes();
        if (paramView != null)
        {
          paramView = token;
          break label54;
        }
      }
    }
    paramView = null;
    label54:
    if (localActivity == null) {
      return;
    }
    if (paramView == null) {
      return;
    }
    a.i(paramView, localActivity);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    i.e(paramView, "view");
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.SidecarCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */