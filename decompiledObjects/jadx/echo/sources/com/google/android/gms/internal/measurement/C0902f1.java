package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902f1 extends J0.a {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10942t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10943u;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J0 f10946x;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10941s = 5;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10944v = null;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10945w = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902f1(J0 j02, boolean z7, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f10946x = j02;
        this.f10942t = str;
        this.f10943u = obj;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10946x.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).logHealthData(this.f10941s, this.f10942t, H2.b.Z0(this.f10943u), H2.b.Z0(null), H2.b.Z0(null));
    }
}
