package androidx.appcompat.view;

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
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;
import l5;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowCallbackWrapper
  implements Window.Callback
{
  public final Window.Callback mWrapped;
  
  public WindowCallbackWrapper(Window.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      mWrapped = paramCallback;
      return;
    }
    throw new IllegalArgumentException("Window callback may not be null");
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return mWrapped.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return mWrapped.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return mWrapped.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return mWrapped.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return mWrapped.dispatchTouchEvent(paramMotionEvent);
  }
  
  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return mWrapped.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public final Window.Callback getWrapped()
  {
    return mWrapped;
  }
  
  public void onActionModeFinished(ActionMode paramActionMode)
  {
    mWrapped.onActionModeFinished(paramActionMode);
  }
  
  public void onActionModeStarted(ActionMode paramActionMode)
  {
    mWrapped.onActionModeStarted(paramActionMode);
  }
  
  public void onAttachedToWindow()
  {
    mWrapped.onAttachedToWindow();
  }
  
  public void onContentChanged()
  {
    mWrapped.onContentChanged();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return mWrapped.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return mWrapped.onCreatePanelView(paramInt);
  }
  
  public void onDetachedFromWindow()
  {
    mWrapped.onDetachedFromWindow();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return mWrapped.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return mWrapped.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    mWrapped.onPanelClosed(paramInt, paramMenu);
  }
  
  @RequiresApi(26)
  public void onPointerCaptureChanged(boolean paramBoolean)
  {
    Api26Impl.onPointerCaptureChanged(mWrapped, paramBoolean);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return mWrapped.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  @RequiresApi(24)
  public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    Api24Impl.onProvideKeyboardShortcuts(mWrapped, paramList, paramMenu, paramInt);
  }
  
  public boolean onSearchRequested()
  {
    return mWrapped.onSearchRequested();
  }
  
  @RequiresApi(23)
  public boolean onSearchRequested(SearchEvent paramSearchEvent)
  {
    return Api23Impl.onSearchRequested(mWrapped, paramSearchEvent);
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    mWrapped.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    mWrapped.onWindowFocusChanged(paramBoolean);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return mWrapped.onWindowStartingActionMode(paramCallback);
  }
  
  @RequiresApi(23)
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    return Api23Impl.onWindowStartingActionMode(mWrapped, paramCallback, paramInt);
  }
  
  @RequiresApi(23)
  public static class Api23Impl
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
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static void onProvideKeyboardShortcuts(Window.Callback paramCallback, List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
    {
      paramCallback.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static void onPointerCaptureChanged(Window.Callback paramCallback, boolean paramBoolean)
    {
      l5.h(paramCallback, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.WindowCallbackWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */