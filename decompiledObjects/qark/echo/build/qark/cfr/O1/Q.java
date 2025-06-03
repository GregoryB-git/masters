/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package O1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.C;

public final class Q {
    public static final Q a = new Q();
    public static final String b = Q.class.getName();

    public static final void a(Collection collection, String string2) {
        Intrinsics.checkNotNullParameter((Object)collection, "container");
        Intrinsics.checkNotNullParameter(string2, "name");
        collection = collection.iterator();
        while (collection.hasNext()) {
            if (collection.next() != null) continue;
            collection = new StringBuilder();
            collection.append("Container '");
            collection.append(string2);
            collection.append("' cannot contain null values");
            throw new NullPointerException(collection.toString());
        }
    }

    public static final String b() {
        String string2 = B.m();
        if (string2 != null) {
            return string2;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final String c() {
        String string2 = B.r();
        if (string2 != null) {
            return string2;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final boolean d(Context context, String string2) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter(string2, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse((String)string2));
            string2 = packageManager.queryIntentActivities(intent, 64);
        } else {
            string2 = null;
        }
        boolean bl = false;
        if (string2 != null) {
            string2 = string2.iterator();
            bl = false;
            while (string2.hasNext()) {
                packageManager = ((ResolveInfo)string2.next()).activityInfo;
                if (Intrinsics.a(packageManager.name, "com.facebook.CustomTabActivity") && Intrinsics.a(packageManager.packageName, context.getPackageName())) {
                    bl = true;
                    continue;
                }
                return false;
            }
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(Context context, boolean bl) {
        block5 : {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                context = new ComponentName(context, "com.facebook.FacebookActivity");
                try {
                    context = packageManager.getActivityInfo((ComponentName)context, 1);
                    break block5;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
            context = null;
        }
        if (context != null) {
            return;
        }
        if (bl ^ true) {
            Log.w((String)b, (String)"FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            return;
        }
        throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString());
    }

    public static final void f(Context context, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (bl ^ true) {
                Log.w((String)b, (String)"No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
                return;
            }
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
        }
    }

    public static final void g(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "arg");
        Intrinsics.checkNotNullParameter(string3, "name");
        boolean bl = string2.length() > 0;
        if (bl) {
            return;
        }
        string2 = new StringBuilder();
        string2.append("Argument '");
        string2.append(string3);
        string2.append("' cannot be empty");
        throw new IllegalArgumentException(string2.toString().toString());
    }

    public static final void h(Collection collection, String string2) {
        Intrinsics.checkNotNullParameter((Object)collection, "container");
        Intrinsics.checkNotNullParameter(string2, "name");
        if (collection.isEmpty() ^ true) {
            return;
        }
        collection = new StringBuilder();
        collection.append("Container '");
        collection.append(string2);
        collection.append("' cannot be empty");
        throw new IllegalArgumentException(collection.toString().toString());
    }

    public static final void i(Collection collection, String string2) {
        Intrinsics.checkNotNullParameter((Object)collection, "container");
        Intrinsics.checkNotNullParameter(string2, "name");
        Q.a(collection, string2);
        Q.h(collection, string2);
    }

    public static final void j(Object object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        object.append("Argument '");
        object.append(string2);
        object.append("' cannot be null");
        throw new NullPointerException(object.toString());
    }

    public static final String k(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string3, "name");
        boolean bl = string2 != null && string2.length() > 0;
        if (bl) {
            return string2;
        }
        string2 = new StringBuilder();
        string2.append("Argument '");
        string2.append(string3);
        string2.append("' cannot be null or empty");
        throw new IllegalArgumentException(string2.toString().toString());
    }

    public static final void l() {
        if (B.F()) {
            return;
        }
        throw new C("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
}

