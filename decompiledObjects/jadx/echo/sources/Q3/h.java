package Q3;

import A2.AbstractC0328n;
import V3.C0668g;
import android.text.TextUtils;
import i4.C1356a;
import s3.C1947e;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f4369a;

    /* renamed from: b, reason: collision with root package name */
    public final V3.p f4370b;

    /* renamed from: c, reason: collision with root package name */
    public final C0668g f4371c;

    /* renamed from: d, reason: collision with root package name */
    public C1356a f4372d;

    /* renamed from: e, reason: collision with root package name */
    public V3.m f4373e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f4373e.a0();
        }
    }

    public h(C1947e c1947e, V3.p pVar, C0668g c0668g) {
        this.f4369a = c1947e;
        this.f4370b = pVar;
        this.f4371c = c0668g;
    }

    public static h d(C1947e c1947e) {
        String d7 = c1947e.r().d();
        if (d7 == null) {
            if (c1947e.r().g() == null) {
                throw new d("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            d7 = "https://" + c1947e.r().g() + "-default-rtdb.firebaseio.com";
        }
        return e(c1947e, d7);
    }

    public static synchronized h e(C1947e c1947e, String str) {
        h a7;
        synchronized (h.class) {
            if (TextUtils.isEmpty(str)) {
                throw new d("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            AbstractC0328n.j(c1947e, "Provided FirebaseApp must not be null.");
            i iVar = (i) c1947e.k(i.class);
            AbstractC0328n.j(iVar, "Firebase Database component is not present.");
            Y3.h h7 = Y3.m.h(str);
            if (!h7.f7553b.isEmpty()) {
                throw new d("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + h7.f7553b.toString());
            }
            a7 = iVar.a(h7.f7552a);
        }
        return a7;
    }

    public static String g() {
        return "20.3.0";
    }

    public final void b(String str) {
        if (this.f4373e == null) {
            return;
        }
        throw new d("Calls to " + str + "() must be made before any other usage of FirebaseDatabase instance.");
    }

    public final synchronized void c() {
        if (this.f4373e == null) {
            this.f4370b.a(this.f4372d);
            this.f4373e = V3.q.b(this.f4371c, this.f4370b, this);
        }
    }

    public e f(String str) {
        c();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        Y3.n.i(str);
        return new e(this.f4373e, new V3.k(str));
    }

    public void h() {
        c();
        V3.q.c(this.f4373e);
    }

    public void i() {
        c();
        V3.q.d(this.f4373e);
    }

    public void j() {
        c();
        this.f4373e.i0(new a());
    }

    public synchronized void k(l lVar) {
        b("setLogLevel");
        this.f4371c.L(lVar);
    }

    public synchronized void l(long j7) {
        b("setPersistenceCacheSizeBytes");
        this.f4371c.M(j7);
    }

    public synchronized void m(boolean z7) {
        b("setPersistenceEnabled");
        this.f4371c.N(z7);
    }

    public void n(String str, int i7) {
        if (this.f4373e != null) {
            throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
        }
        this.f4372d = new C1356a(str, i7);
    }
}
