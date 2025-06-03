package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class Q0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10548s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(J0 j02, String str) {
        super(j02);
        this.f10549t = j02;
        this.f10548s = str;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10549t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setUserId(this.f10548s, this.f10434o);
    }
}
