package u6;

import V5.n;
import a.C0715a;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f19956a = new C0715a().a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f19957b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f19958c;

    static {
        Object a7;
        Object a8;
        try {
            n.a aVar = V5.n.f6797o;
            a7 = V5.n.a(Z5.a.class.getCanonicalName());
        } catch (Throwable th) {
            n.a aVar2 = V5.n.f6797o;
            a7 = V5.n.a(V5.o.a(th));
        }
        if (V5.n.b(a7) != null) {
            a7 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f19957b = (String) a7;
        try {
            a8 = V5.n.a(E.class.getCanonicalName());
        } catch (Throwable th2) {
            n.a aVar3 = V5.n.f6797o;
            a8 = V5.n.a(V5.o.a(th2));
        }
        if (V5.n.b(a8) != null) {
            a8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f19958c = (String) a8;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
