package c6;

import b6.AbstractC0806a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0854a extends AbstractC0806a {

    /* renamed from: c6.a$a, reason: collision with other inner class name */
    public static final class C0170a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0170a f10175a = new C0170a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f10176b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f10176b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f10176b = num2;
        }
    }

    private final boolean c(int i7) {
        Integer num = C0170a.f10176b;
        return num == null || num.intValue() >= i7;
    }

    @Override // b6.AbstractC0806a
    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
