package androidx.core.view;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

class WindowInsetsAnimationControllerCompat$Impl
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

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */