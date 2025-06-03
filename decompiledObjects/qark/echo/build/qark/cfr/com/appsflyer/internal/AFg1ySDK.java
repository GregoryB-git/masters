/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package com.appsflyer.internal;

public final class AFg1ySDK {
    static final int[] AFInAppEventParameterName;
    static final byte[] AFInAppEventType;
    static final int[] AFKeystoreWrapper;
    private static byte[] afDebugLog;
    private static int[] afInfoLog;
    static final int[] valueOf;
    static final int[] values;

    static {
        int n8;
        int n9;
        int n10;
        afDebugLog = new byte[256];
        AFInAppEventType = new byte[256];
        valueOf = new int[256];
        AFInAppEventParameterName = new int[256];
        values = new int[256];
        AFKeystoreWrapper = new int[256];
        afInfoLog = new int[10];
        int n11 = n8 = 1;
        do {
            n9 = (n8 & 128) != 0 ? 27 : 0;
            n8 = (byte)(n9 ^ (n8 << 1 ^ n8));
            n11 = (byte)(n11 ^ n11 << 1);
            n11 = (byte)(n11 ^ n11 << 2);
            n9 = (byte)(n11 ^ n11 << 4);
            n11 = (n9 & 128) != 0 ? 9 : 0;
            n11 = (byte)(n9 ^ n11);
            byte[] arrby = afDebugLog;
            n9 = n8 & 255;
            n10 = n11 & 255;
            arrby[n9] = (byte)(n11 ^ 99 ^ (n10 << 1 | n10 >> 7) ^ (n10 << 2 | n10 >> 6) ^ (n10 << 3 | n10 >> 5) ^ (n10 >> 4 | n10 << 4));
        } while (n9 != 1);
        arrby[0] = 99;
        for (n11 = 0; n11 < 256; ++n11) {
            int n12;
            int n13 = afDebugLog[n11] & 255;
            AFg1ySDK.AFInAppEventType[n13] = (byte)n11;
            n8 = n9 = n11 << 1;
            if (n9 >= 256) {
                n8 = n9 ^ 283;
            }
            n9 = n10 = n8 << 1;
            if (n10 >= 256) {
                n9 = n10 ^ 283;
            }
            n10 = n12 = n9 << 1;
            if (n12 >= 256) {
                n10 = n12 ^ 283;
            }
            n12 = n10 ^ n11;
            AFg1ySDK.valueOf[n13] = n8 = (n8 ^ (n9 ^ n10)) << 24 | n12 << 16 | (n12 ^ n9) << 8 | n12 ^ n8;
            AFg1ySDK.AFInAppEventParameterName[n13] = n8 >>> 8 | n8 << 24;
            AFg1ySDK.values[n13] = n8 >>> 16 | n8 << 16;
            AFg1ySDK.AFKeystoreWrapper[n13] = n8 << 8 | n8 >>> 24;
        }
        AFg1ySDK.afInfoLog[0] = 16777216;
        n11 = n8 = 1;
        while (n8 < 10) {
            n11 = n9 = n11 << 1;
            if (n9 >= 256) {
                n11 = n9 ^ 283;
            }
            AFg1ySDK.afInfoLog[n8] = n11 << 24;
            ++n8;
        }
    }

    public static byte[][] AFInAppEventParameterName(int n8) {
        byte[][] arrarrby = new byte[4][];
        for (int i8 = 0; i8 < 4; ++i8) {
            int n9 = n8 >>> (i8 << 3);
            arrarrby[i8] = new byte[]{(byte)(n9 & 3), (byte)(n9 >> 2 & 3), (byte)(n9 >> 4 & 3), (byte)(n9 >> 6 & 3)};
        }
        return arrarrby;
    }

    public static int[] valueOf(byte[] arrby, int n8) {
        int n9 = n8;
        if (arrby.length == 16) {
            int n10;
            int n11;
            byte[] arrby2;
            int n12;
            int n13;
            int n14;
            int n15 = 4;
            int n16 = (n9 + 1) * 4;
            int[] arrn = new int[n16];
            int n17 = n10 = 0;
            do {
                n13 = n17;
                if (n10 >= 4) break;
                n12 = arrby[n13];
                n11 = arrby[n13 + 1];
                n14 = arrby[n13 + 2];
                n17 = n13 + 4;
                arrn[n10] = (n11 & 255) << 16 | n12 << 24 | (n14 & 255) << 8 | arrby[n13 + 3] & 255;
                ++n10;
            } while (true);
            n13 = n17 = 0;
            for (n10 = 4; n10 < n16; ++n10) {
                int n18 = arrn[n10 - 1];
                n14 = n17;
                n12 = n13;
                n11 = n18;
                if (n17 == 0) {
                    arrby2 = afDebugLog;
                    n17 = arrby2[n18 >>> 16 & 255];
                    n12 = arrby2[n18 >>> 8 & 255];
                    n11 = arrby2[n18 & 255];
                    n11 = (arrby2[n18 >>> 24] & 255 | (n17 << 24 | (n12 & 255) << 16 | (n11 & 255) << 8)) ^ afInfoLog[n13];
                    n14 = 4;
                    n12 = n13 + 1;
                }
                arrn[n10] = n11 ^ arrn[n10 - 4];
                n17 = n14 - 1;
                n13 = n12;
            }
            if (arrby.length == 16) {
                arrby = new int[n16];
                n17 = n9 * 4;
                arrby[0] = arrn[n17];
                n13 = arrn[n17 + 1];
                arrby[1] = n13;
                arrby[2] = arrn[n17 + 2];
                arrby[3] = arrn[n17 + 3];
                n13 = n17 - 4;
                n17 = n15;
                for (n10 = 1; n10 < n8; ++n10) {
                    n12 = arrn[n13];
                    arrby2 = valueOf;
                    byte[] arrby3 = afDebugLog;
                    n11 = arrby2[arrby3[n12 >>> 24] & 255];
                    int[] arrn2 = AFInAppEventParameterName;
                    n14 = arrn2[arrby3[n12 >>> 16 & 255] & 255];
                    int[] arrn3 = values;
                    n15 = arrn3[arrby3[n12 >>> 8 & 255] & 255];
                    int[] arrn4 = AFKeystoreWrapper;
                    arrby[n17] = arrn4[arrby3[n12 & 255] & 255] ^ (n11 ^ n14 ^ n15);
                    n12 = arrn[n13 + 1];
                    n11 = arrby2[arrby3[n12 >>> 24] & 255];
                    arrby[n17 + 1] = arrn2[arrby3[n12 >>> 16 & 255] & 255] ^ n11 ^ arrn3[arrby3[n12 >>> 8 & 255] & 255] ^ arrn4[arrby3[n12 & 255] & 255];
                    n12 = arrn[n13 + 2];
                    n11 = arrby2[arrby3[n12 >>> 24] & 255];
                    n14 = arrn2[arrby3[n12 >>> 16 & 255] & 255];
                    n15 = arrn3[arrby3[n12 >>> 8 & 255] & 255];
                    arrby[n17 + 2] = arrn4[arrby3[n12 & 255] & 255] ^ (n11 ^ n14 ^ n15);
                    n11 = arrn[n13 + 3];
                    n12 = n17 + 4;
                    n14 = arrby2[arrby3[n11 >>> 24] & 255];
                    n15 = arrn2[arrby3[n11 >>> 16 & 255] & 255];
                    n9 = arrn3[arrby3[n11 >>> 8 & 255] & 255];
                    arrby[n17 + 3] = arrn4[arrby3[n11 & 255] & 255] ^ (n14 ^ n15 ^ n9);
                    n13 -= 4;
                    n17 = n12;
                }
                arrby[n17] = arrn[n13];
                arrby[n17 + 1] = arrn[n13 + 1];
                arrby[n17 + 2] = arrn[n13 + 2];
                arrby[n17 + 3] = arrn[n13 + 3];
                return arrby;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}

