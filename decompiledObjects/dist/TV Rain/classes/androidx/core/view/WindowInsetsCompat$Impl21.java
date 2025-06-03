package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

@RequiresApi(21)
class WindowInsetsCompat$Impl21
  extends WindowInsetsCompat.Impl20
{
  private Insets mStableInsets = null;
  
  public WindowInsetsCompat$Impl21(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramWindowInsetsCompat, paramWindowInsets);
  }
  
  public WindowInsetsCompat$Impl21(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl21 paramImpl21)
  {
    super(paramWindowInsetsCompat, paramImpl21);
    mStableInsets = mStableInsets;
  }
  
  @NonNull
  public WindowInsetsCompat consumeStableInsets()
  {
    return WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets.consumeStableInsets());
  }
  
  @NonNull
  public WindowInsetsCompat consumeSystemWindowInsets()
  {
    return WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets.consumeSystemWindowInsets());
  }
  
  @NonNull
  public final Insets getStableInsets()
  {
    if (mStableInsets == null) {
      mStableInsets = Insets.of(mPlatformInsets.getStableInsetLeft(), mPlatformInsets.getStableInsetTop(), mPlatformInsets.getStableInsetRight(), mPlatformInsets.getStableInsetBottom());
    }
    return mStableInsets;
  }
  
  public boolean isConsumed()
  {
    return mPlatformInsets.isConsumed();
  }
  
  public void setStableInsets(@Nullable Insets paramInsets)
  {
    mStableInsets = paramInsets;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */