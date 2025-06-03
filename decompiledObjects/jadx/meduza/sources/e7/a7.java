package e7;

import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzoh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.g;

/* loaded from: classes.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public String f4075a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4076b;

    /* renamed from: c, reason: collision with root package name */
    public zzgf.zzm f4077c;

    /* renamed from: d, reason: collision with root package name */
    public BitSet f4078d;

    /* renamed from: e, reason: collision with root package name */
    public BitSet f4079e;
    public Map<Integer, Long> f;

    /* renamed from: g, reason: collision with root package name */
    public r.b f4080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y6 f4081h;

    public a7() {
        throw null;
    }

    public a7(y6 y6Var, String str) {
        this.f4081h = y6Var;
        this.f4075a = str;
        this.f4076b = true;
        this.f4078d = new BitSet();
        this.f4079e = new BitSet();
        this.f = new r.b();
        this.f4080g = new r.b();
    }

    public final void a(b bVar) {
        int a10 = bVar.a();
        Boolean bool = bVar.f4084c;
        if (bool != null) {
            this.f4079e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = bVar.f4085d;
        if (bool2 != null) {
            this.f4078d.set(a10, bool2.booleanValue());
        }
        if (bVar.f4086e != null) {
            Long l10 = this.f.get(Integer.valueOf(a10));
            long longValue = bVar.f4086e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f.put(Integer.valueOf(a10), Long.valueOf(longValue));
            }
        }
        if (bVar.f != null) {
            List list = (List) this.f4080g.getOrDefault(Integer.valueOf(a10), null);
            if (list == null) {
                list = new ArrayList();
                this.f4080g.put(Integer.valueOf(a10), list);
            }
            if (bVar.f()) {
                list.clear();
            }
            if (zzoh.zza() && this.f4081h.h().x(this.f4075a, h0.A0) && bVar.e()) {
                list.clear();
            }
            if (!zzoh.zza() || !this.f4081h.h().x(this.f4075a, h0.A0)) {
                list.add(Long.valueOf(bVar.f.longValue() / 1000));
                return;
            }
            long longValue2 = bVar.f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a7(y6 y6Var, String str, zzgf.zzm zzmVar, BitSet bitSet, BitSet bitSet2, r.b bVar, r.b bVar2) {
        this.f4081h = y6Var;
        this.f4075a = str;
        this.f4078d = bitSet;
        this.f4079e = bitSet2;
        this.f = bVar;
        this.f4080g = new r.b();
        Iterator it = ((g.c) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar2.getOrDefault(num, null));
            this.f4080g.put(num, arrayList);
        }
        this.f4076b = false;
        this.f4077c = zzmVar;
    }
}
