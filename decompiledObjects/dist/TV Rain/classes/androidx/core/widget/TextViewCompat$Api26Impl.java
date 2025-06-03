package androidx.core.widget;

import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import b;
import p3;

@RequiresApi(26)
class TextViewCompat$Api26Impl
{
  @DoNotInline
  public static int getAutoSizeMaxTextSize(TextView paramTextView)
  {
    return p3.z(paramTextView);
  }
  
  @DoNotInline
  public static int getAutoSizeMinTextSize(TextView paramTextView)
  {
    return p3.D(paramTextView);
  }
  
  @DoNotInline
  public static int getAutoSizeStepGranularity(TextView paramTextView)
  {
    return b.g(paramTextView);
  }
  
  @DoNotInline
  public static int[] getAutoSizeTextAvailableSizes(TextView paramTextView)
  {
    return p3.x(paramTextView);
  }
  
  @DoNotInline
  public static int getAutoSizeTextType(TextView paramTextView)
  {
    return p3.b(paramTextView);
  }
  
  @DoNotInline
  public static void setAutoSizeTextTypeUniformWithConfiguration(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b.r(paramTextView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @DoNotInline
  public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView paramTextView, int[] paramArrayOfInt, int paramInt)
  {
    b.s(paramTextView, paramArrayOfInt, paramInt);
  }
  
  @DoNotInline
  public static void setAutoSizeTextTypeWithDefaults(TextView paramTextView, int paramInt)
  {
    p3.r(paramTextView, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */