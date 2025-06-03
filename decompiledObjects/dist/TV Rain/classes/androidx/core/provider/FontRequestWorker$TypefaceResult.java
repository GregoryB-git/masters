package androidx.core.provider;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;

final class FontRequestWorker$TypefaceResult
{
  public final int mResult;
  public final Typeface mTypeface;
  
  public FontRequestWorker$TypefaceResult(int paramInt)
  {
    mTypeface = null;
    mResult = paramInt;
  }
  
  @SuppressLint({"WrongConstant"})
  public FontRequestWorker$TypefaceResult(@NonNull Typeface paramTypeface)
  {
    mTypeface = paramTypeface;
    mResult = 0;
  }
  
  @SuppressLint({"WrongConstant"})
  public boolean isSuccess()
  {
    boolean bool;
    if (mResult == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequestWorker.TypefaceResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */