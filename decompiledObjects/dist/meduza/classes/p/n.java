package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class n
{
  public final ICustomTabsService a;
  public final ComponentName b;
  
  public n(ICustomTabsService paramICustomTabsService, ComponentName paramComponentName)
  {
    a = paramICustomTabsService;
    b = paramComponentName;
  }
  
  public static String a(Context paramContext, List<String> paramList, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (paramList == null) {
      paramContext = new ArrayList();
    } else {
      paramContext = paramList;
    }
    Object localObject1 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
    Object localObject2 = paramContext;
    if (!paramBoolean)
    {
      localObject1 = localPackageManager.resolveActivity((Intent)localObject1, 0);
      localObject2 = paramContext;
      if (localObject1 != null)
      {
        localObject1 = activityInfo.packageName;
        localObject2 = new ArrayList(paramContext.size() + 1);
        ((ArrayList)localObject2).add(localObject1);
        if (paramList != null) {
          ((ArrayList)localObject2).addAll(paramList);
        }
      }
    }
    paramContext = new Intent("android.support.customtabs.action.CustomTabsService");
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramList = (String)((Iterator)localObject2).next();
      paramContext.setPackage(paramList);
      if (localPackageManager.resolveService(paramContext, 0) != null) {
        return paramList;
      }
    }
    if (Build.VERSION.SDK_INT >= 30) {
      Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     p.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */