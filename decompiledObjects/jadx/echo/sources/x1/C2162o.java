package x1;

import O1.C0451n;
import java.util.Random;

/* renamed from: x1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2162o extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    public static final a f21109o = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: x1.o$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public C2162o() {
    }

    public C2162o(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C2146B.F() || random.nextInt(100) <= 50) {
            return;
        }
        C0451n c0451n = C0451n.f3862a;
        C0451n.a(C0451n.b.ErrorReport, new C0451n.a() { // from class: x1.n
            @Override // O1.C0451n.a
            public final void a(boolean z7) {
                C2162o.b(str, z7);
            }
        });
    }

    public static final void b(String str, boolean z7) {
        if (z7) {
            try {
                U1.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public C2162o(String str, Throwable th) {
        super(str, th);
    }

    public C2162o(Throwable th) {
        super(th);
    }
}
