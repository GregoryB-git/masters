package g1;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import g1.c;

/* loaded from: classes.dex */
public final class d extends c.i<MediaBrowserCompat.MediaItem> {
    public final /* synthetic */ android.support.v4.os.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, android.support.v4.os.a aVar) {
        super(str);
        this.f = aVar;
    }

    @Override // g1.c.i
    public final void d(MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        if ((this.f5744e & 2) != 0) {
            this.f.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem2);
        this.f.b(0, bundle);
    }
}
