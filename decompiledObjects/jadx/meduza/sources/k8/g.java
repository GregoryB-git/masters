package k8;

import android.os.Looper;
import k8.i;

/* loaded from: classes.dex */
public final /* synthetic */ class g extends ec.h implements dc.a<Boolean> {
    public g(i.a aVar) {
        super(0, aVar, i.a.class, "isNotMainThread", "isNotMainThread()Z", 0);
    }

    @Override // dc.a
    public final Boolean invoke() {
        ((i.a) this.receiver).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
