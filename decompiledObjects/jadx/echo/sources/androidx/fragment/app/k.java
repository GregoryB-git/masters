package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public abstract class k extends g {

    /* renamed from: o, reason: collision with root package name */
    public final Activity f9435o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f9436p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f9437q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9438r;

    /* renamed from: s, reason: collision with root package name */
    public final n f9439s;

    public k(Activity activity, Context context, Handler handler, int i7) {
        this.f9439s = new o();
        this.f9435o = activity;
        this.f9436p = (Context) H.e.c(context, "context == null");
        this.f9437q = (Handler) H.e.c(handler, "handler == null");
        this.f9438r = i7;
    }

    public Activity h() {
        return this.f9435o;
    }

    public Context i() {
        return this.f9436p;
    }

    public Handler l() {
        return this.f9437q;
    }

    public abstract Object m();

    public abstract LayoutInflater n();

    public abstract boolean o(Fragment fragment);

    public void p(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC2112a.j(this.f9436p, intent, bundle);
    }

    public abstract void q();

    public k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }
}
