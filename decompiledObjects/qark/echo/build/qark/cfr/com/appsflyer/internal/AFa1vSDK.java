/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package com.appsflyer.internal;

import java.lang.reflect.Method;

public class AFa1vSDK {
    public static int AppsFlyer2dXConversionCallback = 0;
    public static byte[] getLevel;
    private static Object init;
    public static byte[] onAppOpenAttributionNative;
    private static int onAttributionFailureNative = 1;
    public static final byte[] onConversionDataSuccess;
    private static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    private static Object onInstallConversionFailureNative;
    public static final int onResponseErrorNative = 0;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String $$c(byte var0, int var1_1, short var2_2) {
        block2 : {
            var6_3 = AFa1vSDK.onAttributionFailureNative;
            AFa1vSDK.onDeepLinkingNative = (((var6_3 | 125) << 1) - (var6_3 ^ 125)) % 128;
            var1_1 = - var1_1;
            var3_4 = (var1_1 ^ 119) + ((var1_1 & 119) << 1);
            var0 = (byte)(36 - var0);
            var1_1 = var2_2 + 28;
            var2_2 = (var1_1 & -24) + (var1_1 | -24);
            var7_5 = AFa1vSDK.onConversionDataSuccess;
            var8_6 = new byte[var0];
            var5_7 = -2 - var0;
            var4_8 = -1;
            var0 = (byte)var3_4;
            var1_1 = var2_2;
            if (var7_5 != null) break block2;
            AFa1vSDK.onDeepLinkingNative = ((var6_3 & 125) + (var6_3 | 125)) % 128;
            var0 = (byte)-1;
            var4_8 = var3_4;
            var3_4 = var5_7;
            var1_1 = var2_2;
            ** GOTO lbl34
        }
        do {
            var2_2 = ((var4_8 | -67) << 1) - (var4_8 ^ -67) + 68;
            var8_6[var2_2] = var0;
            if (var2_2 == var5_7) {
                var7_5 = new String(var8_6, 0);
                var0 = (byte)AFa1vSDK.onAttributionFailureNative;
                AFa1vSDK.onDeepLinkingNative = (((var0 | 103) << 1) - (var0 ^ 103)) % 128;
                return var7_5;
            }
            var4_8 = var7_5[var1_1];
            AFa1vSDK.onDeepLinkingNative = (AFa1vSDK.onAttributionFailureNative + 125) % 128;
            var3_4 = var0;
            var0 = (byte)var2_2;
lbl34: // 2 sources:
            var2_2 = (var3_4 & var4_8) + (var3_4 | var4_8) - 3;
            ++var1_1;
            var3_4 = AFa1vSDK.onDeepLinkingNative;
            AFa1vSDK.onAttributionFailureNative = (((var3_4 | 15) << 1) - (var3_4 ^ 15)) % 128;
            var4_8 = var0;
            var0 = (byte)var2_2;
        } while (true);
    }

    static {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.genRegGraph(UnSSATransformer.java:344)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:276)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    private AFa1vSDK() {
    }

    public static Object AFInAppEventParameterName(char c8, int n8, int n9) {
        int n10;
        int n11 = onDeepLinkingNative;
        n11 = ((n11 | 117) << 1) - (n11 ^ 117);
        onAttributionFailureNative = n10 = n11 % 128;
        if (n11 % 2 != 0) {
            Object object;
            Object object2 = onInstallConversionFailureNative;
            onDeepLinkingNative = ((n10 ^ 61) + ((n10 & 61) << 1)) % 128;
            try {
                object = onConversionDataSuccess;
            }
            catch (Throwable throwable) {
                Throwable throwable2 = throwable.getCause();
                if (throwable2 != null) {
                    throw throwable2;
                }
                throw throwable;
            }
            byte by = object[14];
            n11 = object[452];
            Class class_ = Class.forName((String)AFa1vSDK.$$c(by, n11, (short)(n11 ^ 835 | n11 & 835)), (boolean)true, (ClassLoader)((ClassLoader)init));
            object = AFa1vSDK.$$c(object[452], object[12], (short)333);
            Class class_2 = Character.TYPE;
            Class class_3 = Integer.TYPE;
            object2 = class_.getMethod((String)object, new Class[]{class_2, class_3, class_3}).invoke(object2, new Object[]{Character.valueOf((char)c8), n8, n9});
            return object2;
        }
        throw null;
    }

