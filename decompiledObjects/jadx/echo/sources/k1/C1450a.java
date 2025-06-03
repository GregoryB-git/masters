package k1;

import c1.C0816e;
import c1.k;
import c1.s;
import c1.t;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.M;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1450a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final z f16079a = new z();

    public static C1280a e(z zVar, int i7) {
        CharSequence charSequence = null;
        C1280a.b bVar = null;
        while (i7 > 0) {
            AbstractC1297a.b(i7 >= 8, "Incomplete vtt cue box header found.");
            int p7 = zVar.p();
            int p8 = zVar.p();
            int i8 = p7 - 8;
            String I6 = M.I(zVar.e(), zVar.f(), i8);
            zVar.U(i8);
            i7 = (i7 - 8) - i8;
            if (p8 == 1937011815) {
                bVar = AbstractC1454e.o(I6);
            } else if (p8 == 1885436268) {
                charSequence = AbstractC1454e.q(null, I6.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.o(charSequence).a() : AbstractC1454e.l(charSequence);
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        this.f16079a.R(bArr, i8 + i7);
        this.f16079a.T(i7);
        ArrayList arrayList = new ArrayList();
        while (this.f16079a.a() > 0) {
            AbstractC1297a.b(this.f16079a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int p7 = this.f16079a.p();
            if (this.f16079a.p() == 1987343459) {
                arrayList.add(e(this.f16079a, p7 - 8));
            } else {
                this.f16079a.U(p7 - 8);
            }
        }
        interfaceC1303g.accept(new C0816e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // c1.t
    public int d() {
        return 2;
    }
}
