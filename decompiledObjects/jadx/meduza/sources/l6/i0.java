package l6;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class i0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final l.l f9691b;

    public i0(l.l lVar) {
        this.f9691b = lVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            l.l lVar = this.f9691b;
            e1 e1Var = ((d1) lVar.f9391c).f9669b;
            e1Var.f9674b.set(null);
            zau zauVar = ((v) e1Var).f.f9655v;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            if (((Dialog) lVar.f9390b).isShowing()) {
                ((Dialog) lVar.f9390b).dismiss();
            }
            synchronized (this) {
                Context context2 = this.f9690a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f9690a = null;
            }
        }
    }
}
