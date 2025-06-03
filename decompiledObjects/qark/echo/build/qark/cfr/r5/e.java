/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.content.pm.SigningInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.HashMap
 */
package r5;

import A5.a;
import E5.j;
import E5.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.appsflyer.internal.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import r5.b;
import r5.c;
import r5.d;

public final class e
implements k.c,
A5.a {
    public static final a c = new a(null);
    public Context a;
    public k b;

    public final String a(byte[] arrby) {
        char[] arrc;
        char[] arrc2 = arrc = new char[16];
        arrc2[0] = 48;
        arrc2[1] = 49;
        arrc2[2] = 50;
        arrc2[3] = 51;
        arrc2[4] = 52;
        arrc2[5] = 53;
        arrc2[6] = 54;
        arrc2[7] = 55;
        arrc2[8] = 56;
        arrc2[9] = 57;
        arrc2[10] = 65;
        arrc2[11] = 66;
        arrc2[12] = 67;
        arrc2[13] = 68;
        arrc2[14] = 69;
        arrc2[15] = 70;
        char[] arrc3 = new char[arrby.length * 2];
        int n8 = arrby.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            byte by = arrby[i8];
            int n9 = i8 * 2;
            arrc3[n9] = arrc[(by & 255) >>> 4];
            arrc3[n9 + 1] = arrc[by & 15];
        }
        return new String(arrc3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String b(PackageManager var1_1) {
        var3_3 = null;
        var2_4 = Build.VERSION.SDK_INT;
        if (var2_4 < 28) ** GOTO lbl22
        try {
            var3_3 = this.a;
            Intrinsics.b((Object)var3_3);
            var1_1 = r5.a.a(var1_1.getPackageInfo(var3_3.getPackageName(), 134217728));
            if (var1_1 == null) {
                return null;
            }
            if (b.a((SigningInfo)var1_1)) {
                var1_1 = c.a((SigningInfo)var1_1);
                Intrinsics.checkNotNullExpressionValue(var1_1, "getApkContentsSigners(...)");
                var1_1 = ((Signature)W5.g.i((Object[])var1_1)).toByteArray();
                Intrinsics.checkNotNullExpressionValue(var1_1, "toByteArray(...)");
                return this.e((byte[])var1_1);
            }
            var1_1 = d.a((SigningInfo)var1_1);
            Intrinsics.checkNotNullExpressionValue(var1_1, "getSigningCertificateHistory(...)");
            var1_1 = ((Signature)W5.g.i((Object[])var1_1)).toByteArray();
            Intrinsics.checkNotNullExpressionValue(var1_1, "toByteArray(...)");
            return this.e((byte[])var1_1);
lbl22: // 1 sources:
            var4_5 = this.a;
            Intrinsics.b(var4_5);
            var4_5 = var1_1.getPackageInfo((String)var4_5.getPackageName(), (int)64).signatures;
            var1_1 = var3_3;
            if (var4_5 == null) return var1_1;
            if (var4_5.length == 0) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(var4_5, "signatures");
            if (W5.g.i(var4_5) == null) {
                return null;
            }
            var1_1 = ((Signature)W5.g.i(var4_5)).toByteArray();
            Intrinsics.checkNotNullExpressionValue(var1_1, "toByteArray(...)");
            return this.e((byte[])var1_1);
        }
        catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException var1_2) {
            return null;
        }
    }

    public final String c() {
        Context context = this.a;
        Intrinsics.b((Object)context);
        context = context.getPackageManager();
        Object object = this.a;
        Intrinsics.b(object);
        object = object.getPackageName();
        if (Build.VERSION.SDK_INT >= 30) {
            return l.a(com.appsflyer.internal.k.a((PackageManager)context, (String)object));
        }
        return context.getInstallerPackageName((String)object);
    }

    public final long d(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return com.appsflyer.internal.g.a(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public final String e(byte[] arrby) {
        MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA1");
        messageDigest.update(arrby);
        arrby = messageDigest.digest();
        Intrinsics.b(arrby);
        return this.a(arrby);
    }

    @Override
    public void onAttachedToEngine(a.b object) {
        Intrinsics.checkNotNullParameter(object, "binding");
        this.a = object.a();
        this.b = object = new k(object.b(), "dev.fluttercommunity.plus/package_info");
        Intrinsics.b(object);
        object.e(this);
    }

    @Override
    public void onDetachedFromEngine(a.b object) {
        Intrinsics.checkNotNullParameter(object, "binding");
        this.a = null;
        object = this.b;
        Intrinsics.b(object);
        object.e(null);
        this.b = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onMethodCall(j j8, k.d d8) {
        Intrinsics.checkNotNullParameter(j8, "call");
        Intrinsics.checkNotNullParameter(d8, "result");
        try {
            if (!Intrinsics.a(j8.a, "getAll")) {
                d8.c();
                return;
            }
            j8 = this.a;
            Intrinsics.b(j8);
            j8 = j8.getPackageManager();
            Context context = this.a;
            Intrinsics.b((Object)context);
            context = j8.getPackageInfo(context.getPackageName(), 0);
            Intrinsics.b(j8);
            String string2 = this.b((PackageManager)j8);
            String string3 = this.c();
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"appName", (Object)context.applicationInfo.loadLabel((PackageManager)j8).toString());
            j8 = this.a;
            Intrinsics.b(j8);
            hashMap.put((Object)"packageName", (Object)j8.getPackageName());
            hashMap.put((Object)"version", (Object)context.versionName);
            Intrinsics.b((Object)context);
            hashMap.put((Object)"buildNumber", (Object)String.valueOf((long)this.d((PackageInfo)context)));
            if (string2 != null) {
                hashMap.put((Object)"buildSignature", (Object)string2);
            }
            if (string3 != null) {
                hashMap.put((Object)"installerStore", (Object)string3);
            }
            d8.a((Object)hashMap);
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        d8.b("Name not found", nameNotFoundException.getMessage(), null);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

