package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import l4;

@RequiresApi(30)
class WindowInsetsCompat$BuilderImpl30
  extends WindowInsetsCompat.BuilderImpl29
{
  public WindowInsetsCompat$BuilderImpl30() {}
  
  public WindowInsetsCompat$BuilderImpl30(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    super(paramWindowInsetsCompat);
  }
  
  public void setInsets(int paramInt, @NonNull Insets paramInsets)
  {
    l4.q(mPlatBuilder, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramInsets.toPlatformInsets());
  }
  
  public void setInsetsIgnoringVisibility(int paramInt, @NonNull Insets paramInsets)
  {
    l4.m(mPlatBuilder, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramInsets.toPlatformInsets());
  }
  
  public void setVisible(int paramInt, boolean paramBoolean)
  {
    l4.n(mPlatBuilder, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */