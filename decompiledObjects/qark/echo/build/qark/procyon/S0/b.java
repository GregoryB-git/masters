// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S0;

import d0.q;
import d0.y;
import d0.w;
import java.util.Map;
import g0.M;
import g0.a;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class b implements x.b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final boolean s;
    public final int t;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final int o, final String p6, final String q, final String r, final boolean s, final int t) {
        a.a(t == -1 || t > 0);
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    public b(final Parcel parcel) {
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = M.T0(parcel);
        this.t = parcel.readInt();
    }
    
    public static b a(final Map p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "icy-br"
        //     3: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     8: checkcast       Ljava/util/List;
        //    11: astore          8
        //    13: iconst_1       
        //    14: istore          6
        //    16: iconst_m1      
        //    17: istore_3       
        //    18: aload           8
        //    20: ifnull          144
        //    23: aload           8
        //    25: iconst_0       
        //    26: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    31: checkcast       Ljava/lang/String;
        //    34: astore          8
        //    36: aload           8
        //    38: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    41: istore_1       
        //    42: iload_1        
        //    43: sipush          1000
        //    46: imul           
        //    47: istore_2       
        //    48: iload_2        
        //    49: ifle            57
        //    52: iconst_1       
        //    53: istore_1       
        //    54: goto            96
        //    57: new             Ljava/lang/StringBuilder;
        //    60: dup            
        //    61: invokespecial   java/lang/StringBuilder.<init>:()V
        //    64: astore          9
        //    66: aload           9
        //    68: ldc             "Invalid bitrate: "
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: pop            
        //    74: aload           9
        //    76: aload           8
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: pop            
        //    82: ldc             "IcyHeaders"
        //    84: aload           9
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //    92: iconst_0       
        //    93: istore_1       
        //    94: iconst_m1      
        //    95: istore_2       
        //    96: iload_2        
        //    97: istore          4
        //    99: goto            149
        //   102: iconst_m1      
        //   103: istore_2       
        //   104: new             Ljava/lang/StringBuilder;
        //   107: dup            
        //   108: invokespecial   java/lang/StringBuilder.<init>:()V
        //   111: astore          9
        //   113: aload           9
        //   115: ldc             "Invalid bitrate header: "
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: pop            
        //   121: aload           9
        //   123: aload           8
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: pop            
        //   129: ldc             "IcyHeaders"
        //   131: aload           9
        //   133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   136: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   139: iconst_0       
        //   140: istore_1       
        //   141: goto            96
        //   144: iconst_0       
        //   145: istore_1       
        //   146: iconst_m1      
        //   147: istore          4
        //   149: aload_0        
        //   150: ldc             "icy-genre"
        //   152: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   157: checkcast       Ljava/util/List;
        //   160: astore          8
        //   162: aconst_null    
        //   163: astore          11
        //   165: aload           8
        //   167: ifnull          188
        //   170: aload           8
        //   172: iconst_0       
        //   173: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   178: checkcast       Ljava/lang/String;
        //   181: astore          8
        //   183: iconst_1       
        //   184: istore_1       
        //   185: goto            191
        //   188: aconst_null    
        //   189: astore          8
        //   191: aload_0        
        //   192: ldc             "icy-name"
        //   194: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   199: checkcast       Ljava/util/List;
        //   202: astore          9
        //   204: aload           9
        //   206: ifnull          227
        //   209: aload           9
        //   211: iconst_0       
        //   212: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   217: checkcast       Ljava/lang/String;
        //   220: astore          9
        //   222: iconst_1       
        //   223: istore_1       
        //   224: goto            230
        //   227: aconst_null    
        //   228: astore          9
        //   230: aload_0        
        //   231: ldc             "icy-url"
        //   233: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   238: checkcast       Ljava/util/List;
        //   241: astore          10
        //   243: aload           10
        //   245: ifnull          266
        //   248: aload           10
        //   250: iconst_0       
        //   251: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   256: checkcast       Ljava/lang/String;
        //   259: astore          10
        //   261: iconst_1       
        //   262: istore_1       
        //   263: goto            269
        //   266: aconst_null    
        //   267: astore          10
        //   269: aload_0        
        //   270: ldc             "icy-pub"
        //   272: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   277: checkcast       Ljava/util/List;
        //   280: astore          12
        //   282: aload           12
        //   284: ifnull          310
        //   287: aload           12
        //   289: iconst_0       
        //   290: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   295: checkcast       Ljava/lang/String;
        //   298: ldc             "1"
        //   300: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   303: istore          7
        //   305: iconst_1       
        //   306: istore_1       
        //   307: goto            313
        //   310: iconst_0       
        //   311: istore          7
        //   313: aload_0        
        //   314: ldc             "icy-metaint"
        //   316: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   321: checkcast       Ljava/util/List;
        //   324: astore_0       
        //   325: iload_1        
        //   326: istore          5
        //   328: iload_3        
        //   329: istore_2       
        //   330: aload_0        
        //   331: ifnull          441
        //   334: aload_0        
        //   335: iconst_0       
        //   336: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   341: checkcast       Ljava/lang/String;
        //   344: astore_0       
        //   345: aload_0        
        //   346: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   349: istore_2       
        //   350: iload_2        
        //   351: ifle            362
        //   354: iload           6
        //   356: istore_1       
        //   357: iload_2        
        //   358: istore_3       
        //   359: goto            396
        //   362: new             Ljava/lang/StringBuilder;
        //   365: dup            
        //   366: invokespecial   java/lang/StringBuilder.<init>:()V
        //   369: astore          12
        //   371: aload           12
        //   373: ldc             "Invalid metadata interval: "
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: pop            
        //   379: aload           12
        //   381: aload_0        
        //   382: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   385: pop            
        //   386: ldc             "IcyHeaders"
        //   388: aload           12
        //   390: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   393: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   396: iload_1        
        //   397: istore          5
        //   399: iload_3        
        //   400: istore_2       
        //   401: goto            441
        //   404: new             Ljava/lang/StringBuilder;
        //   407: dup            
        //   408: invokespecial   java/lang/StringBuilder.<init>:()V
        //   411: astore          12
        //   413: aload           12
        //   415: ldc             "Invalid metadata interval: "
        //   417: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   420: pop            
        //   421: aload           12
        //   423: aload_0        
        //   424: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   427: pop            
        //   428: ldc             "IcyHeaders"
        //   430: aload           12
        //   432: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   435: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   438: iload_1        
        //   439: istore          5
        //   441: aload           11
        //   443: astore_0       
        //   444: iload           5
        //   446: ifeq            468
        //   449: new             LS0/b;
        //   452: dup            
        //   453: iload           4
        //   455: aload           8
        //   457: aload           9
        //   459: aload           10
        //   461: iload           7
        //   463: iload_2        
        //   464: invokespecial   S0/b.<init>:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
        //   467: astore_0       
        //   468: aload_0        
        //   469: areturn        
        //   470: astore          9
        //   472: goto            102
        //   475: astore          9
        //   477: goto            104
        //   480: astore          12
        //   482: iload_3        
        //   483: istore_2       
        //   484: goto            404
        //   487: astore          12
        //   489: goto            404
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  36     42     470    104    Ljava/lang/NumberFormatException;
        //  57     92     475    480    Ljava/lang/NumberFormatException;
        //  345    350    480    487    Ljava/lang/NumberFormatException;
        //  362    396    487    492    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 239 out of bounds for length 239
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
    public void D(final w.b b) {
        final String q = this.q;
        if (q != null) {
            b.l0(q);
        }
        final String p = this.p;
        if (p != null) {
            b.b0(p);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (b.class != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        return this.o == b.o && M.c(this.p, b.p) && M.c(this.q, b.q) && M.c(this.r, b.r) && this.s == b.s && this.t == b.t;
    }
    
    @Override
    public int hashCode() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IcyHeaders: name=\"");
        sb.append(this.q);
        sb.append("\", genre=\"");
        sb.append(this.p);
        sb.append("\", bitrate=");
        sb.append(this.o);
        sb.append(", metadataInterval=");
        sb.append(this.t);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        M.j1(parcel, this.s);
        parcel.writeInt(this.t);
    }
}
