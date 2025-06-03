package gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<a> f6899a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public volatile eb.n f6900b = eb.n.IDLE;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f6901a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f6902b;

        public a(Runnable runnable, Executor executor) {
            this.f6901a = runnable;
            this.f6902b = executor;
        }
    }

    public final void a(eb.n nVar) {
        x6.b.y(nVar, "newState");
        if (this.f6900b == nVar || this.f6900b == eb.n.SHUTDOWN) {
            return;
        }
        this.f6900b = nVar;
        if (this.f6899a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f6899a;
        this.f6899a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            next.f6902b.execute(next.f6901a);
        }
    }
}
