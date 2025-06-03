package s0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class c0 extends c<String> implements d0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13949b;

    static {
        new c0(10).f13948a = false;
    }

    public c0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public c0(ArrayList<Object> arrayList) {
        this.f13949b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a();
        this.f13949b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof d0) {
            collection = ((d0) collection).d();
        }
        boolean addAll = this.f13949b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f13949b);
        return new c0((ArrayList<Object>) arrayList);
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f13949b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // s0.d0
    public final List<?> d() {
        return Collections.unmodifiableList(this.f13949b);
    }

    @Override // s0.d0
    public final d0 e() {
        return this.f13948a ? new k1(this) : this;
    }

    @Override // s0.d0
    public final Object f(int i10) {
        return this.f13949b.get(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0.l() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r5.f13949b.set(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if ((s0.m1.f14049a.c(r0, 0, r0.length) == 0) != false) goto L18;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(int r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f13949b
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            goto L48
        Ld:
            boolean r1 = r0 instanceof s0.g
            if (r1 == 0) goto L2c
            s0.g r0 = (s0.g) r0
            r0.getClass()
            java.nio.charset.Charset r1 = s0.x.f14119a
            int r2 = r0.size()
            if (r2 != 0) goto L21
            java.lang.String r1 = ""
            goto L25
        L21:
            java.lang.String r1 = r0.n(r1)
        L25:
            boolean r0 = r0.l()
            if (r0 == 0) goto L47
            goto L42
        L2c:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = s0.x.f14119a
            r1.<init>(r0, r2)
            s0.m1$b r2 = s0.m1.f14049a
            int r3 = r0.length
            r4 = 0
            int r0 = r2.c(r0, r4, r3)
            if (r0 != 0) goto L40
            r4 = 1
        L40:
            if (r4 == 0) goto L47
        L42:
            java.util.ArrayList r0 = r5.f13949b
            r0.set(r6, r1)
        L47:
            r0 = r1
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.c0.get(int):java.lang.Object");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        Object remove = this.f13949b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof g)) {
            return new String((byte[]) remove, x.f14119a);
        }
        g gVar = (g) remove;
        gVar.getClass();
        return gVar.size() == 0 ? "" : gVar.n(x.f14119a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f13949b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g)) {
            return new String((byte[]) obj2, x.f14119a);
        }
        g gVar = (g) obj2;
        gVar.getClass();
        return gVar.size() == 0 ? "" : gVar.n(x.f14119a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13949b.size();
    }

    @Override // s0.d0
    public final void w(g gVar) {
        a();
        this.f13949b.add(gVar);
        ((AbstractList) this).modCount++;
    }
}
