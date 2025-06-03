package androidx.core.text;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

class PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback
  implements Callable<PrecomputedTextCompat>
{
  private PrecomputedTextCompat.Params mParams;
  private CharSequence mText;
  
  public PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
  {
    mParams = paramParams;
    mText = paramCharSequence;
  }
  
  public PrecomputedTextCompat call()
    throws Exception
  {
    return PrecomputedTextCompat.create(mText, mParams);
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */