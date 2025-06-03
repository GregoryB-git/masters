package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class X7 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public final X4 f10713q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f10714r;

    public X7(X4 x42) {
        super("require");
        this.f10714r = new HashMap();
        this.f10713q = x42;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        C2.g("require", 1, list);
        String g7 = c0904f3.b((InterfaceC1016s) list.get(0)).g();
        if (this.f10714r.containsKey(g7)) {
            return (InterfaceC1016s) this.f10714r.get(g7);
        }
        InterfaceC1016s a7 = this.f10713q.a(g7);
        if (a7 instanceof AbstractC0972n) {
            this.f10714r.put(g7, (AbstractC0972n) a7);
        }
        return a7;
    }
}
