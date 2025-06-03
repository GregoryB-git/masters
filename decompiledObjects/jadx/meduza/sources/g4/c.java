package g4;

import c4.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v5.u;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    public long f5835b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f5836c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f5837d;

    public c() {
        super(new g());
        this.f5835b = -9223372036854775807L;
        this.f5836c = new long[0];
        this.f5837d = new long[0];
    }

    public static Serializable c(int i10, u uVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(uVar.o()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(uVar.v() == 1);
        }
        if (i10 == 2) {
            return e(uVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return d(uVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(uVar.o())).doubleValue());
                uVar.H(2);
                return date;
            }
            int y10 = uVar.y();
            ArrayList arrayList = new ArrayList(y10);
            for (int i11 = 0; i11 < y10; i11++) {
                Serializable c10 = c(uVar.v(), uVar);
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String e10 = e(uVar);
            int v10 = uVar.v();
            if (v10 == 9) {
                return hashMap;
            }
            Serializable c11 = c(v10, uVar);
            if (c11 != null) {
                hashMap.put(e10, c11);
            }
        }
    }

    public static HashMap<String, Object> d(u uVar) {
        int y10 = uVar.y();
        HashMap<String, Object> hashMap = new HashMap<>(y10);
        for (int i10 = 0; i10 < y10; i10++) {
            String e10 = e(uVar);
            Serializable c10 = c(uVar.v(), uVar);
            if (c10 != null) {
                hashMap.put(e10, c10);
            }
        }
        return hashMap;
    }

    public static String e(u uVar) {
        int A = uVar.A();
        int i10 = uVar.f15975b;
        uVar.H(A);
        return new String(uVar.f15974a, i10, A);
    }

    @Override // g4.d
    public final boolean a(u uVar) {
        return true;
    }

    @Override // g4.d
    public final boolean b(long j10, u uVar) {
        if (uVar.v() != 2 || !"onMetaData".equals(e(uVar)) || uVar.f15976c - uVar.f15975b == 0 || uVar.v() != 8) {
            return false;
        }
        HashMap<String, Object> d10 = d(uVar);
        Object obj = d10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f5835b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = d10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f5836c = new long[size];
                this.f5837d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f5836c = new long[0];
                        this.f5837d = new long[0];
                        break;
                    }
                    this.f5836c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f5837d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
