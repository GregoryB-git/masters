package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class Z6 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1077y6 f10808q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6(C1058w5 c1058w5, String str, InterfaceC1077y6 interfaceC1077y6) {
        super(str);
        this.f10808q = interfaceC1077y6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        C2.g("getValue", 2, list);
        InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
        InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(1));
        String i7 = this.f10808q.i(b7.g());
        return i7 != null ? new C1034u(i7) : b8;
    }
}
