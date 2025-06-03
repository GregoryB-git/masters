package androidx.media2.common;

import b2.e;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SubtitleData implements e {

    /* renamed from: a, reason: collision with root package name */
    public long f1045a;

    /* renamed from: b, reason: collision with root package name */
    public long f1046b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1047c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubtitleData.class != obj.getClass()) {
            return false;
        }
        SubtitleData subtitleData = (SubtitleData) obj;
        return this.f1045a == subtitleData.f1045a && this.f1046b == subtitleData.f1046b && Arrays.equals(this.f1047c, subtitleData.f1047c);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f1045a), Long.valueOf(this.f1046b), Integer.valueOf(Arrays.hashCode(this.f1047c)));
    }
}
