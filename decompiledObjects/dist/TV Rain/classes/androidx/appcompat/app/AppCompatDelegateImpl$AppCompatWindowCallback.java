package androidx.appcompat.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.List;

class AppCompatDelegateImpl$AppCompatWindowCallback
  extends WindowCallbackWrapper
{
  private AppCompatDelegateImpl.ActionBarMenuCallback mActionBarCallback;
  private boolean mDispatchKeyEventBypassEnabled;
  private boolean mOnContentChangedBypassEnabled;
  private boolean mOnPanelClosedBypassEnabled;
  
  public AppCompatDelegateImpl$AppCompatWindowCallback(AppCompatDelegateImpl paramAppCompatDelegateImpl, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public boolean bypassDispatchKeyEvent(Window.Callback paramCallback, KeyEvent paramKeyEvent)
  {
    try
    {
      mDispatchKeyEventBypassEnabled = true;
      boolean bool = paramCallback.dispatchKeyEvent(paramKeyEvent);
      return bool;
    }
    finally
    {
      mDispatchKeyEventBypassEnabled = false;
    }
  }
  
  public void bypassOnContentChanged(Window.Callback paramCallback)
  {
    try
    {
      mOnContentChangedBypassEnabled = true;
      paramCallback.onContentChanged();
      return;
    }
    finally
    {
      mOnContentChangedBypassEnabled = false;
    }
  }
  
  public void bypassOnPanelClosed(Window.Callback paramCallback, int paramInt, Menu paramMenu)
  {
    try
    {
      mOnPanelClosedBypassEnabled = true;
      paramCallback.onPanelClosed(paramInt, paramMenu);
      return;
    }
    finally
    {
      mOnPanelClosedBypassEnabled = false;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (mDispatchKeyEventBypassEnabled) {
      return getWrapped().dispatchKeyEvent(paramKeyEvent);
    }
    boolean bool;
    if ((!this$0.dispatchKeyEvent(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!super.dispatchKeyShortcutEvent(paramKeyEvent)) && (!this$0.onKeyShortcut(paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void onContentChanged()
  {
    if (mOnContentChangedBypassEnabled) {
      getWrapped().onContentChanged();
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) && (!(paramMenu instanceof MenuBuilder))) {
      return false;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    Object localObject = mActionBarCallback;
    if (localObject != null)
    {
      localObject = ((AppCompatDelegateImpl.ActionBarMenuCallback)localObject).onCreatePanelView(paramInt);
      if (localObject != null) {
        return (View)localObject;
      }
    }
    return super.onCreatePanelView(paramInt);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    super.onMenuOpened(paramInt, paramMenu);
    this$0.onMenuOpened(paramInt);
    return true;
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (mOnPanelClosedBypassEnabled)
    {
      getWrapped().onPanelClosed(paramInt, paramMenu);
      return;
    }
    super.onPanelClosed(paramInt, paramMenu);
    this$0.onPanelClosed(paramInt);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    MenuBuilder localMenuBuilder;
    if ((paramMenu instanceof MenuBuilder)) {
      localMenuBuilder = (MenuBuilder)paramMenu;
    } else {
      localMenuBuilder = null;
    }
    if ((paramInt == 0) && (localMenuBuilder == null)) {
      return false;
    }
    boolean bool1 = true;
    if (localMenuBuilder != null) {
      localMenuBuilder.setOverrideVisibleItems(true);
    }
    AppCompatDelegateImpl.ActionBarMenuCallback localActionBarMenuCallback = mActionBarCallback;
    if ((localActionBarMenuCallback == null) || (!localActionBarMenuCallback.onPreparePanel(paramInt))) {
      bool1 = false;
    }
    boolean bool2 = bool1;
    if (!bool1) {
      bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
    }
    if (localMenuBuilder != null) {
      localMenuBuilder.setOverrideVisibleItems(false);
    }
    return bool2;
  }
  
  @RequiresApi(24)
  public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    Object localObject = this$0.getPanelState(0, true);
    if (localObject != null)
    {
      localObject = menu;
      if (localObject != null)
      {
        super.onProvideKeyboardShortcuts(paramList, (Menu)localObject, paramInt);
        return;
      }
    }
    super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  @RequiresApi(23)
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    if ((this$0.isHandleNativeActionModesEnabled()) && (paramInt == 0)) {
      return startAsSupportActionMode(paramCallback);
    }
    return super.onWindowStartingActionMode(paramCallback, paramInt);
  }
  
  public void setActionBarCallback(@Nullable AppCompatDelegateImpl.ActionBarMenuCallback paramActionBarMenuCallback)
  {
    mActionBarCallback = paramActionBarMenuCallback;
  }
  
  public final ActionMode startAsSupportActionMode(ActionMode.Callback paramCallback)
  {
    SupportActionModeWrapper.CallbackWrapper localCallbackWrapper = new SupportActionModeWrapper.CallbackWrapper(this$0.mContext, paramCallback);
    paramCallback = this$0.startSupportActionMode(localCallbackWrapper);
    if (paramCallback != null) {
      return localCallbackWrapper.getActionModeWrapper(paramCallback);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */