package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1133a;

    static {
        HashMap hashMap = new HashMap();
        f1133a = new HashMap();
        hashMap.put("android.media.metadata.ADVERTISEMENT", "androidx.media2.metadata.ADVERTISEMENT");
        hashMap.put("android.media.metadata.BT_FOLDER_TYPE", "androidx.media2.metadata.BROWSABLE");
        hashMap.put("android.media.metadata.DOWNLOAD_STATUS", "androidx.media2.metadata.DOWNLOAD_STATUS");
        for (Map.Entry entry : hashMap.entrySet()) {
            HashMap hashMap2 = f1133a;
            if (hashMap2.containsKey(entry.getValue())) {
                throw new RuntimeException("Shouldn't map to the same value");
            }
            hashMap2.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    public static MediaItem a(MediaItem mediaItem) {
        MediaMetadata mediaMetadata;
        if (mediaItem == null || mediaItem.getClass() == MediaItem.class) {
            return mediaItem;
        }
        long j10 = mediaItem.f1029c;
        long j11 = j10 < 0 ? 0L : j10;
        long j12 = mediaItem.f1030d;
        if (j12 < 0) {
            j12 = 576460752303423487L;
        }
        long j13 = j12;
        synchronized (mediaItem.f1027a) {
            mediaMetadata = mediaItem.f1028b;
        }
        return new MediaItem(mediaMetadata, j11, j13);
    }
}
