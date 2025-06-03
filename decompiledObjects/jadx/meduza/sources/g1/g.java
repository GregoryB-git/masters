package g1;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import g1.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends c.i<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ c.j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, c.j jVar) {
        super(obj);
        this.f = jVar;
    }

    @Override // g1.c.i
    public final void a() {
        this.f.f5745a.detach();
    }

    @Override // g1.c.i
    public final void d(List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList(list2.size());
            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.f.a(arrayList);
    }
}
