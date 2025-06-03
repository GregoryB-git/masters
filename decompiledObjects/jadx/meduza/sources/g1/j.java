package g1;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import g1.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends c.i<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ c.j f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f5754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c.g f5755h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c.g gVar, Object obj, c.j jVar, Bundle bundle) {
        super(obj);
        this.f5755h = gVar;
        this.f = jVar;
        this.f5754g = bundle;
    }

    @Override // g1.c.i
    public final void a() {
        this.f.f5745a.detach();
    }

    @Override // g1.c.i
    public final void d(List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList;
        c.j jVar;
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 == null) {
            jVar = this.f;
            arrayList = null;
        } else {
            if ((this.f5744e & 1) != 0) {
                c cVar = c.this;
                Bundle bundle = this.f5754g;
                cVar.getClass();
                list2 = c.a(list2, bundle);
            }
            arrayList = new ArrayList(list2.size());
            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
            jVar = this.f;
        }
        jVar.a(arrayList);
    }
}
