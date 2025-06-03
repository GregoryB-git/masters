package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import l3.d;
import r3.C1919a;
import r3.C1920b;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final d f17160a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f17161b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f17162c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17163d;

    /* renamed from: l3.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public d f17164a;

        /* renamed from: b, reason: collision with root package name */
        public C1920b f17165b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f17166c;

        public b() {
            this.f17164a = null;
            this.f17165b = null;
            this.f17166c = null;
        }

        public C1604a a() {
            d dVar = this.f17164a;
            if (dVar == null || this.f17165b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f17165b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f17164a.f() && this.f17166c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f17164a.f() && this.f17166c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1604a(this.f17164a, this.f17165b, b(), this.f17166c);
        }

        public final C1919a b() {
            if (this.f17164a.e() == d.c.f17178e) {
                return C1919a.a(new byte[0]);
            }
            if (this.f17164a.e() == d.c.f17177d || this.f17164a.e() == d.c.f17176c) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17166c.intValue()).array());
            }
            if (this.f17164a.e() == d.c.f17175b) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17166c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f17164a.e());
        }

        public b c(C1920b c1920b) {
            this.f17165b = c1920b;
            return this;
        }

        public b d(Integer num) {
            this.f17166c = num;
            return this;
        }

        public b e(d dVar) {
            this.f17164a = dVar;
            return this;
        }
    }

    public C1604a(d dVar, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f17160a = dVar;
        this.f17161b = c1920b;
        this.f17162c = c1919a;
        this.f17163d = num;
    }

    public static b c() {
        return new b();
    }

    @Override // l3.p
    public C1919a a() {
        return this.f17162c;
    }

    @Override // l3.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f17160a;
    }
}
