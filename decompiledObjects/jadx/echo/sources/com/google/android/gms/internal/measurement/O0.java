package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class O0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10527s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10528t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bundle f10529u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J0 f10530v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(J0 j02, String str, String str2, Bundle bundle) {
        super(j02);
        this.f10530v = j02;
        this.f10527s = str;
        this.f10528t = str2;
        this.f10529u = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10530v.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).clearConditionalUserProperty(this.f10527s, this.f10528t, this.f10529u);
    }
}
