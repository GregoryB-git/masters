package d3;

import d3.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public final class t extends AbstractC1216b {

    /* renamed from: a, reason: collision with root package name */
    public final v f13241a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f13242b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f13243c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13244d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public v f13245a;

        /* renamed from: b, reason: collision with root package name */
        public C1920b f13246b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13247c;

        public b() {
            this.f13245a = null;
            this.f13246b = null;
            this.f13247c = null;
        }

        public t a() {
            v vVar = this.f13245a;
            if (vVar == null || this.f13246b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f13246b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f13245a.d() && this.f13247c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f13245a.d() && this.f13247c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f13245a, this.f13246b, b(), this.f13247c);
        }

        public final C1919a b() {
            if (this.f13245a.c() == v.c.f13255d) {
                return C1919a.a(new byte[0]);
            }
            if (this.f13245a.c() == v.c.f13254c) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f13247c.intValue()).array());
            }
            if (this.f13245a.c() == v.c.f13253b) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f13247c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f13245a.c());
        }

        public b c(Integer num) {
            this.f13247c = num;
            return this;
        }

        public b d(C1920b c1920b) {
            this.f13246b = c1920b;
            return this;
        }

        public b e(v vVar) {
            this.f13245a = vVar;
            return this;
        }
    }

    public t(v vVar, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f13241a = vVar;
        this.f13242b = c1920b;
        this.f13243c = c1919a;
        this.f13244d = num;
    }

    public static b a() {
        return new b();
    }
}
