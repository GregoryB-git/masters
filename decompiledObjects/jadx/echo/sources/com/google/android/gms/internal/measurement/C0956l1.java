package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956l1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f11021s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f11022t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0956l1(J0 j02, Bundle bundle) {
        super(j02);
        this.f11022t = j02;
        this.f11021s = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f11022t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setDefaultEventParameters(this.f11021s);
    }
}
