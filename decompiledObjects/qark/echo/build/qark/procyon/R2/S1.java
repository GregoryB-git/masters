// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import E2.e;
import android.content.Context;
import java.math.BigInteger;
import java.util.Locale;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.s7;
import A2.n;
import com.google.android.gms.internal.measurement.n6;
import java.util.List;

public final class S1 extends f1
{
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public long i;
    public List j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public long p;
    public String q;
    
    public S1(final N2 n2, final long i) {
        super(n2);
        this.p = 0L;
        this.q = null;
        this.i = i;
    }
    
    private final String J() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            37
        //     6: aload_0        
        //     7: invokevirtual   R2/m3.f:()LR2/g;
        //    10: getstatic       R2/K.n0:LR2/P1;
        //    13: invokevirtual   R2/g.s:(LR2/P1;)Z
        //    16: ifeq            37
        //    19: aload_0        
        //    20: invokevirtual   R2/m3.j:()LR2/Y1;
        //    23: invokevirtual   R2/Y1.K:()LR2/a2;
        //    26: astore_1       
        //    27: ldc             "Disabled IID for tests."
        //    29: astore_2       
        //    30: aload_1        
        //    31: aload_2        
        //    32: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //    35: aconst_null    
        //    36: areturn        
        //    37: aload_0        
        //    38: invokevirtual   R2/m3.a:()Landroid/content/Context;
        //    41: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    44: ldc             "com.google.firebase.analytics.FirebaseAnalytics"
        //    46: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    49: astore_1       
        //    50: aload_1        
        //    51: ifnonnull       56
        //    54: aconst_null    
        //    55: areturn        
        //    56: aload_1        
        //    57: ldc             "getInstance"
        //    59: iconst_1       
        //    60: anewarray       Ljava/lang/Class;
        //    63: dup            
        //    64: iconst_0       
        //    65: ldc             Landroid/content/Context;.class
        //    67: aastore        
        //    68: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    71: aconst_null    
        //    72: iconst_1       
        //    73: anewarray       Ljava/lang/Object;
        //    76: dup            
        //    77: iconst_0       
        //    78: aload_0        
        //    79: invokevirtual   R2/m3.a:()Landroid/content/Context;
        //    82: aastore        
        //    83: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    86: astore_2       
        //    87: aload_2        
        //    88: ifnonnull       93
        //    91: aconst_null    
        //    92: areturn        
        //    93: aload_1        
        //    94: ldc             "getFirebaseInstanceId"
        //    96: iconst_0       
        //    97: anewarray       Ljava/lang/Class;
        //   100: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   103: aload_2        
        //   104: iconst_0       
        //   105: anewarray       Ljava/lang/Object;
        //   108: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   111: checkcast       Ljava/lang/String;
        //   114: astore_1       
        //   115: aload_1        
        //   116: areturn        
        //   117: aload_0        
        //   118: invokevirtual   R2/m3.j:()LR2/Y1;
        //   121: invokevirtual   R2/Y1.M:()LR2/a2;
        //   124: astore_1       
        //   125: ldc             "Failed to retrieve Firebase Instance Id"
        //   127: astore_2       
        //   128: goto            30
        //   131: aload_0        
        //   132: invokevirtual   R2/m3.j:()LR2/Y1;
        //   135: invokevirtual   R2/Y1.N:()LR2/a2;
        //   138: astore_1       
        //   139: ldc             "Failed to obtain Firebase Analytics instance"
        //   141: astore_2       
        //   142: goto            30
        //   145: astore_1       
        //   146: aconst_null    
        //   147: areturn        
        //   148: astore_1       
        //   149: goto            131
        //   152: astore_1       
        //   153: goto            117
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  37     50     145    148    Ljava/lang/ClassNotFoundException;
        //  56     87     148    145    Ljava/lang/Exception;
        //  93     115    152    131    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 85 out of bounds for length 85
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
    
    @Override
    public final boolean A() {
        return true;
    }
    
