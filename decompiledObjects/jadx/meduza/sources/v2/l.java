package v2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class l extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, a3.b bVar) {
        super(context, bVar);
        ec.i.e(bVar, "taskExecutor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L19;
     */
    @Override // v2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f15217b
            r1 = 0
            android.content.IntentFilter r2 = r5.e()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            java.lang.String r3 = r0.getAction()
            if (r3 != 0) goto L16
            goto L3a
        L16:
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L3b
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L34
            r4 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r3 == r4) goto L2b
            goto L3b
        L2b:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3a
            goto L3b
        L34:
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.equals(r2)
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.l.a():java.lang.Object");
    }

    @Override // v2.e
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        String str = m.f15226a;
        StringBuilder l10 = defpackage.f.l("Received ");
        l10.append(intent.getAction());
        d10.a(str, l10.toString());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                } else {
                    bool = Boolean.TRUE;
                }
            } else if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return;
            } else {
                bool = Boolean.FALSE;
            }
            b(bool);
        }
    }
}
