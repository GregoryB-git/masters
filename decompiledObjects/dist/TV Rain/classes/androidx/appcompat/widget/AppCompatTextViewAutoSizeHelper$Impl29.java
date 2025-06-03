package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class AppCompatTextViewAutoSizeHelper$Impl29
  extends AppCompatTextViewAutoSizeHelper.Impl23
{
  public void computeAndSetTextDirection(StaticLayout.Builder paramBuilder, TextView paramTextView)
  {
    paramBuilder.setTextDirection(e.g(paramTextView));
  }
  
  public boolean isHorizontallyScrollable(TextView paramTextView)
  {
    return e.A(paramTextView);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */