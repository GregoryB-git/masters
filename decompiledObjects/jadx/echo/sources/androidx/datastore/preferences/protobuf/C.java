package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class C extends AbstractC0756c implements D, RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    public static final C f8888q;

    /* renamed from: r, reason: collision with root package name */
    public static final D f8889r;

    /* renamed from: p, reason: collision with root package name */
    public final List f8890p;

    static {
        C c7 = new C();
        f8888q = c7;
        c7.j();
        f8889r = c7;
    }

    public C() {
        this(10);
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0760g ? ((AbstractC0760g) obj).a0() : AbstractC0777y.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void H(AbstractC0760g abstractC0760g) {
        a();
        this.f8890p.add(abstractC0760g);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).o();
        }
        boolean addAll = this.f8890p.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f8890p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i7, String str) {
        a();
        this.f8890p.add(i7, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        Object obj = this.f8890p.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0760g) {
            AbstractC0760g abstractC0760g = (AbstractC0760g) obj;
            String a02 = abstractC0760g.a0();
            if (abstractC0760g.M()) {
                this.f8890p.set(i7, a02);
            }
            return a02;
        }
        byte[] bArr = (byte[]) obj;
        String j7 = AbstractC0777y.j(bArr);
        if (AbstractC0777y.g(bArr)) {
            this.f8890p.set(i7, j7);
        }
        return j7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0777y.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C h(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f8890p);
        return new C(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i7) {
        a();
        Object remove = this.f8890p.remove(i7);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D m() {
        return p() ? new o0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object n(int i7) {
        return this.f8890p.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List o() {
        return Collections.unmodifiableList(this.f8890p);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, androidx.datastore.preferences.protobuf.AbstractC0777y.b
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public String set(int i7, String str) {
        a();
        return f(this.f8890p.set(i7, str));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8890p.size();
    }

    public C(int i7) {
        this(new ArrayList(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C(ArrayList arrayList) {
        this.f8890p = arrayList;
    }
}
