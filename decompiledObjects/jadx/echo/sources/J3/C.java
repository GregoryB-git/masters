package J3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class C implements List, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    public final List f2690o;

    public C(List list) {
        this.f2690o = Collections.unmodifiableList(list);
    }

    public static C a(List list) {
        return new C(list);
    }

    public static C d(Object... objArr) {
        return new C(Arrays.asList(objArr));
    }

    @Override // java.util.List
    public void add(int i7, Object obj) {
        this.f2690o.add(i7, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        return this.f2690o.addAll(i7, collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f2690o.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f2690o.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f2690o.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f2690o.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i7) {
        return this.f2690o.get(i7);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f2690o.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f2690o.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f2690o.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f2690o.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f2690o.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f2690o.listIterator();
    }

    @Override // java.util.List
    public Object remove(int i7) {
        return this.f2690o.remove(i7);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.f2690o.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.f2690o.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i7, Object obj) {
        return this.f2690o.set(i7, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f2690o.size();
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return this.f2690o.subList(i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f2690o.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f2690o.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.f2690o.addAll(collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i7) {
        return this.f2690o.listIterator(i7);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f2690o.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f2690o.toArray(objArr);
    }
}
