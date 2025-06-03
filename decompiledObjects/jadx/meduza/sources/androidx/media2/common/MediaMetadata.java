package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b2.e;
import r.b;

/* loaded from: classes.dex */
public final class MediaMetadata extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public Bundle f1031a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1032b;

    /* renamed from: c, reason: collision with root package name */
    public ParcelImplListSlice f1033c;

    public static final class BitmapEntry implements e {

        /* renamed from: a, reason: collision with root package name */
        public String f1034a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f1035b;

        public BitmapEntry() {
        }

        public BitmapEntry(Bitmap bitmap, String str) {
            this.f1034a = str;
            this.f1035b = bitmap;
            int allocationByteCount = bitmap.getAllocationByteCount();
            if (allocationByteCount > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double sqrt = Math.sqrt(262144.0d / allocationByteCount);
                int i10 = (int) (width * sqrt);
                int i11 = (int) (height * sqrt);
                Log.i("MediaMetadata", "Scaling large bitmap of " + width + "x" + height + " into " + i10 + "x" + i11);
                this.f1035b = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
            }
        }
    }

    static {
        b bVar = new b();
        bVar.put("android.media.metadata.TITLE", 1);
        bVar.put("android.media.metadata.ARTIST", 1);
        bVar.put("android.media.metadata.DURATION", 0);
        bVar.put("android.media.metadata.ALBUM", 1);
        bVar.put("android.media.metadata.AUTHOR", 1);
        bVar.put("android.media.metadata.WRITER", 1);
        bVar.put("android.media.metadata.COMPOSER", 1);
        bVar.put("android.media.metadata.COMPILATION", 1);
        bVar.put("android.media.metadata.DATE", 1);
        bVar.put("android.media.metadata.YEAR", 0);
        bVar.put("android.media.metadata.GENRE", 1);
        bVar.put("android.media.metadata.TRACK_NUMBER", 0);
        bVar.put("android.media.metadata.NUM_TRACKS", 0);
        bVar.put("android.media.metadata.DISC_NUMBER", 0);
        bVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        bVar.put("android.media.metadata.ART", 2);
        bVar.put("android.media.metadata.ART_URI", 1);
        bVar.put("android.media.metadata.ALBUM_ART", 2);
        bVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        bVar.put("android.media.metadata.USER_RATING", 3);
        bVar.put("android.media.metadata.RATING", 3);
        bVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        bVar.put("android.media.metadata.DISPLAY_ICON", 2);
        bVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        bVar.put("android.media.metadata.MEDIA_ID", 1);
        bVar.put("android.media.metadata.MEDIA_URI", 1);
        bVar.put("androidx.media2.metadata.RADIO_FREQUENCY", 4);
        bVar.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", 1);
        bVar.put("androidx.media2.metadata.BROWSABLE", 0);
        bVar.put("androidx.media2.metadata.PLAYABLE", 0);
        bVar.put("androidx.media2.metadata.ADVERTISEMENT", 0);
        bVar.put("androidx.media2.metadata.DOWNLOAD_STATUS", 0);
        bVar.put("androidx.media2.metadata.EXTRAS", 5);
    }

    public final String toString() {
        return this.f1031a.toString();
    }
}
