package l6;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class e1 extends f implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f9673a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f9674b;

    /* renamed from: c, reason: collision with root package name */
    public final zau f9675c;

    /* renamed from: d, reason: collision with root package name */
    public final j6.e f9676d;

    public e1(g gVar, j6.e eVar) {
        super(gVar);
        this.f9674b = new AtomicReference(null);
        this.f9675c = new zau(Looper.getMainLooper());
        this.f9676d = eVar;
    }

    public final void a(j6.b bVar, int i10) {
        this.f9674b.set(null);
        ((v) this).f.h(bVar, i10);
    }

    @Override // l6.f
    public final void onActivityResult(int i10, int i11, Intent intent) {
        c1 c1Var = (c1) this.f9674b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int b10 = this.f9676d.b(getActivity());
                if (b10 == 0) {
                    this.f9674b.set(null);
                    zau zauVar = ((v) this).f.f9655v;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (c1Var == null) {
                        return;
                    }
                    if (c1Var.f9640b.f8470b == 18 && b10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            this.f9674b.set(null);
            zau zauVar2 = ((v) this).f.f9655v;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (c1Var != null) {
                a(new j6.b(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c1Var.f9640b.toString()), c1Var.f9639a);
                return;
            }
            return;
        }
        if (c1Var != null) {
            a(c1Var.f9640b, c1Var.f9639a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        j6.b bVar = new j6.b(13, null);
        c1 c1Var = (c1) this.f9674b.get();
        a(bVar, c1Var == null ? -1 : c1Var.f9639a);
    }

    @Override // l6.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9674b.set(bundle.getBoolean("resolving_error", false) ? new c1(new j6.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // l6.f
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c1 c1Var = (c1) this.f9674b.get();
        if (c1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c1Var.f9639a);
        bundle.putInt("failed_status", c1Var.f9640b.f8470b);
        bundle.putParcelable("failed_resolution", c1Var.f9640b.f8471c);
    }

    @Override // l6.f
    public void onStart() {
        super.onStart();
        this.f9673a = true;
    }

    @Override // l6.f
    public void onStop() {
        super.onStop();
        this.f9673a = false;
    }
}
