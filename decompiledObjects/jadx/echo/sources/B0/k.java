package B0;

import B0.m;
import B0.n;
import d0.C1162A;
import i0.t;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f620a;

    public k() {
        this(-1);
    }

    @Override // B0.m
    public /* synthetic */ void a(long j7) {
        l.a(this, j7);
    }

    @Override // B0.m
    public m.b b(m.a aVar, m.c cVar) {
        if (!e(cVar.f629c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new m.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new m.b(2, 60000L);
        }
        return null;
    }

    @Override // B0.m
    public long c(m.c cVar) {
        IOException iOException = cVar.f629c;
        if ((iOException instanceof C1162A) || (iOException instanceof FileNotFoundException) || (iOException instanceof i0.q) || (iOException instanceof n.h) || i0.h.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f630d - 1) * 1000, 5000);
    }

    @Override // B0.m
    public int d(int i7) {
        int i8 = this.f620a;
        return i8 == -1 ? i7 == 7 ? 6 : 3 : i8;
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof t)) {
            return false;
        }
        int i7 = ((t) iOException).f14720r;
        return i7 == 403 || i7 == 404 || i7 == 410 || i7 == 416 || i7 == 500 || i7 == 503;
    }

    public k(int i7) {
        this.f620a = i7;
    }
}
