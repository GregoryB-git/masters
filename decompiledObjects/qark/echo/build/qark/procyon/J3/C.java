// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import java.util.List;

public final class C implements List, RandomAccess
{
    public final List o;
    
    public C(final List list) {
        this.o = Collections.unmodifiableList((List<?>)list);
    }
    
    public static C a(final List list) {
        return new C(list);
    }
    
    public static C d(final Object... a) {
        return new C(Arrays.asList(a));
    }
    
    @Override
    public void add(final int n, final Object o) {
        this.o.add(n, o);
    }
    
    @Override
    public boolean add(final Object o) {
        return this.o.add(o);
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        return this.o.addAll(n, collection);
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        return this.o.addAll(collection);
    }
    
    @Override
    public void clear() {
        this.o.clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.o.contains(o);
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        return this.o.containsAll(collection);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.o.equals(o);
    }
    
    @Override
    public Object get(final int n) {
        return this.o.get(n);
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    @Override
    public int indexOf(final Object o) {
        return this.o.indexOf(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.o.isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        return this.o.iterator();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        return this.o.lastIndexOf(o);
    }
    
    @Override
    public ListIterator listIterator() {
        return this.o.listIterator();
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        return this.o.listIterator(n);
    }
    
    @Override
    public Object remove(final int n) {
        return this.o.remove(n);
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.o.remove(o);
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        return this.o.removeAll(collection);
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        return this.o.retainAll(collection);
    }
    
    @Override
    public Object set(final int n, final Object o) {
        return this.o.set(n, o);
    }
    
    @Override
    public int size() {
        return this.o.size();
    }
    
    @Override
    public List subList(final int n, final int n2) {
        return this.o.subList(n, n2);
    }
    
    @Override
    public Object[] toArray() {
        return this.o.toArray();
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        return this.o.toArray(array);
    }
}
