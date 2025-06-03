package x2;

import A2.AbstractC0327m;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2188b extends B2.a {

    /* renamed from: o, reason: collision with root package name */
    public final int f21168o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21169p;

    /* renamed from: q, reason: collision with root package name */
    public final PendingIntent f21170q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21171r;

    /* renamed from: s, reason: collision with root package name */
    public static final C2188b f21167s = new C2188b(0);

    @NonNull
    public static final Parcelable.Creator<C2188b> CREATOR = new C2205s();

    public C2188b(int i7) {
        this(i7, null, null);
    }

    public static String k(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i7 + ")";
                }
        }
    }

    public int a() {
        return this.f21169p;
    }

    public String d() {
        return this.f21171r;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2188b)) {
            return false;
        }
        C2188b c2188b = (C2188b) obj;
        return this.f21169p == c2188b.f21169p && AbstractC0327m.a(this.f21170q, c2188b.f21170q) && AbstractC0327m.a(this.f21171r, c2188b.f21171r);
    }

    public PendingIntent f() {
        return this.f21170q;
    }

    public boolean g() {
        return (this.f21169p == 0 || this.f21170q == null) ? false : true;
    }

    public int hashCode() {
        return AbstractC0327m.b(Integer.valueOf(this.f21169p), this.f21170q, this.f21171r);
    }

    public boolean i() {
        return this.f21169p == 0;
    }

    public String toString() {
        AbstractC0327m.a c7 = AbstractC0327m.c(this);
        c7.a("statusCode", k(this.f21169p));
        c7.a("resolution", this.f21170q);
        c7.a("message", this.f21171r);
        return c7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f21168o);
        B2.c.i(parcel, 2, a());
        B2.c.m(parcel, 3, f(), i7, false);
        B2.c.n(parcel, 4, d(), false);
        B2.c.b(parcel, a7);
    }

    public C2188b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f21168o = i7;
        this.f21169p = i8;
        this.f21170q = pendingIntent;
        this.f21171r = str;
    }

    public C2188b(int i7, PendingIntent pendingIntent) {
        this(i7, pendingIntent, null);
    }

    public C2188b(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str);
    }
}
