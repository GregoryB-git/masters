package c6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t6.a;

/* loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: o, reason: collision with root package name */
    public static final r.b f2365o;

    /* renamed from: a, reason: collision with root package name */
    public final int f2366a;

    /* renamed from: b, reason: collision with root package name */
    public List f2367b;

    /* renamed from: c, reason: collision with root package name */
    public List f2368c;

    /* renamed from: d, reason: collision with root package name */
    public List f2369d;

    /* renamed from: e, reason: collision with root package name */
    public List f2370e;
    public List f;

    static {
        r.b bVar = new r.b();
        f2365o = bVar;
        bVar.put("registered", a.C0230a.D(2, "registered"));
        bVar.put("in_progress", a.C0230a.D(3, "in_progress"));
        bVar.put("success", a.C0230a.D(4, "success"));
        bVar.put("failed", a.C0230a.D(5, "failed"));
        bVar.put("escrowed", a.C0230a.D(6, "escrowed"));
    }

    public e() {
        this.f2366a = 1;
    }

    public e(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f2366a = i10;
        this.f2367b = arrayList;
        this.f2368c = arrayList2;
        this.f2369d = arrayList3;
        this.f2370e = arrayList4;
        this.f = arrayList5;
    }

    @Override // t6.a
    public final Map getFieldMappings() {
        return f2365o;
    }

    @Override // t6.a
    public final Object getFieldValue(a.C0230a c0230a) {
        switch (c0230a.f14623o) {
            case 1:
                return Integer.valueOf(this.f2366a);
            case 2:
                return this.f2367b;
            case 3:
                return this.f2368c;
            case 4:
                return this.f2369d;
            case 5:
                return this.f2370e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException(defpackage.f.h("Unknown SafeParcelable id=", c0230a.f14623o));
        }
    }

    @Override // t6.a
    public final boolean isFieldSet(a.C0230a c0230a) {
        return true;
    }

    @Override // t6.a
    public final void setStringsInternal(a.C0230a c0230a, String str, ArrayList arrayList) {
        int i10 = c0230a.f14623o;
        if (i10 == 2) {
            this.f2367b = arrayList;
            return;
        }
        if (i10 == 3) {
            this.f2368c = arrayList;
            return;
        }
        if (i10 == 4) {
            this.f2369d = arrayList;
        } else if (i10 == 5) {
            this.f2370e = arrayList;
        } else {
            if (i10 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i10)));
            }
            this.f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2366a);
        z.G(parcel, 2, this.f2367b);
        z.G(parcel, 3, this.f2368c);
        z.G(parcel, 4, this.f2369d);
        z.G(parcel, 5, this.f2370e);
        z.G(parcel, 6, this.f);
        z.L(J, parcel);
    }
}
