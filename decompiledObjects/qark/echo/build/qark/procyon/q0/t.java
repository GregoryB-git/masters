// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import android.os.Parcelable;
import d0.q;
import android.text.TextUtils;
import d0.y;
import d0.w;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import d0.x;

public final class t implements x.b
{
    public static final Parcelable$Creator<t> CREATOR;
    public final String o;
    public final String p;
    public final List q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public t a(final Parcel parcel) {
                return new t(parcel);
            }
            
            public t[] b(final int n) {
                return new t[n];
            }
        };
    }
    
    public t(final Parcel parcel) {
        this.o = parcel.readString();
        this.p = parcel.readString();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<b>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add((b)parcel.readParcelable(b.class.getClassLoader()));
        }
        this.q = Collections.unmodifiableList((List<?>)list);
    }
    
    public t(final String o, final String p3, final List c) {
        this.o = o;
        this.p = p3;
        this.q = Collections.unmodifiableList((List<?>)new ArrayList<Object>(c));
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (t.class != o.getClass()) {
            return false;
        }
        final t t = (t)o;
        return TextUtils.equals((CharSequence)this.o, (CharSequence)t.o) && TextUtils.equals((CharSequence)this.p, (CharSequence)t.p) && this.q.equals(t.q);
    }
    
    @Override
    public int hashCode() {
        final String o = this.o;
        int hashCode = 0;
        int hashCode2;
        if (o != null) {
            hashCode2 = o.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return (hashCode2 * 31 + hashCode) * 31 + this.q.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        String string;
        if (this.o != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" [");
            sb2.append(this.o);
            sb2.append(", ");
            sb2.append(this.p);
            sb2.append("]");
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        final int size = this.q.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            parcel.writeParcelable((Parcelable)this.q.get(i), 0);
        }
    }
    
    public static final class b implements Parcelable
    {
        public static final Parcelable$Creator<b> CREATOR;
        public final int o;
        public final int p;
        public final String q;
        public final String r;
        public final String s;
        public final String t;
        
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
        
        public b(final int o, final int p6, final String q, final String r, final String s, final String t) {
            this.o = o;
            this.p = p6;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
        }
        
        public b(final Parcel parcel) {
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readString();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (b.class != o.getClass()) {
                return false;
            }
            final b b = (b)o;
            return this.o == b.o && this.p == b.p && TextUtils.equals((CharSequence)this.q, (CharSequence)b.q) && TextUtils.equals((CharSequence)this.r, (CharSequence)b.r) && TextUtils.equals((CharSequence)this.s, (CharSequence)b.s) && TextUtils.equals((CharSequence)this.t, (CharSequence)b.t);
        }
        
        @Override
        public int hashCode() {
            final int o = this.o;
            final int p = this.p;
            final String q = this.q;
            int hashCode = 0;
            int hashCode2;
            if (q != null) {
                hashCode2 = q.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final String r = this.r;
            int hashCode3;
            if (r != null) {
                hashCode3 = r.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final String s = this.s;
            int hashCode4;
            if (s != null) {
                hashCode4 = s.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final String t = this.t;
            if (t != null) {
                hashCode = t.hashCode();
            }
            return ((((o * 31 + p) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeString(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
        }
    }
}
