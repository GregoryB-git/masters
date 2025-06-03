package androidx.appcompat.view;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window.Callback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(24)
class WindowCallbackWrapper$Api24Impl
{
  @DoNotInline
  public static void onProvideKeyboardShortcuts(Window.Callback paramCallback, List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    paramCallback.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.WindowCallbackWrapper.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */