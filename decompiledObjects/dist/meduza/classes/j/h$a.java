package j;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.SearchEvent;
import android.view.Window.Callback;

public final class h$a
{
  public static boolean a(Window.Callback paramCallback, SearchEvent paramSearchEvent)
  {
    return paramCallback.onSearchRequested(paramSearchEvent);
  }
  
  public static ActionMode b(Window.Callback paramCallback, ActionMode.Callback paramCallback1, int paramInt)
  {
    return paramCallback.onWindowStartingActionMode(paramCallback1, paramInt);
  }
}

/* Location:
 * Qualified Name:     j.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */