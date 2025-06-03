package com.google.firebase.analytics.connector.internal;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n4.InterfaceC1731d;
import s3.C1947e;
import w3.C2101b;
import w3.InterfaceC2100a;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(InterfaceC2100a.class).b(r.k(C1947e.class)).b(r.k(Context.class)).b(r.k(InterfaceC1731d.class)).f(new h() { // from class: x3.b
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                InterfaceC2100a h7;
                h7 = C2101b.h((C1947e) interfaceC0344e.a(C1947e.class), (Context) interfaceC0344e.a(Context.class), (InterfaceC1731d) interfaceC0344e.a(InterfaceC1731d.class));
                return h7;
            }
        }).e().d(), O4.h.b("fire-analytics", "21.5.0"));
    }
}
