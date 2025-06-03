/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package E;

import V5.n;
import V5.o;
import X5.d;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends AtomicBoolean
implements OutcomeReceiver {
    public final d o;

    public e(d d8) {
        Intrinsics.checkNotNullParameter(d8, "continuation");
        super(false);
        this.o = d8;
    }

    public void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter((Object)throwable, "error");
        if (this.compareAndSet(false, true)) {
            d d8 = this.o;
            n.a a8 = n.o;
            d8.resumeWith(n.a(o.a(throwable)));
        }
    }

    public void onResult(Object object) {
        Intrinsics.checkNotNullParameter(object, "result");
        if (this.compareAndSet(false, true)) {
            this.o.resumeWith(n.a(object));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContinuationOutcomeReceiver(outcomeReceived = ");
        stringBuilder.append(this.get());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

