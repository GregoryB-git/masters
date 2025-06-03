package com.jhomlala.better_player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import ec.i;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.FileOutputStream;
import java.util.HashMap;
import pa.j;

/* loaded from: classes.dex */
public final class ImageWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "context");
        i.e(workerParameters, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        android.util.Log.e("ImageWorker", "Failed to close bitmap input stream/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r5 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        if (r5 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap k(java.lang.String r10) {
        /*
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            java.lang.String r1 = "Failed to close bitmap input stream/"
            java.lang.String r2 = "ImageWorker"
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.net.URLConnection r5 = r4.openConnection()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            ec.i.c(r5, r0)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            r6.<init>()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            r7 = 1
            r6.inJustDecodeBounds = r7     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            r5.close()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            ec.i.c(r4, r0)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            int r0 = r6.outHeight     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            int r4 = r6.outWidth     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            r8 = 256(0x100, float:3.59E-43)
            if (r0 > r8) goto L3e
            if (r4 <= r8) goto L4d
        L3e:
            int r0 = r0 / 2
            int r4 = r4 / 2
        L42:
            int r9 = r0 / r7
            if (r9 < r8) goto L4d
            int r9 = r4 / r7
            if (r9 < r8) goto L4d
            int r7 = r7 * 2
            goto L42
        L4d:
            r6.inSampleSize = r7     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            r0 = 0
            r6.inJustDecodeBounds = r0     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7a
            if (r5 == 0) goto L79
            goto L72
        L59:
            r10 = move-exception
            goto L7c
        L5b:
            r5 = r3
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "Failed to get bitmap from external url: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L7a
            r0.append(r10)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            android.util.Log.e(r2, r10)     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L79
        L72:
            r5.close()     // Catch: java.lang.Exception -> L76
            goto L79
        L76:
            android.util.Log.e(r2, r1)
        L79:
            return r3
        L7a:
            r10 = move-exception
            r3 = r5
        L7c:
            if (r3 == 0) goto L85
            r3.close()     // Catch: java.lang.Exception -> L82
            goto L85
        L82:
            android.util.Log.e(r2, r1)
        L85:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhomlala.better_player.ImageWorker.k(java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap l(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i10 = 1;
            options.inJustDecodeBounds = true;
            int i11 = options.outHeight;
            int i12 = options.outWidth;
            if (i11 > 256 || i12 > 256) {
                int i13 = i11 / 2;
                int i14 = i12 / 2;
                while (i13 / i10 >= 256 && i14 / i10 >= 256) {
                    i10 *= 2;
                }
            }
            options.inSampleSize = i10;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str);
        } catch (Exception unused) {
            Log.e("ImageWorker", "Failed to get bitmap from internal url: " + str);
            return null;
        }
    }

    @Override // androidx.work.Worker
    public final d.a j() {
        try {
            String d10 = this.f1458b.f1436b.d(WebViewActivity.URL_EXTRA);
            if (d10 == null) {
                return new d.a.C0024a();
            }
            Bitmap k10 = j.b(Uri.parse(d10)) ? k(d10) : l(d10);
            String str = this.f1457a.getCacheDir().getAbsolutePath() + (d10.hashCode() + ".png");
            if (k10 == null) {
                return new d.a.C0024a();
            }
            k10.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(str));
            HashMap hashMap = new HashMap();
            hashMap.put("filePath", str);
            c cVar = new c(hashMap);
            c.e(cVar);
            return new d.a.c(cVar);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new d.a.C0024a();
        }
    }
}
