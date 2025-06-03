package okhttp3.internal;

import defpackage.f;
import defpackage.g;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import xc.h;
import xc.i;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12372a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12373b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseBody f12374c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f12375d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f12376e;
    public static final i f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f12377g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f12378h;

    /* renamed from: i, reason: collision with root package name */
    public static final Charset f12379i;

    /* renamed from: j, reason: collision with root package name */
    public static final Charset f12380j;

    /* renamed from: k, reason: collision with root package name */
    public static final Charset f12381k;

    /* renamed from: l, reason: collision with root package name */
    public static final Charset f12382l;

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f12383m;

    /* renamed from: n, reason: collision with root package name */
    public static final TimeZone f12384n;

    /* renamed from: o, reason: collision with root package name */
    public static final Comparator<String> f12385o;

    /* renamed from: p, reason: collision with root package name */
    public static final Method f12386p;

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f12387q;

    static {
        byte[] bArr = new byte[0];
        f12372a = bArr;
        f12374c = ResponseBody.C(bArr);
        Method method = null;
        RequestBody.c(null, bArr);
        f12375d = i.g("efbbbf");
        f12376e = i.g("feff");
        f = i.g("fffe");
        f12377g = i.g("0000ffff");
        f12378h = i.g("ffff0000");
        f12379i = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        f12380j = Charset.forName("UTF-16BE");
        f12381k = Charset.forName("UTF-16LE");
        f12382l = Charset.forName("UTF-32BE");
        f12383m = Charset.forName("UTF-32LE");
        f12384n = TimeZone.getTimeZone("GMT");
        f12385o = new Comparator<String>() { // from class: okhttp3.internal.Util.1
            @Override // java.util.Comparator
            public final int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f12386p = method;
        f12387q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private Util() {
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset b(h hVar, Charset charset) {
        if (hVar.K(f12375d)) {
            hVar.skip(r0.f17260a.length);
            return f12379i;
        }
        if (hVar.K(f12376e)) {
            hVar.skip(r0.f17260a.length);
            return f12380j;
        }
        if (hVar.K(f)) {
            hVar.skip(r0.f17260a.length);
            return f12381k;
        }
        if (hVar.K(f12377g)) {
            hVar.skip(r0.f17260a.length);
            return f12382l;
        }
        if (!hVar.K(f12378h)) {
            return charset;
        }
        hVar.skip(r0.f17260a.length);
        return f12383m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d1, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.c(java.lang.String):java.lang.String");
    }

    public static int d(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void f(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!q(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                if (!"bio == null".equals(e11.getMessage())) {
                    throw e11;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static int g(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r7 == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r8 != (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009a, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress h(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.h(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int i(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int j(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String l(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String m(HttpUrl httpUrl, boolean z10) {
        String f10 = httpUrl.f12248d.contains(":") ? g.f(f.l("["), httpUrl.f12248d, "]") : httpUrl.f12248d;
        if (!z10 && httpUrl.f12249e == HttpUrl.c(httpUrl.f12245a)) {
            return f10;
        }
        StringBuilder g10 = g.g(f10, ":");
        g10.append(httpUrl.f12249e);
        return g10.toString();
    }

    public static <T> List<T> n(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> o(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static String[] p(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean q(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean r(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean s(y yVar, int i10, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c10 = yVar.c().e() ? yVar.c().c() - nanoTime : Long.MAX_VALUE;
        yVar.c().d(Math.min(c10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            xc.f fVar = new xc.f();
            while (yVar.e0(fVar, 8192L) != -1) {
                fVar.f();
            }
            z c11 = yVar.c();
            if (c10 == Long.MAX_VALUE) {
                c11.a();
            } else {
                c11.d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            z c12 = yVar.c();
            if (c10 == Long.MAX_VALUE) {
                c12.a();
            } else {
                c12.d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            z c13 = yVar.c();
            if (c10 == Long.MAX_VALUE) {
                c13.a();
            } else {
                c13.d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static int t(int i10, int i11, String str) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int u(int i10, int i11, String str) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static ThreadFactory v(final String str, final boolean z10) {
        return new ThreadFactory() { // from class: okhttp3.internal.Util.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z10);
                return thread;
            }
        };
    }

    public static Headers w(ArrayList arrayList) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            Internal.f12370a.b(builder, header.f12510a.t(), header.f12511b.t());
        }
        return new Headers(builder);
    }

    public static String x(int i10, int i11, String str) {
        int t = t(i10, i11, str);
        return str.substring(t, u(t, i11, str));
    }
}
