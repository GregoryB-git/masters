package androidx.work.impl.utils;

import a3;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ProcessUtils
{
  private static final String TAG = Logger.tagWithPrefix("ProcessUtils");
  
  @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
  @Nullable
  public static String getProcessName(@NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a3.k();
    }
    try
    {
      Object localObject1 = Class.forName("android.app.ActivityThread", false, ProcessUtils.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
      ((AccessibleObject)localObject1).setAccessible(true);
      localObject1 = ((Method)localObject1).invoke(null, new Object[0]);
      if ((localObject1 instanceof String))
      {
        localObject1 = (String)localObject1;
        return (String)localObject1;
      }
    }
    finally
    {
      Logger.get().debug(TAG, "Unable to check ActivityThread for processName", new Throwable[] { localObject2 });
      int i = Process.myPid();
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (paramContext != null)
      {
        paramContext = paramContext.getRunningAppProcesses();
        if ((paramContext != null) && (!paramContext.isEmpty()))
        {
          Iterator localIterator = paramContext.iterator();
          while (localIterator.hasNext())
          {
            paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if (pid == i) {
              return processName;
            }
          }
        }
      }
    }
    return null;
  }
  
  public static boolean isDefaultProcess(@NonNull Context paramContext, @NonNull Configuration paramConfiguration)
  {
    String str = getProcessName(paramContext);
    if (!TextUtils.isEmpty(paramConfiguration.getDefaultProcessName())) {
      return TextUtils.equals(str, paramConfiguration.getDefaultProcessName());
    }
    return TextUtils.equals(str, getApplicationInfoprocessName);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.ProcessUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */