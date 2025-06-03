package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFg1xSDK extends FilterInputStream {
    private final int[] AFLogger;
    private int AFVersionDeclaration;
    private final byte[][] afDebugLog;
    private final byte[] afErrorLog;
    private int afErrorLogForExcManagerOnly;
    private final int[] afInfoLog;
    private final int afRDLog;
    private final byte[] afWarnLog;
    private int getLevel;
    private static final byte[] AFInAppEventParameterName = AFg1ySDK.AFInAppEventType;
    private static final int[] AFKeystoreWrapper = AFg1ySDK.valueOf;
    private static final int[] values = AFg1ySDK.AFInAppEventParameterName;
    private static final int[] AFInAppEventType = AFg1ySDK.values;
    private static final int[] valueOf = AFg1ySDK.AFKeystoreWrapper;

    public AFg1xSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.AFLogger = new int[4];
        this.afErrorLog = new byte[16];
        this.afWarnLog = new byte[16];
        this.getLevel = Integer.MAX_VALUE;
        this.AFVersionDeclaration = 16;
        this.afErrorLogForExcManagerOnly = 16;
        this.afRDLog = i7;
        this.afInfoLog = AFg1ySDK.valueOf(bArr, i7);
        this.afDebugLog = valueOf(bArr2);
    }

    private static byte[][] valueOf(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = new byte[bArr[i7].length];
            int i8 = 0;
            while (true) {
                byte[] bArr3 = bArr[i7];
                if (i8 < bArr3.length) {
                    bArr2[i7][bArr3[i8]] = (byte) i8;
                    i8++;
                }
            }
        }
        return bArr2;
    }

    private int values() {
        if (this.getLevel == Integer.MAX_VALUE) {
            this.getLevel = ((FilterInputStream) this).in.read();
        }
        if (this.AFVersionDeclaration == 16) {
            byte[] bArr = this.afErrorLog;
            int i7 = this.getLevel;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.afErrorLog, i8, 16 - i8);
                if (read <= 0) {
                    break;
                }
                i8 += read;
            } while (i8 < 16);
            if (i8 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            values(this.afErrorLog, this.afWarnLog);
            int read2 = ((FilterInputStream) this).in.read();
            this.getLevel = read2;
            this.AFVersionDeclaration = 0;
            this.afErrorLogForExcManagerOnly = read2 < 0 ? 16 - (this.afWarnLog[15] & 255) : 16;
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        values();
        return this.afErrorLogForExcManagerOnly - this.AFVersionDeclaration;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        values();
        int i7 = this.AFVersionDeclaration;
        if (i7 >= this.afErrorLogForExcManagerOnly) {
            return -1;
        }
        byte[] bArr = this.afWarnLog;
        this.AFVersionDeclaration = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        long j8 = 0;
        while (j8 < j7 && read() != -1) {
            j8++;
        }
        return j8;
    }

    private void values(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.AFLogger;
        char c7 = 1;
        int i7 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.afInfoLog;
        iArr[0] = i7 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i8 = 4;
        int i9 = 1;
        while (i9 < this.afRDLog) {
            int[] iArr3 = AFKeystoreWrapper;
            int[] iArr4 = this.AFLogger;
            byte[][] bArr3 = this.afDebugLog;
            byte[] bArr4 = bArr3[0];
            int i10 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = values;
            byte[] bArr5 = bArr3[c7];
            int i11 = i10 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFInAppEventType;
            byte[] bArr6 = bArr3[2];
            int i12 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i11;
            int[] iArr7 = valueOf;
            byte[] bArr7 = bArr3[3];
            int i13 = iArr7[iArr4[bArr7[0]] & 255] ^ i12;
            int[] iArr8 = this.afInfoLog;
            int i14 = i13 ^ iArr8[i8];
            int i15 = ((iArr6[(iArr4[bArr6[c7]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c7]] >>> 24] ^ iArr5[(iArr4[bArr5[c7]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c7]] & 255]) ^ iArr8[i8 + 1];
            int i16 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i8 + 2];
            int i17 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i8 + 3];
            iArr4[0] = i14;
            iArr4[1] = i15;
            iArr4[2] = i16;
            iArr4[3] = i17;
            i9++;
            i8 += 4;
            c7 = 1;
        }
        int[] iArr9 = this.afInfoLog;
        int i18 = iArr9[i8];
        byte[] bArr8 = AFInAppEventParameterName;
        int[] iArr10 = this.AFLogger;
        byte[][] bArr9 = this.afDebugLog;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i18 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i18 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i18 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i18);
        int i19 = iArr9[i8 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i19 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i19 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i19 >>> 8));
        bArr2[7] = (byte) (i19 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i20 = iArr9[i8 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i20 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i20 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i20 >>> 8));
        bArr2[11] = (byte) (i20 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i21 = iArr9[i8 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i21 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[15] = (byte) (i21 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            values();
            int i11 = this.AFVersionDeclaration;
            if (i11 >= this.afErrorLogForExcManagerOnly) {
                if (i10 == i7) {
                    return -1;
                }
                return i8 - (i9 - i10);
            }
            byte[] bArr2 = this.afWarnLog;
            this.AFVersionDeclaration = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i8;
    }
}
