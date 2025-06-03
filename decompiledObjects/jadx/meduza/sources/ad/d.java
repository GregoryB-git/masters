package ad;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.io.File;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f407a = new d();

    public static Intent a(Context context, String str, File file) {
        Uri fromFile;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            fromFile = v.b.getUriForFile(context, context.getPackageName() + ".flutter_downloader.provider", file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        intent.setDataAndType(fromFile, str);
        intent.setFlags(268435456);
        intent.addFlags(1);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[Catch: all -> 0x0087, TryCatch #2 {, blocks: (B:3:0x0001, B:17:0x0035, B:19:0x0058, B:21:0x005e, B:32:0x003a, B:49:0x007e, B:47:0x0086, B:52:0x0083, B:39:0x004d, B:42:0x0052), top: B:2:0x0001, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:17:0x0035, B:19:0x0058, B:21:0x005e, B:32:0x003a, B:49:0x007e, B:47:0x0086, B:52:0x0083, B:39:0x004d, B:42:0x0052), top: B:2:0x0001, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.IOException, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.content.Intent b(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "path"
            ec.i.e(r7, r0)     // Catch: java.lang.Throwable -> L87
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L87
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L87
            android.content.Intent r8 = a(r6, r8, r0)     // Catch: java.lang.Throwable -> L87
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L87
            r2 = 0
            java.util.List r1 = r1.queryIntentActivities(r8, r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "queryIntentActivities(...)"
            ec.i.d(r1, r3)     // Catch: java.lang.Throwable -> L87
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L87
            r3 = 1
            if (r1 <= 0) goto L26
            r1 = r3
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 == 0) goto L2b
            monitor-exit(r5)
            return r8
        L2b:
            r8 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r4 = java.net.URLConnection.guessContentTypeFromStream(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r1.close()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L87
            goto L56
        L39:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L87
            goto L56
        L3e:
            r6 = move-exception
            r8 = r1
            goto L7c
        L41:
            r4 = move-exception
            goto L48
        L43:
            r6 = move-exception
            goto L7c
        L45:
            r1 = move-exception
            r4 = r1
            r1 = r8
        L48:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L87
            goto L55
        L51:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L87
        L55:
            r4 = r8
        L56:
            if (r4 != 0) goto L5c
            java.lang.String r4 = java.net.URLConnection.guessContentTypeFromName(r7)     // Catch: java.lang.Throwable -> L87
        L5c:
            if (r4 == 0) goto L7a
            android.content.Intent r7 = a(r6, r4, r0)     // Catch: java.lang.Throwable -> L87
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L87
            java.util.List r6 = r6.queryIntentActivities(r7, r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = "queryIntentActivities(...)"
            ec.i.d(r6, r0)     // Catch: java.lang.Throwable -> L87
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L87
            if (r6 <= 0) goto L76
            r2 = r3
        L76:
            if (r2 == 0) goto L7a
            monitor-exit(r5)
            return r7
        L7a:
            monitor-exit(r5)
            return r8
        L7c:
            if (r8 == 0) goto L86
            r8.close()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L87
            goto L86
        L82:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L87
        L86:
            throw r6     // Catch: java.lang.Throwable -> L87
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.d.b(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }
}
