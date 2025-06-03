package nc;

import java.util.concurrent.CancellationException;
import ub.h;

/* loaded from: classes.dex */
public interface j1 extends h.b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f11508k = 0;

    public static final class a {
        public static /* synthetic */ t0 a(j1 j1Var, boolean z10, n1 n1Var, int i10) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return j1Var.invokeOnCompletion(z10, (i10 & 2) != 0, n1Var);
        }
    }

    public static final class b implements h.c<j1> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f11509a = new b();
    }

    o attachChild(q qVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    kc.b<j1> getChildren();

    uc.a getOnJoin();

    j1 getParent();

    t0 invokeOnCompletion(dc.l<? super Throwable, rb.h> lVar);

    t0 invokeOnCompletion(boolean z10, boolean z11, dc.l<? super Throwable, rb.h> lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(ub.e<? super rb.h> eVar);

    j1 plus(j1 j1Var);

    boolean start();
}
