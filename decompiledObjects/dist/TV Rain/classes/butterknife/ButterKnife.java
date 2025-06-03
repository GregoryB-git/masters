package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import z2;

public final class ButterKnife
{
  @VisibleForTesting
  public static final Map<Class<?>, Constructor<? extends Unbinder>> BINDINGS = new LinkedHashMap();
  private static final String TAG = "ButterKnife";
  private static boolean debug = false;
  
  private ButterKnife()
  {
    throw new AssertionError("No instances.");
  }
  
  @NonNull
  @UiThread
  public static Unbinder bind(@NonNull Activity paramActivity)
  {
    return bind(paramActivity, paramActivity.getWindow().getDecorView());
  }
  
  @NonNull
  @UiThread
  public static Unbinder bind(@NonNull Dialog paramDialog)
  {
    return bind(paramDialog, paramDialog.getWindow().getDecorView());
  }
  
  @NonNull
  @UiThread
  public static Unbinder bind(@NonNull View paramView)
  {
    return bind(paramView, paramView);
  }
  
  @NonNull
  @UiThread
  public static Unbinder bind(@NonNull Object paramObject, @NonNull Activity paramActivity)
  {
    return bind(paramObject, paramActivity.getWindow().getDecorView());
  }
  
  @NonNull
  @UiThread
  public static Unbinder bind(@NonNull Object paramObject, @NonNull Dialog paramDialog)
  {
    return bind(paramObject, paramDialog.getWindow().getDecorView());
  }
  
  @NonNull
  @UiThread
  public static Unbinder bind(@NonNull Object paramObject, @NonNull View paramView)
  {
    Class localClass = paramObject.getClass();
    if (debug)
    {
      localObject = z2.t("Looking up binding for ");
      ((StringBuilder)localObject).append(localClass.getName());
      Log.d("ButterKnife", ((StringBuilder)localObject).toString());
    }
    Object localObject = findBindingConstructorForClass(localClass);
    if (localObject == null) {
      return Unbinder.EMPTY;
    }
    try
    {
      paramObject = (Unbinder)((Constructor)localObject).newInstance(new Object[] { paramObject, paramView });
      return (Unbinder)paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramObject = ((InvocationTargetException)paramObject).getCause();
      if (!(paramObject instanceof RuntimeException))
      {
        if ((paramObject instanceof Error)) {
          throw ((Error)paramObject);
        }
        throw new RuntimeException("Unable to create binding instance.", (Throwable)paramObject);
      }
      throw ((RuntimeException)paramObject);
    }
    catch (InstantiationException paramView)
    {
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Unable to invoke ");
      ((StringBuilder)paramObject).append(localObject);
      throw new RuntimeException(((StringBuilder)paramObject).toString(), paramView);
    }
    catch (IllegalAccessException paramView)
    {
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Unable to invoke ");
      ((StringBuilder)paramObject).append(localObject);
      throw new RuntimeException(((StringBuilder)paramObject).toString(), paramView);
    }
  }
  
  @CheckResult
  @Nullable
  @UiThread
  private static Constructor<? extends Unbinder> findBindingConstructorForClass(Class<?> paramClass)
  {
    Object localObject1 = BINDINGS;
    Object localObject3 = (Constructor)((Map)localObject1).get(paramClass);
    if ((localObject3 == null) && (!((Map)localObject1).containsKey(paramClass)))
    {
      String str = paramClass.getName();
      if ((!str.startsWith("android.")) && (!str.startsWith("java.")) && (!str.startsWith("androidx.")))
      {
        Object localObject2;
        try
        {
          localObject3 = paramClass.getClassLoader();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(str);
          ((StringBuilder)localObject1).append("_ViewBinding");
          localObject3 = ((ClassLoader)localObject3).loadClass(((StringBuilder)localObject1).toString()).getConstructor(new Class[] { paramClass, View.class });
          localObject1 = localObject3;
          if (debug)
          {
            Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
            localObject1 = localObject3;
          }
        }
        catch (NoSuchMethodException paramClass)
        {
          throw new RuntimeException(z2.o("Unable to find binding constructor for ", str), paramClass);
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          if (debug)
          {
            localObject2 = z2.t("Not found. Trying superclass ");
            ((StringBuilder)localObject2).append(paramClass.getSuperclass().getName());
            Log.d("ButterKnife", ((StringBuilder)localObject2).toString());
          }
          localObject2 = findBindingConstructorForClass(paramClass.getSuperclass());
        }
        BINDINGS.put(paramClass, localObject2);
        return (Constructor<? extends Unbinder>)localObject2;
      }
      if (debug) {
        Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
      }
      return null;
    }
    if (debug) {
      Log.d("ButterKnife", "HIT: Cached in binding map.");
    }
    return (Constructor<? extends Unbinder>)localObject3;
  }
  
  public static void setDebug(boolean paramBoolean)
  {
    debug = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     butterknife.ButterKnife
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */