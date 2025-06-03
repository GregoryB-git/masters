package z2;

import A2.AbstractC0327m;
import A2.AbstractC0328n;
import V2.C0660k;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import t.C1958a;
import x2.C2188b;
import x2.C2190d;
import y2.C2270a;
import y2.e;

/* renamed from: z2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2320x implements e.a, e.b {

    /* renamed from: c, reason: collision with root package name */
    public final C2270a.f f21758c;

    /* renamed from: d, reason: collision with root package name */
    public final C2299b f21759d;

    /* renamed from: e, reason: collision with root package name */
    public final C2312o f21760e;

    /* renamed from: h, reason: collision with root package name */
    public final int f21763h;

    /* renamed from: i, reason: collision with root package name */
    public final M f21764i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21765j;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2302e f21769n;

    /* renamed from: b, reason: collision with root package name */
    public final Queue f21757b = new LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final Set f21761f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Map f21762g = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final List f21766k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public C2188b f21767l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f21768m = 0;

    public C2320x(C2302e c2302e, y2.d dVar) {
        this.f21769n = c2302e;
        C2270a.f g7 = dVar.g(c2302e.f21721D.getLooper(), this);
        this.f21758c = g7;
        this.f21759d = dVar.d();
        this.f21760e = new C2312o();
        this.f21763h = dVar.f();
        if (g7.m()) {
            this.f21764i = dVar.h(c2302e.f21729u, c2302e.f21721D);
        } else {
            this.f21764i = null;
        }
    }

    public static /* bridge */ /* synthetic */ void A(C2320x c2320x, C2322z c2322z) {
        if (c2320x.f21766k.contains(c2322z) && !c2320x.f21765j) {
            if (c2320x.f21758c.a()) {
                c2320x.f();
            } else {
                c2320x.D();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void B(C2320x c2320x, C2322z c2322z) {
        C2190d c2190d;
        C2190d[] g7;
        if (c2320x.f21766k.remove(c2322z)) {
            c2320x.f21769n.f21721D.removeMessages(15, c2322z);
            c2320x.f21769n.f21721D.removeMessages(16, c2322z);
            c2190d = c2322z.f21771b;
            ArrayList arrayList = new ArrayList(c2320x.f21757b.size());
            for (T t7 : c2320x.f21757b) {
                if ((t7 instanceof AbstractC2297F) && (g7 = ((AbstractC2297F) t7).g(c2320x)) != null && E2.b.b(g7, c2190d)) {
                    arrayList.add(t7);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                T t8 = (T) arrayList.get(i7);
                c2320x.f21757b.remove(t8);
                t8.b(new y2.g(c2190d));
            }
        }
    }

    public final void C() {
        AbstractC0328n.c(this.f21769n.f21721D);
        this.f21767l = null;
    }

    public final void D() {
        C2188b c2188b;
        AbstractC0328n.c(this.f21769n.f21721D);
        if (this.f21758c.a() || this.f21758c.i()) {
            return;
        }
        try {
            C2302e c2302e = this.f21769n;
            int b7 = c2302e.f21731w.b(c2302e.f21729u, this.f21758c);
            if (b7 != 0) {
                C2188b c2188b2 = new C2188b(b7, null);
                Log.w("GoogleApiManager", "The service for " + this.f21758c.getClass().getName() + " is not available: " + c2188b2.toString());
                G(c2188b2, null);
                return;
            }
            C2302e c2302e2 = this.f21769n;
            C2270a.f fVar = this.f21758c;
            C2293B c2293b = new C2293B(c2302e2, fVar, this.f21759d);
            if (fVar.m()) {
                ((M) AbstractC0328n.i(this.f21764i)).c1(c2293b);
            }
            try {
                this.f21758c.p(c2293b);
            } catch (SecurityException e7) {
                e = e7;
                c2188b = new C2188b(10);
                G(c2188b, e);
            }
        } catch (IllegalStateException e8) {
            e = e8;
            c2188b = new C2188b(10);
        }
    }

    public final void E(T t7) {
        AbstractC0328n.c(this.f21769n.f21721D);
        if (this.f21758c.a()) {
            if (l(t7)) {
                i();
                return;
            } else {
                this.f21757b.add(t7);
                return;
            }
        }
        this.f21757b.add(t7);
        C2188b c2188b = this.f21767l;
        if (c2188b == null || !c2188b.g()) {
            D();
        } else {
            G(this.f21767l, null);
        }
    }

    public final void F() {
        this.f21768m++;
    }

    public final void G(C2188b c2188b, Exception exc) {
        AbstractC0328n.c(this.f21769n.f21721D);
        M m7 = this.f21764i;
        if (m7 != null) {
            m7.d1();
        }
        C();
        this.f21769n.f21731w.c();
        c(c2188b);
        if ((this.f21758c instanceof C2.e) && c2188b.a() != 24) {
            this.f21769n.f21726r = true;
            C2302e c2302e = this.f21769n;
            c2302e.f21721D.sendMessageDelayed(c2302e.f21721D.obtainMessage(19), 300000L);
        }
        if (c2188b.a() == 4) {
            d(C2302e.f21715G);
            return;
        }
        if (this.f21757b.isEmpty()) {
            this.f21767l = c2188b;
            return;
        }
        if (exc != null) {
            AbstractC0328n.c(this.f21769n.f21721D);
            e(null, exc, false);
            return;
        }
        if (!this.f21769n.f21722E) {
            d(C2302e.h(this.f21759d, c2188b));
            return;
        }
        e(C2302e.h(this.f21759d, c2188b), null, true);
        if (this.f21757b.isEmpty() || m(c2188b) || this.f21769n.g(c2188b, this.f21763h)) {
            return;
        }
        if (c2188b.a() == 18) {
            this.f21765j = true;
        }
        if (!this.f21765j) {
            d(C2302e.h(this.f21759d, c2188b));
        } else {
            C2302e c2302e2 = this.f21769n;
            c2302e2.f21721D.sendMessageDelayed(Message.obtain(c2302e2.f21721D, 9, this.f21759d), this.f21769n.f21723o);
        }
    }

    public final void H(C2188b c2188b) {
        AbstractC0328n.c(this.f21769n.f21721D);
        C2270a.f fVar = this.f21758c;
        fVar.f("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c2188b));
        G(c2188b, null);
    }

    public final void I() {
        AbstractC0328n.c(this.f21769n.f21721D);
        if (this.f21765j) {
            D();
        }
    }

    public final void J() {
        AbstractC0328n.c(this.f21769n.f21721D);
        d(C2302e.f21714F);
        this.f21760e.d();
        for (AbstractC2305h abstractC2305h : (AbstractC2305h[]) this.f21762g.keySet().toArray(new AbstractC2305h[0])) {
            E(new S(null, new C0660k()));
        }
        c(new C2188b(4));
        if (this.f21758c.a()) {
            this.f21758c.b(new C2319w(this));
        }
    }

    public final void K() {
        AbstractC0328n.c(this.f21769n.f21721D);
        if (this.f21765j) {
            k();
            C2302e c2302e = this.f21769n;
            d(c2302e.f21730v.g(c2302e.f21729u) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f21758c.f("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f21758c.m();
    }

    public final boolean a() {
        return p(true);
    }

    public final C2190d b(C2190d[] c2190dArr) {
        if (c2190dArr != null && c2190dArr.length != 0) {
            C2190d[] j7 = this.f21758c.j();
            if (j7 == null) {
                j7 = new C2190d[0];
            }
            C1958a c1958a = new C1958a(j7.length);
            for (C2190d c2190d : j7) {
                c1958a.put(c2190d.a(), Long.valueOf(c2190d.d()));
            }
            for (C2190d c2190d2 : c2190dArr) {
                Long l7 = (Long) c1958a.get(c2190d2.a());
                if (l7 == null || l7.longValue() < c2190d2.d()) {
                    return c2190d2;
                }
            }
        }
        return null;
    }

    public final void c(C2188b c2188b) {
        Iterator it = this.f21761f.iterator();
        if (!it.hasNext()) {
            this.f21761f.clear();
            return;
        }
        android.support.v4.media.a.a(it.next());
        if (AbstractC0327m.a(c2188b, C2188b.f21167s)) {
            this.f21758c.k();
        }
        throw null;
    }

    public final void d(Status status) {
        AbstractC0328n.c(this.f21769n.f21721D);
        e(status, null, false);
    }

    public final void e(Status status, Exception exc, boolean z7) {
        AbstractC0328n.c(this.f21769n.f21721D);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f21757b.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (!z7 || t7.f21680a == 2) {
                if (status != null) {
                    t7.a(status);
                } else {
                    t7.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f21757b);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            T t7 = (T) arrayList.get(i7);
            if (!this.f21758c.a()) {
                return;
            }
            if (l(t7)) {
                this.f21757b.remove(t7);
            }
        }
    }

    public final void g() {
        C();
        c(C2188b.f21167s);
        k();
        Iterator it = this.f21762g.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
        f();
        i();
    }

    public final void h(int i7) {
        C();
        this.f21765j = true;
        this.f21760e.c(i7, this.f21758c.l());
        C2302e c2302e = this.f21769n;
        c2302e.f21721D.sendMessageDelayed(Message.obtain(c2302e.f21721D, 9, this.f21759d), this.f21769n.f21723o);
        C2302e c2302e2 = this.f21769n;
        c2302e2.f21721D.sendMessageDelayed(Message.obtain(c2302e2.f21721D, 11, this.f21759d), this.f21769n.f21724p);
        this.f21769n.f21731w.c();
        Iterator it = this.f21762g.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public final void i() {
        this.f21769n.f21721D.removeMessages(12, this.f21759d);
        C2302e c2302e = this.f21769n;
        c2302e.f21721D.sendMessageDelayed(c2302e.f21721D.obtainMessage(12, this.f21759d), this.f21769n.f21725q);
    }

    public final void j(T t7) {
        t7.d(this.f21760e, L());
        try {
            t7.c(this);
        } catch (DeadObjectException unused) {
            n(1);
            this.f21758c.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void k() {
        if (this.f21765j) {
            this.f21769n.f21721D.removeMessages(11, this.f21759d);
            this.f21769n.f21721D.removeMessages(9, this.f21759d);
            this.f21765j = false;
        }
    }

    public final boolean l(T t7) {
        if (!(t7 instanceof AbstractC2297F)) {
            j(t7);
            return true;
        }
        AbstractC2297F abstractC2297F = (AbstractC2297F) t7;
        C2190d b7 = b(abstractC2297F.g(this));
        if (b7 == null) {
            j(t7);
            return true;
        }
        Log.w("GoogleApiManager", this.f21758c.getClass().getName() + " could not execute call because it requires feature (" + b7.a() + ", " + b7.d() + ").");
        if (!this.f21769n.f21722E || !abstractC2297F.f(this)) {
            abstractC2297F.b(new y2.g(b7));
            return true;
        }
        C2322z c2322z = new C2322z(this.f21759d, b7, null);
        int indexOf = this.f21766k.indexOf(c2322z);
        if (indexOf >= 0) {
            C2322z c2322z2 = (C2322z) this.f21766k.get(indexOf);
            this.f21769n.f21721D.removeMessages(15, c2322z2);
            C2302e c2302e = this.f21769n;
            c2302e.f21721D.sendMessageDelayed(Message.obtain(c2302e.f21721D, 15, c2322z2), this.f21769n.f21723o);
            return false;
        }
        this.f21766k.add(c2322z);
        C2302e c2302e2 = this.f21769n;
        c2302e2.f21721D.sendMessageDelayed(Message.obtain(c2302e2.f21721D, 15, c2322z), this.f21769n.f21723o);
        C2302e c2302e3 = this.f21769n;
        c2302e3.f21721D.sendMessageDelayed(Message.obtain(c2302e3.f21721D, 16, c2322z), this.f21769n.f21724p);
        C2188b c2188b = new C2188b(2, null);
        if (m(c2188b)) {
            return false;
        }
        this.f21769n.g(c2188b, this.f21763h);
        return false;
    }

    public final boolean m(C2188b c2188b) {
        synchronized (C2302e.f21716H) {
            try {
                C2302e c2302e = this.f21769n;
                if (c2302e.f21718A == null || !c2302e.f21719B.contains(this.f21759d)) {
                    return false;
                }
                this.f21769n.f21718A.s(c2188b, this.f21763h);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z2.InterfaceC2301d
    public final void n(int i7) {
        if (Looper.myLooper() == this.f21769n.f21721D.getLooper()) {
            h(i7);
        } else {
            this.f21769n.f21721D.post(new RunnableC2317u(this, i7));
        }
    }

    @Override // z2.InterfaceC2307j
    public final void o(C2188b c2188b) {
        G(c2188b, null);
    }

    public final boolean p(boolean z7) {
        AbstractC0328n.c(this.f21769n.f21721D);
        if (!this.f21758c.a() || this.f21762g.size() != 0) {
            return false;
        }
        if (!this.f21760e.e()) {
            this.f21758c.f("Timing out service connection.");
            return true;
        }
        if (z7) {
            i();
        }
        return false;
    }

    public final int q() {
        return this.f21763h;
    }

    public final int r() {
        return this.f21768m;
    }

    public final C2270a.f t() {
        return this.f21758c;
    }

    @Override // z2.InterfaceC2301d
    public final void v(Bundle bundle) {
        if (Looper.myLooper() == this.f21769n.f21721D.getLooper()) {
            g();
        } else {
            this.f21769n.f21721D.post(new RunnableC2316t(this));
        }
    }

    public final Map w() {
        return this.f21762g;
    }
}
