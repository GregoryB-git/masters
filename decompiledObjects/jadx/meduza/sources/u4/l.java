package u4;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import o7.l0;
import o7.t;
import v3.p0;
import v5.e0;

/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14973b;

    /* renamed from: c, reason: collision with root package name */
    public final t<String> f14974c;

    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            String readString2 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            createStringArray.getClass();
            return new l(readString, readString2, t.q(createStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, String str2, l0 l0Var) {
        super(str);
        x6.b.q(!l0Var.isEmpty());
        this.f14973b = str2;
        t<String> p10 = t.p(l0Var);
        this.f14974c = p10;
        p10.get(0);
    }

    public static ArrayList a(String str) {
        String substring;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                substring = str.substring(8, 10);
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        substring = str.substring(0, 4);
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                substring = str.substring(5, 7);
            }
            arrayList.add(Integer.valueOf(Integer.parseInt(substring)));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return e0.a(this.f14963a, lVar.f14963a) && e0.a(this.f14973b, lVar.f14973b) && this.f14974c.equals(lVar.f14974c);
    }

    public final int hashCode() {
        int e10 = a0.j.e(this.f14963a, 527, 31);
        String str = this.f14973b;
        return this.f14974c.hashCode() + ((e10 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // u4.h, p4.a.b
    public final void l(p0.a aVar) {
        char c10;
        String str = this.f14963a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    aVar.f15668c = this.f14974c.get(0);
                    break;
                case 1:
                case 11:
                    aVar.f15688y = this.f14974c.get(0);
                    break;
                case 2:
                case '\f':
                    String str2 = this.f14974c.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.f15683s = Integer.valueOf(parseInt);
                    aVar.t = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 17:
                    aVar.f15667b = this.f14974c.get(0);
                    break;
                case 4:
                case 18:
                    aVar.f15669d = this.f14974c.get(0);
                    break;
                case 5:
                case 19:
                    aVar.f15689z = this.f14974c.get(0);
                    break;
                case 6:
                case 20:
                    String str3 = this.f14974c.get(0);
                    int i10 = e0.f15881a;
                    String[] split = str3.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    aVar.f15677m = Integer.valueOf(parseInt3);
                    aVar.f15678n = valueOf;
                    break;
                case 7:
                case 16:
                    aVar.f15666a = this.f14974c.get(0);
                    break;
                case '\b':
                case 15:
                    aVar.f15687x = this.f14974c.get(0);
                    break;
                case '\t':
                case 21:
                    aVar.f15682r = Integer.valueOf(Integer.parseInt(this.f14974c.get(0)));
                    break;
                case '\r':
                    ArrayList a10 = a(this.f14974c.get(0));
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.t = (Integer) a10.get(2);
                            }
                        }
                        aVar.f15683s = (Integer) a10.get(1);
                    }
                    aVar.f15682r = (Integer) a10.get(0);
                    break;
                case 14:
                    ArrayList a11 = a(this.f14974c.get(0));
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.f15686w = (Integer) a11.get(2);
                            }
                        }
                        aVar.f15685v = (Integer) a11.get(1);
                    }
                    aVar.f15684u = (Integer) a11.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": description=" + this.f14973b + ": values=" + this.f14974c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14963a);
        parcel.writeString(this.f14973b);
        parcel.writeStringArray((String[]) this.f14974c.toArray(new String[0]));
    }
}
