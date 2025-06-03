// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.facebook;

import androidx.fragment.app.d;
import x1.o;
import O1.E;
import androidx.fragment.app.n;
import M1.b;
import Y1.x;
import O1.i;
import android.content.Context;
import android.content.Intent;
import M1.c;
import O1.P;
import x1.B;
import android.os.Bundle;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import kotlin.jvm.internal.g;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import androidx.fragment.app.e;

@Metadata
public class FacebookActivity extends e
{
    public static final a E;
    public static final String F;
    public Fragment D;
    
    static {
        E = new a(null);
        F = FacebookActivity.class.getName();
    }
    
    @Override
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "prefix");
            Intrinsics.checkNotNullParameter(printWriter, "writer");
            W1.a.a.a();
            if (Intrinsics.a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(s, fileDescriptor, printWriter, array);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        final Fragment d = this.D;
        if (d == null) {
            return;
        }
        d.onConfigurationChanged(configuration);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        if (!x1.B.F()) {
            final P a = P.a;
            P.j0(FacebookActivity.F, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            final Context applicationContext = ((Context)this).getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            x1.B.M(applicationContext);
        }
        this.setContentView(M1.c.a);
        if (Intrinsics.a("PassThrough", intent.getAction())) {
            this.x();
            return;
        }
        this.D = this.w();
    }
    
    public final Fragment v() {
        return this.D;
    }
    
    public Fragment w() {
        final Intent intent = this.getIntent();
        final n n = this.n();
        Intrinsics.checkNotNullExpressionValue(n, "supportFragmentManager");
        final Fragment h0 = n.h0("SingleFragment");
        if (h0 == null) {
            Fragment fragment;
            if (Intrinsics.a("FacebookDialogFragment", intent.getAction())) {
                fragment = new i();
                fragment.D1(true);
                ((d)fragment).T1(n, "SingleFragment");
            }
            else {
                fragment = new x();
                fragment.D1(true);
                n.m().b(b.c, fragment, "SingleFragment").f();
            }
            return fragment;
        }
        return h0;
    }
    
    public final void x() {
        final Intent intent = this.getIntent();
        final E a = O1.E.a;
        Intrinsics.checkNotNullExpressionValue(intent, "requestIntent");
        final o q = O1.E.q(O1.E.u(intent));
        final Intent intent2 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
        this.setResult(0, O1.E.m(intent2, null, q));
        this.finish();
    }
    
    public static final class a
    {
    }
}
