// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import android.content.SharedPreferences;

public final class a0
{
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final ArrayDeque d;
    public final Executor e;
    public boolean f;
    
    public a0(final SharedPreferences a, final String b, final String c, final Executor e) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static a0 d(final SharedPreferences sharedPreferences, final String s, final String s2, final Executor executor) {
        final a0 a0 = new a0(sharedPreferences, s, s2, executor);
        a0.e();
        return a0;
    }
    
    public boolean b(final String e) {
        if (!TextUtils.isEmpty((CharSequence)e)) {
            if (!e.contains(this.c)) {
                synchronized (this.d) {
                    return this.c(this.d.add(e));
                }
            }
        }
        return false;
    }
    
    public final boolean c(final boolean b) {
        if (b && !this.f) {
            this.j();
        }
        return b;
    }
    
    public final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/firebase/messaging/a0.d:Ljava/util/ArrayDeque;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/firebase/messaging/a0.d:Ljava/util/ArrayDeque;
        //    11: invokevirtual   java/util/ArrayDeque.clear:()V
        //    14: aload_0        
        //    15: getfield        com/google/firebase/messaging/a0.a:Landroid/content/SharedPreferences;
        //    18: aload_0        
        //    19: getfield        com/google/firebase/messaging/a0.b:Ljava/lang/String;
        //    22: ldc             ""
        //    24: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    29: astore          4
        //    31: aload           4
        //    33: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    36: ifne            124
        //    39: aload           4
        //    41: aload_0        
        //    42: getfield        com/google/firebase/messaging/a0.c:Ljava/lang/String;
        //    45: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    48: ifne            54
        //    51: goto            124
        //    54: aload           4
        //    56: aload_0        
        //    57: getfield        com/google/firebase/messaging/a0.c:Ljava/lang/String;
        //    60: iconst_m1      
        //    61: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //    64: astore          4
        //    66: aload           4
        //    68: arraylength    
        //    69: ifne            83
        //    72: ldc             "FirebaseMessaging"
        //    74: ldc             "Corrupted queue. Please check the queue contents and item separator provided"
        //    76: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    79: pop            
        //    80: goto            83
        //    83: aload           4
        //    85: arraylength    
        //    86: istore_2       
        //    87: iconst_0       
        //    88: istore_1       
        //    89: iload_1        
        //    90: iload_2        
        //    91: if_icmpge       121
        //    94: aload           4
        //    96: iload_1        
        //    97: aaload         
        //    98: astore          5
        //   100: aload           5
        //   102: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   105: ifne            137
        //   108: aload_0        
        //   109: getfield        com/google/firebase/messaging/a0.d:Ljava/util/ArrayDeque;
        //   112: aload           5
        //   114: invokevirtual   java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
        //   117: pop            
        //   118: goto            137
        //   121: aload_3        
        //   122: monitorexit    
        //   123: return         
        //   124: aload_3        
        //   125: monitorexit    
        //   126: return         
        //   127: aload_3        
        //   128: monitorexit    
        //   129: aload           4
        //   131: athrow         
        //   132: astore          4
        //   134: goto            127
        //   137: iload_1        
        //   138: iconst_1       
        //   139: iadd           
        //   140: istore_1       
        //   141: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      51     132    137    Any
        //  54     80     132    137    Any
        //  83     87     132    137    Any
        //  100    118    132    137    Any
        //  121    123    132    137    Any
        //  124    126    132    137    Any
        //  127    129    132    137    Any
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
    
    public String f() {
        synchronized (this.d) {
            return this.d.peek();
        }
    }
    
    public boolean g(final Object o) {
        synchronized (this.d) {
            return this.c(this.d.remove(o));
        }
    }
    
    public String h() {
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
    
    public final void i() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, this.h()).commit();
        }
    }
    
    public final void j() {
        this.e.execute(new Z(this));
    }
}
