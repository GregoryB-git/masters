package va;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f16083a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Object> f16084b;

    public t(String str, List<Object> list) {
        this.f16083a = str;
        this.f16084b = list == null ? new ArrayList<>() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String str = this.f16083a;
        if (str != null) {
            if (!str.equals(tVar.f16083a)) {
                return false;
            }
        } else if (tVar.f16083a != null) {
            return false;
        }
        if (this.f16084b.size() != tVar.f16084b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16084b.size(); i10++) {
            if ((this.f16084b.get(i10) instanceof byte[]) && (tVar.f16084b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f16084b.get(i10), (byte[]) tVar.f16084b.get(i10))) {
                    return false;
                }
            } else if (!this.f16084b.get(i10).equals(tVar.f16084b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f16083a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16083a);
        List<Object> list = this.f16084b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            StringBuilder l10 = defpackage.f.l(" ");
            l10.append(this.f16084b);
            str = l10.toString();
        }
        sb2.append(str);
        return sb2.toString();
    }
}
