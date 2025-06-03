package i3;

import c3.AbstractC0846x;
import c3.C0844v;
import c3.InterfaceC0827e;
import c3.InterfaceC0845w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import k3.AbstractC1468f;
import k3.C1469g;
import n3.C1727c;
import n3.InterfaceC1726b;
import q3.AbstractC1890f;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1355c implements InterfaceC0845w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14861a = Logger.getLogger(C1355c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C1355c f14862b = new C1355c();

    /* renamed from: i3.c$a */
    public static class a implements InterfaceC0827e {

        /* renamed from: a, reason: collision with root package name */
        public final C0844v f14863a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1726b.a f14864b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1726b.a f14865c;

        public a(C0844v c0844v) {
            InterfaceC1726b.a aVar;
            this.f14863a = c0844v;
            if (c0844v.i()) {
                InterfaceC1726b a7 = C1469g.b().a();
                C1727c a8 = AbstractC1468f.a(c0844v);
                this.f14864b = a7.a(a8, "daead", "encrypt");
                aVar = a7.a(a8, "daead", "decrypt");
            } else {
                aVar = AbstractC1468f.f16149a;
                this.f14864b = aVar;
            }
            this.f14865c = aVar;
        }

        @Override // c3.InterfaceC0827e
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a7 = AbstractC1890f.a(this.f14863a.e().b(), ((InterfaceC0827e) this.f14863a.e().g()).a(bArr, bArr2));
                this.f14864b.b(this.f14863a.e().d(), bArr.length);
                return a7;
            } catch (GeneralSecurityException e7) {
                this.f14864b.a();
                throw e7;
            }
        }

        @Override // c3.InterfaceC0827e
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C0844v.c cVar : this.f14863a.f(copyOf)) {
                    try {
                        byte[] b7 = ((InterfaceC0827e) cVar.g()).b(copyOfRange, bArr2);
                        this.f14865c.b(cVar.d(), copyOfRange.length);
                        return b7;
                    } catch (GeneralSecurityException e7) {
                        C1355c.f14861a.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                    }
                }
            }
            for (C0844v.c cVar2 : this.f14863a.h()) {
                try {
                    byte[] b8 = ((InterfaceC0827e) cVar2.g()).b(bArr, bArr2);
                    this.f14865c.b(cVar2.d(), bArr.length);
                    return b8;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f14865c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public static void e() {
        AbstractC0846x.n(f14862b);
    }

    @Override // c3.InterfaceC0845w
    public Class a() {
        return InterfaceC0827e.class;
    }

    @Override // c3.InterfaceC0845w
    public Class c() {
        return InterfaceC0827e.class;
    }

    @Override // c3.InterfaceC0845w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC0827e b(C0844v c0844v) {
        return new a(c0844v);
    }
}
