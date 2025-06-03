package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final int f8187o;

    /* renamed from: p, reason: collision with root package name */
    public final float f8188p;

    /* renamed from: q, reason: collision with root package name */
    public Object f8189q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i7) {
            return new RatingCompat[i7];
        }
    }

    public static class b {
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating g(boolean z7) {
            return Rating.newHeartRating(z7);
        }

        public static Rating h(float f7) {
            return Rating.newPercentageRating(f7);
        }

        public static Rating i(int i7, float f7) {
            return Rating.newStarRating(i7, f7);
        }

        public static Rating j(boolean z7) {
            return Rating.newThumbRating(z7);
        }

        public static Rating k(int i7) {
            return Rating.newUnratedRating(i7);
        }
    }

    public RatingCompat(int i7, float f7) {
        this.f8187o = i7;
        this.f8188p = f7;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b7 = b.b(rating);
            if (b.e(rating)) {
                switch (b7) {
                    case 1:
                        ratingCompat = i(b.d(rating));
                        break;
                    case 2:
                        ratingCompat = l(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = k(b7, b.c(rating));
                        break;
                    case 6:
                        ratingCompat = j(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m(b7);
            }
            ratingCompat.f8189q = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat i(boolean z7) {
        return new RatingCompat(1, z7 ? 1.0f : 0.0f);
    }

    public static RatingCompat j(float f7) {
        if (f7 >= 0.0f && f7 <= 100.0f) {
            return new RatingCompat(6, f7);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat k(int i7, float f7) {
        float f8;
        String str;
        if (i7 == 3) {
            f8 = 3.0f;
        } else if (i7 == 4) {
            f8 = 4.0f;
        } else {
            if (i7 != 5) {
                str = "Invalid rating style (" + i7 + ") for a star rating";
                Log.e("Rating", str);
                return null;
            }
            f8 = 5.0f;
        }
        if (f7 >= 0.0f && f7 <= f8) {
            return new RatingCompat(i7, f7);
        }
        str = "Trying to set out of range star-based rating";
        Log.e("Rating", str);
        return null;
    }

    public static RatingCompat l(boolean z7) {
        return new RatingCompat(2, z7 ? 1.0f : 0.0f);
    }

    public static RatingCompat m(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i7, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f8187o == 6 && g()) {
            return this.f8188p;
        }
        return -1.0f;
    }

    public Object c() {
        Rating k7;
        if (this.f8189q == null) {
            if (g()) {
                int i7 = this.f8187o;
                switch (i7) {
                    case 1:
                        k7 = b.g(f());
                        break;
                    case 2:
                        k7 = b.j(h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        k7 = b.i(i7, e());
                        break;
                    case 6:
                        k7 = b.h(b());
                        break;
                    default:
                        return null;
                }
            } else {
                k7 = b.k(this.f8187o);
            }
            this.f8189q = k7;
        }
        return this.f8189q;
    }

    public int d() {
        return this.f8187o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f8187o;
    }

    public float e() {
        int i7 = this.f8187o;
        if ((i7 == 3 || i7 == 4 || i7 == 5) && g()) {
            return this.f8188p;
        }
        return -1.0f;
    }

    public boolean f() {
        return this.f8187o == 1 && this.f8188p == 1.0f;
    }

    public boolean g() {
        return this.f8188p >= 0.0f;
    }

    public boolean h() {
        return this.f8187o == 2 && this.f8188p == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f8187o);
        sb.append(" rating=");
        float f7 = this.f8188p;
        sb.append(f7 < 0.0f ? "unrated" : String.valueOf(f7));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8187o);
        parcel.writeFloat(this.f8188p);
    }
}
