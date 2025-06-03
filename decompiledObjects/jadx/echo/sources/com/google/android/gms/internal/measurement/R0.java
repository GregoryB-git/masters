package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class R0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Boolean f10562s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(J0 j02, Boolean bool) {
        super(j02);
        this.f10563t = j02;
        this.f10562s = bool;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        InterfaceC1062x0 interfaceC1062x02;
        if (this.f10562s != null) {
            interfaceC1062x02 = this.f10563t.f10433i;
            ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x02)).setMeasurementEnabled(this.f10562s.booleanValue(), this.f10434o);
        } else {
            interfaceC1062x0 = this.f10563t.f10433i;
            ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).clearMeasurementEnabled(this.f10434o);
        }
    }
}
