// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import t0.f;
import java.util.Iterator;
import n4.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Set;
import java.util.List;
import java.util.Map;
import r4.b;
import h4.a;

public class o implements e, a
{
    public static final r4.b i;
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;
    public Set e;
    public final v f;
    public final AtomicReference g;
    public final j h;
    
    static {
        i = new k();
    }
    
    public o(final Executor executor, final Iterable iterable, final Collection collection, final j h) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        final v f = new v(executor);
        this.f = f;
        this.h = h;
        final ArrayList<c> list = new ArrayList<c>();
        list.add(B3.c.s(f, v.class, d.class, n4.c.class));
        list.add(B3.c.s(this, a.class, new Class[0]));
        for (final c c : collection) {
            if (c != null) {
                list.add(c);
            }
        }
        this.d = q(iterable);
        this.n(list);
    }
    
    public static b m(final Executor executor) {
        return new b(executor);
    }
    
    public static List q(final Iterable iterable) {
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
    
    @Override
    public r4.b b(final F f) {
        synchronized (this) {
            E.c(f, "Null interface requested.");
            return this.b.get(f);
        }
    }
    
    @Override
    public r4.a d(final F f) {
        final r4.b b = this.b(f);
        if (b == null) {
            return D.e();
        }
        if (b instanceof D) {
            return (D)b;
        }
        return D.i(b);
    }
    
    @Override
    public r4.b f(final F f) {
        synchronized (this) {
            final y y = this.c.get(f);
            if (y != null) {
                return y;
            }
            return o.i;
        }
    }
    
    public final void n(final List p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          4
        //     9: aload_0        
        //    10: monitorenter   
        //    11: aload_0        
        //    12: getfield        B3/o.d:Ljava/util/List;
        //    15: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    20: astore          5
        //    22: aload           5
        //    24: invokeinterface java/util/Iterator.hasNext:()Z
        //    29: ifeq            115
        //    32: aload           5
        //    34: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    39: checkcast       Lr4/b;
        //    42: astore          6
        //    44: aload           6
        //    46: invokeinterface r4/b.get:()Ljava/lang/Object;
        //    51: checkcast       Lcom/google/firebase/components/ComponentRegistrar;
        //    54: astore          6
        //    56: aload           6
        //    58: ifnull          22
        //    61: aload_1        
        //    62: aload_0        
        //    63: getfield        B3/o.h:LB3/j;
        //    66: aload           6
        //    68: invokeinterface B3/j.a:(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
        //    73: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    78: pop            
        //    79: aload           5
        //    81: invokeinterface java/util/Iterator.remove:()V
        //    86: goto            22
        //    89: astore_1       
        //    90: goto            413
        //    93: astore          6
        //    95: aload           5
        //    97: invokeinterface java/util/Iterator.remove:()V
        //   102: ldc             "ComponentDiscovery"
        //   104: ldc             "Invalid component registrar."
        //   106: aload           6
        //   108: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   111: pop            
        //   112: goto            22
        //   115: aload_1        
        //   116: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   121: astore          5
        //   123: aload           5
        //   125: invokeinterface java/util/Iterator.hasNext:()Z
        //   130: ifeq            228
        //   133: aload           5
        //   135: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   140: checkcast       LB3/c;
        //   143: invokevirtual   B3/c.j:()Ljava/util/Set;
        //   146: invokeinterface java/util/Set.toArray:()[Ljava/lang/Object;
        //   151: astore          6
        //   153: aload           6
        //   155: arraylength    
        //   156: istore_3       
        //   157: iconst_0       
        //   158: istore_2       
        //   159: iload_2        
        //   160: iload_3        
        //   161: if_icmpge       123
        //   164: aload           6
        //   166: iload_2        
        //   167: aaload         
        //   168: astore          7
        //   170: aload           7
        //   172: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   175: ldc             "kotlinx.coroutines.CoroutineDispatcher"
        //   177: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   180: ifeq            417
        //   183: aload_0        
        //   184: getfield        B3/o.e:Ljava/util/Set;
        //   187: aload           7
        //   189: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   192: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   197: ifeq            210
        //   200: aload           5
        //   202: invokeinterface java/util/Iterator.remove:()V
        //   207: goto            123
        //   210: aload_0        
        //   211: getfield        B3/o.e:Ljava/util/Set;
        //   214: aload           7
        //   216: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   219: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   224: pop            
        //   225: goto            417
        //   228: aload_0        
        //   229: getfield        B3/o.a:Ljava/util/Map;
        //   232: invokeinterface java/util/Map.isEmpty:()Z
        //   237: ifeq            247
        //   240: aload_1        
        //   241: invokestatic    B3/q.a:(Ljava/util/List;)V
        //   244: goto            277
        //   247: new             Ljava/util/ArrayList;
        //   250: dup            
        //   251: aload_0        
        //   252: getfield        B3/o.a:Ljava/util/Map;
        //   255: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   260: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   263: astore          5
        //   265: aload           5
        //   267: aload_1        
        //   268: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   271: pop            
        //   272: aload           5
        //   274: invokestatic    B3/q.a:(Ljava/util/List;)V
        //   277: aload_1        
        //   278: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   283: astore          5
        //   285: aload           5
        //   287: invokeinterface java/util/Iterator.hasNext:()Z
        //   292: ifeq            343
        //   295: aload           5
        //   297: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   302: checkcast       LB3/c;
        //   305: astore          6
        //   307: new             LB3/x;
        //   310: dup            
        //   311: new             LB3/l;
        //   314: dup            
        //   315: aload_0        
        //   316: aload           6
        //   318: invokespecial   B3/l.<init>:(LB3/o;LB3/c;)V
        //   321: invokespecial   B3/x.<init>:(Lr4/b;)V
        //   324: astore          7
        //   326: aload_0        
        //   327: getfield        B3/o.a:Ljava/util/Map;
        //   330: aload           6
        //   332: aload           7
        //   334: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   339: pop            
        //   340: goto            285
        //   343: aload           4
        //   345: aload_0        
        //   346: aload_1        
        //   347: invokevirtual   B3/o.w:(Ljava/util/List;)Ljava/util/List;
        //   350: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   355: pop            
        //   356: aload           4
        //   358: aload_0        
        //   359: invokevirtual   B3/o.x:()Ljava/util/List;
        //   362: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   367: pop            
        //   368: aload_0        
        //   369: invokevirtual   B3/o.v:()V
        //   372: aload_0        
        //   373: monitorexit    
        //   374: aload           4
        //   376: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   381: astore_1       
        //   382: aload_1        
        //   383: invokeinterface java/util/Iterator.hasNext:()Z
        //   388: ifeq            408
        //   391: aload_1        
        //   392: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   397: checkcast       Ljava/lang/Runnable;
        //   400: invokeinterface java/lang/Runnable.run:()V
        //   405: goto            382
        //   408: aload_0        
        //   409: invokevirtual   B3/o.u:()V
        //   412: return         
        //   413: aload_0        
        //   414: monitorexit    
        //   415: aload_1        
        //   416: athrow         
        //   417: iload_2        
        //   418: iconst_1       
        //   419: iadd           
        //   420: istore_2       
        //   421: goto            159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  11     22     89     417    Any
        //  22     44     89     417    Any
        //  44     56     93     115    LB3/w;
        //  44     56     89     417    Any
        //  61     86     93     115    LB3/w;
        //  61     86     89     417    Any
        //  95     112    89     417    Any
        //  115    123    89     417    Any
        //  123    157    89     417    Any
        //  170    207    89     417    Any
        //  210    225    89     417    Any
        //  228    244    89     417    Any
        //  247    277    89     417    Any
        //  277    285    89     417    Any
        //  285    340    89     417    Any
        //  343    374    89     417    Any
        //  413    415    89     417    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void o(final Map map, final boolean b) {
        for (final Map.Entry<c, V> entry : map.entrySet()) {
            final c c = entry.getKey();
            final r4.b b2 = (r4.b)entry.getValue();
            if (c.n() || (c.o() && b)) {
                b2.get();
            }
        }
        this.f.f();
    }
    
    public void p(final boolean b) {
        if (!t0.f.a(this.g, null, b)) {
            return;
        }
        synchronized (this) {
            final HashMap hashMap = new HashMap(this.a);
            // monitorexit(this)
            this.o(hashMap, b);
        }
    }
    
    public final void u() {
        final Boolean b = this.g.get();
        if (b != null) {
            this.o(this.a, b);
        }
    }
    
    public final void v() {
        for (final c c : this.a.keySet()) {
            for (final r r : c.g()) {
                Map map;
                F f;
                r4.b b;
                if (r.g() && !this.c.containsKey(r.c())) {
                    map = this.c;
                    f = r.c();
                    b = y.b(Collections.emptySet());
                }
                else {
                    if (this.b.containsKey(r.c())) {
                        continue;
                    }
                    if (r.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", c, r.c()));
                    }
                    if (r.g()) {
                        continue;
                    }
                    map = this.b;
                    f = r.c();
                    b = D.e();
                }
                map.put(f, b);
            }
        }
    }
    
    public final List w(final List list) {
        final ArrayList<m> list2 = new ArrayList<m>();
        for (final c c : list) {
            if (!c.p()) {
                continue;
            }
            final r4.b b = this.a.get(c);
            for (final F f : c.j()) {
                if (!this.b.containsKey(f)) {
                    this.b.put(f, b);
                }
                else {
                    list2.add(new m((D)this.b.get(f), b));
                }
            }
        }
        return list2;
    }
    
    public final List x() {
        final ArrayList<n> list = new ArrayList<n>();
        final HashMap<Object, HashSet<r4.b>> hashMap = new HashMap<Object, HashSet<r4.b>>();
        for (final Map.Entry<c, V> entry : this.a.entrySet()) {
            final c c = entry.getKey();
            if (c.p()) {
                continue;
            }
            final r4.b b = (r4.b)entry.getValue();
            for (final F f : c.j()) {
                if (!hashMap.containsKey(f)) {
                    hashMap.put(f, new HashSet<r4.b>());
                }
                hashMap.get(f).add(b);
            }
        }
        for (final Map.Entry<F, HashSet<r4.b>> entry2 : hashMap.entrySet()) {
            if (!this.c.containsKey(entry2.getKey())) {
                this.c.put(entry2.getKey(), y.b(entry2.getValue()));
            }
            else {
                final y y = this.c.get(entry2.getKey());
                final Iterator<Object> iterator4 = entry2.getValue().iterator();
                while (iterator4.hasNext()) {
                    list.add(new n(y, iterator4.next()));
                }
            }
        }
        return list;
    }
    
    public static final class b
    {
        public final Executor a;
        public final List b;
        public final List c;
        public j d;
        
        public b(final Executor a) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = j.a;
            this.a = a;
        }
        
        public b b(final c c) {
            this.c.add(c);
            return this;
        }
        
        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new p(componentRegistrar));
            return this;
        }
        
        public b d(final Collection collection) {
            this.b.addAll(collection);
            return this;
        }
        
        public o e() {
            return new o(this.a, this.b, this.c, this.d, null);
        }
        
        public b g(final j d) {
            this.d = d;
            return this;
        }
    }
}
