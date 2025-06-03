package j6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import m6.u0;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8489a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f8490b;

    static {
        AtomicBoolean atomicBoolean = j.f8500a;
        f8489a = 12451000;
        f8490b = new f();
    }

    public Intent a(Context context, String str, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = u0.f10328a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && x6.b.f0(context)) {
            int i12 = u0.f10328a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder l10 = defpackage.f.l("gcore_");
        l10.append(f8489a);
        l10.append("-");
        if (!TextUtils.isEmpty(str)) {
            l10.append(str);
        }
        l10.append("-");
        if (context != null) {
            l10.append(context.getPackageName());
        }
        l10.append("-");
        if (context != null) {
            try {
                l10.append(x6.d.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = l10.toString();
        int i13 = u0.f10328a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context) {
        return c(context, f8489a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|38|(4:40|(3:42|(1:48)(1:46)|47)|49|(12:51|(1:53)(1:106)|54|(2:102|103)(1:56)|57|58|59|(1:61)(2:(2:72|(1:74))|(7:80|(1:82)(1:99)|(1:84)|(1:86)(4:87|(2:93|94)|89|(1:91)(1:92))|63|(1:(1:66)(1:67))|(1:69)(1:70))(1:79))|62|63|(0)|(0)(0)))|107|(0)(0)|54|(0)(0)|57|58|59|(0)(0)|62|63|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.f.c(android.content.Context, int):int");
    }
}
