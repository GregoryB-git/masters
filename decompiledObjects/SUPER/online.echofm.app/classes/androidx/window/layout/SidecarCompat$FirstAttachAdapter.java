package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class SidecarCompat$FirstAttachAdapter
  implements View.OnAttachStateChangeListener
{
  @NotNull
  private final WeakReference<Activity> activityWeakReference;
  @NotNull
  private final SidecarCompat sidecarCompat;
  
  public SidecarCompat$FirstAttachAdapter(@NotNull SidecarCompat paramSidecarCompat, @NotNull Activity paramActivity)
  {
    sidecarCompat = paramSidecarCompat;
    activityWeakReference = new WeakReference(paramActivity);
  }
  
  public void onViewAttachedToWindow(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    paramView.removeOnAttachStateChangeListener(this);
    paramView = (Activity)activityWeakReference.get();
    IBinder localIBinder = SidecarCompat.Companion.getActivityWindowToken$window_release(paramView);
    if (paramView == null) {
      return;
    }
    if (localIBinder == null) {
      return;
    }
    sidecarCompat.register(localIBinder, paramView);
  }
  
  public void onViewDetachedFromWindow(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat.FirstAttachAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */