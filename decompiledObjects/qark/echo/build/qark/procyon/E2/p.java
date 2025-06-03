// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import G2.d;
import android.content.Context;
import android.util.Log;
import android.os.WorkSource;
import java.lang.reflect.Method;

public abstract class p
{
    public static final int a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: putstatic       E2/p.a:I
        //     6: aconst_null    
        //     7: astore_1       
        //     8: aconst_null    
        //     9: astore_2       
        //    10: ldc             Landroid/os/WorkSource;.class
        //    12: ldc             "add"
        //    14: iconst_1       
        //    15: anewarray       Ljava/lang/Class;
        //    18: dup            
        //    19: iconst_0       
        //    20: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    23: aastore        
        //    24: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    27: astore_0       
        //    28: goto            33
        //    31: aconst_null    
        //    32: astore_0       
        //    33: aload_0        
        //    34: putstatic       E2/p.b:Ljava/lang/reflect/Method;
        //    37: invokestatic    E2/l.c:()Z
        //    40: ifeq            69
        //    43: ldc             Landroid/os/WorkSource;.class
        //    45: ldc             "add"
        //    47: iconst_2       
        //    48: anewarray       Ljava/lang/Class;
        //    51: dup            
        //    52: iconst_0       
        //    53: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    56: aastore        
        //    57: dup            
        //    58: iconst_1       
        //    59: ldc             Ljava/lang/String;.class
        //    61: aastore        
        //    62: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    65: astore_0       
        //    66: goto            71
        //    69: aconst_null    
        //    70: astore_0       
        //    71: aload_0        
        //    72: putstatic       E2/p.c:Ljava/lang/reflect/Method;
        //    75: ldc             Landroid/os/WorkSource;.class
        //    77: ldc             "size"
        //    79: iconst_0       
        //    80: anewarray       Ljava/lang/Class;
        //    83: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    86: astore_0       
        //    87: goto            92
        //    90: aconst_null    
        //    91: astore_0       
        //    92: aload_0        
        //    93: putstatic       E2/p.d:Ljava/lang/reflect/Method;
        //    96: ldc             Landroid/os/WorkSource;.class
        //    98: ldc             "get"
        //   100: iconst_1       
        //   101: anewarray       Ljava/lang/Class;
        //   104: dup            
        //   105: iconst_0       
        //   106: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   109: aastore        
        //   110: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   113: astore_0       
        //   114: goto            119
        //   117: aconst_null    
        //   118: astore_0       
        //   119: aload_0        
        //   120: putstatic       E2/p.e:Ljava/lang/reflect/Method;
        //   123: invokestatic    E2/l.c:()Z
        //   126: ifeq            150
        //   129: ldc             Landroid/os/WorkSource;.class
        //   131: ldc             "getName"
        //   133: iconst_1       
        //   134: anewarray       Ljava/lang/Class;
        //   137: dup            
        //   138: iconst_0       
        //   139: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   142: aastore        
        //   143: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   146: astore_0       
        //   147: goto            152
        //   150: aconst_null    
        //   151: astore_0       
        //   152: aload_0        
        //   153: putstatic       E2/p.f:Ljava/lang/reflect/Method;
        //   156: invokestatic    E2/l.i:()Z
        //   159: ifeq            187
        //   162: ldc             Landroid/os/WorkSource;.class
        //   164: ldc             "createWorkChain"
        //   166: iconst_0       
        //   167: anewarray       Ljava/lang/Class;
        //   170: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   173: astore_0       
        //   174: goto            189
        //   177: astore_0       
        //   178: ldc             "WorkSourceUtil"
        //   180: ldc             "Missing WorkChain API createWorkChain"
        //   182: aload_0        
        //   183: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   186: pop            
        //   187: aconst_null    
        //   188: astore_0       
        //   189: aload_0        
        //   190: putstatic       E2/p.g:Ljava/lang/reflect/Method;
        //   193: invokestatic    E2/l.i:()Z
        //   196: ifeq            238
        //   199: ldc             "android.os.WorkSource$WorkChain"
        //   201: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   204: ldc             "addNode"
        //   206: iconst_2       
        //   207: anewarray       Ljava/lang/Class;
        //   210: dup            
        //   211: iconst_0       
        //   212: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   215: aastore        
        //   216: dup            
        //   217: iconst_1       
        //   218: ldc             Ljava/lang/String;.class
        //   220: aastore        
        //   221: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   224: astore_0       
        //   225: goto            240
        //   228: astore_0       
        //   229: ldc             "WorkSourceUtil"
        //   231: ldc             "Missing WorkChain class"
        //   233: aload_0        
        //   234: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   237: pop            
        //   238: aconst_null    
        //   239: astore_0       
        //   240: aload_0        
        //   241: putstatic       E2/p.h:Ljava/lang/reflect/Method;
        //   244: aload_2        
        //   245: astore_0       
        //   246: invokestatic    E2/l.i:()Z
        //   249: ifeq            275
        //   252: aload_1        
        //   253: astore_0       
        //   254: ldc             Landroid/os/WorkSource;.class
        //   256: ldc             "isEmpty"
        //   258: iconst_0       
        //   259: anewarray       Ljava/lang/Class;
        //   262: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   265: astore_1       
        //   266: aload_1        
        //   267: astore_0       
        //   268: aload_1        
        //   269: iconst_1       
        //   270: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   273: aload_1        
        //   274: astore_0       
        //   275: aload_0        
        //   276: putstatic       E2/p.i:Ljava/lang/reflect/Method;
        //   279: return         
        //   280: astore_0       
        //   281: goto            31
        //   284: astore_0       
        //   285: goto            69
        //   288: astore_0       
        //   289: goto            90
        //   292: astore_0       
        //   293: goto            117
        //   296: astore_0       
        //   297: goto            150
        //   300: astore_1       
        //   301: goto            275
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     28     280    33     Ljava/lang/Exception;
        //  43     66     284    288    Ljava/lang/Exception;
        //  75     87     288    92     Ljava/lang/Exception;
        //  96     114    292    119    Ljava/lang/Exception;
        //  129    147    296    300    Ljava/lang/Exception;
        //  162    174    177    187    Ljava/lang/Exception;
        //  199    225    228    238    Ljava/lang/Exception;
        //  254    266    300    304    Ljava/lang/Exception;
        //  268    273    300    304    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 166 out of bounds for length 166
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
    
