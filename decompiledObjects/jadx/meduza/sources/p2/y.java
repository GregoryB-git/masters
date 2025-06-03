package p2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends m.e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f12966k = o2.j.f("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final k0 f12967b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12969d;

    /* renamed from: e, reason: collision with root package name */
    public final List<? extends o2.q> f12970e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12971g;

    /* renamed from: h, reason: collision with root package name */
    public final List<y> f12972h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12973i;

    /* renamed from: j, reason: collision with root package name */
    public o f12974j;

    public y() {
        throw null;
    }

    public y(k0 k0Var, List<? extends o2.q> list) {
        super(3);
        this.f12967b = k0Var;
        this.f12968c = null;
        this.f12969d = 2;
        this.f12970e = list;
        this.f12972h = null;
        this.f = new ArrayList(list.size());
        this.f12971g = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = list.get(i10).f11745a.toString();
            ec.i.d(uuid, "id.toString()");
            this.f.add(uuid);
            this.f12971g.add(uuid);
        }
    }

    public static boolean v(y yVar, HashSet hashSet) {
        hashSet.addAll(yVar.f);
        HashSet w10 = w(yVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (w10.contains((String) it.next())) {
                return true;
            }
        }
        List<y> list = yVar.f12972h;
        if (list != null && !list.isEmpty()) {
            Iterator<y> it2 = list.iterator();
            while (it2.hasNext()) {
                if (v(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(yVar.f);
        return false;
    }

    public static HashSet w(y yVar) {
        HashSet hashSet = new HashSet();
        List<y> list = yVar.f12972h;
        if (list != null && !list.isEmpty()) {
            Iterator<y> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f);
            }
        }
        return hashSet;
    }
}
