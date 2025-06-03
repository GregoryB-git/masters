package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.h;

public final class o
{
  public static final Class<?>[] b = { Context.class, AttributeSet.class };
  public static final int[] c = { 16843375 };
  public static final int[] d = { 16844160 };
  public static final int[] e = { 16844156 };
  public static final int[] f = { 16844148 };
  public static final String[] g = { "android.widget.", "android.view.", "android.webkit." };
  public static final h<String, Constructor<? extends View>> h = new h();
  public final Object[] a = new Object[2];
  
  public final View a(Context paramContext, String paramString1, String paramString2)
  {
    h localh = h;
    Constructor localConstructor = (Constructor)localh.getOrDefault(paramString1, null);
    Object localObject = localConstructor;
    if ((localConstructor != null) || (paramString2 != null)) {}
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramString2);
      ((StringBuilder)localObject).append(paramString1);
      paramString2 = ((StringBuilder)localObject).toString();
      break label65;
      paramString2 = paramString1;
      label65:
      localObject = Class.forName(paramString2, false, paramContext.getClassLoader()).asSubclass(View.class).getConstructor(b);
      localh.put(paramString1, localObject);
      ((AccessibleObject)localObject).setAccessible(true);
      paramContext = (View)((Constructor)localObject).newInstance(a);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static final class a
    implements View.OnClickListener
  {
    public final View a;
    public final String b;
    public Method c;
    public Context d;
    
    public a(View paramView, String paramString)
    {
      a = paramView;
      b = paramString;
    }
    
    public final void onClick(View paramView)
    {
      if (c == null)
      {
        Object localObject = a.getContext();
        while (localObject != null)
        {
          try
          {
            if (!((Context)localObject).isRestricted())
            {
              Method localMethod = localObject.getClass().getMethod(b, new Class[] { View.class });
              if (localMethod != null)
              {
                c = localMethod;
                d = ((Context)localObject);
              }
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            int i;
            for (;;) {}
          }
          if ((localObject instanceof ContextWrapper)) {
            localObject = ((ContextWrapper)localObject).getBaseContext();
          } else {
            localObject = null;
          }
        }
        i = a.getId();
        if (i == -1)
        {
          paramView = "";
        }
        else
        {
          paramView = f.l(" with id '");
          paramView.append(a.getContext().getResources().getResourceEntryName(i));
          paramView.append("'");
          paramView = paramView.toString();
        }
        localObject = f.l("Could not find method ");
        ((StringBuilder)localObject).append(b);
        ((StringBuilder)localObject).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
        ((StringBuilder)localObject).append(a.getClass());
        ((StringBuilder)localObject).append(paramView);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      try
      {
        c.invoke(d, new Object[] { paramView });
        return;
      }
      catch (InvocationTargetException paramView)
      {
        throw new IllegalStateException("Could not execute method for android:onClick", paramView);
      }
      catch (IllegalAccessException paramView)
      {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", paramView);
      }
    }
  }
}

/* Location:
 * Qualified Name:     g.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */