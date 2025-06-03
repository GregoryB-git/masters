package S4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: S4.b$b, reason: collision with other inner class name */
    public static final class C0095b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5905a;

        public C0095b(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f5905a = sessionId;
        }

        public final String a() {
            return this.f5905a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0095b) && Intrinsics.a(this.f5905a, ((C0095b) obj).f5905a);
        }

        public int hashCode() {
            return this.f5905a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f5905a + ')';
        }
    }

    a a();

    void b(C0095b c0095b);

    boolean c();
}
