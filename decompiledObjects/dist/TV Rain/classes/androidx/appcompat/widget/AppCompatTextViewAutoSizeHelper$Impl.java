package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.widget.TextView;

class AppCompatTextViewAutoSizeHelper$Impl
{
  public void computeAndSetTextDirection(StaticLayout.Builder paramBuilder, TextView paramTextView) {}
  
  public boolean isHorizontallyScrollable(TextView paramTextView)
  {
    return ((Boolean)AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(paramTextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */