package nc;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class k1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient j1 f11512a;

    public k1(String str, Throwable th, j1 j1Var) {
        super(str);
        this.f11512a = j1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (!ec.i.a(k1Var.getMessage(), getMessage()) || !ec.i.a(k1Var.f11512a, this.f11512a) || !ec.i.a(k1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        ec.i.b(message);
        int hashCode = (this.f11512a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f11512a;
    }
}
