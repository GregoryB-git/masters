package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class KeyEventDispatcher
{
  private static boolean sActionBarFieldsFetched = false;
  private static Method sActionBarOnMenuKeyMethod;
  private static boolean sDialogFieldsFetched = false;
  private static Field sDialogKeyListenerField;
  
  private static boolean actionBarOnMenuKeyEventPre28(ActionBar paramActionBar, KeyEvent paramKeyEvent)
  {
    if (!sActionBarFieldsFetched) {}
    try
    {
      sActionBarOnMenuKeyMethod = paramActionBar.getClass().getMethod("onMenuKeyEvent", new Class[] { KeyEvent.class });
      sActionBarFieldsFetched = true;
      Method localMethod = sActionBarOnMenuKeyMethod;
      if (localMethod != null) {}
      try
      {
        paramActionBar = localMethod.invoke(paramActionBar, new Object[] { paramKeyEvent });
        if (paramActionBar == null) {
          return false;
        }
        boolean bool = ((Boolean)paramActionBar).booleanValue();
        return bool;
      }
      catch (IllegalAccessException|InvocationTargetException paramActionBar)
      {
        for (;;) {}
      }
      return false;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  private static boolean activitySuperDispatchKeyEventPre28(Activity paramActivity, KeyEvent paramKeyEvent)
  {
    paramActivity.onUserInteraction();
    Object localObject = paramActivity.getWindow();
    if (((Window)localObject).hasFeature(8))
    {
      ActionBar localActionBar = paramActivity.getActionBar();
      if ((paramKeyEvent.getKeyCode() == 82) && (localActionBar != null) && (actionBarOnMenuKeyEventPre28(localActionBar, paramKeyEvent))) {
        return true;
      }
    }
    if (((Window)localObject).superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    localObject = ((Window)localObject).getDecorView();
    if (ViewCompat.dispatchUnhandledKeyEventBeforeCallback((View)localObject, paramKeyEvent)) {
      return true;
    }
    if (localObject != null) {
      localObject = ((View)localObject).getKeyDispatcherState();
    } else {
      localObject = null;
    }
    return paramKeyEvent.dispatch(paramActivity, (KeyEvent.DispatcherState)localObject, paramActivity);
  }
  
  private static boolean dialogSuperDispatchKeyEventPre28(Dialog paramDialog, KeyEvent paramKeyEvent)
  {
    Object localObject = getDialogKeyListenerPre28(paramDialog);
    if ((localObject != null) && (((DialogInterface.OnKeyListener)localObject).onKey(paramDialog, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      return true;
    }
    localObject = paramDialog.getWindow();
    if (((Window)localObject).superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    localObject = ((Window)localObject).getDecorView();
    if (ViewCompat.dispatchUnhandledKeyEventBeforeCallback((View)localObject, paramKeyEvent)) {
      return true;
    }
    if (localObject != null) {
      localObject = ((View)localObject).getKeyDispatcherState();
    } else {
      localObject = null;
    }
    return paramKeyEvent.dispatch(paramDialog, (KeyEvent.DispatcherState)localObject, paramDialog);
  }
  
  public static boolean dispatchBeforeHierarchy(@NonNull View paramView, @NonNull KeyEvent paramKeyEvent)
  {
    return ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(paramView, paramKeyEvent);
  }
  
  @SuppressLint({"LambdaLast"})
  public static boolean dispatchKeyEvent(@NonNull Component paramComponent, @Nullable View paramView, @Nullable Window.Callback paramCallback, @NonNull KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (paramComponent == null) {
      return false;
    }
    if (Build.VERSION.SDK_INT >= 28) {
      return paramComponent.superDispatchKeyEvent(paramKeyEvent);
    }
    if ((paramCallback instanceof Activity)) {
      return activitySuperDispatchKeyEventPre28((Activity)paramCallback, paramKeyEvent);
    }
    if ((paramCallback instanceof Dialog)) {
      return dialogSuperDispatchKeyEventPre28((Dialog)paramCallback, paramKeyEvent);
    }
    if (((paramView != null) && (ViewCompat.dispatchUnhandledKeyEventBeforeCallback(paramView, paramKeyEvent))) || (paramComponent.superDispatchKeyEvent(paramKeyEvent))) {
      bool = true;
    }
    return bool;
  }
  
  private static DialogInterface.OnKeyListener getDialogKeyListenerPre28(Dialog paramDialog)
  {
    if (!sDialogFieldsFetched) {}
    try
    {
      Field localField = Dialog.class.getDeclaredField("mOnKeyListener");
      sDialogKeyListenerField = localField;
      localField.setAccessible(true);
      sDialogFieldsFetched = true;
      localField = sDialogKeyListenerField;
      if (localField != null) {}
      try
      {
        paramDialog = (DialogInterface.OnKeyListener)localField.get(paramDialog);
        return paramDialog;
      }
      catch (IllegalAccessException paramDialog)
      {
        for (;;) {}
      }
      return null;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public static abstract interface Component
  {
    public abstract boolean superDispatchKeyEvent(@NonNull KeyEvent paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.KeyEventDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */