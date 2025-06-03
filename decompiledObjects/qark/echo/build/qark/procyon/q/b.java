// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q;

import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.os.Build$VERSION;
import java.util.Collection;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

public abstract class b
{
    public static String a(final Context context, final List list) {
        return b(context, list, false);
    }
    
    public static String b(final Context context, final List list, final boolean b) {
        final PackageManager packageManager = context.getPackageManager();
        ArrayList<String> list2;
        if (list == null) {
            list2 = (ArrayList<String>)new ArrayList<Object>();
        }
        else {
            list2 = (ArrayList<String>)list;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        ArrayList<String> list3 = list2;
        if (!b) {
            final ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            list3 = list2;
            if (resolveActivity != null) {
                final String packageName = resolveActivity.activityInfo.packageName;
                list3 = new ArrayList<String>(list2.size() + 1);
                list3.add(packageName);
                if (list != null) {
                    list3.addAll((Collection<?>)list);
                }
            }
        }
        final Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (final String package1 : list3) {
            intent2.setPackage(package1);
            if (packageManager.resolveService(intent2, 0) != null) {
                return package1;
            }
        }
        if (Build$VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }
}
