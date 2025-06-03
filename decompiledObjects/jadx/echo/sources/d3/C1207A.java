package d3;

import java.util.Objects;

/* renamed from: d3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207A extends AbstractC1217c {

    /* renamed from: a, reason: collision with root package name */
    public final a f13139a;

    /* renamed from: d3.A$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13140b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f13141c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f13142d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f13143a;

        public a(String str) {
            this.f13143a = str;
        }

        public String toString() {
            return this.f13143a;
        }
    }

    public C1207A(a aVar) {
        this.f13139a = aVar;
    }

    public static C1207A a(a aVar) {
        return new C1207A(aVar);
    }

    public a b() {
        return this.f13139a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1207A) && ((C1207A) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f13139a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f13139a + ")";
    }
}
