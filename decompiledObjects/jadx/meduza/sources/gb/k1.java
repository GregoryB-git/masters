package gb;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb.e1 f6561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f6562b;

    public k1(d1 d1Var, eb.e1 e1Var) {
        this.f6562b = d1Var;
        this.f6561a = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = new ArrayList(this.f6562b.t).iterator();
        while (it.hasNext()) {
            ((h2) it.next()).h(this.f6561a);
        }
    }
}
