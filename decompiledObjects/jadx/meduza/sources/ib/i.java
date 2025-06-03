package ib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r3.a0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f7918b = Logger.getLogger(i.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7919c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d, reason: collision with root package name */
    public static final i f7920d;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f7921a;

    public static class a extends i {

        /* renamed from: e, reason: collision with root package name */
        public final a0 f7922e;
        public final a0 f;

        /* renamed from: g, reason: collision with root package name */
        public final a0 f7923g;

        /* renamed from: h, reason: collision with root package name */
        public final a0 f7924h;

        /* renamed from: i, reason: collision with root package name */
        public final int f7925i;

        public a(a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, Provider provider, int i10) {
            super(provider);
            this.f7922e = a0Var;
            this.f = a0Var2;
            this.f7923g = a0Var3;
            this.f7924h = a0Var4;
            this.f7925i = i10;
        }

        @Override // ib.i
        public final void c(SSLSocket sSLSocket, String str, List<j> list) {
            if (str != null) {
                this.f7922e.l(sSLSocket, Boolean.TRUE);
                this.f.l(sSLSocket, str);
            }
            a0 a0Var = this.f7924h;
            a0Var.getClass();
            if (a0Var.b(sSLSocket.getClass()) != null) {
                this.f7924h.p(sSLSocket, i.b(list));
            }
        }

        @Override // ib.i
        public final String d(SSLSocket sSLSocket) {
            byte[] bArr;
            a0 a0Var = this.f7923g;
            a0Var.getClass();
            if ((a0Var.b(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f7923g.p(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f7946b);
            }
            return null;
        }

        @Override // ib.i
        public final int e() {
            return this.f7925i;
        }
    }

    public static class b extends i {

        /* renamed from: e, reason: collision with root package name */
        public final Method f7926e;
        public final Method f;

        public b(Provider provider, Method method, Method method2) {
            super(provider);
            this.f7926e = method;
            this.f = method2;
        }

        @Override // ib.i
        public final void c(SSLSocket sSLSocket, String str, List<j> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (j jVar : list) {
                if (jVar != j.HTTP_1_0) {
                    arrayList.add(jVar.f7938a);
                }
            }
            try {
                this.f7926e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // ib.i
        public final String d(SSLSocket sSLSocket) {
            try {
                return (String) this.f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // ib.i
        public final int e() {
            return 1;
        }
    }

    public static class c extends i {

        /* renamed from: e, reason: collision with root package name */
        public final Method f7927e;
        public final Method f;

        /* renamed from: g, reason: collision with root package name */
        public final Method f7928g;

        /* renamed from: h, reason: collision with root package name */
        public final Class<?> f7929h;

        /* renamed from: i, reason: collision with root package name */
        public final Class<?> f7930i;

        public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f7927e = method;
            this.f = method2;
            this.f7928g = method3;
            this.f7929h = cls;
            this.f7930i = cls2;
        }

        @Override // ib.i
        public final void a(SSLSocket sSLSocket) {
            try {
                this.f7928g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                i.f7918b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // ib.i
        public final void c(SSLSocket sSLSocket, String str, List<j> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = list.get(i10);
                if (jVar != j.HTTP_1_0) {
                    arrayList.add(jVar.f7938a);
                }
            }
            try {
                this.f7927e.invoke(null, sSLSocket, Proxy.newProxyInstance(i.class.getClassLoader(), new Class[]{this.f7929h, this.f7930i}, new d(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // ib.i
        public final String d(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
                boolean z10 = dVar.f7932b;
                if (!z10 && dVar.f7933c == null) {
                    i.f7918b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z10) {
                    return null;
                }
                return dVar.f7933c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // ib.i
        public final int e() {
            return 1;
        }
    }

    public static class d implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f7931a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7932b;

        /* renamed from: c, reason: collision with root package name */
        public String f7933c;

        public d(ArrayList arrayList) {
            this.f7931a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f7945a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f7932b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f7931a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list = (List) obj3;
                    int size = list.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj2 = this.f7931a.get(0);
                            break;
                        }
                        if (this.f7931a.contains(list.get(i10))) {
                            obj2 = list.get(i10);
                            break;
                        }
                        i10++;
                    }
                    String str = (String) obj2;
                    this.f7933c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f7933c = (String) objArr[0];
            return null;
        }
    }

    static {
        Provider provider;
        i iVar;
        i iVar2;
        int i10;
        boolean z10;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        boolean z11 = false;
        int i11 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                f7918b.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i11];
            for (String str : f7919c) {
                if (str.equals(provider2.getClass().getName())) {
                    f7918b.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i11++;
        }
        if (provider != null) {
            a0 a0Var = new a0((Object) null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            a0 a0Var2 = new a0((Object) null, "setHostname", new Class[]{String.class});
            a0 a0Var3 = new a0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            a0 a0Var4 = new a0((Object) null, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    i.class.getClassLoader().loadClass("android.net.Network");
                    z10 = true;
                } catch (ClassNotFoundException e10) {
                    f7918b.log(Level.FINE, "Can't find class", (Throwable) e10);
                    z10 = false;
                }
                if (!z10) {
                    try {
                        i.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        z11 = true;
                    } catch (ClassNotFoundException e11) {
                        f7918b.log(Level.FINE, "Can't find class", (Throwable) e11);
                    }
                    i10 = z11 ? 2 : 3;
                    iVar2 = new a(a0Var, a0Var2, a0Var3, a0Var4, provider, i10);
                }
            }
            i10 = 1;
            iVar2 = new a(a0Var, a0Var2, a0Var3, a0Var4, provider, i10);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new f())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    iVar2 = new b(provider3, (Method) AccessController.doPrivileged(new g()), (Method) AccessController.doPrivileged(new h()));
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        iVar = new c(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        iVar = new i(provider3);
                    }
                    iVar2 = iVar;
                }
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(e12);
            }
        }
        f7920d = iVar2;
    }

    public i(Provider provider) {
        this.f7921a = provider;
    }

    public static byte[] b(List<j> list) {
        xc.f fVar = new xc.f();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = list.get(i10);
            if (jVar != j.HTTP_1_0) {
                fVar.B0(jVar.f7938a.length());
                fVar.H0(jVar.f7938a);
            }
        }
        return fVar.b0(fVar.f17252b);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<j> list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }
}
