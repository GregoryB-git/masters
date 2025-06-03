package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements C1201x.b {

    /* renamed from: o, reason: collision with root package name */
    public final String f4314o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4315p;

    /* renamed from: q, reason: collision with root package name */
    public final long f4316q;

    /* renamed from: r, reason: collision with root package name */
    public final long f4317r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f4318s;

    /* renamed from: t, reason: collision with root package name */
    public int f4319t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1194q f4312u = new C1194q.b().o0("application/id3").K();

    /* renamed from: v, reason: collision with root package name */
    public static final C1194q f4313v = new C1194q.b().o0("application/x-scte35").K();
    public static final Parcelable.Creator<a> CREATOR = new C0080a();

    /* renamed from: Q0.a$a, reason: collision with other inner class name */
    public class C0080a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(Parcel parcel) {
        this.f4314o = (String) M.i(parcel.readString());
        this.f4315p = (String) M.i(parcel.readString());
        this.f4316q = parcel.readLong();
        this.f4317r = parcel.readLong();
        this.f4318s = (byte[]) M.i(parcel.createByteArray());
    }

    @Override // d0.C1201x.b
    public /* synthetic */ void D(C1200w.b bVar) {
        AbstractC1202y.c(this, bVar);
    }

    @Override // d0.C1201x.b
    public byte[] M() {
        if (s() != null) {
            return this.f4318s;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4316q == aVar.f4316q && this.f4317r == aVar.f4317r && M.c(this.f4314o, aVar.f4314o) && M.c(this.f4315p, aVar.f4315p) && Arrays.equals(this.f4318s, aVar.f4318s);
    }

    public int hashCode() {
        if (this.f4319t == 0) {
            String str = this.f4314o;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4315p;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j7 = this.f4316q;
            int i7 = (((hashCode + hashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f4317r;
            this.f4319t = ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + Arrays.hashCode(this.f4318s);
        }
        return this.f4319t;
    }

    @Override // d0.C1201x.b
    public C1194q s() {
        String str = this.f4314o;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f4313v;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f4312u;
            default:
                return null;
        }
    }

    public String toString() {
        return "EMSG: scheme=" + this.f4314o + ", id=" + this.f4317r + ", durationMs=" + this.f4316q + ", value=" + this.f4315p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4314o);
        parcel.writeString(this.f4315p);
        parcel.writeLong(this.f4316q);
        parcel.writeLong(this.f4317r);
        parcel.writeByteArray(this.f4318s);
    }

    public a(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f4314o = str;
        this.f4315p = str2;
        this.f4316q = j7;
        this.f4317r = j8;
        this.f4318s = bArr;
    }
}
