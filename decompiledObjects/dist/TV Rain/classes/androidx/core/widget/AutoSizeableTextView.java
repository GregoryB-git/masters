package androidx.core.widget;

import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface AutoSizeableTextView
{
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    }
    PLATFORM_SUPPORTS_AUTOSIZE = bool;
  }
  
  public abstract int getAutoSizeMaxTextSize();
  
  public abstract int getAutoSizeMinTextSize();
  
  public abstract int getAutoSizeStepGranularity();
  
  public abstract int[] getAutoSizeTextAvailableSizes();
  
  public abstract int getAutoSizeTextType();
  
  public abstract void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException;
  
  public abstract void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] paramArrayOfInt, int paramInt)
    throws IllegalArgumentException;
  
  public abstract void setAutoSizeTextTypeWithDefaults(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.core.widget.AutoSizeableTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */