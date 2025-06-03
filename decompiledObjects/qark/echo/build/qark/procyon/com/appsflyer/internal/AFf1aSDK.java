// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.io.InputStream;
import java.io.FilterInputStream;

public final class AFf1aSDK extends FilterInputStream
{
    private byte[] AFInAppEventParameterName;
    private long[] AFInAppEventType;
    private short AFKeystoreWrapper;
    private int afDebugLog;
    private int afErrorLog;
    private int afInfoLog;
    private final int valueOf;
    private long[] values;
    
    public AFf1aSDK(final InputStream in, final int n, final int n2, final short a, final int n3, final int n4) {
        super(in);
        this.afDebugLog = Integer.MAX_VALUE;
        final int min = Math.min(Math.max(a, 4), 8);
        this.valueOf = min;
        this.AFInAppEventParameterName = new byte[min];
        this.AFInAppEventType = new long[4];
        this.values = new long[4];
        this.afInfoLog = min;
        this.afErrorLog = min;
        this.AFInAppEventType = AFg1zSDK.AFInAppEventType(n ^ n4, min ^ n4);
        this.values = AFg1zSDK.AFInAppEventType(n2 ^ n4, n3 ^ n4);
    }
    
    private void AFKeystoreWrapper() {
        final long[] afInAppEventType = this.AFInAppEventType;
        final long[] values = this.values;
        final short afKeystoreWrapper = this.AFKeystoreWrapper;
        final long n = afInAppEventType[afKeystoreWrapper % 4];
        final long n2 = values[(afKeystoreWrapper + 2) % 4];
        final int n3 = (afKeystoreWrapper + 3) % 4;
        values[n3] = (afInAppEventType[n3] * 2147483085L + n2) / 2147483647L;
        afInAppEventType[n3] = (n * 2147483085L + n2) % 2147483647L;
        for (int i = 0; i < this.valueOf; ++i) {
            final byte[] afInAppEventParameterName = this.AFInAppEventParameterName;
            afInAppEventParameterName[i] = (byte)((long)afInAppEventParameterName[i] ^ (this.AFInAppEventType[this.AFKeystoreWrapper] >> (i << 3) & 0xFFL));
        }
        this.AFKeystoreWrapper = (short)((this.AFKeystoreWrapper + 1) % 4);
    }
    
    private int valueOf() {
        if (this.afDebugLog == Integer.MAX_VALUE) {
            this.afDebugLog = super.in.read();
        }
        if (this.afInfoLog == this.valueOf) {
            final byte[] afInAppEventParameterName = this.AFInAppEventParameterName;
            final int afDebugLog = this.afDebugLog;
            afInAppEventParameterName[0] = (byte)afDebugLog;
            if (afDebugLog < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int off = 1;
            int n;
            do {
                final int read = super.in.read(this.AFInAppEventParameterName, off, this.valueOf - off);
                n = off;
                if (read <= 0) {
                    break;
                }
                n = off + read;
            } while ((off = n) < this.valueOf);
            if (n < this.valueOf) {
                throw new IllegalStateException("unexpected block size");
            }
            this.AFKeystoreWrapper();
            final int read2 = super.in.read();
            this.afDebugLog = read2;
            this.afInfoLog = 0;
            int valueOf2;
            if (read2 < 0) {
                final int valueOf = this.valueOf;
                valueOf2 = valueOf - (this.AFInAppEventParameterName[valueOf - 1] & 0xFF);
            }
            else {
                valueOf2 = this.valueOf;
            }
            this.afErrorLog = valueOf2;
        }
        return this.afErrorLog;
    }
    
    @Override
    public final int available() {
        this.valueOf();
        return this.afErrorLog - this.afInfoLog;
    }
    
    @Override
    public final boolean markSupported() {
        return false;
    }
    
    @Override
    public final int read() {
        this.valueOf();
        final int afInfoLog = this.afInfoLog;
        if (afInfoLog >= this.afErrorLog) {
            return -1;
        }
        final byte[] afInAppEventParameterName = this.AFInAppEventParameterName;
        this.afInfoLog = afInfoLog + 1;
        return afInAppEventParameterName[afInfoLog] & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) {
        final int n3 = n + n2;
        int i = n;
        while (i < n3) {
            this.valueOf();
            final int afInfoLog = this.afInfoLog;
            if (afInfoLog >= this.afErrorLog) {
                if (i == n) {
                    return -1;
                }
                return n2 - (n3 - i);
            }
            else {
                final byte[] afInAppEventParameterName = this.AFInAppEventParameterName;
                this.afInfoLog = afInfoLog + 1;
                array[i] = afInAppEventParameterName[afInfoLog];
                ++i;
            }
        }
        return n2;
    }
    
    @Override
    public final long skip(final long n) {
        long n2;
        for (n2 = 0L; n2 < n && this.read() != -1; ++n2) {}
        return n2;
    }
}
