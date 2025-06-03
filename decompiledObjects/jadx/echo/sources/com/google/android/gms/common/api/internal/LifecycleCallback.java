package com.google.android.gms.common.api.internal;

import A2.AbstractC0328n;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z2.C2303f;
import z2.InterfaceC2304g;
import z2.Z;
import z2.b0;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2304g f10264o;

    public LifecycleCallback(InterfaceC2304g interfaceC2304g) {
        this.f10264o = interfaceC2304g;
    }

    public static InterfaceC2304g c(Activity activity) {
        return d(new C2303f(activity));
    }

    public static InterfaceC2304g d(C2303f c2303f) {
        if (c2303f.d()) {
            return b0.J1(c2303f.b());
        }
        if (c2303f.c()) {
            return Z.f(c2303f.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC2304g getChimeraLifecycleFragmentImpl(C2303f c2303f) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity c7 = this.f10264o.c();
        AbstractC0328n.i(c7);
        return c7;
    }

    public void e(int i7, int i8, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
