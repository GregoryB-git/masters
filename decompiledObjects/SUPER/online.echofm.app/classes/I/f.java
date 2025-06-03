package I;

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
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class f
{
  public static boolean a = false;
  public static Method b;
  public static boolean c = false;
  public static Field d;
  
  public static boolean a(ActionBar paramActionBar, KeyEvent paramKeyEvent)
  {
    if (!a) {}
    try
    {
      b = paramActionBar.getClass().getMethod("onMenuKeyEvent", new Class[] { KeyEvent.class });
      a = true;
      Method localMethod = b;
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
  
  public static boolean b(Activity paramActivity, KeyEvent paramKeyEvent)
  {
    paramActivity.onUserInteraction();
    Window localWindow = paramActivity.getWindow();
    if (localWindow.hasFeature(8))
    {
      localObject = paramActivity.getActionBar();
      if ((paramKeyEvent.getKeyCode() == 82) && (localObject != null) && (a((ActionBar)localObject, paramKeyEvent))) {
        return true;
      }
    }
    if (localWindow.superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    Object localObject = localWindow.getDecorView();
    if (s.d((View)localObject, paramKeyEvent)) {
      return true;
    }
    if (localObject != null) {
      localObject = ((View)localObject).getKeyDispatcherState();
    } else {
      localObject = null;
    }
    return paramKeyEvent.dispatch(paramActivity, (KeyEvent.DispatcherState)localObject, paramActivity);
  }
  
  public static boolean c(Dialog paramDialog, KeyEvent paramKeyEvent)
  {
    Object localObject = f(paramDialog);
    if ((localObject != null) && (((DialogInterface.OnKeyListener)localObject).onKey(paramDialog, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      return true;
    }
    localObject = paramDialog.getWindow();
    if (((Window)localObject).superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    localObject = ((Window)localObject).getDecorView();
    if (s.d((View)localObject, paramKeyEvent)) {
      return true;
    }
    if (localObject != null) {
      localObject = ((View)localObject).getKeyDispatcherState();
    } else {
      localObject = null;
    }
    return paramKeyEvent.dispatch(paramDialog, (KeyEvent.DispatcherState)localObject, paramDialog);
  }
  
  public static boolean d(View paramView, KeyEvent paramKeyEvent)
  {
    return s.e(paramView, paramKeyEvent);
  }
  
  public static boolean e(a parama, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (parama == null) {
      return false;
    }
    if (Build.VERSION.SDK_INT >= 28) {
      return parama.b(paramKeyEvent);
    }
    if ((paramCallback instanceof Activity)) {
      return b((Activity)paramCallback, paramKeyEvent);
    }
    if ((paramCallback instanceof Dialog)) {
      return c((Dialog)paramCallback, paramKeyEvent);
    }
    if (((paramView != null) && (s.d(paramView, paramKeyEvent))) || (parama.b(paramKeyEvent))) {
      bool = true;
    }
    return bool;
  }
  
  public static DialogInterface.OnKeyListener f(Dialog paramDialog)
  {
    if (!c) {}
    try
    {
      Field localField = Dialog.class.getDeclaredField("mOnKeyListener");
      d = localField;
      localField.setAccessible(true);
      c = true;
      localField = d;
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
  
  public static abstract interface a
  {
    public abstract boolean b(KeyEvent paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     I.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */