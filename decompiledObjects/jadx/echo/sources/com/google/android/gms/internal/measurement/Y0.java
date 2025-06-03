package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class Y0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f10717s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10718t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(J0 j02, BinderC1044v0 binderC1044v0) {
        super(j02);
        this.f10718t = j02;
        this.f10717s = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10718t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).getCachedAppInstanceId(this.f10717s);
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void b() {
        this.f10717s.l(null);
    }
}
