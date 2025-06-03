package d3;

import d3.q;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public final class o extends AbstractC1216b {

    /* renamed from: a, reason: collision with root package name */
    public final q f13215a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f13216b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f13217c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13218d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public q f13219a;

        /* renamed from: b, reason: collision with root package name */
        public C1920b f13220b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13221c;

        public b() {
            this.f13219a = null;
            this.f13220b = null;
            this.f13221c = null;
        }

        public o a() {
            q qVar = this.f13219a;
            if (qVar == null || this.f13220b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f13220b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f13219a.f() && this.f13221c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f13219a.f() && this.f13221c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f13219a, this.f13220b, b(), this.f13221c);
        }

        public final C1919a b() {
            if (this.f13219a.e() == q.c.f13233d) {
                return C1919a.a(new byte[0]);
            }
            if (this.f13219a.e() == q.c.f13232c) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f13221c.intValue()).array());
            }
            if (this.f13219a.e() == q.c.f13231b) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f13221c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f13219a.e());
        }

        public b c(Integer num) {
            this.f13221c = num;
            return this;
        }

        public b d(C1920b c1920b) {
            this.f13220b = c1920b;
            return this;
        }

        public b e(q qVar) {
            this.f13219a = qVar;
            return this;
        }
    }

    public o(q qVar, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f13215a = qVar;
        this.f13216b = c1920b;
        this.f13217c = c1919a;
        this.f13218d = num;
    }

    public static b a() {
        return new b();
    }
}
