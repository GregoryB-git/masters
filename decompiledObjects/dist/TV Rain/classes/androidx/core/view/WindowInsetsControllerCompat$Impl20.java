package androidx.core.view;

import android.content.Context;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(20)
class WindowInsetsControllerCompat$Impl20
  extends WindowInsetsControllerCompat.Impl
{
  @NonNull
  private final View mView;
  @NonNull
  public final Window mWindow;
  
  public WindowInsetsControllerCompat$Impl20(@NonNull Window paramWindow, @NonNull View paramView)
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

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl20
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */