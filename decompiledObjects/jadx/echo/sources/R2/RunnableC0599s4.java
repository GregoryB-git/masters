package R2;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.AbstractC0919h0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: R2.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0599s4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final URL f5529o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f5530p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0579p4 f5531q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5532r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f5533s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0586q4 f5534t;

    public RunnableC0599s4(C0586q4 c0586q4, String str, URL url, byte[] bArr, Map map, InterfaceC0579p4 interfaceC0579p4) {
        this.f5534t = c0586q4;
        AbstractC0328n.e(str);
        AbstractC0328n.i(url);
        AbstractC0328n.i(interfaceC0579p4);
        this.f5529o = url;
        this.f5530p = null;
        this.f5531q = interfaceC0579p4;
        this.f5532r = str;
        this.f5533s = null;
    }

    public final /* synthetic */ void a(int i7, Exception exc, byte[] bArr, Map map) {
        this.f5531q.a(this.f5532r, i7, exc, bArr, map);
    }

    public final void b(final int i7, final Exception exc, final byte[] bArr, final Map map) {
        this.f5534t.e().D(new Runnable() { // from class: R2.r4
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC0599s4.this.a(i7, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] v7;
        this.f5534t.l();
        int i7 = 0;
        try {
            URLConnection b7 = AbstractC0919h0.a().b(this.f5529o, "client-measurement");
            if (!(b7 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) b7;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i7 = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
            } catch (IOException e7) {
                e = e7;
                map = null;
            } catch (Throwable th) {
                th = th;
                map = null;
            }
            try {
                C0586q4 c0586q4 = this.f5534t;
                v7 = C0586q4.v(httpURLConnection);
                httpURLConnection.disconnect();
                b(i7, null, v7, map);
            } catch (IOException e8) {
                e = e8;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i7, e, null, map);
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i7, null, null, map);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
