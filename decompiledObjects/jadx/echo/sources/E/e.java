package E;

import V5.n;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: o, reason: collision with root package name */
    public final X5.d f1521o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(X5.d continuation) {
        super(false);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f1521o = continuation;
    }

    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (compareAndSet(false, true)) {
            X5.d dVar = this.f1521o;
            n.a aVar = V5.n.f6797o;
            dVar.resumeWith(V5.n.a(V5.o.a(error)));
        }
    }

    public void onResult(Object result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (compareAndSet(false, true)) {
            this.f1521o.resumeWith(V5.n.a(result));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
