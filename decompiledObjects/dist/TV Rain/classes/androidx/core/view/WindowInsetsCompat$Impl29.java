package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import o5;

@RequiresApi(29)
class WindowInsetsCompat$Impl29
  extends WindowInsetsCompat.Impl28
{
  private Insets mMandatorySystemGestureInsets = null;
  private Insets mSystemGestureInsets = null;
  private Insets mTappableElementInsets = null;
  
  public WindowInsetsCompat$Impl29(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramWindowInsetsCompat, paramWindowInsets);
  }
  
  public WindowInsetsCompat$Impl29(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl29 paramImpl29)
  {
    super(paramWindowInsetsCompat, paramImpl29);
  }
  
  @NonNull
  public Insets getMandatorySystemGestureInsets()
  {
    if (mMandatorySystemGestureInsets == null) {
      mMandatorySystemGestureInsets = Insets.toCompatInsets(o5.n(mPlatformInsets));
    }
    return mMandatorySystemGestureInsets;
  }
  
  @NonNull
  public Insets getSystemGestureInsets()
  {
    if (mSystemGestureInsets == null) {
      mSystemGestureInsets = Insets.toCompatInsets(o5.c(mPlatformInsets));
    }
    return mSystemGestureInsets;
  }
  
  @NonNull
  public Insets getTappableElementInsets()
  {
    if (mTappableElementInsets == null) {
      mTappableElementInsets = Insets.toCompatInsets(o5.k(mPlatformInsets));
    }
    return mTappableElementInsets;
  }
  
  @NonNull
  public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return WindowInsetsCompat.toWindowInsetsCompat(o5.d(mPlatformInsets, paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public void setStableInsets(@Nullable Insets paramInsets) {}
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */