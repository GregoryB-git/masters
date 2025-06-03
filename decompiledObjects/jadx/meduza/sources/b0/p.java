package b0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public Callable<T> f1704a;

    /* renamed from: b, reason: collision with root package name */
    public d0.a<T> f1705b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1706c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0.a f1707a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f1708b;

        public a(d0.a aVar, Object obj) {
            this.f1707a = aVar;
            this.f1708b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f1707a.accept(this.f1708b);
        }
    }

    public p(Handler handler, j jVar, k kVar) {
        this.f1704a = jVar;
        this.f1705b = kVar;
        this.f1706c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t;
        try {
            t = this.f1704a.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f1706c.post(new a(this.f1705b, t));
    }
}
