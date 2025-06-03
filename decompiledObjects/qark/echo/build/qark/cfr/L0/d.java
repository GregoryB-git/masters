/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package L0;

import F0.T;
import F0.n;
import L0.e;
import g0.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
extends e {
    public long b = -9223372036854775807L;
    public long[] c = new long[0];
    public long[] d = new long[0];

    public d() {
        super(new n());
    }

    public static Boolean g(z z8) {
        int n8 = z8.G();
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        return bl;
    }

    public static Object h(z z8, int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 8) {
                            if (n8 != 10) {
                                if (n8 != 11) {
                                    return null;
                                }
                                return d.i(z8);
                            }
                            return d.m(z8);
                        }
                        return d.k(z8);
                    }
                    return d.l(z8);
                }
                return d.n(z8);
            }
            return d.g(z8);
        }
        return d.j(z8);
    }

    public static Date i(z z8) {
        Date date = new Date((long)d.j(z8).doubleValue());
        z8.U(2);
        return date;
    }

    public static Double j(z z8) {
        return Double.longBitsToDouble((long)z8.z());
    }

    public static HashMap k(z z8) {
        int n8 = z8.K();
        HashMap hashMap = new HashMap(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = d.n(z8);
            Object object = d.h(z8, d.o(z8));
            if (object == null) continue;
            hashMap.put((Object)string2, object);
        }
        return hashMap;
    }

    public static HashMap l(z z8) {
        HashMap hashMap = new HashMap();
        do {
            String string2 = d.n(z8);
            int n8 = d.o(z8);
            if (n8 == 9) {
                return hashMap;
            }
            Object object = d.h(z8, n8);
            if (object == null) continue;
            hashMap.put((Object)string2, object);
        } while (true);
    }

    public static ArrayList m(z z8) {
        int n8 = z8.K();
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = d.h(z8, d.o(z8));
            if (object == null) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    public static String n(z z8) {
        int n8 = z8.M();
        int n9 = z8.f();
        z8.U(n8);
        return new String(z8.e(), n9, n8);
    }

    public static int o(z z8) {
        return z8.G();
    }

    @Override
    public boolean b(z z8) {
        return true;
    }

    @Override
    public boolean c(z object, long l8) {
        double d8;
        if (d.o((z)object) != 2) {
            return false;
        }
        if (!"onMetaData".equals((Object)d.n((z)object))) {
            return false;
        }
        if (object.a() == 0) {
            return false;
        }
        if (d.o((z)object) != 8) {
            return false;
        }
        Object object2 = (object = d.k((z)object)).get((Object)"duration");
        if (object2 instanceof Double && (d8 = ((Double)object2).doubleValue()) > 0.0) {
            this.b = (long)(d8 * 1000000.0);
        }
        if ((object = object.get((Object)"keyframes")) instanceof Map) {
            object2 = (Map)object;
            object = object2.get((Object)"filepositions");
            object2 = object2.get((Object)"times");
            if (object instanceof List && object2 instanceof List) {
                object = (List)object;
                object2 = (List)object2;
                int n8 = object2.size();
                this.c = new long[n8];
                this.d = new long[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object object3 = object.get(i8);
                    Object object4 = object2.get(i8);
                    if (object4 instanceof Double && object3 instanceof Double) {
                        this.c[i8] = (long)((Double)object4 * 1000000.0);
                        this.d[i8] = ((Double)object3).longValue();
                        continue;
                    }
                    this.c = new long[0];
                    this.d = new long[0];
                    break;
                }
            }
        }
        return false;
    }

    public long d() {
        return this.b;
    }

    public long[] e() {
        return this.d;
    }

    public long[] f() {
        return this.c;
    }
}

