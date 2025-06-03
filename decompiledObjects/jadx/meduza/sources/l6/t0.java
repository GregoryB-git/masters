package l6;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class t0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f9727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, Looper looper) {
        super(looper);
        this.f9727a = v0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        k6.g gVar = (k6.g) message.obj;
        synchronized (this.f9727a.f9734c) {
            v0 v0Var = this.f9727a.f9732a;
            m6.j.i(v0Var);
            if (gVar == null) {
                v0Var.b(new Status(13, "Transform returned null", null, null));
            } else if (gVar instanceof p0) {
                v0Var.b(null);
            } else {
                synchronized (v0Var.f9734c) {
                    v0Var.f9733b = gVar;
                    v0Var.c();
                }
            }
        }
    }
}
