package androidx.core.view;

import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class WindowInsetsControllerCompat$Impl23
  extends WindowInsetsControllerCompat.Impl20
{
  public WindowInsetsControllerCompat$Impl23(@NonNull Window paramWindow, @Nullable View paramView)
  {
    super(paramWindow, paramView);
  }
  
  public boolean isAppearanceLightStatusBars()
  {
    boolean bool;
    if ((mWindow.getDecorView().getSystemUiVisibility() & 0x2000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setAppearanceLightStatusBars(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      unsetWindowFlag(67108864);
      setWindowFlag(Integer.MIN_VALUE);
      setSystemUiFlag(8192);
    }
    else
    {
      unsetSystemUiFlag(8192);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */