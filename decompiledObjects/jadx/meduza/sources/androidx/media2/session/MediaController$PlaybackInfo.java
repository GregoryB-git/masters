package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import b2.e;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MediaController$PlaybackInfo implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f1092a;

    /* renamed from: b, reason: collision with root package name */
    public int f1093b;

    /* renamed from: c, reason: collision with root package name */
    public int f1094c;

    /* renamed from: d, reason: collision with root package name */
    public int f1095d;

    /* renamed from: e, reason: collision with root package name */
    public AudioAttributesCompat f1096e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaController$PlaybackInfo)) {
            return false;
        }
        MediaController$PlaybackInfo mediaController$PlaybackInfo = (MediaController$PlaybackInfo) obj;
        return this.f1092a == mediaController$PlaybackInfo.f1092a && this.f1093b == mediaController$PlaybackInfo.f1093b && this.f1094c == mediaController$PlaybackInfo.f1094c && this.f1095d == mediaController$PlaybackInfo.f1095d && Objects.equals(this.f1096e, mediaController$PlaybackInfo.f1096e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1092a), Integer.valueOf(this.f1093b), Integer.valueOf(this.f1094c), Integer.valueOf(this.f1095d), this.f1096e);
    }
}
