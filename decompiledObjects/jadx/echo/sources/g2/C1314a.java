package g2;

import g2.f;
import java.util.Arrays;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f14390a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14391b;

    /* renamed from: g2.a$b */
    public static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public Iterable f14392a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f14393b;

        @Override // g2.f.a
        public f a() {
            String str = "";
            if (this.f14392a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C1314a(this.f14392a, this.f14393b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g2.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f14392a = iterable;
            return this;
        }

        @Override // g2.f.a
        public f.a c(byte[] bArr) {
            this.f14393b = bArr;
            return this;
        }
    }

    public C1314a(Iterable iterable, byte[] bArr) {
        this.f14390a = iterable;
        this.f14391b = bArr;
    }

    @Override // g2.f
    public Iterable b() {
        return this.f14390a;
    }

    @Override // g2.f
    public byte[] c() {
        return this.f14391b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f14390a.equals(fVar.b())) {
            if (Arrays.equals(this.f14391b, fVar instanceof C1314a ? ((C1314a) fVar).f14391b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14390a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14391b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f14390a + ", extras=" + Arrays.toString(this.f14391b) + "}";
    }
}
