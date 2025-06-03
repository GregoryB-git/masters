// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import java.util.Enumeration;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.KeyStoreException;
import java.security.KeyStore;
import android.content.Context;

public class AFKeystoreWrapper
{
    private Context AFInAppEventParameterName;
    public KeyStore AFInAppEventType;
    public String AFKeystoreWrapper;
    public final Object valueOf;
    public int values;
    
    public AFKeystoreWrapper(Context instance) {
        this.valueOf = new Object();
        this.AFInAppEventParameterName = (Context)instance;
        this.AFKeystoreWrapper = "";
        this.values = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            instance = (KeyStoreException)KeyStore.getInstance("AndroidKeyStore");
            (this.AFInAppEventType = (KeyStore)instance).load(null);
            return;
        }
        catch (KeyStoreException instance) {}
        catch (CertificateException instance) {}
        catch (NoSuchAlgorithmException instance) {}
        catch (IOException ex) {}
        AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", instance);
    }
    
    private static boolean AFInAppEventParameterName(final String s) {
        return s.startsWith("com.appsflyer");
    }
    
    public final String AFInAppEventParameterName() {
        final StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.valueOf) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.AFKeystoreWrapper);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.values);
            // monitorexit(this.valueOf)
            return sb.toString();
        }
    }
    
    public final int AFInAppEventType() {
        synchronized (this.valueOf) {
            return this.values;
        }
    }
    
    public final void AFKeystoreWrapper(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_1        
        //     3: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //     6: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //     9: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //    12: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //    15: astore_3       
        //    16: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //    19: astore          4
        //    21: aload           4
        //    23: iconst_1       
        //    24: iconst_5       
        //    25: invokevirtual   java/util/Calendar.add:(II)V
        //    28: aload_0        
        //    29: getfield        com/appsflyer/AFKeystoreWrapper.valueOf:Ljava/lang/Object;
        //    32: astore_2       
        //    33: aload_2        
        //    34: monitorenter   
        //    35: aload_0        
        //    36: getfield        com/appsflyer/AFKeystoreWrapper.AFInAppEventType:Ljava/security/KeyStore;
        //    39: aload_1        
        //    40: invokevirtual   java/security/KeyStore.containsAlias:(Ljava/lang/String;)Z
        //    43: ifne            113
        //    46: new             Landroid/security/keystore/KeyGenParameterSpec$Builder;
        //    49: dup            
        //    50: aload_1        
        //    51: iconst_3       
        //    52: invokespecial   android/security/keystore/KeyGenParameterSpec$Builder.<init>:(Ljava/lang/String;I)V
        //    55: new             Ljavax/security/auth/x500/X500Principal;
        //    58: dup            
        //    59: ldc             "CN=AndroidSDK, O=AppsFlyer"
        //    61: invokespecial   javax/security/auth/x500/X500Principal.<init>:(Ljava/lang/String;)V
        //    64: invokevirtual   android/security/keystore/KeyGenParameterSpec$Builder.setCertificateSubject:(Ljavax/security/auth/x500/X500Principal;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
        //    67: getstatic       java/math/BigInteger.ONE:Ljava/math/BigInteger;
        //    70: invokevirtual   android/security/keystore/KeyGenParameterSpec$Builder.setCertificateSerialNumber:(Ljava/math/BigInteger;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
        //    73: aload_3        
        //    74: invokevirtual   java/util/Calendar.getTime:()Ljava/util/Date;
        //    77: invokevirtual   android/security/keystore/KeyGenParameterSpec$Builder.setCertificateNotBefore:(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
        //    80: aload           4
        //    82: invokevirtual   java/util/Calendar.getTime:()Ljava/util/Date;
        //    85: invokevirtual   android/security/keystore/KeyGenParameterSpec$Builder.setCertificateNotAfter:(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
        //    88: invokevirtual   android/security/keystore/KeyGenParameterSpec$Builder.build:()Landroid/security/keystore/KeyGenParameterSpec;
        //    91: astore_1       
        //    92: ldc             "RSA"
        //    94: ldc             "AndroidKeyStore"
        //    96: invokestatic    java/security/KeyPairGenerator.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;
        //    99: astore_3       
        //   100: aload_3        
        //   101: aload_1        
        //   102: invokevirtual   java/security/KeyPairGenerator.initialize:(Ljava/security/spec/AlgorithmParameterSpec;)V
        //   105: aload_3        
        //   106: invokevirtual   java/security/KeyPairGeneratorSpi.generateKeyPair:()Ljava/security/KeyPair;
        //   109: pop            
        //   110: goto            125
        //   113: ldc             "Alias already exists: "
        //   115: aload_1        
        //   116: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   119: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   122: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   125: aload_2        
        //   126: monitorexit    
        //   127: return         
        //   128: aload_2        
        //   129: monitorexit    
        //   130: aload_1        
        //   131: athrow         
        //   132: astore_1       
        //   133: new             Ljava/lang/StringBuilder;
        //   136: dup            
        //   137: ldc             "Exception "
        //   139: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   142: astore_2       
        //   143: aload_2        
        //   144: aload_1        
        //   145: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: pop            
        //   152: aload_2        
        //   153: ldc             " occurred"
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: pop            
        //   159: aload_2        
        //   160: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   163: aload_1        
        //   164: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   167: return         
        //   168: astore_1       
        //   169: goto            128
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     35     132    168    Any
        //  35     110    168    132    Any
        //  113    125    168    132    Any
        //  125    127    168    132    Any
        //  128    132    132    168    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    public final boolean AFKeystoreWrapper() {
        final Object valueOf = this.valueOf;
        // monitorenter(valueOf)
        while (true) {
            try {
                final KeyStore afInAppEventType = this.AFInAppEventType;
                final boolean b = false;
                final boolean b2 = false;
                boolean b3 = b;
                Label_0254: {
                    if (afInAppEventType != null) {
                        boolean b4 = b2;
                        try {
                            final Enumeration<String> aliases = afInAppEventType.aliases();
                            String str;
                            while (true) {
                                b4 = b2;
                                if (!aliases.hasMoreElements()) {
                                    break Label_0254;
                                }
                                b4 = b2;
                                str = aliases.nextElement();
                                if (str == null) {
                                    continue;
                                }
                                b4 = b2;
                                if (AFInAppEventParameterName(str)) {
                                    break;
                                }
                            }
                            b4 = b2;
                            final String[] split = str.split(",");
                            b4 = b2;
                            if (split.length == 3) {
                                b4 = b2;
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(str));
                                final boolean b5 = b4 = true;
                                final String[] split2 = split[1].trim().split("=");
                                b4 = b5;
                                final String[] split3 = split[2].trim().split("=");
                                b4 = b5;
                                if (split2.length == 2) {
                                    b4 = b5;
                                    if (split3.length == 2) {
                                        b4 = b5;
                                        this.AFKeystoreWrapper = split2[1].trim();
                                        b4 = b5;
                                        this.values = Integer.parseInt(split3[1].trim());
                                    }
                                }
                            }
                        }
                        finally {
                            final StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                            final Throwable t;
                            sb.append(t.getClass().getName());
                            AFLogger.afErrorLog(sb.toString(), t);
                            b3 = b4;
                        }
                    }
                }
                // monitorexit(valueOf)
                return b3;
                // monitorexit(valueOf)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String valueOf() {
        synchronized (this.valueOf) {
            return this.AFKeystoreWrapper;
        }
    }
}
