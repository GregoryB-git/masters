package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.AbstractC1997b;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20002a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z7) {
        this._cur = new s(8, z7);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20002a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a7 = sVar.a(obj);
            if (a7 == 0) {
                return true;
            }
            if (a7 == 1) {
                AbstractC1997b.a(f20002a, this, sVar, sVar.i());
            } else if (a7 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20002a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                AbstractC1997b.a(f20002a, this, sVar, sVar.i());
            }
        }
    }

    public final int c() {
        return ((s) f20002a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20002a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object j7 = sVar.j();
            if (j7 != s.f20006h) {
                return j7;
            }
            AbstractC1997b.a(f20002a, this, sVar, sVar.i());
        }
    }
}
