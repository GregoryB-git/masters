package mobileproxy;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Proxy implements Seq.Proxy {
    private final int refnum;

    static {
        Mobileproxy.touch();
    }

    public Proxy() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    public Proxy(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native void addURLProxy(String str, StreamDialer streamDialer);

    public native String address();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Proxy)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public native String host();

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native long port();

    public native void stop(long j10);

    public String toString() {
        return "Proxy{}";
    }
}
