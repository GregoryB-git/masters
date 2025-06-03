package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.media2.common.MediaMetadata;
import androidx.versionedparcelable.ParcelImpl;
import b2.a;
import b2.c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MediaMetadataParcelizer {
    public static MediaMetadata read(c cVar) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.f1032b = cVar.h(1, mediaMetadata.f1032b);
        mediaMetadata.f1033c = (ParcelImplListSlice) cVar.s(mediaMetadata.f1033c, 2);
        Bundle bundle = mediaMetadata.f1032b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        mediaMetadata.f1031a = bundle;
        ParcelImplListSlice parcelImplListSlice = mediaMetadata.f1033c;
        if (parcelImplListSlice != null) {
            Iterator<ParcelImpl> it = parcelImplListSlice.f1037a.iterator();
            while (it.hasNext()) {
                MediaMetadata.BitmapEntry bitmapEntry = (MediaMetadata.BitmapEntry) a.a(it.next());
                mediaMetadata.f1031a.putParcelable(bitmapEntry.f1034a, bitmapEntry.f1035b);
            }
        }
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, c cVar) {
        cVar.getClass();
        synchronized (mediaMetadata.f1031a) {
            try {
                if (mediaMetadata.f1032b == null) {
                    mediaMetadata.f1032b = new Bundle(mediaMetadata.f1031a);
                    ArrayList arrayList = new ArrayList();
                    for (String str : mediaMetadata.f1031a.keySet()) {
                        Object obj = mediaMetadata.f1031a.get(str);
                        if (obj instanceof Bitmap) {
                            arrayList.add(MediaParcelUtils.a(new MediaMetadata.BitmapEntry((Bitmap) obj, str)));
                            mediaMetadata.f1032b.remove(str);
                        }
                    }
                    mediaMetadata.f1033c = new ParcelImplListSlice(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        cVar.B(1, mediaMetadata.f1032b);
        cVar.M(mediaMetadata.f1033c, 2);
    }
}
