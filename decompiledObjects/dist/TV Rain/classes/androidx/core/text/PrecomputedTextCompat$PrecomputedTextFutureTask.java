package androidx.core.text;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class PrecomputedTextCompat$PrecomputedTextFutureTask
  extends FutureTask<PrecomputedTextCompat>
{
  public PrecomputedTextCompat$PrecomputedTextFutureTask(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
  {
    super(new PrecomputedTextCallback(paramParams, paramCharSequence));
  }
  
  public static class PrecomputedTextCallback
    implements Callable<PrecomputedTextCompat>
  {
    private PrecomputedTextCompat.Params mParams;
    private CharSequence mText;
    
    public PrecomputedTextCallback(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
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
}

/* Location:
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */