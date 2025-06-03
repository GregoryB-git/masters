package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import l3.l;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public final l f17188a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f17189b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f17190c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17191d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public l f17192a;

        /* renamed from: b, reason: collision with root package name */
        public C1920b f17193b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f17194c;

        public b() {
            this.f17192a = null;
            this.f17193b = null;
            this.f17194c = null;
        }

        public i a() {
            l lVar = this.f17192a;
            if (lVar == null || this.f17193b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f17193b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f17192a.g() && this.f17194c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f17192a.g() && this.f17194c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f17192a, this.f17193b, b(), this.f17194c);
        }

        public final C1919a b() {
            if (this.f17192a.f() == l.d.f17215e) {
                return C1919a.a(new byte[0]);
            }
            if (this.f17192a.f() == l.d.f17214d || this.f17192a.f() == l.d.f17213c) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17194c.intValue()).array());
            }
            if (this.f17192a.f() == l.d.f17212b) {
                return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17194c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f17192a.f());
        }

        public b c(Integer num) {
            this.f17194c = num;
            return this;
        }

        public b d(C1920b c1920b) {
            this.f17193b = c1920b;
            return this;
        }

        public b e(l lVar) {
            this.f17192a = lVar;
            return this;
        }
    }

    public i(l lVar, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f17188a = lVar;
        this.f17189b = c1920b;
        this.f17190c = c1919a;
        this.f17191d = num;
    }

    public static b c() {
        return new b();
    }

    @Override // l3.p
    public C1919a a() {
        return this.f17190c;
    }

    @Override // l3.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f17188a;
    }
}
