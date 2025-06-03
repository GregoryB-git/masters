package androidx.core.content.res;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import c4;
import q5;

public abstract class ResourcesCompat$FontCallback
{
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Handler getHandler(@Nullable Handler paramHandler)
  {
    Handler localHandler = paramHandler;
    if (paramHandler == null) {
      localHandler = new Handler(Looper.getMainLooper());
    }
    return localHandler;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public final void callbackFailAsync(int paramInt, @Nullable Handler paramHandler)
  {
    getHandler(paramHandler).post(new c4(this, paramInt, 0));
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public final void callbackSuccessAsync(@NonNull Typeface paramTypeface, @Nullable Handler paramHandler)
  {
    getHandler(paramHandler).post(new q5(this, paramTypeface, 1));
  }
  
  public abstract void onFontRetrievalFailed(int paramInt);
  
  public abstract void onFontRetrieved(@NonNull Typeface paramTypeface);
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.FontCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */