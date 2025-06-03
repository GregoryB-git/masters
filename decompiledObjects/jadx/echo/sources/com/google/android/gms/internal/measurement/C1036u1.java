package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.app.Activity;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036u1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f11177s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BinderC1044v0 f11178t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J0.c f11179u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036u1(J0.c cVar, Activity activity, BinderC1044v0 binderC1044v0) {
        super(J0.this);
        this.f11179u = cVar;
        this.f11177s = activity;
        this.f11178t = binderC1044v0;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = J0.this.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).onActivitySaveInstanceState(H2.b.Z0(this.f11177s), this.f11178t, this.f10435p);
    }
}
