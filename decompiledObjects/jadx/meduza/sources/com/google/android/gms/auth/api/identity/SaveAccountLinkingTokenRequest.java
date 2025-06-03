package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d6.y;
import java.util.Arrays;
import java.util.List;
import m6.h;
import n6.a;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f2757a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2758b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2759c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2760d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2761e;
    public final int f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f2757a = pendingIntent;
        this.f2758b = str;
        this.f2759c = str2;
        this.f2760d = list;
        this.f2761e = str3;
        this.f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f2760d.size() == saveAccountLinkingTokenRequest.f2760d.size() && this.f2760d.containsAll(saveAccountLinkingTokenRequest.f2760d) && h.a(this.f2757a, saveAccountLinkingTokenRequest.f2757a) && h.a(this.f2758b, saveAccountLinkingTokenRequest.f2758b) && h.a(this.f2759c, saveAccountLinkingTokenRequest.f2759c) && h.a(this.f2761e, saveAccountLinkingTokenRequest.f2761e) && this.f == saveAccountLinkingTokenRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2757a, this.f2758b, this.f2759c, this.f2760d, this.f2761e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.E(parcel, 1, this.f2757a, i10, false);
        z.F(parcel, 2, this.f2758b, false);
        z.F(parcel, 3, this.f2759c, false);
        z.G(parcel, 4, this.f2760d);
        z.F(parcel, 5, this.f2761e, false);
        z.z(parcel, 6, this.f);
        z.L(J, parcel);
    }
}
