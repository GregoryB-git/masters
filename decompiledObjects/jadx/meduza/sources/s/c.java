package s;

/* loaded from: classes.dex */
public final class c extends Throwable {
    public c(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
