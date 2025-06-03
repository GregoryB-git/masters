// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import g0.E;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public final class d extends V0.b
{
    public static final Parcelable$Creator<d> CREATOR;
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
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public d a(final Parcel parcel) {
                return new d(parcel, null);
            }
            
            public d[] b(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final long o, final boolean p13, final boolean q, final boolean r, final boolean s, final long t, final long u, final List list, final boolean w, final long x, final int y, final int z, final int a) {
        this.o = o;
        this.p = p13;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = Collections.unmodifiableList((List<?>)list);
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public d(final Parcel parcel) {
        this.o = parcel.readLong();
        final byte byte1 = parcel.readByte();
        final boolean b = false;
        this.p = (byte1 == 1);
        this.q = (parcel.readByte() == 1);
        this.r = (parcel.readByte() == 1);
        this.s = (parcel.readByte() == 1);
        this.t = parcel.readLong();
        this.u = parcel.readLong();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<b>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(d.b.a(parcel));
        }
        this.v = Collections.unmodifiableList((List<?>)list);
        boolean w = b;
        if (parcel.readByte() == 1) {
            w = true;
        }
        this.w = w;
        this.x = parcel.readLong();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
    }
    
    public static d a(final z z, long n, final E e) {
        final long i = z.I();
        final boolean b = (z.G() & 0x80) != 0x0;
        List<b> emptyList = Collections.emptyList();
        boolean b2;
        boolean b3;
        boolean b5;
        long b6;
        boolean b8;
        int m;
        int g4;
        int g5;
        if (!b) {
            final int g = z.G();
            b2 = ((g & 0x80) != 0x0);
            b3 = ((g & 0x40) != 0x0);
            final boolean b4 = (g & 0x20) != 0x0;
            b5 = ((g & 0x10) != 0x0);
            if (b3 && !b5) {
                b6 = V0.g.b(z, n);
            }
            else {
                b6 = -9223372036854775807L;
            }
            if (!b3) {
                final int g2 = z.G();
                emptyList = new ArrayList<b>(g2);
                for (int j = 0; j < g2; ++j) {
                    final int g3 = z.G();
                    long b7;
                    if (!b5) {
                        b7 = V0.g.b(z, n);
                    }
                    else {
                        b7 = -9223372036854775807L;
                    }
                    emptyList.add(new b(g3, b7, e.b(b7), null));
                }
            }
            if (b4) {
                n = z.G();
                b8 = ((0x80L & n) != 0x0L);
                n = ((n & 0x1L) << 32 | z.I()) * 1000L / 90L;
            }
            else {
                b8 = false;
                n = -9223372036854775807L;
            }
            m = z.M();
            g4 = z.G();
            g5 = z.G();
        }
        else {
            b2 = false;
            b5 = false;
            b6 = -9223372036854775807L;
            b8 = false;
            n = -9223372036854775807L;
            m = 0;
            g4 = 0;
            g5 = 0;
            b3 = false;
        }
        return new d(i, b, b2, b3, b5, b6, e.b(b6), emptyList, b8, n, m, g4, g5);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.t);
        sb.append(", programSplicePlaybackPositionUs= ");
        sb.append(this.u);
        sb.append(" }");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        parcel.writeLong(this.o);
        parcel.writeByte((byte)(byte)(this.p ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.q ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.r ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.s ? 1 : 0));
        parcel.writeLong(this.t);
        parcel.writeLong(this.u);
        final int size = this.v.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            this.v.get(i).b(parcel);
        }
        parcel.writeByte((byte)(byte)(this.w ? 1 : 0));
        parcel.writeLong(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        public final long c;
        
        public b(final int a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static b a(final Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
        
        public void b(final Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }
}
