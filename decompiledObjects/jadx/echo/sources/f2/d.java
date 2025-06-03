package f2;

import c2.EnumC0821d;
import f2.p;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f14193a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14194b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0821d f14195c;

    public static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        public String f14196a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f14197b;

        /* renamed from: c, reason: collision with root package name */
        public EnumC0821d f14198c;

        @Override // f2.p.a
        public p a() {
            String str = "";
            if (this.f14196a == null) {
                str = " backendName";
            }
            if (this.f14198c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f14196a, this.f14197b, this.f14198c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f2.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f14196a = str;
            return this;
        }

        @Override // f2.p.a
        public p.a c(byte[] bArr) {
            this.f14197b = bArr;
            return this;
        }

        @Override // f2.p.a
        public p.a d(EnumC0821d enumC0821d) {
            if (enumC0821d == null) {
                throw new NullPointerException("Null priority");
            }
            this.f14198c = enumC0821d;
            return this;
        }
    }

    public d(String str, byte[] bArr, EnumC0821d enumC0821d) {
        this.f14193a = str;
        this.f14194b = bArr;
        this.f14195c = enumC0821d;
    }

    @Override // f2.p
    public String b() {
        return this.f14193a;
    }

    @Override // f2.p
    public byte[] c() {
        return this.f14194b;
    }

    @Override // f2.p
    public EnumC0821d d() {
        return this.f14195c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f14193a.equals(pVar.b())) {
            if (Arrays.equals(this.f14194b, pVar instanceof d ? ((d) pVar).f14194b : pVar.c()) && this.f14195c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f14193a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14194b)) * 1000003) ^ this.f14195c.hashCode();
    }
}
