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

public final class WindowInsetsControllerCompat
{
  public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
  public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
  public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
  private final Impl mImpl;
  
  public WindowInsetsControllerCompat(@NonNull Window paramWindow, @NonNull View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      mImpl = new Impl30(paramWindow, this);
    } else if (i >= 26) {
      mImpl = new Impl26(paramWindow, paramView);
    } else {
      mImpl = new Impl23(paramWindow, paramView);
    }
  }
  
  @Deprecated
  @RequiresApi(30)
  private WindowInsetsControllerCompat(@NonNull WindowInsetsController paramWindowInsetsController)
  {
    mImpl = new Impl30(paramWindowInsetsController, this);
  }
  
  @Deprecated
  @NonNull
  @RequiresApi(30)
  public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(@NonNull WindowInsetsController paramWindowInsetsController)
  {
    return new WindowInsetsControllerCompat(paramWindowInsetsController);
  }
  
  public void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener)
  {
    mImpl.addOnControllableInsetsChangedListener(paramOnControllableInsetsChangedListener);
  }
  
  public void controlWindowInsetsAnimation(int paramInt, long paramLong, @Nullable Interpolator paramInterpolator, @Nullable CancellationSignal paramCancellationSignal, @NonNull WindowInsetsAnimationControlListenerCompat paramWindowInsetsAnimationControlListenerCompat)
  {
    mImpl.controlWindowInsetsAnimation(paramInt, paramLong, paramInterpolator, paramCancellationSignal, paramWindowInsetsAnimationControlListenerCompat);
  }
  
  @SuppressLint({"WrongConstant"})
  public int getSystemBarsBehavior()
  {
    return mImpl.getSystemBarsBehavior();
  }
  
  public void hide(int paramInt)
  {
    mImpl.hide(paramInt);
  }
  
  public boolean isAppearanceLightNavigationBars()
  {
    return mImpl.isAppearanceLightNavigationBars();
  }
  
  public boolean isAppearanceLightStatusBars()
  {
    return mImpl.isAppearanceLightStatusBars();
  }
  
  public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener)
  {
    mImpl.removeOnControllableInsetsChangedListener(paramOnControllableInsetsChangedListener);
  }
  
  public void setAppearanceLightNavigationBars(boolean paramBoolean)
  {
    mImpl.setAppearanceLightNavigationBars(paramBoolean);
  }
  
  public void setAppearanceLightStatusBars(boolean paramBoolean)
  {
    mImpl.setAppearanceLightStatusBars(paramBoolean);
  }
  
  public void setSystemBarsBehavior(int paramInt)
  {
    mImpl.setSystemBarsBehavior(paramInt);
  }
  
  public void show(int paramInt)
  {
    mImpl.show(paramInt);
  }
  
  public static class Impl
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
  
  @RequiresApi(20)
  public static class Impl20
    extends WindowInsetsControllerCompat.Impl
  {
    @NonNull
    private final View mView;
    @NonNull
    public final Window mWindow;
    
    public Impl20(@NonNull Window paramWindow, @NonNull View paramView)
    {
      mWindow = paramWindow;
      mView = paramView;
    }
    
    private void hideForType(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt == 8) {
            ((InputMethodManager)mWindow.getContext().getSystemService("input_method")).hideSoftInputFromWindow(mWindow.getDecorView().getWindowToken(), 0);
          }
          return;
        }
        setSystemUiFlag(2);
        return;
      }
      setSystemUiFlag(4);
    }
    
    private void showForType(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt == 8)
          {
            View localView1 = mView;
            if ((!localView1.isInEditMode()) && (!localView1.onCheckIsTextEditor())) {
              localView1 = mWindow.getCurrentFocus();
            } else {
              localView1.requestFocus();
            }
            View localView2 = localView1;
            if (localView1 == null) {
              localView2 = mWindow.findViewById(16908290);
            }
            if ((localView2 != null) && (localView2.hasWindowFocus())) {
              localView2.post(new a(localView2, 0));
            }
          }
          return;
        }
        unsetSystemUiFlag(2);
        return;
      }
      unsetSystemUiFlag(4);
      unsetWindowFlag(1024);
    }
    
    public void addOnControllableInsetsChangedListener(WindowInsetsControllerCompat.OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener) {}
    
    public void controlWindowInsetsAnimation(int paramInt, long paramLong, Interpolator paramInterpolator, CancellationSignal paramCancellationSignal, WindowInsetsAnimationControlListenerCompat paramWindowInsetsAnimationControlListenerCompat) {}
    
    public int getSystemBarsBehavior()
    {
      return 0;
    }
    
    public void hide(int paramInt)
    {
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) != 0) {
          hideForType(i);
        }
        i <<= 1;
      }
    }
    
    public void removeOnControllableInsetsChangedListener(@NonNull WindowInsetsControllerCompat.OnControllableInsetsChangedListener paramOnControllableInsetsChangedListener) {}
    
    public void setSystemBarsBehavior(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt == 2)
          {
            unsetSystemUiFlag(2048);
            setSystemUiFlag(4096);
          }
        }
        else
        {
          unsetSystemUiFlag(4096);
          setSystemUiFlag(2048);
        }
      }
      else {
        unsetSystemUiFlag(6144);
      }
    }
    
    public void setSystemUiFlag(int paramInt)
    {
      View localView = mWindow.getDecorView();
      localView.setSystemUiVisibility(paramInt | localView.getSystemUiVisibility());
    }
    
    public void setWindowFlag(int paramInt)
    {
      mWindow.addFlags(paramInt);
    }
    
    public void show(int paramInt)
    {
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) != 0) {
          showForType(i);
        }
        i <<= 1;
      }
    }
    
    public void unsetSystemUiFlag(int paramInt)
    {
      View localView = mWindow.getDecorView();
      localView.setSystemUiVisibility(paramInt & localView.getSystemUiVisibility());
    }
    
    public void unsetWindowFlag(int paramInt)
    {
      mWindow.clearFlags(paramInt);
    }
  }
  
  @RequiresApi(23)
  public static class Impl23
    extends WindowInsetsControllerCompat.Impl20
  {
    public Impl23(@NonNull Window paramWindow, @Nullable View paramView)
    {
      super(paramView);
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
  
  @RequiresApi(26)
  public static class Impl26
    extends WindowInsetsControllerCompat.Impl23
  {
    public Impl26(@NonNull Window paramWindow, @Nullable View paramView)
    {
      super(paramView);
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
  
  @RequiresApi(30)
  public static class Impl30
    extends WindowInsetsControllerCompat.Impl
  {
    public final WindowInsetsControllerCompat mCompatController;
    public final WindowInsetsController mInsetsController;
    private final SimpleArrayMap<WindowInsetsControllerCompat.OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners = new SimpleArrayMap();
    public Window mWindow;
    
    public Impl30(@NonNull Window paramWindow, @NonNull WindowInsetsControllerCompat paramWindowInsetsControllerCompat)
    {
      this(l4.e(paramWindow), paramWindowInsetsControllerCompat);
      mWindow = paramWindow;
    }
    
    public Impl30(@NonNull WindowInsetsController paramWindowInsetsController, @NonNull WindowInsetsControllerCompat paramWindowInsetsControllerCompat)
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
  
  public static abstract interface OnControllableInsetsChangedListener
  {
    public abstract void onControllableInsetsChanged(@NonNull WindowInsetsControllerCompat paramWindowInsetsControllerCompat, int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */