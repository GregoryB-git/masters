package g1;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import g1.c;

/* loaded from: classes.dex */
public final class i extends c.i<MediaBrowserCompat.MediaItem> {
    public final /* synthetic */ c.j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, c.j jVar) {
        super(obj);
        this.f = jVar;
    }

    @Override // g1.c.i
    public final void a() {
        this.f.f5745a.detach();
    }

    @Override // g1.c.i
    public final void d(MediaBrowserCompat.MediaItem mediaItem) {
        Parcel obtain;
        c.j jVar;
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        if (mediaItem2 == null) {
            jVar = this.f;
            obtain = null;
        } else {
            obtain = Parcel.obtain();
            mediaItem2.writeToParcel(obtain, 0);
            jVar = this.f;
        }
        jVar.a(obtain);
    }
}
