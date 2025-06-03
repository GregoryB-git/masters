package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920h1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f10968s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10969t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0920h1(J0 j02, BinderC1044v0 binderC1044v0) {
        super(j02);
        this.f10969t = j02;
        this.f10968s = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10969t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).getSessionId(this.f10968s);
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void b() {
        this.f10968s.l(null);
    }
}
