package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class o$a
  implements View.OnClickListener
{
  public final View a;
  public final String b;
  public Method c;
  public Context d;
  
  public o$a(View paramView, String paramString)
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

/* Location:
 * Qualified Name:     g.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */