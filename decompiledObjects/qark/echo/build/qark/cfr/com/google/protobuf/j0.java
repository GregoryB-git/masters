/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package com.google.protobuf;

import com.google.protobuf.f;
import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class j0
extends AbstractList
implements z,
RandomAccess {
    public final z o;

    public j0(z z8) {
        this.o = z8;
    }

    public String d(int n8) {
        return (String)this.o.get(n8);
    }

    public Iterator iterator() {
        return new Iterator(){
            public Iterator o;
            {
                this.o = j0.this.o.iterator();
            }

            public String b() {
                return (String)this.o.next();
            }

            public boolean hasNext() {
                return this.o.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public ListIterator listIterator(final int n8) {
        return new ListIterator(){
            public ListIterator o;
            {
                this.o = j0.this.o.listIterator(n82);
            }

            public void b(String string2) {
                throw new UnsupportedOperationException();
            }

            public String d() {
                return (String)this.o.next();
            }

            public String e() {
                return (String)this.o.previous();
            }

            public void f(String string2) {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                return this.o.hasNext();
            }

            public boolean hasPrevious() {
                return this.o.hasPrevious();
            }

            public int nextIndex() {
                return this.o.nextIndex();
            }

            public int previousIndex() {
                return this.o.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public z m() {
        return this;
    }

    @Override
    public Object n(int n8) {
        return this.o.n(n8);
    }

    @Override
    public List o() {
        return this.o.o();
    }

    public int size() {
        return this.o.size();
    }

    @Override
    public void x(f f8) {
        throw new UnsupportedOperationException();
    }

}

