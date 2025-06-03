package t0;

import java.util.concurrent.ThreadFactory;
import v5.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14384b;

    public /* synthetic */ a(String str, int i10) {
        this.f14383a = i10;
        this.f14384b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f14383a) {
            case 0:
                Thread thread = new Thread(runnable, this.f14384b);
                thread.setPriority(10);
                return thread;
            default:
                String str = this.f14384b;
                int i10 = e0.f15881a;
                return new Thread(runnable, str);
        }
    }
}
