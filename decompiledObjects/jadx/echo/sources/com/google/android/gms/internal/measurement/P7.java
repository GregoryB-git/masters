package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class P7 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public final T7 f10545q;

    public P7(T7 t7) {
        super("internal.logger");
        this.f10545q = t7;
        this.f11053p.put("log", new S7(this, false, true));
        this.f11053p.put("silent", new A7(this, "silent"));
        ((AbstractC0972n) this.f11053p.get("silent")).a("log", new S7(this, true, true));
        this.f11053p.put("unmonitored", new R7(this, "unmonitored"));
        ((AbstractC0972n) this.f11053p.get("unmonitored")).a("log", new S7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        return InterfaceC1016s.f11133d;
    }
}
