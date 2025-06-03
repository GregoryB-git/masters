package o8;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import k8.e;
import k8.f;
import k8.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12076a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f12077b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12078c = new HashMap();

    public a(String str, HashMap hashMap) {
        this.f12076a = str;
        this.f12077b = hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        r5 = java.net.URLEncoder.encode((java.lang.String) r3.getValue(), "UTF-8");
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        r8 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (r8.isEmpty() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r7.contains("?") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r7.endsWith("&") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r8 = defpackage.g.d("&", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        return defpackage.g.d(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        return defpackage.g.e(r7, "?", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r5 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0029, code lost:
    
        if (r1.getValue() != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002c, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r0.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r8.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r3 = (java.util.Map.Entry) r8.next();
        r0.append("&");
        r0.append((java.lang.String) r3.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r3.getValue() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0063 -> B:3:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r7, java.util.Map r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = ""
            if (r3 == 0) goto L2c
            goto L55
        L2c:
            r1 = r5
        L2d:
            r0.append(r5)
            boolean r3 = r8.hasNext()
            java.lang.String r5 = "&"
            if (r3 == 0) goto L65
            java.lang.Object r3 = r8.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r0.append(r5)
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            r0.append(r2)
            java.lang.Object r5 = r3.getValue()
            if (r5 == 0) goto L63
            r5 = r1
            r1 = r3
        L55:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r4)
            r6 = r5
            r5 = r1
            r1 = r6
            goto L2d
        L63:
            r5 = r1
            goto L2c
        L65:
            java.lang.String r8 = r0.toString()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L70
            return r7
        L70:
            java.lang.String r0 = "?"
            boolean r1 = r7.contains(r0)
            if (r1 == 0) goto L87
            boolean r0 = r7.endsWith(r5)
            if (r0 != 0) goto L82
            java.lang.String r8 = defpackage.g.d(r5, r8)
        L82:
            java.lang.String r7 = defpackage.g.d(r7, r8)
            return r7
        L87:
            java.lang.String r7 = defpackage.g.e(r7, r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.a.a(java.lang.String, java.util.Map):java.lang.String");
    }

    public final b b() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        i.a aVar = i.f9139d;
        aVar.getClass();
        i.a.a(new e(aVar), f.f9137a);
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            String a10 = a(this.f12076a, this.f12077b);
            String str = "GET Request URL: " + a10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(a10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f12078c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new b(responseCode, sb2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }
}
