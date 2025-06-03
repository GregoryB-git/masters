package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983o1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f11081s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f11082t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J0.c f11083u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0983o1(J0.c cVar, Bundle bundle, Activity activity) {
        super(J0.this);
        this.f11083u = cVar;
        this.f11081s = bundle;
        this.f11082t = activity;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        Bundle bundle;
        InterfaceC1062x0 interfaceC1062x0;
        if (this.f11081s != null) {
            bundle = new Bundle();
            if (this.f11081s.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f11081s.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC1062x0 = J0.this.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).onActivityCreated(H2.b.Z0(this.f11082t), bundle, this.f10435p);
    }
}
