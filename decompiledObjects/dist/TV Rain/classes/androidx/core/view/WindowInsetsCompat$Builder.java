package androidx.core.view;

import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

public final class WindowInsetsCompat$Builder
{
  private final WindowInsetsCompat.BuilderImpl mImpl;
  
  public WindowInsetsCompat$Builder()
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      mImpl = new WindowInsetsCompat.BuilderImpl30();
    } else if (i >= 29) {
      mImpl = new WindowInsetsCompat.BuilderImpl29();
    } else {
      mImpl = new WindowInsetsCompat.BuilderImpl20();
    }
  }
  
  public WindowInsetsCompat$Builder(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      mImpl = new WindowInsetsCompat.BuilderImpl30(paramWindowInsetsCompat);
    } else if (i >= 29) {
      mImpl = new WindowInsetsCompat.BuilderImpl29(paramWindowInsetsCompat);
    } else {
      mImpl = new WindowInsetsCompat.BuilderImpl20(paramWindowInsetsCompat);
    }
  }
  
  @NonNull
  public WindowInsetsCompat build()
  {
    return mImpl.build();
  }
  
  @NonNull
  public Builder setDisplayCutout(@Nullable DisplayCutoutCompat paramDisplayCutoutCompat)
  {
    mImpl.setDisplayCutout(paramDisplayCutoutCompat);
    return this;
  }
  
  @NonNull
  public Builder setInsets(int paramInt, @NonNull Insets paramInsets)
  {
    mImpl.setInsets(paramInt, paramInsets);
    return this;
  }
  
  @NonNull
  public Builder setInsetsIgnoringVisibility(int paramInt, @NonNull Insets paramInsets)
  {
    mImpl.setInsetsIgnoringVisibility(paramInt, paramInsets);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setMandatorySystemGestureInsets(@NonNull Insets paramInsets)
  {
    mImpl.setMandatorySystemGestureInsets(paramInsets);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setStableInsets(@NonNull Insets paramInsets)
  {
    mImpl.setStableInsets(paramInsets);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setSystemGestureInsets(@NonNull Insets paramInsets)
  {
    mImpl.setSystemGestureInsets(paramInsets);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setSystemWindowInsets(@NonNull Insets paramInsets)
  {
    mImpl.setSystemWindowInsets(paramInsets);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setTappableElementInsets(@NonNull Insets paramInsets)
  {
    mImpl.setTappableElementInsets(paramInsets);
    return this;
  }
  
  @NonNull
  public Builder setVisible(int paramInt, boolean paramBoolean)
  {
    mImpl.setVisible(paramInt, paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */