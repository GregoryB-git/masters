package r4;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import java.util.Arrays;
import p4.a;
import v3.i0;
import v3.p0;
import v5.e0;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: o, reason: collision with root package name */
    public static final i0 f13604o;

    /* renamed from: p, reason: collision with root package name */
    public static final i0 f13605p;

    /* renamed from: a, reason: collision with root package name */
    public final String f13606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13608c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13609d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13610e;
    public int f;

    /* renamed from: r4.a$a, reason: collision with other inner class name */
    public class C0207a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    static {
        i0.a aVar = new i0.a();
        aVar.f15472k = "application/id3";
        f13604o = aVar.a();
        i0.a aVar2 = new i0.a();
        aVar2.f15472k = "application/x-scte35";
        f13605p = aVar2.a();
        CREATOR = new C0207a();
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f13606a = readString;
        this.f13607b = parcel.readString();
        this.f13608c = parcel.readLong();
        this.f13609d = parcel.readLong();
        this.f13610e = parcel.createByteArray();
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f13606a = str;
        this.f13607b = str2;
        this.f13608c = j10;
        this.f13609d = j11;
        this.f13610e = bArr;
    }

    @Override // p4.a.b
    public final byte[] B() {
        if (n() != null) {
            return this.f13610e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13608c == aVar.f13608c && this.f13609d == aVar.f13609d && e0.a(this.f13606a, aVar.f13606a) && e0.a(this.f13607b, aVar.f13607b) && Arrays.equals(this.f13610e, aVar.f13610e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.f13606a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13607b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f13608c;
            int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f13609d;
            this.f = Arrays.hashCode(this.f13610e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f;
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final i0 n() {
        String str = this.f13606a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f13605p;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f13604o;
            default:
                return null;
        }
    }

    public final String toString() {
        StringBuilder l10 = f.l("EMSG: scheme=");
        l10.append(this.f13606a);
        l10.append(", id=");
        l10.append(this.f13609d);
        l10.append(", durationMs=");
        l10.append(this.f13608c);
        l10.append(", value=");
        l10.append(this.f13607b);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13606a);
        parcel.writeString(this.f13607b);
        parcel.writeLong(this.f13608c);
        parcel.writeLong(this.f13609d);
        parcel.writeByteArray(this.f13610e);
    }
}
