package androidx.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class GhostViewUtils
{
  @Nullable
  public static GhostView addGhost(@NonNull View paramView, @NonNull ViewGroup paramViewGroup, @Nullable Matrix paramMatrix)
  {
    if (Build.VERSION.SDK_INT == 28) {
      return GhostViewPlatform.addGhost(paramView, paramViewGroup, paramMatrix);
    }
    return GhostViewPort.addGhost(paramView, paramViewGroup, paramMatrix);
  }
  
  public static void removeGhost(View paramView)
  {
    if (Build.VERSION.SDK_INT == 28) {
      GhostViewPlatform.removeGhost(paramView);
    } else {
      GhostViewPort.removeGhost(paramView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.GhostViewUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */