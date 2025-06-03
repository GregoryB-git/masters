package V2;

/* renamed from: V2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652c extends IllegalStateException {
    public C0652c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC0659j abstractC0659j) {
        if (!abstractC0659j.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i7 = abstractC0659j.i();
        return new C0652c("Complete with: ".concat(i7 != null ? "failure" : abstractC0659j.n() ? "result ".concat(String.valueOf(abstractC0659j.j())) : abstractC0659j.l() ? "cancellation" : "unknown issue"), i7);
    }
}
