package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.SearchEvent;
import android.view.Window.Callback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class WindowCallbackWrapper$Api23Impl
{
  @DoNotInline
  public static boolean onSearchRequested(Window.Callback paramCallback, SearchEvent paramSearchEvent)
  {
    return paramCallback.onSearchRequested(paramSearchEvent);
  }
  
  @DoNotInline
  public static ActionMode onWindowStartingActionMode(Window.Callback paramCallback, ActionMode.Callback paramCallback1, int paramInt)
  {
    return paramCallback.onWindowStartingActionMode(paramCallback1, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.WindowCallbackWrapper.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */