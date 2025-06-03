package r5;

import A5.a;
import E5.j;
import E5.k;
import W5.C0681k;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

/* renamed from: r5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927e implements k.c, A5.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19079c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public Context f19080a;

    /* renamed from: b, reason: collision with root package name */
    public k f19081b;

    /* renamed from: r5.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            byte b7 = bArr[i7];
            int i8 = i7 * 2;
            cArr2[i8] = cArr[(b7 & 255) >>> 4];
            cArr2[i8 + 1] = cArr[b7 & 15];
        }
        return new String(cArr2);
    }

    public final String b(PackageManager packageManager) {
        Object i7;
        Object i8;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Object i9;
        Signature[] apkContentsSigners;
        Object i10;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f19080a;
                Intrinsics.b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "getApkContentsSigners(...)");
                    i10 = C0681k.i(apkContentsSigners);
                    byte[] byteArray = ((Signature) i10).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    str = e(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    i9 = C0681k.i(signingCertificateHistory);
                    byte[] byteArray2 = ((Signature) i9).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
                    str = e(byteArray2);
                }
            } else {
                Context context2 = this.f19080a;
                Intrinsics.b(context2);
                Signature[] signatures = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatures != null && signatures.length != 0) {
                    Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                    i7 = C0681k.i(signatures);
                    if (i7 != null) {
                        i8 = C0681k.i(signatures);
                        byte[] byteArray3 = ((Signature) i8).toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray3, "toByteArray(...)");
                        str = e(byteArray3);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    public final String c() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        Context context = this.f19080a;
        Intrinsics.b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f19080a;
        Intrinsics.b(context2);
        String packageName = context2.getPackageName();
        if (Build.VERSION.SDK_INT < 30) {
            return packageManager.getInstallerPackageName(packageName);
        }
        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
        return initiatingPackageName;
    }

    public final long d(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    public final String e(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        Intrinsics.b(digest);
        return a(digest);
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f19080a = binding.a();
        k kVar = new k(binding.b(), "dev.fluttercommunity.plus/package_info");
        this.f19081b = kVar;
        Intrinsics.b(kVar);
        kVar.e(this);
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f19080a = null;
        k kVar = this.f19081b;
        Intrinsics.b(kVar);
        kVar.e(null);
        this.f19081b = null;
    }

    @Override // E5.k.c
    public void onMethodCall(j call, k.d result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            if (!Intrinsics.a(call.f1670a, "getAll")) {
                result.c();
                return;
            }
            Context context = this.f19080a;
            Intrinsics.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f19080a;
            Intrinsics.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            Intrinsics.b(packageManager);
            String b7 = b(packageManager);
            String c7 = c();
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f19080a;
            Intrinsics.b(context3);
            hashMap.put("packageName", context3.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            Intrinsics.b(packageInfo);
            hashMap.put("buildNumber", String.valueOf(d(packageInfo)));
            if (b7 != null) {
                hashMap.put("buildSignature", b7);
            }
            if (c7 != null) {
                hashMap.put("installerStore", c7);
            }
            result.a(hashMap);
        } catch (PackageManager.NameNotFoundException e7) {
            result.b("Name not found", e7.getMessage(), null);
        }
    }
}
