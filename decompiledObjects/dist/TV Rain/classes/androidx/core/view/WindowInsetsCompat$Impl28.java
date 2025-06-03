package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import m5;

@RequiresApi(28)
class WindowInsetsCompat$Impl28
  extends WindowInsetsCompat.Impl21
{
  public WindowInsetsCompat$Impl28(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramWindowInsetsCompat, paramWindowInsets);
  }
  
  public WindowInsetsCompat$Impl28(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl28 paramImpl28)
  {
    super(paramWindowInsetsCompat, paramImpl28);
  }
  
  @NonNull
  public WindowInsetsCompat consumeDisplayCutout()
  {
    return WindowInsetsCompat.toWindowInsetsCompat(m5.g(mPlatformInsets));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Impl28)) {
      return false;
    }
    paramObject = (Impl28)paramObject;
    if ((!Objects.equals(mPlatformInsets, mPlatformInsets)) || (!Objects.equals(mRootViewVisibleInsets, mRootViewVisibleInsets))) {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public DisplayCutoutCompat getDisplayCutout()
  {
    return DisplayCutoutCompat.wrap(m5.d(mPlatformInsets));
  }
  
  public int hashCode()
  {
    return mPlatformInsets.hashCode();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */