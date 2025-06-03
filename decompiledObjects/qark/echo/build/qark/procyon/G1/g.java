// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import java.util.regex.Matcher;
import java.text.ParseException;
import java.text.NumberFormat;
import O1.P;
import java.util.regex.Pattern;
import kotlin.text.i;
import android.os.Build;
import android.view.Window;
import T1.a;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import x1.B;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.Intrinsics;

public final class g
{
    public static final g a;
    
    static {
        a = new g();
    }
    
    public static final void a() {
    }
    
    public static final void b() {
    }
    
    public static final String c(final byte[] array) {
        Intrinsics.checkNotNullParameter(array, "bytes");
        final StringBuffer sb = new StringBuffer();
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final byte b = array[i];
            ++i;
            final x a = x.a;
            final String format = String.format("%02x", Arrays.copyOf(new Object[] { b }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
    
    public static final String d() {
        final Context l = B.l();
        try {
            final String versionName = l.getPackageManager().getPackageInfo(l.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(versionName, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return "";
        }
    }
    
    public static final View e(final Activity activity) {
        if (T1.a.d(g.class)) {
            return null;
        }
        if (activity == null) {
            return null;
        }
        try {
            final Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        }
        catch (Exception ex) {
            return null;
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
            return null;
        }
    }
    
    public static final boolean f() {
        final String fingerprint = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(fingerprint, "FINGERPRINT");
        boolean b = false;
        if (!i.s(fingerprint, "generic", false, 2, null)) {
            Intrinsics.checkNotNullExpressionValue(fingerprint, "FINGERPRINT");
            if (!i.s(fingerprint, "unknown", false, 2, null)) {
                final String model = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(model, "MODEL");
                if (!i.v(model, "google_sdk", false, 2, null)) {
                    Intrinsics.checkNotNullExpressionValue(model, "MODEL");
                    if (!i.v(model, "Emulator", false, 2, null)) {
                        Intrinsics.checkNotNullExpressionValue(model, "MODEL");
                        if (!i.v(model, "Android SDK built for x86", false, 2, null)) {
                            final String manufacturer = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(manufacturer, "MANUFACTURER");
                            if (!i.v(manufacturer, "Genymotion", false, 2, null)) {
                                final String brand = Build.BRAND;
                                Intrinsics.checkNotNullExpressionValue(brand, "BRAND");
                                if (i.s(brand, "generic", false, 2, null)) {
                                    final String device = Build.DEVICE;
                                    Intrinsics.checkNotNullExpressionValue(device, "DEVICE");
                                    if (i.s(device, "generic", false, 2, null)) {
                                        return true;
                                    }
                                }
                                if (!Intrinsics.a("google_sdk", Build.PRODUCT)) {
                                    return b;
                                }
                            }
                        }
                    }
                }
            }
        }
        b = true;
        return b;
    }
    
    public static final double g(String group) {
        double doubleValue = 0.0;
        try {
            final Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(group);
            if (matcher.find()) {
                group = matcher.group(0);
                doubleValue = NumberFormat.getNumberInstance(P.A()).parse(group).doubleValue();
            }
            return doubleValue;
        }
        catch (ParseException ex) {
            return 0.0;
        }
    }
}
