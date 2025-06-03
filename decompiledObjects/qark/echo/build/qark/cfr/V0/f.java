/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package V0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f
extends V0.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator(){

        public f a(Parcel parcel) {
            return new f(parcel, null);
        }

        public f[] b(int n8) {
            return new f[n8];
        }
    };
    public final List o;

    public f(Parcel parcel) {
        int n8 = parcel.readInt();
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)c.d(parcel));
        }
        this.o = Collections.unmodifiableList((List)arrayList);
    }

    public /* synthetic */ f(Parcel parcel,  a8) {
        this(parcel);
    }

    public f(List list) {
        this.o = Collections.unmodifiableList((List)list);
    }

    public static f a(z z8) {
        int n8 = z8.G();
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)c.e(z8));
        }
        return new f((List)arrayList);
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = this.o.size();
        parcel.writeInt(n9);
        for (n8 = 0; n8 < n9; ++n8) {
            ((c)this.o.get(n8)).f(parcel);
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }

        public /* synthetic */ b(int n8, long l8,  a8) {
            this(n8, l8);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }
    }

    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        public c(long l8, boolean bl, boolean bl2, boolean bl3, List list, long l9, boolean bl4, long l10, int n8, int n9, int n10) {
            this.a = l8;
            this.b = bl;
            this.c = bl2;
            this.d = bl3;
            this.f = Collections.unmodifiableList((List)list);
            this.e = l9;
            this.g = bl4;
            this.h = l10;
            this.i = n8;
            this.j = n9;
            this.k = n10;
        }

        public c(Parcel parcel) {
            this.a = parcel.readLong();
            int n8 = parcel.readByte();
            boolean bl = false;
            boolean bl2 = n8 == 1;
            this.b = bl2;
            bl2 = parcel.readByte() == 1;
            this.c = bl2;
            bl2 = parcel.readByte() == 1;
            this.d = bl2;
            int n9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(n9);
            for (n8 = 0; n8 < n9; ++n8) {
                arrayList.add((Object)b.c(parcel));
            }
            this.f = Collections.unmodifiableList((List)arrayList);
            this.e = parcel.readLong();
            bl2 = bl;
            if (parcel.readByte() == 1) {
                bl2 = true;
            }
            this.g = bl2;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(z z8) {
            boolean bl;
            int n8;
            long l8;
            boolean bl2;
            int n9;
            long l9;
            int n10;
            boolean bl3;
            long l10 = z8.I();
            boolean bl4 = (z8.G() & 128) != 0;
            ArrayList arrayList = new ArrayList();
            if (!bl4) {
                n10 = z8.G();
                bl3 = (n10 & 128) != 0;
                bl2 = (n10 & 64) != 0;
                n10 = (n10 & 32) != 0 ? 1 : 0;
                l8 = bl2 ? z8.I() : -9223372036854775807L;
                if (!bl2) {
                    n8 = z8.G();
                    arrayList = new ArrayList(n8);
                    for (n9 = 0; n9 < n8; ++n9) {
                        arrayList.add((Object)new b(z8.G(), z8.I(), null));
                    }
                }
                if (n10 != 0) {
                    l9 = z8.G();
                    bl = (128L & l9) != 0L;
                    l9 = ((l9 & 1L) << 32 | z8.I()) * 1000L / 90L;
                } else {
                    bl = false;
                    l9 = -9223372036854775807L;
                }
                n9 = z8.M();
                n8 = z8.G();
                n10 = z8.G();
            } else {
                bl3 = false;
                l8 = -9223372036854775807L;
                bl = false;
                l9 = -9223372036854775807L;
                n9 = 0;
                n8 = 0;
                n10 = 0;
                bl2 = false;
            }
            return new c(l10, bl4, bl3, bl2, (List)arrayList, l8, bl, l9, n9, n8, n10);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte((byte)(this.b ? 1 : 0));
            parcel.writeByte((byte)(this.c ? 1 : 0));
            parcel.writeByte((byte)(this.d ? 1 : 0));
            int n8 = this.f.size();
            parcel.writeInt(n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                ((b)this.f.get(i8)).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte((byte)(this.g ? 1 : 0));
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }

}

