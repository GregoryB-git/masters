// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.util.regex.Matcher;
import g0.a;
import android.text.TextUtils;
import java.util.regex.Pattern;

public abstract class v
{
    public static final Pattern a;
    public static final Pattern b;
    
    static {
        a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }
    
    public static String a(final long lng, final long n) {
        if (lng == 0L && n == -1L) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(lng);
        sb.append("-");
        if (n != -1L) {
            sb.append(lng + n - 1L);
        }
        return sb.toString();
    }
    
    public static long b(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     4: ifne            57
        //     7: aload_0        
        //     8: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    11: lstore_2       
        //    12: goto            61
        //    15: new             Ljava/lang/StringBuilder;
        //    18: dup            
        //    19: invokespecial   java/lang/StringBuilder.<init>:()V
        //    22: astore          6
        //    24: aload           6
        //    26: ldc             "Unexpected Content-Length ["
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: pop            
        //    32: aload           6
        //    34: aload_0        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: pop            
        //    39: aload           6
        //    41: ldc             "]"
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: pop            
        //    47: ldc             "HttpUtil"
        //    49: aload           6
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokestatic    g0/o.c:(Ljava/lang/String;Ljava/lang/String;)V
        //    57: ldc2_w          -1
        //    60: lstore_2       
        //    61: aload_1        
        //    62: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    65: ifne            241
        //    68: getstatic       i0/v.a:Ljava/util/regex/Pattern;
        //    71: aload_1        
        //    72: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    75: astore          6
        //    77: aload           6
        //    79: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    82: ifeq            241
        //    85: aload           6
        //    87: iconst_2       
        //    88: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //    91: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //    94: checkcast       Ljava/lang/String;
        //    97: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   100: aload           6
        //   102: iconst_1       
        //   103: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   106: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   109: checkcast       Ljava/lang/String;
        //   112: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   115: lsub           
        //   116: lconst_1       
        //   117: ladd           
        //   118: lstore          4
        //   120: lload_2        
        //   121: lconst_0       
        //   122: lcmp           
        //   123: ifge            129
        //   126: lload           4
        //   128: lreturn        
        //   129: lload_2        
        //   130: lload           4
        //   132: lcmp           
        //   133: ifeq            241
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: astore          6
        //   145: aload           6
        //   147: ldc             "Inconsistent headers ["
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload           6
        //   155: aload_0        
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: pop            
        //   160: aload           6
        //   162: ldc             "] ["
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: pop            
        //   168: aload           6
        //   170: aload_1        
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: pop            
        //   175: aload           6
        //   177: ldc             "]"
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: pop            
        //   183: ldc             "HttpUtil"
        //   185: aload           6
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   193: lload_2        
        //   194: lload           4
        //   196: invokestatic    java/lang/Math.max:(JJ)J
        //   199: lstore          4
        //   201: lload           4
        //   203: lreturn        
        //   204: new             Ljava/lang/StringBuilder;
        //   207: dup            
        //   208: invokespecial   java/lang/StringBuilder.<init>:()V
        //   211: astore_0       
        //   212: aload_0        
        //   213: ldc             "Unexpected Content-Range ["
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: pop            
        //   219: aload_0        
        //   220: aload_1        
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   224: pop            
        //   225: aload_0        
        //   226: ldc             "]"
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: pop            
        //   232: ldc             "HttpUtil"
        //   234: aload_0        
        //   235: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   238: invokestatic    g0/o.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   241: lload_2        
        //   242: lreturn        
        //   243: astore          6
        //   245: goto            15
        //   248: astore_0       
        //   249: goto            204
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      12     243    57     Ljava/lang/NumberFormatException;
        //  85     120    248    241    Ljava/lang/NumberFormatException;
        //  136    201    248    241    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0129:
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
    
    public static long c(final String input) {
        final boolean empty = TextUtils.isEmpty((CharSequence)input);
        long long1 = -1L;
        if (empty) {
            return -1L;
        }
        final Matcher matcher = v.b.matcher(input);
        if (matcher.matches()) {
            long1 = Long.parseLong((String)g0.a.e(matcher.group(1)));
        }
        return long1;
    }
}
