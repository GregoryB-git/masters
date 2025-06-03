package i2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import b.z;
import ec.t;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7377a = a.f7378a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f7378a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final rb.g f7379b;

        /* renamed from: c, reason: collision with root package name */
        public static x6.b f7380c;

        /* renamed from: i2.i$a$a, reason: collision with other inner class name */
        public static final class C0109a extends ec.j implements dc.a<j2.a> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0109a f7381a = new C0109a();

            public C0109a() {
                super(0);
            }

            @Override // dc.a
            public final j2.a invoke() {
                WindowLayoutComponent a10;
                try {
                    ClassLoader classLoader = i.class.getClassLoader();
                    h hVar = classLoader != null ? new h(classLoader, new f2.b(classLoader)) : null;
                    if (hVar == null || (a10 = hVar.a()) == null) {
                        return null;
                    }
                    ec.i.d(classLoader, "loader");
                    f2.b bVar = new f2.b(classLoader);
                    f2.d.f5311a.getClass();
                    int a11 = f2.d.a();
                    return a11 >= 2 ? new k2.d(a10) : a11 == 1 ? new k2.c(a10, bVar) : new k2.a();
                } catch (Throwable unused) {
                    a aVar = a.f7378a;
                    return null;
                }
            }
        }

        static {
            t.a(i.class).e();
            f7379b = z.n(C0109a.f7381a);
            f7380c = x6.b.f17194d;
        }

        public static j a(Context context) {
            ec.i.e(context, "context");
            j2.a aVar = (j2.a) f7379b.getValue();
            if (aVar == null) {
                androidx.window.layout.adapter.sidecar.b bVar = androidx.window.layout.adapter.sidecar.b.f1416c;
                if (androidx.window.layout.adapter.sidecar.b.f1416c == null) {
                    ReentrantLock reentrantLock = androidx.window.layout.adapter.sidecar.b.f1417d;
                    reentrantLock.lock();
                    try {
                        if (androidx.window.layout.adapter.sidecar.b.f1416c == null) {
                            SidecarCompat sidecarCompat = null;
                            try {
                                f2.i c10 = SidecarCompat.a.c();
                                boolean z10 = false;
                                if (c10 != null) {
                                    f2.i iVar = f2.i.f;
                                    ec.i.e(iVar, "other");
                                    Object value = c10.f5325e.getValue();
                                    ec.i.d(value, "<get-bigInteger>(...)");
                                    Object value2 = iVar.f5325e.getValue();
                                    ec.i.d(value2, "<get-bigInteger>(...)");
                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    SidecarCompat sidecarCompat2 = new SidecarCompat(context);
                                    if (sidecarCompat2.j()) {
                                        sidecarCompat = sidecarCompat2;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            androidx.window.layout.adapter.sidecar.b.f1416c = new androidx.window.layout.adapter.sidecar.b(sidecarCompat);
                        }
                        rb.h hVar = rb.h.f13851a;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                aVar = androidx.window.layout.adapter.sidecar.b.f1416c;
                ec.i.b(aVar);
            }
            j jVar = new j(o.f7398b, aVar);
            f7380c.getClass();
            return jVar;
        }
    }

    qc.e<k> a(Activity activity);
}
