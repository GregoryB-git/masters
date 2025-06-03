package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import java.lang.ref.WeakReference;

class AppCompatTextHelper$1
  extends ResourcesCompat.FontCallback
{
  public AppCompatTextHelper$1(AppCompatTextHelper paramAppCompatTextHelper, int paramInt1, int paramInt2, WeakReference paramWeakReference) {}
  
  public void onFontRetrievalFailed(int paramInt) {}
  
  public void onFontRetrieved(@NonNull Typeface paramTypeface)
  {
    Typeface localTypeface = paramTypeface;
    if (Build.VERSION.SDK_INT >= 28)
    {
      int i = val$fontWeight;
      localTypeface = paramTypeface;
      if (i != -1)
      {
        boolean bool;
        if ((val$style & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localTypeface = AppCompatTextHelper.Api28Impl.create(paramTypeface, i, bool);
      }
    }
    this$0.onAsyncTypefaceReceived(val$textViewWeak, localTypeface);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */