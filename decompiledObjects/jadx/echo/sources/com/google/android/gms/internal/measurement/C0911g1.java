package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911g1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10960s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f10961t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J0 f10962u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911g1(J0 j02, String str, BinderC1044v0 binderC1044v0) {
        super(j02);
        this.f10962u = j02;
        this.f10960s = str;
        this.f10961t = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10962u.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).getMaxUserProperties(this.f10960s, this.f10961t);
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void b() {
        this.f10961t.l(null);
    }
}
