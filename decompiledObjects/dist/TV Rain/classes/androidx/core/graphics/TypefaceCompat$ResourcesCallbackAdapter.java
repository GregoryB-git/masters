package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontsContractCompat.FontRequestCallback;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class TypefaceCompat$ResourcesCallbackAdapter
  extends FontsContractCompat.FontRequestCallback
{
  @Nullable
  private ResourcesCompat.FontCallback mFontCallback;
  
  public TypefaceCompat$ResourcesCallbackAdapter(@Nullable ResourcesCompat.FontCallback paramFontCallback)
  {
    mFontCallback = paramFontCallback;
  }
  
  public void onTypefaceRequestFailed(int paramInt)
  {
    ResourcesCompat.FontCallback localFontCallback = mFontCallback;
    if (localFontCallback != null) {
      localFontCallback.onFontRetrievalFailed(paramInt);
    }
  }
  
  public void onTypefaceRetrieved(@NonNull Typeface paramTypeface)
  {
    ResourcesCompat.FontCallback localFontCallback = mFontCallback;
    if (localFontCallback != null) {
      localFontCallback.onFontRetrieved(paramTypeface);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */