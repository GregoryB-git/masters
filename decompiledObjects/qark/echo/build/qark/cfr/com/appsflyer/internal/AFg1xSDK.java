/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FilterInputStream
 *  java.io.InputStream
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFg1ySDK;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFg1xSDK
extends FilterInputStream {
    private static final byte[] AFInAppEventParameterName = AFg1ySDK.AFInAppEventType;
    private static final int[] AFInAppEventType;
    private static final int[] AFKeystoreWrapper;
    private static final int[] valueOf;
    private static final int[] values;
    private final int[] AFLogger = new int[4];
    private int AFVersionDeclaration = 16;
    private final byte[][] afDebugLog;
    private final byte[] afErrorLog = new byte[16];
    private int afErrorLogForExcManagerOnly = 16;
    private final int[] afInfoLog;
    private final int afRDLog;
    private final byte[] afWarnLog = new byte[16];
    private int getLevel = Integer.MAX_VALUE;

    static {
        AFKeystoreWrapper = AFg1ySDK.valueOf;
        values = AFg1ySDK.AFInAppEventParameterName;
        AFInAppEventType = AFg1ySDK.values;
        valueOf = AFg1ySDK.AFKeystoreWrapper;
    }

    public AFg1xSDK(InputStream inputStream, int n8, byte[] arrby, byte[][] arrby2) {
        super(inputStream);
        this.afRDLog = n8;
        this.afInfoLog = AFg1ySDK.valueOf(arrby, n8);
        this.afDebugLog = AFg1xSDK.valueOf(arrby2);
    }

    private static byte[][] valueOf(byte[][] arrby) {
        byte[][] arrarrby = new byte[arrby.length][];
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            byte[] arrby2;
            arrarrby[i8] = new byte[arrby[i8].length];
            for (int i9 = 0; i9 < (arrby2 = arrby[i8]).length; ++i9) {
                arrarrby[i8][arrby2[i9]] = (byte)i9;
            }
        }
        return arrarrby;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int values() {
        int n8;
        if (this.getLevel == Integer.MAX_VALUE) {
            this.getLevel = this.in.read();
        }
        int n9 = this.AFVersionDeclaration;
        int n10 = 16;
        if (n9 != 16) return this.afErrorLogForExcManagerOnly;
        byte[] arrby = this.afErrorLog;
        n9 = this.getLevel;
        arrby[0] = (byte)n9;
        if (n9 < 0) throw new IllegalStateException("unexpected block size");
        n9 = 1;
        do {
            int n11 = this.in.read(this.afErrorLog, n9, 16 - n9);
            n8 = n9;
            if (n11 <= 0) break;
            n9 = n8 = n9 + n11;
        } while (n8 < 16);
        if (n8 < 16) throw new IllegalStateException("unexpected block size");
        this.values(this.afErrorLog, this.afWarnLog);
        this.getLevel = n8 = this.in.read();
        this.AFVersionDeclaration = 0;
        n9 = n10;
        if (n8 < 0) {
            n9 = 16 - (this.afWarnLog[15] & 255);
        }
        this.afErrorLogForExcManagerOnly = n9;
        return this.afErrorLogForExcManagerOnly;
    }

    private void values(byte[] arrby, byte[] arrby2) {
        byte[] arrby3;
        int[] arrn;
        byte[] arrby4;
        byte[][] arrby5;
        int[] arrn2 = this.AFLogger;
        int n8 = arrby[0];
        int n9 = arrby[1];
        byte by = arrby[2];
        byte by2 = arrby[3];
        int[] arrn3 = this.afInfoLog;
        arrn2[0] = (n8 << 24 | (n9 & 255) << 16 | (by & 255) << 8 | by2 & 255) ^ arrn3[0];
        arrn2[1] = (arrby[4] << 24 | (arrby[5] & 255) << 16 | (arrby[6] & 255) << 8 | arrby[7] & 255) ^ arrn3[1];
        arrn2[2] = (arrby[8] << 24 | (arrby[9] & 255) << 16 | (arrby[10] & 255) << 8 | arrby[11] & 255) ^ arrn3[2];
        n8 = arrby[12];
        n9 = arrby[13];
        by = arrby[14];
        by2 = arrby[15];
        arrn2[3] = arrn3[3] ^ ((n9 & 255) << 16 | n8 << 24 | (by & 255) << 8 | by2 & 255);
        n8 = 4;
        n9 = 1;
        while (n9 < this.afRDLog) {
            arrby = AFKeystoreWrapper;
            arrn2 = this.AFLogger;
            byte[][] arrby6 = this.afDebugLog;
            arrn3 = arrby6[0];
            by = arrby[arrn2[arrn3[0]] >>> 24];
            arrby3 = values;
            arrby4 = arrby6[1];
            by2 = arrby3[arrn2[arrby4[0]] >>> 16 & 255];
            arrn = AFInAppEventType;
            arrby5 = arrby6[2];
            int n10 = arrn[arrn2[arrby5[0]] >>> 8 & 255];
            int[] arrn4 = valueOf;
            arrby6 = arrby6[3];
            int n11 = arrn4[arrn2[arrby6[0]] & 255];
            int[] arrn5 = this.afInfoLog;
            int n12 = arrn5[n8];
            byte by3 = arrby[arrn2[arrn3[1]] >>> 24];
            byte by4 = arrby3[arrn2[arrby4[1]] >>> 16 & 255];
            int n13 = arrn[arrn2[arrby5[1]] >>> 8 & 255];
            int n14 = arrn4[arrn2[arrby6[1]] & 255];
            int n15 = arrn5[n8 + 1];
            byte by5 = arrby[arrn2[arrn3[2]] >>> 24];
            byte by6 = arrby3[arrn2[arrby4[2]] >>> 16 & 255];
            int n16 = arrn[arrn2[arrby5[2]] >>> 8 & 255];
            int n17 = arrn4[arrn2[arrby6[2]] & 255];
            int n18 = arrn5[n8 + 2];
            byte by7 = arrby[arrn2[arrn3[3]] >>> 24];
            byte by8 = arrby3[arrn2[arrby4[3]] >>> 16 & 255];
            int n19 = arrn[arrn2[arrby5[3]] >>> 8 & 255];
            int n20 = arrn4[arrn2[arrby6[3]] & 255];
            int n21 = arrn5[n8 + 3];
            arrn2[0] = n11 ^ (n10 ^ (by ^ by2)) ^ n12;
            arrn2[1] = n13 ^ (by3 ^ by4) ^ n14 ^ n15;
            arrn2[2] = by6 ^ by5 ^ n16 ^ n17 ^ n18;
            arrn2[3] = by7 ^ by8 ^ n19 ^ n20 ^ n21;
            ++n9;
            n8 += 4;
        }
        arrby = this.afInfoLog;
        n9 = arrby[n8];
        arrn2 = AFInAppEventParameterName;
        arrn3 = this.AFLogger;
        arrby5 = this.afDebugLog;
        arrby3 = arrby5[0];
        arrby2[0] = (byte)(arrn2[arrn3[arrby3[0]] >>> 24] ^ n9 >>> 24);
        arrby4 = arrby5[1];
        arrby2[1] = (byte)(arrn2[arrn3[arrby4[0]] >>> 16 & 255] ^ n9 >>> 16);
        arrn = arrby5[2];
        arrby2[2] = (byte)(arrn2[arrn3[arrn[0]] >>> 8 & 255] ^ n9 >>> 8);
        arrby5 = arrby5[3];
        arrby2[3] = (byte)(arrn2[arrn3[arrby5[0]] & 255] ^ n9);
        n9 = arrby[n8 + 1];
        arrby2[4] = (byte)(arrn2[arrn3[arrby3[1]] >>> 24] ^ n9 >>> 24);
        arrby2[5] = (byte)(arrn2[arrn3[arrby4[1]] >>> 16 & 255] ^ n9 >>> 16);
        arrby2[6] = (byte)(arrn2[arrn3[arrn[1]] >>> 8 & 255] ^ n9 >>> 8);
        arrby2[7] = (byte)(n9 ^ arrn2[arrn3[arrby5[1]] & 255]);
        n9 = arrby[n8 + 2];
        arrby2[8] = (byte)(arrn2[arrn3[arrby3[2]] >>> 24] ^ n9 >>> 24);
        arrby2[9] = (byte)(arrn2[arrn3[arrby4[2]] >>> 16 & 255] ^ n9 >>> 16);
        arrby2[10] = (byte)(arrn2[arrn3[arrn[2]] >>> 8 & 255] ^ n9 >>> 8);
        arrby2[11] = (byte)(n9 ^ arrn2[arrn3[arrby5[2]] & 255]);
        n8 = arrby[n8 + 3];
        arrby2[12] = (byte)(arrn2[arrn3[arrby3[3]] >>> 24] ^ n8 >>> 24);
        arrby2[13] = (byte)(arrn2[arrn3[arrby4[3]] >>> 16 & 255] ^ n8 >>> 16);
        arrby2[14] = (byte)(arrn2[arrn3[arrn[3]] >>> 8 & 255] ^ n8 >>> 8);
        arrby2[15] = (byte)(n8 ^ arrn2[arrn3[arrby5[3]] & 255]);
    }

    public final int available() {
        this.values();
        return this.afErrorLogForExcManagerOnly - this.AFVersionDeclaration;
    }

    public final void close() {
        super.close();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void mark(int n8) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        this.values();
        int n8 = this.AFVersionDeclaration;
        if (n8 >= this.afErrorLogForExcManagerOnly) {
            return -1;
        }
        byte[] arrby = this.afWarnLog;
        this.AFVersionDeclaration = n8 + 1;
        return arrby[n8] & 255;
    }

    public final int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public final int read(byte[] arrby, int n8, int n9) {
        int n10 = n8 + n9;
        for (int i8 = n8; i8 < n10; ++i8) {
            this.values();
            int n11 = this.AFVersionDeclaration;
            if (n11 >= this.afErrorLogForExcManagerOnly) {
                if (i8 == n8) {
                    return -1;
                }
                return n9 - (n10 - i8);
            }
            byte[] arrby2 = this.afWarnLog;
            this.AFVersionDeclaration = n11 + 1;
            arrby[i8] = arrby2[n11];
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void reset() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final long skip(long l8) {
        long l9;
        for (l9 = 0L; l9 < l8 && this.read() != -1; ++l9) {
        }
        return l9;
    }
}

