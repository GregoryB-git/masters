package androidx.media2.common;

import androidx.versionedparcelable.ParcelImpl;
import b2.e;

/* loaded from: classes.dex */
public final class MediaParcelUtils {

    public static class MediaItemParcelImpl extends ParcelImpl {

        /* renamed from: b, reason: collision with root package name */
        public final MediaItem f1036b;

        public MediaItemParcelImpl(MediaItem mediaItem) {
            super(new MediaItem(mediaItem.f1028b, mediaItem.f1029c, mediaItem.f1030d));
            this.f1036b = mediaItem;
        }

        @Override // androidx.versionedparcelable.ParcelImpl
        public final e a() {
            return this.f1036b;
        }
    }

    public static ParcelImpl a(e eVar) {
        return eVar instanceof MediaItem ? new MediaItemParcelImpl((MediaItem) eVar) : new ParcelImpl(eVar);
    }
}
