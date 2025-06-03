// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.os.Looper;
import android.content.res.Resources$NotFoundException;
import android.os.Handler;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.util.WeakHashMap;

public abstract class h
{
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;
    
    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }
    
    public static Drawable a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return h.a.a(resources, n, resources$Theme);
    }
    
    public static Typeface b(final Context context, final int n, final TypedValue typedValue, final int n2, final b b) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, n, typedValue, n2, b, null, true, false);
    }
    
    public static Typeface c(final Context context, final int i, final TypedValue typedValue, final int n, final b b, final Handler handler, final boolean b2, final boolean b3) {
        final Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        final Typeface d = d(context, resources, typedValue, i, n, b, handler, b2, b3);
        if (d != null || b != null) {
            return d;
        }
        if (b3) {
            return d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new Resources$NotFoundException(sb.toString());
    }
    
    public static Typeface d(final Context p0, final Resources p1, final TypedValue p2, final int p3, final int p4, final b p5, final Handler p6, final boolean p7, final boolean p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/util/TypedValue.string:Ljava/lang/CharSequence;
        //     4: astore          10
        //     6: aload           10
        //     8: ifnull          283
        //    11: aload           10
        //    13: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    18: astore          10
        //    20: aload           10
        //    22: ldc             "res/"
        //    24: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    27: ifne            46
        //    30: aload           5
        //    32: ifnull          44
        //    35: aload           5
        //    37: bipush          -3
        //    39: aload           6
        //    41: invokevirtual   z/h$b.c:(ILandroid/os/Handler;)V
        //    44: aconst_null    
        //    45: areturn        
        //    46: aload_1        
        //    47: iload_3        
        //    48: aload           10
        //    50: aload_2        
        //    51: getfield        android/util/TypedValue.assetCookie:I
        //    54: iload           4
        //    56: invokestatic    A/h.f:(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
        //    59: astore          11
        //    61: aload           11
        //    63: ifnull          83
        //    66: aload           5
        //    68: ifnull          80
        //    71: aload           5
        //    73: aload           11
        //    75: aload           6
        //    77: invokevirtual   z/h$b.d:(Landroid/graphics/Typeface;Landroid/os/Handler;)V
        //    80: aload           11
        //    82: areturn        
        //    83: iload           8
        //    85: ifeq            90
        //    88: aconst_null    
        //    89: areturn        
        //    90: aload           10
        //    92: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    95: ldc             ".xml"
        //    97: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   100: ifeq            170
        //   103: aload_1        
        //   104: iload_3        
        //   105: invokevirtual   android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
        //   108: aload_1        
        //   109: invokestatic    z/e.b:(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Lz/e$b;
        //   112: astore          11
        //   114: aload           11
        //   116: ifnonnull       143
        //   119: ldc             "ResourcesCompat"
        //   121: ldc             "Failed to find font-family tag"
        //   123: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   126: pop            
        //   127: aload           5
        //   129: ifnull          357
        //   132: aload           5
        //   134: bipush          -3
        //   136: aload           6
        //   138: invokevirtual   z/h$b.c:(ILandroid/os/Handler;)V
        //   141: aconst_null    
        //   142: areturn        
        //   143: aload_2        
        //   144: getfield        android/util/TypedValue.assetCookie:I
        //   147: istore          9
        //   149: aload_0        
        //   150: aload           11
        //   152: aload_1        
        //   153: iload_3        
        //   154: aload           10
        //   156: iload           9
        //   158: iload           4
        //   160: aload           5
        //   162: aload           6
        //   164: iload           7
        //   166: invokestatic    A/h.c:(Landroid/content/Context;Lz/e$b;Landroid/content/res/Resources;ILjava/lang/String;IILz/h$b;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
        //   169: areturn        
        //   170: aload_0        
        //   171: aload_1        
        //   172: iload_3        
        //   173: aload           10
        //   175: aload_2        
        //   176: getfield        android/util/TypedValue.assetCookie:I
        //   179: iload           4
        //   181: invokestatic    A/h.d:(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
        //   184: astore_0       
        //   185: aload           5
        //   187: ifnull          213
        //   190: aload_0        
        //   191: ifnull          204
        //   194: aload           5
        //   196: aload_0        
        //   197: aload           6
        //   199: invokevirtual   z/h$b.d:(Landroid/graphics/Typeface;Landroid/os/Handler;)V
        //   202: aload_0        
        //   203: areturn        
        //   204: aload           5
        //   206: bipush          -3
        //   208: aload           6
        //   210: invokevirtual   z/h$b.c:(ILandroid/os/Handler;)V
        //   213: aload_0        
        //   214: areturn        
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: invokespecial   java/lang/StringBuilder.<init>:()V
        //   222: astore_1       
        //   223: ldc             "Failed to read xml resource "
        //   225: astore_2       
        //   226: aload_1        
        //   227: aload_2        
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: pop            
        //   232: aload_1        
        //   233: aload           10
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: pop            
        //   239: ldc             "ResourcesCompat"
        //   241: aload_1        
        //   242: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   245: aload_0        
        //   246: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   249: pop            
        //   250: goto            267
        //   253: new             Ljava/lang/StringBuilder;
        //   256: dup            
        //   257: invokespecial   java/lang/StringBuilder.<init>:()V
        //   260: astore_1       
        //   261: ldc             "Failed to parse xml resource "
        //   263: astore_2       
        //   264: goto            226
        //   267: aload           5
        //   269: ifnull          281
        //   272: aload           5
        //   274: bipush          -3
        //   276: aload           6
        //   278: invokevirtual   z/h$b.c:(ILandroid/os/Handler;)V
        //   281: aconst_null    
        //   282: areturn        
        //   283: new             Ljava/lang/StringBuilder;
        //   286: dup            
        //   287: invokespecial   java/lang/StringBuilder.<init>:()V
        //   290: astore_0       
        //   291: aload_0        
        //   292: ldc             "Resource \""
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: pop            
        //   298: aload_0        
        //   299: aload_1        
        //   300: iload_3        
        //   301: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: pop            
        //   308: aload_0        
        //   309: ldc             "\" ("
        //   311: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   314: pop            
        //   315: aload_0        
        //   316: iload_3        
        //   317: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   320: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   323: pop            
        //   324: aload_0        
        //   325: ldc             ") is not a Font: "
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   330: pop            
        //   331: aload_0        
        //   332: aload_2        
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   336: pop            
        //   337: new             Landroid/content/res/Resources$NotFoundException;
        //   340: dup            
        //   341: aload_0        
        //   342: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   345: invokespecial   android/content/res/Resources$NotFoundException.<init>:(Ljava/lang/String;)V
        //   348: athrow         
        //   349: astore_0       
        //   350: goto            215
        //   353: astore_0       
        //   354: goto            253
        //   357: aconst_null    
        //   358: areturn        
        //   359: astore_0       
        //   360: goto            215
        //   363: astore_0       
        //   364: goto            253
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  90     114    353    357    Lorg/xmlpull/v1/XmlPullParserException;
        //  90     114    349    353    Ljava/io/IOException;
        //  119    127    353    357    Lorg/xmlpull/v1/XmlPullParserException;
        //  119    127    349    353    Ljava/io/IOException;
        //  132    141    353    357    Lorg/xmlpull/v1/XmlPullParserException;
        //  132    141    349    353    Ljava/io/IOException;
        //  143    149    353    357    Lorg/xmlpull/v1/XmlPullParserException;
        //  143    149    349    353    Ljava/io/IOException;
        //  149    170    363    367    Lorg/xmlpull/v1/XmlPullParserException;
        //  149    170    359    363    Ljava/io/IOException;
        //  170    185    363    367    Lorg/xmlpull/v1/XmlPullParserException;
        //  170    185    359    363    Ljava/io/IOException;
        //  194    202    363    367    Lorg/xmlpull/v1/XmlPullParserException;
        //  194    202    359    363    Ljava/io/IOException;
        //  204    213    363    367    Lorg/xmlpull/v1/XmlPullParserException;
        //  204    213    359    363    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0170:
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
    
    public abstract static class a
    {
        public static Drawable a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getDrawable(n, resources$Theme);
        }
        
        public static Drawable b(final Resources resources, final int n, final int n2, final Resources$Theme resources$Theme) {
            return resources.getDrawableForDensity(n, n2, resources$Theme);
        }
    }
    
    public abstract static class b
    {
        public static Handler e(final Handler handler) {
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler(Looper.getMainLooper());
            }
            return handler2;
        }
        
        public final void c(final int n, final Handler handler) {
            e(handler).post((Runnable)new j(this, n));
        }
        
        public final void d(final Typeface typeface, final Handler handler) {
            e(handler).post((Runnable)new i(this, typeface));
        }
        
        public abstract void h(final int p0);
        
        public abstract void i(final Typeface p0);
    }
}
