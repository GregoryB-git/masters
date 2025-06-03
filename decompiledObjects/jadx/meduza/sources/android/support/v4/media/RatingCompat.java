package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.f;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f459a;

    /* renamed from: b, reason: collision with root package name */
    public final float f460b;

    /* renamed from: c, reason: collision with root package name */
    public Object f461c;

    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
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

        public static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        public static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        public static Rating i(int i10, float f) {
            return Rating.newStarRating(i10, f);
        }

        public static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        public static Rating k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    public RatingCompat(float f, int i10) {
        this.f459a = i10;
        this.f460b = f;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b10 = b.b(rating);
            if (b.e(rating)) {
                switch (b10) {
                    case 1:
                        ratingCompat = new RatingCompat(b.d(rating) ? 1.0f : 0.0f, 1);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(b.f(rating) ? 1.0f : 0.0f, 2);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat2 = b(b.c(rating), b10);
                        break;
                    case 6:
                        float a10 = b.a(rating);
                        if (a10 >= 0.0f && a10 <= 100.0f) {
                            ratingCompat2 = new RatingCompat(a10, 6);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat2 = c(b10);
            }
            ratingCompat2.f461c = obj;
        }
        return ratingCompat2;
    }

    public static RatingCompat b(float f, int i10) {
        float f10;
        String str;
        if (i10 == 3) {
            f10 = 3.0f;
        } else if (i10 == 4) {
            f10 = 4.0f;
        } else {
            if (i10 != 5) {
                str = "Invalid rating style (" + i10 + ") for a star rating";
                Log.e("Rating", str);
                return null;
            }
            f10 = 5.0f;
        }
        if (f >= 0.0f && f <= f10) {
            return new RatingCompat(f, i10);
        }
        str = "Trying to set out of range star-based rating";
        Log.e("Rating", str);
        return null;
    }

    public static RatingCompat c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(-1.0f, i10);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f459a;
    }

    public final String toString() {
        StringBuilder l10 = f.l("Rating:style=");
        l10.append(this.f459a);
        l10.append(" rating=");
        float f = this.f460b;
        l10.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f459a);
        parcel.writeFloat(this.f460b);
    }
}
