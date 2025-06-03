// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media;

import android.util.Log;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class RatingCompat implements Parcelable
{
    public static final Parcelable$Creator<RatingCompat> CREATOR;
    public final int o;
    public final float p;
    public Object q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public RatingCompat a(final Parcel parcel) {
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            }
            
            public RatingCompat[] b(final int n) {
                return new RatingCompat[n];
            }
        };
    }
    
    public RatingCompat(final int o, final float p2) {
        this.o = o;
        this.p = p2;
    }
    
    public static RatingCompat a(final Object q) {
        RatingCompat ratingCompat = null;
        if (q != null) {
            final Rating rating = (Rating)q;
            final int b = RatingCompat.b.b(rating);
            if (RatingCompat.b.e(rating)) {
                switch (b) {
                    default: {
                        return null;
                    }
                    case 6: {
                        ratingCompat = j(RatingCompat.b.a(rating));
                        break;
                    }
                    case 3:
                    case 4:
                    case 5: {
                        ratingCompat = k(b, RatingCompat.b.c(rating));
                        break;
                    }
                    case 2: {
                        ratingCompat = l(RatingCompat.b.f(rating));
                        break;
                    }
                    case 1: {
                        ratingCompat = i(RatingCompat.b.d(rating));
                        break;
                    }
                }
            }
            else {
                ratingCompat = m(b);
            }
            ratingCompat.q = q;
        }
        return ratingCompat;
    }
    
    public static RatingCompat i(final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        return new RatingCompat(1, n);
    }
    
    public static RatingCompat j(final float n) {
        if (n >= 0.0f && n <= 100.0f) {
            return new RatingCompat(6, n);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }
    
    public static RatingCompat k(final int i, final float n) {
        while (true) {
            float n2 = 0.0f;
            Label_0072: {
                if (i == 3) {
                    n2 = 3.0f;
                    break Label_0072;
                }
                if (i == 4) {
                    n2 = 4.0f;
                    break Label_0072;
                }
                if (i == 5) {
                    n2 = 5.0f;
                    break Label_0072;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid rating style (");
                sb.append(i);
                sb.append(") for a star rating");
                final String string = sb.toString();
                Log.e("Rating", string);
                return null;
            }
            if (n >= 0.0f && n <= n2) {
                return new RatingCompat(i, n);
            }
            final String string = "Trying to set out of range star-based rating";
            continue;
        }
    }
    
    public static RatingCompat l(final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        return new RatingCompat(2, n);
    }
    
    public static RatingCompat m(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                return new RatingCompat(n, -1.0f);
            }
        }
    }
    
    public float b() {
        if (this.o == 6 && this.g()) {
            return this.p;
        }
        return -1.0f;
    }
    
    public Object c() {
        if (this.q == null) {
            Rating q = null;
            if (this.g()) {
                final int o = this.o;
                switch (o) {
                    default: {
                        return null;
                    }
                    case 6: {
                        q = b.h(this.b());
                        break;
                    }
                    case 3:
                    case 4:
                    case 5: {
                        q = b.i(o, this.e());
                        break;
                    }
                    case 2: {
                        q = b.j(this.h());
                        break;
                    }
                    case 1: {
                        q = b.g(this.f());
                        break;
                    }
                }
            }
            else {
                q = b.k(this.o);
            }
            this.q = q;
        }
        return this.q;
    }
    
    public int d() {
        return this.o;
    }
    
    public int describeContents() {
        return this.o;
    }
    
    public float e() {
        final int o = this.o;
        if (o == 3 || o == 4 || o == 5) {
            if (this.g()) {
                return this.p;
            }
        }
        return -1.0f;
    }
    
    public boolean f() {
        final int o = this.o;
        boolean b = false;
        if (o != 1) {
            return false;
        }
        if (this.p == 1.0f) {
            b = true;
        }
        return b;
    }
    
    public boolean g() {
        return this.p >= 0.0f;
    }
    
    public boolean h() {
        final int o = this.o;
        boolean b = false;
        if (o != 2) {
            return false;
        }
        if (this.p == 1.0f) {
            b = true;
        }
        return b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.o);
        sb.append(" rating=");
        final float p = this.p;
        String value;
        if (p < 0.0f) {
            value = "unrated";
        }
        else {
            value = String.valueOf(p);
        }
        sb.append(value);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
    }
    
    public abstract static class b
    {
        public static float a(final Rating rating) {
            return rating.getPercentRating();
        }
        
        public static int b(final Rating rating) {
            return rating.getRatingStyle();
        }
        
        public static float c(final Rating rating) {
            return rating.getStarRating();
        }
        
        public static boolean d(final Rating rating) {
            return rating.hasHeart();
        }
        
        public static boolean e(final Rating rating) {
            return rating.isRated();
        }
        
        public static boolean f(final Rating rating) {
            return rating.isThumbUp();
        }
        
        public static Rating g(final boolean b) {
            return Rating.newHeartRating(b);
        }
        
        public static Rating h(final float n) {
            return Rating.newPercentageRating(n);
        }
        
        public static Rating i(final int n, final float n2) {
            return Rating.newStarRating(n, n2);
        }
        
        public static Rating j(final boolean b) {
            return Rating.newThumbRating(b);
        }
        
        public static Rating k(final int n) {
            return Rating.newUnratedRating(n);
        }
    }
}
