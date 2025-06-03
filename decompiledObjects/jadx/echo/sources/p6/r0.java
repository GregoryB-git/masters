package p6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends CancellationException {

    /* renamed from: o, reason: collision with root package name */
    public final transient InterfaceC1869q0 f18552o;

    public r0(String str, Throwable th, InterfaceC1869q0 interfaceC1869q0) {
        super(str);
        this.f18552o = interfaceC1869q0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (!Intrinsics.a(r0Var.getMessage(), getMessage()) || !Intrinsics.a(r0Var.f18552o, this.f18552o) || !Intrinsics.a(r0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f18552o.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f18552o;
    }
}
