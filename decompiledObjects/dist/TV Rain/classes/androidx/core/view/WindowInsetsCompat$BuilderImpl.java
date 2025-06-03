package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

class WindowInsetsCompat$BuilderImpl
{
  private final WindowInsetsCompat mInsets;
  public Insets[] mInsetsTypeMask;
  
  public WindowInsetsCompat$BuilderImpl()
  {
    this(new WindowInsetsCompat(null));
  }
  
  public WindowInsetsCompat$BuilderImpl(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    mInsets = paramWindowInsetsCompat;
  }
  
  public final void applyInsetTypes()
  {
    Object localObject1 = mInsetsTypeMask;
    if (localObject1 != null)
    {
      Object localObject2 = localObject1[WindowInsetsCompat.Type.indexOf(1)];
      Object localObject3 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(2)];
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = mInsets.getInsets(2);
      }
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = mInsets.getInsets(1);
      }
      setSystemWindowInsets(Insets.max((Insets)localObject3, (Insets)localObject1));
      localObject1 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(16)];
      if (localObject1 != null) {
        setSystemGestureInsets((Insets)localObject1);
      }
      localObject1 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(32)];
      if (localObject1 != null) {
        setMandatorySystemGestureInsets((Insets)localObject1);
      }
      localObject1 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(64)];
      if (localObject1 != null) {
        setTappableElementInsets((Insets)localObject1);
      }
    }
  }
  
  @NonNull
  public WindowInsetsCompat build()
  {
    applyInsetTypes();
    return mInsets;
  }
  
  public void setDisplayCutout(@Nullable DisplayCutoutCompat paramDisplayCutoutCompat) {}
  
  public void setInsets(int paramInt, @NonNull Insets paramInsets)
  {
    if (mInsetsTypeMask == null) {
      mInsetsTypeMask = new Insets[9];
    }
    int i = 1;
    while (i <= 256)
    {
      if ((paramInt & i) != 0) {
        mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(i)] = paramInsets;
      }
      i <<= 1;
    }
  }
  
  public void setInsetsIgnoringVisibility(int paramInt, @NonNull Insets paramInsets)
  {
    if (paramInt != 8) {
      return;
    }
    throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
  }
  
  public void setMandatorySystemGestureInsets(@NonNull Insets paramInsets) {}
  
  public void setStableInsets(@NonNull Insets paramInsets) {}
  
  public void setSystemGestureInsets(@NonNull Insets paramInsets) {}
  
  public void setSystemWindowInsets(@NonNull Insets paramInsets) {}
  
  public void setTappableElementInsets(@NonNull Insets paramInsets) {}
  
  public void setVisible(int paramInt, boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */