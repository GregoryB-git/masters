package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.WindowInsetsController.OnControllableInsetsChangedListener;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import l4;

@RequiresApi(30)
class WindowInsetsControllerCompat$Impl30
  extends WindowInsetsControllerCompat.Impl
{
  public final WindowInsetsControllerCompat mCompatController;
  public final WindowInsetsController mInsetsController;
  private final SimpleArrayMap<WindowInsetsControllerCompat.OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners = new SimpleArrayMap();
  public Window mWindow;
  
  public WindowInsetsControllerCompat$Impl30(@NonNull Window paramWindow, @NonNull WindowInsetsControllerCompat paramWindowInsetsControllerCompat)
  {
    this(l4.e(paramWindow), paramWindowInsetsControllerCompat);
    mWindow = paramWindow;
  }
  
  public WindowInsetsControllerCompat$Impl30(@NonNull WindowInsetsController paramWindowInsetsController, @NonNull WindowInsetsControllerCompat paramWindowInsetsControllerCompat)
  {
    mInsetsController = paramWindowInsetsController;
    mCompatController = paramWindowInsetsControllerCompat;
  }
  
  public void addOnControllableInsetsChangedListener(@NonNull WindowInsetsControllerCompat.OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener)
  {
    if (mListeners.containsKey(paramOnControllableInsetsChangedListener)) {
      return;
    }
    b localb = new b(this, paramOnControllableInsetsChangedListener);
    mListeners.put(paramOnControllableInsetsChangedListener, localb);
    mInsetsController.addOnControllableInsetsChangedListener(localb);
  }
  
  public void controlWindowInsetsAnimation(int paramInt, long paramLong, @Nullable Interpolator paramInterpolator, @Nullable CancellationSignal paramCancellationSignal, @NonNull final WindowInsetsAnimationControlListenerCompat paramWindowInsetsAnimationControlListenerCompat)
  {
    paramWindowInsetsAnimationControlListenerCompat = new WindowInsetsAnimationControlListener()
    {
      private WindowInsetsAnimationControllerCompat mCompatAnimController = null;
      
      public void onCancelled(@Nullable WindowInsetsAnimationController paramAnonymousWindowInsetsAnimationController)
      {
        WindowInsetsAnimationControlListenerCompat localWindowInsetsAnimationControlListenerCompat = paramWindowInsetsAnimationControlListenerCompat;
        if (paramAnonymousWindowInsetsAnimationController == null) {
          paramAnonymousWindowInsetsAnimationController = null;
        } else {
          paramAnonymousWindowInsetsAnimationController = mCompatAnimController;
        }
        localWindowInsetsAnimationControlListenerCompat.onCancelled(paramAnonymousWindowInsetsAnimationController);
      }
      
      public void onFinished(@NonNull WindowInsetsAnimationController paramAnonymousWindowInsetsAnimationController)
      {
        paramWindowInsetsAnimationControlListenerCompat.onFinished(mCompatAnimController);
      }
      
      public void onReady(@NonNull WindowInsetsAnimationController paramAnonymousWindowInsetsAnimationController, int paramAnonymousInt)
      {
        paramAnonymousWindowInsetsAnimationController = new WindowInsetsAnimationControllerCompat(paramAnonymousWindowInsetsAnimationController);
        mCompatAnimController = paramAnonymousWindowInsetsAnimationController;
        paramWindowInsetsAnimationControlListenerCompat.onReady(paramAnonymousWindowInsetsAnimationController, paramAnonymousInt);
      }
    };
    mInsetsController.controlWindowInsetsAnimation(paramInt, paramLong, paramInterpolator, paramCancellationSignal, paramWindowInsetsAnimationControlListenerCompat);
  }
  
  @SuppressLint({"WrongConstant"})
  public int getSystemBarsBehavior()
  {
    return mInsetsController.getSystemBarsBehavior();
  }
  
  public void hide(int paramInt)
  {
    mInsetsController.hide(paramInt);
  }
  
  public boolean isAppearanceLightNavigationBars()
  {
    boolean bool;
    if ((mInsetsController.getSystemBarsAppearance() & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAppearanceLightStatusBars()
  {
    boolean bool;
    if ((mInsetsController.getSystemBarsAppearance() & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void removeOnControllableInsetsChangedListener(@NonNull WindowInsetsControllerCompat.OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener)
  {
    paramOnControllableInsetsChangedListener = (WindowInsetsController.OnControllableInsetsChangedListener)mListeners.remove(paramOnControllableInsetsChangedListener);
    if (paramOnControllableInsetsChangedListener != null) {
      mInsetsController.removeOnControllableInsetsChangedListener(paramOnControllableInsetsChangedListener);
    }
  }
  
  public void setAppearanceLightNavigationBars(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (mWindow != null) {
        setSystemUiFlag(16);
      }
      mInsetsController.setSystemBarsAppearance(16, 16);
    }
    else
    {
      if (mWindow != null) {
        unsetSystemUiFlag(16);
      }
      mInsetsController.setSystemBarsAppearance(0, 16);
    }
  }
  
  public void setAppearanceLightStatusBars(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (mWindow != null) {
        setSystemUiFlag(8192);
      }
      mInsetsController.setSystemBarsAppearance(8, 8);
    }
    else
    {
      if (mWindow != null) {
        unsetSystemUiFlag(8192);
      }
      mInsetsController.setSystemBarsAppearance(0, 8);
    }
  }
  
  public void setSystemBarsBehavior(int paramInt)
  {
    mInsetsController.setSystemBarsBehavior(paramInt);
  }
  
  public void setSystemUiFlag(int paramInt)
  {
    View localView = mWindow.getDecorView();
    localView.setSystemUiVisibility(paramInt | localView.getSystemUiVisibility());
  }
  
  public void show(int paramInt)
  {
    Window localWindow = mWindow;
    if ((localWindow != null) && ((paramInt & 0x8) != 0) && (Build.VERSION.SDK_INT < 32)) {
      ((InputMethodManager)localWindow.getContext().getSystemService("input_method")).isActive();
    }
    mInsetsController.show(paramInt);
  }
  
  public void unsetSystemUiFlag(int paramInt)
  {
    View localView = mWindow.getDecorView();
    localView.setSystemUiVisibility(paramInt & localView.getSystemUiVisibility());
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */