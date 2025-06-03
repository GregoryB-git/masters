package x9;

import java.util.concurrent.TimeUnit;
import u9.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f17225d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f17226e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f17227a = k.a();

    /* renamed from: b, reason: collision with root package name */
    public long f17228b;

    /* renamed from: c, reason: collision with root package name */
    public int f17229c;

    public final synchronized void a(int i10) {
        long min;
        boolean z10 = false;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f17229c = 0;
            }
            return;
        }
        this.f17229c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                z10 = true;
            }
            if (z10) {
                double pow = Math.pow(2.0d, this.f17229c);
                this.f17227a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f17226e);
            } else {
                min = f17225d;
            }
            this.f17227a.f15131a.getClass();
            this.f17228b = System.currentTimeMillis() + min;
        }
        return;
    }
}
