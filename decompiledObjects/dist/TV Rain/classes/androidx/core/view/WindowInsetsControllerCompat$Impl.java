package androidx.core.view;

import android.os.CancellationSignal;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;

class WindowInsetsControllerCompat$Impl
{
  public void addOnControllableInsetsChangedListener(WindowInsetsControllerCompat.OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener) {}
  
  public void controlWindowInsetsAnimation(int paramInt, long paramLong, Interpolator paramInterpolator, CancellationSignal paramCancellationSignal, WindowInsetsAnimationControlListenerCompat paramWindowInsetsAnimationControlListenerCompat) {}
  
  public int getSystemBarsBehavior()
  {
    return 0;
  }
  
  public void hide(int paramInt) {}
  
  public boolean isAppearanceLightNavigationBars()
  {
    return false;
  }
  
  public boolean isAppearanceLightStatusBars()
  {
    return false;
  }
  
  public void removeOnControllableInsetsChangedListener(@NonNull WindowInsetsControllerCompat.OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener) {}
  
  public void setAppearanceLightNavigationBars(boolean paramBoolean) {}
  
  public void setAppearanceLightStatusBars(boolean paramBoolean) {}
  
  public void setSystemBarsBehavior(int paramInt) {}
  
  public void show(int paramInt) {}
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */