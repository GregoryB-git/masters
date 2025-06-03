package o7;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m0<K, V> extends u<K, V> {

    /* renamed from: o, reason: collision with root package name */
    public static final m0 f12013o = new m0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f12014d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f12015e;
    public final transient int f;

    public static class a<K, V> extends x<Map.Entry<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        public final transient u<K, V> f12016d;

        /* renamed from: e, reason: collision with root package name */
        public final transient Object[] f12017e;
        public final transient int f = 0;

        /* renamed from: o, reason: collision with root package name */
        public final transient int f12018o;

        /* renamed from: o7.m0$a$a, reason: collision with other inner class name */
        public class C0188a extends t<Map.Entry<K, V>> {
            public C0188a() {
            }

            @Override // java.util.List
            public final Object get(int i10) {
                x6.b.v(i10, a.this.f12018o);
                a aVar = a.this;
                int i11 = i10 * 2;
                Object obj = aVar.f12017e[aVar.f + i11];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.f12017e[i11 + (aVar2.f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // o7.r
            public final boolean m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f12018o;
            }
        }

        public a(u uVar, Object[] objArr, int i10) {
            this.f12016d = uVar;
            this.f12017e = objArr;
            this.f12018o = i10;
        }

        @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f12016d.get(key));
        }

        @Override // o7.r
        public final int h(int i10, Object[] objArr) {
            return a().h(i10, objArr);
        }

        @Override // o7.r
        public final boolean m() {
            return true;
        }

        @Override // o7.x, o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: n */
        public final x0<Map.Entry<K, V>> iterator() {
            return a().listIterator(0);
        }

        @Override // o7.x
        public final t<Map.Entry<K, V>> r() {
            return new C0188a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f12018o;
        }
    }

    public static final class b<K> extends x<K> {

        /* renamed from: d, reason: collision with root package name */
        public final transient u<K, ?> f12020d;

        /* renamed from: e, reason: collision with root package name */
        public final transient t<K> f12021e;

        public b(u uVar, c cVar) {
            this.f12020d = uVar;
            this.f12021e = cVar;
        }

        @Override // o7.x, o7.r
        public final t<K> a() {
            return this.f12021e;
        }

        @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f12020d.get(obj) != null;
        }

        @Override // o7.r
        public final int h(int i10, Object[] objArr) {
            return this.f12021e.h(i10, objArr);
        }

        @Override // o7.r
        public final boolean m() {
            return true;
        }

        @Override // o7.x, o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: n */
        public final x0<K> iterator() {
            return this.f12021e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f12020d.size();
        }
    }

    public static final class c extends t<Object> {

        /* renamed from: c, reason: collision with root package name */
        public final transient Object[] f12022c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f12023d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f12024e;

        public c(Object[] objArr, int i10, int i11) {
            this.f12022c = objArr;
            this.f12023d = i10;
            this.f12024e = i11;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            x6.b.v(i10, this.f12024e);
            Object obj = this.f12022c[(i10 * 2) + this.f12023d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // o7.r
        public final boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f12024e;
        }
    }

    public m0(Object obj, Object[] objArr, int i10) {
        this.f12014d = obj;
        this.f12015e = objArr;
        this.f = i10;
    }

    @Override // o7.u
    public final a c() {
        return new a(this, this.f12015e, this.f);
    }

    @Override // o7.u
    public final b d() {
        return new b(this, new c(this.f12015e, 0, this.f));
    }

    @Override // o7.u
    public final c e() {
        return new c(this.f12015e, 1, this.f);
    }

    @Override // o7.u
    public final void f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e A[RETURN] */
    @Override // o7.u, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12014d
            java.lang.Object[] r1 = r9.f12015e
            int r2 = r9.f
            r3 = 0
            if (r10 != 0) goto La
            goto L20
        La:
            r4 = 1
            if (r2 != r4) goto L23
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L20
            r10 = r1[r4]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            r10 = r3
            goto L9c
        L23:
            if (r0 != 0) goto L26
            goto L20
        L26:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L52
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = x6.b.r0(r0)
        L39:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L42
            goto L20
        L42:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4f
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4f:
            int r0 = r0 + 1
            goto L39
        L52:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7e
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = x6.b.r0(r0)
        L64:
            r0 = r0 & r6
            short r5 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r5 != r7) goto L6e
            goto L20
        L6e:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7b
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7b:
            int r0 = r0 + 1
            goto L64
        L7e:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r6 = r10.hashCode()
            int r6 = x6.b.r0(r6)
        L8a:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L20
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.m0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
