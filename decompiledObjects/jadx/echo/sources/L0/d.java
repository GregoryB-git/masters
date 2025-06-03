package L0;

import F0.C0369n;
import g0.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f3313b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f3314c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f3315d;

    public d() {
        super(new C0369n());
        this.f3313b = -9223372036854775807L;
        this.f3314c = new long[0];
        this.f3315d = new long[0];
    }

    public static Boolean g(z zVar) {
        return Boolean.valueOf(zVar.G() == 1);
    }

    public static Object h(z zVar, int i7) {
        if (i7 == 0) {
            return j(zVar);
        }
        if (i7 == 1) {
            return g(zVar);
        }
        if (i7 == 2) {
            return n(zVar);
        }
        if (i7 == 3) {
            return l(zVar);
        }
        if (i7 == 8) {
            return k(zVar);
        }
        if (i7 == 10) {
            return m(zVar);
        }
        if (i7 != 11) {
            return null;
        }
        return i(zVar);
    }

    public static Date i(z zVar) {
        Date date = new Date((long) j(zVar).doubleValue());
        zVar.U(2);
        return date;
    }

    public static Double j(z zVar) {
        return Double.valueOf(Double.longBitsToDouble(zVar.z()));
    }

    public static HashMap k(z zVar) {
        int K6 = zVar.K();
        HashMap hashMap = new HashMap(K6);
        for (int i7 = 0; i7 < K6; i7++) {
            String n7 = n(zVar);
            Object h7 = h(zVar, o(zVar));
            if (h7 != null) {
                hashMap.put(n7, h7);
            }
        }
        return hashMap;
    }

    public static HashMap l(z zVar) {
        HashMap hashMap = new HashMap();
        while (true) {
            String n7 = n(zVar);
            int o7 = o(zVar);
            if (o7 == 9) {
                return hashMap;
            }
            Object h7 = h(zVar, o7);
            if (h7 != null) {
                hashMap.put(n7, h7);
            }
        }
    }

    public static ArrayList m(z zVar) {
        int K6 = zVar.K();
        ArrayList arrayList = new ArrayList(K6);
        for (int i7 = 0; i7 < K6; i7++) {
            Object h7 = h(zVar, o(zVar));
            if (h7 != null) {
                arrayList.add(h7);
            }
        }
        return arrayList;
    }

    public static String n(z zVar) {
        int M6 = zVar.M();
        int f7 = zVar.f();
        zVar.U(M6);
        return new String(zVar.e(), f7, M6);
    }

    public static int o(z zVar) {
        return zVar.G();
    }

    @Override // L0.e
    public boolean b(z zVar) {
        return true;
    }

    @Override // L0.e
    public boolean c(z zVar, long j7) {
        if (o(zVar) != 2 || !"onMetaData".equals(n(zVar)) || zVar.a() == 0 || o(zVar) != 8) {
            return false;
        }
        HashMap k7 = k(zVar);
        Object obj = k7.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f3313b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k7.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f3314c = new long[size];
                this.f3315d = new long[size];
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj5 = list.get(i7);
                    Object obj6 = list2.get(i7);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f3314c = new long[0];
                        this.f3315d = new long[0];
                        break;
                    }
                    this.f3314c[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f3315d[i7] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f3313b;
    }

    public long[] e() {
        return this.f3315d;
    }

    public long[] f() {
        return this.f3314c;
    }
}
