// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public class AFa1vSDK
{
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
    
    private static String $$c(final byte b, int n, final short n2) {
        final int onAttributionFailureNative = AFa1vSDK.onAttributionFailureNative;
        AFa1vSDK.onDeepLinkingNative = (((onAttributionFailureNative | 0x7D) << 1) - (onAttributionFailureNative ^ 0x7D)) % 128;
        n = -n;
        final int n3 = (n ^ 0x77) + ((n & 0x77) << 1);
        final int n4 = 36 - b;
        n = n2 + 28;
        final int n5 = (n & 0xFFFFFFE8) + (n | 0xFFFFFFE8);
        final byte[] onConversionDataSuccess = AFa1vSDK.onConversionDataSuccess;
        final byte[] ascii = new byte[n4];
        final int n6 = -2 - n4;
        int n7 = -1;
        int n8 = n3;
        n = n5;
        while (true) {
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            Label_0208: {
                if (onConversionDataSuccess == null) {
                    AFa1vSDK.onDeepLinkingNative = ((onAttributionFailureNative & 0x7D) + (onAttributionFailureNative | 0x7D)) % 128;
                    n9 = -1;
                    n10 = n3;
                    n11 = n6;
                    n = n5;
                    break Label_0208;
                }
                final int n12 = ((n7 | 0xFFFFFFBD) << 1) - (n7 ^ 0xFFFFFFBD) + 68;
                ascii[n12] = (byte)n8;
                if (n12 == n6) {
                    final String s = new String(ascii, 0);
                    final int onAttributionFailureNative2 = AFa1vSDK.onAttributionFailureNative;
                    AFa1vSDK.onDeepLinkingNative = (((onAttributionFailureNative2 | 0x67) << 1) - (onAttributionFailureNative2 ^ 0x67)) % 128;
                    return s;
                }
                n10 = onConversionDataSuccess[n];
                AFa1vSDK.onDeepLinkingNative = (AFa1vSDK.onAttributionFailureNative + 125) % 128;
                n11 = n8;
                n9 = n12;
            }
            final int n13 = (n11 & n10) + (n11 | n10) - 3;
            ++n;
            final int onDeepLinkingNative = AFa1vSDK.onDeepLinkingNative;
            AFa1vSDK.onAttributionFailureNative = (((onDeepLinkingNative | 0xF) << 1) - (onDeepLinkingNative ^ 0xF)) % 128;
            n7 = n9;
            n8 = n13;
            continue;
        }
    }
    
    static {
        throw new Runtime("d2j fail translate: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.genRegGraph(UnSSATransformer.java:344)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:276)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    private AFa1vSDK() {
    }
    
    public static Object AFInAppEventParameterName(final char c, final int i, final int j) {
        final int onDeepLinkingNative = AFa1vSDK.onDeepLinkingNative;
        final int n = ((onDeepLinkingNative | 0x75) << 1) - (onDeepLinkingNative ^ 0x75);
        final int n2 = AFa1vSDK.onAttributionFailureNative = n % 128;
        if (n % 2 != 0) {
            final Object onInstallConversionFailureNative = AFa1vSDK.onInstallConversionFailureNative;
            AFa1vSDK.onDeepLinkingNative = ((n2 ^ 0x3D) + ((n2 & 0x3D) << 1)) % 128;
            try {
                final byte[] onConversionDataSuccess = AFa1vSDK.onConversionDataSuccess;
                final byte b = onConversionDataSuccess[14];
                final byte b2 = onConversionDataSuccess[452];
                final Class<?> forName = Class.forName($$c(b, b2, (short)((b2 ^ 0x343) | (b2 & 0x343))), true, (ClassLoader)AFa1vSDK.init);
                final String $$c = $$c(onConversionDataSuccess[452], onConversionDataSuccess[12], (short)333);
                final Class<Character> type = Character.TYPE;
                final Class<Integer> type2 = Integer.TYPE;
                return forName.getMethod($$c, type, type2, type2).invoke(onInstallConversionFailureNative, c, i, j);
            }
            finally {
                final Throwable t;
                final Throwable cause = t.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        }
        throw null;
    }
    
    public static int AFInAppEventType(final Object o) {
        final int n = AFa1vSDK.onAttributionFailureNative = (AFa1vSDK.onDeepLinkingNative + 91) % 128;
        final Object onInstallConversionFailureNative = AFa1vSDK.onInstallConversionFailureNative;
        AFa1vSDK.onDeepLinkingNative = ((n ^ 0x21) + ((n & 0x21) << 1)) % 128;
        AFa1vSDK.onDeepLinkingNative = (n + 83) % 128;
        try {
            final byte[] onConversionDataSuccess = AFa1vSDK.onConversionDataSuccess;
            final byte b = onConversionDataSuccess[14];
            final byte b2 = onConversionDataSuccess[452];
            final Class<?> forName = Class.forName($$c(b, b2, (short)((b2 ^ 0x343) | (b2 & 0x343))), true, (ClassLoader)AFa1vSDK.init);
            final byte b3 = (byte)(-onConversionDataSuccess[348]);
            final byte b4 = onConversionDataSuccess[26];
            final int intValue = (int)forName.getMethod($$c(b3, b4, (short)((b4 ^ 0x2E6) | (b4 & 0x2E6))), Object.class).invoke(onInstallConversionFailureNative, o);
            final int n2 = AFa1vSDK.onDeepLinkingNative + 115;
            AFa1vSDK.onAttributionFailureNative = n2 % 128;
            if (n2 % 2 != 0) {
                return intValue;
            }
            throw null;
        }
        finally {
            final Throwable t;
            final Throwable cause = t.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }
    
    public static void init$0() {
        final int onAttributionFailureNative = AFa1vSDK.onAttributionFailureNative;
        final int n = (onAttributionFailureNative ^ 0x43) + ((onAttributionFailureNative & 0x43) << 1);
        AFa1vSDK.onDeepLinkingNative = n % 128;
        int onResponseErrorNative;
        if (n % 2 != 0) {
            byte[] onConversionDataSuccess = new byte[1018];
            System.arraycopy("_\u00d4\u0099\u00e1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3H\u00e0\u00f4\n\u00dcM\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0015\u0000\u0003\u00f6\f\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾%%\u0000\u00f7\u0005\u0011\u0003\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\n\u00f8\u0012\u0006\u00f5\u0002\u00f1\u0016\u00ff\u000e\u000b\u00f8\u0007\u00fb\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\f\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d2!\u0005\b\u0000\u00e2(\f\u00f6\u00ff\u0006\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\b\u0000\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\b\u0000\u00e2(\f\b\u0006(\u00d62\u0003\u00d84\u00f2\f\t\u00e3(\u00fa\u00f8\t\u00f8\u00f8\u00ee\n\u00ec\u000bI\u0004´I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b°O\u00fc\u0004\u0011¸\u00ee\t\u00ed\u000b\u00ee\u0007\u00ef\u000b\u00ee\u000b\u00eb\u000b\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d46\u00ff\u00f4\u0010\u00ff\u00f6\u000e\u00ea$\u00fe\u0006\u00f2\t\u0001\u00e2(\f\u00f6\u0001\u0014\u00fe\u0006\n7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c66\u00ce\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0006\u00f5\u0006\u00e3$\u0016\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾\u001a,\u000b\u00f6\f\u0000\u0002\u0002\u00fb\f\t\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾()\u00fd\u0004\u00f4\u000b\u00d9,\u0006\u00f7\u000b\u00fb\u0001\n\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u00108\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d5\u0001\u00f4\n\u0017\u00ed\b\t\u0001\u0012\u00d6%\u00fe\u00e5,\u0006\u00df\u0016\u000f\u00fb\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\f\t\u0002\f\u0006\u0007\u00f57\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c65\u00cf\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\b\f\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\b\u0001\u0012\u00d0$\u0014\u00ff\u0000\f\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\b\u00de\u0017\r\u00f6\u00ff\u0006\u00ee\u000e\f\u00f3\u00ed\u001a\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u00f4\u0016\u00f7\u00e7 \r\u0004\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ee\u0006\u00f0\u000b\u0015\u0000\u0003\u00f6\f\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010¿>\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00fe\u00f2\u0012\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\f\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f".getBytes("ISO-8859-1"), 0, onConversionDataSuccess, 0, 1018);
            onConversionDataSuccess = onConversionDataSuccess;
            onResponseErrorNative = 11898;
        }
        else {
            final byte[] onConversionDataSuccess2 = new byte[1018];
            System.arraycopy("_\u00d4\u0099\u00e1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3H\u00e0\u00f4\n\u00dcM\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0015\u0000\u0003\u00f6\f\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾%%\u0000\u00f7\u0005\u0011\u0003\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\n\u00f8\u0012\u0006\u00f5\u0002\u00f1\u0016\u00ff\u000e\u000b\u00f8\u0007\u00fb\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\f\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d2!\u0005\b\u0000\u00e2(\f\u00f6\u00ff\u0006\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\b\u0000\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\b\u0000\u00e2(\f\b\u0006(\u00d62\u0003\u00d84\u00f2\f\t\u00e3(\u00fa\u00f8\t\u00f8\u00f8\u00ee\n\u00ec\u000bI\u0004´I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b°O\u00fc\u0004\u0011¸\u00ee\t\u00ed\u000b\u00ee\u0007\u00ef\u000b\u00ee\u000b\u00eb\u000b\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d46\u00ff\u00f4\u0010\u00ff\u00f6\u000e\u00ea$\u00fe\u0006\u00f2\t\u0001\u00e2(\f\u00f6\u0001\u0014\u00fe\u0006\n7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c66\u00ce\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0006\u00f5\u0006\u00e3$\u0016\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾\u001a,\u000b\u00f6\f\u0000\u0002\u0002\u00fb\f\t\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007¾()\u00fd\u0004\u00f4\u000b\u00d9,\u0006\u00f7\u000b\u00fb\u0001\n\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u00108\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d5\u0001\u00f4\n\u0017\u00ed\b\t\u0001\u0012\u00d6%\u00fe\u00e5,\u0006\u00df\u0016\u000f\u00fb\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\f\t\u0002\f\u0006\u0007\u00f57\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c65\u00cf\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\b\f\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\b\u0001\u0012\u00d0$\u0014\u00ff\u0000\f\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\b\u00de\u0017\r\u00f6\u00ff\u0006\u00ee\u000e\f\u00f3\u00ed\u001a\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u00f4\u0016\u00f7\u00e7 \r\u0004\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ee\u0006\u00f0\u000b\u0015\u0000\u0003\u00f6\f\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010¿>\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00fe\u00f2\u0012\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\f\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f".getBytes("ISO-8859-1"), 0, onConversionDataSuccess2, 0, 1018);
            final byte[] onConversionDataSuccess = onConversionDataSuccess2;
            onResponseErrorNative = 187;
        }
        onResponseErrorNative = onResponseErrorNative;
    }
    
    public static int valueOf(int intValue) {
        final int n = AFa1vSDK.onDeepLinkingNative + 91;
        final int n2 = AFa1vSDK.onAttributionFailureNative = n % 128;
        Object obj;
        if (n % 2 == 0) {
            obj = AFa1vSDK.onInstallConversionFailureNative;
        }
        else {
            obj = AFa1vSDK.onInstallConversionFailureNative;
        }
        AFa1vSDK.onDeepLinkingNative = ((n2 ^ 0x75) + ((n2 & 0x75) << 1)) % 128;
        try {
            final byte[] onConversionDataSuccess = AFa1vSDK.onConversionDataSuccess;
            final byte b = onConversionDataSuccess[14];
            final byte b2 = onConversionDataSuccess[452];
            intValue = (int)Class.forName($$c(b, b2, (short)((b2 ^ 0x343) | (b2 & 0x343))), true, (ClassLoader)AFa1vSDK.init).getMethod($$c(onConversionDataSuccess[452], onConversionDataSuccess[12], (short)333), Integer.TYPE).invoke(obj, intValue);
            final int onAttributionFailureNative = AFa1vSDK.onAttributionFailureNative;
            final int n3 = (onAttributionFailureNative ^ 0xF) + ((onAttributionFailureNative & 0xF) << 1);
            AFa1vSDK.onDeepLinkingNative = n3 % 128;
            if (n3 % 2 == 0) {
                return intValue;
            }
            throw null;
        }
        finally {
            final Throwable t;
            final Throwable cause = t.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }
}
