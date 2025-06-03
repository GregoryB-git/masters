package X2;

import java.io.Serializable;

/* renamed from: X2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0702u extends AbstractC0687e implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7187o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f7188p;

    public C0702u(Object obj, Object obj2) {
        this.f7187o = obj;
        this.f7188p = obj2;
    }

    @Override // X2.AbstractC0687e, java.util.Map.Entry
    public final Object getKey() {
        return this.f7187o;
    }

    @Override // X2.AbstractC0687e, java.util.Map.Entry
    public final Object getValue() {
        return this.f7188p;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
