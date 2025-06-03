package androidx.browser.browseractions;

import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;

class BrowserActionsFallbackMenuUi$2
  implements View.OnClickListener
{
  public BrowserActionsFallbackMenuUi$2(BrowserActionsFallbackMenuUi paramBrowserActionsFallbackMenuUi, TextView paramTextView) {}
  
  public void onClick(View paramView)
  {
    if (TextViewCompat.getMaxLines(val$urlTextView) == Integer.MAX_VALUE)
    {
      val$urlTextView.setMaxLines(1);
      val$urlTextView.setEllipsize(TextUtils.TruncateAt.END);
    }
    else
    {
      val$urlTextView.setMaxLines(Integer.MAX_VALUE);
      val$urlTextView.setEllipsize(null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuUi.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */