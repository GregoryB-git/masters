// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import p6.M;
import p6.l;
import kotlin.jvm.internal.Intrinsics;
import u.b;
import p6.m;
import X5.g;
import p6.A;
import p6.F;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import X5.d;
import Z5.e;
import p6.U;

public final class j extends U implements e, d
{
    public static final AtomicReferenceFieldUpdater v;
    private volatile Object _reusableCancellableContinuation;
    public final F r;
    public final d s;
    public Object t;
    public final Object u;
    
    static {
        v = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    }
    
    public j(final F r, final d s) {
        super(-1);
        this.r = r;
        this.s = s;
        this.t = k.a();
        this.u = J.b(this.getContext());
    }
    
    @Override
    public void b(final Object o, final Throwable t) {
        if (o instanceof A) {
            ((A)o).b.invoke(t);
        }
    }
    
    @Override
    public d c() {
        return this;
    }
    
    @Override
    public e getCallerFrame() {
        final d s = this.s;
        if (s instanceof e) {
            return (e)s;
        }
        return null;
    }
    
    @Override
    public g getContext() {
        return this.s.getContext();
    }
    
    @Override
    public Object i() {
        final Object t = this.t;
        this.t = k.a();
        return t;
    }
    
    public final void k() {
        while (j.v.get(this) == k.b) {}
    }
    
    public final m l() {
        final AtomicReferenceFieldUpdater v = j.v;
        while (true) {
            final m value = v.get(this);
            if (value == null) {
                j.v.set(this, k.b);
                return null;
            }
            if (value instanceof m) {
                if (b.a(j.v, this, value, k.b)) {
                    return value;
                }
                continue;
            }
            else {
                if (value == k.b) {
                    continue;
                }
                if (value instanceof Throwable) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(value);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
    }
    
    public final m m() {
        final m value = j.v.get(this);
        if (value instanceof m) {
            return value;
        }
        return null;
    }
    
    public final boolean n() {
        return j.v.get(this) != null;
    }
    
    public final boolean q(final Throwable t) {
        final AtomicReferenceFieldUpdater v = j.v;
        while (true) {
            final Object value = v.get(this);
            final u6.F b = k.b;
            if (Intrinsics.a(value, b)) {
                if (u.b.a(j.v, this, b, t)) {
                    return true;
                }
                continue;
            }
            else {
                if (value instanceof Throwable) {
                    return true;
                }
                if (u.b.a(j.v, this, value, null)) {
                    return false;
                }
                continue;
            }
        }
    }
    
    public final void r() {
        this.k();
        final m m = this.m();
        if (m != null) {
            m.r();
        }
    }
    
    @Override
    public void resumeWith(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        u6/j.s:LX5/d;
        //     4: invokeinterface X5/d.getContext:()LX5/g;
        //     9: astore_3       
        //    10: aload_1        
        //    11: aconst_null    
        //    12: iconst_1       
        //    13: aconst_null    
        //    14: invokestatic    p6/D.d:(Ljava/lang/Object;Lg6/l;ILjava/lang/Object;)Ljava/lang/Object;
        //    17: astore          4
        //    19: aload_0        
        //    20: getfield        u6/j.r:Lp6/F;
        //    23: aload_3        
        //    24: invokevirtual   p6/F.F:(LX5/g;)Z
        //    27: ifeq            51
        //    30: aload_0        
        //    31: aload           4
        //    33: putfield        u6/j.t:Ljava/lang/Object;
        //    36: aload_0        
        //    37: iconst_0       
        //    38: putfield        p6/U.q:I
        //    41: aload_0        
        //    42: getfield        u6/j.r:Lp6/F;
        //    45: aload_3        
        //    46: aload_0        
        //    47: invokevirtual   p6/F.E:(LX5/g;Ljava/lang/Runnable;)V
        //    50: return         
        //    51: getstatic       p6/L0.a:Lp6/L0;
        //    54: invokevirtual   p6/L0.b:()Lp6/a0;
        //    57: astore_3       
        //    58: aload_3        
        //    59: invokevirtual   p6/a0.O:()Z
        //    62: ifeq            82
        //    65: aload_0        
        //    66: aload           4
        //    68: putfield        u6/j.t:Ljava/lang/Object;
        //    71: aload_0        
        //    72: iconst_0       
        //    73: putfield        p6/U.q:I
        //    76: aload_3        
        //    77: aload_0        
        //    78: invokevirtual   p6/a0.K:(Lp6/U;)V
        //    81: return         
        //    82: aload_3        
        //    83: iconst_1       
        //    84: invokevirtual   p6/a0.M:(Z)V
        //    87: aload_0        
        //    88: invokevirtual   u6/j.getContext:()LX5/g;
        //    91: astore          4
        //    93: aload           4
        //    95: aload_0        
        //    96: getfield        u6/j.u:Ljava/lang/Object;
        //    99: invokestatic    u6/J.c:(LX5/g;Ljava/lang/Object;)Ljava/lang/Object;
        //   102: astore          5
        //   104: aload_0        
        //   105: getfield        u6/j.s:LX5/d;
        //   108: aload_1        
        //   109: invokeinterface X5/d.resumeWith:(Ljava/lang/Object;)V
        //   114: getstatic       V5/t.a:LV5/t;
        //   117: astore_1       
        //   118: aload           4
        //   120: aload           5
        //   122: invokestatic    u6/J.a:(LX5/g;Ljava/lang/Object;)V
        //   125: aload_3        
        //   126: invokevirtual   p6/a0.R:()Z
        //   129: istore_2       
        //   130: iload_2        
        //   131: ifne            125
        //   134: aload_3        
        //   135: iconst_1       
        //   136: invokevirtual   p6/a0.H:(Z)V
        //   139: return         
        //   140: astore_1       
        //   141: goto            154
        //   144: astore_1       
        //   145: aload           4
        //   147: aload           5
        //   149: invokestatic    u6/J.a:(LX5/g;Ljava/lang/Object;)V
        //   152: aload_1        
        //   153: athrow         
        //   154: aload_0        
        //   155: aload_1        
        //   156: aconst_null    
        //   157: invokevirtual   p6/U.h:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   160: goto            134
        //   163: astore_1       
        //   164: aload_3        
        //   165: iconst_1       
        //   166: invokevirtual   p6/a0.H:(Z)V
        //   169: aload_1        
        //   170: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  87     104    140    171    Any
        //  104    118    144    154    Any
        //  118    125    140    171    Any
        //  125    130    140    171    Any
        //  145    154    140    171    Any
        //  154    160    163    171    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0125:
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
    
    public final Throwable s(final l l) {
        final AtomicReferenceFieldUpdater v = j.v;
        u6.F b;
        do {
            final u6.F value = v.get(this);
            b = k.b;
            if (value == b) {
                continue;
            }
            if (!(value instanceof Throwable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(value);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (u.b.a(j.v, this, value, null)) {
                return (Throwable)value;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } while (!u.b.a(j.v, this, b, l));
        return null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.r);
        sb.append(", ");
        sb.append(M.c(this.s));
        sb.append(']');
        return sb.toString();
    }
}
