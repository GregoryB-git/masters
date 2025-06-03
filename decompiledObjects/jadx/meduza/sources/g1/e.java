package g1;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import g1.c;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends c.i<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ android.support.v4.os.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, android.support.v4.os.a aVar) {
        super(str);
        this.f = aVar;
    }

    @Override // g1.c.i
    public final void d(List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if ((this.f5744e & 4) != 0 || list2 == null) {
            this.f.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
        this.f.b(0, bundle);
    }
}
