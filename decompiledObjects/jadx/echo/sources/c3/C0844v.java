package c3;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import n3.C1725a;
import p3.C1794C;
import p3.I;
import q3.AbstractC1895k;

/* renamed from: c3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844v {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f10107a;

    /* renamed from: b, reason: collision with root package name */
    public c f10108b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f10109c;

    /* renamed from: d, reason: collision with root package name */
    public final C1725a f10110d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10111e;

    /* renamed from: c3.v$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class f10112a;

        /* renamed from: b, reason: collision with root package name */
        public ConcurrentMap f10113b;

        /* renamed from: c, reason: collision with root package name */
        public c f10114c;

        /* renamed from: d, reason: collision with root package name */
        public C1725a f10115d;

        public b(Class cls) {
            this.f10113b = new ConcurrentHashMap();
            this.f10112a = cls;
            this.f10115d = C1725a.f17944b;
        }

        public b a(Object obj, Object obj2, C1794C.c cVar) {
            return c(obj, obj2, cVar, false);
        }

        public b b(Object obj, Object obj2, C1794C.c cVar) {
            return c(obj, obj2, cVar, true);
        }

        public final b c(Object obj, Object obj2, C1794C.c cVar, boolean z7) {
            if (this.f10113b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.c0() != p3.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c b7 = C0844v.b(obj, obj2, cVar, this.f10113b);
            if (z7) {
                if (this.f10114c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f10114c = b7;
            }
            return this;
        }

        public C0844v d() {
            ConcurrentMap concurrentMap = this.f10113b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            C0844v c0844v = new C0844v(concurrentMap, this.f10114c, this.f10115d, this.f10112a);
            this.f10113b = null;
            return c0844v;
        }

        public b e(C1725a c1725a) {
            if (this.f10113b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f10115d = c1725a;
            return this;
        }
    }

    /* renamed from: c3.v$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f10116a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f10117b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f10118c;

        /* renamed from: d, reason: collision with root package name */
        public final p3.z f10119d;

        /* renamed from: e, reason: collision with root package name */
        public final I f10120e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10121f;

        /* renamed from: g, reason: collision with root package name */
        public final String f10122g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC0829g f10123h;

        public c(Object obj, Object obj2, byte[] bArr, p3.z zVar, I i7, int i8, String str, AbstractC0829g abstractC0829g) {
            this.f10116a = obj;
            this.f10117b = obj2;
            this.f10118c = Arrays.copyOf(bArr, bArr.length);
            this.f10119d = zVar;
            this.f10120e = i7;
            this.f10121f = i8;
            this.f10122g = str;
            this.f10123h = abstractC0829g;
        }

        public Object a() {
            return this.f10116a;
        }

        public final byte[] b() {
            byte[] bArr = this.f10118c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public AbstractC0829g c() {
            return this.f10123h;
        }

        public int d() {
            return this.f10121f;
        }

        public String e() {
            return this.f10122g;
        }

        public I f() {
            return this.f10120e;
        }

        public Object g() {
            return this.f10117b;
        }

        public p3.z h() {
            return this.f10119d;
        }
    }

    /* renamed from: c3.v$d */
    public static class d implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final byte[] f10124o;

        public d(byte[] bArr) {
            this.f10124o = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f10124o;
            int length = bArr.length;
            byte[] bArr2 = dVar.f10124o;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i7 = 0;
            while (true) {
                byte[] bArr3 = this.f10124o;
                if (i7 >= bArr3.length) {
                    return 0;
                }
                byte b7 = bArr3[i7];
                byte b8 = dVar.f10124o[i7];
                if (b7 != b8) {
                    return b7 - b8;
                }
                i7++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f10124o, ((d) obj).f10124o);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f10124o);
        }

        public String toString() {
            return AbstractC1895k.b(this.f10124o);
        }
    }

    public C0844v(ConcurrentMap concurrentMap, c cVar, C1725a c1725a, Class cls) {
        this.f10107a = concurrentMap;
        this.f10108b = cVar;
        this.f10109c = cls;
        this.f10110d = c1725a;
        this.f10111e = false;
    }

    public static c b(Object obj, Object obj2, C1794C.c cVar, ConcurrentMap concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.a0());
        if (cVar.b0() == I.RAW) {
            valueOf = null;
        }
        c cVar2 = new c(obj, obj2, AbstractC0826d.a(cVar), cVar.c0(), cVar.b0(), cVar.a0(), cVar.Z().a0(), k3.i.a().d(k3.o.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), valueOf), AbstractC0828f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List list = (List) concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static b j(Class cls) {
        return new b(cls);
    }

    public Collection c() {
        return this.f10107a.values();
    }

    public C1725a d() {
        return this.f10110d;
    }

    public c e() {
        return this.f10108b;
    }

    public List f(byte[] bArr) {
        List list = (List) this.f10107a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class g() {
        return this.f10109c;
    }

    public List h() {
        return f(AbstractC0826d.f10077a);
    }

    public boolean i() {
        return !this.f10110d.b().isEmpty();
    }
}
