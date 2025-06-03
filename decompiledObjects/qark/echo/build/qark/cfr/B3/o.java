/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicReference
 */
package B3;

import B3.D;
import B3.E;
import B3.F;
import B3.G;
import B3.c;
import B3.d;
import B3.e;
import B3.h;
import B3.j;
import B3.k;
import B3.m;
import B3.n;
import B3.p;
import B3.r;
import B3.v;
import B3.y;
import B3.z;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r4.a;
import t0.f;

public class o
implements e,
h4.a {
    public static final r4.b i = new k();
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final List d;
    public Set e = new HashSet();
    public final v f;
    public final AtomicReference g = new AtomicReference();
    public final j h;

    public o(Executor executor, Iterable iterable, Collection collection, j object2) {
        v v8;
        this.f = v8 = new v(executor);
        this.h = object2;
        executor = new ArrayList();
        executor.add((Object)c.s(v8, v.class, n4.d.class, n4.c.class));
        executor.add((Object)c.s(this, h4.a.class, new Class[0]));
        for (Object object2 : collection) {
            if (object2 == null) continue;
            executor.add(object2);
        }
        this.d = o.q(iterable);
        this.n((List)executor);
    }

    public /* synthetic */ o(Executor executor, Iterable iterable, Collection collection, j j8,  a8) {
        this(executor, iterable, collection, j8);
    }

    public static /* synthetic */ Object j(o o8, c c8) {
        return o8.r(c8);
    }

    public static /* synthetic */ void k(D d8, r4.b b8) {
        d8.j(b8);
    }

    public static /* synthetic */ void l(y y8, r4.b b8) {
        y8.a(b8);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            arrayList.add(iterable.next());
        }
        return arrayList;
    }

    @Override
    public /* synthetic */ Object a(Class class_) {
        return d.b(this, class_);
    }

    @Override
    public r4.b b(F object) {
        synchronized (this) {
            E.c(object, "Null interface requested.");
            object = (r4.b)this.b.get(object);
            return object;
        }
    }

    @Override
    public /* synthetic */ Set c(Class class_) {
        return d.f(this, class_);
    }

    @Override
    public a d(F object) {
        if ((object = this.b((F)object)) == null) {
            return D.e();
        }
        if (object instanceof D) {
            return (D)object;
        }
        return D.i((r4.b)object);
    }

    @Override
    public /* synthetic */ Set e(F f8) {
        return d.e(this, f8);
    }

    @Override
    public r4.b f(F object) {
        synchronized (this) {
            block4 : {
                object = (y)this.c.get(object);
                if (object == null) break block4;
                return object;
            }
            object = i;
            return object;
        }
    }

    @Override
    public /* synthetic */ r4.b g(Class class_) {
        return d.d(this, class_);
    }

    @Override
    public /* synthetic */ Object h(F f8) {
        return d.a(this, f8);
    }

    @Override
    public /* synthetic */ a i(Class class_) {
        return d.c(this, class_);
    }

    /*
     * Exception decompiling
     */
    public final void n(List var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 11[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void o(Map map, boolean bl) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Object object = (Map.Entry)map.next();
            c c8 = (c)object.getKey();
            object = (r4.b)object.getValue();
            if (!c8.n() && (!c8.o() || !bl)) continue;
            object.get();
        }
        this.f.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(boolean bl) {
        HashMap hashMap;
        if (!f.a(this.g, null, bl)) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        this.o((Map)hashMap, bl);
    }

    public final /* synthetic */ Object r(c c8) {
        return c8.h().a(new G(c8, this));
    }

    public final void u() {
        Boolean bl = (Boolean)this.g.get();
        if (bl != null) {
            this.o(this.a, bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void v() {
        Iterator iterator = this.a.keySet().iterator();
        block0 : while (iterator.hasNext()) {
            c c8 = (c)iterator.next();
            Iterator iterator2 = c8.g().iterator();
            do {
                Map map;
                void var3_4;
                if (!iterator2.hasNext()) continue block0;
                Object object = (r)iterator2.next();
                if (object.g() && !this.c.containsKey((Object)object.c())) {
                    map = this.c;
                    object = object.c();
                    y y8 = y.b((Collection)Collections.emptySet());
                } else {
                    if (this.b.containsKey((Object)object.c())) continue;
                    if (object.f()) {
                        throw new z(String.format((String)"Unsatisfied dependency for component %s: %s", (Object[])new Object[]{c8, object.c()}));
                    }
                    if (object.g()) continue;
                    map = this.b;
                    object = object.c();
                    D d8 = D.e();
                }
                map.put(object, (Object)var3_4);
            } while (true);
            break;
        }
        return;
    }

    public final List w(List list) {
        ArrayList arrayList = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            c c8 = (c)list.next();
            if (!c8.p()) continue;
            r4.b b8 = (r4.b)this.a.get((Object)c8);
            for (F f8 : c8.j()) {
                if (!this.b.containsKey((Object)f8)) {
                    this.b.put((Object)f8, (Object)b8);
                    continue;
                }
                arrayList.add((Object)new m((D)((r4.b)this.b.get((Object)f8)), b8));
            }
        }
        return arrayList;
    }

    public final List x() {
        Object object;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Object object2 = this.a.entrySet().iterator();
        while (object2.hasNext()) {
            object = (Map.Entry)object2.next();
            c c8 = (c)object.getKey();
            if (c8.p()) continue;
            object = (r4.b)object.getValue();
            for (F f8 : c8.j()) {
                if (!hashMap.containsKey((Object)f8)) {
                    hashMap.put((Object)f8, (Object)new HashSet());
                }
                ((Set)hashMap.get((Object)f8)).add(object);
            }
        }
        hashMap = hashMap.entrySet().iterator();
        while (hashMap.hasNext()) {
            object = (Map.Entry)hashMap.next();
            if (!this.c.containsKey(object.getKey())) {
                this.c.put((Object)((F)object.getKey()), (Object)y.b((Collection)object.getValue()));
                continue;
            }
            object2 = (y)this.c.get(object.getKey());
            object = ((Set)object.getValue()).iterator();
            while (object.hasNext()) {
                arrayList.add((Object)new n((y)object2, (r4.b)object.next()));
            }
        }
        return arrayList;
    }

    public static final class b {
        public final Executor a;
        public final List b = new ArrayList();
        public final List c = new ArrayList();
        public j d = j.a;

        public b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c c8) {
            this.c.add((Object)c8);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.b.add((Object)new p(componentRegistrar));
            return this;
        }

        public b d(Collection collection) {
            this.b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.a, (Iterable)this.b, (Collection)this.c, this.d, null);
        }

        public b g(j j8) {
            this.d = j8;
            return this;
        }
    }

}

