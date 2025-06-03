package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class V0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10677s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10678t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(J0 j02, long j7) {
        super(j02);
        this.f10678t = j02;
        this.f10677s = j7;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10678t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setSessionTimeoutDuration(this.f10677s);
    }
}
