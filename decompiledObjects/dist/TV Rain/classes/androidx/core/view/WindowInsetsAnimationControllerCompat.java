package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

public final class WindowInsetsAnimationControllerCompat
{
  private final Impl mImpl;
  
  @RequiresApi(30)
  public WindowInsetsAnimationControllerCompat(@NonNull WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    mImpl = new Impl30(paramWindowInsetsAnimationController);
  }
  
  public void finish(boolean paramBoolean)
  {
    mImpl.finish(paramBoolean);
  }
  
  public float getCurrentAlpha()
  {
    return mImpl.getCurrentAlpha();
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getCurrentFraction()
  {
    return mImpl.getCurrentFraction();
  }
  
  @NonNull
  public Insets getCurrentInsets()
  {
    return mImpl.getCurrentInsets();
  }
  
  @NonNull
  public Insets getHiddenStateInsets()
  {
    return mImpl.getHiddenStateInsets();
  }
  
  @NonNull
  public Insets getShownStateInsets()
  {
    return mImpl.getShownStateInsets();
  }
  
  public int getTypes()
  {
    return mImpl.getTypes();
  }
  
  public boolean isCancelled()
  {
    return mImpl.isCancelled();
  }
  
  public boolean isFinished()
  {
    return mImpl.isFinished();
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((!isFinished()) && (!isCancelled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setInsetsAndAlpha(@Nullable Insets paramInsets, @FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=1.0D) float paramFloat2)
  {
    mImpl.setInsetsAndAlpha(paramInsets, paramFloat1, paramFloat2);
  }
  
  public static class Impl
  {
    public void finish(boolean paramBoolean) {}
    
    public float getCurrentAlpha()
    {
      return 0.0F;
    }
    
    @FloatRange(from=0.0D, to=1.0D)
    public float getCurrentFraction()
    {
      return 0.0F;
    }
    
    @NonNull
    public Insets getCurrentInsets()
    {
      return Insets.NONE;
    }
    
    @NonNull
    public Insets getHiddenStateInsets()
    {
      return Insets.NONE;
    }
    
    @NonNull
    public Insets getShownStateInsets()
    {
      return Insets.NONE;
    }
    
    public int getTypes()
    {
      return 0;
    }
    
    public boolean isCancelled()
    {
      return true;
    }
    
    public boolean isFinished()
    {
      return false;
    }
    
    public void setInsetsAndAlpha(@Nullable Insets paramInsets, @FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=1.0D) float paramFloat2) {}
  }
  
  @RequiresApi(30)
  public static class Impl30
    extends WindowInsetsAnimationControllerCompat.Impl
  {
    private final WindowInsetsAnimationController mController;
    
    public Impl30(@NonNull WindowInsetsAnimationController paramWindowInsetsAnimationController)
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
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationControllerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */