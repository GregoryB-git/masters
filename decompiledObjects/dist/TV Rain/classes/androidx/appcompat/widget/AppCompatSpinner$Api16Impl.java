package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
final class AppCompatSpinner$Api16Impl
{
  @DoNotInline
  public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver paramViewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */