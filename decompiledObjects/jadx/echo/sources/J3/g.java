package J3;

import J3.B;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends B.d.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2873a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2874b;

    public static final class b extends B.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        public String f2875a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f2876b;

        @Override // J3.B.d.b.a
        public B.d.b a() {
            String str = "";
            if (this.f2875a == null) {
                str = " filename";
            }
            if (this.f2876b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f2875a, this.f2876b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.d.b.a
        public B.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f2876b = bArr;
            return this;
        }

        @Override // J3.B.d.b.a
        public B.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f2875a = str;
            return this;
        }
    }

    public g(String str, byte[] bArr) {
        this.f2873a = str;
        this.f2874b = bArr;
    }

    @Override // J3.B.d.b
    public byte[] b() {
        return this.f2874b;
    }

    @Override // J3.B.d.b
    public String c() {
        return this.f2873a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d.b)) {
            return false;
        }
        B.d.b bVar = (B.d.b) obj;
        if (this.f2873a.equals(bVar.c())) {
            if (Arrays.equals(this.f2874b, bVar instanceof g ? ((g) bVar).f2874b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2873a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2874b);
    }

    public String toString() {
        return "File{filename=" + this.f2873a + ", contents=" + Arrays.toString(this.f2874b) + "}";
    }
}
