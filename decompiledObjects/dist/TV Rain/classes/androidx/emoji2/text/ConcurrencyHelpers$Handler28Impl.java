package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class ConcurrencyHelpers$Handler28Impl
{
  @DoNotInline
  public static Handler createAsync(Looper paramLooper)
  {
    return c.g(paramLooper);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.ConcurrencyHelpers.Handler28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */