package androidx.core.view;

import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class WindowInsetsControllerCompat$Impl26
  extends WindowInsetsControllerCompat.Impl23
{
  public WindowInsetsControllerCompat$Impl26(@NonNull Window paramWindow, @Nullable View paramView)
  {
    super(paramWindow, paramView);
  }
  
  public boolean isAppearanceLightNavigationBars()
  {
    boolean bool;
    if ((mWindow.getDecorView().getSystemUiVisibility() & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setAppearanceLightNavigationBars(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      unsetWindowFlag(134217728);
      setWindowFlag(Integer.MIN_VALUE);
      setSystemUiFlag(16);
    }
    else
    {
      unsetSystemUiFlag(16);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */