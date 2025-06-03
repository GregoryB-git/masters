// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media;

import android.os.BaseBundle;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import android.media.MediaMetadata;
import android.os.Bundle;
import t.a;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaMetadataCompat> CREATOR;
    public static final a r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public final Bundle o;
    public MediaMetadata p;
    public MediaDescriptionCompat q;
    
    static {
        final a a = r = new a();
        final Integer value = 1;
        a.put("android.media.metadata.TITLE", value);
        a.put("android.media.metadata.ARTIST", value);
        final Integer value2 = 0;
        a.put("android.media.metadata.DURATION", value2);
        a.put("android.media.metadata.ALBUM", value);
        a.put("android.media.metadata.AUTHOR", value);
        a.put("android.media.metadata.WRITER", value);
        a.put("android.media.metadata.COMPOSER", value);
        a.put("android.media.metadata.COMPILATION", value);
        a.put("android.media.metadata.DATE", value);
        a.put("android.media.metadata.YEAR", value2);
        a.put("android.media.metadata.GENRE", value);
        a.put("android.media.metadata.TRACK_NUMBER", value2);
        a.put("android.media.metadata.NUM_TRACKS", value2);
        a.put("android.media.metadata.DISC_NUMBER", value2);
        a.put("android.media.metadata.ALBUM_ARTIST", value);
        final Integer value3 = 2;
        a.put("android.media.metadata.ART", value3);
        a.put("android.media.metadata.ART_URI", value);
        a.put("android.media.metadata.ALBUM_ART", value3);
        a.put("android.media.metadata.ALBUM_ART_URI", value);
        final Integer value4 = 3;
        a.put("android.media.metadata.USER_RATING", value4);
        a.put("android.media.metadata.RATING", value4);
        a.put("android.media.metadata.DISPLAY_TITLE", value);
        a.put("android.media.metadata.DISPLAY_SUBTITLE", value);
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", value);
        a.put("android.media.metadata.DISPLAY_ICON", value3);
        a.put("android.media.metadata.DISPLAY_ICON_URI", value);
        a.put("android.media.metadata.MEDIA_ID", value);
        a.put("android.media.metadata.BT_FOLDER_TYPE", value2);
        a.put("android.media.metadata.MEDIA_URI", value);
        a.put("android.media.metadata.ADVERTISEMENT", value2);
        a.put("android.media.metadata.DOWNLOAD_STATUS", value2);
        s = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
        t = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
        u = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public MediaMetadataCompat a(final Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }
            
            public MediaMetadataCompat[] b(final int n) {
                return new MediaMetadataCompat[n];
            }
        };
    }
    
    public MediaMetadataCompat(Bundle o) {
        o = new Bundle(o);
        MediaSessionCompat.a(this.o = o);
    }
    
    public MediaMetadataCompat(final Parcel parcel) {
        this.o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public static MediaMetadataCompat b(final Object o) {
        if (o != null) {
            final Parcel obtain = Parcel.obtain();
            final MediaMetadata p = (MediaMetadata)o;
            p.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            final MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.p = p;
            return mediaMetadataCompat;
        }
        return null;
    }
    
    public boolean a(final String s) {
        return ((BaseBundle)this.o).containsKey(s);
    }
    
    public Bitmap c(final String s) {
        try {
            return (Bitmap)this.o.getParcelable(s);
        }
        catch (Exception ex) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", (Throwable)ex);
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
        final MediaDescriptionCompat q = this.q;
        if (q != null) {
            return q;
        }
        final String i = this.i("android.media.metadata.MEDIA_ID");
        final CharSequence[] array = new CharSequence[3];
        final CharSequence j = this.j("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(j)) {
            array[0] = j;
            array[1] = this.j("android.media.metadata.DISPLAY_SUBTITLE");
            array[2] = this.j("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        else {
            int n;
            int n2;
            for (int k = n = 0; k < 3; k = n2) {
                final String[] s = MediaMetadataCompat.s;
                if (n >= s.length) {
                    break;
                }
                final CharSequence l = this.j(s[n]);
                n2 = k;
                if (!TextUtils.isEmpty(l)) {
                    array[k] = l;
                    n2 = k + 1;
                }
                ++n;
            }
        }
        int n3 = 0;
        Uri parse;
        Bitmap c;
        while (true) {
            final String[] t = MediaMetadataCompat.t;
            final int length = t.length;
            parse = null;
            if (n3 >= length) {
                c = null;
                break;
            }
            c = this.c(t[n3]);
            if (c != null) {
                break;
            }
            ++n3;
        }
        int n4 = 0;
        Uri parse2;
        while (true) {
            final String[] u = MediaMetadataCompat.u;
            if (n4 >= u.length) {
                parse2 = null;
                break;
            }
            final String m = this.i(u[n4]);
            if (!TextUtils.isEmpty((CharSequence)m)) {
                parse2 = Uri.parse(m);
                break;
            }
            ++n4;
        }
        final String i2 = this.i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty((CharSequence)i2)) {
            parse = Uri.parse(i2);
        }
        final MediaDescriptionCompat.d d = new MediaDescriptionCompat.d();
        d.f(i);
        d.i(array[0]);
        d.h(array[1]);
        d.b(array[2]);
        d.d(c);
        d.e(parse2);
        d.g(parse);
        final Bundle bundle = new Bundle();
        if (((BaseBundle)this.o).containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            ((BaseBundle)bundle).putLong("android.media.extra.BT_FOLDER_TYPE", this.f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (((BaseBundle)this.o).containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            ((BaseBundle)bundle).putLong("android.media.extra.DOWNLOAD_STATUS", this.f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!((BaseBundle)bundle).isEmpty()) {
            d.c(bundle);
        }
        return this.q = d.a();
    }
    
    public long f(final String s) {
        return ((BaseBundle)this.o).getLong(s, 0L);
    }
    
    public Object g() {
        if (this.p == null) {
            final Parcel obtain = Parcel.obtain();
            this.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.p = (MediaMetadata)MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.p;
    }
    
    public RatingCompat h(final String s) {
        try {
            return RatingCompat.a(this.o.getParcelable(s));
        }
        catch (Exception ex) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", (Throwable)ex);
            return null;
        }
    }
    
    public String i(final String s) {
        final CharSequence charSequence = this.o.getCharSequence(s);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
    
    public CharSequence j(final String s) {
        return this.o.getCharSequence(s);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.o);
    }
    
    public static final class b
    {
        public final Bundle a;
        
        public b() {
            this.a = new Bundle();
        }
        
        public b(final MediaMetadataCompat mediaMetadataCompat) {
            MediaSessionCompat.a(this.a = new Bundle(mediaMetadataCompat.o));
        }
        
        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }
        
        public b b(final String str, final Bitmap bitmap) {
            final a r = MediaMetadataCompat.r;
            if (r.containsKey(str) && (int)r.get(str) != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a Bitmap");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putParcelable(str, (Parcelable)bitmap);
            return this;
        }
        
        public b c(final String str, final long n) {
            final a r = MediaMetadataCompat.r;
            if (r.containsKey(str) && (int)r.get(str) != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a long");
                throw new IllegalArgumentException(sb.toString());
            }
            ((BaseBundle)this.a).putLong(str, n);
            return this;
        }
        
        public b d(final String str, final RatingCompat ratingCompat) {
            final a r = MediaMetadataCompat.r;
            if (r.containsKey(str) && (int)r.get(str) != 3) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a Rating");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putParcelable(str, (Parcelable)ratingCompat.c());
            return this;
        }
        
        public b e(final String str, final String s) {
            final a r = MediaMetadataCompat.r;
            if (r.containsKey(str) && (int)r.get(str) != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a String");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putCharSequence(str, (CharSequence)s);
            return this;
        }
    }
}
