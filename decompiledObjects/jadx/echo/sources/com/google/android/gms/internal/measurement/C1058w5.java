package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058w5 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1077y6 f11208q;

    public C1058w5(String str, InterfaceC1077y6 interfaceC1077y6) {
        super(str);
        this.f11208q = interfaceC1077y6;
        this.f11053p.put("getValue", new Z6(this, "getValue", interfaceC1077y6));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        return InterfaceC1016s.f11133d;
    }
}
