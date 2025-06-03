package mobileproxy;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class StreamDialer implements Seq.Proxy {
    private final int refnum;

    static {
        Mobileproxy.touch();
    }

    public StreamDialer(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    public StreamDialer(String str) {
        int __NewStreamDialerFromConfig = __NewStreamDialerFromConfig(str);
        this.refnum = __NewStreamDialerFromConfig;
        Seq.trackGoRef(__NewStreamDialerFromConfig, this);
    }

    private static native int __NewStreamDialerFromConfig(String str);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof StreamDialer)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public String toString() {
        return "StreamDialer{}";
    }
}
