/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.List
 */
package U0;

import U0.c;
import W2.k;
import X2.n;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class b
implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList((List)arrayList, b.class.getClassLoader());
            return new b((List)arrayList);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final List o;

    public b(List list) {
        this.o = list;
        a.a(b.a(list) ^ true);
    }

    public static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long l8 = ((b)list.get((int)0)).p;
        for (int i8 = 1; i8 < list.size(); ++i8) {
            if (((b)list.get((int)i8)).o < l8) {
                return true;
            }
            l8 = ((b)list.get((int)i8)).p;
        }
        return false;
    }

    @Override
    public /* synthetic */ void D(w.b b8) {
        y.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] M() {
        return y.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && b.class == object.getClass()) {
            object = (b)object;
            return this.o.equals((Object)object.o);
        }
        return false;
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SlowMotion: segments=");
        stringBuilder.append((Object)this.o);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeList(this.o);
    }

    public static final class b
    implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR;
        public static final Comparator r;
        public final long o;
        public final long p;
        public final int q;

        static {
            r = new c();
            CREATOR = new Parcelable.Creator(){

                public b a(Parcel parcel) {
                    return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
                }

                public b[] b(int n8) {
                    return new b[n8];
                }
            };
        }

        public b(long l8, long l9, int n8) {
            boolean bl = l8 < l9;
            a.a(bl);
            this.o = l8;
            this.p = l9;
            this.q = n8;
        }

        public static /* synthetic */ int a(b b8, b b9) {
            return b.b(b8, b9);
        }

        public static /* synthetic */ int b(b b8, b b9) {
            return n.j().e(b8.o, b9.o).e(b8.p, b9.p).d(b8.q, b9.q).i();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (b.class != object.getClass()) {
                    return false;
                }
                object = (b)object;
                if (this.o == object.o && this.p == object.p && this.q == object.q) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return k.b(this.o, this.p, this.q);
        }

        public String toString() {
            return M.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", this.o, this.p, this.q);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeLong(this.o);
            parcel.writeLong(this.p);
            parcel.writeInt(this.q);
        }

    }

}

