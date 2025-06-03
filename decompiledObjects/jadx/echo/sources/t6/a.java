package t6;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: o, reason: collision with root package name */
    public final transient s6.c f19599o;

    public a(s6.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f19599o = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
