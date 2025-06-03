/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package V0;

import V0.g;
import android.os.Parcel;
import android.os.Parcelable;
import g0.E;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d
extends V0.b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator(){

        public d a(Parcel parcel) {
            return new d(parcel, null);
        }

        public d[] b(int n8) {
            return new d[n8];
        }
    };
    public final int A;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final long t;
    public final long u;
    public final List v;
    public final boolean w;
    public final long x;
    public final int y;
    public final int z;

    public d(long l8, boolean bl, boolean bl2, boolean bl3, boolean bl4, long l9, long l10, List list, boolean bl5, long l11, int n8, int n9, int n10) {
        this.o = l8;
        this.p = bl;
        this.q = bl2;
        this.r = bl3;
        this.s = bl4;
        this.t = l9;
        this.u = l10;
        this.v = Collections.unmodifiableList((List)list);
        this.w = bl5;
        this.x = l11;
        this.y = n8;
        this.z = n9;
        this.A = n10;
    }

    public d(Parcel parcel) {
        this.o = parcel.readLong();
        int n8 = parcel.readByte();
        boolean bl = false;
        boolean bl2 = n8 == 1;
        this.p = bl2;
        bl2 = parcel.readByte() == 1;
        this.q = bl2;
        bl2 = parcel.readByte() == 1;
        this.r = bl2;
        bl2 = parcel.readByte() == 1;
        this.s = bl2;
        this.t = parcel.readLong();
        this.u = parcel.readLong();
        int n9 = parcel.readInt();
        ArrayList arrayList = new ArrayList(n9);
        for (n8 = 0; n8 < n9; ++n8) {
            arrayList.add((Object)b.a(parcel));
        }
        this.v = Collections.unmodifiableList((List)arrayList);
        bl2 = bl;
        if (parcel.readByte() == 1) {
            bl2 = true;
        }
        this.w = bl2;
        this.x = parcel.readLong();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
    }

    public /* synthetic */ d(Parcel parcel,  a8) {
        this(parcel);
    }

    public static d a(z z8, long l8, E e8) {
        boolean bl;
        boolean bl2;
        long l9;
        int n8;
        boolean bl3;
        int n9;
        boolean bl4;
        int n10;
        long l10 = z8.I();
        boolean bl5 = (z8.G() & 128) != 0;
        List list = Collections.emptyList();
        if (!bl5) {
            n8 = z8.G();
            bl3 = (n8 & 128) != 0;
            bl = (n8 & 64) != 0;
            n9 = (n8 & 32) != 0 ? 1 : 0;
            bl4 = (n8 & 16) != 0;
            l9 = bl && !bl4 ? g.b(z8, l8) : -9223372036854775807L;
            if (!bl) {
                n10 = z8.G();
                list = new ArrayList(n10);
                for (n8 = 0; n8 < n10; ++n8) {
                    int n11 = z8.G();
                    long l11 = !bl4 ? g.b(z8, l8) : -9223372036854775807L;
                    list.add((Object)new b(n11, l11, e8.b(l11), null));
                }
            }
            if (n9 != 0) {
                l8 = z8.G();
                bl2 = (128L & l8) != 0L;
                l8 = ((l8 & 1L) << 32 | z8.I()) * 1000L / 90L;
            } else {
                bl2 = false;
                l8 = -9223372036854775807L;
            }
            n9 = z8.M();
            n8 = z8.G();
            n10 = z8.G();
        } else {
            bl3 = false;
            bl4 = false;
            l9 = -9223372036854775807L;
            bl2 = false;
            l8 = -9223372036854775807L;
            n9 = 0;
            n8 = 0;
            n10 = 0;
            bl = false;
        }
        return new d(l10, bl5, bl3, bl, bl4, l9, e8.b(l9), list, bl2, l8, n9, n8, n10);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 SpliceInsertCommand { programSplicePts=");
        stringBuilder.append(this.t);
        stringBuilder.append(", programSplicePlaybackPositionUs= ");
        stringBuilder.append(this.u);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.o);
        parcel.writeByte((byte)(this.p ? 1 : 0));
        parcel.writeByte((byte)(this.q ? 1 : 0));
        parcel.writeByte((byte)(this.r ? 1 : 0));
        parcel.writeByte((byte)(this.s ? 1 : 0));
        parcel.writeLong(this.t);
        parcel.writeLong(this.u);
        int n9 = this.v.size();
        parcel.writeInt(n9);
        for (n8 = 0; n8 < n9; ++n8) {
            ((b)this.v.get(n8)).b(parcel);
        }
        parcel.writeByte((byte)(this.w ? 1 : 0));
        parcel.writeLong(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
    }

    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public b(int n8, long l8, long l9) {
            this.a = n8;
            this.b = l8;
            this.c = l9;
        }

        public /* synthetic */ b(int n8, long l8, long l9,  a8) {
            this(n8, l8, l9);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

}

