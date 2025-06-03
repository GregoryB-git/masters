package e7;

import android.util.Log;

/* loaded from: classes.dex */
public final class j5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4377b;

    public /* synthetic */ j5(Object obj, int i10) {
        this.f4376a = i10;
        this.f4377b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4376a) {
            case 0:
                w4 w4Var = ((i5) this.f4377b).f4329c;
                w4Var.f4735e = null;
                w4Var.G();
                return;
            default:
                i7.a aVar = (i7.a) this.f4377b;
                synchronized (aVar.f7629a) {
                    if (aVar.b()) {
                        Log.e("WakeLock", String.valueOf(aVar.f7637j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        aVar.d();
                        if (aVar.b()) {
                            aVar.f7631c = 1;
                            aVar.e();
                        }
                    }
                }
                return;
        }
    }
}
