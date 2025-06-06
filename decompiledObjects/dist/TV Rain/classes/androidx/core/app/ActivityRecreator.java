package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class ActivityRecreator
{
  private static final String LOG_TAG = "ActivityRecreator";
  public static final Class<?> activityThreadClass;
  private static final Handler mainHandler = new Handler(Looper.getMainLooper());
  public static final Field mainThreadField;
  public static final Method performStopActivity2ParamsMethod;
  public static final Method performStopActivity3ParamsMethod;
  public static final Method requestRelaunchActivityMethod;
  public static final Field tokenField;
  
  static
  {
    Class localClass = getActivityThreadClass();
    activityThreadClass = localClass;
    mainThreadField = getMainThreadField();
    tokenField = getTokenField();
    performStopActivity3ParamsMethod = getPerformStopActivity3Params(localClass);
    performStopActivity2ParamsMethod = getPerformStopActivity2Params(localClass);
    requestRelaunchActivityMethod = getRequestRelaunchActivityMethod(localClass);
  }
  
  private static Class<?> getActivityThreadClass()
  {
    try
    {
      Class localClass = Class.forName("android.app.ActivityThread");
      return localClass;
    }
    finally {}
    return null;
  }
  
  private static Field getMainThreadField()
  {
    try
    {
      Field localField = Activity.class.getDeclaredField("mMainThread");
      localField.setAccessible(true);
      return localField;
    }
    finally {}
    return null;
  }
  
  private static Method getPerformStopActivity2Params(Class<?> paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    try
    {
      paramClass = paramClass.getDeclaredMethod("performStopActivity", new Class[] { IBinder.class, Boolean.TYPE });
      paramClass.setAccessible(true);
      return paramClass;
    }
    finally {}
    return null;
  }
  
  private static Method getPerformStopActivity3Params(Class<?> paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    try
    {
      paramClass = paramClass.getDeclaredMethod("performStopActivity", new Class[] { IBinder.class, Boolean.TYPE, String.class });
      paramClass.setAccessible(true);
      return paramClass;
    }
    finally {}
    return null;
  }
  
  private static Method getRequestRelaunchActivityMethod(Class<?> paramClass)
  {
    if ((needsRelaunchCall()) && (paramClass != null)) {}
    try
    {
      Class localClass1 = Integer.TYPE;
      Class localClass2 = Boolean.TYPE;
      paramClass = paramClass.getDeclaredMethod("requestRelaunchActivity", new Class[] { IBinder.class, List.class, List.class, localClass1, localClass2, Configuration.class, Configuration.class, localClass2, localClass2 });
      paramClass.setAccessible(true);
      return paramClass;
    }
    finally
    {
      for (;;) {}
    }
    return null;
  }
  
  private static Field getTokenField()
  {
    try
    {
      Field localField = Activity.class.getDeclaredField("mToken");
      localField.setAccessible(true);
      return localField;
    }
    finally {}
    return null;
  }
  
  private static boolean needsRelaunchCall()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool;
    if ((i != 26) && (i != 27)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean queueOnStopIfNecessary(Object paramObject, int paramInt, Activity paramActivity)
  {
    try
    {
      Object localObject1 = tokenField.get(paramActivity);
      if ((localObject1 == paramObject) && (paramActivity.hashCode() == paramInt))
      {
        Object localObject2 = mainThreadField.get(paramActivity);
        paramActivity = mainHandler;
        paramObject = new androidx/core/app/ActivityRecreator$3;
        ((3)paramObject).<init>(localObject2, localObject1);
        return true;
      }
      return false;
    }
    finally
    {
      Log.e("ActivityRecreator", "Exception while fetching field values", (Throwable)paramObject);
    }
    return false;
  }
  
  public static boolean recreate(@NonNull Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramActivity.recreate();
      return true;
    }
    if ((needsRelaunchCall()) && (requestRelaunchActivityMethod == null)) {
      return false;
    }
    if ((performStopActivity2ParamsMethod == null) && (performStopActivity3ParamsMethod == null)) {
      return false;
    }
    try
    {
      Object localObject1 = tokenField.get(paramActivity);
      if (localObject1 == null) {
        return false;
      }
      Object localObject2 = mainThreadField.get(paramActivity);
      if (localObject2 == null) {
        return false;
      }
      Application localApplication = paramActivity.getApplication();
      LifecycleCheckCallbacks localLifecycleCheckCallbacks = new androidx/core/app/ActivityRecreator$LifecycleCheckCallbacks;
      localLifecycleCheckCallbacks.<init>(paramActivity);
      localApplication.registerActivityLifecycleCallbacks(localLifecycleCheckCallbacks);
      Handler localHandler = mainHandler;
      Object localObject4 = new androidx/core/app/ActivityRecreator$1;
      ((1)localObject4).<init>(localLifecycleCheckCallbacks, localObject1);
      localHandler.post((Runnable)localObject4);
      try
      {
        if (needsRelaunchCall())
        {
          paramActivity = requestRelaunchActivityMethod;
          localObject4 = Boolean.FALSE;
          paramActivity.invoke(localObject2, new Object[] { localObject1, null, null, Integer.valueOf(0), localObject4, null, null, localObject4, localObject4 });
        }
        else
        {
          paramActivity.recreate();
        }
        paramActivity = new androidx/core/app/ActivityRecreator$2;
        paramActivity.<init>(localApplication, localLifecycleCheckCallbacks);
        localHandler.post(paramActivity);
        return true;
      }
      finally
      {
        localHandler = mainHandler;
        paramActivity = new androidx/core/app/ActivityRecreator$2;
        paramActivity.<init>(localApplication, localLifecycleCheckCallbacks);
        localHandler.post(paramActivity);
      }
      return false;
    }
    finally {}
  }
  
  public static final class LifecycleCheckCallbacks
    implements Application.ActivityLifecycleCallbacks
  {
    public Object currentlyRecreatingToken;
    private Activity mActivity;
    private boolean mDestroyed = false;
    private final int mRecreatingHashCode;
    private boolean mStarted = false;
    private boolean mStopQueued = false;
    
    public LifecycleCheckCallbacks(@NonNull Activity paramActivity)
    {
      mActivity = paramActivity;
      mRecreatingHashCode = paramActivity.hashCode();
    }
    
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityDestroyed(Activity paramActivity)
    {
      if (mActivity == paramActivity)
      {
        mActivity = null;
        mDestroyed = true;
      }
    }
    
    public void onActivityPaused(Activity paramActivity)
    {
      if ((mDestroyed) && (!mStopQueued) && (!mStarted) && (ActivityRecreator.queueOnStopIfNecessary(currentlyRecreatingToken, mRecreatingHashCode, paramActivity)))
      {
        mStopQueued = true;
        currentlyRecreatingToken = null;
      }
    }
    
    public void onActivityResumed(Activity paramActivity) {}
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityStarted(Activity paramActivity)
    {
      if (mActivity == paramActivity) {
        mStarted = true;
      }
    }
    
    public void onActivityStopped(Activity paramActivity) {}
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityRecreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */