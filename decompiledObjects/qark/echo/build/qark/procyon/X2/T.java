// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Iterator;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Arrays;
import W2.m;
import java.util.Objects;

public final class T extends w
{
    private static final long serialVersionUID = 0L;
    public static final w v;
    public final transient Object s;
    public final transient Object[] t;
    public final transient int u;
    
    static {
        v = new T(null, new Object[0], 0);
    }
    
    public T(final Object s, final Object[] t, final int u) {
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    public static T l(int intValue, final Object[] original, final w.a a) {
        if (intValue == 0) {
            return (T)T.v;
        }
        if (intValue == 1) {
            final Object obj = original[0];
            Objects.requireNonNull(obj);
            final Object obj2 = original[1];
            Objects.requireNonNull(obj2);
            i.a(obj, obj2);
            return new T(null, original, 1);
        }
        m.l(intValue, original.length >> 1);
        Object m;
        final Object o = m = m(original, intValue, y.M(intValue), 0);
        Object[] copy = original;
        if (o instanceof Object[]) {
            final Object[] array = (Object[])o;
            final w.a.a e = (w.a.a)array[2];
            if (a == null) {
                throw e.a();
            }
            a.e = e;
            m = array[0];
            intValue = (int)array[1];
            copy = Arrays.copyOf(original, intValue * 2);
        }
        return new T(m, copy, intValue);
    }
    
    public static Object m(final Object[] array, final int n, int i, final int n2) {
        final Object o = null;
        final Object o2 = null;
        Object o3 = null;
        if (n == 1) {
            final Object obj = array[n2];
            Objects.requireNonNull(obj);
            final Object obj2 = array[n2 ^ 0x1];
            Objects.requireNonNull(obj2);
            i.a(obj, obj2);
            return null;
        }
        final int n3 = i - 1;
        if (i <= 128) {
            final byte[] a = new byte[i];
            Arrays.fill(a, (byte)(-1));
            int j;
            int n4;
            int n5;
            Object obj3;
            Object obj4;
            int b;
            int n6;
            int n7;
            int n8;
            Object obj5;
            for (i = (j = 0); i < n; ++i) {
                n4 = i * 2 + n2;
                n5 = j * 2 + n2;
                obj3 = array[n4];
                Objects.requireNonNull(obj3);
                obj4 = array[n4 ^ 0x1];
                Objects.requireNonNull(obj4);
                i.a(obj3, obj4);
                b = s.b(obj3.hashCode());
                while (true) {
                    n6 = (b & n3);
                    n7 = (a[n6] & 0xFF);
                    if (n7 == 255) {
                        a[n6] = (byte)n5;
                        if (j < i) {
                            array[n5] = obj3;
                            array[n5 ^ 0x1] = obj4;
                        }
                        ++j;
                        break;
                    }
                    if (obj3.equals(array[n7])) {
                        n8 = (n7 ^ 0x1);
                        obj5 = array[n8];
                        Objects.requireNonNull(obj5);
                        o3 = new w.a.a(obj3, obj4, obj5);
                        array[n8] = obj4;
                        break;
                    }
                    b = n6 + 1;
                }
            }
            if (j == n) {
                return a;
            }
            return new Object[] { a, j, o3 };
        }
        else if (i <= 32768) {
            final short[] a2 = new short[i];
            Arrays.fill(a2, (short)(-1));
            int k;
            i = (k = 0);
            Object o4 = o;
            while (i < n) {
                final int n9 = i * 2 + n2;
                final int n10 = k * 2 + n2;
                final Object obj6 = array[n9];
                Objects.requireNonNull(obj6);
                final Object obj7 = array[n9 ^ 0x1];
                Objects.requireNonNull(obj7);
                i.a(obj6, obj7);
                int b2 = s.b(obj6.hashCode());
                while (true) {
                    final int n11 = b2 & n3;
                    final int n12 = a2[n11] & 0xFFFF;
                    if (n12 == 65535) {
                        a2[n11] = (short)n10;
                        if (k < i) {
                            array[n10] = obj6;
                            array[n10 ^ 0x1] = obj7;
                        }
                        ++k;
                        break;
                    }
                    if (obj6.equals(array[n12])) {
                        final int n13 = n12 ^ 0x1;
                        final Object obj8 = array[n13];
                        Objects.requireNonNull(obj8);
                        o4 = new w.a.a(obj6, obj7, obj8);
                        array[n13] = obj7;
                        break;
                    }
                    b2 = n11 + 1;
                }
                ++i;
            }
            if (k == n) {
                return a2;
            }
            return new Object[] { a2, k, o4 };
        }
        else {
            final int[] a3 = new int[i];
            Arrays.fill(a3, -1);
            int l;
            i = (l = 0);
            Object o5 = o2;
            while (i < n) {
                final int n14 = i * 2 + n2;
                final int n15 = l * 2 + n2;
                final Object obj9 = array[n14];
                Objects.requireNonNull(obj9);
                final Object obj10 = array[n14 ^ 0x1];
                Objects.requireNonNull(obj10);
                i.a(obj9, obj10);
                int b3 = s.b(obj9.hashCode());
                while (true) {
                    final int n16 = b3 & n3;
                    final int n17 = a3[n16];
                    if (n17 == -1) {
                        a3[n16] = n15;
                        if (l < i) {
                            array[n15] = obj9;
                            array[n15 ^ 0x1] = obj10;
                        }
                        ++l;
                        break;
                    }
                    if (obj9.equals(array[n17])) {
                        final int n18 = n17 ^ 0x1;
                        final Object obj11 = array[n18];
                        Objects.requireNonNull(obj11);
                        o5 = new w.a.a(obj9, obj10, obj11);
                        array[n18] = obj10;
                        break;
                    }
                    b3 = n16 + 1;
                }
                ++i;
            }
            if (l == n) {
                return a3;
            }
            return new Object[] { a3, l, o5 };
        }
    }
    
    public static Object n(Object obj, final Object[] array, int n, int n2, final Object obj2) {
        final Object o = null;
        if (obj2 == null) {
            return null;
        }
        if (n == 1) {
            final Object obj3 = array[n2];
            Objects.requireNonNull(obj3);
            obj = o;
            if (obj3.equals(obj2)) {
                obj = array[n2 ^ 0x1];
                Objects.requireNonNull(obj);
            }
            return obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            final byte[] array2 = (byte[])obj;
            n2 = array2.length;
            n = s.b(obj2.hashCode());
            while (true) {
                n &= n2 - 1;
                final int n3 = array2[n] & 0xFF;
                if (n3 == 255) {
                    return null;
                }
                if (obj2.equals(array[n3])) {
                    return array[n3 ^ 0x1];
                }
                ++n;
            }
        }
        else if (obj instanceof short[]) {
            final short[] array3 = (short[])obj;
            n2 = array3.length;
            n = s.b(obj2.hashCode());
            while (true) {
                n &= n2 - 1;
                final int n4 = array3[n] & 0xFFFF;
                if (n4 == 65535) {
                    return null;
                }
                if (obj2.equals(array[n4])) {
                    return array[n4 ^ 0x1];
                }
                ++n;
            }
        }
        else {
            final int[] array4 = (int[])obj;
            n2 = array4.length;
            n = s.b(obj2.hashCode());
            while (true) {
                n &= n2 - 1;
                final int n5 = array4[n];
                if (n5 == -1) {
                    return null;
                }
                if (obj2.equals(array[n5])) {
                    return array[n5 ^ 0x1];
                }
                ++n;
            }
        }
    }
    
    @Override
    public y d() {
        return new a(this, this.t, 0, this.u);
    }
    
    @Override
    public y e() {
        return new b(this, new c(this.t, 0, this.u));
    }
    
    @Override
    public t f() {
        return new c(this.t, 1, this.u);
    }
    
    @Override
    public Object get(Object n) {
        if ((n = n(this.s, this.t, this.u, 0, n)) == null) {
            n = null;
        }
        return n;
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    @Override
    public int size() {
        return this.u;
    }
    
    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
    
    public static class a extends y
    {
        public final transient w q;
        public final transient Object[] r;
        public final transient int s;
        public final transient int t;
        
        public a(final w q, final Object[] r, final int s, final int t) {
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
        }
        
        public static /* synthetic */ int e0(final a a) {
            return a.t;
        }
        
        public static /* synthetic */ Object[] f0(final a a) {
            return a.r;
        }
        
        public static /* synthetic */ int g0(final a a) {
            return a.s;
        }
        
        @Override
        public v V() {
            return new v() {
                public Entry j0(int n) {
                    m.h(n, T.a.e0(T.a.this));
                    final Object[] f0 = T.a.f0(T.a.this);
                    n *= 2;
                    final Object o = f0[T.a.g0(T.a.this) + n];
                    Objects.requireNonNull(o);
                    final Object o2 = T.a.f0(T.a.this)[n + (T.a.g0(T.a.this) ^ 0x1)];
                    Objects.requireNonNull(o2);
                    return (Entry)new AbstractMap.SimpleImmutableEntry(o, o2);
                }
                
                @Override
                public boolean k() {
                    return true;
                }
                
                @Override
                public int size() {
                    return T.a.e0(T.a.this);
                }
                
                @Override
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        
        @Override
        public boolean contains(Object key) {
            final boolean b = key instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)key;
                key = entry.getKey();
                final Object value = entry.getValue();
                b3 = b2;
                if (value != null) {
                    b3 = b2;
                    if (value.equals(this.q.get(key))) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int d(final Object[] array, final int n) {
            return this.a().d(array, n);
        }
        
        @Override
        public boolean k() {
            return true;
        }
        
        @Override
        public g0 q() {
            return this.a().q();
        }
        
        @Override
        public int size() {
            return this.t;
        }
        
        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }
    
    public static final class b extends y
    {
        public final transient w q;
        public final transient v r;
        
        public b(final w q, final v r) {
            this.q = q;
            this.r = r;
        }
        
        @Override
        public v a() {
            return this.r;
        }
        
        @Override
        public boolean contains(final Object o) {
            return this.q.get(o) != null;
        }
        
        @Override
        public int d(final Object[] array, final int n) {
            return this.a().d(array, n);
        }
        
        @Override
        public boolean k() {
            return true;
        }
        
        @Override
        public g0 q() {
            return this.a().q();
        }
        
        @Override
        public int size() {
            return this.q.size();
        }
        
        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }
    
    public static final class c extends v
    {
        public final transient Object[] q;
        public final transient int r;
        public final transient int s;
        
        public c(final Object[] q, final int r, final int s) {
            this.q = q;
            this.r = r;
            this.s = s;
        }
        
        @Override
        public Object get(final int n) {
            m.h(n, this.s);
            final Object obj = this.q[n * 2 + this.r];
            Objects.requireNonNull(obj);
            return obj;
        }
        
        @Override
        public boolean k() {
            return true;
        }
        
        @Override
        public int size() {
            return this.s;
        }
        
        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }
}
