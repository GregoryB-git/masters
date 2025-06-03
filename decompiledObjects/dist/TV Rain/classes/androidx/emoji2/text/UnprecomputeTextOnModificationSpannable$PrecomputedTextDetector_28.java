package androidx.emoji2.text;

import android.text.PrecomputedText;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;

@RequiresApi(28)
class UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28
  extends UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
{
  public boolean isPrecomputedText(CharSequence paramCharSequence)
  {
    boolean bool;
    if ((!(paramCharSequence instanceof PrecomputedText)) && (!(paramCharSequence instanceof PrecomputedTextCompat))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector_28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */