package p6;

import java.util.concurrent.CancellationException;

/* renamed from: p6.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1847f0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
