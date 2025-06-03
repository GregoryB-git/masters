package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.app.Activity;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class P0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f10537s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10538t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f10539u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J0 f10540v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(J0 j02, Activity activity, String str, String str2) {
        super(j02);
        this.f10540v = j02;
        this.f10537s = activity;
        this.f10538t = str;
        this.f10539u = str2;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10540v.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).setCurrentScreen(H2.b.Z0(this.f10537s), this.f10538t, this.f10539u, this.f10434o);
    }
}
