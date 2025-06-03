package wa;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a extends m.e {
    public a() {
        super(8);
    }

    @Override // wa.d
    public final void a(Serializable serializable) {
        v().a(serializable);
    }

    @Override // wa.d
    public final void b(String str, HashMap hashMap) {
        v().b(str, hashMap);
    }

    public abstract d v();
}
