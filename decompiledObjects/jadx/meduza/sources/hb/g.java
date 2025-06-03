package hb;

import eb.o0;
import eb.p0;

/* loaded from: classes.dex */
public final class g extends p0 {
    @Override // eb.p0
    public o0 a(String str) {
        return new e(str);
    }

    @Override // eb.p0
    public boolean b() {
        return true;
    }

    @Override // eb.p0
    public int c() {
        boolean z10 = false;
        try {
            Class.forName("android.app.Application", false, g.class.getClassLoader());
            z10 = true;
        } catch (Exception unused) {
        }
        return z10 ? 8 : 3;
    }
}
