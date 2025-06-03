package okhttp3.internal.http;

import okhttp3.Response;
import xc.i;

/* loaded from: classes.dex */
public final class HttpHeaders {
    static {
        i iVar = i.f17259d;
        i.a.a("\"\\");
        i.a.a("\t ,=");
    }

    private HttpHeaders() {
    }

    public static long a(Response response) {
        String c10 = response.f.c("Content-Length");
        if (c10 != null) {
            try {
                return Long.parseLong(c10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static boolean b(Response response) {
        if (response.f12335a.f12322b.equals("HEAD")) {
            return false;
        }
        int i10 = response.f12337c;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && a(response) == -1 && !"chunked".equalsIgnoreCase(response.g("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i10, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0113, code lost:
    
        if (r19 <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0226, code lost:
    
        if (r11 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0345, code lost:
    
        if (r0 != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0237, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0235, code lost:
    
        if (r11 == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01f3, code lost:
    
        if ((r0.equals(r14) || (r0.endsWith(r14) && r0.charAt((r0.length() - r14.length()) - 1) == '.' && !okhttp3.internal.Util.f12387q.matcher(r0).matches())) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x039a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(okhttp3.CookieJar r33, okhttp3.HttpUrl r34, okhttp3.Headers r35) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static int e(int i10, String str, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }
}
