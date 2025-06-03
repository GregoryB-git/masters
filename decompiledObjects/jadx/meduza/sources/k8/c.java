package k8;

import k8.i;
import lc.k;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends ec.h implements dc.a<Boolean> {
    public c(i.a aVar) {
        super(0, aVar, i.a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
    }

    @Override // dc.a
    public final Boolean invoke() {
        ((i.a) this.receiver).getClass();
        String b10 = i.a.b();
        ec.i.d(b10, "threadName");
        return Boolean.valueOf(k.o0(b10, "Firebase Background Thread #"));
    }
}
