/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.Bitmap
 *  android.media.MediaMetadata
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import t.a;

@SuppressLint(value={"BanParcelableUsage"})
public final class MediaMetadataCompat
implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final a r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public final Bundle o;
    public MediaMetadata p;
    public MediaDescriptionCompat q;

    static {
        a a8;
        r = a8 = new a();
        Integer n8 = 1;
        a8.put("android.media.metadata.TITLE", (Object)n8);
        a8.put("android.media.metadata.ARTIST", (Object)n8);
        Integer n9 = 0;
        a8.put("android.media.metadata.DURATION", (Object)n9);
        a8.put("android.media.metadata.ALBUM", (Object)n8);
        a8.put("android.media.metadata.AUTHOR", (Object)n8);
        a8.put("android.media.metadata.WRITER", (Object)n8);
        a8.put("android.media.metadata.COMPOSER", (Object)n8);
        a8.put("android.media.metadata.COMPILATION", (Object)n8);
        a8.put("android.media.metadata.DATE", (Object)n8);
        a8.put("android.media.metadata.YEAR", (Object)n9);
        a8.put("android.media.metadata.GENRE", (Object)n8);
        a8.put("android.media.metadata.TRACK_NUMBER", (Object)n9);
        a8.put("android.media.metadata.NUM_TRACKS", (Object)n9);
        a8.put("android.media.metadata.DISC_NUMBER", (Object)n9);
        a8.put("android.media.metadata.ALBUM_ARTIST", (Object)n8);
        Integer n10 = 2;
        a8.put("android.media.metadata.ART", (Object)n10);
        a8.put("android.media.metadata.ART_URI", (Object)n8);
        a8.put("android.media.metadata.ALBUM_ART", (Object)n10);
        a8.put("android.media.metadata.ALBUM_ART_URI", (Object)n8);
        Integer n11 = 3;
        a8.put("android.media.metadata.USER_RATING", (Object)n11);
        a8.put("android.media.metadata.RATING", (Object)n11);
        a8.put("android.media.metadata.DISPLAY_TITLE", (Object)n8);
        a8.put("android.media.metadata.DISPLAY_SUBTITLE", (Object)n8);
        a8.put("android.media.metadata.DISPLAY_DESCRIPTION", (Object)n8);
        a8.put("android.media.metadata.DISPLAY_ICON", (Object)n10);
        a8.put("android.media.metadata.DISPLAY_ICON_URI", (Object)n8);
        a8.put("android.media.metadata.MEDIA_ID", (Object)n8);
        a8.put("android.media.metadata.BT_FOLDER_TYPE", (Object)n9);
        a8.put("android.media.metadata.MEDIA_URI", (Object)n8);
        a8.put("android.media.metadata.ADVERTISEMENT", (Object)n9);
        a8.put("android.media.metadata.DOWNLOAD_STATUS", (Object)n9);
        s = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        t = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        u = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Parcelable.Creator(){

            public MediaMetadataCompat a(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            public MediaMetadataCompat[] b(int n8) {
                return new MediaMetadataCompat[n8];
            }
        };
    }

    public MediaMetadataCompat(Bundle bundle) {
        this.o = bundle = new Bundle(bundle);
        MediaSessionCompat.a(bundle);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat b(Object object) {
        if (object != null) {
            Parcel parcel = Parcel.obtain();
            object = (MediaMetadata)object;
            object.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
            parcel.recycle();
            mediaMetadataCompat.p = object;
            return mediaMetadataCompat;
        }
        return null;
    }

    public boolean a(String string2) {
        return this.o.containsKey(string2);
    }

    public Bitmap c(String string2) {
        try {
            string2 = (Bitmap)this.o.getParcelable(string2);
            return string2;
        }
        catch (Exception exception) {
            Log.w((String)"MediaMetadata", (String)"Failed to retrieve a key as Bitmap.", (Throwable)exception);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.o);
    }

    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Object object;
        Uri uri;
        CharSequence[] arrcharSequence;
        String string2;
        Object object2;
        block13 : {
            int n8;
            block12 : {
                int n9;
                object2 = this.q;
                if (object2 != null) {
                    return object2;
                }
                string2 = this.i("android.media.metadata.MEDIA_ID");
                arrcharSequence = new CharSequence[3];
                object2 = this.j("android.media.metadata.DISPLAY_TITLE");
                if (!TextUtils.isEmpty((CharSequence)object2)) {
                    arrcharSequence[0] = object2;
                    arrcharSequence[1] = this.j("android.media.metadata.DISPLAY_SUBTITLE");
                    arrcharSequence[2] = this.j("android.media.metadata.DISPLAY_DESCRIPTION");
                } else {
                    for (n8 = n9 = 0; n9 < 3 && n8 < (object2 = s).length; ++n8) {
                        object2 = this.j(object2[n8]);
                        int n10 = n9;
                        if (!TextUtils.isEmpty((CharSequence)object2)) {
                            arrcharSequence[n9] = object2;
                            n10 = n9 + 1;
                        }
                        n9 = n10;
                    }
                }
                n8 = 0;
                do {
                    object2 = t;
                    n9 = object2.length;
                    uri = null;
                    if (n8 >= n9) break;
                    if ((object2 = this.c((String)object2[n8])) == null) {
                        ++n8;
                        continue;
                    }
                    break block12;
                    break;
                } while (true);
                object2 = null;
            }
            for (n8 = 0; n8 < (object = u).length; ++n8) {
                if (TextUtils.isEmpty((CharSequence)(object = this.i(object[n8])))) continue;
                object = Uri.parse((String)object);
                break block13;
            }
            object = null;
        }
        Object object3 = this.i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty((CharSequence)object3)) {
            uri = Uri.parse((String)object3);
        }
        object3 = new MediaDescriptionCompat.d();
        object3.f(string2);
        object3.i(arrcharSequence[0]);
        object3.h(arrcharSequence[1]);
        object3.b(arrcharSequence[2]);
        object3.d((Bitmap)object2);
        object3.e((Uri)object);
        object3.g(uri);
        object2 = new Bundle();
        if (this.o.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            object2.putLong("android.media.extra.BT_FOLDER_TYPE", this.f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.o.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            object2.putLong("android.media.extra.DOWNLOAD_STATUS", this.f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!object2.isEmpty()) {
            object3.c((Bundle)object2);
        }
        this.q = object2 = object3.a();
        return object2;
    }

    public long f(String string2) {
        return this.o.getLong(string2, 0L);
    }

    public Object g() {
        if (this.p == null) {
            Parcel parcel = Parcel.obtain();
            this.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            this.p = (MediaMetadata)MediaMetadata.CREATOR.createFromParcel(parcel);
            parcel.recycle();
        }
        return this.p;
    }

    public RatingCompat h(String object) {
        try {
            object = RatingCompat.a((Object)this.o.getParcelable((String)object));
            return object;
        }
        catch (Exception exception) {
            Log.w((String)"MediaMetadata", (String)"Failed to retrieve a key as Rating.", (Throwable)exception);
            return null;
        }
    }

    public String i(String string2) {
        if ((string2 = this.o.getCharSequence(string2)) != null) {
            return string2.toString();
        }
        return null;
    }

    public CharSequence j(String string2) {
        return this.o.getCharSequence(string2);
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeBundle(this.o);
    }

    public static final class b {
        public final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            mediaMetadataCompat = new Bundle(mediaMetadataCompat.o);
            this.a = mediaMetadataCompat;
            MediaSessionCompat.a((Bundle)mediaMetadataCompat);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String string2, Bitmap bitmap) {
            a a8 = MediaMetadataCompat.r;
            if (a8.containsKey(string2) && (Integer)a8.get(string2) != 2) {
                bitmap = new StringBuilder();
                bitmap.append("The ");
                bitmap.append(string2);
                bitmap.append(" key cannot be used to put a Bitmap");
                throw new IllegalArgumentException(bitmap.toString());
            }
            this.a.putParcelable(string2, (Parcelable)bitmap);
            return this;
        }

        public b c(String string2, long l8) {
            a a8 = MediaMetadataCompat.r;
            if (a8.containsKey(string2) && (Integer)a8.get(string2) != 0) {
                a8 = new StringBuilder();
                a8.append("The ");
                a8.append(string2);
                a8.append(" key cannot be used to put a long");
                throw new IllegalArgumentException(a8.toString());
            }
            this.a.putLong(string2, l8);
            return this;
        }

        public b d(String string2, RatingCompat ratingCompat) {
            a a8 = MediaMetadataCompat.r;
            if (a8.containsKey(string2) && (Integer)a8.get(string2) != 3) {
                ratingCompat = new StringBuilder();
                ratingCompat.append("The ");
                ratingCompat.append(string2);
                ratingCompat.append(" key cannot be used to put a Rating");
                throw new IllegalArgumentException(ratingCompat.toString());
            }
            this.a.putParcelable(string2, (Parcelable)ratingCompat.c());
            return this;
        }

        public b e(String string2, String string3) {
            a a8 = MediaMetadataCompat.r;
            if (a8.containsKey(string2) && (Integer)a8.get(string2) != 1) {
                string3 = new StringBuilder();
                string3.append("The ");
                string3.append(string2);
                string3.append(" key cannot be used to put a String");
                throw new IllegalArgumentException(string3.toString());
            }
            this.a.putCharSequence(string2, (CharSequence)string3);
            return this;
        }
    }

}

