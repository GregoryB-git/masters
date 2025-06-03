package androidx.core.view;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import m5;

@RequiresApi(28)
class WindowCompat$Api28Impl
{
  @DoNotInline
  public static <T> T requireViewById(Window paramWindow, int paramInt)
  {
    return m5.f(paramWindow, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */