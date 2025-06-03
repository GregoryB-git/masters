// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J4;

import com.google.protobuf.r;
import java.util.concurrent.TimeUnit;
import N4.k;
import java.util.List;
import android.os.Parcel;
import M4.l;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String o;
    public final l p;
    public boolean q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel, null);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel) {
        boolean q = false;
        this.q = false;
        this.o = parcel.readString();
        if (parcel.readByte() != 0) {
            q = true;
        }
        this.q = q;
        this.p = (l)parcel.readParcelable(l.class.getClassLoader());
    }
    
    public a(final String o, final M4.a a) {
        this.q = false;
        this.o = o;
        this.p = a.a();
    }
    
    public static k[] b(final List list) {
        if (list.isEmpty()) {
            return null;
        }
        final k[] array = new k[list.size()];
        final k a = list.get(0).a();
        int n = 0;
        for (int i = 1; i < list.size(); ++i) {
            final k a2 = list.get(i).a();
            if (n == 0 && list.get(i).g()) {
                array[0] = a2;
                array[i] = a;
                n = 1;
            }
            else {
                array[i] = a2;
            }
        }
        if (n == 0) {
            array[0] = a;
        }
        return array;
    }
    
    public static a c(final String s) {
        final a a = new a(s.replace("-", ""), new M4.a());
        a.i(j());
        return a;
    }
    
    public static boolean j() {
        final C4.a g = C4.a.g();
        return g.L() && Math.random() < g.D();
    }
    
    public k a() {
        final k.c e = k.a0().E(this.o);
        if (this.q) {
            e.D(N4.l.q);
        }
        return (k)((r.a)e).v();
    }
    
    public l d() {
        return this.p;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return this.q;
    }
    
    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.p.c()) > C4.a.g().A();
    }
    
    public boolean g() {
        return this.q;
    }
    
    public String h() {
        return this.o;
    }
    
    public void i(final boolean q) {
        this.q = q;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.o);
        parcel.writeByte((byte)(byte)(this.q ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.p, 0);
    }
}
