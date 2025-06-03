package ma;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class g0 extends c<String> implements h0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List<Object> f10960b;

    static {
        new g0();
    }

    public g0() {
        super(false);
        this.f10960b = Collections.emptyList();
    }

    public g0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public g0(ArrayList<Object> arrayList) {
        super(true);
        this.f10960b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a();
        this.f10960b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof h0) {
            collection = ((h0) collection).d();
        }
        boolean addAll = this.f10960b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // ma.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // ma.a0.d
    public final a0.d c(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f10960b);
        return new g0((ArrayList<Object>) arrayList);
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f10960b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // ma.h0
    public final List<?> d() {
        return Collections.unmodifiableList(this.f10960b);
    }

    @Override // ma.h0
    public final h0 e() {
        return this.f10919a ? new s1(this) : this;
    }

    @Override // ma.h0
    public final Object f(int i10) {
        return this.f10960b.get(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0.r() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r5.f10960b.set(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if ((ma.u1.f11095a.e(0, r0, 0, r0.length) == 0) != false) goto L18;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(int r6) {
        /*
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f10960b
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            goto L48
        Ld:
            boolean r1 = r0 instanceof ma.h
            if (r1 == 0) goto L2c
            ma.h r0 = (ma.h) r0
            r0.getClass()
            java.nio.charset.Charset r1 = ma.a0.f10909a
            int r2 = r0.size()
            if (r2 != 0) goto L21
            java.lang.String r1 = ""
            goto L25
        L21:
            java.lang.String r1 = r0.A(r1)
        L25:
            boolean r0 = r0.r()
            if (r0 == 0) goto L47
            goto L42
        L2c:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = ma.a0.f10909a
            r1.<init>(r0, r2)
            ma.u1$b r2 = ma.u1.f11095a
            int r3 = r0.length
            r4 = 0
            int r0 = r2.e(r4, r0, r4, r3)
            if (r0 != 0) goto L40
            r4 = 1
        L40:
            if (r4 == 0) goto L47
        L42:
            java.util.List<java.lang.Object> r0 = r5.f10960b
            r0.set(r6, r1)
        L47:
            r0 = r1
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.g0.get(int):java.lang.Object");
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        Object remove = this.f10960b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof h)) {
            return new String((byte[]) remove, a0.f10909a);
        }
        h hVar = (h) remove;
        hVar.getClass();
        return hVar.size() == 0 ? "" : hVar.A(a0.f10909a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f10960b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof h)) {
            return new String((byte[]) obj2, a0.f10909a);
        }
        h hVar = (h) obj2;
        hVar.getClass();
        return hVar.size() == 0 ? "" : hVar.A(a0.f10909a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10960b.size();
    }

    @Override // ma.h0
    public final void v(h hVar) {
        a();
        this.f10960b.add(hVar);
        ((AbstractList) this).modCount++;
    }
}
