/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.Bitmap
 *  android.media.MediaDescription
 *  android.media.MediaDescription$Builder
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint(value={"BanParcelableUsage"})
public final class MediaDescriptionCompat
implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator(){

        public MediaDescriptionCompat a(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public MediaDescriptionCompat[] b(int n8) {
            return new MediaDescriptionCompat[n8];
        }
    };
    public final String o;
    public final CharSequence p;
    public final CharSequence q;
    public final CharSequence r;
    public final Bitmap s;
    public final Uri t;
    public final Bundle u;
    public final Uri v;
    public MediaDescription w;

    public MediaDescriptionCompat(String string2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.o = string2;
        this.p = charSequence;
        this.q = charSequence2;
        this.r = charSequence3;
        this.s = bitmap;
        this.t = uri;
        this.u = bundle;
        this.v = uri2;
    }

    public static MediaDescriptionCompat a(Object object) {
        Object object2 = null;
        Object var2_2 = null;
        if (object != null) {
            d d8 = new d();
            MediaDescription mediaDescription = (MediaDescription)object;
            d8.f(b.g(mediaDescription));
            d8.i(b.i(mediaDescription));
            d8.h(b.h(mediaDescription));
            d8.b(b.c(mediaDescription));
            d8.d(b.e(mediaDescription));
            d8.e(b.f(mediaDescription));
            object = object2 = b.d(mediaDescription);
            if (object2 != null) {
                object = MediaSessionCompat.u((Bundle)object2);
            }
            object2 = object != null ? (Uri)object.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
            if (object2 != null) {
                if (object.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && object.size() == 2) {
                    object = var2_2;
                } else {
                    object.remove("android.support.v4.media.description.MEDIA_URI");
                    object.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            d8.c((Bundle)object);
            if (object2 != null) {
                d8.g((Uri)object2);
            } else {
                d8.g(c.a(mediaDescription));
            }
            object2 = d8.a();
            object2.w = mediaDescription;
        }
        return object2;
    }

    public CharSequence b() {
        return this.r;
    }

    public Bundle c() {
        return this.u;
    }

    public Bitmap d() {
        return this.s;
    }

    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.t;
    }

    public Object f() {
        MediaDescription mediaDescription;
        MediaDescription mediaDescription2 = mediaDescription = this.w;
        if (mediaDescription == null) {
            mediaDescription2 = b.b();
            b.n((MediaDescription.Builder)mediaDescription2, this.o);
            b.p((MediaDescription.Builder)mediaDescription2, this.p);
            b.o((MediaDescription.Builder)mediaDescription2, this.q);
            b.j((MediaDescription.Builder)mediaDescription2, this.r);
            b.l((MediaDescription.Builder)mediaDescription2, this.s);
            b.m((MediaDescription.Builder)mediaDescription2, this.t);
            b.k((MediaDescription.Builder)mediaDescription2, this.u);
            c.b((MediaDescription.Builder)mediaDescription2, this.v);
            this.w = mediaDescription2 = b.a((MediaDescription.Builder)mediaDescription2);
        }
        return mediaDescription2;
    }

    public String g() {
        return this.o;
    }

    public Uri h() {
        return this.v;
    }

    public CharSequence i() {
        return this.q;
    }

    public CharSequence j() {
        return this.p;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.p);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.q);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.r);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        ((MediaDescription)this.f()).writeToParcel(parcel, n8);
    }

    public static abstract class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String string2) {
            builder.setMediaId(string2);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static abstract class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {
        public String a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public d b(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f = uri;
            return this;
        }

        public d f(String string2) {
            this.a = string2;
            return this;
        }

        public d g(Uri uri) {
            this.h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

}

