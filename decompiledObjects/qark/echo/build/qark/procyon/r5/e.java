// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r5;

import android.content.pm.PackageItemInfo;
import java.util.HashMap;
import E5.j;
import java.security.MessageDigest;
import android.content.pm.PackageInfo;
import com.appsflyer.internal.l;
import android.content.pm.SigningInfo;
import java.security.NoSuchAlgorithmException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import kotlin.jvm.internal.Intrinsics;
import android.os.Build$VERSION;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.g;
import android.content.Context;
import A5.a;
import E5.k;

public final class e implements c, A5.a
{
    public static final a c;
    public Context a;
    public k b;
    
    static {
        c = new a(null);
    }
    
    public final String a(final byte[] array) {
        final char[] array3;
        final char[] array2 = array3 = new char[16];
        array3[0] = '0';
        array3[1] = '1';
        array3[2] = '2';
        array3[3] = '3';
        array3[4] = '4';
        array3[5] = '5';
        array3[6] = '6';
        array3[7] = '7';
        array3[8] = '8';
        array3[9] = '9';
        array3[10] = 'A';
        array3[11] = 'B';
        array3[12] = 'C';
        array3[13] = 'D';
        array3[14] = 'E';
        array3[15] = 'F';
        final char[] value = new char[array.length * 2];
        for (int length = array.length, i = 0; i < length; ++i) {
            final byte b = array[i];
            final int n = i * 2;
            value[n] = array2[(b & 0xFF) >>> 4];
            value[n + 1] = array2[b & 0xF];
        }
        return new String(value);
    }
    
    public final String b(final PackageManager packageManager) {
        final String s = null;
        try {
            if (Build$VERSION.SDK_INT < 28) {
                final Context a = this.a;
                Intrinsics.b(a);
                final Signature[] signatures = packageManager.getPackageInfo(a.getPackageName(), 64).signatures;
                String e = s;
                if (signatures != null) {
                    if (signatures.length == 0) {
                        return null;
                    }
                    Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                    if (W5.g.i(signatures) == null) {
                        return null;
                    }
                    final byte[] byteArray = ((Signature)W5.g.i(signatures)).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    e = this.e(byteArray);
                }
                return e;
            }
            final Context a2 = this.a;
            Intrinsics.b(a2);
            final SigningInfo a3 = r5.a.a(packageManager.getPackageInfo(a2.getPackageName(), 134217728));
            if (a3 == null) {
                return null;
            }
            if (r5.b.a(a3)) {
                final Signature[] a4 = r5.c.a(a3);
                Intrinsics.checkNotNullExpressionValue(a4, "getApkContentsSigners(...)");
                final byte[] byteArray2 = ((Signature)W5.g.i(a4)).toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
                return this.e(byteArray2);
            }
            final Signature[] a5 = r5.d.a(a3);
            Intrinsics.checkNotNullExpressionValue(a5, "getSigningCertificateHistory(...)");
            final byte[] byteArray3 = ((Signature)W5.g.i(a5)).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray3, "toByteArray(...)");
            return this.e(byteArray3);
        }
        catch (PackageManager$NameNotFoundException | NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    public final String c() {
        final Context a = this.a;
        Intrinsics.b(a);
        final PackageManager packageManager = a.getPackageManager();
        final Context a2 = this.a;
        Intrinsics.b(a2);
        final String packageName = a2.getPackageName();
        if (Build$VERSION.SDK_INT >= 30) {
            return l.a(com.appsflyer.internal.k.a(packageManager, packageName));
        }
        return packageManager.getInstallerPackageName(packageName);
    }
    
    public final long d(final PackageInfo packageInfo) {
        if (Build$VERSION.SDK_INT >= 28) {
            return com.appsflyer.internal.g.a(packageInfo);
        }
        return packageInfo.versionCode;
    }
    
    public final String e(byte[] digest) {
        final MessageDigest instance = MessageDigest.getInstance("SHA1");
        instance.update(digest);
        digest = instance.digest();
        Intrinsics.b(digest);
        return this.a(digest);
    }
    
    @Override
    public void onAttachedToEngine(final A5.a.b b) {
        Intrinsics.checkNotNullParameter(b, "binding");
        this.a = b.a();
        final k b2 = new k(b.b(), "dev.fluttercommunity.plus/package_info");
        Intrinsics.b(this.b = b2);
        b2.e((k.c)this);
    }
    
    @Override
    public void onDetachedFromEngine(final A5.a.b b) {
        Intrinsics.checkNotNullParameter(b, "binding");
        this.a = null;
        final k b2 = this.b;
        Intrinsics.b(b2);
        b2.e(null);
        this.b = null;
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        Intrinsics.checkNotNullParameter(j, "call");
        Intrinsics.checkNotNullParameter(d, "result");
        while (true) {
            try {
                if (Intrinsics.a(j.a, "getAll")) {
                    final Context a = this.a;
                    Intrinsics.b(a);
                    final PackageManager packageManager = a.getPackageManager();
                    final Context a2 = this.a;
                    Intrinsics.b(a2);
                    final PackageInfo packageInfo = packageManager.getPackageInfo(a2.getPackageName(), 0);
                    Intrinsics.b(packageManager);
                    final String b = this.b(packageManager);
                    final String c = this.c();
                    final HashMap<String, String> hashMap = new HashMap<String, String>();
                    hashMap.put("appName", ((PackageItemInfo)packageInfo.applicationInfo).loadLabel(packageManager).toString());
                    final Context a3 = this.a;
                    Intrinsics.b(a3);
                    hashMap.put("packageName", a3.getPackageName());
                    hashMap.put("version", packageInfo.versionName);
                    Intrinsics.b(packageInfo);
                    hashMap.put("buildNumber", String.valueOf(this.d(packageInfo)));
                    if (b != null) {
                        hashMap.put("buildSignature", b);
                    }
                    if (c != null) {
                        hashMap.put("installerStore", c);
                    }
                    d.a(hashMap);
                    return;
                }
                d.c();
                return;
                final PackageManager$NameNotFoundException ex;
                d.b("Name not found", ((Throwable)ex).getMessage(), null);
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final class a
    {
    }
}
