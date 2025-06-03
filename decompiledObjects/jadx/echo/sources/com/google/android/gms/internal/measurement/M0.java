package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class M0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10484s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10485t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f10486u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f10487v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ J0 f10488w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(J0 j02, String str, String str2, Context context, Bundle bundle) {
        super(j02);
        this.f10488w = j02;
        this.f10484s = str;
        this.f10485t = str2;
        this.f10486u = context;
        this.f10487v = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        boolean J6;
        String str;
        String str2;
        String str3;
        InterfaceC1062x0 interfaceC1062x0;
        InterfaceC1062x0 interfaceC1062x02;
        String str4;
        String str5;
        try {
            J6 = this.f10488w.J(this.f10484s, this.f10485t);
            if (J6) {
                String str6 = this.f10485t;
                String str7 = this.f10484s;
                str5 = this.f10488w.f10425a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC0328n.i(this.f10486u);
            J0 j02 = this.f10488w;
            j02.f10433i = j02.c(this.f10486u, true);
            interfaceC1062x0 = this.f10488w.f10433i;
            if (interfaceC1062x0 == null) {
                str4 = this.f10488w.f10425a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a7 = DynamiteModule.a(this.f10486u, ModuleDescriptor.MODULE_ID);
            H0 h02 = new H0(82001L, Math.max(a7, r0), DynamiteModule.b(this.f10486u, ModuleDescriptor.MODULE_ID) < a7, str, str2, str3, this.f10487v, R2.H2.a(this.f10486u));
            interfaceC1062x02 = this.f10488w.f10433i;
            ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x02)).initialize(H2.b.Z0(this.f10486u), h02, this.f10434o);
        } catch (Exception e7) {
            this.f10488w.s(e7, true, false);
        }
    }
}
