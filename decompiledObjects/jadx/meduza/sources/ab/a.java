package ab;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    public Context f384a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f385b;

    public static String b(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        i.b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = digest[i10] & 255;
            int i12 = i10 * 2;
            cArr2[i12] = cArr[i11 >>> 4];
            cArr2[i12 + 1] = cArr[i11 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if ((r6.length == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.pm.PackageManager r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L92
            r2 = 28
            java.lang.String r3 = "toByteArray(...)"
            if (r1 < r2) goto L59
            android.content.Context r1 = r5.f384a     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            ec.i.b(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            android.content.pm.SigningInfo r6 = r6.signingInfo     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            if (r6 != 0) goto L1d
            return r0
        L1d:
            boolean r1 = r6.hasMultipleSigners()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            if (r1 == 0) goto L3e
            android.content.pm.Signature[] r6 = r6.getApkContentsSigners()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r1 = "getApkContentsSigners(...)"
            ec.i.d(r6, r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.Object r6 = sb.k.o(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            android.content.pm.Signature r6 = (android.content.pm.Signature) r6     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            ec.i.d(r6, r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r6 = b(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            goto L91
        L3e:
            android.content.pm.Signature[] r6 = r6.getSigningCertificateHistory()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r1 = "getSigningCertificateHistory(...)"
            ec.i.d(r6, r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.Object r6 = sb.k.o(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            android.content.pm.Signature r6 = (android.content.pm.Signature) r6     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            ec.i.d(r6, r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r6 = b(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            goto L91
        L59:
            android.content.Context r1 = r5.f384a     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            ec.i.b(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            r2 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L76
            int r4 = r6.length     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            if (r4 != 0) goto L73
            r4 = r2
            goto L74
        L73:
            r4 = r1
        L74:
            if (r4 == 0) goto L77
        L76:
            r1 = r2
        L77:
            if (r1 != 0) goto L92
            java.lang.Object r1 = sb.k.o(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            if (r1 != 0) goto L80
            goto L92
        L80:
            java.lang.Object r6 = sb.k.o(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            android.content.pm.Signature r6 = (android.content.pm.Signature) r6     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            ec.i.d(r6, r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r6 = b(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
        L91:
            r0 = r6
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.a.a(android.content.pm.PackageManager):java.lang.String");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        this.f384a = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f385b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        this.f384a = null;
        MethodChannel methodChannel = this.f385b;
        i.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f385b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        CharSequence loadLabel;
        i.e(methodCall, "call");
        i.e(result, "result");
        try {
            if (!i.a(methodCall.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f384a;
            i.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f384a;
            i.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String a10 = a(packageManager);
            Context context3 = this.f384a;
            i.b(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f384a;
            i.b(context4);
            String packageName = context4.getPackageName();
            int i10 = Build.VERSION.SDK_INT;
            String initiatingPackageName = i10 >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            HashMap hashMap = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str2 = "";
            if (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null || (str = loadLabel.toString()) == null) {
                str = "";
            }
            hashMap.put("appName", str);
            Context context5 = this.f384a;
            i.b(context5);
            hashMap.put("packageName", context5.getPackageName());
            String str3 = packageInfo.versionName;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("version", str2);
            hashMap.put("buildNumber", String.valueOf(i10 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (a10 != null) {
                hashMap.put("buildSignature", a10);
            }
            if (initiatingPackageName != null) {
                hashMap.put("installerStore", initiatingPackageName);
            }
            result.success(hashMap);
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), null);
        }
    }
}
