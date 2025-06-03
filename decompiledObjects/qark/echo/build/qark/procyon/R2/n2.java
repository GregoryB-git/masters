// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Iterator;
import org.json.JSONException;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.g7;
import org.json.JSONObject;
import org.json.JSONArray;
import android.content.SharedPreferences$Editor;
import A2.n;
import android.os.Bundle;

public final class n2
{
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ l2 d;
    
    public n2(final l2 d, final String a, final Bundle bundle) {
        this.d = d;
        n.e(a);
        this.a = a;
        this.b = new Bundle();
    }
    
    public final Bundle a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        R2/n2.c:Landroid/os/Bundle;
        //     4: ifnonnull       540
        //     7: aload_0        
        //     8: getfield        R2/n2.d:LR2/l2;
        //    11: invokevirtual   R2/l2.F:()Landroid/content/SharedPreferences;
        //    14: aload_0        
        //    15: getfield        R2/n2.a:Ljava/lang/String;
        //    18: aconst_null    
        //    19: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    24: astore          6
        //    26: aload           6
        //    28: ifnull          525
        //    31: new             Landroid/os/Bundle;
        //    34: dup            
        //    35: invokespecial   android/os/Bundle.<init>:()V
        //    38: astore          5
        //    40: new             Lorg/json/JSONArray;
        //    43: dup            
        //    44: aload           6
        //    46: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //    49: astore          6
        //    51: iconst_0       
        //    52: istore_2       
        //    53: aload           6
        //    55: invokevirtual   org/json/JSONArray.length:()I
        //    58: istore_1       
        //    59: iload_2        
        //    60: iload_1        
        //    61: if_icmpge       501
        //    64: aload           6
        //    66: iload_2        
        //    67: invokevirtual   org/json/JSONArray.getJSONObject:(I)Lorg/json/JSONObject;
        //    70: astore          8
        //    72: aload           8
        //    74: ldc             "n"
        //    76: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    79: astore          7
        //    81: aload           8
        //    83: ldc             "t"
        //    85: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    88: astore          9
        //    90: aload           9
        //    92: invokevirtual   java/lang/String.hashCode:()I
        //    95: istore_1       
        //    96: iload_1        
        //    97: bipush          100
        //    99: if_icmpeq       191
        //   102: iload_1        
        //   103: bipush          108
        //   105: if_icmpeq       176
        //   108: iload_1        
        //   109: bipush          115
        //   111: if_icmpeq       161
        //   114: iload_1        
        //   115: sipush          3352
        //   118: if_icmpeq       146
        //   121: iload_1        
        //   122: sipush          3445
        //   125: if_icmpeq       131
        //   128: goto            210
        //   131: aload           9
        //   133: ldc             "la"
        //   135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   138: ifeq            210
        //   141: iconst_4       
        //   142: istore_1       
        //   143: goto            212
        //   146: aload           9
        //   148: ldc             "ia"
        //   150: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   153: ifeq            210
        //   156: iconst_3       
        //   157: istore_1       
        //   158: goto            212
        //   161: aload           9
        //   163: ldc             "s"
        //   165: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   168: ifeq            210
        //   171: iconst_0       
        //   172: istore_1       
        //   173: goto            212
        //   176: aload           9
        //   178: ldc             "l"
        //   180: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   183: ifeq            210
        //   186: iconst_2       
        //   187: istore_1       
        //   188: goto            212
        //   191: aload           9
        //   193: ldc             "d"
        //   195: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   198: istore          4
        //   200: iload           4
        //   202: ifeq            210
        //   205: iconst_1       
        //   206: istore_1       
        //   207: goto            212
        //   210: iconst_m1      
        //   211: istore_1       
        //   212: iload_1        
        //   213: ifeq            466
        //   216: iload_1        
        //   217: iconst_1       
        //   218: if_icmpeq       446
        //   221: iload_1        
        //   222: iconst_2       
        //   223: if_icmpeq       426
        //   226: iload_1        
        //   227: iconst_3       
        //   228: if_icmpeq       341
        //   231: iload_1        
        //   232: iconst_4       
        //   233: if_icmpeq       256
        //   236: aload_0        
        //   237: getfield        R2/n2.d:LR2/l2;
        //   240: invokevirtual   R2/m3.j:()LR2/Y1;
        //   243: invokevirtual   R2/Y1.G:()LR2/a2;
        //   246: ldc             "Unrecognized persisted bundle type. Type"
        //   248: aload           9
        //   250: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   253: goto            555
        //   256: invokestatic    com/google/android/gms/internal/measurement/g7.a:()Z
        //   259: ifeq            555
        //   262: aload_0        
        //   263: getfield        R2/n2.d:LR2/l2;
        //   266: invokevirtual   R2/m3.f:()LR2/g;
        //   269: getstatic       R2/K.M0:LR2/P1;
        //   272: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   275: ifeq            555
        //   278: new             Lorg/json/JSONArray;
        //   281: dup            
        //   282: aload           8
        //   284: ldc             "v"
        //   286: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   289: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   292: astore          8
        //   294: aload           8
        //   296: invokevirtual   org/json/JSONArray.length:()I
        //   299: istore_3       
        //   300: iload_3        
        //   301: newarray        J
        //   303: astore          9
        //   305: iconst_0       
        //   306: istore_1       
        //   307: iload_1        
        //   308: iload_3        
        //   309: if_icmpge       329
        //   312: aload           9
        //   314: iload_1        
        //   315: aload           8
        //   317: iload_1        
        //   318: invokevirtual   org/json/JSONArray.optLong:(I)J
        //   321: lastore        
        //   322: iload_1        
        //   323: iconst_1       
        //   324: iadd           
        //   325: istore_1       
        //   326: goto            307
        //   329: aload           5
        //   331: aload           7
        //   333: aload           9
        //   335: invokevirtual   android/os/BaseBundle.putLongArray:(Ljava/lang/String;[J)V
        //   338: goto            555
        //   341: invokestatic    com/google/android/gms/internal/measurement/g7.a:()Z
        //   344: ifeq            555
        //   347: aload_0        
        //   348: getfield        R2/n2.d:LR2/l2;
        //   351: invokevirtual   R2/m3.f:()LR2/g;
        //   354: getstatic       R2/K.M0:LR2/P1;
        //   357: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   360: ifeq            555
        //   363: new             Lorg/json/JSONArray;
        //   366: dup            
        //   367: aload           8
        //   369: ldc             "v"
        //   371: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   374: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   377: astore          8
        //   379: aload           8
        //   381: invokevirtual   org/json/JSONArray.length:()I
        //   384: istore_3       
        //   385: iload_3        
        //   386: newarray        I
        //   388: astore          9
        //   390: iconst_0       
        //   391: istore_1       
        //   392: iload_1        
        //   393: iload_3        
        //   394: if_icmpge       414
        //   397: aload           9
        //   399: iload_1        
        //   400: aload           8
        //   402: iload_1        
        //   403: invokevirtual   org/json/JSONArray.optInt:(I)I
        //   406: iastore        
        //   407: iload_1        
        //   408: iconst_1       
        //   409: iadd           
        //   410: istore_1       
        //   411: goto            392
        //   414: aload           5
        //   416: aload           7
        //   418: aload           9
        //   420: invokevirtual   android/os/BaseBundle.putIntArray:(Ljava/lang/String;[I)V
        //   423: goto            555
        //   426: aload           5
        //   428: aload           7
        //   430: aload           8
        //   432: ldc             "v"
        //   434: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   437: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   440: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //   443: goto            555
        //   446: aload           5
        //   448: aload           7
        //   450: aload           8
        //   452: ldc             "v"
        //   454: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   457: invokestatic    java/lang/Double.parseDouble:(Ljava/lang/String;)D
        //   460: invokevirtual   android/os/BaseBundle.putDouble:(Ljava/lang/String;D)V
        //   463: goto            555
        //   466: aload           5
        //   468: aload           7
        //   470: aload           8
        //   472: ldc             "v"
        //   474: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   477: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   480: goto            555
        //   483: aload_0        
        //   484: getfield        R2/n2.d:LR2/l2;
        //   487: invokevirtual   R2/m3.j:()LR2/Y1;
        //   490: invokevirtual   R2/Y1.G:()LR2/a2;
        //   493: ldc             "Error reading value from SharedPreferences. Value dropped"
        //   495: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   498: goto            555
        //   501: aload_0        
        //   502: aload           5
        //   504: putfield        R2/n2.c:Landroid/os/Bundle;
        //   507: goto            525
        //   510: aload_0        
        //   511: getfield        R2/n2.d:LR2/l2;
        //   514: invokevirtual   R2/m3.j:()LR2/Y1;
        //   517: invokevirtual   R2/Y1.G:()LR2/a2;
        //   520: ldc             "Error loading bundle from SharedPreferences. Values will be lost"
        //   522: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   525: aload_0        
        //   526: getfield        R2/n2.c:Landroid/os/Bundle;
        //   529: ifnonnull       540
        //   532: aload_0        
        //   533: aload_0        
        //   534: getfield        R2/n2.b:Landroid/os/Bundle;
        //   537: putfield        R2/n2.c:Landroid/os/Bundle;
        //   540: aload_0        
        //   541: getfield        R2/n2.c:Landroid/os/Bundle;
        //   544: areturn        
        //   545: astore          5
        //   547: goto            510
        //   550: astore          7
        //   552: goto            483
        //   555: iload_2        
        //   556: iconst_1       
        //   557: iadd           
        //   558: istore_2       
        //   559: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  31     51     545    525    Lorg/json/JSONException;
        //  53     59     545    525    Lorg/json/JSONException;
        //  64     96     550    501    Lorg/json/JSONException;
        //  64     96     550    501    Ljava/lang/NumberFormatException;
        //  131    141    550    501    Lorg/json/JSONException;
        //  131    141    550    501    Ljava/lang/NumberFormatException;
        //  146    156    550    501    Lorg/json/JSONException;
        //  146    156    550    501    Ljava/lang/NumberFormatException;
        //  161    171    550    501    Lorg/json/JSONException;
        //  161    171    550    501    Ljava/lang/NumberFormatException;
        //  176    186    550    501    Lorg/json/JSONException;
        //  176    186    550    501    Ljava/lang/NumberFormatException;
        //  191    200    550    501    Lorg/json/JSONException;
        //  191    200    550    501    Ljava/lang/NumberFormatException;
        //  236    253    550    501    Lorg/json/JSONException;
        //  236    253    550    501    Ljava/lang/NumberFormatException;
        //  256    305    550    501    Lorg/json/JSONException;
        //  256    305    550    501    Ljava/lang/NumberFormatException;
        //  312    322    550    501    Lorg/json/JSONException;
        //  312    322    550    501    Ljava/lang/NumberFormatException;
        //  329    338    550    501    Lorg/json/JSONException;
        //  329    338    550    501    Ljava/lang/NumberFormatException;
        //  341    390    550    501    Lorg/json/JSONException;
        //  341    390    550    501    Ljava/lang/NumberFormatException;
        //  397    407    550    501    Lorg/json/JSONException;
        //  397    407    550    501    Ljava/lang/NumberFormatException;
        //  414    423    550    501    Lorg/json/JSONException;
        //  414    423    550    501    Ljava/lang/NumberFormatException;
        //  426    443    550    501    Lorg/json/JSONException;
        //  426    443    550    501    Ljava/lang/NumberFormatException;
        //  446    463    550    501    Lorg/json/JSONException;
        //  446    463    550    501    Ljava/lang/NumberFormatException;
        //  466    480    550    501    Lorg/json/JSONException;
        //  466    480    550    501    Ljava/lang/NumberFormatException;
        //  483    498    545    525    Lorg/json/JSONException;
        //  501    507    545    525    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0131:
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
    
