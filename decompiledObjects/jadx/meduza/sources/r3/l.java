package r3;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.n0;
import eb.t0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r3.t;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements t.a, l.a, n9.l, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13564c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f13562a = i10;
        this.f13563b = obj;
        this.f13564c = obj2;
    }

    @Override // r3.t.a
    public final Object apply(Object obj) {
        t tVar = (t) this.f13563b;
        k3.s sVar = (k3.s) this.f13564c;
        tVar.getClass();
        Long Q = t.Q((SQLiteDatabase) obj, sVar);
        return Q == null ? Boolean.FALSE : (Boolean) t.k0(tVar.I().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{Q.toString()}), new w3.v(3));
    }

    @Override // n9.l
    public final Object get() {
        switch (this.f13562a) {
            case 5:
                return ((i9.n) this.f13563b).f7751j.d((String) this.f13564c);
            default:
                i9.n nVar = (i9.n) this.f13563b;
                k9.h hVar = (k9.h) this.f13564c;
                int i10 = i9.n.f7742o;
                nVar.getClass();
                k9.g gVar = hVar.f9157a;
                nVar.f7745c.j(gVar, hVar.f9160d);
                k9.g gVar2 = hVar.f9157a;
                Iterator it = gVar2.b().iterator();
                while (true) {
                    int i11 = 0;
                    if (!it.hasNext()) {
                        nVar.f7745c.b(gVar2);
                        nVar.f7745c.a();
                        nVar.f7746d.f(hVar.f9157a.f9153a);
                        i9.h hVar2 = nVar.f;
                        HashSet hashSet = new HashSet();
                        while (i11 < hVar.f9159c.size()) {
                            if (!hVar.f9159c.get(i11).f9163b.isEmpty()) {
                                hashSet.add(hVar.f9157a.f9156d.get(i11).f9150a);
                            }
                            i11++;
                        }
                        hVar2.g(hVar2.f7687a.a(hashSet));
                        return nVar.f.b(gVar.b());
                    }
                    j9.i iVar = (j9.i) it.next();
                    j9.m g10 = nVar.f7747e.g(iVar);
                    j9.q h10 = hVar.f9161e.h(iVar);
                    x6.b.Z("docVersions should contain every doc in the write.", h10 != null, new Object[0]);
                    if (g10.f8695d.compareTo(h10) < 0) {
                        int size = gVar2.f9156d.size();
                        List<k9.i> list = hVar.f9159c;
                        x6.b.Z("Mismatch between mutations length (%d) and results length (%d)", list.size() == size, Integer.valueOf(size), Integer.valueOf(list.size()));
                        while (i11 < size) {
                            k9.f fVar = gVar2.f9156d.get(i11);
                            if (fVar.f9150a.equals(g10.f8693b)) {
                                fVar.b(g10, list.get(i11));
                            }
                            i11++;
                        }
                        if (!q0.g.b(g10.f8694c, 1)) {
                            nVar.f7747e.d(g10, hVar.f9158b);
                        }
                    }
                }
        }
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f13562a) {
            case 1:
                ((w3.b) obj).x0();
                break;
            case 2:
                w3.b bVar = (w3.b) obj;
                bVar.w0();
                bVar.Z();
                break;
            case 3:
                ((w3.b) obj).y0();
                break;
            default:
                ((w3.b) obj).a0();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        m9.y yVar = (m9.y) this.f13563b;
        t0 t0Var = (t0) this.f13564c;
        yVar.getClass();
        return Tasks.forResult(((n0) task.getResult()).v(t0Var, yVar.f10905c));
    }
}
