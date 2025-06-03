package B3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class g$b
  implements g.c
{
  public final Class a;
  
  public g$b(Class paramClass)
  {
    a = paramClass;
  }
  
  public final Bundle b(Context paramContext)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null)
      {
        Log.w("ComponentDiscovery", "Context has no PackageManager.");
        return null;
      }
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, a);
      paramContext = localPackageManager.getServiceInfo(localComponentName, 128);
      if (paramContext == null)
      {
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append(a);
        paramContext.append(" has no service info.");
        Log.w("ComponentDiscovery", paramContext.toString());
        return null;
      }
      paramContext = metaData;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("ComponentDiscovery", "Application info not found.");
    }
    return null;
  }
  
  public List c(Context paramContext)
  {
    paramContext = b(paramContext);
    if (paramContext == null)
    {
      Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramContext.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (("com.google.firebase.components.ComponentRegistrar".equals(paramContext.get(str))) && (str.startsWith("com.google.firebase.components:"))) {
        localArrayList.add(str.substring(31));
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     B3.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */