// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media;

import android.media.MediaDescription$Builder;
import android.os.BaseBundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaDescriptionCompat> CREATOR;
    public final String o;
    public final CharSequence p;
    public final CharSequence q;
    public final CharSequence r;
    public final Bitmap s;
    public final Uri t;
    public final Bundle u;
    public final Uri v;
    public MediaDescription w;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public MediaDescriptionCompat a(final Parcel parcel) {
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            }
            
            public MediaDescriptionCompat[] b(final int n) {
                return new MediaDescriptionCompat[n];
            }
        };
    }
    
    public MediaDescriptionCompat(final String o, final CharSequence p8, final CharSequence q, final CharSequence r, final Bitmap s, final Uri t, final Bundle u, final Uri v) {
        this.o = o;
        this.p = p8;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    public static MediaDescriptionCompat a(final Object o) {
        MediaDescriptionCompat a = null;
        final BaseBundle baseBundle = null;
        if (o != null) {
            final d d = new d();
            final MediaDescription w = (MediaDescription)o;
            d.f(b.g(w));
            d.i(b.i(w));
            d.h(b.h(w));
            d.b(b.c(w));
            d.d(b.e(w));
            d.e(b.f(w));
            final Bundle d2 = b.d(w);
            Bundle u;
            if ((u = d2) != null) {
                u = MediaSessionCompat.u(d2);
            }
            Uri uri;
            if (u != null) {
                uri = (Uri)u.getParcelable("android.support.v4.media.description.MEDIA_URI");
            }
            else {
                uri = null;
            }
            if (uri != null) {
                if (((BaseBundle)u).containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && ((BaseBundle)u).size() == 2) {
                    u = (Bundle)baseBundle;
                }
                else {
                    u.remove("android.support.v4.media.description.MEDIA_URI");
                    u.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            d.c(u);
            if (uri != null) {
                d.g(uri);
            }
            else {
                d.g(c.a(w));
            }
            a = d.a();
            a.w = w;
        }
        return a;
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
        MediaDescription w;
        if ((w = this.w) == null) {
            final MediaDescription$Builder b = MediaDescriptionCompat.b.b();
            MediaDescriptionCompat.b.n(b, this.o);
            MediaDescriptionCompat.b.p(b, this.p);
            MediaDescriptionCompat.b.o(b, this.q);
            MediaDescriptionCompat.b.j(b, this.r);
            MediaDescriptionCompat.b.l(b, this.s);
            MediaDescriptionCompat.b.m(b, this.t);
            MediaDescriptionCompat.b.k(b, this.u);
            c.b(b, this.v);
            w = MediaDescriptionCompat.b.a(b);
            this.w = w;
        }
        return w;
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.p);
        sb.append(", ");
        sb.append((Object)this.q);
        sb.append(", ");
        sb.append((Object)this.r);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ((MediaDescription)this.f()).writeToParcel(parcel, n);
    }
    
    public abstract static class b
    {
        public static MediaDescription a(final MediaDescription$Builder mediaDescription$Builder) {
            return mediaDescription$Builder.build();
        }
        
        public static MediaDescription$Builder b() {
            return new MediaDescription$Builder();
        }
        
        public static CharSequence c(final MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }
        
        public static Bundle d(final MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }
        
        public static Bitmap e(final MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }
        
        public static Uri f(final MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }
        
        public static String g(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }
        
        public static CharSequence h(final MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }
        
        public static CharSequence i(final MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }
        
        public static void j(final MediaDescription$Builder mediaDescription$Builder, final CharSequence description) {
            mediaDescription$Builder.setDescription(description);
        }
        
        public static void k(final MediaDescription$Builder mediaDescription$Builder, final Bundle extras) {
            mediaDescription$Builder.setExtras(extras);
        }
        
        public static void l(final MediaDescription$Builder mediaDescription$Builder, final Bitmap iconBitmap) {
            mediaDescription$Builder.setIconBitmap(iconBitmap);
        }
        
        public static void m(final MediaDescription$Builder mediaDescription$Builder, final Uri iconUri) {
            mediaDescription$Builder.setIconUri(iconUri);
        }
        
        public static void n(final MediaDescription$Builder mediaDescription$Builder, final String mediaId) {
            mediaDescription$Builder.setMediaId(mediaId);
        }
        
        public static void o(final MediaDescription$Builder mediaDescription$Builder, final CharSequence subtitle) {
            mediaDescription$Builder.setSubtitle(subtitle);
        }
        
        public static void p(final MediaDescription$Builder mediaDescription$Builder, final CharSequence title) {
            mediaDescription$Builder.setTitle(title);
        }
    }
    
    public abstract static class c
    {
        public static Uri a(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
        
        public static void b(final MediaDescription$Builder mediaDescription$Builder, final Uri mediaUri) {
            mediaDescription$Builder.setMediaUri(mediaUri);
        }
    }
    
    public static final class d
    {
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
        
        public d b(final CharSequence d) {
            this.d = d;
            return this;
        }
        
        public d c(final Bundle g) {
            this.g = g;
            return this;
        }
        
        public d d(final Bitmap e) {
            this.e = e;
            return this;
        }
        
        public d e(final Uri f) {
            this.f = f;
            return this;
        }
        
        public d f(final String a) {
            this.a = a;
            return this;
        }
        
        public d g(final Uri h) {
            this.h = h;
            return this;
        }
        
        public d h(final CharSequence c) {
            this.c = c;
            return this;
        }
        
        public d i(final CharSequence b) {
            this.b = b;
            return this;
        }
    }
}
