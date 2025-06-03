package y2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import o2.j;
import o2.j.a;

public final class o
{
  public static final String a = j.f("PackageManagerHelper");
  
  public static void a(Context paramContext, Class<?> paramClass, boolean paramBoolean)
  {
    String str = "enabled";
    try
    {
      Object localObject1 = paramClass.getName();
      localObject2 = paramContext.getPackageManager();
      localObject3 = new android/content/ComponentName;
      ((ComponentName)localObject3).<init>(paramContext, (String)localObject1);
      int i = ((PackageManager)localObject2).getComponentEnabledSetting((ComponentName)localObject3);
      boolean bool = false;
      if ((i != 0) && (i == 1)) {
        bool = true;
      }
      if (paramBoolean == bool)
      {
        localObject1 = j.d();
        paramContext = a;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Skipping component enablement for ");
        ((StringBuilder)localObject2).append(paramClass.getName());
        ((j)localObject1).a(paramContext, ((StringBuilder)localObject2).toString());
        return;
      }
      localObject2 = paramContext.getPackageManager();
      localObject1 = new android/content/ComponentName;
      ((ComponentName)localObject1).<init>(paramContext, paramClass.getName());
      if (paramBoolean) {
        i = 1;
      } else {
        i = 2;
      }
      ((PackageManager)localObject2).setComponentEnabledSetting((ComponentName)localObject1, i, 1);
      localObject1 = j.d();
      localObject3 = a;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(paramClass.getName());
      ((StringBuilder)localObject2).append(" ");
      if (paramBoolean) {
        paramContext = "enabled";
      } else {
        paramContext = "disabled";
      }
      ((StringBuilder)localObject2).append(paramContext);
      ((j)localObject1).a((String)localObject3, ((StringBuilder)localObject2).toString());
    }
    catch (Exception localException)
    {
      Object localObject2 = j.d();
      Object localObject3 = a;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramClass.getName());
      localStringBuilder.append("could not be ");
      if (paramBoolean) {
        paramContext = str;
      } else {
        paramContext = "disabled";
      }
      localStringBuilder.append(paramContext);
      paramContext = localStringBuilder.toString();
      if (c <= 3) {
        Log.d((String)localObject3, paramContext, localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     y2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */