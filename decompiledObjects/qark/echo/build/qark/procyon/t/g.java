// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

import java.util.Locale;
import java.util.Map;
import java.util.LinkedHashMap;

public class g
{
    public final LinkedHashMap a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public g(final int c) {
        if (c > 0) {
            this.c = c;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    public Object a(final Object o) {
        return null;
    }
    
    public void b(final boolean b, final Object o, final Object o2, final Object o3) {
    }
    
    public final Object c(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          145
        //     4: aload_0        
        //     5: monitorenter   
        //     6: aload_0        
        //     7: getfield        t/g.a:Ljava/util/LinkedHashMap;
        //    10: aload_1        
        //    11: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnull          33
        //    19: aload_0        
        //    20: aload_0        
        //    21: getfield        t/g.g:I
        //    24: iconst_1       
        //    25: iadd           
        //    26: putfield        t/g.g:I
        //    29: aload_0        
        //    30: monitorexit    
        //    31: aload_2        
        //    32: areturn        
        //    33: aload_0        
        //    34: aload_0        
        //    35: getfield        t/g.h:I
        //    38: iconst_1       
        //    39: iadd           
        //    40: putfield        t/g.h:I
        //    43: aload_0        
        //    44: monitorexit    
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokevirtual   t/g.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //    50: astore_2       
        //    51: aload_2        
        //    52: ifnonnull       57
        //    55: aconst_null    
        //    56: areturn        
        //    57: aload_0        
        //    58: monitorenter   
        //    59: aload_0        
        //    60: aload_0        
        //    61: getfield        t/g.e:I
        //    64: iconst_1       
        //    65: iadd           
        //    66: putfield        t/g.e:I
        //    69: aload_0        
        //    70: getfield        t/g.a:Ljava/util/LinkedHashMap;
        //    73: aload_1        
        //    74: aload_2        
        //    75: invokevirtual   java/util/AbstractMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    78: astore_3       
        //    79: aload_3        
        //    80: ifnull          96
        //    83: aload_0        
        //    84: getfield        t/g.a:Ljava/util/LinkedHashMap;
        //    87: aload_1        
        //    88: aload_3        
        //    89: invokevirtual   java/util/AbstractMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    92: pop            
        //    93: goto            111
        //    96: aload_0        
        //    97: aload_0        
        //    98: getfield        t/g.b:I
        //   101: aload_0        
        //   102: aload_1        
        //   103: aload_2        
        //   104: invokevirtual   t/g.f:(Ljava/lang/Object;Ljava/lang/Object;)I
        //   107: iadd           
        //   108: putfield        t/g.b:I
        //   111: aload_0        
        //   112: monitorexit    
        //   113: aload_3        
        //   114: ifnull          127
        //   117: aload_0        
        //   118: iconst_0       
        //   119: aload_1        
        //   120: aload_2        
        //   121: aload_3        
        //   122: invokevirtual   t/g.b:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   125: aload_3        
        //   126: areturn        
        //   127: aload_0        
        //   128: aload_0        
        //   129: getfield        t/g.c:I
        //   132: invokevirtual   t/g.i:(I)V
        //   135: aload_2        
        //   136: areturn        
        //   137: aload_0        
        //   138: monitorexit    
        //   139: aload_1        
        //   140: athrow         
        //   141: aload_0        
        //   142: monitorexit    
        //   143: aload_1        
        //   144: athrow         
        //   145: new             Ljava/lang/NullPointerException;
        //   148: dup            
        //   149: ldc             "key == null"
        //   151: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   154: athrow         
        //   155: astore_1       
        //   156: goto            141
        //   159: astore_1       
        //   160: goto            137
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      15     155    145    Any
        //  19     31     155    145    Any
        //  33     45     155    145    Any
        //  59     79     159    141    Any
        //  83     93     159    141    Any
        //  96     111    159    141    Any
        //  111    113    159    141    Any
        //  137    139    159    141    Any
        //  141    143    155    145    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public final Object d(final Object key, final Object value) {
        while (true) {
            if (key != null && value != null) {
                // monitorenter(this)
                while (true) {
                    try {
                        ++this.d;
                        this.b += this.f(key, value);
                        final Object put = this.a.put(key, value);
                        if (put != null) {
                            this.b -= this.f(key, put);
                        }
                        // monitorexit(this)
                        if (put != null) {
                            this.b(false, key, put, value);
                        }
                        this.i(this.c);
                        return put;
                        // monitorexit(this)
                        throw new NullPointerException("key == null || value == null");
                    }
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final Object e(final Object key) {
        while (true) {
            if (key != null) {
                // monitorenter(this)
                while (true) {
                    try {
                        final Object remove = this.a.remove(key);
                        if (remove != null) {
                            this.b -= this.f(key, remove);
                        }
                        // monitorexit(this)
                        if (remove != null) {
                            this.b(false, key, remove, null);
                        }
                        return remove;
                        throw new NullPointerException("key == null");
                    }
                    // monitorexit(this)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final int f(final Object obj, final Object obj2) {
        final int g = this.g(obj, obj2);
        if (g >= 0) {
            return g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(obj);
        sb.append("=");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }
    
    public int g(final Object o, final Object o2) {
        return 1;
    }
    
    public final Map h() {
        synchronized (this) {
            return new LinkedHashMap(this.a);
        }
    }
    
    public void i(final int n) {
    Label_0174_Outer:
        while (true) {
            // monitorenter(this)
            while (true) {
                try {
                    if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.getClass().getName());
                        sb.append(".sizeOf() is reporting inconsistent results!");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (this.b > n && !this.a.isEmpty()) {
                        final Map.Entry<Object, V> entry = this.a.entrySet().iterator().next();
                        final Object key = entry.getKey();
                        final V value = entry.getValue();
                        this.a.remove(key);
                        this.b -= this.f(key, value);
                        ++this.f;
                        // monitorexit(this)
                        this.b(true, key, value, null);
                        continue Label_0174_Outer;
                    }
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final String toString() {
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0090: {
                    while (true) {
                        try {
                            final int g = this.g;
                            final int n = this.h + g;
                            if (n != 0) {
                                final int i = g * 100 / n;
                                // monitorexit(this)
                                return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.g, this.h, i);
                            }
                            break Label_0090;
                            // monitorexit(this)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final int i = 0;
                continue;
            }
        }
    }
}
