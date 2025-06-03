package c5;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o7.b0;
import o7.t;
import p2.m0;
import v5.e0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2343a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2344b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2345c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f2346d;

    public a() {
        Random random = new Random();
        this.f2345c = new HashMap();
        this.f2346d = random;
        this.f2343a = new HashMap();
        this.f2344b = new HashMap();
    }

    public static void a(Object obj, long j10, HashMap hashMap) {
        if (hashMap.containsKey(obj)) {
            Long l10 = (Long) hashMap.get(obj);
            int i10 = e0.f15881a;
            j10 = Math.max(j10, l10.longValue());
        }
        hashMap.put(obj, Long.valueOf(j10));
    }

    public static void c(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList b(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c(elapsedRealtime, this.f2343a);
        c(elapsedRealtime, this.f2344b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < tVar.size(); i10++) {
            d5.b bVar = (d5.b) tVar.get(i10);
            if (!this.f2343a.containsKey(bVar.f3448b) && !this.f2344b.containsKey(Integer.valueOf(bVar.f3449c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final d5.b d(t tVar) {
        Object obj;
        ArrayList b10 = b(tVar);
        if (b10.size() >= 2) {
            Collections.sort(b10, new v4.d(1));
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int i11 = ((d5.b) b10.get(0)).f3449c;
            int i12 = 0;
            while (true) {
                if (i12 >= b10.size()) {
                    break;
                }
                d5.b bVar = (d5.b) b10.get(i12);
                if (i11 == bVar.f3449c) {
                    arrayList.add(new Pair(bVar.f3448b, Integer.valueOf(bVar.f3450d)));
                    i12++;
                } else if (arrayList.size() == 1) {
                    obj = b10.get(0);
                }
            }
            d5.b bVar2 = (d5.b) this.f2345c.get(arrayList);
            if (bVar2 == null) {
                List subList = b10.subList(0, arrayList.size());
                int i13 = 0;
                for (int i14 = 0; i14 < subList.size(); i14++) {
                    i13 += ((d5.b) subList.get(i14)).f3450d;
                }
                int nextInt = this.f2346d.nextInt(i13);
                int i15 = 0;
                while (true) {
                    if (i10 >= subList.size()) {
                        bVar2 = (d5.b) m0.K(subList);
                        break;
                    }
                    d5.b bVar3 = (d5.b) subList.get(i10);
                    i15 += bVar3.f3450d;
                    if (nextInt < i15) {
                        bVar2 = bVar3;
                        break;
                    }
                    i10++;
                }
                this.f2345c.put(arrayList, bVar2);
            }
            return bVar2;
        }
        obj = b0.a(b10.iterator(), null);
        return (d5.b) obj;
    }
}
