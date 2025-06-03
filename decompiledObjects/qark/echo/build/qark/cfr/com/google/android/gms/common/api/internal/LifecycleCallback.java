/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.api.internal;

import A2.n;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z2.Z;
import z2.b0;
import z2.f;
import z2.g;

public class LifecycleCallback {
    public final g o;

    public LifecycleCallback(g g8) {
        this.o = g8;
    }

    public static g c(Activity activity) {
        return LifecycleCallback.d(new f(activity));
    }

    public static g d(f f8) {
        if (f8.d()) {
            return b0.J1(f8.b());
        }
        if (f8.c()) {
            return Z.f(f8.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static g getChimeraLifecycleFragmentImpl(f f8) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
    }

    public Activity b() {
        Activity activity = this.o.c();
        n.i((Object)activity);
        return activity;
    }

    public void e(int n8, int n9, Intent intent) {
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

