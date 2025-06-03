package R2;

import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.C0903f2;
import com.google.android.gms.internal.measurement.C0912g2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t.C1958a;

/* loaded from: classes.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public String f5255a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5256b;

    /* renamed from: c, reason: collision with root package name */
    public C0903f2 f5257c;

    /* renamed from: d, reason: collision with root package name */
    public BitSet f5258d;

    /* renamed from: e, reason: collision with root package name */
    public BitSet f5259e;

    /* renamed from: f, reason: collision with root package name */
    public Map f5260f;

    /* renamed from: g, reason: collision with root package name */
    public Map f5261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b6 f5262h;

    public d6(b6 b6Var, String str) {
        this.f5262h = b6Var;
        this.f5255a = str;
        this.f5256b = true;
        this.f5258d = new BitSet();
        this.f5259e = new BitSet();
        this.f5260f = new C1958a();
        this.f5261g = new C1958a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.W1$a, com.google.android.gms.internal.measurement.Y3$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.f2$a] */
    public final com.google.android.gms.internal.measurement.W1 a(int i7) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? M6 = com.google.android.gms.internal.measurement.W1.M();
        M6.w(i7);
        M6.z(this.f5256b);
        C0903f2 c0903f2 = this.f5257c;
        if (c0903f2 != null) {
            M6.y(c0903f2);
        }
        ?? D7 = C0903f2.V().z(N5.M(this.f5258d)).D(N5.M(this.f5259e));
        if (this.f5260f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f5260f.size());
            for (Integer num : this.f5260f.keySet()) {
                int intValue = num.intValue();
                Long l7 = (Long) this.f5260f.get(num);
                if (l7 != null) {
                    arrayList.add((com.google.android.gms.internal.measurement.X1) ((com.google.android.gms.internal.measurement.Y3) com.google.android.gms.internal.measurement.X1.L().w(intValue).x(l7.longValue()).p()));
                }
            }
        }
        if (arrayList != null) {
            D7.x(arrayList);
        }
        if (this.f5261g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f5261g.size());
            for (Integer num2 : this.f5261g.keySet()) {
                C0912g2.a w7 = C0912g2.M().w(num2.intValue());
                List list = (List) this.f5261g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    w7.x(list);
                }
                arrayList2.add((C0912g2) ((com.google.android.gms.internal.measurement.Y3) w7.p()));
            }
        }
        D7.B(arrayList2);
        M6.x(D7);
        return (com.google.android.gms.internal.measurement.W1) ((com.google.android.gms.internal.measurement.Y3) M6.p());
    }

    public final void c(AbstractC0490d abstractC0490d) {
        int a7 = abstractC0490d.a();
        Boolean bool = abstractC0490d.f5242c;
        if (bool != null) {
            this.f5259e.set(a7, bool.booleanValue());
        }
        Boolean bool2 = abstractC0490d.f5243d;
        if (bool2 != null) {
            this.f5258d.set(a7, bool2.booleanValue());
        }
        if (abstractC0490d.f5244e != null) {
            Long l7 = (Long) this.f5260f.get(Integer.valueOf(a7));
            long longValue = abstractC0490d.f5244e.longValue() / 1000;
            if (l7 == null || longValue > l7.longValue()) {
                this.f5260f.put(Integer.valueOf(a7), Long.valueOf(longValue));
            }
        }
        if (abstractC0490d.f5245f != null) {
            List list = (List) this.f5261g.get(Integer.valueOf(a7));
            if (list == null) {
                list = new ArrayList();
                this.f5261g.put(Integer.valueOf(a7), list);
            }
            if (abstractC0490d.j()) {
                list.clear();
            }
            if (A6.a() && this.f5262h.f().D(this.f5255a, K.f4839j0) && abstractC0490d.i()) {
                list.clear();
            }
            if (!A6.a() || !this.f5262h.f().D(this.f5255a, K.f4839j0)) {
                list.add(Long.valueOf(abstractC0490d.f5245f.longValue() / 1000));
                return;
            }
            long longValue2 = abstractC0490d.f5245f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }

    public d6(b6 b6Var, String str, C0903f2 c0903f2, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f5262h = b6Var;
        this.f5255a = str;
        this.f5258d = bitSet;
        this.f5259e = bitSet2;
        this.f5260f = map;
        this.f5261g = new C1958a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f5261g.put(num, arrayList);
            }
        }
        this.f5256b = false;
        this.f5257c = c0903f2;
    }
}
