package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFf1aSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private long[] AFInAppEventType;
    private short AFKeystoreWrapper;
    private int afDebugLog;
    private int afErrorLog;
    private int afInfoLog;
    private final int valueOf;
    private long[] values;

    public AFf1aSDK(InputStream inputStream, int i7, int i8, short s7, int i9, int i10) {
        super(inputStream);
        this.afDebugLog = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s7, 4), 8);
        this.valueOf = min;
        this.AFInAppEventParameterName = new byte[min];
        this.AFInAppEventType = new long[4];
        this.values = new long[4];
        this.afInfoLog = min;
        this.afErrorLog = min;
        this.AFInAppEventType = AFg1zSDK.AFInAppEventType(i7 ^ i10, min ^ i10);
        this.values = AFg1zSDK.AFInAppEventType(i8 ^ i10, i9 ^ i10);
    }

    private void AFKeystoreWrapper() {
        long[] jArr = this.AFInAppEventType;
        long[] jArr2 = this.values;
        short s7 = this.AFKeystoreWrapper;
        long j7 = jArr[s7 % 4] * 2147483085;
        long j8 = jArr2[(s7 + 2) % 4];
        int i7 = (s7 + 3) % 4;
        jArr2[i7] = ((jArr[i7] * 2147483085) + j8) / 2147483647L;
        jArr[i7] = (j7 + j8) % 2147483647L;
        for (int i8 = 0; i8 < this.valueOf; i8++) {
            this.AFInAppEventParameterName[i8] = (byte) (r1[i8] ^ ((this.AFInAppEventType[this.AFKeystoreWrapper] >> (i8 << 3)) & 255));
        }
        this.AFKeystoreWrapper = (short) ((this.AFKeystoreWrapper + 1) % 4);
    }

    private int valueOf() {
        int i7;
        if (this.afDebugLog == Integer.MAX_VALUE) {
            this.afDebugLog = ((FilterInputStream) this).in.read();
        }
        if (this.afInfoLog == this.valueOf) {
            byte[] bArr = this.AFInAppEventParameterName;
            int i8 = this.afDebugLog;
            bArr[0] = (byte) i8;
            if (i8 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i9 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFInAppEventParameterName, i9, this.valueOf - i9);
                if (read <= 0) {
                    break;
                }
                i9 += read;
            } while (i9 < this.valueOf);
            if (i9 < this.valueOf) {
                throw new IllegalStateException("unexpected block size");
            }
            AFKeystoreWrapper();
            int read2 = ((FilterInputStream) this).in.read();
            this.afDebugLog = read2;
            this.afInfoLog = 0;
            if (read2 < 0) {
                int i10 = this.valueOf;
                i7 = i10 - (this.AFInAppEventParameterName[i10 - 1] & 255);
            } else {
                i7 = this.valueOf;
            }
            this.afErrorLog = i7;
        }
        return this.afErrorLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        valueOf();
        return this.afErrorLog - this.afInfoLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        valueOf();
        int i7 = this.afInfoLog;
        if (i7 >= this.afErrorLog) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.afInfoLog = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        long j8 = 0;
        while (j8 < j7 && read() != -1) {
            j8++;
        }
        return j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            valueOf();
            int i11 = this.afInfoLog;
            if (i11 >= this.afErrorLog) {
                if (i10 == i7) {
                    return -1;
                }
                return i8 - (i9 - i10);
            }
            byte[] bArr2 = this.AFInAppEventParameterName;
            this.afInfoLog = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i8;
    }
}
