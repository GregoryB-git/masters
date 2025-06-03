package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;

class WindowInsetsCompat$Impl
{
  @NonNull
  public static final WindowInsetsCompat CONSUMED = new WindowInsetsCompat.Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
  public final WindowInsetsCompat mHost;
  
  public WindowInsetsCompat$Impl(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    mHost = paramWindowInsetsCompat;
  }
  
  @NonNull
  public WindowInsetsCompat consumeDisplayCutout()
  {
    return mHost;
  }
  
  @NonNull
  public WindowInsetsCompat consumeStableInsets()
  {
    return mHost;
  }
  
  @NonNull
  public WindowInsetsCompat consumeSystemWindowInsets()
  {
    return mHost;
  }
  
  public void copyRootViewBounds(@NonNull View paramView) {}
  
  public void copyWindowDataInto(@NonNull WindowInsetsCompat paramWindowInsetsCompat) {}
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Impl)) {
      return false;
    }
    paramObject = (Impl)paramObject;
    if ((isRound() != ((Impl)paramObject).isRound()) || (isConsumed() != ((Impl)paramObject).isConsumed()) || (!ObjectsCompat.equals(getSystemWindowInsets(), ((Impl)paramObject).getSystemWindowInsets())) || (!ObjectsCompat.equals(getStableInsets(), ((Impl)paramObject).getStableInsets())) || (!ObjectsCompat.equals(getDisplayCutout(), ((Impl)paramObject).getDisplayCutout()))) {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public DisplayCutoutCompat getDisplayCutout()
  {
    return null;
  }
  
  @NonNull
  public Insets getInsets(int paramInt)
  {
    return Insets.NONE;
  }
  
  @NonNull
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    if ((paramInt & 0x8) == 0) {
      return Insets.NONE;
    }
    throw new IllegalArgumentException("Unable to query the maximum insets for IME");
  }
  
  @NonNull
  public Insets getMandatorySystemGestureInsets()
  {
    return getSystemWindowInsets();
  }
  
  @NonNull
  public Insets getStableInsets()
  {
    return Insets.NONE;
  }
  
  @NonNull
  public Insets getSystemGestureInsets()
  {
    return getSystemWindowInsets();
  }
  
  @NonNull
  public Insets getSystemWindowInsets()
  {
    return Insets.NONE;
  }
  
  @NonNull
  public Insets getTappableElementInsets()
  {
    return getSystemWindowInsets();
  }
  
  public int hashCode()
  {
    return ObjectsCompat.hash(new Object[] { Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout() });
  }
  
  @NonNull
  public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return CONSUMED;
  }
  
  public boolean isConsumed()
  {
    return false;
  }
  
  public boolean isRound()
  {
    return false;
  }
  
  public boolean isVisible(int paramInt)
  {
    return true;
  }
  
  public void setOverriddenInsets(Insets[] paramArrayOfInsets) {}
  
  public void setRootViewData(@NonNull Insets paramInsets) {}
  
  public void setRootWindowInsets(@Nullable WindowInsetsCompat paramWindowInsetsCompat) {}
  
  public void setStableInsets(Insets paramInsets) {}
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */