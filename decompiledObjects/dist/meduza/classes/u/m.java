package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Build.VERSION;

public final class m
{
  /* Error */
  public static android.content.Intent a(android.app.Activity paramActivity)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 14	android/app/Activity:getParentActivityIntent	()Landroid/content/Intent;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +5 -> 11
    //   9: aload_1
    //   10: areturn
    //   11: aload_0
    //   12: aload_0
    //   13: invokevirtual 18	android/app/Activity:getComponentName	()Landroid/content/ComponentName;
    //   16: invokestatic 22	u/m:b	(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //   19: astore_1
    //   20: aload_1
    //   21: ifnonnull +5 -> 26
    //   24: aconst_null
    //   25: areturn
    //   26: new 24	android/content/ComponentName
    //   29: dup
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial 28	android/content/ComponentName:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   35: astore_2
    //   36: aload_0
    //   37: aload_2
    //   38: invokestatic 22	u/m:b	(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //   41: ifnonnull +11 -> 52
    //   44: aload_2
    //   45: invokestatic 34	android/content/Intent:makeMainActivity	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   48: astore_0
    //   49: goto +17 -> 66
    //   52: new 30	android/content/Intent
    //   55: astore_0
    //   56: aload_0
    //   57: invokespecial 37	android/content/Intent:<init>	()V
    //   60: aload_0
    //   61: aload_2
    //   62: invokevirtual 40	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   65: astore_0
    //   66: aload_0
    //   67: areturn
    //   68: astore_0
    //   69: new 42	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   76: astore_0
    //   77: aload_0
    //   78: ldc 45
    //   80: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload_0
    //   85: aload_1
    //   86: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_0
    //   91: ldc 51
    //   93: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: ldc 53
    //   99: aload_0
    //   100: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokestatic 63	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   106: pop
    //   107: aconst_null
    //   108: areturn
    //   109: astore_0
    //   110: new 65	java/lang/IllegalArgumentException
    //   113: dup
    //   114: aload_0
    //   115: invokespecial 68	java/lang/IllegalArgumentException:<init>	(Ljava/lang/Throwable;)V
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	paramActivity	android.app.Activity
    //   4	82	1	localObject	Object
    //   35	27	2	localComponentName	ComponentName
    // Exception table:
    //   from	to	target	type
    //   36	49	68	android/content/pm/PackageManager$NameNotFoundException
    //   52	66	68	android/content/pm/PackageManager$NameNotFoundException
    //   11	20	109	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public static String b(Context paramContext, ComponentName paramComponentName)
  {
    Object localObject = paramContext.getPackageManager();
    int i = Build.VERSION.SDK_INT;
    int j = 640;
    if (i >= 29) {
      j = 269222528;
    } else if (i >= 24) {
      j = 787072;
    }
    localObject = ((PackageManager)localObject).getActivityInfo(paramComponentName, j);
    paramComponentName = parentActivityName;
    if (paramComponentName != null) {
      return paramComponentName;
    }
    paramComponentName = metaData;
    if (paramComponentName == null) {
      return null;
    }
    localObject = paramComponentName.getString("android.support.PARENT_ACTIVITY");
    if (localObject == null) {
      return null;
    }
    paramComponentName = (ComponentName)localObject;
    if (((String)localObject).charAt(0) == '.')
    {
      paramComponentName = new StringBuilder();
      paramComponentName.append(paramContext.getPackageName());
      paramComponentName.append((String)localObject);
      paramComponentName = paramComponentName.toString();
    }
    return paramComponentName;
  }
}

/* Location:
 * Qualified Name:     u.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */