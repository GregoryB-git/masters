// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import F0.T;
import d0.z;
import d0.q;
import i0.k;
import i0.g;

public class j extends a
{
    public final int o;
    public final long p;
    public final y0.f q;
    public long r;
    public volatile boolean s;
    public boolean t;
    
    public j(final i0.g g, final k k, final q q, final int n, final Object o, final long n2, final long n3, final long n4, final long n5, final long n6, final int o2, final long p13, final y0.f q2) {
        super(g, k, q, n, o, n2, n3, n4, n5, n6);
        this.o = o2;
        this.p = p13;
        this.q = q2;
    }
    
    @Override
    public final void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   y0/a.j:()Ly0/c;
        //     4: astore          5
        //     6: aload_0        
        //     7: getfield        y0/j.r:J
        //    10: lconst_0       
        //    11: lcmp           
        //    12: ifne            103
        //    15: aload           5
        //    17: aload_0        
        //    18: getfield        y0/j.p:J
        //    21: invokevirtual   y0/c.c:(J)V
        //    24: aload_0        
        //    25: getfield        y0/j.q:Ly0/f;
        //    28: astore          6
        //    30: aload_0        
        //    31: aload           5
        //    33: invokevirtual   y0/j.l:(Ly0/c;)Ly0/f$b;
        //    36: astore          7
        //    38: aload_0        
        //    39: getfield        y0/a.k:J
        //    42: lstore_1       
        //    43: lload_1        
        //    44: ldc2_w          -9223372036854775807
        //    47: lcmp           
        //    48: ifne            58
        //    51: ldc2_w          -9223372036854775807
        //    54: lstore_1       
        //    55: goto            65
        //    58: lload_1        
        //    59: aload_0        
        //    60: getfield        y0/j.p:J
        //    63: lsub           
        //    64: lstore_1       
        //    65: aload_0        
        //    66: getfield        y0/a.l:J
        //    69: lstore_3       
        //    70: lload_3        
        //    71: ldc2_w          -9223372036854775807
        //    74: lcmp           
        //    75: ifne            85
        //    78: ldc2_w          -9223372036854775807
        //    81: lstore_3       
        //    82: goto            92
        //    85: lload_3        
        //    86: aload_0        
        //    87: getfield        y0/j.p:J
        //    90: lsub           
        //    91: lstore_3       
        //    92: aload           6
        //    94: aload           7
        //    96: lload_1        
        //    97: lload_3        
        //    98: invokeinterface y0/f.b:(Ly0/f$b;JJ)V
        //   103: aload_0        
        //   104: getfield        y0/e.b:Li0/k;
        //   107: aload_0        
        //   108: getfield        y0/j.r:J
        //   111: invokevirtual   i0/k.e:(J)Li0/k;
        //   114: astore          6
        //   116: aload_0        
        //   117: getfield        y0/e.i:Li0/x;
        //   120: astore          7
        //   122: new             LF0/j;
        //   125: dup            
        //   126: aload           7
        //   128: aload           6
        //   130: getfield        i0/k.g:J
        //   133: aload           7
        //   135: aload           6
        //   137: invokevirtual   i0/x.e:(Li0/k;)J
        //   140: invokespecial   F0/j.<init>:(Ld0/i;JJ)V
        //   143: astore          6
        //   145: aload_0        
        //   146: getfield        y0/j.s:Z
        //   149: ifne            169
        //   152: aload_0        
        //   153: getfield        y0/j.q:Ly0/f;
        //   156: aload           6
        //   158: invokeinterface y0/f.c:(LF0/s;)Z
        //   163: ifeq            169
        //   166: goto            145
        //   169: aload_0        
        //   170: aload           5
        //   172: invokevirtual   y0/j.m:(Ly0/c;)V
        //   175: aload_0        
        //   176: aload           6
        //   178: invokeinterface F0/s.p:()J
        //   183: aload_0        
        //   184: getfield        y0/e.b:Li0/k;
        //   187: getfield        i0/k.g:J
        //   190: lsub           
        //   191: putfield        y0/j.r:J
        //   194: aload_0        
        //   195: getfield        y0/e.i:Li0/x;
        //   198: invokestatic    i0/j.a:(Li0/g;)V
        //   201: aload_0        
        //   202: aload_0        
        //   203: getfield        y0/j.s:Z
        //   206: iconst_1       
        //   207: ixor           
        //   208: putfield        y0/j.t:Z
        //   211: return         
        //   212: astore          5
        //   214: goto            239
        //   217: aload_0        
        //   218: aload           6
        //   220: invokeinterface F0/s.p:()J
        //   225: aload_0        
        //   226: getfield        y0/e.b:Li0/k;
        //   229: getfield        i0/k.g:J
        //   232: lsub           
        //   233: putfield        y0/j.r:J
        //   236: aload           5
        //   238: athrow         
        //   239: aload_0        
        //   240: getfield        y0/e.i:Li0/x;
        //   243: invokestatic    i0/j.a:(Li0/g;)V
        //   246: aload           5
        //   248: athrow         
        //   249: astore          5
        //   251: goto            217
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  103    145    212    217    Any
        //  145    166    249    239    Any
        //  169    175    249    239    Any
        //  175    194    212    217    Any
        //  217    239    212    217    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0145:
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
    
    @Override
    public final void c() {
        this.s = true;
    }
    
    @Override
    public long g() {
        return super.j + this.o;
    }
    
    @Override
    public boolean h() {
        return this.t;
    }
    
    public y0.f.b l(final y0.c c) {
        return c;
    }
    
    public final void m(final y0.c c) {
        if (!z.p(super.d.m)) {
            return;
        }
        final q d = super.d;
        final int i = d.I;
        int j = 1;
        if ((i > 1 || d.J > 1) && i != -1) {
            if (d.J == -1) {
                return;
            }
            final T a = c.a(0, 4);
            final q d2 = super.d;
            final int n = d2.J * d2.I;
            final long n2 = (super.h - super.g) / n;
            while (j < n) {
                final long n3 = j;
                a.e(new g0.z(), 0);
                a.b(n3 * n2, 0, 0, 0, null);
                ++j;
            }
        }
    }
}
