package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.AbstractC1997b;

/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2032b extends y {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19973a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2032b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC2031a.f19972a;

    @Override // u6.y
    public final Object a(Object obj) {
        Object obj2 = f19973a.get(this);
        if (obj2 == AbstractC2031a.f19972a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19973a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC2031a.f19972a;
        return obj2 != obj3 ? obj2 : AbstractC1997b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(Object obj);
}
