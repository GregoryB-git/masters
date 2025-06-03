// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import Y0.f;
import F0.L;
import F0.t;
import java.util.Map;
import android.net.Uri;
import d0.i;
import g0.a;
import F0.s;
import F0.r;
import F0.x;

public final class d implements F
{
    public final x a;
    public r b;
    public s c;
    
    public d(final x a) {
        this.a = a;
    }
    
    @Override
    public void a(final long n, final long n2) {
        ((r)g0.a.e(this.b)).a(n, n2);
    }
    
    @Override
    public void b(final i p0, final Uri p1, final Map p2, final long p3, final long p4, final t p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: lload           4
        //     7: lload           6
        //     9: invokespecial   F0/j.<init>:(Ld0/i;JJ)V
        //    12: astore_1       
        //    13: aload_0        
        //    14: aload_1        
        //    15: putfield        x0/d.c:LF0/s;
        //    18: aload_0        
        //    19: getfield        x0/d.b:LF0/r;
        //    22: ifnull          26
        //    25: return         
        //    26: aload_0        
        //    27: getfield        x0/d.a:LF0/x;
        //    30: aload_2        
        //    31: aload_3        
        //    32: invokeinterface F0/x.b:(Landroid/net/Uri;Ljava/util/Map;)[LF0/r;
        //    37: astore_3       
        //    38: aload_3        
        //    39: arraylength    
        //    40: invokestatic    X2/v.S:(I)LX2/v$a;
        //    43: astore          13
        //    45: aload_3        
        //    46: arraylength    
        //    47: istore          9
        //    49: iconst_0       
        //    50: istore          12
        //    52: iload           9
        //    54: iconst_1       
        //    55: if_icmpne       68
        //    58: aload_0        
        //    59: aload_3        
        //    60: iconst_0       
        //    61: aaload         
        //    62: putfield        x0/d.b:LF0/r;
        //    65: goto            257
        //    68: aload_3        
        //    69: arraylength    
        //    70: istore          10
        //    72: iconst_0       
        //    73: istore          9
        //    75: iload           9
        //    77: iload           10
        //    79: if_icmpge       250
        //    82: aload_3        
        //    83: iload           9
        //    85: aaload         
        //    86: astore          14
        //    88: aload           14
        //    90: aload_1        
        //    91: invokeinterface F0/r.e:(LF0/s;)Z
        //    96: ifeq            122
        //    99: aload_0        
        //   100: aload           14
        //   102: putfield        x0/d.b:LF0/r;
        //   105: iconst_1       
        //   106: invokestatic    g0/a.f:(Z)V
        //   109: aload_1        
        //   110: invokeinterface F0/s.h:()V
        //   115: goto            250
        //   118: astore_2       
        //   119: goto            180
        //   122: aload           13
        //   124: aload           14
        //   126: invokeinterface F0/r.g:()Ljava/util/List;
        //   131: invokevirtual   X2/v$a.j:(Ljava/lang/Iterable;)LX2/v$a;
        //   134: pop            
        //   135: aload_0        
        //   136: getfield        x0/d.b:LF0/r;
        //   139: ifnonnull       163
        //   142: aload_1        
        //   143: invokeinterface F0/s.p:()J
        //   148: lload           4
        //   150: lcmp           
        //   151: ifne            157
        //   154: goto            163
        //   157: iconst_0       
        //   158: istore          11
        //   160: goto            166
        //   163: iconst_1       
        //   164: istore          11
        //   166: iload           11
        //   168: invokestatic    g0/a.f:(Z)V
        //   171: aload_1        
        //   172: invokeinterface F0/s.h:()V
        //   177: goto            241
        //   180: aload_0        
        //   181: getfield        x0/d.b:LF0/r;
        //   184: ifnonnull       203
        //   187: iload           12
        //   189: istore          11
        //   191: aload_1        
        //   192: invokeinterface F0/s.p:()J
        //   197: lload           4
        //   199: lcmp           
        //   200: ifne            206
        //   203: iconst_1       
        //   204: istore          11
        //   206: iload           11
        //   208: invokestatic    g0/a.f:(Z)V
        //   211: aload_1        
        //   212: invokeinterface F0/s.h:()V
        //   217: aload_2        
        //   218: athrow         
        //   219: aload_0        
        //   220: getfield        x0/d.b:LF0/r;
        //   223: ifnonnull       163
        //   226: aload_1        
        //   227: invokeinterface F0/s.p:()J
        //   232: lload           4
        //   234: lcmp           
        //   235: ifne            157
        //   238: goto            163
        //   241: iload           9
        //   243: iconst_1       
        //   244: iadd           
        //   245: istore          9
        //   247: goto            75
        //   250: aload_0        
        //   251: getfield        x0/d.b:LF0/r;
        //   254: ifnull          269
        //   257: aload_0        
        //   258: getfield        x0/d.b:LF0/r;
        //   261: aload           8
        //   263: invokeinterface F0/r.b:(LF0/t;)V
        //   268: return         
        //   269: new             Ljava/lang/StringBuilder;
        //   272: dup            
        //   273: invokespecial   java/lang/StringBuilder.<init>:()V
        //   276: astore_1       
        //   277: aload_1        
        //   278: ldc             "None of the available extractors ("
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: aload_1        
        //   285: ldc             ", "
        //   287: invokestatic    W2/h.g:(Ljava/lang/String;)LW2/h;
        //   290: aload_3        
        //   291: invokestatic    X2/v.V:([Ljava/lang/Object;)LX2/v;
        //   294: new             Lx0/c;
        //   297: dup            
        //   298: invokespecial   x0/c.<init>:()V
        //   301: invokestatic    X2/E.k:(Ljava/util/List;LW2/g;)Ljava/util/List;
        //   304: invokevirtual   W2/h.d:(Ljava/lang/Iterable;)Ljava/lang/String;
        //   307: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   310: pop            
        //   311: aload_1        
        //   312: ldc             ") could read the stream."
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: pop            
        //   318: new             Lx0/a0;
        //   321: dup            
        //   322: aload_1        
        //   323: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   326: aload_2        
        //   327: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   330: checkcast       Landroid/net/Uri;
        //   333: aload           13
        //   335: invokevirtual   X2/v$a.k:()LX2/v;
        //   338: invokespecial   x0/a0.<init>:(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V
        //   341: athrow         
        //   342: astore          14
        //   344: goto            219
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  88     105    342    241    Ljava/io/EOFException;
        //  88     105    118    219    Any
        //  122    135    342    241    Ljava/io/EOFException;
        //  122    135    118    219    Any
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
    
    @Override
    public int c(final L l) {
        return ((r)g0.a.e(this.b)).i((s)g0.a.e(this.c), l);
    }
    
    @Override
    public long d() {
        final s c = this.c;
        if (c != null) {
            return c.p();
        }
        return -1L;
    }
    
    @Override
    public void e() {
        final r b = this.b;
        if (b == null) {
            return;
        }
        final r d = b.d();
        if (d instanceof f) {
            ((f)d).l();
        }
    }
    
    @Override
    public void release() {
        final r b = this.b;
        if (b != null) {
            b.release();
            this.b = null;
        }
        this.c = null;
    }
}
