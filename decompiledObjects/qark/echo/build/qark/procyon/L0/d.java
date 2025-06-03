// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L0;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import g0.z;
import F0.T;
import F0.n;

public final class d extends e
{
    public long b;
    public long[] c;
    public long[] d;
    
    public d() {
        super(new n());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }
    
    public static Boolean g(final z z) {
        final int g = z.G();
        boolean b = true;
        if (g != 1) {
            b = false;
        }
        return b;
    }
    
    public static Object h(final z z, final int n) {
        if (n == 0) {
            return j(z);
        }
        if (n == 1) {
            return g(z);
        }
        if (n == 2) {
            return n(z);
        }
        if (n == 3) {
            return l(z);
        }
        if (n == 8) {
            return k(z);
        }
        if (n == 10) {
            return m(z);
        }
        if (n != 11) {
            return null;
        }
        return i(z);
    }
    
    public static Date i(final z z) {
        final Date date = new Date((long)(double)j(z));
        z.U(2);
        return date;
    }
    
    public static Double j(final z z) {
        return Double.longBitsToDouble(z.z());
    }
    
    public static HashMap k(final z z) {
        final int k = z.K();
        final HashMap hashMap = new HashMap<String, Object>(k);
        for (int i = 0; i < k; ++i) {
            final String n = n(z);
            final Object h = h(z, o(z));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }
    
    public static HashMap l(final z z) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        while (true) {
            final String n = n(z);
            final int o = o(z);
            if (o == 9) {
                break;
            }
            final Object h = h(z, o);
            if (h == null) {
                continue;
            }
            hashMap.put(n, h);
        }
        return hashMap;
    }
    
    public static ArrayList m(final z z) {
        final int k = z.K();
        final ArrayList list = new ArrayList<Object>(k);
        for (int i = 0; i < k; ++i) {
            final Object h = h(z, o(z));
            if (h != null) {
                list.add(h);
            }
        }
        return list;
    }
    
    public static String n(final z z) {
        final int m = z.M();
        final int f = z.f();
        z.U(m);
        return new String(z.e(), f, m);
    }
    
    public static int o(final z z) {
        return z.G();
    }
    
    @Override
    public boolean b(final z z) {
        return true;
    }
    
    @Override
    public boolean c(final z z, final long n) {
        if (o(z) != 2) {
            return false;
        }
        if (!"onMetaData".equals(n(z))) {
            return false;
        }
        if (z.a() == 0) {
            return false;
        }
        if (o(z) != 8) {
            return false;
        }
        final HashMap k = k(z);
        final Object value = k.get("duration");
        if (value instanceof Double) {
            final double doubleValue = (double)value;
            if (doubleValue > 0.0) {
                this.b = (long)(doubleValue * 1000000.0);
            }
        }
        final Object value2 = k.get("keyframes");
        if (value2 instanceof Map) {
            final Map<K, Object> map = (Map<K, Object>)value2;
            final Object value3 = map.get("filepositions");
            final Object value4 = map.get("times");
            if (value3 instanceof List && value4 instanceof List) {
                final List<Object> list = (List<Object>)value3;
                final List<Object> list2 = (List<Object>)value4;
                final int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; ++i) {
                    final Double value5 = list.get(i);
                    final Double value6 = list2.get(i);
                    if (!(value6 instanceof Double) || !(value5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long)(value6 * 1000000.0);
                    this.d[i] = value5.longValue();
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
