/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.PublicKey
 *  java.security.spec.InvalidKeySpecException
 */
package x1;

import O1.Q;
import X1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import x1.k;
import x1.l;

public final class i
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<i> CREATOR;
    public static final b t;
    public final String o;
    public final String p;
    public final l q;
    public final k r;
    public final String s;

    static {
        t = new b(null);
        CREATOR = new Parcelable.Creator(){

            public i a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new i(parcel);
            }

            public i[] b(int n8) {
                return new i[n8];
            }
        };
    }

    public i(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        this.o = Q.k(parcel.readString(), "token");
        this.p = Q.k(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(l.class.getClassLoader());
        if (parcelable != null) {
            this.q = (l)parcelable;
            parcelable = parcel.readParcelable(k.class.getClassLoader());
            if (parcelable != null) {
                this.r = (k)parcelable;
                this.s = Q.k(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public i(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "token");
        Intrinsics.checkNotNullParameter(string2, "expectedNonce");
        Q.g((String)object, "token");
        Q.g(string2, "expectedNonce");
        Object object2 = kotlin.text.i.V((CharSequence)object, new String[]{"."}, false, 0, 6, null);
        boolean bl = object2.size() == 3;
        if (bl) {
            String string3 = (String)object2.get(0);
            String string4 = (String)object2.get(1);
            object2 = (String)object2.get(2);
            this.o = object;
            this.p = string2;
            this.q = object = new l(string3);
            this.r = new k(string4, string2);
            if (this.a(string3, string4, (String)object2, object.a())) {
                this.s = object2;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    public final boolean a(String string2, String string3, String string4, String string5) {
        block3 : {
            string5 = c.c(string5);
            if (string5 != null) break block3;
            return false;
        }
        try {
            string5 = c.b(string5);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append('.');
            stringBuilder.append(string3);
            boolean bl = c.e((PublicKey)string5, stringBuilder.toString(), string4);
            return bl;
        }
        catch (IOException | InvalidKeySpecException invalidKeySpecException) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        String string2 = this.o;
        object = (i)object;
        if (Intrinsics.a(string2, object.o) && Intrinsics.a(this.p, object.p) && Intrinsics.a(this.q, object.q) && Intrinsics.a(this.r, object.r) && Intrinsics.a(this.s, object.s)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.o.hashCode()) * 31 + this.p.hashCode()) * 31 + this.q.hashCode()) * 31 + this.r.hashCode()) * 31 + this.s.hashCode();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeParcelable((Parcelable)this.q, n8);
        parcel.writeParcelable((Parcelable)this.r, n8);
        parcel.writeString(this.s);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

}

