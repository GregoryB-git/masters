package l6;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f9668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f9669b;

    public d1(v vVar, c1 c1Var) {
        this.f9669b = vVar;
        this.f9668a = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9669b.f9673a) {
            j6.b bVar = this.f9668a.f9640b;
            if ((bVar.f8470b == 0 || bVar.f8471c == null) ? false : true) {
                e1 e1Var = this.f9669b;
                g gVar = e1Var.mLifecycleFragment;
                Activity activity = e1Var.getActivity();
                PendingIntent pendingIntent = bVar.f8471c;
                m6.j.i(pendingIntent);
                int i10 = this.f9668a.f9639a;
                int i11 = GoogleApiActivity.f2808b;
                Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                gVar.startActivityForResult(intent, 1);
                return;
            }
            e1 e1Var2 = this.f9669b;
            if (e1Var2.f9676d.a(e1Var2.getActivity(), null, bVar.f8470b) != null) {
                e1 e1Var3 = this.f9669b;
                e1Var3.f9676d.h(e1Var3.getActivity(), e1Var3.mLifecycleFragment, bVar.f8470b, this.f9669b);
                return;
            }
            if (bVar.f8470b != 18) {
                this.f9669b.a(bVar, this.f9668a.f9639a);
                return;
            }
            e1 e1Var4 = this.f9669b;
            j6.e eVar = e1Var4.f9676d;
            Activity activity2 = e1Var4.getActivity();
            eVar.getClass();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(m6.q.b(activity2, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            j6.e.f(activity2, create, "GooglePlayServicesUpdatingDialog", e1Var4);
            e1 e1Var5 = this.f9669b;
            Context applicationContext = e1Var5.getActivity().getApplicationContext();
            l.l lVar = new l.l(this, create);
            e1Var5.f9676d.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            i0 i0Var = new i0(lVar);
            zao.zaa(applicationContext, i0Var, intentFilter);
            i0Var.f9690a = applicationContext;
            if (j6.j.c(applicationContext)) {
                return;
            }
            e1 e1Var6 = this.f9669b;
            e1Var6.f9674b.set(null);
            zau zauVar = ((v) e1Var6).f.f9655v;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            if (create.isShowing()) {
                create.dismiss();
            }
            synchronized (i0Var) {
                Context context = i0Var.f9690a;
                if (context != null) {
                    context.unregisterReceiver(i0Var);
                }
                i0Var.f9690a = null;
            }
        }
    }
}
