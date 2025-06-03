// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import g0.z;
import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public final class f extends V0.b
{
    public static final Parcelable$Creator<f> CREATOR;
    public final List o;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public f a(final Parcel parcel) {
                return new f(parcel, null);
            }
            
            public f[] b(final int n) {
                return new f[n];
            }
        };
    }
    
    public f(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<c>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(d(parcel));
        }
        this.o = Collections.unmodifiableList((List<?>)list);
    }
    
    public f(final List list) {
        this.o = Collections.unmodifiableList((List<?>)list);
    }
    
    public static f a(final z z) {
        final int g = z.G();
        final ArrayList list = new ArrayList<c>(g);
        for (int i = 0; i < g; ++i) {
            list.add(e(z));
        }
        return new f(list);
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        final int size = this.o.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            this.o.get(i).f(parcel);
        }
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public static b c(final Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }
        
        public final void d(final Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }
    }
    
    public static final class c
    {
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
        
        public c(final long a, final boolean b, final boolean c, final boolean d, final List list, final long e, final boolean g, final long h, final int i, final int j, final int k) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.f = Collections.unmodifiableList((List<?>)list);
            this.e = e;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
        }
        
        public c(final Parcel parcel) {
            this.a = parcel.readLong();
            final byte byte1 = parcel.readByte();
            final boolean b = false;
            this.b = (byte1 == 1);
            this.c = (parcel.readByte() == 1);
            this.d = (parcel.readByte() == 1);
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList<b>(int1);
            for (int i = 0; i < int1; ++i) {
                list.add(c(parcel));
            }
            this.f = Collections.unmodifiableList((List<?>)list);
            this.e = parcel.readLong();
            boolean g = b;
            if (parcel.readByte() == 1) {
                g = true;
            }
            this.g = g;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
        
        public static c d(final Parcel parcel) {
            return new c(parcel);
        }
        
        public static c e(final z z) {
            final long i = z.I();
            final boolean b = (z.G() & 0x80) != 0x0;
            ArrayList<b> list = new ArrayList<b>();
            boolean b2;
            boolean b3;
            long j;
            boolean b5;
            long n2;
            int m;
            int g3;
            int g4;
            if (!b) {
                final int g = z.G();
                b2 = ((g & 0x80) != 0x0);
                b3 = ((g & 0x40) != 0x0);
                final boolean b4 = (g & 0x20) != 0x0;
                if (b3) {
                    j = z.I();
                }
                else {
                    j = -9223372036854775807L;
                }
                if (!b3) {
                    final int g2 = z.G();
                    list = new ArrayList<b>(g2);
                    for (int k = 0; k < g2; ++k) {
                        list.add(new b(z.G(), z.I(), null));
                    }
                }
                if (b4) {
                    final long n = z.G();
                    b5 = ((0x80L & n) != 0x0L);
                    n2 = ((n & 0x1L) << 32 | z.I()) * 1000L / 90L;
                }
                else {
                    b5 = false;
                    n2 = -9223372036854775807L;
                }
                m = z.M();
                g3 = z.G();
                g4 = z.G();
            }
            else {
                b2 = false;
                j = -9223372036854775807L;
                b5 = false;
                n2 = -9223372036854775807L;
                m = 0;
                g3 = 0;
                g4 = 0;
                b3 = false;
            }
            return new c(i, b, b2, b3, list, j, b5, n2, m, g3, g4);
        }
        
        public final void f(final Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte((byte)(byte)(this.b ? 1 : 0));
            parcel.writeByte((byte)(byte)(this.c ? 1 : 0));
            parcel.writeByte((byte)(byte)(this.d ? 1 : 0));
            final int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; ++i) {
                ((b)this.f.get(i)).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte((byte)(byte)(this.g ? 1 : 0));
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }
}
