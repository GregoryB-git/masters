package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875c1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10849s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10850t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10851u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f10852v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ J0 f10853w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0875c1(J0 j02, String str, String str2, boolean z7, BinderC1044v0 binderC1044v0) {
        super(j02);
        this.f10853w = j02;
        this.f10849s = str;
        this.f10850t = str2;
        this.f10851u = z7;
        this.f10852v = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10853w.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).getUserProperties(this.f10849s, this.f10850t, this.f10851u, this.f10852v);
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void b() {
        this.f10852v.l(null);
    }
}
