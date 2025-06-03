package l3;

import c3.AbstractC0846x;
import c3.C0844v;
import c3.InterfaceC0842t;
import c3.InterfaceC0845w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import k3.AbstractC1468f;
import k3.C1469g;
import n3.C1727c;
import n3.InterfaceC1726b;
import p3.I;
import q3.AbstractC1890f;
import r3.C1919a;

/* loaded from: classes.dex */
public class r implements InterfaceC0845w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f17228a = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f17229b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final r f17230c = new r();

    public static class b implements InterfaceC0842t {

        /* renamed from: a, reason: collision with root package name */
        public final C0844v f17231a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1726b.a f17232b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1726b.a f17233c;

        public b(C0844v c0844v) {
            InterfaceC1726b.a aVar;
            this.f17231a = c0844v;
            if (c0844v.i()) {
                InterfaceC1726b a7 = C1469g.b().a();
                C1727c a8 = AbstractC1468f.a(c0844v);
                this.f17232b = a7.a(a8, "mac", "compute");
                aVar = a7.a(a8, "mac", "verify");
            } else {
                aVar = AbstractC1468f.f16149a;
                this.f17232b = aVar;
            }
            this.f17233c = aVar;
        }

        @Override // c3.InterfaceC0842t
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f17233c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (C0844v.c cVar : this.f17231a.f(copyOf)) {
                try {
                    ((InterfaceC0842t) cVar.g()).a(copyOfRange, cVar.f().equals(I.LEGACY) ? AbstractC1890f.a(bArr2, r.f17229b) : bArr2);
                    this.f17233c.b(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e7) {
                    r.f17228a.info("tag prefix matches a key, but cannot verify: " + e7);
                }
            }
            for (C0844v.c cVar2 : this.f17231a.h()) {
                try {
                    ((InterfaceC0842t) cVar2.g()).a(bArr, bArr2);
                    this.f17233c.b(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f17233c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // c3.InterfaceC0842t
        public byte[] b(byte[] bArr) {
            if (this.f17231a.e().f().equals(I.LEGACY)) {
                bArr = AbstractC1890f.a(bArr, r.f17229b);
            }
            try {
                byte[] a7 = AbstractC1890f.a(this.f17231a.e().b(), ((InterfaceC0842t) this.f17231a.e().g()).b(bArr));
                this.f17232b.b(this.f17231a.e().d(), bArr.length);
                return a7;
            } catch (GeneralSecurityException e7) {
                this.f17232b.a();
                throw e7;
            }
        }
    }

    public static void f() {
        AbstractC0846x.n(f17230c);
    }

    @Override // c3.InterfaceC0845w
    public Class a() {
        return InterfaceC0842t.class;
    }

    @Override // c3.InterfaceC0845w
    public Class c() {
        return InterfaceC0842t.class;
    }

    public final void g(C0844v c0844v) {
        Iterator it = c0844v.c().iterator();
        while (it.hasNext()) {
            for (C0844v.c cVar : (List) it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    C1919a a7 = C1919a.a(cVar.b());
                    if (!a7.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + a7 + ")");
                    }
                }
            }
        }
    }

    @Override // c3.InterfaceC0845w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC0842t b(C0844v c0844v) {
        g(c0844v);
        return new b(c0844v);
    }
}
