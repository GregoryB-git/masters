package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFc1kSDK {
    public final long AFKeystoreWrapper;

    public AFc1kSDK(long j7) {
        this.AFKeystoreWrapper = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((AFc1kSDK) obj).AFKeystoreWrapper;
    }

    public int hashCode() {
        long j7 = this.AFKeystoreWrapper;
        return (int) (j7 ^ (j7 >>> 32));
    }
}
