package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986o4 extends AbstractC0958l3 implements InterfaceC0977n4, RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    public static final C0986o4 f11086q;

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC0977n4 f11087r;

    /* renamed from: p, reason: collision with root package name */
    public final List f11088p;

    static {
        C0986o4 c0986o4 = new C0986o4(false);
        f11086q = c0986o4;
        f11087r = c0986o4;
    }

    public C0986o4(int i7) {
        this(new ArrayList(i7));
    }

    public static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1003q3 ? ((AbstractC1003q3) obj).V() : AbstractC0860a4.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final void K(AbstractC1003q3 abstractC1003q3) {
        a();
        this.f11088p.add(abstractC1003q3);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        a();
        this.f11088p.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof InterfaceC0977n4) {
            collection = ((InterfaceC0977n4) collection).b();
        }
        boolean addAll = this.f11088p.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final List b() {
        return Collections.unmodifiableList(this.f11088p);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, com.google.android.gms.internal.measurement.InterfaceC0923h4
    public final /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f11088p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0923h4
    public final /* synthetic */ InterfaceC0923h4 e(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f11088p);
        return new C0986o4(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        Object obj = this.f11088p.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1003q3) {
            AbstractC1003q3 abstractC1003q3 = (AbstractC1003q3) obj;
            String V6 = abstractC1003q3.V();
            if (abstractC1003q3.W()) {
                this.f11088p.set(i7, V6);
            }
            return V6;
        }
        byte[] bArr = (byte[]) obj;
        String h7 = AbstractC0860a4.h(bArr);
        if (AbstractC0860a4.i(bArr)) {
            this.f11088p.set(i7, h7);
        }
        return h7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final Object l(int i7) {
        return this.f11088p.get(i7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        a();
        Object remove = this.f11088p.remove(i7);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        a();
        return d(this.f11088p.set(i7, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11088p.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final InterfaceC0977n4 w() {
        return c() ? new C1076y5(this) : this;
    }

    public C0986o4(ArrayList arrayList) {
        this.f11088p = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C0986o4(boolean z7) {
        super(false);
        this.f11088p = Collections.emptyList();
    }
}
