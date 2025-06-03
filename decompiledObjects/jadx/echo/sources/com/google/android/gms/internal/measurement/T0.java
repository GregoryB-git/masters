package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class T0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f10591s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10592t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(J0 j02, Bundle bundle) {
        super(j02);
        this.f10592t = j02;
        this.f10591s = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10592t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setConsentThirdParty(this.f10591s, this.f10434o);
    }
}
