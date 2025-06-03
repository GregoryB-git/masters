package androidx.core.view;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class WindowCompat$Api16Impl
{
  @DoNotInline
  public static void setDecorFitsSystemWindows(@NonNull Window paramWindow, boolean paramBoolean)
  {
    paramWindow = paramWindow.getDecorView();
    int i = paramWindow.getSystemUiVisibility();
    if (paramBoolean) {
      i &= 0xF8FF;
    } else {
      i |= 0x700;
    }
    paramWindow.setSystemUiVisibility(i);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */