package X2;

import X2.AbstractC0704w;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T extends AbstractC0704w {
    private static final long serialVersionUID = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final AbstractC0704w f7071v = new T(null, new Object[0], 0);

    /* renamed from: s, reason: collision with root package name */
    public final transient Object f7072s;

    /* renamed from: t, reason: collision with root package name */
    public final transient Object[] f7073t;

    /* renamed from: u, reason: collision with root package name */
    public final transient int f7074u;

    public static class a extends AbstractC0706y {

        /* renamed from: q, reason: collision with root package name */
        public final transient AbstractC0704w f7075q;

        /* renamed from: r, reason: collision with root package name */
        public final transient Object[] f7076r;

        /* renamed from: s, reason: collision with root package name */
        public final transient int f7077s;

        /* renamed from: t, reason: collision with root package name */
        public final transient int f7078t;

        /* renamed from: X2.T$a$a, reason: collision with other inner class name */
        public class C0122a extends AbstractC0703v {
            public C0122a() {
            }

            @Override // java.util.List
            /* renamed from: j0, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i7) {
                W2.m.h(i7, a.this.f7078t);
                int i8 = i7 * 2;
                Object obj = a.this.f7076r[a.this.f7077s + i8];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f7076r[i8 + (a.this.f7077s ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // X2.AbstractC0701t
            public boolean k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f7078t;
            }

            @Override // X2.AbstractC0703v, X2.AbstractC0701t
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a(AbstractC0704w abstractC0704w, Object[] objArr, int i7, int i8) {
            this.f7075q = abstractC0704w;
            this.f7076r = objArr;
            this.f7077s = i7;
            this.f7078t = i8;
        }

        @Override // X2.AbstractC0706y
        public AbstractC0703v V() {
            return new C0122a();
        }

        @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f7075q.get(key));
        }

        @Override // X2.AbstractC0701t
        public int d(Object[] objArr, int i7) {
            return a().d(objArr, i7);
        }

        @Override // X2.AbstractC0701t
        public boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: q */
        public g0 iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7078t;
        }

        @Override // X2.AbstractC0706y, X2.AbstractC0701t
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class b extends AbstractC0706y {

        /* renamed from: q, reason: collision with root package name */
        public final transient AbstractC0704w f7080q;

        /* renamed from: r, reason: collision with root package name */
        public final transient AbstractC0703v f7081r;

        public b(AbstractC0704w abstractC0704w, AbstractC0703v abstractC0703v) {
            this.f7080q = abstractC0704w;
            this.f7081r = abstractC0703v;
        }

        @Override // X2.AbstractC0706y, X2.AbstractC0701t
        public AbstractC0703v a() {
            return this.f7081r;
        }

        @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7080q.get(obj) != null;
        }

        @Override // X2.AbstractC0701t
        public int d(Object[] objArr, int i7) {
            return a().d(objArr, i7);
        }

        @Override // X2.AbstractC0701t
        public boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: q */
        public g0 iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7080q.size();
        }

        @Override // X2.AbstractC0706y, X2.AbstractC0701t
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class c extends AbstractC0703v {

        /* renamed from: q, reason: collision with root package name */
        public final transient Object[] f7082q;

        /* renamed from: r, reason: collision with root package name */
        public final transient int f7083r;

        /* renamed from: s, reason: collision with root package name */
        public final transient int f7084s;

        public c(Object[] objArr, int i7, int i8) {
            this.f7082q = objArr;
            this.f7083r = i7;
            this.f7084s = i8;
        }

        @Override // java.util.List
        public Object get(int i7) {
            W2.m.h(i7, this.f7084s);
            Object obj = this.f7082q[(i7 * 2) + this.f7083r];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // X2.AbstractC0701t
        public boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7084s;
        }

        @Override // X2.AbstractC0703v, X2.AbstractC0701t
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public T(Object obj, Object[] objArr, int i7) {
        this.f7072s = obj;
        this.f7073t = objArr;
        this.f7074u = i7;
    }

    public static T l(int i7, Object[] objArr, AbstractC0704w.a aVar) {
        if (i7 == 0) {
            return (T) f7071v;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC0691i.a(obj, obj2);
            return new T(null, objArr, 1);
        }
        W2.m.l(i7, objArr.length >> 1);
        Object m7 = m(objArr, i7, AbstractC0706y.M(i7), 0);
        if (m7 instanceof Object[]) {
            Object[] objArr2 = (Object[]) m7;
            AbstractC0704w.a.C0127a c0127a = (AbstractC0704w.a.C0127a) objArr2[2];
            if (aVar == null) {
                throw c0127a.a();
            }
            aVar.f7204e = c0127a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            m7 = obj3;
            i7 = intValue;
        }
        return new T(m7, objArr, i7);
    }

    public static Object m(Object[] objArr, int i7, int i8, int i9) {
        AbstractC0704w.a.C0127a c0127a = null;
        if (i7 == 1) {
            Object obj = objArr[i9];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC0691i.a(obj, obj2);
            return null;
        }
        int i10 = i8 - 1;
        int i11 = -1;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            int i12 = 0;
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = (i13 * 2) + i9;
                int i15 = (i12 * 2) + i9;
                Object obj3 = objArr[i14];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i14 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC0691i.a(obj3, obj4);
                int b7 = AbstractC0700s.b(obj3.hashCode());
                while (true) {
                    int i16 = b7 & i10;
                    int i17 = bArr[i16] & 255;
                    if (i17 == 255) {
                        bArr[i16] = (byte) i15;
                        if (i12 < i13) {
                            objArr[i15] = obj3;
                            objArr[i15 ^ 1] = obj4;
                        }
                        i12++;
                    } else {
                        if (obj3.equals(objArr[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj5 = objArr[i18];
                            Objects.requireNonNull(obj5);
                            c0127a = new AbstractC0704w.a.C0127a(obj3, obj4, obj5);
                            objArr[i18] = obj4;
                            break;
                        }
                        b7 = i16 + 1;
                    }
                }
            }
            return i12 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i12), c0127a};
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            int i19 = 0;
            for (int i20 = 0; i20 < i7; i20++) {
                int i21 = (i20 * 2) + i9;
                int i22 = (i19 * 2) + i9;
                Object obj6 = objArr[i21];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i21 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC0691i.a(obj6, obj7);
                int b8 = AbstractC0700s.b(obj6.hashCode());
                while (true) {
                    int i23 = b8 & i10;
                    int i24 = sArr[i23] & 65535;
                    if (i24 == 65535) {
                        sArr[i23] = (short) i22;
                        if (i19 < i20) {
                            objArr[i22] = obj6;
                            objArr[i22 ^ 1] = obj7;
                        }
                        i19++;
                    } else {
                        if (obj6.equals(objArr[i24])) {
                            int i25 = i24 ^ 1;
                            Object obj8 = objArr[i25];
                            Objects.requireNonNull(obj8);
                            c0127a = new AbstractC0704w.a.C0127a(obj6, obj7, obj8);
                            objArr[i25] = obj7;
                            break;
                        }
                        b8 = i23 + 1;
                    }
                }
            }
            return i19 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i19), c0127a};
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        int i26 = 0;
        int i27 = 0;
        while (i26 < i7) {
            int i28 = (i26 * 2) + i9;
            int i29 = (i27 * 2) + i9;
            Object obj9 = objArr[i28];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i28 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC0691i.a(obj9, obj10);
            int b9 = AbstractC0700s.b(obj9.hashCode());
            while (true) {
                int i30 = b9 & i10;
                int i31 = iArr[i30];
                if (i31 == i11) {
                    iArr[i30] = i29;
                    if (i27 < i26) {
                        objArr[i29] = obj9;
                        objArr[i29 ^ 1] = obj10;
                    }
                    i27++;
                } else {
                    if (obj9.equals(objArr[i31])) {
                        int i32 = i31 ^ 1;
                        Object obj11 = objArr[i32];
                        Objects.requireNonNull(obj11);
                        c0127a = new AbstractC0704w.a.C0127a(obj9, obj10, obj11);
                        objArr[i32] = obj10;
                        break;
                    }
                    b9 = i30 + 1;
                    i11 = -1;
                }
            }
            i26++;
            i11 = -1;
        }
        return i27 == i7 ? iArr : new Object[]{iArr, Integer.valueOf(i27), c0127a};
    }

    public static Object n(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b7 = AbstractC0700s.b(obj2.hashCode());
            while (true) {
                int i9 = b7 & length;
                int i10 = bArr[i9] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                b7 = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b8 = AbstractC0700s.b(obj2.hashCode());
            while (true) {
                int i11 = b8 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                b8 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b9 = AbstractC0700s.b(obj2.hashCode());
            while (true) {
                int i13 = b9 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                b9 = i13 + 1;
            }
        }
    }

    @Override // X2.AbstractC0704w
    public AbstractC0706y d() {
        return new a(this, this.f7073t, 0, this.f7074u);
    }

    @Override // X2.AbstractC0704w
    public AbstractC0706y e() {
        return new b(this, new c(this.f7073t, 0, this.f7074u));
    }

    @Override // X2.AbstractC0704w
    public AbstractC0701t f() {
        return new c(this.f7073t, 1, this.f7074u);
    }

    @Override // X2.AbstractC0704w, java.util.Map
    public Object get(Object obj) {
        Object n7 = n(this.f7072s, this.f7073t, this.f7074u, 0, obj);
        if (n7 == null) {
            return null;
        }
        return n7;
    }

    @Override // X2.AbstractC0704w
    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f7074u;
    }

    @Override // X2.AbstractC0704w
    public Object writeReplace() {
        return super.writeReplace();
    }
}
