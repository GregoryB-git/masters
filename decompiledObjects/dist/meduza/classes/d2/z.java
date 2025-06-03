package d2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import c2.p;
import java.util.HashSet;

public abstract class z
{
  public static final HashSet c = new HashSet();
  public final String a;
  public final String b;
  
  public z(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
    c.add(this);
  }
  
  public final boolean a(Context paramContext)
  {
    boolean bool1 = b();
    boolean bool2 = false;
    Object localObject1;
    ComponentName localComponentName;
    int i;
    if (!bool1)
    {
      localObject1 = p.b(paramContext);
      localObject2 = null;
      if (localObject1 == null)
      {
        paramContext = (Context)localObject2;
      }
      else
      {
        localComponentName = new ComponentName(packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
        i = Build.VERSION.SDK_INT;
        if (i >= 33) {
          localObject1 = n.b(640L);
        }
      }
    }
    try
    {
      paramContext = n.a(paramContext.getPackageManager(), localComponentName, (PackageManager.ComponentInfoFlags)localObject1);
      break label111;
      int j = 128;
      if (i >= 24) {
        j = 640;
      }
      paramContext = paramContext.getPackageManager().getServiceInfo(localComponentName, j);
      label111:
      paramContext = metaData;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject2;
      }
    }
    if (paramContext == null) {
      bool1 = false;
    } else {
      bool1 = paramContext.containsKey(b);
    }
    if (bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public abstract boolean b();
  
  public static final class a
    extends z
  {
    public a()
    {
      super("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    }
    
    public final boolean b()
    {
      return false;
    }
  }
  
  public static final class b
    extends z
  {
    public b()
    {
      super("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    }
    
    public final boolean b()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 28) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     d2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */