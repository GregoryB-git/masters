package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z2;

class AppCompatViewInflater$DeclaredOnClickListener
  implements View.OnClickListener
{
  private final View mHostView;
  private final String mMethodName;
  private Context mResolvedContext;
  private Method mResolvedMethod;
  
  public AppCompatViewInflater$DeclaredOnClickListener(@NonNull View paramView, @NonNull String paramString)
  {
    mHostView = paramView;
    mMethodName = paramString;
  }
  
  private void resolveMethod(@Nullable Context paramContext)
  {
    while (paramContext != null)
    {
      try
      {
        if (!paramContext.isRestricted())
        {
          localObject = paramContext.getClass().getMethod(mMethodName, new Class[] { View.class });
          if (localObject != null)
          {
            mResolvedMethod = ((Method)localObject);
            mResolvedContext = paramContext;
            return;
          }
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Object localObject;
        int i;
        for (;;) {}
      }
      if ((paramContext instanceof ContextWrapper)) {
        paramContext = ((ContextWrapper)paramContext).getBaseContext();
      } else {
        paramContext = null;
      }
    }
    i = mHostView.getId();
    if (i == -1)
    {
      paramContext = "";
    }
    else
    {
      paramContext = z2.t(" with id '");
      paramContext.append(mHostView.getContext().getResources().getResourceEntryName(i));
      paramContext.append("'");
      paramContext = paramContext.toString();
    }
    localObject = z2.t("Could not find method ");
    ((StringBuilder)localObject).append(mMethodName);
    ((StringBuilder)localObject).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
    ((StringBuilder)localObject).append(mHostView.getClass());
    ((StringBuilder)localObject).append(paramContext);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void onClick(@NonNull View paramView)
  {
    if (mResolvedMethod == null) {
      resolveMethod(mHostView.getContext());
    }
    try
    {
      mResolvedMethod.invoke(mResolvedContext, new Object[] { paramView });
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
 * Qualified Name:     androidx.appcompat.app.AppCompatViewInflater.DeclaredOnClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */