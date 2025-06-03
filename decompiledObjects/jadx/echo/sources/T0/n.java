package T0;

import X2.AbstractC0703v;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.C1200w;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6054p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6055q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0703v f6056r;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i7) {
            return new n[i7];
        }
    }

    public n(Parcel parcel) {
        this((String) AbstractC1297a.e(parcel.readString()), parcel.readString(), AbstractC0703v.V((String[]) AbstractC1297a.e(parcel.createStringArray())));
    }

    public static List a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        parseInt = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // T0.i, d0.C1201x.b
    public void D(C1200w.b bVar) {
        CharSequence a7;
        String str = this.f6042o;
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c7 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c7 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c7 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c7 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c7 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c7 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c7 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c7 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c7 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c7 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c7 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c7 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c7 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c7 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c7 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c7 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c7 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c7 = 22;
                    break;
                }
                break;
        }
        try {
            switch (c7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                case '\n':
                    bVar.O((CharSequence) this.f6056r.get(0));
                    break;
                case 1:
                case 11:
                    bVar.T((CharSequence) this.f6056r.get(0));
                    break;
                case 2:
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    String str2 = (String) this.f6056r.get(0);
                    bVar.g0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).f0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.P((CharSequence) this.f6056r.get(0));
                    break;
                case 4:
                case 19:
                    bVar.N((CharSequence) this.f6056r.get(0));
                    break;
                case 5:
                case 20:
                    bVar.U((CharSequence) this.f6056r.get(0));
                    break;
                case 6:
                case 21:
                    String[] b12 = M.b1((String) this.f6056r.get(0), "/");
                    bVar.q0(Integer.valueOf(Integer.parseInt(b12[0]))).p0(b12.length > 1 ? Integer.valueOf(Integer.parseInt(b12[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.n0((CharSequence) this.f6056r.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.r0((CharSequence) this.f6056r.get(0));
                    break;
                case '\t':
                case 22:
                    bVar.h0(Integer.valueOf(Integer.parseInt((String) this.f6056r.get(0))));
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    Integer o7 = a3.f.o((String) this.f6056r.get(0));
                    if (o7 == null) {
                        a7 = (CharSequence) this.f6056r.get(0);
                    } else {
                        a7 = j.a(o7.intValue());
                        if (a7 == null) {
                        }
                    }
                    bVar.b0(a7);
                    break;
                case 14:
                    List a8 = a((String) this.f6056r.get(0));
                    int size = a8.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.f0((Integer) a8.get(2));
                            }
                        }
                        bVar.g0((Integer) a8.get(1));
                    }
                    bVar.h0((Integer) a8.get(0));
                    break;
                case 15:
                    List a9 = a((String) this.f6056r.get(0));
                    int size2 = a9.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.i0((Integer) a9.get(2));
                            }
                        }
                        bVar.j0((Integer) a9.get(1));
                    }
                    bVar.k0((Integer) a9.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return M.c(this.f6042o, nVar.f6042o) && M.c(this.f6054p, nVar.f6054p) && this.f6056r.equals(nVar.f6056r);
    }

    public int hashCode() {
        int hashCode = (527 + this.f6042o.hashCode()) * 31;
        String str = this.f6054p;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f6056r.hashCode();
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": description=" + this.f6054p + ": values=" + this.f6056r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6042o);
        parcel.writeString(this.f6054p);
        parcel.writeStringArray((String[]) this.f6056r.toArray(new String[0]));
    }

    public /* synthetic */ n(Parcel parcel, a aVar) {
        this(parcel);
    }

    public n(String str, String str2, List list) {
        super(str);
        AbstractC1297a.a(!list.isEmpty());
        this.f6054p = str2;
        AbstractC0703v U6 = AbstractC0703v.U(list);
        this.f6056r = U6;
        this.f6055q = (String) U6.get(0);
    }
}
