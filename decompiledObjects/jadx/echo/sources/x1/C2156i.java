package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2156i implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    public final String f21075o;

    /* renamed from: p, reason: collision with root package name */
    public final String f21076p;

    /* renamed from: q, reason: collision with root package name */
    public final C2159l f21077q;

    /* renamed from: r, reason: collision with root package name */
    public final C2158k f21078r;

    /* renamed from: s, reason: collision with root package name */
    public final String f21079s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f21074t = new b(null);

    @NotNull
    public static final Parcelable.Creator<C2156i> CREATOR = new a();

    /* renamed from: x1.i$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2156i createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C2156i(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2156i[] newArray(int i7) {
            return new C2156i[i7];
        }
    }

    /* renamed from: x1.i$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public C2156i(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f21075o = O1.Q.k(parcel.readString(), "token");
        this.f21076p = O1.Q.k(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(C2159l.class.getClassLoader());
        if (readParcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f21077q = (C2159l) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(C2158k.class.getClassLoader());
        if (readParcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f21078r = (C2158k) readParcelable2;
        this.f21079s = O1.Q.k(parcel.readString(), "signature");
    }

    public final boolean a(String str, String str2, String str3, String str4) {
        try {
            String c7 = X1.c.c(str4);
            if (c7 == null) {
                return false;
            }
            return X1.c.e(X1.c.b(c7), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2156i)) {
            return false;
        }
        C2156i c2156i = (C2156i) obj;
        return Intrinsics.a(this.f21075o, c2156i.f21075o) && Intrinsics.a(this.f21076p, c2156i.f21076p) && Intrinsics.a(this.f21077q, c2156i.f21077q) && Intrinsics.a(this.f21078r, c2156i.f21078r) && Intrinsics.a(this.f21079s, c2156i.f21079s);
    }

    public int hashCode() {
        return ((((((((527 + this.f21075o.hashCode()) * 31) + this.f21076p.hashCode()) * 31) + this.f21077q.hashCode()) * 31) + this.f21078r.hashCode()) * 31) + this.f21079s.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f21075o);
        dest.writeString(this.f21076p);
        dest.writeParcelable(this.f21077q, i7);
        dest.writeParcelable(this.f21078r, i7);
        dest.writeString(this.f21079s);
    }

    public C2156i(String token, String expectedNonce) {
        List V6;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        O1.Q.g(token, "token");
        O1.Q.g(expectedNonce, "expectedNonce");
        V6 = kotlin.text.s.V(token, new String[]{"."}, false, 0, 6, null);
        if (!(V6.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str = (String) V6.get(0);
        String str2 = (String) V6.get(1);
        String str3 = (String) V6.get(2);
        this.f21075o = token;
        this.f21076p = expectedNonce;
        C2159l c2159l = new C2159l(str);
        this.f21077q = c2159l;
        this.f21078r = new C2158k(str2, expectedNonce);
        if (!a(str, str2, str3, c2159l.a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f21079s = str3;
    }
}