    public final W5 B(final String s) {
        this.n();
        final q3 j = this.i().J();
        String i;
        int b;
        if (n6.a() && this.f().s(K.S0)) {
            i = this.i().I().i();
            b = j.b();
        }
        else {
            i = "";
            b = 100;
        }
        final String f = this.F();
        final String g = this.G();
        this.v();
        final String d = this.d;
        final long n = this.D();
        this.v();
        A2.n.i(this.f);
        final String f2 = this.f;
        this.v();
        this.n();
        if (this.h == 0L) {
            this.h = super.a.L().A(this.a(), this.a().getPackageName());
        }
        final long h = this.h;
        final boolean p = super.a.p();
        final boolean r = this.i().r;
        this.n();
        String k;
        if (!super.a.p()) {
            k = null;
        }
        else {
            k = this.J();
        }
        final N2 a = super.a;
        final long a2 = a.F().e.a();
        long n2;
        if (a2 == 0L) {
            n2 = a.H;
        }
        else {
            n2 = Math.min(a.H, a2);
        }
        final int c = this.C();
        final boolean p2 = this.f().P();
        final l2 l = this.i();
        l.n();
        final boolean boolean1 = l.F().getBoolean("deferred_analytics_collection", false);
        final String e = this.E();
        final Boolean f3 = this.f().F("google_analytics_default_allow_ad_personalization_signals");
        Boolean value;
        if (f3 == null) {
            value = null;
        }
        else {
            value = (f3 ^ true);
        }
        final long m = this.i;
        final List j2 = this.j;
        final String v = j.v();
        if (this.k == null) {
            this.k = this.k().S0();
        }
        final String k2 = this.k;
        String o;
        if (s7.a() && this.f().s(K.x0)) {
            this.n();
            if (this.p != 0L) {
                final long a3 = this.b().a();
                final long p3 = this.p;
                if (this.o != null && a3 - p3 > 86400000L && this.q == null) {
                    this.I();
                }
            }
            if (this.o == null) {
                this.I();
            }
            o = this.o;
        }
        else {
            o = null;
        }
        final Boolean f4 = this.f().F("google_analytics_sgtm_upload_enabled");
        final boolean b2 = f4 != null && f4;
        final long z0 = this.k().z0(this.F());
        int y0;
        if (g7.a() && this.f().s(K.M0)) {
            this.k();
            y0 = S5.y0();
        }
        else {
            y0 = 0;
        }
        long i2;
        if (g7.a() && this.f().s(K.M0)) {
            i2 = this.k().I0();
        }
        else {
            i2 = 0L;
        }
        return new W5(f, g, d, n, f2, 82001L, h, s, p, r ^ true, k, 0L, n2, c, p2, boolean1, e, value, m, j2, null, v, k2, o, b2, z0, b, i, y0, i2);
    }
    
    public final int C() {
        this.v();
        return this.l;
    }
    
    public final int D() {
        this.v();
        return this.e;
    }
    
    public final String E() {
        this.v();
        return this.n;
    }
    
    public final String F() {
        this.v();
        A2.n.i(this.c);
        return this.c;
    }
    
    public final String G() {
        this.n();
        this.v();
        A2.n.i(this.m);
        return this.m;
    }
    
    public final List H() {
        return this.j;
    }
    
    public final void I() {
        this.n();
        String format;
        if (!this.i().J().l(q3.a.q)) {
            this.j().F().a("Analytics Storage consent is not granted");
            format = null;
        }
        else {
            final byte[] array = new byte[16];
            this.k().U0().nextBytes(array);
            format = String.format(Locale.US, "%032x", new BigInteger(1, array));
        }
        final a2 f = this.j().F();
        String s;
        if (format == null) {
            s = "null";
        }
        else {
            s = "not null";
        }
        f.a(String.format("Resetting session stitching token to %s", s));
        this.o = format;
        this.p = this.b().a();
    }
    
    public final boolean K(final String s) {
        final String q = this.q;
        final boolean b = q != null && !q.equals(s);
        this.q = s;
        return b;
    }
    
    @Override
    public final void y() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
