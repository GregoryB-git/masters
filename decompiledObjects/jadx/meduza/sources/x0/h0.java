package x0;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r.g;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f16656a = new j0();

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f16657b;

    static {
        n0 n0Var;
        try {
            n0Var = (n0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n0Var = null;
        }
        f16657b = n0Var;
    }

    public static final void a(i iVar, i iVar2, boolean z10, r.b bVar) {
        ec.i.e(iVar, "inFragment");
        ec.i.e(iVar2, "outFragment");
        ec.i.e(bVar, "sharedElements");
        if ((z10 ? iVar2.getEnterTransitionCallback() : iVar.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(bVar.f13500c);
            Iterator it = ((g.b) bVar.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(bVar.f13500c);
            Iterator it2 = ((g.b) bVar.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(r.b<String, String> bVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (ec.i.a(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) (arrayList.isEmpty() ? null : arrayList.get(0));
    }

    public static final void c(int i10, List list) {
        ec.i.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
