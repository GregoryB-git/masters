package m6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class r0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f10317a;

    public /* synthetic */ r0(s0 s0Var) {
        this.f10317a = s0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f10317a.f10320d) {
                try {
                    p0 p0Var = (p0) message.obj;
                    q0 q0Var = (q0) this.f10317a.f10320d.get(p0Var);
                    if (q0Var != null && q0Var.f10308a.isEmpty()) {
                        if (q0Var.f10310c) {
                            q0Var.f10313o.f.removeMessages(1, q0Var.f10312e);
                            s0 s0Var = q0Var.f10313o;
                            s0Var.f10322g.c(s0Var.f10321e, q0Var);
                            q0Var.f10310c = false;
                            q0Var.f10309b = 2;
                        }
                        this.f10317a.f10320d.remove(p0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f10317a.f10320d) {
            p0 p0Var2 = (p0) message.obj;
            q0 q0Var2 = (q0) this.f10317a.f10320d.get(p0Var2);
            if (q0Var2 != null && q0Var2.f10309b == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(p0Var2), new Exception());
                ComponentName componentName = q0Var2.f;
                if (componentName == null) {
                    componentName = p0Var2.f10304c;
                }
                if (componentName == null) {
                    String str = p0Var2.f10303b;
                    j.i(str);
                    componentName = new ComponentName(str, "unknown");
                }
                q0Var2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
