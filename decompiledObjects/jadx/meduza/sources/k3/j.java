package k3;

import java.util.Arrays;
import k3.s;

/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: a, reason: collision with root package name */
    public final String f8896a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8897b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.e f8898c;

    public static final class a extends s.a {

        /* renamed from: a, reason: collision with root package name */
        public String f8899a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f8900b;

        /* renamed from: c, reason: collision with root package name */
        public h3.e f8901c;

        public final j a() {
            String str = this.f8899a == null ? " backendName" : "";
            if (this.f8901c == null) {
                str = defpackage.g.d(str, " priority");
            }
            if (str.isEmpty()) {
                return new j(this.f8899a, this.f8900b, this.f8901c);
            }
            throw new IllegalStateException(defpackage.g.d("Missing required properties:", str));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f8899a = str;
            return this;
        }

        public final a c(h3.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f8901c = eVar;
            return this;
        }
    }

    public j(String str, byte[] bArr, h3.e eVar) {
        this.f8896a = str;
        this.f8897b = bArr;
        this.f8898c = eVar;
    }

    @Override // k3.s
    public final String b() {
        return this.f8896a;
    }

    @Override // k3.s
    public final byte[] c() {
        return this.f8897b;
    }

    @Override // k3.s
    public final h3.e d() {
        return this.f8898c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f8896a.equals(sVar.b())) {
            if (Arrays.equals(this.f8897b, sVar instanceof j ? ((j) sVar).f8897b : sVar.c()) && this.f8898c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8896a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8897b)) * 1000003) ^ this.f8898c.hashCode();
    }
}
