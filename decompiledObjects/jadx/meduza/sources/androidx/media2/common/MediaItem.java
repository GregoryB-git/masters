package androidx.media2.common;

import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MediaItem extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1027a;

    /* renamed from: b, reason: collision with root package name */
    public MediaMetadata f1028b;

    /* renamed from: c, reason: collision with root package name */
    public long f1029c;

    /* renamed from: d, reason: collision with root package name */
    public long f1030d;

    public MediaItem() {
        this.f1027a = new Object();
        this.f1029c = 0L;
        this.f1030d = 576460752303423487L;
        new ArrayList();
    }

    public MediaItem(MediaMetadata mediaMetadata, long j10, long j11) {
        this.f1027a = new Object();
        this.f1029c = 0L;
        this.f1030d = 576460752303423487L;
        new ArrayList();
        if (j10 > j11) {
            throw new IllegalStateException("Illegal start/end position: " + j10 + " : " + j11);
        }
        if (mediaMetadata != null && mediaMetadata.f1031a.containsKey("android.media.metadata.DURATION")) {
            long j12 = mediaMetadata.f1031a.getLong("android.media.metadata.DURATION", 0L);
            if (j12 != Long.MIN_VALUE && j11 != 576460752303423487L && j11 > j12) {
                throw new IllegalStateException("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=" + j11 + ", durationMs=" + j12);
            }
        }
        this.f1028b = mediaMetadata;
        this.f1029c = j10;
        this.f1030d = j11;
    }

    public final String toString() {
        String str;
        CharSequence charSequence;
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        synchronized (this.f1027a) {
            sb2.append("{Media Id=");
            synchronized (this.f1027a) {
                MediaMetadata mediaMetadata = this.f1028b;
                str = null;
                if (mediaMetadata != null && (charSequence = mediaMetadata.f1031a.getCharSequence("android.media.metadata.MEDIA_ID")) != null) {
                    str = charSequence.toString();
                }
            }
            sb2.append(str);
            sb2.append(", mMetadata=");
            sb2.append(this.f1028b);
            sb2.append(", mStartPositionMs=");
            sb2.append(this.f1029c);
            sb2.append(", mEndPositionMs=");
            sb2.append(this.f1030d);
            sb2.append('}');
        }
        return sb2.toString();
    }
}
