package fa;

import defpackage.f;
import ec.i;

/* loaded from: classes.dex */
public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        /* JADX INFO: Fake field, exist only in values array */
        MATT_SAYS_HI
    }

    /* renamed from: fa.b$b, reason: collision with other inner class name */
    public static final class C0085b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5526a;

        public C0085b(String str) {
            i.e(str, "sessionId");
            this.f5526a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0085b) && i.a(this.f5526a, ((C0085b) obj).f5526a);
        }

        public final int hashCode() {
            return this.f5526a.hashCode();
        }

        public final String toString() {
            StringBuilder l10 = f.l("SessionDetails(sessionId=");
            l10.append(this.f5526a);
            l10.append(')');
            return l10.toString();
        }
    }

    void a(C0085b c0085b);

    boolean b();

    void c();
}
