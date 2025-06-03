/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package J3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class C
implements List,
RandomAccess {
    public final List o;

    public C(List list) {
        this.o = Collections.unmodifiableList((List)list);
    }

    public static C a(List list) {
        return new C(list);
    }

    public static /* varargs */ C d(Object ... arrobject) {
        return new C(Arrays.asList((Object[])arrobject));
    }

    public void add(int n8, Object object) {
        this.o.add(n8, object);
    }

    public boolean add(Object object) {
        return this.o.add(object);
    }

    public boolean addAll(int n8, Collection collection) {
        return this.o.addAll(n8, collection);
    }

    public boolean addAll(Collection collection) {
        return this.o.addAll(collection);
    }

    public void clear() {
        this.o.clear();
    }

    public boolean contains(Object object) {
        return this.o.contains(object);
    }

    public boolean containsAll(Collection collection) {
        return this.o.containsAll(collection);
    }

    public boolean equals(Object object) {
        return this.o.equals(object);
    }

    public Object get(int n8) {
        return this.o.get(n8);
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    public int indexOf(Object object) {
        return this.o.indexOf(object);
    }

    public boolean isEmpty() {
        return this.o.isEmpty();
    }

    public Iterator iterator() {
        return this.o.iterator();
    }

    public int lastIndexOf(Object object) {
        return this.o.lastIndexOf(object);
    }

    public ListIterator listIterator() {
        return this.o.listIterator();
    }

    public ListIterator listIterator(int n8) {
        return this.o.listIterator(n8);
    }

    public Object remove(int n8) {
        return this.o.remove(n8);
    }

    public boolean remove(Object object) {
        return this.o.remove(object);
    }

    public boolean removeAll(Collection collection) {
        return this.o.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.o.retainAll(collection);
    }

    public Object set(int n8, Object object) {
        return this.o.set(n8, object);
    }

    public int size() {
        return this.o.size();
    }

    public List subList(int n8, int n9) {
        return this.o.subList(n8, n9);
    }

    public Object[] toArray() {
        return this.o.toArray();
    }

    public Object[] toArray(Object[] arrobject) {
        return this.o.toArray(arrobject);
    }
}