    public final void b(final Bundle bundle) {
        Bundle c = bundle;
        if (bundle == null) {
            c = new Bundle();
        }
        final SharedPreferences$Editor edit = this.d.F().edit();
        if (((BaseBundle)c).size() == 0) {
            edit.remove(this.a);
        }
        else {
            edit.putString(this.a, this.c(c));
        }
        edit.apply();
        this.c = c;
    }
    
    public final String c(final Bundle bundle) {
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = ((BaseBundle)bundle).keySet().iterator();
    Label_0373_Outer:
        while (true) {
            while (true) {
                Label_0393: {
                    if (!iterator.hasNext()) {
                        break Label_0393;
                    }
                    final String s = iterator.next();
                    final Object value = ((BaseBundle)bundle).get(s);
                    if (value == null) {
                        continue Label_0373_Outer;
                    }
                    try {
                        final JSONObject jsonObject = new JSONObject();
                        jsonObject.put("n", (Object)s);
                        Label_0341: {
                            a2 a2 = null;
                            Class<? extends long[]> clazz = null;
                            Label_0284: {
                                Label_0253: {
                                    Label_0150: {
                                        if (g7.a() && this.d.f().s(K.M0)) {
                                            if (value instanceof String) {
                                                jsonObject.put("v", (Object)String.valueOf(value));
                                            }
                                            else {
                                                if (value instanceof Long) {
                                                    jsonObject.put("v", (Object)String.valueOf(value));
                                                    break Label_0150;
                                                }
                                                String s2;
                                                if (value instanceof int[]) {
                                                    jsonObject.put("v", (Object)Arrays.toString((int[])value));
                                                    s2 = "ia";
                                                }
                                                else if (value instanceof long[]) {
                                                    jsonObject.put("v", (Object)Arrays.toString((long[])value));
                                                    s2 = "la";
                                                }
                                                else {
                                                    if (value instanceof Double) {
                                                        jsonObject.put("v", (Object)String.valueOf(value));
                                                        break Label_0253;
                                                    }
                                                    a2 = this.d.j().G();
                                                    clazz = ((long[])value).getClass();
                                                    break Label_0284;
                                                }
                                                jsonObject.put("t", (Object)s2);
                                                break Label_0341;
                                            }
                                        }
                                        else {
                                            jsonObject.put("v", (Object)String.valueOf(value));
                                            if (!(value instanceof String)) {
                                                if (value instanceof Long) {
                                                    break Label_0150;
                                                }
                                                if (value instanceof Double) {
                                                    break Label_0253;
                                                }
                                                a2 = this.d.j().G();
                                                clazz = ((long[])value).getClass();
                                                break Label_0284;
                                            }
                                        }
                                        jsonObject.put("t", (Object)"s");
                                        break Label_0341;
                                    }
                                    jsonObject.put("t", (Object)"l");
                                    break Label_0341;
                                }
                                jsonObject.put("t", (Object)"d");
                                break Label_0341;
                            }
                            a2.b("Cannot serialize bundle value to SharedPreferences. Type", clazz);
                            continue Label_0373_Outer;
                        }
                        jsonArray.put((Object)jsonObject);
                        continue Label_0373_Outer;
                        final JSONException ex;
                        this.d.j().G().b("Cannot serialize bundle value to SharedPreferences", ex);
                        continue Label_0373_Outer;
                        return jsonArray.toString();
                    }
                    catch (JSONException ex2) {}
                }
                final JSONException ex2;
                final JSONException ex = ex2;
                continue;
            }
        }
    }
}
