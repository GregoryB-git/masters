// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import java.util.Collection;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.CancellationSignal;
import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.Signature;
import java.util.Comparator;

public abstract class d
{
    public static final Comparator a;
    
    static {
        a = new c();
    }
    
    public static List b(final Signature[] array) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i].toByteArray());
        }
        return list;
    }
    
    public static boolean c(final List list, final List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static List d(final e e, final Resources resources) {
        if (e.b() != null) {
            return e.b();
        }
        return z.e.c(resources, e.c());
    }
    
    public static g.a e(final Context context, final e e, final CancellationSignal cancellationSignal) {
        final ProviderInfo f = f(context.getPackageManager(), e, context.getResources());
        if (f == null) {
            return g.a.a(1, null);
        }
        return g.a.a(0, h(context, e, f.authority, cancellationSignal));
    }
    
    public static ProviderInfo f(final PackageManager packageManager, final e e, final Resources resources) {
        final String e2 = e.e();
        int i = 0;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e2, 0);
        if (resolveContentProvider == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(e2);
            throw new PackageManager$NameNotFoundException(sb.toString());
        }
        if (resolveContentProvider.packageName.equals(e.f())) {
            final List b = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort((List<Object>)b, d.a);
            for (List d = d(e, resources); i < d.size(); ++i) {
                final ArrayList list = new ArrayList<Object>(d.get(i));
                Collections.sort((List<E>)list, d.a);
                if (c(b, list)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Found content provider ");
        sb2.append(e2);
        sb2.append(", but package was not ");
        sb2.append(e.f());
        throw new PackageManager$NameNotFoundException(sb2.toString());
    }
    
    public static g.b[] h(final Context p0, final e p1, final String p2, final CancellationSignal p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          14
        //     9: new             Landroid/net/Uri$Builder;
        //    12: dup            
        //    13: invokespecial   android/net/Uri$Builder.<init>:()V
        //    16: ldc             "content"
        //    18: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    21: aload_2        
        //    22: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    25: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    28: astore          15
        //    30: new             Landroid/net/Uri$Builder;
        //    33: dup            
        //    34: invokespecial   android/net/Uri$Builder.<init>:()V
        //    37: ldc             "content"
        //    39: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    42: aload_2        
        //    43: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    46: ldc             "file"
        //    48: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    51: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    54: astore          16
        //    56: aconst_null    
        //    57: astore_2       
        //    58: aload_0        
        //    59: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    62: astore_0       
        //    63: aload_1        
        //    64: invokevirtual   F/e.g:()Ljava/lang/String;
        //    67: astore_1       
        //    68: aload_0        
        //    69: aload           15
        //    71: bipush          7
        //    73: anewarray       Ljava/lang/String;
        //    76: dup            
        //    77: iconst_0       
        //    78: ldc             "_id"
        //    80: aastore        
        //    81: dup            
        //    82: iconst_1       
        //    83: ldc             "file_id"
        //    85: aastore        
        //    86: dup            
        //    87: iconst_2       
        //    88: ldc             "font_ttc_index"
        //    90: aastore        
        //    91: dup            
        //    92: iconst_3       
        //    93: ldc             "font_variation_settings"
        //    95: aastore        
        //    96: dup            
        //    97: iconst_4       
        //    98: ldc             "font_weight"
        //   100: aastore        
        //   101: dup            
        //   102: iconst_5       
        //   103: ldc             "font_italic"
        //   105: aastore        
        //   106: dup            
        //   107: bipush          6
        //   109: ldc             "result_code"
        //   111: aastore        
        //   112: ldc             "query = ?"
        //   114: iconst_1       
        //   115: anewarray       Ljava/lang/String;
        //   118: dup            
        //   119: iconst_0       
        //   120: aload_1        
        //   121: aastore        
        //   122: aconst_null    
        //   123: aload_3        
        //   124: invokestatic    F/d$a.a:(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Landroid/database/Cursor;
        //   127: astore_1       
        //   128: aload           14
        //   130: astore_0       
        //   131: aload_1        
        //   132: ifnull          364
        //   135: aload           14
        //   137: astore_0       
        //   138: aload_1        
        //   139: invokeinterface android/database/Cursor.getCount:()I
        //   144: ifle            364
        //   147: aload_1        
        //   148: ldc             "result_code"
        //   150: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   155: istore          7
        //   157: new             Ljava/util/ArrayList;
        //   160: dup            
        //   161: invokespecial   java/util/ArrayList.<init>:()V
        //   164: astore_2       
        //   165: aload_1        
        //   166: ldc             "_id"
        //   168: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   173: istore          8
        //   175: aload_1        
        //   176: ldc             "file_id"
        //   178: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   183: istore          9
        //   185: aload_1        
        //   186: ldc             "font_ttc_index"
        //   188: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   193: istore          10
        //   195: aload_1        
        //   196: ldc             "font_weight"
        //   198: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   203: istore          11
        //   205: aload_1        
        //   206: ldc             "font_italic"
        //   208: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   213: istore          12
        //   215: aload_2        
        //   216: astore_0       
        //   217: aload_1        
        //   218: invokeinterface android/database/Cursor.moveToNext:()Z
        //   223: ifeq            364
        //   226: iload           7
        //   228: iconst_m1      
        //   229: if_icmpeq       405
        //   232: aload_1        
        //   233: iload           7
        //   235: invokeinterface android/database/Cursor.getInt:(I)I
        //   240: istore          4
        //   242: goto            245
        //   245: iload           10
        //   247: iconst_m1      
        //   248: if_icmpeq       411
        //   251: aload_1        
        //   252: iload           10
        //   254: invokeinterface android/database/Cursor.getInt:(I)I
        //   259: istore          5
        //   261: goto            264
        //   264: iload           9
        //   266: iconst_m1      
        //   267: if_icmpne       287
        //   270: aload           15
        //   272: aload_1        
        //   273: iload           8
        //   275: invokeinterface android/database/Cursor.getLong:(I)J
        //   280: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   283: astore_0       
        //   284: goto            301
        //   287: aload           16
        //   289: aload_1        
        //   290: iload           9
        //   292: invokeinterface android/database/Cursor.getLong:(I)J
        //   297: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   300: astore_0       
        //   301: iload           11
        //   303: iconst_m1      
        //   304: if_icmpeq       417
        //   307: aload_1        
        //   308: iload           11
        //   310: invokeinterface android/database/Cursor.getInt:(I)I
        //   315: istore          6
        //   317: goto            320
        //   320: iload           12
        //   322: iconst_m1      
        //   323: if_icmpeq       425
        //   326: aload_1        
        //   327: iload           12
        //   329: invokeinterface android/database/Cursor.getInt:(I)I
        //   334: iconst_1       
        //   335: if_icmpne       425
        //   338: iconst_1       
        //   339: istore          13
        //   341: goto            344
        //   344: aload_2        
        //   345: aload_0        
        //   346: iload           5
        //   348: iload           6
        //   350: iload           13
        //   352: iload           4
        //   354: invokestatic    F/g$b.a:(Landroid/net/Uri;IIZI)LF/g$b;
        //   357: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   360: pop            
        //   361: goto            215
        //   364: aload_1        
        //   365: ifnull          374
        //   368: aload_1        
        //   369: invokeinterface android/database/Cursor.close:()V
        //   374: aload_0        
        //   375: iconst_0       
        //   376: anewarray       LF/g$b;
        //   379: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   382: checkcast       [LF/g$b;
        //   385: areturn        
        //   386: astore_0       
        //   387: aload_2        
        //   388: astore_1       
        //   389: aload_1        
        //   390: ifnull          399
        //   393: aload_1        
        //   394: invokeinterface android/database/Cursor.close:()V
        //   399: aload_0        
        //   400: athrow         
        //   401: astore_0       
        //   402: goto            389
        //   405: iconst_0       
        //   406: istore          4
        //   408: goto            245
        //   411: iconst_0       
        //   412: istore          5
        //   414: goto            264
        //   417: sipush          400
        //   420: istore          6
        //   422: goto            320
        //   425: iconst_0       
        //   426: istore          13
        //   428: goto            344
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  58     128    386    389    Any
        //  138    215    401    405    Any
        //  217    226    401    405    Any
        //  232    242    401    405    Any
        //  251    261    401    405    Any
        //  270    284    401    405    Any
        //  287    301    401    405    Any
        //  307    317    401    405    Any
        //  326    338    401    405    Any
        //  344    361    401    405    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0215:
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
        public static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final Object o) {
            return contentResolver.query(uri, array, s, array2, s2, (CancellationSignal)o);
        }
    }
}
