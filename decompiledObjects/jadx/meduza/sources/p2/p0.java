package p2;

import android.util.Log;
import androidx.work.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o2.j;

/* loaded from: classes.dex */
public final class p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f12915b;

    public p0(q0 q0Var, String str) {
        this.f12915b = q0Var;
        this.f12914a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                d.a aVar = this.f12915b.f12934x.get();
                if (aVar == null) {
                    o2.j.d().b(q0.f12920z, this.f12915b.f12923c.f16832c + " returned a null result. Treating it as a failure.");
                } else {
                    o2.j.d().a(q0.f12920z, this.f12915b.f12923c.f16832c + " returned a " + aVar + ".");
                    this.f12915b.f = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                o2.j.d().c(q0.f12920z, this.f12914a + " failed because it threw an exception/error", e);
            } catch (CancellationException e11) {
                o2.j d10 = o2.j.d();
                String str = q0.f12920z;
                String str2 = this.f12914a + " was cancelled";
                if (((j.a) d10).f11721c <= 4) {
                    Log.i(str, str2, e11);
                }
            } catch (ExecutionException e12) {
                e = e12;
                o2.j.d().c(q0.f12920z, this.f12914a + " failed because it threw an exception/error", e);
            }
        } finally {
            this.f12915b.c();
        }
    }
}
