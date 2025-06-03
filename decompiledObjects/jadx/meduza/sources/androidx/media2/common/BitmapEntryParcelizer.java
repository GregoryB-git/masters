package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.media2.common.MediaMetadata;
import b2.c;

/* loaded from: classes.dex */
public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(c cVar) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.f1034a = cVar.u(1, bitmapEntry.f1034a);
        bitmapEntry.f1035b = (Bitmap) cVar.s(bitmapEntry.f1035b, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, c cVar) {
        cVar.getClass();
        cVar.O(1, bitmapEntry.f1034a);
        cVar.M(bitmapEntry.f1035b, 2);
    }
}
