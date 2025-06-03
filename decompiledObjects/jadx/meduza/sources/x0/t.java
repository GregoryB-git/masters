package x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class t<H> extends p {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f16756a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16757b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f16758c;

    /* renamed from: d, reason: collision with root package name */
    public final z f16759d;

    public t(m mVar) {
        ec.i.e(mVar, "activity");
        Handler handler = new Handler();
        this.f16756a = mVar;
        this.f16757b = mVar;
        this.f16758c = handler;
        this.f16759d = new z();
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract m e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public final void h(i iVar, Intent intent, int i10, Bundle bundle) {
        ec.i.e(iVar, "fragment");
        ec.i.e(intent, "intent");
        if (!(i10 == -1)) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
        v.a.startActivity(this.f16757b, intent, bundle);
    }

    public abstract void i();
}
