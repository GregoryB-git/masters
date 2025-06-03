package j6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import m6.h;

/* loaded from: classes.dex */
public final class b extends n6.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8470b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f8471c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8472d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f8468e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n();

    public b() {
        throw null;
    }

    public b(int i10) {
        this(1, i10, null, null);
    }

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f8469a = i10;
        this.f8470b = i11;
        this.f8471c = pendingIntent;
        this.f8472d = str;
    }

    public static String E(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
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
                switch (i10) {
                    case 13:
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
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return a0.j.h("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean D() {
        return this.f8470b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8470b == bVar.f8470b && m6.h.a(this.f8471c, bVar.f8471c) && m6.h.a(this.f8472d, bVar.f8472d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8470b), this.f8471c, this.f8472d});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a(E(this.f8470b), "statusCode");
        aVar.a(this.f8471c, "resolution");
        aVar.a(this.f8472d, Constants.MESSAGE);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8469a;
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, i11);
        b.z.z(parcel, 2, this.f8470b);
        b.z.E(parcel, 3, this.f8471c, i10, false);
        b.z.F(parcel, 4, this.f8472d, false);
        b.z.L(J, parcel);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
