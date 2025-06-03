package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import l4;

@RequiresApi(30)
class WindowInsetsCompat$Impl30
  extends WindowInsetsCompat.Impl29
{
  @NonNull
  public static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);
  
  public WindowInsetsCompat$Impl30(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramWindowInsetsCompat, paramWindowInsets);
  }
  
  public WindowInsetsCompat$Impl30(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl30 paramImpl30)
  {
    super(paramWindowInsetsCompat, paramImpl30);
  }
  
  public final void copyRootViewBounds(@NonNull View paramView) {}
  
  @NonNull
  public Insets getInsets(int paramInt)
  {
    return Insets.toCompatInsets(l4.p(mPlatformInsets, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt)));
  }
  
  @NonNull
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    return Insets.toCompatInsets(l4.b(mPlatformInsets, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt)));
  }
  
  public boolean isVisible(int paramInt)
  {
    return l4.o(mPlatformInsets, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt));
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */