package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
class JdkWithJettyBootPlatform extends Platform {

    /* renamed from: c, reason: collision with root package name */
    public final Method f12659c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f12660d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f12661e;
    public final Class<?> f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f12662g;

    public static class JettyNegoProvider implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f12663a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12664b;

        /* renamed from: c, reason: collision with root package name */
        public String f12665c;

        public JettyNegoProvider(ArrayList arrayList) {
            this.f12663a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.f12373b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f12664b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f12663a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list = (List) obj3;
                    int size = list.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj2 = this.f12663a.get(0);
                            break;
                        }
                        if (this.f12663a.contains(list.get(i10))) {
                            obj2 = list.get(i10);
                            break;
                        }
                        i10++;
                    }
                    String str = (String) obj2;
                    this.f12665c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f12665c = (String) objArr[0];
            return null;
        }
    }

    public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f12659c = method;
        this.f12660d = method2;
        this.f12661e = method3;
        this.f = cls;
        this.f12662g = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f12661e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw Util.a("unable to remove alpn", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            this.f12659c.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f, this.f12662g}, new JettyNegoProvider(Platform.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw Util.a("unable to set alpn", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String i(SSLSocket sSLSocket) {
        try {
            JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.f12660d.invoke(null, sSLSocket));
            boolean z10 = jettyNegoProvider.f12664b;
            if (!z10 && jettyNegoProvider.f12665c == null) {
                Platform.f12669a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z10) {
                return null;
            }
            return jettyNegoProvider.f12665c;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw Util.a("unable to get selected protocol", e10);
        }
    }
}
