package l6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class y0 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final q f9742b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f9743c;

    /* renamed from: d, reason: collision with root package name */
    public final o f9744d;

    public y0(int i10, q qVar, TaskCompletionSource taskCompletionSource, o oVar) {
        super(i10);
        this.f9743c = taskCompletionSource;
        this.f9742b = qVar;
        this.f9744d = oVar;
        if (i10 == 2 && qVar.f9712b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // l6.a1
    public final void a(Status status) {
        o oVar = this.f9744d;
        TaskCompletionSource taskCompletionSource = this.f9743c;
        ((z4.i) oVar).getClass();
        taskCompletionSource.trySetException(b.a0.r(status));
    }

    @Override // l6.a1
    public final void b(RuntimeException runtimeException) {
        this.f9743c.trySetException(runtimeException);
    }

    @Override // l6.a1
    public final void c(d0 d0Var) {
        try {
            this.f9742b.a(d0Var.f9658b, this.f9743c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(a1.e(e11));
        } catch (RuntimeException e12) {
            this.f9743c.trySetException(e12);
        }
    }

    @Override // l6.a1
    public final void d(u uVar, boolean z10) {
        TaskCompletionSource taskCompletionSource = this.f9743c;
        uVar.f9729b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new t(uVar, taskCompletionSource));
    }

    @Override // l6.j0
    public final boolean f(d0 d0Var) {
        return this.f9742b.f9712b;
    }

    @Override // l6.j0
    public final j6.d[] g(d0 d0Var) {
        return this.f9742b.f9711a;
    }
}
