package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

@RequiresApi(30)
class WindowInsetsAnimationControllerCompat$Impl30
  extends WindowInsetsAnimationControllerCompat.Impl
{
  private final WindowInsetsAnimationController mController;
  
  public WindowInsetsAnimationControllerCompat$Impl30(@NonNull WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    mController = paramWindowInsetsAnimationController;
  }
  
  public void finish(boolean paramBoolean)
  {
    mController.finish(paramBoolean);
  }
  
  public float getCurrentAlpha()
  {
    return mController.getCurrentAlpha();
  }
  
  public float getCurrentFraction()
  {
    return mController.getCurrentFraction();
  }
  
  @NonNull
  public Insets getCurrentInsets()
  {
    return Insets.toCompatInsets(mController.getCurrentInsets());
  }
  
  @NonNull
  public Insets getHiddenStateInsets()
  {
    return Insets.toCompatInsets(mController.getHiddenStateInsets());
  }
  
  @NonNull
  public Insets getShownStateInsets()
  {
    return Insets.toCompatInsets(mController.getShownStateInsets());
  }
  
  @SuppressLint({"WrongConstant"})
  public int getTypes()
  {
    return mController.getTypes();
  }
  
  public boolean isCancelled()
  {
    return mController.isCancelled();
  }
  
  public boolean isFinished()
  {
    return mController.isFinished();
  }
  
  public void setInsetsAndAlpha(@Nullable Insets paramInsets, float paramFloat1, float paramFloat2)
  {
    WindowInsetsAnimationController localWindowInsetsAnimationController = mController;
    if (paramInsets == null) {
      paramInsets = null;
    } else {
      paramInsets = paramInsets.toPlatformInsets();
    }
    localWindowInsetsAnimationController.setInsetsAndAlpha(paramInsets, paramFloat1, paramFloat2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationControllerCompat.Impl30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */