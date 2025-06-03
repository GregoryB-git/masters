/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package x2;

import A2.m;
import B2.a;
import B2.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import x2.s;

public final class b
extends a {
    @NonNull
    public static final Parcelable.Creator<b> CREATOR;
    public static final b s;
    public final int o;
    public final int p;
    public final PendingIntent q;
    public final String r;

    static {
        s = new b(0);
        CREATOR = new s();
    }

    public b(int n8) {
        this(n8, null, null);
    }

    public b(int n8, int n9, PendingIntent pendingIntent, String string2) {
        this.o = n8;
        this.p = n9;
        this.q = pendingIntent;
        this.r = string2;
    }

    public b(int n8, PendingIntent pendingIntent) {
        this(n8, pendingIntent, null);
    }

    public b(int n8, PendingIntent pendingIntent, String string2) {
        this(1, n8, pendingIntent, string2);
    }

    public static String k(int n8) {
        if (n8 != 99) {
            if (n8 != 1500) {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                                stringBuilder.append(n8);
                                stringBuilder.append(")");
                                return stringBuilder.toString();
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
                            case 13: 
                        }
                        return "CANCELED";
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
                    case -1: 
                }
                return "UNKNOWN";
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public int a() {
        return this.p;
    }

    public String d() {
        return this.r;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (this.p == object.p && m.a((Object)this.q, (Object)object.q) && m.a(this.r, object.r)) {
            return true;
        }
        return false;
    }

    public PendingIntent f() {
        return this.q;
    }

    public boolean g() {
        if (this.p != 0 && this.q != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m.b(new Object[]{this.p, this.q, this.r});
    }

    public boolean i() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        m.a a8 = m.c(this);
        a8.a("statusCode", b.k(this.p));
        a8.a("resolution", (Object)this.q);
        a8.a("message", this.r);
        return a8.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.i(parcel, 2, this.a());
        c.m(parcel, 3, (Parcelable)this.f(), n8, false);
        c.n(parcel, 4, this.d(), false);
        c.b(parcel, n9);
    }
}

