package androidx.media2.common;

import b2.e;

/* loaded from: classes.dex */
public class VideoSize implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f1048a;

    /* renamed from: b, reason: collision with root package name */
    public int f1049b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.f1048a == videoSize.f1048a && this.f1049b == videoSize.f1049b;
    }

    public final int hashCode() {
        int i10 = this.f1049b;
        int i11 = this.f1048a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public final String toString() {
        return this.f1048a + "x" + this.f1049b;
    }
}
