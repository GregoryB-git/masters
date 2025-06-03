package com.facebook;

import M1.b;
import M1.c;
import O1.C0446i;
import O1.E;
import O1.P;
import Y1.x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.C2146B;
import x1.C2162o;

@Metadata
/* loaded from: classes.dex */
public class FacebookActivity extends e {

    /* renamed from: E, reason: collision with root package name */
    public static final a f10228E = new a(null);

    /* renamed from: F, reason: collision with root package name */
    public static final String f10229F = FacebookActivity.class.getName();

    /* renamed from: D, reason: collision with root package name */
    public Fragment f10230D;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            W1.a.f6805a.a();
            if (Intrinsics.a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f10230D;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, w.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C2146B.F()) {
            P p7 = P.f3756a;
            P.j0(f10229F, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            C2146B.M(applicationContext);
        }
        setContentView(c.f3487a);
        if (Intrinsics.a("PassThrough", intent.getAction())) {
            x();
        } else {
            this.f10230D = w();
        }
    }

    public final Fragment v() {
        return this.f10230D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [O1.i, androidx.fragment.app.Fragment, androidx.fragment.app.d] */
    public Fragment w() {
        x xVar;
        Intent intent = getIntent();
        n supportFragmentManager = n();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment h02 = supportFragmentManager.h0("SingleFragment");
        if (h02 != null) {
            return h02;
        }
        if (Intrinsics.a("FacebookDialogFragment", intent.getAction())) {
            ?? c0446i = new C0446i();
            c0446i.D1(true);
            c0446i.T1(supportFragmentManager, "SingleFragment");
            xVar = c0446i;
        } else {
            x xVar2 = new x();
            xVar2.D1(true);
            supportFragmentManager.m().b(b.f3483c, xVar2, "SingleFragment").f();
            xVar = xVar2;
        }
        return xVar;
    }

    public final void x() {
        Intent requestIntent = getIntent();
        E e7 = E.f3721a;
        Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
        C2162o q7 = E.q(E.u(requestIntent));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        setResult(0, E.m(intent, null, q7));
        finish();
    }
}
