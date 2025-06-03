package n5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class s implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f18039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18041c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f18042d = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f18043e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Set f18044f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Map f18045g = new HashMap();

    public s(String str, int i7, int i8) {
        this.f18039a = str;
        this.f18040b = i7;
        this.f18041c = i8;
    }

    @Override // n5.q
    public synchronized void a() {
        try {
            Iterator it = this.f18043e.iterator();
            while (it.hasNext()) {
                ((o) it.next()).f();
            }
            Iterator it2 = this.f18044f.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // n5.q
    public /* synthetic */ void b(k kVar, Runnable runnable) {
        p.a(this, kVar, runnable);
    }

    @Override // n5.q
    public synchronized void c(m mVar) {
        this.f18042d.add(mVar);
        Iterator it = new HashSet(this.f18043e).iterator();
        while (it.hasNext()) {
            i((o) it.next());
        }
    }

    public o e(String str, int i7) {
        return new o(str, i7);
    }

    public final synchronized m f(o oVar) {
        m mVar;
        o oVar2;
        try {
            ListIterator listIterator = this.f18042d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                mVar = (m) listIterator.next();
                oVar2 = mVar.a() != null ? (o) this.f18045g.get(mVar.a()) : null;
                if (oVar2 == null) {
                    break;
                }
            } while (oVar2 != oVar);
            listIterator.remove();
            return mVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void g(o oVar) {
        try {
            HashSet hashSet = new HashSet(this.f18043e);
            this.f18044f.remove(oVar);
            this.f18043e.add(oVar);
            if (!oVar.b() && oVar.d() != null) {
                this.f18045g.remove(oVar.d());
            }
            i(oVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                i((o) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(o oVar) {
        try {
            m f7 = f(oVar);
            if (f7 != null) {
                this.f18044f.add(oVar);
                this.f18043e.remove(oVar);
                if (f7.a() != null) {
                    this.f18045g.put(f7.a(), oVar);
                }
                oVar.e(f7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // n5.q
    public synchronized void start() {
        for (int i7 = 0; i7 < this.f18040b; i7++) {
            final o e7 = e(this.f18039a + i7, this.f18041c);
            e7.g(new Runnable() { // from class: n5.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.g(e7);
                }
            });
            this.f18043e.add(e7);
        }
    }
}
