package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class C extends AbstractC1088c implements D, RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    public static final C f11272q;

    /* renamed from: r, reason: collision with root package name */
    public static final D f11273r;

    /* renamed from: p, reason: collision with root package name */
    public final List f11274p;

    static {
        C c7 = new C();
        f11272q = c7;
        c7.j();
        f11273r = c7;
    }

    public C() {
        this(10);
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1093h ? ((AbstractC1093h) obj).c0() : AbstractC1110z.i((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public void C(AbstractC1093h abstractC1093h) {
        a();
        this.f11274p.add(abstractC1093h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).o();
        }
        boolean addAll = this.f11274p.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f11274p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i7, String str) {
        a();
        this.f11274p.add(i7, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        Object obj = this.f11274p.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1093h) {
            AbstractC1093h abstractC1093h = (AbstractC1093h) obj;
            String c02 = abstractC1093h.c0();
            if (abstractC1093h.M()) {
                this.f11274p.set(i7, c02);
            }
            return c02;
        }
        byte[] bArr = (byte[]) obj;
        String i8 = AbstractC1110z.i(bArr);
        if (AbstractC1110z.g(bArr)) {
            this.f11274p.set(i7, i8);
        }
        return i8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C h(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f11274p);
        return new C(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i7) {
        a();
        Object remove = this.f11274p.remove(i7);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public D m() {
        return p() ? new n0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public Object n(int i7) {
        return this.f11274p.get(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public List o() {
        return Collections.unmodifiableList(this.f11274p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public String set(int i7, String str) {
        a();
        return f(this.f11274p.set(i7, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11274p.size();
    }

    public C(int i7) {
        this(new ArrayList(i7));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C(ArrayList arrayList) {
        this.f11274p = arrayList;
    }
}
