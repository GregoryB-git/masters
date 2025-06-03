// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import org.json.JSONObject;

public final class AFd1aSDK
{
    public final AFe1sSDK AFInAppEventParameterName;
    public final AFb1fSDK.AFa1ySDK values;
    
    public AFd1aSDK() {
    }
    
    public AFd1aSDK(final JSONObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: ldc             "exc_mngr"
        //     7: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //    10: istore_2       
        //    11: aconst_null    
        //    12: astore          5
        //    14: iload_2        
        //    15: ifeq            86
        //    18: aload_1        
        //    19: ldc             "exc_mngr"
        //    21: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //    24: iconst_0       
        //    25: invokevirtual   org/json/JSONArray.optJSONObject:(I)Lorg/json/JSONObject;
        //    28: ldc             "data"
        //    30: invokevirtual   org/json/JSONObject.optJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    33: astore_3       
        //    34: aload_3        
        //    35: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    38: pop            
        //    39: aload_3        
        //    40: ldc             "v1"
        //    42: invokevirtual   org/json/JSONObject.optJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    45: astore_3       
        //    46: new             Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;
        //    49: dup            
        //    50: aload_3        
        //    51: ldc             "sdk_ver"
        //    53: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    56: aload_3        
        //    57: ldc             "min"
        //    59: iconst_m1      
        //    60: invokevirtual   org/json/JSONObject.optInt:(Ljava/lang/String;I)I
        //    63: aload_3        
        //    64: ldc             "expire"
        //    66: iconst_m1      
        //    67: invokevirtual   org/json/JSONObject.optInt:(Ljava/lang/String;I)I
        //    70: aload_3        
        //    71: ldc             "ttl"
        //    73: ldc2_w          -1
        //    76: invokevirtual   org/json/JSONObject.optLong:(Ljava/lang/String;J)J
        //    79: invokespecial   com/appsflyer/internal/AFb1fSDK$AFa1ySDK.<init>:(Ljava/lang/String;IIJ)V
        //    82: astore_3       
        //    83: goto            88
        //    86: aconst_null    
        //    87: astore_3       
        //    88: aload           5
        //    90: astore          4
        //    92: aload_1        
        //    93: ldc             "meta_data"
        //    95: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //    98: ifeq            143
        //   101: aload_1        
        //   102: ldc             "meta_data"
        //   104: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //   107: iconst_0       
        //   108: invokevirtual   org/json/JSONArray.optJSONObject:(I)Lorg/json/JSONObject;
        //   111: ldc             "data"
        //   113: invokevirtual   org/json/JSONObject.optJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //   116: astore_1       
        //   117: aload_1        
        //   118: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: new             Lcom/appsflyer/internal/AFe1sSDK;
        //   125: dup            
        //   126: aload_1        
        //   127: ldc             "v1"
        //   129: invokevirtual   org/json/JSONObject.optJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //   132: ldc             "send_rate"
        //   134: dconst_1       
        //   135: invokevirtual   org/json/JSONObject.optDouble:(Ljava/lang/String;D)D
        //   138: invokespecial   com/appsflyer/internal/AFe1sSDK.<init>:(D)V
        //   141: astore          4
        //   143: aload_0        
        //   144: aload_3        
        //   145: putfield        com/appsflyer/internal/AFd1aSDK.values:Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;
        //   148: aload_0        
        //   149: aload           4
        //   151: putfield        com/appsflyer/internal/AFd1aSDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFe1sSDK;
        //   154: return         
        //   155: astore_3       
        //   156: goto            86
        //   159: astore_1       
        //   160: aload           5
        //   162: astore          4
        //   164: goto            143
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  18     83     155    159    Lorg/json/JSONException;
        //  18     83     155    159    Ljava/lang/NullPointerException;
        //  101    143    159    167    Lorg/json/JSONException;
        //  101    143    159    167    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0143:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (AFd1aSDK.class != o.getClass()) {
                return false;
            }
            final AFd1aSDK aFd1aSDK = (AFd1aSDK)o;
            final AFb1fSDK.AFa1ySDK values = this.values;
            if (values != null && values.equals(aFd1aSDK.values)) {
                final AFe1sSDK afInAppEventParameterName = this.AFInAppEventParameterName;
                if (afInAppEventParameterName != null && afInAppEventParameterName.equals(aFd1aSDK.AFInAppEventParameterName)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final AFb1fSDK.AFa1ySDK values = this.values;
        if (values != null) {
            return values.hashCode();
        }
        return 0;
    }
}
