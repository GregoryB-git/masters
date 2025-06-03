package sc;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14368a = 0;

    static {
        Object a10;
        Object a11;
        Exception exc = new Exception();
        String simpleName = a.b.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE." + simpleName, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a10 = Class.forName("wb.a").getCanonicalName();
        } catch (Throwable th) {
            a10 = rb.f.a(th);
        }
        if (rb.e.a(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a11 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            a11 = rb.f.a(th2);
        }
        if (rb.e.a(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
