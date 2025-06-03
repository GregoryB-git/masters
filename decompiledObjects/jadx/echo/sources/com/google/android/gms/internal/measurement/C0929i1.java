package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929i1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f10979s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10980t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0929i1(J0 j02, BinderC1044v0 binderC1044v0) {
        super(j02);
        this.f10980t = j02;
        this.f10979s = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10980t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).getAppInstanceId(this.f10979s);
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void b() {
        this.f10979s.l(null);
    }
}
