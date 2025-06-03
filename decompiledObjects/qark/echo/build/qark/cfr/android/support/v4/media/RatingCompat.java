/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.media.Rating
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint(value={"BanParcelableUsage"})
public final class RatingCompat
implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator(){

        public RatingCompat a(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] b(int n8) {
            return new RatingCompat[n8];
        }
    };
    public final int o;
    public final float p;
    public Object q;

    public RatingCompat(int n8, float f8) {
        this.o = n8;
        this.p = f8;
    }

    public static RatingCompat a(Object object) {
        Object object2 = null;
        if (object != null) {
            object2 = (Rating)object;
            int n8 = b.b((Rating)object2);
            if (b.e((Rating)object2)) {
                switch (n8) {
                    default: {
                        return null;
                    }
                    case 6: {
                        object2 = RatingCompat.j(b.a((Rating)object2));
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        object2 = RatingCompat.k(n8, b.c((Rating)object2));
                        break;
                    }
                    case 2: {
                        object2 = RatingCompat.l(b.f((Rating)object2));
                        break;
                    }
                    case 1: {
                        object2 = RatingCompat.i(b.d((Rating)object2));
                        break;
                    }
                }
            } else {
                object2 = RatingCompat.m(n8);
            }
            object2.q = object;
        }
        return object2;
    }

    public static RatingCompat i(boolean bl) {
        float f8 = bl ? 1.0f : 0.0f;
        return new RatingCompat(1, f8);
    }

    public static RatingCompat j(float f8) {
        if (f8 >= 0.0f && f8 <= 100.0f) {
            return new RatingCompat(6, f8);
        }
        Log.e((String)"Rating", (String)"Invalid percentage-based rating value");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static RatingCompat k(int n8, float f8) {
        String string2;
        block4 : {
            float f9;
            block5 : {
                block1 : {
                    block2 : {
                        block3 : {
                            if (n8 == 3) break block1;
                            if (n8 == 4) break block2;
                            if (n8 == 5) break block3;
                            string2 = new StringBuilder();
                            string2.append("Invalid rating style (");
                            string2.append(n8);
                            string2.append(") for a star rating");
                            string2 = string2.toString();
                            break block4;
                        }
                        f9 = 5.0f;
                        break block5;
                    }
                    f9 = 4.0f;
                    break block5;
                }
                f9 = 3.0f;
            }
            if (f8 >= 0.0f && f8 <= f9) {
                return new RatingCompat(n8, f8);
            }
            string2 = "Trying to set out of range star-based rating";
        }
        Log.e((String)"Rating", (String)string2);
        return null;
    }

    public static RatingCompat l(boolean bl) {
        float f8 = bl ? 1.0f : 0.0f;
        return new RatingCompat(2, f8);
    }

    public static RatingCompat m(int n8) {
        switch (n8) {
            default: {
                return null;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
        }
        return new RatingCompat(n8, -1.0f);
    }

    public float b() {
        if (this.o == 6 && this.g()) {
            return this.p;
        }
        return -1.0f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object c() {
        block7 : {
            block6 : {
                if (this.q != null) return this.q;
                if (!this.g()) break block6;
                var1_1 = this.o;
                switch (var1_1) {
                    default: {
                        return null;
                    }
                    case 6: {
                        var2_2 = b.h(this.b());
                        break block7;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        var2_2 = b.i(var1_1, this.e());
                        ** break;
                    }
                    case 2: {
                        var2_2 = b.j(this.h());
                        ** break;
                    }
                    case 1: 
                }
                var2_2 = b.g(this.f());
                ** break;
lbl19: // 3 sources:
                break block7;
            }
            var2_2 = b.k(this.o);
        }
        this.q = var2_2;
        return this.q;
    }

    public int d() {
        return this.o;
    }

    public int describeContents() {
        return this.o;
    }

    public float e() {
        int n8 = this.o;
        if ((n8 == 3 || n8 == 4 || n8 == 5) && this.g()) {
            return this.p;
        }
        return -1.0f;
    }

    public boolean f() {
        int n8 = this.o;
        boolean bl = false;
        if (n8 != 1) {
            return false;
        }
        if (this.p == 1.0f) {
            bl = true;
        }
        return bl;
    }

    public boolean g() {
        if (this.p >= 0.0f) {
            return true;
        }
        return false;
    }

    public boolean h() {
        int n8 = this.o;
        boolean bl = false;
        if (n8 != 2) {
            return false;
        }
        if (this.p == 1.0f) {
            bl = true;
        }
        return bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.o);
        stringBuilder.append(" rating=");
        float f8 = this.p;
        String string2 = f8 < 0.0f ? "unrated" : String.valueOf((float)f8);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
    }

    public static abstract class b {
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

        public static Rating g(boolean bl) {
            return Rating.newHeartRating((boolean)bl);
        }

        public static Rating h(float f8) {
            return Rating.newPercentageRating((float)f8);
        }

        public static Rating i(int n8, float f8) {
            return Rating.newStarRating((int)n8, (float)f8);
        }

        public static Rating j(boolean bl) {
            return Rating.newThumbRating((boolean)bl);
        }

        public static Rating k(int n8) {
            return Rating.newUnratedRating((int)n8);
        }
    }

}

