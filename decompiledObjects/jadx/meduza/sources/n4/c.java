package n4;

import c4.i;
import defpackage.f;
import v3.a1;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11261a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11262b;

        public a(int i10, long j10) {
            this.f11261a = i10;
            this.f11262b = j10;
        }

        public static a a(i iVar, u uVar) {
            iVar.m(uVar.f15974a, 0, 8);
            uVar.G(0);
            return new a(uVar.f(), uVar.l());
        }
    }

    public static boolean a(i iVar) {
        u uVar = new u(8);
        int i10 = a.a(iVar, uVar).f11261a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        iVar.m(uVar.f15974a, 0, 4);
        uVar.G(0);
        int f = uVar.f();
        if (f == 1463899717) {
            return true;
        }
        m.c("WavHeaderReader", "Unsupported form type: " + f);
        return false;
    }

    public static a b(int i10, i iVar, u uVar) {
        while (true) {
            a a10 = a.a(iVar, uVar);
            if (a10.f11261a == i10) {
                return a10;
            }
            StringBuilder l10 = f.l("Ignoring unknown WAV chunk: ");
            l10.append(a10.f11261a);
            m.f("WavHeaderReader", l10.toString());
            long j10 = a10.f11262b + 8;
            if (j10 > 2147483647L) {
                StringBuilder l11 = f.l("Chunk is too large (~2GB+) to skip; id: ");
                l11.append(a10.f11261a);
                throw a1.c(l11.toString());
            }
            iVar.j((int) j10);
        }
    }
}
