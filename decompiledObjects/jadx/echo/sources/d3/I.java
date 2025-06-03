package d3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class I extends AbstractC1217c {

    /* renamed from: a, reason: collision with root package name */
    public final a f13160a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13161b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f13162c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f13163d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f13164a;

        public a(String str) {
            this.f13164a = str;
        }

        public String toString() {
            return this.f13164a;
        }
    }

    public I(a aVar) {
        this.f13160a = aVar;
    }

    public static I a(a aVar) {
        return new I(aVar);
    }

    public a b() {
        return this.f13160a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f13160a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f13160a + ")";
    }
}
