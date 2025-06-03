package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;

class CallbackWithHandler
{
  @NonNull
  private final FontsContractCompat.FontRequestCallback mCallback;
  @NonNull
  private final Handler mCallbackHandler;
  
  public CallbackWithHandler(@NonNull FontsContractCompat.FontRequestCallback paramFontRequestCallback)
  {
    mCallback = paramFontRequestCallback;
    mCallbackHandler = CalleeHandler.create();
  }
  
  public CallbackWithHandler(@NonNull FontsContractCompat.FontRequestCallback paramFontRequestCallback, @NonNull Handler paramHandler)
  {
    mCallback = paramFontRequestCallback;
    mCallbackHandler = paramHandler;
  }
  
  private void onTypefaceRequestFailed(final int paramInt)
  {
    final FontsContractCompat.FontRequestCallback localFontRequestCallback = mCallback;
    mCallbackHandler.post(new Runnable()
    {
      public void run()
      {
        localFontRequestCallback.onTypefaceRequestFailed(paramInt);
      }
    });
  }
  
  private void onTypefaceRetrieved(@NonNull final Typeface paramTypeface)
  {
    final FontsContractCompat.FontRequestCallback localFontRequestCallback = mCallback;
    mCallbackHandler.post(new Runnable()
    {
      public void run()
      {
        localFontRequestCallback.onTypefaceRetrieved(paramTypeface);
      }
    });
  }
  
  public void onTypefaceResult(@NonNull FontRequestWorker.TypefaceResult paramTypefaceResult)
  {
    if (paramTypefaceResult.isSuccess()) {
      onTypefaceRetrieved(mTypeface);
    } else {
      onTypefaceRequestFailed(mResult);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.CallbackWithHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */