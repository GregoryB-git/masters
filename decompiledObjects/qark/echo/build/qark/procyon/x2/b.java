// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import A2.m;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import B2.a;

public final class b extends a
{
    @NonNull
    public static final Parcelable$Creator<b> CREATOR;
    public static final b s;
    public final int o;
    public final int p;
    public final PendingIntent q;
    public final String r;
    
    static {
        s = new b(0);
        CREATOR = (Parcelable$Creator)new s();
    }
    
    public b(final int n) {
        this(n, null, null);
    }
    
    public b(final int o, final int p4, final PendingIntent q, final String r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public b(final int n, final PendingIntent pendingIntent) {
        this(n, pendingIntent, null);
    }
    
    public b(final int n, final PendingIntent pendingIntent, final String s) {
        this(1, n, pendingIntent, s);
    }
    
    public static String k(final int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            default: {
                switch (i) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                    }
                    case 24: {
                        return "API_DISABLED_FOR_CONNECTION";
                    }
                    case 23: {
                        return "API_DISABLED";
                    }
                    case 22: {
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    }
                    case 21: {
                        return "API_VERSION_UPDATE_REQUIRED";
                    }
                    case 20: {
                        return "RESTRICTED_PROFILE";
                    }
                    case 19: {
                        return "SERVICE_MISSING_PERMISSION";
                    }
                    case 18: {
                        return "SERVICE_UPDATING";
                    }
                    case 17: {
                        return "SIGN_IN_FAILED";
                    }
                    case 16: {
                        return "API_UNAVAILABLE";
                    }
                    case 15: {
                        return "INTERRUPTED";
                    }
                    case 14: {
                        return "TIMEOUT";
                    }
                    case 13: {
                        return "CANCELED";
                    }
                }
                break;
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "UNKNOWN";
            }
        }
    }
    
    public int a() {
        return this.p;
    }
    
    public String d() {
        return this.r;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.p == b.p && m.a(this.q, b.q) && m.a(this.r, b.r);
    }
    
    public PendingIntent f() {
        return this.q;
    }
    
    public boolean g() {
        return this.p != 0 && this.q != null;
    }
    
    @Override
    public int hashCode() {
        return m.b(this.p, this.q, this.r);
    }
    
    public boolean i() {
        return this.p == 0;
    }
    
    @Override
    public String toString() {
        final m.a c = m.c(this);
        c.a("statusCode", k(this.p));
        c.a("resolution", this.q);
        c.a("message", this.r);
        return c.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.i(parcel, 2, this.a());
        c.m(parcel, 3, (Parcelable)this.f(), n, false);
        c.n(parcel, 4, this.d(), false);
        c.b(parcel, a);
    }
}
