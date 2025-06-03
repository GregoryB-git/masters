package v2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class c extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, a3.b bVar) {
        super(context, bVar);
        ec.i.e(bVar, "taskExecutor");
    }

    @Override // v2.g
    public final Object a() {
        Intent registerReceiver = this.f15217b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            o2.j.d().b(d.f15213a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // v2.e
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // v2.e
    public final void f(Intent intent) {
        Boolean bool;
        ec.i.e(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        o2.j d10 = o2.j.d();
        String str = d.f15213a;
        StringBuilder l10 = defpackage.f.l("Received ");
        l10.append(intent.getAction());
        d10.a(str, l10.toString());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode != 490310653 || !action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                } else {
                    bool = Boolean.FALSE;
                }
            } else if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
            b(bool);
        }
    }
}
