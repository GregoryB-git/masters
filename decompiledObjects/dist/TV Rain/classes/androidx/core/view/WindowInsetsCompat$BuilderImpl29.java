package androidx.core.view;

import android.view.WindowInsets.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

@RequiresApi(api=29)
class WindowInsetsCompat$BuilderImpl29
  extends WindowInsetsCompat.BuilderImpl
{
  public final WindowInsets.Builder mPlatBuilder;
  
  public WindowInsetsCompat$BuilderImpl29()
  {
    mPlatBuilder = new WindowInsets.Builder();
  }
  
  public WindowInsetsCompat$BuilderImpl29(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    super(paramWindowInsetsCompat);
    paramWindowInsetsCompat = paramWindowInsetsCompat.toWindowInsets();
    if (paramWindowInsetsCompat != null) {
      paramWindowInsetsCompat = new WindowInsets.Builder(paramWindowInsetsCompat);
    } else {
      paramWindowInsetsCompat = new WindowInsets.Builder();
    }
    mPlatBuilder = paramWindowInsetsCompat;
  }
  
  @NonNull
  public WindowInsetsCompat build()
  {
    applyInsetTypes();
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(mPlatBuilder.build());
    localWindowInsetsCompat.setOverriddenInsets(mInsetsTypeMask);
    return localWindowInsetsCompat;
  }
  
  public void setDisplayCutout(@Nullable DisplayCutoutCompat paramDisplayCutoutCompat)
  {
    WindowInsets.Builder localBuilder = mPlatBuilder;
    if (paramDisplayCutoutCompat != null) {
      paramDisplayCutoutCompat = paramDisplayCutoutCompat.unwrap();
    } else {
      paramDisplayCutoutCompat = null;
    }
    localBuilder.setDisplayCutout(paramDisplayCutoutCompat);
  }
  
  public void setMandatorySystemGestureInsets(@NonNull Insets paramInsets)
  {
    mPlatBuilder.setMandatorySystemGestureInsets(paramInsets.toPlatformInsets());
  }
  
  public void setStableInsets(@NonNull Insets paramInsets)
  {
    mPlatBuilder.setStableInsets(paramInsets.toPlatformInsets());
  }
  
  public void setSystemGestureInsets(@NonNull Insets paramInsets)
  {
    mPlatBuilder.setSystemGestureInsets(paramInsets.toPlatformInsets());
  }
  
  public void setSystemWindowInsets(@NonNull Insets paramInsets)
  {
    mPlatBuilder.setSystemWindowInsets(paramInsets.toPlatformInsets());
  }
  
  public void setTappableElementInsets(@NonNull Insets paramInsets)
  {
    mPlatBuilder.setTappableElementInsets(paramInsets.toPlatformInsets());
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */