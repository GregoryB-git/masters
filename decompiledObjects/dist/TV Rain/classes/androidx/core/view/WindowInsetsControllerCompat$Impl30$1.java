package androidx.core.view;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class WindowInsetsControllerCompat$Impl30$1
  implements WindowInsetsAnimationControlListener
{
  private WindowInsetsAnimationControllerCompat mCompatAnimController = null;
  
  public WindowInsetsControllerCompat$Impl30$1(WindowInsetsControllerCompat.Impl30 paramImpl30, WindowInsetsAnimationControlListenerCompat paramWindowInsetsAnimationControlListenerCompat) {}
  
  public void onCancelled(@Nullable WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    WindowInsetsAnimationControlListenerCompat localWindowInsetsAnimationControlListenerCompat = val$listener;
    if (paramWindowInsetsAnimationController == null) {
      paramWindowInsetsAnimationController = null;
    } else {
      paramWindowInsetsAnimationController = mCompatAnimController;
    }
    localWindowInsetsAnimationControlListenerCompat.onCancelled(paramWindowInsetsAnimationController);
  }
  
  public void onFinished(@NonNull WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    val$listener.onFinished(mCompatAnimController);
  }
  
  public void onReady(@NonNull WindowInsetsAnimationController paramWindowInsetsAnimationController, int paramInt)
  {
    paramWindowInsetsAnimationController = new WindowInsetsAnimationControllerCompat(paramWindowInsetsAnimationController);
    mCompatAnimController = paramWindowInsetsAnimationController;
    val$listener.onReady(paramWindowInsetsAnimationController, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl30.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */