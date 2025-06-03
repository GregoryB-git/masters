package w;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public final class k
{
  public static final Object c = new Object();
  public static Set d = new HashSet();
  public static final Object e = new Object();
  public final Context a;
  public final NotificationManager b;
  
  public k(Context paramContext)
  {
    a = paramContext;
    b = ((NotificationManager)paramContext.getSystemService("notification"));
  }
  
  public static k b(Context paramContext)
  {
    return new k(paramContext);
  }
  
  public boolean a()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return a.a(b);
    }
    AppOpsManager localAppOpsManager = (AppOpsManager)a.getSystemService("appops");
    Object localObject1 = a.getApplicationInfo();
    String str = a.getApplicationContext().getPackageName();
    int i = uid;
    boolean bool = true;
    try
    {
      localObject1 = Class.forName(AppOpsManager.class.getName());
      Object localObject2 = Integer.TYPE;
      localObject2 = ((Class)localObject1).getMethod("checkOpNoThrow", new Class[] { localObject2, localObject2, String.class });
      localObject1 = (Integer)((Class)localObject1).getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
      ((Integer)localObject1).intValue();
      i = ((Integer)((Method)localObject2).invoke(localAppOpsManager, new Object[] { localObject1, Integer.valueOf(i), str })).intValue();
      if (i != 0) {
        bool = false;
      }
    }
    catch (ClassNotFoundException|NoSuchMethodException|NoSuchFieldException|InvocationTargetException|IllegalAccessException|RuntimeException localClassNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public static abstract class a
  {
    public static boolean a(NotificationManager paramNotificationManager)
    {
      return paramNotificationManager.areNotificationsEnabled();
    }
    
    public static int b(NotificationManager paramNotificationManager)
    {
      return paramNotificationManager.getImportance();
    }
  }
}

/* Location:
 * Qualified Name:     w.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */