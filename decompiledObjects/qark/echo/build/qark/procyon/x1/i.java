// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.security.PublicKey;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import X1.c;
import java.util.List;
import O1.Q;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class i implements Parcelable
{
    @NotNull
    public static final Parcelable$Creator<i> CREATOR;
    public static final b t;
    public final String o;
    public final String p;
    public final l q;
    public final k r;
    public final String s;
    
    static {
        t = new b(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public i a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new i(parcel);
            }
            
            public i[] b(final int n) {
                return new i[n];
            }
        };
    }
    
    public i(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.o = Q.k(parcel.readString(), "token");
        this.p = Q.k(parcel.readString(), "expectedNonce");
        final Parcelable parcelable = parcel.readParcelable(l.class.getClassLoader());
        if (parcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.q = (l)parcelable;
        final Parcelable parcelable2 = parcel.readParcelable(k.class.getClassLoader());
        if (parcelable2 != null) {
            this.r = (k)parcelable2;
            this.s = Q.k(parcel.readString(), "signature");
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public i(final String o, final String p2) {
        Intrinsics.checkNotNullParameter(o, "token");
        Intrinsics.checkNotNullParameter(p2, "expectedNonce");
        Q.g(o, "token");
        Q.g(p2, "expectedNonce");
        final List v = kotlin.text.i.V(o, new String[] { "." }, false, 0, 6, null);
        if (v.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        final String s = v.get(0);
        final String s2 = v.get(1);
        final String s3 = v.get(2);
        this.o = o;
        this.p = p2;
        final l q = new l(s);
        this.q = q;
        this.r = new k(s2, p2);
        if (this.a(s, s2, s3, q.a())) {
            this.s = s3;
            return;
        }
        throw new IllegalArgumentException("Invalid Signature".toString());
    }
    
    public final boolean a(final String str, final String str2, final String s, String c) {
        try {
            c = c.c(c);
            if (c == null) {
                return false;
            }
            final PublicKey b = c.b(c);
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            return c.e(b, sb.toString(), s);
        }
        catch (InvalidKeySpecException | IOException ex) {
            return false;
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final String o2 = this.o;
        final i i = (i)o;
        return Intrinsics.a(o2, i.o) && Intrinsics.a(this.p, i.p) && Intrinsics.a(this.q, i.q) && Intrinsics.a(this.r, i.r) && Intrinsics.a(this.s, i.s);
    }
    
    @Override
    public int hashCode() {
        return ((((527 + this.o.hashCode()) * 31 + this.p.hashCode()) * 31 + this.q.hashCode()) * 31 + this.r.hashCode()) * 31 + this.s.hashCode();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeParcelable((Parcelable)this.q, n);
        parcel.writeParcelable((Parcelable)this.r, n);
        parcel.writeString(this.s);
    }
    
    public static final class b
    {
    }
}
