package d3;

import d3.C1223i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.C1919a;
import r3.C1920b;

/* renamed from: d3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221g extends AbstractC1216b {

    /* renamed from: a, reason: collision with root package name */
    public final C1223i f13189a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f13190b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f13191c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13192d;

    /* renamed from: d3.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public C1223i f13193a;

        /* renamed from: b, reason: collision with root package name */
        public C1920b f13194b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13195c;

        public b() {
            this.f13193a = null;
            this.f13194b = null;
            this.f13195c = null;
        }

        public C1221g a() {
            C1223i c1223i = this.f13193a;
            if (c1223i == null || this.f13194b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c1223i.c() != this.f13194b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f13193a.f() && this.f13195c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f13193a.f() && this.f13195c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1221g(this.f13193a, this.f13194b, b(), this.f13195c);
        }

        public final C1919a b() {
            if (this.f13193a.e() == C1223i.c.f13207d) {
                return C1919a.a(new byte[0]);
            }
            if (this.f13193a.e() == C1223i.c.f13206c) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f13195c.intValue()).array());
            }
            if (this.f13193a.e() == C1223i.c.f13205b) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f13195c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f13193a.e());
        }

        public b c(Integer num) {
            this.f13195c = num;
            return this;
        }

        public b d(C1920b c1920b) {
            this.f13194b = c1920b;
            return this;
        }

        public b e(C1223i c1223i) {
            this.f13193a = c1223i;
            return this;
        }
    }

    public C1221g(C1223i c1223i, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f13189a = c1223i;
        this.f13190b = c1920b;
        this.f13191c = c1919a;
        this.f13192d = num;
    }

    public static b a() {
        return new b();
    }
}
