/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package q;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class b {
    public static String a(Context context, List list) {
        return b.b(context, list, false);
    }

    public static String b(Context context, List list, boolean bl) {
        PackageManager packageManager = context.getPackageManager();
        context = list == null ? new ArrayList() : list;
        Object object = new Intent("android.intent.action.VIEW", Uri.parse((String)"http://"));
        Object object2 = context;
        if (!bl) {
            object = packageManager.resolveActivity((Intent)object, 0);
            object2 = context;
            if (object != null) {
                object = object.activityInfo.packageName;
                object2 = new ArrayList(context.size() + 1);
                object2.add(object);
                if (list != null) {
                    object2.addAll((Collection)list);
                }
            }
        }
        context = new Intent("android.support.customtabs.action.CustomTabsService");
        list = object2.iterator();
        while (list.hasNext()) {
            object2 = (String)list.next();
            context.setPackage((String)object2);
            if (packageManager.resolveService((Intent)context, 0) == null) continue;
            return object2;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w((String)"CustomTabsClient", (String)"Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }
}

