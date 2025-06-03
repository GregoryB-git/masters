package d3;

import c3.AbstractC0846x;
import c3.C0844v;
import c3.InterfaceC0823a;
import c3.InterfaceC0845w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import k3.AbstractC1468f;
import k3.C1469g;
import n3.C1727c;
import n3.InterfaceC1726b;
import q3.AbstractC1890f;

/* renamed from: d3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1218d implements InterfaceC0845w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f13182a = Logger.getLogger(C1218d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C1218d f13183b = new C1218d();

    /* renamed from: d3.d$b */
    public static class b implements InterfaceC0823a {

        /* renamed from: a, reason: collision with root package name */
        public final C0844v f13184a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1726b.a f13185b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1726b.a f13186c;

        public b(C0844v c0844v) {
            InterfaceC1726b.a aVar;
            this.f13184a = c0844v;
            if (c0844v.i()) {
                InterfaceC1726b a7 = C1469g.b().a();
                C1727c a8 = AbstractC1468f.a(c0844v);
                this.f13185b = a7.a(a8, "aead", "encrypt");
                aVar = a7.a(a8, "aead", "decrypt");
            } else {
                aVar = AbstractC1468f.f16149a;
                this.f13185b = aVar;
            }
            this.f13186c = aVar;
        }

        @Override // c3.InterfaceC0823a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a7 = AbstractC1890f.a(this.f13184a.e().b(), ((InterfaceC0823a) this.f13184a.e().g()).a(bArr, bArr2));
                this.f13185b.b(this.f13184a.e().d(), bArr.length);
                return a7;
            } catch (GeneralSecurityException e7) {
                this.f13185b.a();
                throw e7;
            }
        }

        @Override // c3.InterfaceC0823a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C0844v.c cVar : this.f13184a.f(copyOf)) {
                    try {
                        byte[] b7 = ((InterfaceC0823a) cVar.g()).b(copyOfRange, bArr2);
                        this.f13186c.b(cVar.d(), copyOfRange.length);
                        return b7;
                    } catch (GeneralSecurityException e7) {
                        C1218d.f13182a.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                    }
                }
            }
            for (C0844v.c cVar2 : this.f13184a.h()) {
                try {
                    byte[] b8 = ((InterfaceC0823a) cVar2.g()).b(bArr, bArr2);
                    this.f13186c.b(cVar2.d(), bArr.length);
                    return b8;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f13186c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public static void e() {
        AbstractC0846x.n(f13183b);
    }

    @Override // c3.InterfaceC0845w
    public Class a() {
        return InterfaceC0823a.class;
    }

    @Override // c3.InterfaceC0845w
    public Class c() {
        return InterfaceC0823a.class;
    }

    @Override // c3.InterfaceC0845w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC0823a b(C0844v c0844v) {
        return new b(c0844v);
    }
}
