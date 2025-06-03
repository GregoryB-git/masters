// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L3;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Iterator;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class a
{
    public final String a;
    public final Map b;
    public final Map c;
    
    public a(final String a, final Map b) {
        this.a = a;
        this.b = b;
        this.c = new HashMap();
    }
    
    public final String a(final Map map) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<Map.Entry<String, V>> iterator = map.entrySet().iterator();
        Object o = iterator.next();
        sb.append(((Map.Entry<String, V>)o).getKey());
        sb.append("=");
    Label_0060_Outer:
        while (true) {
            if (((Map.Entry)o).getValue() == null) {
                break Label_0078;
            }
            while (true) {
                String encode = URLEncoder.encode((String)((Map.Entry)o).getValue(), "UTF-8");
                Label_0081: {
                    break Label_0081;
                    encode = "";
                }
                sb.append(encode);
                if (!iterator.hasNext()) {
                    return sb.toString();
                }
                o = iterator.next();
                sb.append("&");
                sb.append(((Map.Entry<String, V>)o).getKey());
                sb.append("=");
                if (((Map.Entry)o).getValue() != null) {
                    continue;
                }
                break;
            }
            continue Label_0060_Outer;
        }
    }
    
    public final String b(final String s, final Map map) {
        final String a = this.a(map);
        if (a.isEmpty()) {
            return s;
        }
        if (s.contains("?")) {
            String string = a;
            if (!s.endsWith("&")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("&");
                sb.append(a);
                string = sb.toString();
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(string);
            return sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s);
        sb3.append("?");
        sb3.append(a);
        return sb3.toString();
    }
    
    public c c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        L3/a.a:Ljava/lang/String;
        //     9: aload_0        
        //    10: getfield        L3/a.b:Ljava/util/Map;
        //    13: invokevirtual   L3/a.b:(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
        //    16: astore          4
        //    18: invokestatic    E3/f.f:()LE3/f;
        //    21: astore          5
        //    23: new             Ljava/lang/StringBuilder;
        //    26: dup            
        //    27: invokespecial   java/lang/StringBuilder.<init>:()V
        //    30: astore          6
        //    32: aload           6
        //    34: ldc             "GET Request URL: "
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: pop            
        //    40: aload           6
        //    42: aload           4
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: pop            
        //    48: aload           5
        //    50: aload           6
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: invokevirtual   E3/f.i:(Ljava/lang/String;)V
        //    58: new             Ljava/net/URL;
        //    61: dup            
        //    62: aload           4
        //    64: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    67: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    70: checkcast       Ljavax/net/ssl/HttpsURLConnection;
        //    73: astore          4
        //    75: aload           4
        //    77: sipush          10000
        //    80: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //    83: aload           4
        //    85: sipush          10000
        //    88: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //    91: aload           4
        //    93: ldc             "GET"
        //    95: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    98: aload_0        
        //    99: getfield        L3/a.c:Ljava/util/Map;
        //   102: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   107: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   112: astore          5
        //   114: aload           5
        //   116: invokeinterface java/util/Iterator.hasNext:()Z
        //   121: ifeq            164
        //   124: aload           5
        //   126: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   131: checkcast       Ljava/util/Map$Entry;
        //   134: astore          6
        //   136: aload           4
        //   138: aload           6
        //   140: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   145: checkcast       Ljava/lang/String;
        //   148: aload           6
        //   150: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   155: checkcast       Ljava/lang/String;
        //   158: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   161: goto            114
        //   164: aload           4
        //   166: invokevirtual   java/net/URLConnection.connect:()V
        //   169: aload           4
        //   171: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   174: istore_1       
        //   175: aload           4
        //   177: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   180: astore          5
        //   182: aload           5
        //   184: ifnull          204
        //   187: aload_0        
        //   188: aload           5
        //   190: invokevirtual   L3/a.e:(Ljava/io/InputStream;)Ljava/lang/String;
        //   193: astore_2       
        //   194: goto            204
        //   197: astore_2       
        //   198: aload           5
        //   200: astore_3       
        //   201: goto            233
        //   204: aload           5
        //   206: ifnull          214
        //   209: aload           5
        //   211: invokevirtual   java/io/InputStream.close:()V
        //   214: aload           4
        //   216: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   219: new             LL3/c;
        //   222: dup            
        //   223: iload_1        
        //   224: aload_2        
        //   225: invokespecial   L3/c.<init>:(ILjava/lang/String;)V
        //   228: areturn        
        //   229: astore_2       
        //   230: aconst_null    
        //   231: astore          4
        //   233: aload_3        
        //   234: ifnull          241
        //   237: aload_3        
        //   238: invokevirtual   java/io/InputStream.close:()V
        //   241: aload           4
        //   243: ifnull          251
        //   246: aload           4
        //   248: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   251: aload_2        
        //   252: athrow         
        //   253: astore_2       
        //   254: goto            233
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  4      75     229    233    Any
        //  75     114    253    257    Any
        //  114    161    253    257    Any
        //  164    182    253    257    Any
        //  187    194    197    204    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
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
    
    public a d(final String s, final String s2) {
        this.c.put(s, s2);
        return this;
    }
    
    public final String e(final InputStream in) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
        final char[] array = new char[8192];
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int read = bufferedReader.read(array);
            if (read == -1) {
                break;
            }
            sb.append(array, 0, read);
        }
        return sb.toString();
    }
}
