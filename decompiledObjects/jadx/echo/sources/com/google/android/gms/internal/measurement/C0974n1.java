package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974n1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f11054s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11055t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11056u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f11057v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ J0 f11058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0974n1(J0 j02, String str, String str2, Object obj, boolean z7) {
        super(j02);
        this.f11058w = j02;
        this.f11054s = str;
        this.f11055t = str2;
        this.f11056u = obj;
        this.f11057v = z7;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f11058w.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setUserProperty(this.f11054s, this.f11055t, H2.b.Z0(this.f11056u), this.f11057v, this.f10434o);
    }
}
