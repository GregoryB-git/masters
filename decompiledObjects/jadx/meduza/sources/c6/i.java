package c6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t6.a;

/* loaded from: classes.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: p, reason: collision with root package name */
    public static final HashMap f2377p;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2379b;

    /* renamed from: c, reason: collision with root package name */
    public String f2380c;

    /* renamed from: d, reason: collision with root package name */
    public int f2381d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f2382e;
    public PendingIntent f;

    /* renamed from: o, reason: collision with root package name */
    public a f2383o;

    static {
        HashMap hashMap = new HashMap();
        f2377p = hashMap;
        hashMap.put("accountType", new a.C0230a(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new a.C0230a(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new a.C0230a(8, false, 8, false, "transferBytes", 4, null));
    }

    public i() {
        this.f2378a = new r.d(3);
        this.f2379b = 1;
    }

    public i(HashSet hashSet, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f2378a = hashSet;
        this.f2379b = i10;
        this.f2380c = str;
        this.f2381d = i11;
        this.f2382e = bArr;
        this.f = pendingIntent;
        this.f2383o = aVar;
    }

    @Override // t6.a
    public final /* synthetic */ Map getFieldMappings() {
        return f2377p;
    }

    @Override // t6.a
    public final Object getFieldValue(a.C0230a c0230a) {
        int i10;
        int i11 = c0230a.f14623o;
        if (i11 == 1) {
            i10 = this.f2379b;
        } else {
            if (i11 == 2) {
                return this.f2380c;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f2382e;
                }
                throw new IllegalStateException(defpackage.f.h("Unknown SafeParcelable id=", c0230a.f14623o));
            }
            i10 = this.f2381d;
        }
        return Integer.valueOf(i10);
    }

    @Override // t6.a
    public final boolean isFieldSet(a.C0230a c0230a) {
        return this.f2378a.contains(Integer.valueOf(c0230a.f14623o));
    }

    @Override // t6.a
    public final void setDecodedBytesInternal(a.C0230a c0230a, String str, byte[] bArr) {
        int i10 = c0230a.f14623o;
        if (i10 != 4) {
            throw new IllegalArgumentException(a0.j.h("Field with id=", i10, " is not known to be a byte array."));
        }
        this.f2382e = bArr;
        this.f2378a.add(Integer.valueOf(i10));
    }

    @Override // t6.a
    public final void setIntegerInternal(a.C0230a c0230a, String str, int i10) {
        int i11 = c0230a.f14623o;
        if (i11 != 3) {
            throw new IllegalArgumentException(a0.j.h("Field with id=", i11, " is not known to be an int."));
        }
        this.f2381d = i10;
        this.f2378a.add(Integer.valueOf(i11));
    }

    @Override // t6.a
    public final void setStringInternal(a.C0230a c0230a, String str, String str2) {
        int i10 = c0230a.f14623o;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
        }
        this.f2380c = str2;
        this.f2378a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        Set set = this.f2378a;
        if (set.contains(1)) {
            z.z(parcel, 1, this.f2379b);
        }
        if (set.contains(2)) {
            z.F(parcel, 2, this.f2380c, true);
        }
        if (set.contains(3)) {
            z.z(parcel, 3, this.f2381d);
        }
        if (set.contains(4)) {
            z.w(parcel, 4, this.f2382e, true);
        }
        if (set.contains(5)) {
            z.E(parcel, 5, this.f, i10, true);
        }
        if (set.contains(6)) {
            z.E(parcel, 6, this.f2383o, i10, true);
        }
        z.L(J, parcel);
    }
}
