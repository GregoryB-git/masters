package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public abstract class WindowInsetsAnimationCompat$Callback
{
  public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
  public static final int DISPATCH_MODE_STOP = 0;
  public WindowInsets mDispachedInsets;
  private final int mDispatchMode;
  
  public WindowInsetsAnimationCompat$Callback(int paramInt)
  {
    mDispatchMode = paramInt;
  }
  
  public final int getDispatchMode()
  {
    return mDispatchMode;
  }
  
  public void onEnd(@NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
  
  public void onPrepare(@NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
  
  @NonNull
  public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> paramList);
  
  @NonNull
  public WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
  {
    return paramBoundsCompat;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static @interface DispatchMode {}
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */