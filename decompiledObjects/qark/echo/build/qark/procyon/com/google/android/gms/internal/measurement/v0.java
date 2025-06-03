// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.BaseBundle;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class v0 extends B0
{
    public final AtomicReference b;
    public boolean c;
    
    public v0() {
        this.b = new AtomicReference();
    }
    
    public static Object v(final Bundle bundle, final Class clazz) {
        if (bundle != null) {
            final Object value = ((BaseBundle)bundle).get("r");
            if (value != null) {
                try {
                    return clazz.cast(value);
                }
                catch (ClassCastException ex) {
                    final String canonicalName = clazz.getCanonicalName();
                    final String canonicalName2 = value.getClass().getCanonicalName();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected object type. Expected, Received");
                    sb.append(": %s, %s");
                    Log.w("AM", String.format(sb.toString(), canonicalName, canonicalName2), (Throwable)ex);
                    throw ex;
                }
            }
        }
        return null;
    }
    
    public final Long Z0(final long n) {
        return (Long)v(this.o(n), Long.class);
    }
    
    public final String a1(final long n) {
        return (String)v(this.o(n), String.class);
    }
    
    @Override
    public final void l(final Bundle newValue) {
        final AtomicReference b = this.b;
        // monitorenter(b)
        try {
            this.b.set(newValue);
            this.c = true;
            final v0 v0 = this;
            final AtomicReference atomicReference = v0.b;
            atomicReference.notify();
            final AtomicReference atomicReference2 = b;
            // monitorexit(atomicReference2)
            return;
        }
        finally {
            this.b.notify();
        }
        while (true) {
            try {
                final v0 v0 = this;
                final AtomicReference atomicReference = v0.b;
                atomicReference.notify();
                final AtomicReference atomicReference2 = b;
                // monitorexit(atomicReference2)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Bundle o(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/internal/measurement/v0.b:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore          4
        //     6: aload           4
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/google/android/gms/internal/measurement/v0.c:Z
        //    13: istore_3       
        //    14: iload_3        
        //    15: ifne            39
        //    18: aload_0        
        //    19: getfield        com/google/android/gms/internal/measurement/v0.b:Ljava/util/concurrent/atomic/AtomicReference;
        //    22: lload_1        
        //    23: invokevirtual   java/lang/Object.wait:(J)V
        //    26: goto            39
        //    29: astore          5
        //    31: goto            57
        //    34: aload           4
        //    36: monitorexit    
        //    37: aconst_null    
        //    38: areturn        
        //    39: aload_0        
        //    40: getfield        com/google/android/gms/internal/measurement/v0.b:Ljava/util/concurrent/atomic/AtomicReference;
        //    43: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    46: checkcast       Landroid/os/Bundle;
        //    49: astore          5
        //    51: aload           4
        //    53: monitorexit    
        //    54: aload           5
        //    56: areturn        
        //    57: aload           4
        //    59: monitorexit    
        //    60: aload           5
        //    62: athrow         
        //    63: astore          5
        //    65: goto            34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      14     29     63     Any
        //  18     26     63     39     Ljava/lang/InterruptedException;
        //  18     26     29     63     Any
        //  34     37     29     63     Any
        //  39     54     29     63     Any
        //  57     60     29     63     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
}
