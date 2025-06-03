package e0;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i
{
  public static boolean a = false;
  public static Method b;
  public static boolean c = false;
  public static Field d;
  
  public static boolean a(View paramView, KeyEvent paramKeyEvent)
  {
    Object localObject = d0.a;
    if (Build.VERSION.SDK_INT < 28)
    {
      localObject = d0.m.d;
      d0.m localm = (d0.m)paramView.getTag(2131362042);
      localObject = localm;
      if (localm == null)
      {
        localObject = new d0.m();
        paramView.setTag(2131362042, localObject);
      }
      paramView = c;
      if ((paramView == null) || (paramView.get() != paramKeyEvent))
      {
        c = new WeakReference(paramKeyEvent);
        localm = null;
        if (b == null) {
          b = new SparseArray();
        }
        SparseArray localSparseArray = b;
        int i = paramKeyEvent.getAction();
        boolean bool1 = true;
        paramView = localm;
        if (i == 1)
        {
          i = localSparseArray.indexOfKey(paramKeyEvent.getKeyCode());
          paramView = localm;
          if (i >= 0)
          {
            paramView = (WeakReference)localSparseArray.valueAt(i);
            localSparseArray.removeAt(i);
          }
        }
        localObject = paramView;
        if (paramView == null) {
          localObject = (WeakReference)localSparseArray.get(paramKeyEvent.getKeyCode());
        }
        if (localObject != null)
        {
          paramView = (View)((Reference)localObject).get();
          bool2 = bool1;
          if (paramView == null) {
            break label227;
          }
          bool2 = bool1;
          if (!paramView.isAttachedToWindow()) {
            break label227;
          }
          d0.m.b(paramView, paramKeyEvent);
          bool2 = bool1;
          break label227;
        }
      }
    }
    boolean bool2 = false;
    label227:
    return bool2;
  }
  
  public static boolean b(a parama, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (parama == null) {
      return false;
    }
    if (Build.VERSION.SDK_INT >= 28) {
      return parama.superDispatchKeyEvent(paramKeyEvent);
    }
    boolean bool3 = paramCallback instanceof Activity;
    Method localMethod = null;
    Object localObject = null;
    boolean bool4 = true;
    boolean bool5 = true;
    if (bool3)
    {
      paramView = (Activity)paramCallback;
      paramView.onUserInteraction();
      parama = paramView.getWindow();
      if (parama.hasFeature(8))
      {
        paramCallback = paramView.getActionBar();
        if ((paramKeyEvent.getKeyCode() == 82) && (paramCallback != null) && (a)) {}
      }
    }
    try
    {
      b = paramCallback.getClass().getMethod("onMenuKeyEvent", new Class[] { KeyEvent.class });
      a = true;
      localMethod = b;
      bool1 = bool2;
      if (localMethod == null) {}
    }
    catch (NoSuchMethodException paramCallback)
    {
      try
      {
        paramCallback = localMethod.invoke(paramCallback, new Object[] { paramKeyEvent });
        if (paramCallback == null) {
          bool1 = bool2;
        } else {
          bool1 = ((Boolean)paramCallback).booleanValue();
        }
        if (bool1)
        {
          bool1 = bool5;
        }
        else if (parama.superDispatchKeyEvent(paramKeyEvent))
        {
          bool1 = bool5;
        }
        else
        {
          paramCallback = parama.getDecorView();
          if (d0.b(paramCallback, paramKeyEvent))
          {
            bool1 = bool5;
          }
          else
          {
            parama = (a)localObject;
            if (paramCallback != null) {
              parama = paramCallback.getKeyDispatcherState();
            }
            bool1 = paramKeyEvent.dispatch(paramView, parama, paramView);
          }
        }
        return bool1;
        if ((paramCallback instanceof Dialog))
        {
          paramView = (Dialog)paramCallback;
          if (c) {}
        }
      }
      catch (IllegalAccessException|InvocationTargetException paramCallback)
      {
        try
        {
          for (;;)
          {
            parama = Dialog.class.getDeclaredField("mOnKeyListener");
            d = parama;
            parama.setAccessible(true);
            c = true;
            parama = d;
            if (parama != null) {}
            try
            {
              parama = (DialogInterface.OnKeyListener)parama.get(paramView);
            }
            catch (IllegalAccessException parama)
            {
              for (;;) {}
            }
            parama = null;
            if ((parama != null) && (parama.onKey(paramView, paramKeyEvent.getKeyCode(), paramKeyEvent)))
            {
              bool1 = bool4;
            }
            else
            {
              parama = paramView.getWindow();
              if (parama.superDispatchKeyEvent(paramKeyEvent))
              {
                bool1 = bool4;
              }
              else
              {
                paramCallback = parama.getDecorView();
                if (d0.b(paramCallback, paramKeyEvent))
                {
                  bool1 = bool4;
                }
                else
                {
                  parama = localMethod;
                  if (paramCallback != null) {
                    parama = paramCallback.getKeyDispatcherState();
                  }
                  bool1 = paramKeyEvent.dispatch(paramView, parama, paramView);
                }
              }
            }
            return bool1;
            if (((paramView != null) && (d0.b(paramView, paramKeyEvent))) || (parama.superDispatchKeyEvent(paramKeyEvent))) {
              bool1 = true;
            }
            return bool1;
            localNoSuchMethodException = localNoSuchMethodException;
          }
          paramCallback = paramCallback;
          bool1 = bool2;
        }
        catch (NoSuchFieldException parama)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean superDispatchKeyEvent(KeyEvent paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     e0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */