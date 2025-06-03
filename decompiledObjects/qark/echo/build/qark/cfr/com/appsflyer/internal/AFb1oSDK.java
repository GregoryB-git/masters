/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package com.appsflyer.internal;

import java.lang.reflect.Method;

public class AFb1oSDK {
    public static byte[] AppsFlyerLib;
    public static byte[] onPause;
    public static final byte[] setAndroidIdData;
    private static int setCustomerUserId = 1;
    public static int setDebugLog;
    private static Object setImeiData;
    private static Object setOaidData;
    public static final int setPhoneNumber = 0;
    public static int updateServerUninstallToken;
    private static int waitForCustomerUserId;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String $$c(short var0, int var1_1, short var2_2) {
        block3 : {
            var3_3 = AFb1oSDK.waitForCustomerUserId;
            AFb1oSDK.setCustomerUserId = var6_4 = (((var3_3 | 19) << 1) - (var3_3 ^ 19)) % 128;
            var0 = - var0;
            var3_3 = ((var0 | 36) << 1) - (var0 ^ 36);
            var0 = (short)(- var1_1);
            var1_1 = (var0 ^ 119) + ((var0 & 119) << 1);
            var0 = (short)(var2_2 + 4);
            var7_5 = AFb1oSDK.setAndroidIdData;
            var8_6 = new byte[var3_3];
            var2_2 = (short)-1;
            var5_7 = var3_3 - 1;
            var3_3 = var2_2;
            var4_8 = var0;
            if (var7_5 != null) break block3;
            var1_1 = var6_4 + 107;
            AFb1oSDK.waitForCustomerUserId = var1_1 % 128;
            if (var1_1 % 2 != 0) {
                var1_1 = 41 / 0;
            }
            var4_8 = var0;
            var3_3 = var5_7;
            var1_1 = var2_2;
            var2_2 = var4_8;
            ** GOTO lbl43
        }
        do {
            var0 = (short)(((var3_3 | 125) << 1) - (var3_3 ^ 125));
            var3_3 = ((var0 | -124) << 1) - (var0 ^ -124);
            var8_6[var3_3] = (byte)var1_1;
            if (var3_3 == var5_7) {
                var7_5 = new String(var8_6, 0);
                var0 = (short)AFb1oSDK.setCustomerUserId;
                var0 = (short)((var0 & 21) + (var0 | 21));
                AFb1oSDK.waitForCustomerUserId = var0 % 128;
                if (var0 % 2 == 0) return var7_5;
                var0 = (short)(38 / 0);
                return var7_5;
            }
            var0 = (short)((var4_8 ^ -56) + ((var4_8 & -56) << 1));
            var2_2 = (short)((var0 ^ 57) + ((var0 & 57) << 1));
            var4_8 = var7_5[var2_2];
            var0 = (short)var1_1;
            var1_1 = var3_3;
            var3_3 = var4_8;
lbl43: // 2 sources:
            var3_3 = - var3_3;
            AFb1oSDK.waitForCustomerUserId = (AFb1oSDK.setCustomerUserId + 99) % 128;
            var0 = (short)(var0 + var3_3);
            var3_3 = var1_1;
            var1_1 = var0;
            var4_8 = var2_2;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    private AFb1oSDK() {
    }

    public static int AFKeystoreWrapper(int n8) {
        int n9 = waitForCustomerUserId;
        setCustomerUserId = n9 = (((n9 | 25) << 1) - (n9 ^ 25)) % 128;
        Object object = setImeiData;
        waitForCustomerUserId = (n9 + 117) % 128;
        try {
            byte[] arrby = setAndroidIdData;
            n8 = (Integer)Class.forName((String)AFb1oSDK.$$c(arrby[71], arrby[15], (short)649), (boolean)true, (ClassLoader)((ClassLoader)setOaidData)).getMethod(AFb1oSDK.$$c(arrby[608], arrby[40], (short)796), new Class[]{Integer.TYPE}).invoke(object, new Object[]{n8});
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null) {
                throw throwable2;
            }
            throw throwable;
        }
        n9 = waitForCustomerUserId + 75;
        setCustomerUserId = n9 % 128;
        if (n9 % 2 != 0) {
            return n8;
        }
        throw null;
    }

    public static int AFKeystoreWrapper(Object object) {
        int n8;
        int n9 = setCustomerUserId;
        waitForCustomerUserId = n9 = ((n9 ^ 43) + ((n9 & 43) << 1)) % 128;
        Object object2 = setImeiData;
        setCustomerUserId = (n9 + 109) % 128;
        try {
            byte[] arrby = setAndroidIdData;
            n9 = (Integer)Class.forName((String)AFb1oSDK.$$c(arrby[71], arrby[15], (short)649), (boolean)true, (ClassLoader)((ClassLoader)setOaidData)).getMethod(AFb1oSDK.$$c(arrby[15], arrby[111], (short)336), new Class[]{Object.class}).invoke(object2, new Object[]{object});
            n8 = waitForCustomerUserId;
        }
        catch (Throwable throwable) {
            object2 = throwable.getCause();
            if (object2 != null) {
                throw object2;
            }
            throw throwable;
        }
        n8 = (n8 & 75) + (n8 | 75);
        setCustomerUserId = n8 % 128;
        if (n8 % 2 != 0) {
            return n9;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void init$0() {
        int n8 = waitForCustomerUserId + 19;
        setCustomerUserId = n8 % 128;
        if (n8 % 2 == 0) {
            byte[] arrby = new byte[1008];
            System.arraycopy((Object)"_\u00ad\u009d\u009c\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cb7\t\u00eb\u00153\u00c5\u00faA\u00ec\u00cd\u000f\u0000\u0001\u00f3\r\u0001\u001b\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00db\u00da\u0006\u00ff\u000f\u00f8\u00ee\u0003\u0000\r\u00f7\u00fa3\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\t\u00eb\u00153\u00c0\u0005\u00faA\u00ec\u00c9\u0005\u000f#\u00cd\u000f\u0000\u0001\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00ec\u00cd\f\u00fd\b@\u00ce\u0011\u00f3\u00ff\n\u00fa\u0001\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e80\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00e5\u00db!\u00e8\u00f8\u00fe\u00fd\u00f95\u00df\u00ed5\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\r\u0004\u00fd\u001e\u00d1\t\u0000\u00f3\u0002\u00f1.\u00dd\u00fd\u0007\u00f2/\u00db\u00f7\u0002\u00f10\u00df\u0004\u00fd!\u00db\u0007\u00ef\u0005\t\u00f5\u000f\u0002\u00f11\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\r\u0004\u00fd\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00e41\u00c2\u001c\u000f\u00f9'\u00ad\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ea\u00df\u00ed2\u00dd\u00fd\u0007\u00f4\u000b\u00ff\u0006\u00fc\u0002\u00fe\u00fb\u0003\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ec\u00e1\u00ee\u000e!\u00df\u00ed5\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\u0002\u00f11\u00d4\u000b\u00ff\"\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\u00fb\u00fd\u00db-\u00d1\u0000+\u00cf\u0011\u00f7\u00fa \u00db\t\u000b\u00fa\u000b\u000b\u0015\u00f9\u0017\u00f8\u00ba\u00ffO\u00ba\u0005\u00f5\u0000\n\u0001\u00fe\u00f8\u00f8S\u00b4\u0007\u00ff\u00f2K\u0015\u00fa\u0016\u00f8\u0015\u00fc\u0014\u00f8\u0015\u00f8\u0018\u00f8\u00fb\u00fd\u00db-\u00d1\u0000+\u00cf\u0011\u00f7\u00fa$\u00ef\u00ef\u0011\u00f4\b\u00f1\u000f\u00f3$\u00ed\u00f4\b\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00eb\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00d1\u0000)\u00db\u00fd\r\u0001\u00f5\u00f9\u0002\u00f1/\u00cd\u0004\u000f\u00f3\u0004\r\u00f5\u0019\u00df\u0005\u00fd\u0011\u00fa\u0002!\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\u00f9\t\u00eb\u00153\u00c5\u00faA\u00ea\u00e3\u00ed\u0013\u0018\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00fd\u000e\u00fd \u00df\u00ed\u00f3\n\u00f2\u0003\u0006\u00056\u00b8\r\u0004\u00eeI\u00e3\u00e6\u00ec4\u00cf\u0011\u00f7\u00fa\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8*\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00e9\u00d7\u00f8\r\u00f7\u0003\u0001\u0001\b\u00f7\u00fa\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00e41\u00c1\u001d\u000f\u00f9'\u0000\b\u0002\u00f9\u0002\u00f11\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\u00cb\u0003\u00ed\u00132\u00cb\u0003\u00ed\u00132\u00ff\u00f9\u0007\u00f1\u000f\u0002\u00f1.\u0002\u000f\u00f9\u00ec\u0016\u00fb\u00fa\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3D\u00c5\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5>\u00ed\u00fb\u00e41\u00c1\u001d\u000f\u00f9'\u0000\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f9)\u00ef\u00ed\f#\u00d9\u0007\u00f8\b\u00f7\u00fa\u0001\u00f7\u00fd\u00fc\u000e\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cc6\t\u00eb\u00153\u00c5\u00faA\u00ba\u0007\u00fd\f\u00fb\u00f7\u0002\u00f1$\u00de\u0003\u00ff\u000b\u00f3\u00fe\u00fb\u0002\u00f13\u00df\u00ef\u0004\u0003\u00f7\u0001\u000f\u0015\u00ef\u00ed\f\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00de\u00ef\u000b\u00f3\r\u00f5\u00fb%\u00ec\u00f6\r\u0004\u00fd\u0015\u00f5\u00f7\u0010\u0016\u00e9\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0016\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0002\u00f3\u0017\u00e5\t\u00f5\u000f\t\u00eb\u00153\u00c5\u00faA\u00e5\u00fa\n\u00cd\u0015\u00fe\u00f5\u00fc\u000b\u00fa\u0001\u000f\u00ed\f\u001c\u00e3\u00f6\u00ff\u0002\u00f1+\u00db\u0005\u00f5\u000b\b\u00f5+\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0015\u00fd\u0013\u00f8\u00ee\u0003\u0000\r\u00f7\u00fa \u00eb\u00fc\b\u0018\u00e4\u00fd\u0000\u0003\u00f6\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007!\u00df\u00f2\u0010\u00f1\t\u00f9\u00fc\u0005\u00fd\u0005-\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8\u00fd\u000e\u00fd!\u00d7\u000b\u00ee\u0000\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3\u0005\u0011\u00f1\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f95\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\t\u0004\u00f2\t\u00eb\u00153\u00c5\u00faA\u00e5\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4".getBytes("ISO-8859-1"), (int)0, (Object)arrby, (int)0, (int)1008);
            setAndroidIdData = arrby;
            n8 = 105;
        } else {
            byte[] arrby = new byte[1008];
            System.arraycopy((Object)"_\u00ad\u009d\u009c\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cb7\t\u00eb\u00153\u00c5\u00faA\u00ec\u00cd\u000f\u0000\u0001\u00f3\r\u0001\u001b\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00db\u00da\u0006\u00ff\u000f\u00f8\u00ee\u0003\u0000\r\u00f7\u00fa3\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\t\u00eb\u00153\u00c0\u0005\u00faA\u00ec\u00c9\u0005\u000f#\u00cd\u000f\u0000\u0001\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00ec\u00cd\f\u00fd\b@\u00ce\u0011\u00f3\u00ff\n\u00fa\u0001\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e80\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00e5\u00db!\u00e8\u00f8\u00fe\u00fd\u00f95\u00df\u00ed5\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\r\u0004\u00fd\u001e\u00d1\t\u0000\u00f3\u0002\u00f1.\u00dd\u00fd\u0007\u00f2/\u00db\u00f7\u0002\u00f10\u00df\u0004\u00fd!\u00db\u0007\u00ef\u0005\t\u00f5\u000f\u0002\u00f11\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\r\u0004\u00fd\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00e41\u00c2\u001c\u000f\u00f9'\u00ad\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ea\u00df\u00ed2\u00dd\u00fd\u0007\u00f4\u000b\u00ff\u0006\u00fc\u0002\u00fe\u00fb\u0003\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ec\u00e1\u00ee\u000e!\u00df\u00ed5\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\u0002\u00f11\u00d4\u000b\u00ff\"\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\u00fb\u00fd\u00db-\u00d1\u0000+\u00cf\u0011\u00f7\u00fa \u00db\t\u000b\u00fa\u000b\u000b\u0015\u00f9\u0017\u00f8\u00ba\u00ffO\u00ba\u0005\u00f5\u0000\n\u0001\u00fe\u00f8\u00f8S\u00b4\u0007\u00ff\u00f2K\u0015\u00fa\u0016\u00f8\u0015\u00fc\u0014\u00f8\u0015\u00f8\u0018\u00f8\u00fb\u00fd\u00db-\u00d1\u0000+\u00cf\u0011\u00f7\u00fa$\u00ef\u00ef\u0011\u00f4\b\u00f1\u000f\u00f3$\u00ed\u00f4\b\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00eb\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00d1\u0000)\u00db\u00fd\r\u0001\u00f5\u00f9\u0002\u00f1/\u00cd\u0004\u000f\u00f3\u0004\r\u00f5\u0019\u00df\u0005\u00fd\u0011\u00fa\u0002!\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\u00f9\t\u00eb\u00153\u00c5\u00faA\u00ea\u00e3\u00ed\u0013\u0018\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00fd\u000e\u00fd \u00df\u00ed\u00f3\n\u00f2\u0003\u0006\u00056\u00b8\r\u0004\u00eeI\u00e3\u00e6\u00ec4\u00cf\u0011\u00f7\u00fa\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8*\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00e9\u00d7\u00f8\r\u00f7\u0003\u0001\u0001\b\u00f7\u00fa\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00e41\u00c1\u001d\u000f\u00f9'\u0000\b\u0002\u00f9\u0002\u00f11\u00d7\u000b\u00ee\u0000'\u00dd\u000e\u00fd\u00ff\u00f3\u00cb\u0003\u00ed\u00132\u00cb\u0003\u00ed\u00132\u00ff\u00f9\u0007\u00f1\u000f\u0002\u00f1.\u0002\u000f\u00f9\u00ec\u0016\u00fb\u00fa\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3D\u00c5\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5>\u00ed\u00fb\u00e41\u00c1\u001d\u000f\u00f9'\u0000\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f9)\u00ef\u00ed\f#\u00d9\u0007\u00f8\b\u00f7\u00fa\u0001\u00f7\u00fd\u00fc\u000e\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cc6\t\u00eb\u00153\u00c5\u00faA\u00ba\u0007\u00fd\f\u00fb\u00f7\u0002\u00f1$\u00de\u0003\u00ff\u000b\u00f3\u00fe\u00fb\u0002\u00f13\u00df\u00ef\u0004\u0003\u00f7\u0001\u000f\u0015\u00ef\u00ed\f\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00de\u00ef\u000b\u00f3\r\u00f5\u00fb%\u00ec\u00f6\r\u0004\u00fd\u0015\u00f5\u00f7\u0010\u0016\u00e9\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0016\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0002\u00f3\u0017\u00e5\t\u00f5\u000f\t\u00eb\u00153\u00c5\u00faA\u00e5\u00fa\n\u00cd\u0015\u00fe\u00f5\u00fc\u000b\u00fa\u0001\u000f\u00ed\f\u001c\u00e3\u00f6\u00ff\u0002\u00f1+\u00db\u0005\u00f5\u000b\b\u00f5+\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0015\u00fd\u0013\u00f8\u00ee\u0003\u0000\r\u00f7\u00fa \u00eb\u00fc\b\u0018\u00e4\u00fd\u0000\u0003\u00f6\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007!\u00df\u00f2\u0010\u00f1\t\u00f9\u00fc\u0005\u00fd\u0005-\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8\u00fd\u000e\u00fd!\u00d7\u000b\u00ee\u0000\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3\u0005\u0011\u00f1\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f95\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\t\u0004\u00f2\t\u00eb\u00153\u00c5\u00faA\u00e5\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4".getBytes("ISO-8859-1"), (int)0, (Object)arrby, (int)0, (int)1008);
            setAndroidIdData = arrby;
            n8 = 104;
        }
        setPhoneNumber = n8;
    }

    public static Object values(int n8, int n9, char c8) {
        int n10 = setCustomerUserId;
        Object object = setImeiData;
        waitForCustomerUserId = n10 = (((n10 | 89) << 1) - (n10 ^ 89)) % 128;
        setCustomerUserId = ((n10 ^ 31) + ((n10 & 31) << 1)) % 128;
        try {
            Object object2 = setAndroidIdData;
            Class class_ = Class.forName((String)AFb1oSDK.$$c(object2[71], object2[15], (short)649), (boolean)true, (ClassLoader)((ClassLoader)setOaidData));
            object2 = AFb1oSDK.$$c(object2[60], object2[111], (short)388);
            Class class_2 = Integer.TYPE;
            object = class_.getMethod((String)object2, new Class[]{class_2, class_2, Character.TYPE}).invoke(object, new Object[]{n8, n9, Character.valueOf((char)c8)});
            n8 = setCustomerUserId;
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null) {
                throw throwable2;
            }
            throw throwable;
        }
        waitForCustomerUserId = (((n8 | 105) << 1) - (n8 ^ 105)) % 128;
        return object;
    }
}

