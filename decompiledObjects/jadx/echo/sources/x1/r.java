package x1;

import O1.C0447j;
import O1.C0458v;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    public final a f21114A;

    /* renamed from: B, reason: collision with root package name */
    public final String f21115B;

    /* renamed from: o, reason: collision with root package name */
    public final int f21116o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21117p;

    /* renamed from: q, reason: collision with root package name */
    public final int f21118q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21119r;

    /* renamed from: s, reason: collision with root package name */
    public final String f21120s;

    /* renamed from: t, reason: collision with root package name */
    public final String f21121t;

    /* renamed from: u, reason: collision with root package name */
    public final JSONObject f21122u;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f21123v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f21124w;

    /* renamed from: x, reason: collision with root package name */
    public final HttpURLConnection f21125x;

    /* renamed from: y, reason: collision with root package name */
    public final String f21126y;

    /* renamed from: z, reason: collision with root package name */
    public C2162o f21127z;

    /* renamed from: C, reason: collision with root package name */
    public static final c f21112C = new c(null);

    /* renamed from: D, reason: collision with root package name */
    public static final d f21113D = new d(200, 299);

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new b();

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new r(parcel, (kotlin.jvm.internal.g) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i7) {
            return new r[i7];
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[Catch: JSONException -> 0x0125, TryCatch #0 {JSONException -> 0x0125, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:30:0x00d0, B:33:0x0077, B:34:0x006e, B:35:0x0064, B:36:0x005c, B:37:0x0055, B:38:0x004b, B:39:0x0041, B:40:0x0084, B:43:0x0091, B:45:0x009a, B:49:0x00ab, B:50:0x00f1, B:52:0x00fb, B:54:0x0103, B:55:0x010c), top: B:2:0x0012 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final x1.r a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.r.c.a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):x1.r");
        }

        public final synchronized C0447j b() {
            C0458v c0458v = C0458v.f3949a;
            O1.r f7 = C0458v.f(C2146B.m());
            if (f7 == null) {
                return C0447j.f3847g.b();
            }
            return f7.c();
        }

        public final d c() {
            return r.f21113D;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f21132a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21133b;

        public d(int i7, int i8) {
            this.f21132a = i7;
            this.f21133b = i8;
        }

        public final boolean a(int i7) {
            return i7 <= this.f21133b && this.f21132a <= i7;
        }
    }

    public r(int i7, int i8, int i9, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C2162o c2162o, boolean z7) {
        a c7;
        this.f21116o = i7;
        this.f21117p = i8;
        this.f21118q = i9;
        this.f21119r = str;
        this.f21120s = str3;
        this.f21121t = str4;
        this.f21122u = jSONObject;
        this.f21123v = jSONObject2;
        this.f21124w = obj;
        this.f21125x = httpURLConnection;
        this.f21126y = str2;
        if (c2162o != null) {
            this.f21127z = c2162o;
            c7 = a.OTHER;
        } else {
            this.f21127z = new D(this, c());
            c7 = f21112C.b().c(i8, i9, z7);
        }
        this.f21114A = c7;
        this.f21115B = f21112C.b().d(c7);
    }

    public final int b() {
        return this.f21117p;
    }

    public final String c() {
        String str = this.f21126y;
        if (str != null) {
            return str;
        }
        C2162o c2162o = this.f21127z;
        if (c2162o == null) {
            return null;
        }
        return c2162o.getLocalizedMessage();
    }

    public final String d() {
        return this.f21119r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final C2162o e() {
        return this.f21127z;
    }

    public final int f() {
        return this.f21116o;
    }

    public final int g() {
        return this.f21118q;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f21116o + ", errorCode: " + this.f21117p + ", subErrorCode: " + this.f21118q + ", errorType: " + this.f21119r + ", errorMessage: " + c() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i7) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f21116o);
        out.writeInt(this.f21117p);
        out.writeInt(this.f21118q);
        out.writeString(this.f21119r);
        out.writeString(c());
        out.writeString(this.f21120s);
        out.writeString(this.f21121t);
    }

    public /* synthetic */ r(int i7, int i8, int i9, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C2162o c2162o, boolean z7, kotlin.jvm.internal.g gVar) {
        this(i7, i8, i9, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, c2162o, z7);
    }

    public r(int i7, String str, String str2) {
        this(-1, i7, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public r(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public /* synthetic */ r(Parcel parcel, kotlin.jvm.internal.g gVar) {
        this(parcel);
    }

    public r(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof C2162o ? (C2162o) exc : new C2162o(exc), false);
    }
}
