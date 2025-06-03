/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.g;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import x.a;

public abstract class k
extends g {
    public final Activity o;
    public final Context p;
    public final Handler q;
    public final int r;
    public final n s = new o();

    public k(Activity activity, Context context, Handler handler, int n8) {
        this.o = activity;
        this.p = (Context)H.e.c((Object)context, "context == null");
        this.q = (Handler)H.e.c((Object)handler, "handler == null");
        this.r = n8;
    }

    public k(e e8) {
        this(e8, (Context)e8, new Handler(), 0);
    }

    public Activity h() {
        return this.o;
    }

    public Context i() {
        return this.p;
    }

    public Handler l() {
        return this.q;
    }

    public abstract Object m();

    public abstract LayoutInflater n();

    public abstract boolean o(Fragment var1);

    public void p(Fragment fragment, Intent intent, int n8, Bundle bundle) {
        if (n8 == -1) {
            a.j(this.p, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public abstract void q();
}

