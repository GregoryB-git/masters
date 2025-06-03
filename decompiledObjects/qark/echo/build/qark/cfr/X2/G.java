/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Enum
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractCollection
 *  java.util.AbstractMap
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package X2;

import W2.g;
import W2.k;
import W2.m;
import X2.C;
import X2.F;
import X2.a0;
import X2.e0;
import X2.i;
import X2.j;
import X2.u;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class G {
    public static int a(int n8) {
        if (n8 < 3) {
            i.b(n8, "expectedSize");
            return n8 + 1;
        }
        if (n8 < 1073741824) {
            return (int)Math.ceil((double)((double)n8 / 0.75));
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object object) {
        return C.d(G.m(map.entrySet().iterator()), object);
    }

    public static boolean c(Map map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            object = (Map)object;
            return map.entrySet().equals((Object)object.entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object object, Object object2) {
        return new u(object, object2);
    }

    public static g e() {
        return b.o;
    }

    public static HashMap f(int n8) {
        return new HashMap(G.a(n8));
    }

    public static IdentityHashMap g() {
        return new IdentityHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean h(Map map, Object object) {
        m.j((Object)map);
        try {
            return map.containsKey(object);
        }
        catch (ClassCastException | NullPointerException nullPointerException) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object i(Map object, Object object2) {
        m.j(object);
        try {
            return object.get(object2);
        }
        catch (ClassCastException | NullPointerException classCastException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object j(Map object, Object object2) {
        m.j(object);
        try {
            return object.remove(object2);
        }
        catch (ClassCastException | NullPointerException classCastException) {
            return null;
        }
    }

    public static String k(Map map) {
        StringBuilder stringBuilder = j.b(map.size());
        stringBuilder.append('{');
        map = map.entrySet().iterator();
        boolean bl = true;
        while (map.hasNext()) {
            Map.Entry entry = (Map.Entry)map.next();
            if (!bl) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append(entry.getValue());
            bl = false;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static g l() {
        return b.p;
    }

    public static Iterator m(Iterator iterator) {
        return new e0(iterator){

            public Object d(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    public static abstract class b
    extends Enum
    implements g {
        public static final /* enum */ b o = new b("KEY", 0){

            public Object e(Map.Entry entry) {
                return entry.getKey();
            }
        };
        public static final /* enum */ b p = new b("VALUE", 1){

            public Object e(Map.Entry entry) {
                return entry.getValue();
            }
        };
        public static final /* synthetic */ b[] q;

        static {
            q = b.c();
        }

        public b() {
        }

        /*
         * Exception decompiling
         */
        public /* synthetic */ b(F var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException: Synthetic arg - offset is 1, but got 3
            // org.benf.cfr.reader.bytecode.analysis.types.MethodPrototype.collectInitialSlotUsage(MethodPrototype.java:244)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiersInner(Op02WithProcessedDataAndRefs.java:1561)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1518)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1762)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:382)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o, p};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }

    }

    public static abstract class c
    extends a0.d {
        public abstract Map a();

        public void clear() {
            this.a().clear();
        }

        public abstract boolean contains(Object var1);

        public boolean isEmpty() {
            return this.a().isEmpty();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection)m.j((Object)collection));
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                return a0.j((Set)this, collection.iterator());
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection)m.j((Object)collection));
            }
            catch (UnsupportedOperationException unsupportedOperationException) {}
            HashSet hashSet = a0.g(collection.size());
            collection = collection.iterator();
            while (collection.hasNext()) {
                Object object = collection.next();
                if (!this.contains(object) || !(object instanceof Map.Entry)) continue;
                hashSet.add(((Map.Entry)object).getKey());
            }
            return this.a().keySet().retainAll((Collection)hashSet);
        }

        public int size() {
            return this.a().size();
        }
    }

    public static abstract class d
    extends a0.d {
        public final Map o;

        public d(Map map) {
            this.o = (Map)m.j((Object)map);
        }

        public Map a() {
            return this.o;
        }

        public boolean contains(Object object) {
            return this.a().containsKey(object);
        }

        public boolean isEmpty() {
            return this.a().isEmpty();
        }

        public int size() {
            return this.a().size();
        }
    }

    public static class e
    extends AbstractCollection {
        public final Map o;

        public e(Map map) {
            this.o = (Map)m.j((Object)map);
        }

        public final Map a() {
            return this.o;
        }

        public void clear() {
            this.a().clear();
        }

        public boolean contains(Object object) {
            return this.a().containsValue(object);
        }

        public boolean isEmpty() {
            return this.a().isEmpty();
        }

        public Iterator iterator() {
            return G.m(this.a().entrySet().iterator());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean remove(Object object) {
            Map.Entry entry;
            try {
                return super.remove(object);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {}
            Iterator iterator = this.a().entrySet().iterator();
            do {
                if (iterator.hasNext()) continue;
                return false;
            } while (!k.a(object, (entry = (Map.Entry)iterator.next()).getValue()));
            this.a().remove(entry.getKey());
            return true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection)m.j((Object)collection));
            }
            catch (UnsupportedOperationException unsupportedOperationException) {}
            HashSet hashSet = a0.f();
            Iterator iterator = this.a().entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().removeAll((Collection)hashSet);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection)m.j((Object)collection));
            }
            catch (UnsupportedOperationException unsupportedOperationException) {}
            HashSet hashSet = a0.f();
            Iterator iterator = this.a().entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().retainAll((Collection)hashSet);
        }

        public int size() {
            return this.a().size();
        }
    }

    public static abstract class f
    extends AbstractMap {
        public transient Set o;
        public transient Collection p;

        public abstract Set a();

        public Collection b() {
            return new e((Map)this);
        }

        public Set entrySet() {
            Set set;
            Set set2 = set = this.o;
            if (set == null) {
                this.o = set2 = this.a();
            }
            return set2;
        }

        public Collection values() {
            Collection collection;
            Collection collection2 = collection = this.p;
            if (collection == null) {
                this.p = collection2 = this.b();
            }
            return collection2;
        }
    }

}

