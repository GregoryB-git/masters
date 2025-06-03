// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u4;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import org.json.JSONException;
import org.json.JSONObject;
import java.security.NoSuchAlgorithmException;
import android.util.Log;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;
import s3.e;
import android.content.SharedPreferences;

public class b
{
    public static final String[] c;
    public final SharedPreferences a;
    public final String b;
    
    static {
        c = new String[] { "*", "FCM", "GCM", "" };
    }
    
    public b(final e e) {
        this.a = e.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(e);
    }
    
    public static String b(final e e) {
        final String f = e.r().f();
        if (f != null) {
            return f;
        }
        final String c = e.r().c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        final String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    public static String c(final PublicKey publicKey) {
        final byte[] encoded = publicKey.getEncoded();
        while (true) {
            try {
                final byte[] digest = MessageDigest.getInstance("SHA1").digest(encoded);
                digest[0] = (byte)((digest[0] & 0xF) + 112 & 0xFF);
                return Base64.encodeToString(digest, 0, 8, 11);
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                return null;
            }
            catch (NoSuchAlgorithmException ex) {
                continue;
            }
            break;
        }
    }
    
    public final String a(final String str, final String str2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }
    
    public final String d(String string) {
        try {
            string = new JSONObject(string).getString("token");
            return string;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final PublicKey e(String ex) {
        try {
            ex = (NoSuchAlgorithmException)(Object)Base64.decode((String)ex, 8);
            ex = (NoSuchAlgorithmException)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec((byte[])(Object)ex));
            return (PublicKey)ex;
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeySpecException ex) {}
        catch (IllegalArgumentException ex2) {}
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid key stored ");
        sb.append(ex);
        Log.w("ContentValues", sb.toString());
        return null;
    }
    
    public String f() {
        final SharedPreferences a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final String g = this.g();
                if (g != null) {
                    // monitorexit(a)
                    return g;
                }
                // monitorexit(a)
                return this.h();
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String g() {
        synchronized (this.a) {
            return this.a.getString("|S|id", (String)null);
        }
    }
    
    public final String h() {
        final SharedPreferences a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final String string = this.a.getString("|S||P|", (String)null);
                if (string == null) {
                    // monitorexit(a)
                    return null;
                }
                final PublicKey e = this.e(string);
                if (e == null) {
                    // monitorexit(a)
                    return null;
                }
                // monitorexit(a)
                return c(e);
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public String i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        u4/b.a:Landroid/content/SharedPreferences;
        //     4: astore          5
        //     6: aload           5
        //     8: monitorenter   
        //     9: getstatic       u4/b.c:[Ljava/lang/String;
        //    12: astore_3       
        //    13: aload_3        
        //    14: arraylength    
        //    15: istore_2       
        //    16: iconst_0       
        //    17: istore_1       
        //    18: iload_1        
        //    19: iload_2        
        //    20: if_icmpge       95
        //    23: aload_3        
        //    24: iload_1        
        //    25: aaload         
        //    26: astore          4
        //    28: aload_0        
        //    29: aload_0        
        //    30: getfield        u4/b.b:Ljava/lang/String;
        //    33: aload           4
        //    35: invokevirtual   u4/b.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    38: astore          4
        //    40: aload_0        
        //    41: getfield        u4/b.a:Landroid/content/SharedPreferences;
        //    44: aload           4
        //    46: aconst_null    
        //    47: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    52: astore          4
        //    54: aload           4
        //    56: ifnull          109
        //    59: aload           4
        //    61: invokevirtual   java/lang/String.isEmpty:()Z
        //    64: ifne            109
        //    67: aload           4
        //    69: astore_3       
        //    70: aload           4
        //    72: ldc             "{"
        //    74: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    77: ifeq            90
        //    80: aload_0        
        //    81: aload           4
        //    83: invokevirtual   u4/b.d:(Ljava/lang/String;)Ljava/lang/String;
        //    86: astore_3       
        //    87: goto            90
        //    90: aload           5
        //    92: monitorexit    
        //    93: aload_3        
        //    94: areturn        
        //    95: aload           5
        //    97: monitorexit    
        //    98: aconst_null    
        //    99: areturn        
        //   100: aload           5
        //   102: monitorexit    
        //   103: aload_3        
        //   104: athrow         
        //   105: astore_3       
        //   106: goto            100
        //   109: iload_1        
        //   110: iconst_1       
        //   111: iadd           
        //   112: istore_1       
        //   113: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      16     105    109    Any
        //  28     54     105    109    Any
        //  59     67     105    109    Any
        //  70     87     105    109    Any
        //  90     93     105    109    Any
        //  95     98     105    109    Any
        //  100    103    105    109    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
}
