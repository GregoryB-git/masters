package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938j1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10990s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10991t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0938j1(J0 j02, boolean z7) {
        super(j02);
        this.f10991t = j02;
        this.f10990s = z7;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10991t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setDataCollectionEnabled(this.f10990s);
    }
}
