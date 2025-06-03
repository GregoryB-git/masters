package j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a0 implements b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f8549g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f8550h = Pattern.quote(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);

    /* renamed from: a, reason: collision with root package name */
    public final n7.f f8551a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8553c;

    /* renamed from: d, reason: collision with root package name */
    public final u9.d f8554d;

    /* renamed from: e, reason: collision with root package name */
    public final w f8555e;
    public c f;

    public a0(Context context, String str, u9.d dVar, w wVar) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f8552b = context;
        this.f8553c = str;
        this.f8554d = dVar;
        this.f8555e = wVar;
        this.f8551a = new n7.f();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f8549g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j8.z b(boolean r7) {
        /*
            r6 = this;
            k8.i$a r0 = k8.i.f9139d
            r0.getClass()
            k8.g r1 = new k8.g
            r1.<init>(r0)
            k8.h r0 = k8.h.f9138a
            k8.i.a.a(r1, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 0
            if (r7 == 0) goto L2f
            u9.d r7 = r6.f8554d     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r7 = r7.a()     // Catch: java.lang.Exception -> L29
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = com.google.android.gms.tasks.Tasks.await(r7, r0, r4)     // Catch: java.lang.Exception -> L29
            u9.h r7 = (u9.h) r7     // Catch: java.lang.Exception -> L29
            java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L29
            goto L30
        L29:
            r7 = move-exception
            java.lang.String r4 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r4, r7)
        L2f:
            r7 = r3
        L30:
            u9.d r4 = r6.f8554d     // Catch: java.lang.Exception -> L40
            com.google.android.gms.tasks.Task r4 = r4.getId()     // Catch: java.lang.Exception -> L40
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r4, r0, r5)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L40
            r3 = r0
            goto L46
        L40:
            r0 = move-exception
            java.lang.String r1 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r1, r0)
        L46:
            j8.z r0 = new j8.z
            r0.<init>(r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.a0.b(boolean):j8.z");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:12:0x001c, B:16:0x0020, B:18:0x0052, B:20:0x0070, B:22:0x0074, B:23:0x008f, B:25:0x0092, B:27:0x009a, B:28:0x00b9, B:29:0x00fa, B:32:0x00aa, B:34:0x00be, B:38:0x00ca, B:39:0x00f8, B:40:0x00d6), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:12:0x001c, B:16:0x0020, B:18:0x0052, B:20:0x0070, B:22:0x0074, B:23:0x008f, B:25:0x0092, B:27:0x009a, B:28:0x00b9, B:29:0x00fa, B:32:0x00aa, B:34:0x00be, B:38:0x00ca, B:39:0x00f8, B:40:0x00d6), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized j8.b0.a c() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.a0.c():j8.b0$a");
    }

    public final String d() {
        String str;
        n7.f fVar = this.f8551a;
        Context context = this.f8552b;
        synchronized (fVar) {
            if (fVar.f11287a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                fVar.f11287a = installerPackageName;
            }
            str = "".equals(fVar.f11287a) ? null : fVar.f11287a;
        }
        return str;
    }
}
