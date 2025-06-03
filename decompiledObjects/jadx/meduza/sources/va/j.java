package va;

import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    public final int f16035b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16036c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList<f> f16037d = new LinkedList<>();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f16038e = new HashSet();
    public final HashSet f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f16039g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f16034a = "Sqflite";

    public j(int i10, int i11) {
        this.f16035b = i10;
        this.f16036c = i11;
    }

    @Override // va.i
    public final void a(d dVar, Runnable runnable) {
        d(new f(dVar == null ? null : new h(dVar), runnable));
    }

    @Override // va.i
    public final synchronized void b() {
        Iterator it = this.f16038e.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            synchronized (gVar) {
                HandlerThread handlerThread = gVar.f16030c;
                if (handlerThread != null) {
                    handlerThread.quit();
                    gVar.f16030c = null;
                    gVar.f16031d = null;
                }
            }
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            synchronized (gVar2) {
                HandlerThread handlerThread2 = gVar2.f16030c;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                    gVar2.f16030c = null;
                    gVar2.f16031d = null;
                }
            }
        }
    }

    public final synchronized f c(g gVar) {
        f next;
        g gVar2;
        ListIterator<f> listIterator = this.f16037d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            gVar2 = next.a() != null ? (g) this.f16039g.get(next.a()) : null;
            if (gVar2 == null) {
                break;
            }
        } while (gVar2 != gVar);
        listIterator.remove();
        return next;
    }

    public final synchronized void d(f fVar) {
        this.f16037d.add(fVar);
        Iterator it = new HashSet(this.f16038e).iterator();
        while (it.hasNext()) {
            e((g) it.next());
        }
    }

    public final synchronized void e(g gVar) {
        f c10 = c(gVar);
        if (c10 != null) {
            this.f.add(gVar);
            this.f16038e.remove(gVar);
            if (c10.a() != null) {
                this.f16039g.put(c10.a(), gVar);
            }
            gVar.f16031d.post(new x0.f(24, gVar, c10));
        }
    }

    @Override // va.i
    public final synchronized void start() {
        for (int i10 = 0; i10 < this.f16035b; i10++) {
            g gVar = new g(this.f16034a + i10, this.f16036c);
            gVar.a(new w.g(25, this, gVar));
            this.f16038e.add(gVar);
        }
    }
}
