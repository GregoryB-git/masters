package androidx.core.view;

import android.view.WindowInsetsAnimation.Bounds;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import z2;

public final class WindowInsetsAnimationCompat$BoundsCompat
{
  private final Insets mLowerBound;
  private final Insets mUpperBound;
  
  @RequiresApi(30)
  private WindowInsetsAnimationCompat$BoundsCompat(@NonNull WindowInsetsAnimation.Bounds paramBounds)
  {
    mLowerBound = WindowInsetsAnimationCompat.Impl30.getLowerBounds(paramBounds);
    mUpperBound = WindowInsetsAnimationCompat.Impl30.getHigherBounds(paramBounds);
  }
  
  public WindowInsetsAnimationCompat$BoundsCompat(@NonNull Insets paramInsets1, @NonNull Insets paramInsets2)
  {
    mLowerBound = paramInsets1;
    mUpperBound = paramInsets2;
  }
  
  @NonNull
  @RequiresApi(30)
  public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds paramBounds)
  {
    return new BoundsCompat(paramBounds);
  }
  
  @NonNull
  public Insets getLowerBound()
  {
    return mLowerBound;
  }
  
  @NonNull
  public Insets getUpperBound()
  {
    return mUpperBound;
  }
  
  @NonNull
  public BoundsCompat inset(@NonNull Insets paramInsets)
  {
    return new BoundsCompat(WindowInsetsCompat.insetInsets(mLowerBound, left, top, right, bottom), WindowInsetsCompat.insetInsets(mUpperBound, left, top, right, bottom));
  }
  
  @NonNull
  @RequiresApi(30)
  public WindowInsetsAnimation.Bounds toBounds()
  {
    return WindowInsetsAnimationCompat.Impl30.createPlatformBounds(this);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Bounds{lower=");
    localStringBuilder.append(mLowerBound);
    localStringBuilder.append(" upper=");
    localStringBuilder.append(mUpperBound);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */