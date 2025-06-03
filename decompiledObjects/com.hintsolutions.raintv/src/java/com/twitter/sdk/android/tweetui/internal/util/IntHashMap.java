/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.tweetui.internal.util;

public class IntHashMap {
    private int count;
    private float loadFactor;
    private Entry[] table;
    private int threshold;

    public IntHashMap() {
        this(20, 0.75f);
    }

    public IntHashMap(int n) {
        this(n, 0.75f);
    }

    public IntHashMap(int n, float f2) {
        if (n >= 0) {
            if (!(f2 <= 0.0f)) {
                int n3 = n;
                if (n == 0) {
                    n3 = 1;
                }
                this.loadFactor = f2;
                this.table = new Entry[n3];
                this.threshold = (int)((float)n3 * f2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal Load: ");
            stringBuilder.append(f2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException(a.f("Illegal Capacity: ", n));
    }

    public void clear() {
        IntHashMap intHashMap = this;
        synchronized (intHashMap) {
            Entry[] entryArray = this.table;
            int n = entryArray.length;
            while (--n >= 0) {
                entryArray[n] = null;
            }
            this.count = 0;
            return;
        }
    }

    public boolean contains(Object object) {
        object.getClass();
        Entry[] entryArray = this.table;
        int n = entryArray.length;
        while (true) {
            int n3 = n - 1;
            if (n <= 0) break;
            Entry entry = entryArray[n3];
            while (entry != null) {
                if (entry.value.equals(object)) {
                    return true;
                }
                entry = entry.next;
            }
            n = n3;
        }
        return false;
    }

    public boolean containsKey(int n) {
        Object object = this.table;
        object = object[(Integer.MAX_VALUE & n) % ((Entry[])object).length];
        while (object != null) {
            if (object.hash == n) {
                return true;
            }
            object = object.next;
        }
        return false;
    }

    public boolean containsValue(Object object) {
        return this.contains(object);
    }

    public Object get(int n) {
        Object object = this.table;
        object = object[(Integer.MAX_VALUE & n) % ((Entry[])object).length];
        while (object != null) {
            if (object.hash == n) {
                return object.value;
            }
            object = object.next;
        }
        return null;
    }

    public boolean isEmpty() {
        boolean bl = this.count == 0;
        return bl;
    }

    public Object put(int n, Object object) {
        Object object2 = this.table;
        int n3 = Integer.MAX_VALUE & n;
        int n4 = n3 % ((Entry[])object2).length;
        Object object3 = object2[n4];
        while (object3 != null) {
            if (object3.hash == n) {
                object2 = object3.value;
                object3.value = object;
                return object2;
            }
            object3 = object3.next;
        }
        object3 = object2;
        if (this.count >= this.threshold) {
            this.rehash();
            object3 = this.table;
            n4 = n3 % ((Entry[])object3).length;
        }
        object3[n4] = new Entry(n, n, object, object3[n4]);
        ++this.count;
        return null;
    }

    public void rehash() {
        Entry[] entryArray = this.table;
        int n = entryArray.length;
        int n3 = n * 2 + 1;
        Entry[] entryArray2 = new Entry[n3];
        this.threshold = (int)((float)n3 * this.loadFactor);
        this.table = entryArray2;
        while (true) {
            int n4 = n - 1;
            if (n <= 0) break;
            Entry entry = entryArray[n4];
            while (entry != null) {
                Entry entry2 = entry.next;
                n = (entry.hash & Integer.MAX_VALUE) % n3;
                entry.next = entryArray2[n];
                entryArray2[n] = entry;
                entry = entry2;
            }
            n = n4;
        }
    }

    public Object remove(int n) {
        Entry[] entryArray = this.table;
        int n3 = (Integer.MAX_VALUE & n) % entryArray.length;
        Entry entry = entryArray[n3];
        Object object = null;
        while (entry != null) {
            if (entry.hash == n) {
                if (object != null) {
                    ((Entry)object).next = entry.next;
                } else {
                    entryArray[n3] = entry.next;
                }
                --this.count;
                object = entry.value;
                entry.value = null;
                return object;
            }
            Entry entry2 = entry.next;
            object = entry;
            entry = entry2;
        }
        return null;
    }

    public int size() {
        return this.count;
    }

    public static class Entry {
        public final int hash;
        public int key;
        public Entry next;
        public Object value;

        public Entry(int n, int n3, Object object, Entry entry) {
            this.hash = n;
            this.key = n3;
            this.value = object;
            this.next = entry;
        }
    }
}

