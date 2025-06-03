package t5;

import java.io.FileNotFoundException;
import java.io.IOException;
import t5.c0;
import t5.d0;
import v3.a1;

/* loaded from: classes.dex */
public final class u implements c0 {
    public final c0.b a(c0.a aVar, c0.c cVar) {
        int i10;
        IOException iOException = cVar.f14461a;
        if (!((iOException instanceof z) && ((i10 = ((z) iOException).f14616d) == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503))) {
            return null;
        }
        if (aVar.a(1)) {
            return new c0.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new c0.b(2, 60000L);
        }
        return null;
    }

    public final int b(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    public final long c(c0.c cVar) {
        boolean z10;
        Throwable th = cVar.f14461a;
        if (!(th instanceof a1) && !(th instanceof FileNotFoundException) && !(th instanceof w) && !(th instanceof d0.g)) {
            int i10 = l.f14531b;
            while (true) {
                if (th == null) {
                    z10 = false;
                    break;
                }
                if ((th instanceof l) && ((l) th).f14532a == 2008) {
                    z10 = true;
                    break;
                }
                th = th.getCause();
            }
            if (!z10) {
                return Math.min((cVar.f14462b - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }
}
