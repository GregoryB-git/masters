// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import x1.C;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import x1.B;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;

public final class Q
{
    public static final Q a;
    public static final String b;
    
    static {
        a = new Q();
        b = Q.class.getName();
    }
    
    public static final void a(final Collection collection, final String str) {
        Intrinsics.checkNotNullParameter(collection, "container");
        Intrinsics.checkNotNullParameter(str, "name");
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Container '");
            sb.append(str);
            sb.append("' cannot contain null values");
            throw new NullPointerException(sb.toString());
        }
    }
    
    public static final String b() {
        final String m = B.m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }
    
    public static final String c() {
        final String r = B.r();
        if (r != null) {
            return r;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }
    
    public static final boolean d(final Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(s, "redirectURI");
        final PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities;
        if (packageManager != null) {
            final Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(s));
            queryIntentActivities = (List<ResolveInfo>)packageManager.queryIntentActivities(intent, 64);
        }
        else {
            queryIntentActivities = null;
        }
        boolean b = false;
        if (queryIntentActivities != null) {
            final Iterator<ResolveInfo> iterator = queryIntentActivities.iterator();
            b = false;
            while (iterator.hasNext()) {
                final ActivityInfo activityInfo = iterator.next().activityInfo;
                if (!Intrinsics.a(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.a(activityInfo.packageName, context.getPackageName())) {
                    return false;
                }
                b = true;
            }
        }
        return b;
    }
    
    public static final void e(final Context context, final boolean b) {
        Intrinsics.checkNotNullParameter(context, "context");
        final PackageManager packageManager = context.getPackageManager();
        while (true) {
            if (packageManager == null) {
                break Label_0036;
            }
            final ComponentName componentName = new ComponentName(context, "com.facebook.FacebookActivity");
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 1);
                while (true) {
                    if (activityInfo != null) {
                        return;
                    }
                    if (b ^ true) {
                        Log.w(Q.b, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
                        return;
                    }
                    throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString());
                    activityInfo = null;
                    continue;
                }
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final void f(final Context context, final boolean b) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (b ^ true) {
            Log.w(Q.b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
    }
    
    public static final void g(final String s, final String str) {
        Intrinsics.checkNotNullParameter(s, "arg");
        Intrinsics.checkNotNullParameter(str, "name");
        if (s.length() > 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument '");
        sb.append(str);
        sb.append("' cannot be empty");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final void h(final Collection collection, final String str) {
        Intrinsics.checkNotNullParameter(collection, "container");
        Intrinsics.checkNotNullParameter(str, "name");
        if (collection.isEmpty() ^ true) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Container '");
        sb.append(str);
        sb.append("' cannot be empty");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final void i(final Collection collection, final String s) {
        Intrinsics.checkNotNullParameter(collection, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        a(collection, s);
        h(collection, s);
    }
    
    public static final void j(final Object o, final String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument '");
        sb.append(str);
        sb.append("' cannot be null");
        throw new NullPointerException(sb.toString());
    }
    
    public static final String k(final String s, final String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (s != null && s.length() > 0) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument '");
        sb.append(str);
        sb.append("' cannot be null or empty");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final void l() {
        if (B.F()) {
            return;
        }
        throw new C("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
}
