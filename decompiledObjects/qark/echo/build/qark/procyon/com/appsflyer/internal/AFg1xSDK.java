// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.io.InputStream;
import java.io.FilterInputStream;

public final class AFg1xSDK extends FilterInputStream
{
    private static final byte[] AFInAppEventParameterName;
    private static final int[] AFInAppEventType;
    private static final int[] AFKeystoreWrapper;
    private static final int[] valueOf;
    private static final int[] values;
    private final int[] AFLogger;
    private int AFVersionDeclaration;
    private final byte[][] afDebugLog;
    private final byte[] afErrorLog;
    private int afErrorLogForExcManagerOnly;
    private final int[] afInfoLog;
    private final int afRDLog;
    private final byte[] afWarnLog;
    private int getLevel;
    
    static {
        AFInAppEventParameterName = AFg1ySDK.AFInAppEventType;
        AFKeystoreWrapper = AFg1ySDK.valueOf;
        values = AFg1ySDK.AFInAppEventParameterName;
        AFInAppEventType = AFg1ySDK.values;
        valueOf = AFg1ySDK.AFKeystoreWrapper;
    }
    
    public AFg1xSDK(final InputStream in, final int afRDLog, final byte[] array, final byte[][] array2) {
        super(in);
        this.AFLogger = new int[4];
        this.afErrorLog = new byte[16];
        this.afWarnLog = new byte[16];
        this.getLevel = Integer.MAX_VALUE;
        this.AFVersionDeclaration = 16;
        this.afErrorLogForExcManagerOnly = 16;
        this.afRDLog = afRDLog;
        this.afInfoLog = AFg1ySDK.valueOf(array, afRDLog);
        this.afDebugLog = valueOf(array2);
    }
    
