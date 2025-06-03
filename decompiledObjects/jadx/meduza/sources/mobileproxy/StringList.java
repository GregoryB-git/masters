package mobileproxy;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class StringList implements Seq.Proxy {
    private final int refnum;

    static {
        Mobileproxy.touch();
    }

    public StringList() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    public StringList(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native void append(String str);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof StringList)) {
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
        return "StringList{}";
    }
}
