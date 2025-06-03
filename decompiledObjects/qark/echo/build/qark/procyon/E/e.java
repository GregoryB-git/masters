// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import V5.o;
import V5.n;
import kotlin.jvm.internal.Intrinsics;
import X5.d;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends AtomicBoolean implements OutcomeReceiver
{
    public final d o;
    
    public e(final d o) {
        Intrinsics.checkNotNullParameter(o, "continuation");
        super(false);
        this.o = o;
    }
    
    public void onError(final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "error");
        if (this.compareAndSet(false, true)) {
            final d o = this.o;
            final n.a o2 = n.o;
            o.resumeWith(n.a(V5.o.a(t)));
        }
    }
    
    public void onResult(final Object o) {
        Intrinsics.checkNotNullParameter(o, "result");
        if (this.compareAndSet(false, true)) {
            this.o.resumeWith(n.a(o));
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ContinuationOutcomeReceiver(outcomeReceived = ");
        sb.append(this.get());
        sb.append(')');
        return sb.toString();
    }
}
