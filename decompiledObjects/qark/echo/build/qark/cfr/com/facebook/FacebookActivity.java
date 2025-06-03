/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.facebook;

import M1.b;
import M1.c;
import O1.E;
import O1.P;
import O1.i;
import W1.a;
import Y1.x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;
import x1.o;

@Metadata
public class FacebookActivity
extends e {
    public static final a E = new a(null);
    public static final String F = FacebookActivity.class.getName();
    public Fragment D;

    @Override
    public void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "prefix");
            Intrinsics.checkNotNullParameter((Object)printWriter, "writer");
            W1.a.a.a();
            if (Intrinsics.a(null, (Object)Boolean.TRUE)) {
                return;
            }
            super.dump(string2, fileDescriptor, printWriter, arrstring);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter((Object)configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.D;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(configuration);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getIntent();
        if (!B.F()) {
            P p8 = P.a;
            P.j0(F, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            p8 = this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(p8, "applicationContext");
            B.M((Context)p8);
        }
        this.setContentView(c.a);
        if (Intrinsics.a("PassThrough", bundle.getAction())) {
            this.x();
            return;
        }
        this.D = this.w();
    }

    public final Fragment v() {
        return this.D;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Fragment w() {
        Object object = this.getIntent();
        n n8 = this.n();
        Intrinsics.checkNotNullExpressionValue(n8, "supportFragmentManager");
        Fragment fragment = n8.h0("SingleFragment");
        if (fragment != null) return fragment;
        if (Intrinsics.a("FacebookDialogFragment", object.getAction())) {
            object = new i();
            object.D1(true);
            object.T1(n8, "SingleFragment");
            do {
                return object;
                break;
            } while (true);
        }
        object = new x();
        object.D1(true);
        n8.m().b(b.c, (Fragment)object, "SingleFragment").f();
        return object;
    }

    public final void x() {
        Object object = this.getIntent();
        E e8 = E.a;
        Intrinsics.checkNotNullExpressionValue(object, "requestIntent");
        object = E.q(E.u((Intent)object));
        e8 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(e8, "intent");
        this.setResult(0, E.m((Intent)e8, null, (o)((Object)object)));
        this.finish();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

