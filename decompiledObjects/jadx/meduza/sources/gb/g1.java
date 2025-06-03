package gb;

import java.util.List;

/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f6432b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d1 d1Var = g1.this.f6432b;
            h2 h2Var = d1Var.f6269s;
            d1Var.f6268r = null;
            d1Var.f6269s = null;
            h2Var.c(eb.e1.f5078n.g("InternalSubchannel closed transport due to address change"));
        }
    }

    public g1(d1 d1Var, List list) {
        this.f6432b = d1Var;
        this.f6431a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g1.run():void");
    }
}