    private static byte[][] valueOf(final byte[][] array) {
        final byte[][] array2 = new byte[array.length][];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new byte[array[i].length];
            int n = 0;
            while (true) {
                final byte[] array3 = array[i];
                if (n >= array3.length) {
                    break;
                }
                array2[i][array3[n]] = (byte)n;
                ++n;
            }
        }
        return array2;
    }
    
    private int values() {
        if (this.getLevel == Integer.MAX_VALUE) {
            this.getLevel = super.in.read();
        }
        final int afVersionDeclaration = this.AFVersionDeclaration;
        final int n = 16;
        if (afVersionDeclaration == 16) {
            final byte[] afErrorLog = this.afErrorLog;
            final int getLevel = this.getLevel;
            afErrorLog[0] = (byte)getLevel;
            if (getLevel < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int off = 1;
            int n2;
            do {
                final int read = super.in.read(this.afErrorLog, off, 16 - off);
                n2 = off;
                if (read <= 0) {
                    break;
                }
                n2 = off + read;
            } while ((off = n2) < 16);
            if (n2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            this.values(this.afErrorLog, this.afWarnLog);
            final int read2 = super.in.read();
            this.getLevel = read2;
            this.AFVersionDeclaration = 0;
            int afErrorLogForExcManagerOnly = n;
            if (read2 < 0) {
                afErrorLogForExcManagerOnly = 16 - (this.afWarnLog[15] & 0xFF);
            }
            this.afErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly;
        }
        return this.afErrorLogForExcManagerOnly;
    }
    
    private void values(final byte[] array, final byte[] array2) {
        final int[] afLogger = this.AFLogger;
        final byte b = array[0];
        final byte b2 = array[1];
        final byte b3 = array[2];
        final byte b4 = array[3];
        final int[] afInfoLog = this.afInfoLog;
        afLogger[0] = ((b << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8 | (b4 & 0xFF)) ^ afInfoLog[0]);
        afLogger[1] = ((array[4] << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF)) ^ afInfoLog[1]);
        afLogger[2] = ((array[8] << 24 | (array[9] & 0xFF) << 16 | (array[10] & 0xFF) << 8 | (array[11] & 0xFF)) ^ afInfoLog[2]);
        afLogger[3] = (afInfoLog[3] ^ ((array[13] & 0xFF) << 16 | array[12] << 24 | (array[14] & 0xFF) << 8 | (array[15] & 0xFF)));
        int n = 4;
        for (int i = 1; i < this.afRDLog; ++i, n += 4) {
            final int[] afKeystoreWrapper = AFg1xSDK.AFKeystoreWrapper;
            final int[] afLogger2 = this.AFLogger;
            final byte[][] afDebugLog = this.afDebugLog;
            final byte[] array3 = afDebugLog[0];
            final int n2 = afKeystoreWrapper[afLogger2[array3[0]] >>> 24];
            final int[] values = AFg1xSDK.values;
            final byte[] array4 = afDebugLog[1];
            final int n3 = values[afLogger2[array4[0]] >>> 16 & 0xFF];
            final int[] afInAppEventType = AFg1xSDK.AFInAppEventType;
            final byte[] array5 = afDebugLog[2];
            final int n4 = afInAppEventType[afLogger2[array5[0]] >>> 8 & 0xFF];
            final int[] valueOf = AFg1xSDK.valueOf;
            final byte[] array6 = afDebugLog[3];
            final int n5 = valueOf[afLogger2[array6[0]] & 0xFF];
            final int[] afInfoLog2 = this.afInfoLog;
            final int n6 = afInfoLog2[n];
            final int n7 = afKeystoreWrapper[afLogger2[array3[1]] >>> 24];
            final int n8 = values[afLogger2[array4[1]] >>> 16 & 0xFF];
            final int n9 = afInAppEventType[afLogger2[array5[1]] >>> 8 & 0xFF];
            final int n10 = valueOf[afLogger2[array6[1]] & 0xFF];
            final int n11 = afInfoLog2[n + 1];
            final int n12 = afKeystoreWrapper[afLogger2[array3[2]] >>> 24];
            final int n13 = values[afLogger2[array4[2]] >>> 16 & 0xFF];
            final int n14 = afInAppEventType[afLogger2[array5[2]] >>> 8 & 0xFF];
            final int n15 = valueOf[afLogger2[array6[2]] & 0xFF];
            final int n16 = afInfoLog2[n + 2];
            final int n17 = afKeystoreWrapper[afLogger2[array3[3]] >>> 24];
            final int n18 = values[afLogger2[array4[3]] >>> 16 & 0xFF];
            final int n19 = afInAppEventType[afLogger2[array5[3]] >>> 8 & 0xFF];
            final int n20 = valueOf[afLogger2[array6[3]] & 0xFF];
            final int n21 = afInfoLog2[n + 3];
            afLogger2[0] = (n5 ^ (n4 ^ (n2 ^ n3)) ^ n6);
            afLogger2[1] = (n9 ^ (n7 ^ n8) ^ n10 ^ n11);
            afLogger2[2] = (n13 ^ n12 ^ n14 ^ n15 ^ n16);
            afLogger2[3] = (n17 ^ n18 ^ n19 ^ n20 ^ n21);
        }
        final int[] afInfoLog3 = this.afInfoLog;
        final int n22 = afInfoLog3[n];
        final byte[] afInAppEventParameterName = AFg1xSDK.AFInAppEventParameterName;
        final int[] afLogger3 = this.AFLogger;
        final byte[][] afDebugLog2 = this.afDebugLog;
        final byte[] array7 = afDebugLog2[0];
        array2[0] = (byte)(afInAppEventParameterName[afLogger3[array7[0]] >>> 24] ^ n22 >>> 24);
        final byte[] array8 = afDebugLog2[1];
        array2[1] = (byte)(afInAppEventParameterName[afLogger3[array8[0]] >>> 16 & 0xFF] ^ n22 >>> 16);
        final byte[] array9 = afDebugLog2[2];
        array2[2] = (byte)(afInAppEventParameterName[afLogger3[array9[0]] >>> 8 & 0xFF] ^ n22 >>> 8);
        final byte[] array10 = afDebugLog2[3];
        array2[3] = (byte)(afInAppEventParameterName[afLogger3[array10[0]] & 0xFF] ^ n22);
        final int n23 = afInfoLog3[n + 1];
        array2[4] = (byte)(afInAppEventParameterName[afLogger3[array7[1]] >>> 24] ^ n23 >>> 24);
        array2[5] = (byte)(afInAppEventParameterName[afLogger3[array8[1]] >>> 16 & 0xFF] ^ n23 >>> 16);
        array2[6] = (byte)(afInAppEventParameterName[afLogger3[array9[1]] >>> 8 & 0xFF] ^ n23 >>> 8);
        array2[7] = (byte)(n23 ^ afInAppEventParameterName[afLogger3[array10[1]] & 0xFF]);
        final int n24 = afInfoLog3[n + 2];
        array2[8] = (byte)(afInAppEventParameterName[afLogger3[array7[2]] >>> 24] ^ n24 >>> 24);
        array2[9] = (byte)(afInAppEventParameterName[afLogger3[array8[2]] >>> 16 & 0xFF] ^ n24 >>> 16);
        array2[10] = (byte)(afInAppEventParameterName[afLogger3[array9[2]] >>> 8 & 0xFF] ^ n24 >>> 8);
        array2[11] = (byte)(n24 ^ afInAppEventParameterName[afLogger3[array10[2]] & 0xFF]);
        final int n25 = afInfoLog3[n + 3];
        array2[12] = (byte)(afInAppEventParameterName[afLogger3[array7[3]] >>> 24] ^ n25 >>> 24);
        array2[13] = (byte)(afInAppEventParameterName[afLogger3[array8[3]] >>> 16 & 0xFF] ^ n25 >>> 16);
        array2[14] = (byte)(afInAppEventParameterName[afLogger3[array9[3]] >>> 8 & 0xFF] ^ n25 >>> 8);
        array2[15] = (byte)(n25 ^ afInAppEventParameterName[afLogger3[array10[3]] & 0xFF]);
    }
    
    @Override
    public final int available() {
        this.values();
        return this.afErrorLogForExcManagerOnly - this.AFVersionDeclaration;
    }
    
    @Override
    public final void close() {
        super.close();
    }
    
    @Override
    public final void mark(final int n) {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    @Override
    public final boolean markSupported() {
        return false;
    }
    
    @Override
    public final int read() {
        this.values();
        final int afVersionDeclaration = this.AFVersionDeclaration;
        if (afVersionDeclaration >= this.afErrorLogForExcManagerOnly) {
            return -1;
        }
        final byte[] afWarnLog = this.afWarnLog;
        this.AFVersionDeclaration = afVersionDeclaration + 1;
        return afWarnLog[afVersionDeclaration] & 0xFF;
    }
    
    @Override
    public final int read(final byte[] b) {
        return this.read(b, 0, b.length);
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) {
        final int n3 = n + n2;
        int i = n;
        while (i < n3) {
            this.values();
            final int afVersionDeclaration = this.AFVersionDeclaration;
            if (afVersionDeclaration >= this.afErrorLogForExcManagerOnly) {
                if (i == n) {
                    return -1;
                }
                return n2 - (n3 - i);
            }
            else {
                final byte[] afWarnLog = this.afWarnLog;
                this.AFVersionDeclaration = afVersionDeclaration + 1;
                array[i] = afWarnLog[afVersionDeclaration];
                ++i;
            }
        }
        return n2;
    }
    
    @Override
    public final void reset() {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    @Override
    public final long skip(final long n) {
        long n2;
        for (n2 = 0L; n2 < n && this.read() != -1; ++n2) {}
        return n2;
    }
}
