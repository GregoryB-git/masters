package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class N0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10518s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10519t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f10520u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J0 f10521v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(J0 j02, String str, String str2, BinderC1044v0 binderC1044v0) {
        super(j02);
        this.f10521v = j02;
        this.f10518s = str;
        this.f10519t = str2;
        this.f10520u = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10521v.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).getConditionalUserProperties(this.f10518s, this.f10519t, this.f10520u);
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void b() {
        this.f10520u.l(null);
    }
}
