/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$ClassLoaderCreator
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package N;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;
    public static final a p;
    public final Parcelable o;

    static {
        p = new a(){};
        CREATOR = new Parcelable.ClassLoaderCreator(){

            public a a(Parcel parcel) {
                return this.b(parcel, null);
            }

            public a b(Parcel parcel, ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return a.p;
                }
                throw new IllegalStateException("superState must be null");
            }

            public a[] c(int n8) {
                return new a[n8];
            }
        };
    }

    public a() {
        this.o = null;
    }

    public /* synthetic */ a( a8) {
        this();
    }

    public a(Parcel object, ClassLoader classLoader) {
        object = object.readParcelable(classLoader);
        if (object == null) {
            object = p;
        }
        this.o = object;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == p) {
                parcelable = null;
            }
            this.o = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable a() {
        return this.o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeParcelable(this.o, n8);
    }

}

