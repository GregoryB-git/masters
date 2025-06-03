package androidx.appcompat.widget;

import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import b;

@RequiresApi(26)
class AppCompatTextHelper$Api26Impl
{
  @DoNotInline
  public static int getAutoSizeStepGranularity(TextView paramTextView)
  {
    return b.g(paramTextView);
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
  public static boolean setFontVariationSettings(TextView paramTextView, String paramString)
  {
    return b.w(paramTextView, paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */