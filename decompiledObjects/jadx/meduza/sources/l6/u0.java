package l6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class u0 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f9730b;

    public u0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f9730b = taskCompletionSource;
    }

    @Override // l6.a1
    public final void a(Status status) {
        this.f9730b.trySetException(new k6.b(status));
    }

    @Override // l6.a1
    public final void b(RuntimeException runtimeException) {
        this.f9730b.trySetException(runtimeException);
    }

    @Override // l6.a1
    public final void c(d0 d0Var) {
        try {
            h(d0Var);
        } catch (DeadObjectException e10) {
            a(a1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(a1.e(e11));
        } catch (RuntimeException e12) {
            this.f9730b.trySetException(e12);
        }
    }

    public abstract void h(d0 d0Var);
}
