// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.StrictMode$ThreadPolicy;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.os.StrictMode;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import W2.m;
import java.util.ArrayList;
import android.os.Handler;
import t.a;
import java.util.List;
import android.database.ContentObserver;
import android.net.Uri;
import android.content.ContentResolver;
import java.util.Map;

public final class B2 implements E2
{
    public static final Map h;
    public static final String[] i;
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ContentObserver d;
    public final Object e;
    public volatile Map f;
    public final List g;
    
    static {
        h = new a();
        i = new String[] { "key", "value" };
    }
    
    public B2(final ContentResolver a, final Uri b, final Runnable c) {
        final D2 d = new D2(this, null);
        this.d = d;
        this.e = new Object();
        this.g = new ArrayList();
        m.j(a);
        m.j(b);
        this.a = a;
        this.b = b;
        this.c = c;
        a.registerContentObserver(b, false, (ContentObserver)d);
    }
    
    public static B2 a(final ContentResolver p0, final Uri p1, final Runnable p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/internal/measurement/B2.h:Ljava/util/Map;
        //     6: astore          5
        //     8: aload           5
        //    10: aload_1        
        //    11: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    16: checkcast       Lcom/google/android/gms/internal/measurement/B2;
        //    19: astore          4
        //    21: aload           4
        //    23: astore_3       
        //    24: aload           4
        //    26: ifnonnull       57
        //    29: new             Lcom/google/android/gms/internal/measurement/B2;
        //    32: dup            
        //    33: aload_0        
        //    34: aload_1        
        //    35: aload_2        
        //    36: invokespecial   com/google/android/gms/internal/measurement/B2.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)V
        //    39: astore_3       
        //    40: aload           5
        //    42: aload_1        
        //    43: aload_3        
        //    44: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    49: pop            
        //    50: goto            57
        //    53: astore_0       
        //    54: goto            62
        //    57: ldc             Lcom/google/android/gms/internal/measurement/B2;.class
        //    59: monitorexit    
        //    60: aload_3        
        //    61: areturn        
        //    62: ldc             Lcom/google/android/gms/internal/measurement/B2;.class
        //    64: monitorexit    
        //    65: aload_0        
        //    66: athrow         
        //    67: astore_0       
        //    68: aload           4
        //    70: astore_3       
        //    71: goto            57
        //    74: astore_0       
        //    75: goto            50
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      21     53     67     Any
        //  29     40     67     74     Ljava/lang/SecurityException;
        //  29     40     53     67     Any
        //  40     50     74     78     Ljava/lang/SecurityException;
        //  40     50     53     67     Any
        //  57     60     53     67     Any
        //  62     65     53     67     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 42 out of bounds for length 42
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
    
    public static void d() {
        // monitorenter(B2.class)
        while (true) {
            try {
                for (final B2 b2 : B2.h.values()) {
                    b2.a.unregisterContentObserver(b2.d);
                }
                B2.h.clear();
                // monitorexit(B2.class)
                return;
                // monitorexit(B2.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Map b() {
        while (true) {
            Map f;
            if ((f = this.f) == null) {
                final Object e = this.e;
                // monitorenter(e)
                while (true) {
                    try {
                        if ((f = this.f) == null) {
                            f = this.f();
                            this.f = f;
                        }
                        // monitorexit(e)
                        if (f != null) {
                            return f;
                        }
                        return Collections.emptyMap();
                    }
                    // monitorexit(e)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/internal/measurement/B2.e:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: aconst_null    
        //     9: putfield        com/google/android/gms/internal/measurement/B2.f:Ljava/util/Map;
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/internal/measurement/B2.c:Ljava/lang/Runnable;
        //    16: invokeinterface java/lang/Runnable.run:()V
        //    21: aload_1        
        //    22: monitorexit    
        //    23: aload_0        
        //    24: monitorenter   
        //    25: aload_0        
        //    26: getfield        com/google/android/gms/internal/measurement/B2.g:Ljava/util/List;
        //    29: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    34: astore_1       
        //    35: aload_1        
        //    36: invokeinterface java/util/Iterator.hasNext:()Z
        //    41: ifne            47
        //    44: aload_0        
        //    45: monitorexit    
        //    46: return         
        //    47: aload_1        
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: invokestatic    android/support/v4/media/a.a:(Ljava/lang/Object;)V
        //    56: aconst_null    
        //    57: athrow         
        //    58: aload_0        
        //    59: monitorexit    
        //    60: aload_1        
        //    61: athrow         
        //    62: astore_2       
        //    63: aload_1        
        //    64: monitorexit    
        //    65: aload_2        
        //    66: athrow         
        //    67: astore_1       
        //    68: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      23     62     67     Any
        //  25     46     67     62     Any
        //  47     58     67     62     Any
        //  58     60     67     62     Any
        //  63     65     62     67     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    public final Map f() {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        while (true) {
            try {
                Label_0043: {
                    try {
                        final Map map = (Map)H2.a(new A2(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        return map;
                    }
                    finally {
                        break Label_0043;
                    }
                    Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    return null;
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw;
            }
            catch (SecurityException ex) {}
            catch (SQLiteException ex2) {}
            catch (IllegalStateException ex3) {}
            continue;
        }
    }
}