    public static void a(final WorkSource workSource, final int n, final String s) {
        final Method c = p.c;
        if (c != null) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "";
            }
            try {
                c.invoke(workSource, n, s2);
                return;
            }
            catch (Exception ex) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex);
                return;
            }
        }
        final Method b = p.b;
        if (b != null) {
            try {
                b.invoke(workSource, n);
            }
            catch (Exception ex2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex2);
            }
        }
    }
    
    public static WorkSource b(final Context context, final String str) {
        Label_0072: {
            if (context == null || context.getPackageManager() == null || str == null) {
                break Label_0072;
            }
        Label_0066_Outer:
            while (true) {
                while (true) {
                    try {
                        final ApplicationInfo c = G2.d.a(context).c(str, 0);
                        while (true) {
                            if (c == null) {
                                final String s = "Could not get applicationInfo from package: ";
                                Log.e("WorkSourceUtil", s.concat(str));
                                return null;
                            }
                            final int uid = c.uid;
                            final WorkSource workSource = new WorkSource();
                            a(workSource, uid, str);
                            return workSource;
                            final String s = "Could not find package: ";
                            continue Label_0066_Outer;
                        }
                        return null;
                    }
                    catch (PackageManager$NameNotFoundException ex) {}
                    continue;
                }
            }
        }
    }
    
    public static boolean c(final Context context) {
        return context != null && context.getPackageManager() != null && G2.d.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
}
