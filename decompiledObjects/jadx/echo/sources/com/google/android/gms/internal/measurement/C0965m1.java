package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965m1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Long f11041s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11042t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f11043u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f11044v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f11045w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f11046x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ J0 f11047y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0965m1(J0 j02, Long l7, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(j02);
        this.f11047y = j02;
        this.f11041s = l7;
        this.f11042t = str;
        this.f11043u = str2;
        this.f11044v = bundle;
        this.f11045w = z7;
        this.f11046x = z8;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        Long l7 = this.f11041s;
        long longValue = l7 == null ? this.f10434o : l7.longValue();
        interfaceC1062x0 = this.f11047y.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).logEvent(this.f11042t, this.f11043u, this.f11044v, this.f11045w, this.f11046x, longValue);
    }
}
