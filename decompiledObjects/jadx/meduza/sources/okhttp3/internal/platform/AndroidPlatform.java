package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import xc.f;

/* loaded from: classes.dex */
class AndroidPlatform extends Platform {

    /* renamed from: c, reason: collision with root package name */
    public final OptionalMethod<Socket> f12646c;

    /* renamed from: d, reason: collision with root package name */
    public final OptionalMethod<Socket> f12647d;

    /* renamed from: e, reason: collision with root package name */
    public final OptionalMethod<Socket> f12648e;
    public final OptionalMethod<Socket> f;

    /* renamed from: g, reason: collision with root package name */
    public final CloseGuard f12649g;

    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

        /* renamed from: a, reason: collision with root package name */
        public final Object f12650a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f12651b;

        public AndroidCertificateChainCleaner(Object obj, Method method) {
            this.f12650a = obj;
            this.f12651b = method;
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public final List a(String str, List list) {
            try {
                return (List) this.f12651b.invoke(this.f12650a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public static final class AndroidTrustRootIndex implements TrustRootIndex {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f12652a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f12653b;

        public AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f12653b = method;
            this.f12652a = x509TrustManager;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f12653b.invoke(this.f12652a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e10) {
                throw Util.a("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidTrustRootIndex)) {
                return false;
            }
            AndroidTrustRootIndex androidTrustRootIndex = (AndroidTrustRootIndex) obj;
            return this.f12652a.equals(androidTrustRootIndex.f12652a) && this.f12653b.equals(androidTrustRootIndex.f12653b);
        }

        public final int hashCode() {
            return (this.f12653b.hashCode() * 31) + this.f12652a.hashCode();
        }
    }

    public static final class CloseGuard {

        /* renamed from: a, reason: collision with root package name */
        public final Method f12654a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f12655b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f12656c;

        public CloseGuard(Method method, Method method2, Method method3) {
            this.f12654a = method;
            this.f12655b = method2;
            this.f12656c = method3;
        }
    }

    public AndroidPlatform(OptionalMethod optionalMethod, OptionalMethod optionalMethod2, OptionalMethod optionalMethod3, OptionalMethod optionalMethod4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f12649g = new CloseGuard(method3, method2, method);
        this.f12646c = optionalMethod;
        this.f12647d = optionalMethod2;
        this.f12648e = optionalMethod3;
        this.f = optionalMethod4;
    }

    public static boolean n(Class cls, Object obj, String str) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return true;
            }
        } catch (NoSuchMethodException unused2) {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new AndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new BasicTrustRootIndex(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.f12646c.c(sSLSocket, Boolean.TRUE);
            this.f12647d.c(sSLSocket, str);
        }
        OptionalMethod<Socket> optionalMethod = this.f;
        if (optionalMethod != null) {
            if (optionalMethod.a(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                f fVar = new f();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Protocol protocol = list.get(i10);
                    if (protocol != Protocol.HTTP_1_0) {
                        fVar.B0(protocol.f12311a.length());
                        fVar.H0(protocol.f12311a);
                    }
                }
                objArr[0] = fVar.b0(fVar.f17252b);
                OptionalMethod<Socket> optionalMethod2 = this.f;
                optionalMethod2.getClass();
                try {
                    optionalMethod2.b(sSLSocket, objArr);
                } catch (InvocationTargetException e10) {
                    Throwable targetException = e10.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!Util.q(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e11;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e11);
            throw iOException;
        } catch (SecurityException e12) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e12);
            throw iOException2;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext h() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String i(SSLSocket sSLSocket) {
        OptionalMethod<Socket> optionalMethod = this.f12648e;
        if (optionalMethod == null) {
            return null;
        }
        if (!(optionalMethod.a(sSLSocket.getClass()) != null)) {
            return null;
        }
        OptionalMethod<Socket> optionalMethod2 = this.f12648e;
        Object[] objArr = new Object[0];
        optionalMethod2.getClass();
        try {
            byte[] bArr = (byte[]) optionalMethod2.b(sSLSocket, objArr);
            if (bArr != null) {
                return new String(bArr, Util.f12379i);
            }
            return null;
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object j() {
        CloseGuard closeGuard = this.f12649g;
        Method method = closeGuard.f12654a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            closeGuard.f12655b.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean k(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return n(cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw Util.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw Util.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw Util.a("unable to determine cleartext support", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void l(int i10, String str, Throwable th) {
        int min;
        int i11 = i10 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i12 = min;
                }
            }
            i12 = min + 1;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void m(Object obj, String str) {
        CloseGuard closeGuard = this.f12649g;
        closeGuard.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                closeGuard.f12656c.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (z10) {
            return;
        }
        l(5, str, null);
    }
}
