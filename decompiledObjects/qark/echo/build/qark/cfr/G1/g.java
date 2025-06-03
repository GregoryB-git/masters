/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.view.View
 *  android.view.Window
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.Throwable
 *  java.text.NumberFormat
 *  java.text.ParseException
 *  java.util.Arrays
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package G1;

import O1.P;
import T1.a;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import x1.B;

public final class g {
    public static final g a = new g();

    public static final void a() {
    }

    public static final void b() {
    }

    public static final String c(byte[] object) {
        Intrinsics.checkNotNullParameter(object, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte by : object) {
            Object object2 = x.a;
            object2 = String.format((String)"%02x", (Object[])Arrays.copyOf((Object[])new Object[]{by}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(format, *args)");
            stringBuffer.append((String)object2);
        }
        object = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(object, "sb.toString()");
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String d() {
        Object object = B.l();
        try {
            object = object.getPackageManager().getPackageInfo((String)object.getPackageName(), (int)0).versionName;
            Intrinsics.checkNotNullExpressionValue(object, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return object;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return "";
        }
    }

    public static final View e(Activity activity) {
        block6 : {
            if (a.d(g.class)) {
                return null;
            }
            if (activity == null) {
                return null;
            }
            activity = activity.getWindow();
            if (activity != null) break block6;
            return null;
        }
        try {
            activity = activity.getDecorView().getRootView();
            return activity;
        }
        catch (Throwable throwable) {
            a.b(throwable, g.class);
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static final boolean f() {
        boolean bl;
        block4 : {
            block2 : {
                block3 : {
                    String string2 = Build.FINGERPRINT;
                    Intrinsics.checkNotNullExpressionValue(string2, "FINGERPRINT");
                    bl = false;
                    if (i.s(string2, "generic", false, 2, null)) break block2;
                    Intrinsics.checkNotNullExpressionValue(string2, "FINGERPRINT");
                    if (i.s(string2, "unknown", false, 2, null)) break block2;
                    string2 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(string2, "MODEL");
                    if (i.v(string2, "google_sdk", false, 2, null)) break block2;
                    Intrinsics.checkNotNullExpressionValue(string2, "MODEL");
                    if (i.v(string2, "Emulator", false, 2, null)) break block2;
                    Intrinsics.checkNotNullExpressionValue(string2, "MODEL");
                    if (i.v(string2, "Android SDK built for x86", false, 2, null)) break block2;
                    string2 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(string2, "MANUFACTURER");
                    if (i.v(string2, "Genymotion", false, 2, null)) break block2;
                    string2 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(string2, "BRAND");
                    if (!i.s(string2, "generic", false, 2, null)) break block3;
                    string2 = Build.DEVICE;
                    Intrinsics.checkNotNullExpressionValue(string2, "DEVICE");
                    if (i.s(string2, "generic", false, 2, null)) break block2;
                }
                if (!Intrinsics.a("google_sdk", Build.PRODUCT)) break block4;
            }
            bl = true;
        }
        return bl;
    }

    public static final double g(String string2) {
        double d8 = 0.0;
        try {
            string2 = Pattern.compile((String)"[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", (int)8).matcher((CharSequence)string2);
            if (string2.find()) {
                string2 = string2.group(0);
                d8 = NumberFormat.getNumberInstance((Locale)P.A()).parse(string2).doubleValue();
            }
            return d8;
        }
        catch (ParseException parseException) {
            return 0.0;
        }
    }
}