    public static int AFInAppEventType(Object object) {
        int n8;
        byte[] arrby;
        onAttributionFailureNative = n8 = (onDeepLinkingNative + 91) % 128;
        Object object2 = onInstallConversionFailureNative;
        onDeepLinkingNative = ((n8 ^ 33) + ((n8 & 33) << 1)) % 128;
        onDeepLinkingNative = (n8 + 83) % 128;
        try {
            arrby = onConversionDataSuccess;
        }
        catch (Throwable throwable) {
            object2 = throwable.getCause();
            if (object2 != null) {
                throw object2;
            }
            throw throwable;
        }
        byte by = arrby[14];
        n8 = arrby[452];
        Class class_ = Class.forName((String)AFa1vSDK.$$c(by, n8, (short)(n8 ^ 835 | n8 & 835)), (boolean)true, (ClassLoader)((ClassLoader)init));
        by = - arrby[348];
        n8 = arrby[26];
        n8 = (Integer)class_.getMethod(AFa1vSDK.$$c(by, n8, (short)(n8 ^ 742 | n8 & 742)), new Class[]{Object.class}).invoke(object2, new Object[]{object});
        int n9 = onDeepLinkingNative + 115;
        onAttributionFailureNative = n9 % 128;
        if (n9 % 2 != 0) {
            return n8;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void init$0() {
        int n8 = onAttributionFailureNative;
        n8 = (n8 ^ 67) + ((n8 & 67) << 1);
        onDeepLinkingNative = n8 % 128;
        if (n8 % 2 != 0) {
            byte[] arrby = new byte[1018];
            System.arraycopy((Object)"_\u00d4\u0099\u00e1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3H\u00e0\u00f4\n\u00dcM\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0015\u0000\u0003\u00f6\f\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be%%\u0000\u00f7\u0005\u0011\u0003\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\n\u00f8\u0012\u0006\u00f5\u0002\u00f1\u0016\u00ff\u000e\u000b\u00f8\u0007\u00fb\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\f\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d2!\u0005\b\u0000\u00e2(\f\u00f6\u00ff\u0006\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\b\u0000\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\b\u0000\u00e2(\f\b\u0006(\u00d62\u0003\u00d84\u00f2\f\t\u00e3(\u00fa\u00f8\t\u00f8\u00f8\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u00ee\t\u00ed\u000b\u00ee\u0007\u00ef\u000b\u00ee\u000b\u00eb\u000b\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d46\u00ff\u00f4\u0010\u00ff\u00f6\u000e\u00ea$\u00fe\u0006\u00f2\t\u0001\u00e2(\f\u00f6\u0001\u0014\u00fe\u0006\n7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c66\u00ce\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0006\u00f5\u0006\u00e3$\u0016\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u001a,\u000b\u00f6\f\u0000\u0002\u0002\u00fb\f\t\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be()\u00fd\u0004\u00f4\u000b\u00d9,\u0006\u00f7\u000b\u00fb\u0001\n\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u00108\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d5\u0001\u00f4\n\u0017\u00ed\b\t\u0001\u0012\u00d6%\u00fe\u00e5,\u0006\u00df\u0016\u000f\u00fb\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\f\t\u0002\f\u0006\u0007\u00f57\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c65\u00cf\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\b\f\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\b\u0001\u0012\u00d0$\u0014\u00ff\u0000\f\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\b\u00de\u0017\r\u00f6\u00ff\u0006\u00ee\u000e\f\u00f3\u00ed\u001a\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u00f4\u0016\u00f7\u00e7 \r\u0004\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ee\u0006\u00f0\u000b\u0015\u0000\u0003\u00f6\f\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00fe\u00f2\u0012\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\f\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f".getBytes("ISO-8859-1"), (int)0, (Object)arrby, (int)0, (int)1018);
            onConversionDataSuccess = arrby;
            n8 = 11898;
        } else {
            byte[] arrby = new byte[1018];
            System.arraycopy((Object)"_\u00d4\u0099\u00e1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3H\u00e0\u00f4\n\u00dcM\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0015\u0000\u0003\u00f6\f\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be%%\u0000\u00f7\u0005\u0011\u0003\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\n\u00f8\u0012\u0006\u00f5\u0002\u00f1\u0016\u00ff\u000e\u000b\u00f8\u0007\u00fb\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\f\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d2!\u0005\b\u0000\u00e2(\f\u00f6\u00ff\u0006\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\b\u0000\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\b\u0000\u00e2(\f\b\u0006(\u00d62\u0003\u00d84\u00f2\f\t\u00e3(\u00fa\u00f8\t\u00f8\u00f8\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u00ee\t\u00ed\u000b\u00ee\u0007\u00ef\u000b\u00ee\u000b\u00eb\u000b\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d46\u00ff\u00f4\u0010\u00ff\u00f6\u000e\u00ea$\u00fe\u0006\u00f2\t\u0001\u00e2(\f\u00f6\u0001\u0014\u00fe\u0006\n7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c66\u00ce\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0006\u00f5\u0006\u00e3$\u0016\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u001a,\u000b\u00f6\f\u0000\u0002\u0002\u00fb\f\t\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be()\u00fd\u0004\u00f4\u000b\u00d9,\u0006\u00f7\u000b\u00fb\u0001\n\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u00108\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d5\u0001\u00f4\n\u0017\u00ed\b\t\u0001\u0012\u00d6%\u00fe\u00e5,\u0006\u00df\u0016\u000f\u00fb\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\f\t\u0002\f\u0006\u0007\u00f57\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c65\u00cf\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\b\f\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\b\u0001\u0012\u00d0$\u0014\u00ff\u0000\f\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\b\u00de\u0017\r\u00f6\u00ff\u0006\u00ee\u000e\f\u00f3\u00ed\u001a\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u00f4\u0016\u00f7\u00e7 \r\u0004\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ee\u0006\u00f0\u000b\u0015\u0000\u0003\u00f6\f\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00fe\u00f2\u0012\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\f\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f".getBytes("ISO-8859-1"), (int)0, (Object)arrby, (int)0, (int)1018);
            onConversionDataSuccess = arrby;
            n8 = 187;
        }
        onResponseErrorNative = n8;
    }

    public static int valueOf(int n8) {
        Object object;
        int n9;
        Throwable throwable;
        int n10 = onDeepLinkingNative + 91;
        onAttributionFailureNative = n9 = n10 % 128;
        if (n10 % 2 == 0) {
            object = onInstallConversionFailureNative;
            n10 = 1 / 0;
        } else {
            object = onInstallConversionFailureNative;
        }
        onDeepLinkingNative = ((n9 ^ 117) + ((n9 & 117) << 1)) % 128;
        try {
            throwable = onConversionDataSuccess;
        }
        catch (Throwable throwable2) {
            throwable = throwable2.getCause();
            if (throwable != null) {
                throw throwable;
            }
            throw throwable2;
        }
        byte by = throwable[14];
        n9 = (byte)throwable[452];
        n8 = (Integer)Class.forName((String)AFa1vSDK.$$c(by, n9, (short)(n9 ^ 835 | n9 & 835)), (boolean)true, (ClassLoader)((ClassLoader)init)).getMethod(AFa1vSDK.$$c((byte)throwable[452], (byte)throwable[12], (short)333), new Class[]{Integer.TYPE}).invoke(object, new Object[]{n8});
        n9 = onAttributionFailureNative;
        n9 = (n9 ^ 15) + ((n9 & 15) << 1);
        onDeepLinkingNative = n9 % 128;
        if (n9 % 2 == 0) {
            return n8;
        }
        throw null;
    }
}

