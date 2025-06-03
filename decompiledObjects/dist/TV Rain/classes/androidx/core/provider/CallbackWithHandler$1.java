package androidx.core.provider;

import android.graphics.Typeface;

class CallbackWithHandler$1
  implements Runnable
{
  public CallbackWithHandler$1(CallbackWithHandler paramCallbackWithHandler, FontsContractCompat.FontRequestCallback paramFontRequestCallback, Typeface paramTypeface) {}
  
  public void run()
  {
    val$callback.onTypefaceRetrieved(val$typeface);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.CallbackWithHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */