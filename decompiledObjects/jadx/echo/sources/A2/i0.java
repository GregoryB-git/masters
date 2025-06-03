package A2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i0 implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j0 f498o;

    public /* synthetic */ i0(j0 j0Var, h0 h0Var) {
        this.f498o = j0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i7 = message.what;
        if (i7 == 0) {
            hashMap = this.f498o.f499f;
            synchronized (hashMap) {
                try {
                    e0 e0Var = (e0) message.obj;
                    hashMap2 = this.f498o.f499f;
                    g0 g0Var = (g0) hashMap2.get(e0Var);
                    if (g0Var != null && g0Var.i()) {
                        if (g0Var.j()) {
                            g0Var.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f498o.f499f;
                        hashMap3.remove(e0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        hashMap4 = this.f498o.f499f;
        synchronized (hashMap4) {
            try {
                e0 e0Var2 = (e0) message.obj;
                hashMap5 = this.f498o.f499f;
                g0 g0Var2 = (g0) hashMap5.get(e0Var2);
                if (g0Var2 != null && g0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(e0Var2), new Exception());
                    ComponentName b7 = g0Var2.b();
                    if (b7 == null) {
                        b7 = e0Var2.b();
                    }
                    if (b7 == null) {
                        String d7 = e0Var2.d();
                        AbstractC0328n.i(d7);
                        b7 = new ComponentName(d7, "unknown");
                    }
                    g0Var2.onServiceDisconnected(b7);
                }
            } finally {
            }
        }
        return true;
    }
}
