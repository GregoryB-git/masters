package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import defpackage.g;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final r.b<String, Integer> f452d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f453e;
    public static final String[] f;

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f454o;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f455a;

    /* renamed from: b, reason: collision with root package name */
    public MediaMetadata f456b;

    /* renamed from: c, reason: collision with root package name */
    public MediaDescriptionCompat f457c;

    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f458a;

        public b() {
            this.f458a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f455a);
            this.f458a = bundle;
            MediaSessionCompat.a(bundle);
        }

        public final void a(Bitmap bitmap, String str) {
            r.b<String, Integer> bVar = MediaMetadataCompat.f452d;
            if (bVar.containsKey(str) && bVar.getOrDefault(str, null).intValue() != 2) {
                throw new IllegalArgumentException(g.e("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.f458a.putParcelable(str, bitmap);
        }

        public final void b(String str, long j10) {
            r.b<String, Integer> bVar = MediaMetadataCompat.f452d;
            if (bVar.containsKey(str) && bVar.getOrDefault(str, null).intValue() != 0) {
                throw new IllegalArgumentException(g.e("The ", str, " key cannot be used to put a long"));
            }
            this.f458a.putLong(str, j10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            if (r6 == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (r6 != false) goto L41;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String r11, android.support.v4.media.RatingCompat r12) {
            /*
                r10 = this;
                r.b<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.f452d
                boolean r1 = r0.containsKey(r11)
                r2 = 3
                r3 = 0
                if (r1 == 0) goto L25
                java.lang.Object r0 = r0.getOrDefault(r11, r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 != r2) goto L17
                goto L25
            L17:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a Rating"
                java.lang.String r11 = defpackage.g.e(r0, r11, r1)
                r12.<init>(r11)
                throw r12
            L25:
                android.os.Bundle r0 = r10.f458a
                java.lang.Object r1 = r12.f461c
                if (r1 != 0) goto L94
                float r1 = r12.f460b
                r4 = 0
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                r6 = 1
                r7 = 0
                if (r5 < 0) goto L36
                r5 = r6
                goto L37
            L36:
                r5 = r7
            L37:
                if (r5 == 0) goto L8c
                int r5 = r12.f459a
                r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9 = 1065353216(0x3f800000, float:1.0)
                switch(r5) {
                    case 1: goto L7d;
                    case 2: goto L6d;
                    case 3: goto L55;
                    case 4: goto L55;
                    case 5: goto L55;
                    case 6: goto L44;
                    default: goto L42;
                }
            L42:
                goto L96
            L44:
                r2 = 6
                if (r5 != r2) goto L4f
                int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r2 < 0) goto L4c
                goto L4d
            L4c:
                r6 = r7
            L4d:
                if (r6 != 0) goto L50
            L4f:
                r1 = r8
            L50:
                android.media.Rating r1 = android.support.v4.media.RatingCompat.b.h(r1)
                goto L92
            L55:
                if (r5 == r2) goto L5e
                r2 = 4
                if (r5 == r2) goto L5e
                r2 = 5
                if (r5 == r2) goto L5e
                goto L67
            L5e:
                int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r2 < 0) goto L63
                goto L64
            L63:
                r6 = r7
            L64:
                if (r6 == 0) goto L67
                goto L68
            L67:
                r1 = r8
            L68:
                android.media.Rating r1 = android.support.v4.media.RatingCompat.b.i(r5, r1)
                goto L92
            L6d:
                r2 = 2
                if (r5 == r2) goto L71
                goto L78
            L71:
                int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r1 != 0) goto L76
                goto L77
            L76:
                r6 = r7
            L77:
                r7 = r6
            L78:
                android.media.Rating r1 = android.support.v4.media.RatingCompat.b.j(r7)
                goto L92
            L7d:
                if (r5 == r6) goto L80
                goto L87
            L80:
                int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r1 != 0) goto L85
                goto L86
            L85:
                r6 = r7
            L86:
                r7 = r6
            L87:
                android.media.Rating r1 = android.support.v4.media.RatingCompat.b.g(r7)
                goto L92
            L8c:
                int r1 = r12.f459a
                android.media.Rating r1 = android.support.v4.media.RatingCompat.b.k(r1)
            L92:
                r12.f461c = r1
            L94:
                java.lang.Object r3 = r12.f461c
            L96:
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                r0.putParcelable(r11, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaMetadataCompat.b.c(java.lang.String, android.support.v4.media.RatingCompat):void");
        }

        public final void d(String str, String str2) {
            r.b<String, Integer> bVar = MediaMetadataCompat.f452d;
            if (bVar.containsKey(str) && bVar.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(g.e("The ", str, " key cannot be used to put a String"));
            }
            this.f458a.putCharSequence(str, str2);
        }
    }

    static {
        r.b<String, Integer> bVar = new r.b<>();
        f452d = bVar;
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
        bVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        bVar.put("android.media.metadata.MEDIA_URI", 1);
        bVar.put("android.media.metadata.ADVERTISEMENT", 0);
        bVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f453e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f454o = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f455a = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f455a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final MediaDescriptionCompat a() {
        Bitmap bitmap;
        Uri uri;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f457c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String b10 = b("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence = this.f455a.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = f453e;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence charSequence2 = this.f455a.getCharSequence(strArr[i11]);
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i10] = charSequence2;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = this.f455a.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = this.f455a.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = f;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap2 = (Bitmap) this.f455a.getParcelable(strArr2[i13]);
            } catch (Exception e10) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e10);
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = f454o;
            if (i14 >= strArr3.length) {
                uri = null;
                break;
            }
            String b11 = b(strArr3[i14]);
            if (!TextUtils.isEmpty(b11)) {
                uri = Uri.parse(b11);
                break;
            }
            i14++;
        }
        String b12 = b("android.media.metadata.MEDIA_URI");
        Uri parse = !TextUtils.isEmpty(b12) ? Uri.parse(b12) : null;
        CharSequence charSequence3 = charSequenceArr[0];
        CharSequence charSequence4 = charSequenceArr[1];
        CharSequence charSequence5 = charSequenceArr[2];
        Bundle bundle = new Bundle();
        if (this.f455a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.f455a.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (this.f455a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.f455a.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(b10, charSequence3, charSequence4, charSequence5, bitmap, uri, bundle.isEmpty() ? null : bundle, parse);
        this.f457c = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public final String b(String str) {
        CharSequence charSequence = this.f455a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f455a);
    }
}
