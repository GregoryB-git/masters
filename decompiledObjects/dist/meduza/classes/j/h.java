package j;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import b0.f;
import com.google.android.gms.internal.base.a;
import java.util.List;

public class h
  implements Window.Callback
{
  public final Window.Callback a;
  
  public h(Window.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      a = paramCallback;
      return;
    }
    throw new IllegalArgumentException("Window callback may not be null");
  }
  
  public final boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return a.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return a.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return a.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return a.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return a.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return a.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public final void onActionModeFinished(ActionMode paramActionMode)
  {
    a.onActionModeFinished(paramActionMode);
  }
  
  public final void onActionModeStarted(ActionMode paramActionMode)
  {
    a.onActionModeStarted(paramActionMode);
  }
  
  public final void onAttachedToWindow()
  {
    a.onAttachedToWindow();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return a.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return a.onCreatePanelView(paramInt);
  }
  
  public final void onDetachedFromWindow()
  {
    a.onDetachedFromWindow();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return a.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return a.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    a.onPanelClosed(paramInt, paramMenu);
  }
  
  public final void onPointerCaptureChanged(boolean paramBoolean)
  {
    c.a(a, paramBoolean);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return a.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    b.a(a, paramList, paramMenu, paramInt);
  }
  
  public final boolean onSearchRequested()
  {
    return a.onSearchRequested();
  }
  
  public final boolean onSearchRequested(SearchEvent paramSearchEvent)
  {
    return a.a(a, paramSearchEvent);
  }
  
  public final void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    a.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    a.onWindowFocusChanged(paramBoolean);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    return a.b(a, paramCallback, paramInt);
  }
  
  public static final class a
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
  
  public static final class b
  {
    public static void a(Window.Callback paramCallback, List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
    {
      f.k(paramCallback, paramList, paramMenu, paramInt);
    }
  }
  
  public static final class c
  {
    public static void a(Window.Callback paramCallback, boolean paramBoolean)
    {
      a.t(paramCallback, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     j.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */