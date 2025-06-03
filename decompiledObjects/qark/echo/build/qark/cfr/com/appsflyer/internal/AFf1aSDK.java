/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FilterInputStream
 *  java.io.InputStream
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFg1zSDK;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFf1aSDK
extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private long[] AFInAppEventType;
    private short AFKeystoreWrapper;
    private int afDebugLog = Integer.MAX_VALUE;
    private int afErrorLog;
    private int afInfoLog;
    private final int valueOf;
    private long[] values;

    public AFf1aSDK(InputStream inputStream, int n8, int n9, short s8, int n10, int n11) {
        super(inputStream);
        s8 = (short)Math.min((int)Math.max((int)s8, (int)4), (int)8);
        this.valueOf = s8;
        this.AFInAppEventParameterName = new byte[s8];
        this.AFInAppEventType = new long[4];
        this.values = new long[4];
        this.afInfoLog = s8;
        this.afErrorLog = s8;
        this.AFInAppEventType = AFg1zSDK.AFInAppEventType(n8 ^ n11, s8 ^ n11);
        this.values = AFg1zSDK.AFInAppEventType(n9 ^ n11, n10 ^ n11);
    }

    private void AFKeystoreWrapper() {
        long[] arrl = this.AFInAppEventType;
        long[] arrl2 = this.values;
        int n8 = this.AFKeystoreWrapper;
        long l8 = arrl[n8 % 4];
        long l9 = arrl2[(n8 + 2) % 4];
        n8 = (n8 + 3) % 4;
        arrl2[n8] = (arrl[n8] * 2147483085L + l9) / Integer.MAX_VALUE;
        arrl[n8] = (l8 * 2147483085L + l9) % Integer.MAX_VALUE;
        for (n8 = 0; n8 < this.valueOf; ++n8) {
            arrl = this.AFInAppEventParameterName;
            arrl[n8] = (byte)((long)arrl[n8] ^ this.AFInAppEventType[this.AFKeystoreWrapper] >> (n8 << 3) & 255L);
        }
        this.AFKeystoreWrapper = (short)((this.AFKeystoreWrapper + 1) % 4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int valueOf() {
        int n8;
        if (this.afDebugLog == Integer.MAX_VALUE) {
            this.afDebugLog = this.in.read();
        }
        if (this.afInfoLog != this.valueOf) return this.afErrorLog;
        byte[] arrby = this.AFInAppEventParameterName;
        int n9 = this.afDebugLog;
        arrby[0] = (byte)n9;
        if (n9 < 0) throw new IllegalStateException("unexpected block size");
        n9 = 1;
        do {
            int n10 = this.in.read(this.AFInAppEventParameterName, n9, this.valueOf - n9);
            n8 = n9;
            if (n10 <= 0) break;
            n9 = n8 = n9 + n10;
        } while (n8 < this.valueOf);
        if (n8 < this.valueOf) throw new IllegalStateException("unexpected block size");
        this.AFKeystoreWrapper();
        this.afDebugLog = n9 = this.in.read();
        this.afInfoLog = 0;
        if (n9 < 0) {
            n9 = this.valueOf;
            n9 -= this.AFInAppEventParameterName[n9 - 1] & 255;
        } else {
            n9 = this.valueOf;
        }
        this.afErrorLog = n9;
        return this.afErrorLog;
    }

    public final int available() {
        this.valueOf();
        return this.afErrorLog - this.afInfoLog;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        this.valueOf();
        int n8 = this.afInfoLog;
        if (n8 >= this.afErrorLog) {
            return -1;
        }
        byte[] arrby = this.AFInAppEventParameterName;
        this.afInfoLog = n8 + 1;
        return arrby[n8] & 255;
    }

    public final int read(byte[] arrby, int n8, int n9) {
        int n10 = n8 + n9;
        for (int i8 = n8; i8 < n10; ++i8) {
            this.valueOf();
            int n11 = this.afInfoLog;
            if (n11 >= this.afErrorLog) {
                if (i8 == n8) {
                    return -1;
                }
                return n9 - (n10 - i8);
            }
            byte[] arrby2 = this.AFInAppEventParameterName;
            this.afInfoLog = n11 + 1;
            arrby[i8] = arrby2[n11];
        }
        return n9;
    }

    public final long skip(long l8) {
        long l9;
        for (l9 = 0L; l9 < l8 && this.read() != -1; ++l9) {
        }
        return l9;
    }
}

