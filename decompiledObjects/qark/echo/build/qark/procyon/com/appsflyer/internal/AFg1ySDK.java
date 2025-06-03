// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFg1ySDK
{
    static final int[] AFInAppEventParameterName;
    static final byte[] AFInAppEventType;
    static final int[] AFKeystoreWrapper;
    private static byte[] afDebugLog;
    private static int[] afInfoLog;
    static final int[] valueOf;
    static final int[] values;
    
    static {
        AFg1ySDK.afDebugLog = new byte[256];
        AFInAppEventType = new byte[256];
        valueOf = new int[256];
        AFInAppEventParameterName = new int[256];
        values = new int[256];
        AFKeystoreWrapper = new int[256];
        AFg1ySDK.afInfoLog = new int[10];
        int n2;
        int n = n2 = 1;
        int i;
        byte[] afDebugLog;
        do {
            int n3;
            if ((n & 0x80) != 0x0) {
                n3 = 27;
            }
            else {
                n3 = 0;
            }
            n = (byte)(n3 ^ (n << 1 ^ n));
            final byte b = (byte)(n2 ^ n2 << 1);
            final byte b2 = (byte)(b ^ b << 2);
            final byte b3 = (byte)(b2 ^ b2 << 4);
            byte b4;
            if ((b3 & 0x80) != 0x0) {
                b4 = 9;
            }
            else {
                b4 = 0;
            }
            n2 = (byte)(b3 ^ b4);
            afDebugLog = AFg1ySDK.afDebugLog;
            i = (n & 0xFF);
            final int n4 = n2 & 0xFF;
            afDebugLog[i] = (byte)(n2 ^ 0x63 ^ (n4 << 1 | n4 >> 7) ^ (n4 << 2 | n4 >> 6) ^ (n4 << 3 | n4 >> 5) ^ (n4 >> 4 | n4 << 4));
        } while (i != 1);
        afDebugLog[0] = 99;
        for (int j = 0; j < 256; ++j) {
            final int n5 = AFg1ySDK.afDebugLog[j] & 0xFF;
            AFg1ySDK.AFInAppEventType[n5] = (byte)j;
            final int n6 = j << 1;
            int n7;
            if ((n7 = n6) >= 256) {
                n7 = (n6 ^ 0x11B);
            }
            final int n8 = n7 << 1;
            int n9;
            if ((n9 = n8) >= 256) {
                n9 = (n8 ^ 0x11B);
            }
            final int n10 = n9 << 1;
            int n11;
            if ((n11 = n10) >= 256) {
                n11 = (n10 ^ 0x11B);
            }
            final int n12 = n11 ^ j;
            final int n13 = (n7 ^ (n9 ^ n11)) << 24 | n12 << 16 | (n12 ^ n9) << 8 | (n12 ^ n7);
            AFg1ySDK.valueOf[n5] = n13;
            AFg1ySDK.AFInAppEventParameterName[n5] = (n13 >>> 8 | n13 << 24);
            AFg1ySDK.values[n5] = (n13 >>> 16 | n13 << 16);
            AFg1ySDK.AFKeystoreWrapper[n5] = (n13 << 8 | n13 >>> 24);
        }
        AFg1ySDK.afInfoLog[0] = 16777216;
        int n14;
        for (int k = n14 = 1; k < 10; ++k) {
            final int n15 = n14 << 1;
            if ((n14 = n15) >= 256) {
                n14 = (n15 ^ 0x11B);
            }
            AFg1ySDK.afInfoLog[k] = n14 << 24;
        }
    }
    
    public static byte[][] AFInAppEventParameterName(final int n) {
        final byte[][] array = new byte[4][];
        for (int i = 0; i < 4; ++i) {
            final int n2 = n >>> (i << 3);
            array[i] = new byte[] { (byte)(n2 & 0x3), (byte)(n2 >> 2 & 0x3), (byte)(n2 >> 4 & 0x3), (byte)(n2 >> 6 & 0x3) };
        }
        return array;
    }
    
    public static int[] valueOf(final byte[] array, final int n) {
        if (array.length != 16) {
            throw new IllegalArgumentException();
        }
        final int n2 = 4;
        final int n3 = (n + 1) * 4;
        final int[] array2 = new int[n3];
        int n5;
        int n4 = n5 = 0;
        while (true) {
            final int n6 = n5;
            if (n4 >= 4) {
                break;
            }
            final byte b = array[n6];
            final byte b2 = array[n6 + 1];
            final byte b3 = array[n6 + 2];
            n5 = n6 + 4;
            array2[n4] = ((b2 & 0xFF) << 16 | b << 24 | (b3 & 0xFF) << 8 | (array[n6 + 3] & 0xFF));
            ++n4;
        }
        int i = 4;
        int n8;
        int n7 = n8 = 0;
        while (i < n3) {
            final int n9 = array2[i - 1];
            int n10 = n7;
            int n11 = n8;
            int n12 = n9;
            if (n7 == 0) {
                final byte[] afDebugLog = AFg1ySDK.afDebugLog;
                n12 = (((afDebugLog[n9 >>> 24] & 0xFF) | (afDebugLog[n9 >>> 16 & 0xFF] << 24 | (afDebugLog[n9 >>> 8 & 0xFF] & 0xFF) << 16 | (afDebugLog[n9 & 0xFF] & 0xFF) << 8)) ^ AFg1ySDK.afInfoLog[n8]);
                n10 = 4;
                n11 = n8 + 1;
            }
            array2[i] = (n12 ^ array2[i - 4]);
            ++i;
            n7 = n10 - 1;
            n8 = n11;
        }
        if (array.length == 16) {
            final int[] array3 = new int[n3];
            final int n13 = n * 4;
            array3[0] = array2[n13];
            final int n14 = array2[n13 + 1];
            int j = 1;
            array3[1] = n14;
            array3[2] = array2[n13 + 2];
            array3[3] = array2[n13 + 3];
            int n15 = n13 - 4;
            int n16 = n2;
            while (j < n) {
                final int n17 = array2[n15];
                final int[] valueOf = AFg1ySDK.valueOf;
                final byte[] afDebugLog2 = AFg1ySDK.afDebugLog;
                final int n18 = valueOf[afDebugLog2[n17 >>> 24] & 0xFF];
                final int[] afInAppEventParameterName = AFg1ySDK.AFInAppEventParameterName;
                final int n19 = afInAppEventParameterName[afDebugLog2[n17 >>> 16 & 0xFF] & 0xFF];
                final int[] values = AFg1ySDK.values;
                final int n20 = values[afDebugLog2[n17 >>> 8 & 0xFF] & 0xFF];
                final int[] afKeystoreWrapper = AFg1ySDK.AFKeystoreWrapper;
                array3[n16] = (afKeystoreWrapper[afDebugLog2[n17 & 0xFF] & 0xFF] ^ (n18 ^ n19 ^ n20));
                final int n21 = array2[n15 + 1];
                array3[n16 + 1] = (afInAppEventParameterName[afDebugLog2[n21 >>> 16 & 0xFF] & 0xFF] ^ valueOf[afDebugLog2[n21 >>> 24] & 0xFF] ^ values[afDebugLog2[n21 >>> 8 & 0xFF] & 0xFF] ^ afKeystoreWrapper[afDebugLog2[n21 & 0xFF] & 0xFF]);
                final int n22 = array2[n15 + 2];
                array3[n16 + 2] = (afKeystoreWrapper[afDebugLog2[n22 & 0xFF] & 0xFF] ^ (valueOf[afDebugLog2[n22 >>> 24] & 0xFF] ^ afInAppEventParameterName[afDebugLog2[n22 >>> 16 & 0xFF] & 0xFF] ^ values[afDebugLog2[n22 >>> 8 & 0xFF] & 0xFF]));
                final int n23 = array2[n15 + 3];
                final int n24 = n16 + 4;
                array3[n16 + 3] = (afKeystoreWrapper[afDebugLog2[n23 & 0xFF] & 0xFF] ^ (valueOf[afDebugLog2[n23 >>> 24] & 0xFF] ^ afInAppEventParameterName[afDebugLog2[n23 >>> 16 & 0xFF] & 0xFF] ^ values[afDebugLog2[n23 >>> 8 & 0xFF] & 0xFF]));
                n15 -= 4;
                ++j;
                n16 = n24;
            }
            array3[n16] = array2[n15];
            array3[n16 + 1] = array2[n15 + 1];
            array3[n16 + 2] = array2[n15 + 2];
            array3[n16 + 3] = array2[n15 + 3];
            return array3;
        }
        throw new IllegalArgumentException();
    }
}
