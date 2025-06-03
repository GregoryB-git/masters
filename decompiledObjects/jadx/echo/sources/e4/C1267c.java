package e4;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import c4.C0851c;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1267c {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f13957l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f13958m = Charset.forName("UTF-8");

    /* renamed from: n, reason: collision with root package name */
    public static ThreadFactory f13959n = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    public static InterfaceC1266b f13960o = new a();

    /* renamed from: a, reason: collision with root package name */
    public volatile d f13961a = d.NONE;

    /* renamed from: b, reason: collision with root package name */
    public volatile Socket f13962b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1268d f13963c = null;

    /* renamed from: d, reason: collision with root package name */
    public final URI f13964d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13965e;

    /* renamed from: f, reason: collision with root package name */
    public final C1272h f13966f;

    /* renamed from: g, reason: collision with root package name */
    public final i f13967g;

    /* renamed from: h, reason: collision with root package name */
    public final C1270f f13968h;

    /* renamed from: i, reason: collision with root package name */
    public final C0851c f13969i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13970j;

    /* renamed from: k, reason: collision with root package name */
    public final Thread f13971k;

    /* renamed from: e4.c$a */
    public class a implements InterfaceC1266b {
        @Override // e4.InterfaceC1266b
        public void a(Thread thread, String str) {
            thread.setName(str);
        }
    }

    /* renamed from: e4.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1267c.this.n();
        }
    }

    /* renamed from: e4.c$c, reason: collision with other inner class name */
    public static /* synthetic */ class C0201c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13973a;

        static {
            int[] iArr = new int[d.values().length];
            f13973a = iArr;
            try {
                iArr[d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13973a[d.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13973a[d.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13973a[d.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13973a[d.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: e4.c$d */
    public enum d {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public C1267c(T3.c cVar, URI uri, String str, Map map) {
        int incrementAndGet = f13957l.incrementAndGet();
        this.f13970j = incrementAndGet;
        this.f13971k = j().newThread(new b());
        this.f13964d = uri;
        this.f13965e = cVar.g();
        this.f13969i = new C0851c(cVar.f(), "WebSocket", "sk_" + incrementAndGet);
        this.f13968h = new C1270f(uri, str, map);
        this.f13966f = new C1272h(this);
        this.f13967g = new i(this, "TubeSock", incrementAndGet);
    }

    public static InterfaceC1266b i() {
        return f13960o;
    }

    public static ThreadFactory j() {
        return f13959n;
    }

    public void b() {
        if (this.f13967g.d().getState() != Thread.State.NEW) {
            this.f13967g.d().join();
        }
        h().join();
    }

    public synchronized void c() {
        int i7 = C0201c.f13973a[this.f13961a.ordinal()];
        if (i7 == 1) {
            this.f13961a = d.DISCONNECTED;
            return;
        }
        if (i7 == 2) {
            d();
        } else if (i7 == 3) {
            q();
        } else if (i7 != 4) {
        }
    }

    public final synchronized void d() {
        if (this.f13961a == d.DISCONNECTED) {
            return;
        }
        this.f13966f.h();
        this.f13967g.i();
        if (this.f13962b != null) {
            try {
                this.f13962b.close();
            } catch (Exception e7) {
                this.f13963c.d(new C1269e("Failed to close", e7));
            }
        }
        this.f13961a = d.DISCONNECTED;
        this.f13963c.b();
    }

    public synchronized void e() {
        if (this.f13961a != d.NONE) {
            this.f13963c.d(new C1269e("connect() already called"));
            c();
            return;
        }
        i().a(h(), "TubeSockReader-" + this.f13970j);
        this.f13961a = d.CONNECTING;
        h().start();
    }

    public final Socket f() {
        String scheme = this.f13964d.getScheme();
        String host = this.f13964d.getHost();
        int port = this.f13964d.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e7) {
                throw new C1269e("unknown host: " + host, e7);
            } catch (IOException e8) {
                throw new C1269e("error while creating socket to " + this.f13964d, e8);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new C1269e("unsupported protocol: " + scheme);
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        try {
            if (this.f13965e != null) {
                sSLSessionCache = new SSLSessionCache(new File(this.f13965e));
            }
        } catch (IOException e9) {
            this.f13969i.a("Failed to initialize SSL session cache", e9, new Object[0]);
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new C1269e("Error while verifying secure socket to " + this.f13964d);
        } catch (UnknownHostException e10) {
            throw new C1269e("unknown host: " + host, e10);
        } catch (IOException e11) {
            throw new C1269e("error while creating secure socket to " + this.f13964d, e11);
        }
    }

    public InterfaceC1268d g() {
        return this.f13963c;
    }

    public Thread h() {
        return this.f13971k;
    }

    public void k(C1269e c1269e) {
        this.f13963c.d(c1269e);
        if (this.f13961a == d.CONNECTED) {
            c();
        }
        d();
    }

    public void l() {
        d();
    }

    public synchronized void m(byte[] bArr) {
        o((byte) 10, bArr);
    }

    public final void n() {
        Socket f7;
        try {
            try {
                f7 = f();
            } catch (C1269e e7) {
                this.f13963c.d(e7);
                c();
            } catch (Throwable th) {
                this.f13963c.d(new C1269e("error while connecting: " + th.getMessage(), th));
                c();
            }
            synchronized (this) {
                this.f13962b = f7;
                if (this.f13961a == d.DISCONNECTED) {
                    try {
                        this.f13962b.close();
                        this.f13962b = null;
                        c();
                        return;
                    } catch (IOException e8) {
                        throw new RuntimeException(e8);
                    }
                }
                DataInputStream dataInputStream = new DataInputStream(f7.getInputStream());
                OutputStream outputStream = f7.getOutputStream();
                outputStream.write(this.f13968h.c());
                byte[] bArr = new byte[1000];
                ArrayList arrayList = new ArrayList();
                boolean z7 = false;
                int i7 = 0;
                while (!z7) {
                    int read = dataInputStream.read();
                    if (read == -1) {
                        throw new C1269e("Connection closed before handshake was complete");
                    }
                    bArr[i7] = (byte) read;
                    int i8 = i7 + 1;
                    if (bArr[i7] == 10 && bArr[i7 - 1] == 13) {
                        String str = new String(bArr, f13958m);
                        if (str.trim().equals("")) {
                            z7 = true;
                        } else {
                            arrayList.add(str.trim());
                        }
                        bArr = new byte[1000];
                        i7 = 0;
                    } else {
                        if (i8 == 1000) {
                            throw new C1269e("Unexpected long line in handshake: " + new String(bArr, f13958m));
                        }
                        i7 = i8;
                    }
                }
                this.f13968h.f((String) arrayList.get(0));
                arrayList.remove(0);
                HashMap hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String[] split = ((String) it.next()).split(": ", 2);
                    String str2 = split[0];
                    Locale locale = Locale.US;
                    hashMap.put(str2.toLowerCase(locale), split[1].toLowerCase(locale));
                }
                this.f13968h.e(hashMap);
                this.f13967g.h(outputStream);
                this.f13966f.g(dataInputStream);
                this.f13961a = d.CONNECTED;
                this.f13967g.d().start();
                this.f13963c.c();
                this.f13966f.f();
                c();
            }
        } finally {
            c();
        }
    }

    public final synchronized void o(byte b7, byte[] bArr) {
        if (this.f13961a != d.CONNECTED) {
            this.f13963c.d(new C1269e("error while sending data: not connected"));
        } else {
            try {
                this.f13967g.g(b7, true, bArr);
            } catch (IOException e7) {
                this.f13963c.d(new C1269e("Failed to send frame", e7));
                c();
            }
        }
    }

    public synchronized void p(String str) {
        o((byte) 1, str.getBytes(f13958m));
    }

    public final void q() {
        try {
            this.f13961a = d.DISCONNECTING;
            this.f13967g.i();
            this.f13967g.g((byte) 8, true, new byte[0]);
        } catch (IOException e7) {
            this.f13963c.d(new C1269e("Failed to send close frame", e7));
        }
    }

    public void r(InterfaceC1268d interfaceC1268d) {
        this.f13963c = interfaceC1268d;
    }
}
