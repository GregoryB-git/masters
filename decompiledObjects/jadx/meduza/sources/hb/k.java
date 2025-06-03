package hb;

import gb.v0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import r3.a0;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f7315b = Logger.getLogger(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final ib.i f7316c = ib.i.f7920d;

    /* renamed from: d, reason: collision with root package name */
    public static k f7317d;

    /* renamed from: a, reason: collision with root package name */
    public final ib.i f7318a;

    public static final class a extends k {

        /* renamed from: e, reason: collision with root package name */
        public static final a0 f7319e;
        public static final a0 f;

        /* renamed from: g, reason: collision with root package name */
        public static final a0 f7320g;

        /* renamed from: h, reason: collision with root package name */
        public static final a0 f7321h;

        /* renamed from: i, reason: collision with root package name */
        public static final a0 f7322i;

        /* renamed from: j, reason: collision with root package name */
        public static final a0 f7323j;

        /* renamed from: k, reason: collision with root package name */
        public static final Method f7324k;

        /* renamed from: l, reason: collision with root package name */
        public static final Method f7325l;

        /* renamed from: m, reason: collision with root package name */
        public static final Method f7326m;

        /* renamed from: n, reason: collision with root package name */
        public static final Method f7327n;

        /* renamed from: o, reason: collision with root package name */
        public static final Method f7328o;

        /* renamed from: p, reason: collision with root package name */
        public static final Method f7329p;

        /* renamed from: q, reason: collision with root package name */
        public static final Constructor<?> f7330q;

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|3|5|6|(3:7|8|(5:9|10|11|12|13))|14|15|16|17|18|19|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
        
            hb.k.f7315b.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
        
            r1 = null;
         */
        static {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hb.k.a.<clinit>():void");
        }

        public a(ib.i iVar) {
            super(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
        @Override // hb.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<ib.j> r11) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hb.k.a.a(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // hb.k
        public final String b(SSLSocket sSLSocket) {
            Method method = f7328o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    k.f7315b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f7318a.e() == 1) {
                try {
                    byte[] bArr = (byte[]) f7320g.p(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, ib.l.f7946b);
                    }
                } catch (Exception e12) {
                    k.f7315b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (this.f7318a.e() == 3) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f7322i.p(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, ib.l.f7946b);
                }
                return null;
            } catch (Exception e13) {
                k.f7315b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                return null;
            }
        }

        @Override // hb.k
        public final String d(SSLSocket sSLSocket, String str, List<ib.j> list) {
            String b10 = b(sSLSocket);
            return b10 == null ? super.d(sSLSocket, str, list) : b10;
        }
    }

    static {
        boolean z10;
        ClassLoader classLoader = k.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f7315b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f7315b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                z10 = false;
            }
        }
        z10 = true;
        f7317d = z10 ? new a(f7316c) : new k(f7316c);
    }

    public k(ib.i iVar) {
        x6.b.y(iVar, "platform");
        this.f7318a = iVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            x6.b.n(str, "Userinfo must not be present on authority: '%s'", v0.a(str).getAuthority().indexOf(64) == -1);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<ib.j> list) {
        this.f7318a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f7318a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List<ib.j> list) {
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b10 = b(sSLSocket);
            if (b10 != null) {
                return b10;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f7318a.a(sSLSocket);
        }
    }
}
