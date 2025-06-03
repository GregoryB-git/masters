package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import t.C1958a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: r, reason: collision with root package name */
    public static final C1958a f8179r;

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f8180s;

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f8181t;

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f8182u;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f8183o;

    /* renamed from: p, reason: collision with root package name */
    public MediaMetadata f8184p;

    /* renamed from: q, reason: collision with root package name */
    public MediaDescriptionCompat f8185q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i7) {
            return new MediaMetadataCompat[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f8186a;

        public b() {
            this.f8186a = new Bundle();
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f8186a);
        }

        public b b(String str, Bitmap bitmap) {
            C1958a c1958a = MediaMetadataCompat.f8179r;
            if (!c1958a.containsKey(str) || ((Integer) c1958a.get(str)).intValue() == 2) {
                this.f8186a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j7) {
            C1958a c1958a = MediaMetadataCompat.f8179r;
            if (!c1958a.containsKey(str) || ((Integer) c1958a.get(str)).intValue() == 0) {
                this.f8186a.putLong(str, j7);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, RatingCompat ratingCompat) {
            C1958a c1958a = MediaMetadataCompat.f8179r;
            if (!c1958a.containsKey(str) || ((Integer) c1958a.get(str)).intValue() == 3) {
                this.f8186a.putParcelable(str, (Parcelable) ratingCompat.c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public b e(String str, String str2) {
            C1958a c1958a = MediaMetadataCompat.f8179r;
            if (!c1958a.containsKey(str) || ((Integer) c1958a.get(str)).intValue() == 1) {
                this.f8186a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f8183o);
            this.f8186a = bundle;
            MediaSessionCompat.a(bundle);
        }
    }

    static {
        C1958a c1958a = new C1958a();
        f8179r = c1958a;
        c1958a.put("android.media.metadata.TITLE", 1);
        c1958a.put("android.media.metadata.ARTIST", 1);
        c1958a.put("android.media.metadata.DURATION", 0);
        c1958a.put("android.media.metadata.ALBUM", 1);
        c1958a.put("android.media.metadata.AUTHOR", 1);
        c1958a.put("android.media.metadata.WRITER", 1);
        c1958a.put("android.media.metadata.COMPOSER", 1);
        c1958a.put("android.media.metadata.COMPILATION", 1);
        c1958a.put("android.media.metadata.DATE", 1);
        c1958a.put("android.media.metadata.YEAR", 0);
        c1958a.put("android.media.metadata.GENRE", 1);
        c1958a.put("android.media.metadata.TRACK_NUMBER", 0);
        c1958a.put("android.media.metadata.NUM_TRACKS", 0);
        c1958a.put("android.media.metadata.DISC_NUMBER", 0);
        c1958a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1958a.put("android.media.metadata.ART", 2);
        c1958a.put("android.media.metadata.ART_URI", 1);
        c1958a.put("android.media.metadata.ALBUM_ART", 2);
        c1958a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1958a.put("android.media.metadata.USER_RATING", 3);
        c1958a.put("android.media.metadata.RATING", 3);
        c1958a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1958a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1958a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1958a.put("android.media.metadata.DISPLAY_ICON", 2);
        c1958a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1958a.put("android.media.metadata.MEDIA_ID", 1);
        c1958a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1958a.put("android.media.metadata.MEDIA_URI", 1);
        c1958a.put("android.media.metadata.ADVERTISEMENT", 0);
        c1958a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f8180s = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f8181t = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f8182u = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f8183o = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f8184p = mediaMetadata;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.f8183o.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.f8183o.getParcelable(str);
        } catch (Exception e7) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e7);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.f8183o);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f8185q;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String i7 = i("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence j7 = j("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(j7)) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < 3) {
                String[] strArr = f8180s;
                if (i9 >= strArr.length) {
                    break;
                }
                int i10 = i9 + 1;
                CharSequence j8 = j(strArr[i9]);
                if (!TextUtils.isEmpty(j8)) {
                    charSequenceArr[i8] = j8;
                    i8++;
                }
                i9 = i10;
            }
        } else {
            charSequenceArr[0] = j7;
            charSequenceArr[1] = j("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = j("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i11 = 0;
        while (true) {
            String[] strArr2 = f8181t;
            if (i11 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = c(strArr2[i11]);
            if (bitmap != null) {
                break;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            String[] strArr3 = f8182u;
            if (i12 >= strArr3.length) {
                uri = null;
                break;
            }
            String i13 = i(strArr3[i12]);
            if (!TextUtils.isEmpty(i13)) {
                uri = Uri.parse(i13);
                break;
            }
            i12++;
        }
        String i14 = i("android.media.metadata.MEDIA_URI");
        Uri parse = TextUtils.isEmpty(i14) ? null : Uri.parse(i14);
        MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
        dVar.f(i7);
        dVar.i(charSequenceArr[0]);
        dVar.h(charSequenceArr[1]);
        dVar.b(charSequenceArr[2]);
        dVar.d(bitmap);
        dVar.e(uri);
        dVar.g(parse);
        Bundle bundle = new Bundle();
        if (this.f8183o.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f8183o.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dVar.c(bundle);
        }
        MediaDescriptionCompat a7 = dVar.a();
        this.f8185q = a7;
        return a7;
    }

    public long f(String str) {
        return this.f8183o.getLong(str, 0L);
    }

    public Object g() {
        if (this.f8184p == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f8184p = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f8184p;
    }

    public RatingCompat h(String str) {
        try {
            return RatingCompat.a(this.f8183o.getParcelable(str));
        } catch (Exception e7) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e7);
            return null;
        }
    }

    public String i(String str) {
        CharSequence charSequence = this.f8183o.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence j(String str) {
        return this.f8183o.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f8183o);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f8183o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
