package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final String f8162o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f8163p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f8164q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f8165r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap f8166s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f8167t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f8168u;

    /* renamed from: v, reason: collision with root package name */
    public final Uri f8169v;

    /* renamed from: w, reason: collision with root package name */
    public MediaDescription f8170w;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i7) {
            return new MediaDescriptionCompat[i7];
        }
    }

    public static class b {
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

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f8171a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f8172b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f8173c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f8174d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap f8175e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f8176f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f8177g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f8178h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f8171a, this.f8172b, this.f8173c, this.f8174d, this.f8175e, this.f8176f, this.f8177g, this.f8178h);
        }

        public d b(CharSequence charSequence) {
            this.f8174d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f8177g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f8175e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f8176f = uri;
            return this;
        }

        public d f(String str) {
            this.f8171a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f8178h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f8173c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f8172b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f8162o = str;
        this.f8163p = charSequence;
        this.f8164q = charSequence2;
        this.f8165r = charSequence3;
        this.f8166s = bitmap;
        this.f8167t = uri;
        this.f8168u = bundle;
        this.f8169v = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L79
            android.support.v4.media.MediaDescriptionCompat$d r1 = new android.support.v4.media.MediaDescriptionCompat$d
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.v4.media.MediaDescriptionCompat.b.g(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.b.i(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.b.h(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.b.c(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.MediaDescriptionCompat.b.e(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.MediaDescriptionCompat.b.f(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.MediaDescriptionCompat.b.d(r8)
            if (r2 == 0) goto L3e
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.u(r2)
        L3e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L49
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4a
        L49:
            r4 = r0
        L4a:
            if (r4 == 0) goto L62
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L5c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L5c
            goto L63
        L5c:
            r2.remove(r3)
            r2.remove(r5)
        L62:
            r0 = r2
        L63:
            r1.c(r0)
            if (r4 == 0) goto L6c
            r1.g(r4)
            goto L73
        L6c:
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r8)
            r1.g(r0)
        L73:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f8170w = r8
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public CharSequence b() {
        return this.f8165r;
    }

    public Bundle c() {
        return this.f8168u;
    }

    public Bitmap d() {
        return this.f8166s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.f8167t;
    }

    public Object f() {
        MediaDescription mediaDescription = this.f8170w;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b7 = b.b();
        b.n(b7, this.f8162o);
        b.p(b7, this.f8163p);
        b.o(b7, this.f8164q);
        b.j(b7, this.f8165r);
        b.l(b7, this.f8166s);
        b.m(b7, this.f8167t);
        b.k(b7, this.f8168u);
        c.b(b7, this.f8169v);
        MediaDescription a7 = b.a(b7);
        this.f8170w = a7;
        return a7;
    }

    public String g() {
        return this.f8162o;
    }

    public Uri h() {
        return this.f8169v;
    }

    public CharSequence i() {
        return this.f8164q;
    }

    public CharSequence j() {
        return this.f8163p;
    }

    public String toString() {
        return ((Object) this.f8163p) + ", " + ((Object) this.f8164q) + ", " + ((Object) this.f8165r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        ((MediaDescription) f()).writeToParcel(parcel, i7);
    }
}
