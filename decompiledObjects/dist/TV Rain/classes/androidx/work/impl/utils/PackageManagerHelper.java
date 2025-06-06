package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.work.Logger;

public class PackageManagerHelper
{
  private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");
  
  public static boolean isComponentExplicitlyEnabled(Context paramContext, Class<?> paramClass)
  {
    return isComponentExplicitlyEnabled(paramContext, paramClass.getName());
  }
  
  public static boolean isComponentExplicitlyEnabled(Context paramContext, String paramString)
  {
    int i = paramContext.getPackageManager().getComponentEnabledSetting(new ComponentName(paramContext, paramString));
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public static void setComponentEnabled(@NonNull Context paramContext, @NonNull Class<?> paramClass, boolean paramBoolean)
  {
    String str1 = "enabled";
    try
    {
      localObject1 = paramContext.getPackageManager();
      Object localObject2 = new android/content/ComponentName;
      ((ComponentName)localObject2).<init>(paramContext, paramClass.getName());
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 2;
      }
      ((PackageManager)localObject1).setComponentEnabledSetting((ComponentName)localObject2, i, 1);
      localObject1 = Logger.get();
      str2 = TAG;
      localObject2 = paramClass.getName();
      if (paramBoolean) {
        paramContext = "enabled";
      } else {
        paramContext = "disabled";
      }
      ((Logger)localObject1).debug(str2, String.format("%s %s", new Object[] { localObject2, paramContext }), new Throwable[0]);
    }
    catch (Exception localException)
    {
      Object localObject1 = Logger.get();
      String str2 = TAG;
      paramClass = paramClass.getName();
      if (paramBoolean) {
        paramContext = str1;
      } else {
        paramContext = "disabled";
      }
      ((Logger)localObject1).debug(str2, String.format("%s could not be %s", new Object[] { paramClass, paramContext }), new Throwable[] { localException });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.PackageManagerHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */