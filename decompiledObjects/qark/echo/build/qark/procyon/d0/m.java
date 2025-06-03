// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.a;
import android.text.TextUtils;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.util.Comparator;

public final class m implements Comparator, Parcelable
{
    public static final Parcelable$Creator<m> CREATOR;
    public final b[] o;
    public int p;
    public final String q;
    public final int r;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public m a(final Parcel parcel) {
                return new m(parcel);
            }
            
            public m[] b(final int n) {
                return new m[n];
            }
        };
    }
    
    public m(final Parcel parcel) {
        this.q = parcel.readString();
        final b[] o = (b[])M.i(parcel.createTypedArray((Parcelable$Creator)b.CREATOR));
        this.o = o;
        this.r = o.length;
    }
    
    public m(final String s, final List list) {
        this(s, false, (b[])list.toArray(new b[0]));
    }
    
    public m(final String q, final boolean b, final b... array) {
        this.q = q;
        b[] array2 = array;
        if (b) {
            array2 = array.clone();
        }
        this.o = array2;
        this.r = array2.length;
        Arrays.sort(array2, this);
    }
    
    public m(final String s, final b... array) {
        this(s, true, array);
    }
    
    public m(final List list) {
        this(null, false, (b[])list.toArray(new b[0]));
    }
    
    public m(final b... array) {
        this((String)null, array);
    }
    
    public static boolean b(final ArrayList list, final int n, final UUID obj) {
        for (int i = 0; i < n; ++i) {
            if (list.get(i).p.equals(obj)) {
                return true;
            }
        }
        return false;
    }
    
    public static m d(final m m, final m i) {
        final ArrayList<b> list = new ArrayList<b>();
        final int n = 0;
        String s;
        if (m != null) {
            final String q = m.q;
            final b[] o = m.o;
            final int length = o.length;
            int n2 = 0;
            while (true) {
                s = q;
                if (n2 >= length) {
                    break;
                }
                final b e = o[n2];
                if (e.c()) {
                    list.add(e);
                }
                ++n2;
            }
        }
        else {
            s = null;
        }
        String s2 = s;
        if (i != null) {
            String q2;
            if ((q2 = s) == null) {
                q2 = i.q;
            }
            final int size = list.size();
            final b[] o2 = i.o;
            final int length2 = o2.length;
            int n3 = n;
            while (true) {
                s2 = q2;
                if (n3 >= length2) {
                    break;
                }
                final b e2 = o2[n3];
                if (e2.c() && !b(list, size, e2.p)) {
                    list.add(e2);
                }
                ++n3;
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new m(s2, list);
    }
    
    public int a(final b b, final b b2) {
        final UUID a = g.a;
        if (!a.equals(b.p)) {
            return b.p.compareTo(b2.p);
        }
        if (a.equals(b2.p)) {
            return 0;
        }
        return 1;
    }
    
    public m c(final String s) {
        if (M.c(this.q, s)) {
            return this;
        }
        return new m(s, false, this.o);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public b e(final int n) {
        return this.o[n];
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (m.class != o.getClass()) {
            return false;
        }
        final m m = (m)o;
        return M.c(this.q, m.q) && Arrays.equals(this.o, m.o);
    }
    
    public m f(final m m) {
        final String q = this.q;
        boolean b = false;
        Label_0039: {
            if (q != null) {
                final String q2 = m.q;
                if (q2 != null) {
                    if (!TextUtils.equals((CharSequence)q, (CharSequence)q2)) {
                        b = false;
                        break Label_0039;
                    }
                }
            }
            b = true;
        }
        a.f(b);
        String s = this.q;
        if (s == null) {
            s = m.q;
        }
        return new m(s, (b[])M.N0(this.o, m.o));
    }
    
    @Override
    public int hashCode() {
        if (this.p == 0) {
            final String q = this.q;
            int hashCode;
            if (q == null) {
                hashCode = 0;
            }
            else {
                hashCode = q.hashCode();
            }
            this.p = hashCode * 31 + Arrays.hashCode(this.o);
        }
        return this.p;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.q);
        parcel.writeTypedArray((Parcelable[])this.o, 0);
    }
    
    public static final class b implements Parcelable
    {
        public static final Parcelable$Creator<b> CREATOR;
        public int o;
        public final UUID p;
        public final String q;
        public final String r;
        public final byte[] s;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public b a(final Parcel parcel) {
                    return new b(parcel);
                }
                
                public b[] b(final int n) {
                    return new b[n];
                }
            };
        }
        
        public b(final Parcel parcel) {
            this.p = new UUID(parcel.readLong(), parcel.readLong());
            this.q = parcel.readString();
            this.r = (String)M.i(parcel.readString());
            this.s = parcel.createByteArray();
        }
        
        public b(final UUID uuid, final String q, final String s, final byte[] s2) {
            this.p = (UUID)a.e(uuid);
            this.q = q;
            this.r = z.t((String)a.e(s));
            this.s = s2;
        }
        
        public b(final UUID uuid, final String s, final byte[] array) {
            this(uuid, null, s, array);
        }
        
        public boolean a(final b b) {
            return this.c() && !b.c() && this.d(b.p);
        }
        
        public b b(final byte[] array) {
            return new b(this.p, this.q, this.r, array);
        }
        
        public boolean c() {
            return this.s != null;
        }
        
        public boolean d(final UUID uuid) {
            return g.a.equals(this.p) || uuid.equals(this.p);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof b;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            if (o == this) {
                return true;
            }
            final b b3 = (b)o;
            boolean b4 = b2;
            if (M.c(this.q, b3.q)) {
                b4 = b2;
                if (M.c(this.r, b3.r)) {
                    b4 = b2;
                    if (M.c(this.p, b3.p)) {
                        b4 = b2;
                        if (Arrays.equals(this.s, b3.s)) {
                            b4 = true;
                        }
                    }
                }
            }
            return b4;
        }
        
        @Override
        public int hashCode() {
            if (this.o == 0) {
                final int hashCode = this.p.hashCode();
                final String q = this.q;
                int hashCode2;
                if (q == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = q.hashCode();
                }
                this.o = ((hashCode * 31 + hashCode2) * 31 + this.r.hashCode()) * 31 + Arrays.hashCode(this.s);
            }
            return this.o;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeLong(this.p.getMostSignificantBits());
            parcel.writeLong(this.p.getLeastSignificantBits());
            parcel.writeString(this.q);
            parcel.writeString(this.r);
            parcel.writeByteArray(this.s);
        }
    }
}
