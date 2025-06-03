package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1159y extends AbstractC1138c implements InterfaceC1160z, RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    public static final C1159y f12272q;

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC1160z f12273r;

    /* renamed from: p, reason: collision with root package name */
    public final List f12274p;

    static {
        C1159y c1159y = new C1159y();
        f12272q = c1159y;
        c1159y.j();
        f12273r = c1159y;
    }

    public C1159y() {
        this(10);
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1141f ? ((AbstractC1141f) obj).Y() : AbstractC1154t.i((byte[]) obj);
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof InterfaceC1160z) {
            collection = ((InterfaceC1160z) collection).o();
        }
        boolean addAll = this.f12274p.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f12274p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i7, String str) {
        a();
        this.f12274p.add(i7, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        Object obj = this.f12274p.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1141f) {
            AbstractC1141f abstractC1141f = (AbstractC1141f) obj;
            String Y6 = abstractC1141f.Y();
            if (abstractC1141f.s()) {
                this.f12274p.set(i7, Y6);
            }
            return Y6;
        }
        byte[] bArr = (byte[]) obj;
        String i8 = AbstractC1154t.i(bArr);
        if (AbstractC1154t.g(bArr)) {
            this.f12274p.set(i7, i8);
        }
        return i8;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC1154t.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1159y h(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f12274p);
        return new C1159y(arrayList);
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i7) {
        a();
        Object remove = this.f12274p.remove(i7);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public InterfaceC1160z m() {
        return p() ? new j0(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public Object n(int i7) {
        return this.f12274p.get(i7);
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public List o() {
        return Collections.unmodifiableList(this.f12274p);
    }

    @Override // com.google.protobuf.AbstractC1138c, com.google.protobuf.AbstractC1154t.e
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public String set(int i7, String str) {
        a();
        return f(this.f12274p.set(i7, str));
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12274p.size();
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public void x(AbstractC1141f abstractC1141f) {
        a();
        this.f12274p.add(abstractC1141f);
        ((AbstractList) this).modCount++;
    }

    public C1159y(int i7) {
        this(new ArrayList(i7));
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C1159y(ArrayList arrayList) {
        this.f12274p = arrayList;
    }
}
