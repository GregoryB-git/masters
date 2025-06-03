package W2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class l implements Serializable {
    private static final long serialVersionUID = 0;

    public static l a() {
        return a.e();
    }

    public static l d(Object obj) {
        return new p(m.j(obj));
    }

    public abstract Object b();

    public abstract boolean c();
}
