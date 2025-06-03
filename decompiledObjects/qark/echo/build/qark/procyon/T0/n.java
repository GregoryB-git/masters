// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import g0.M;
import a3.f;
import d0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import g0.a;
import android.os.Parcel;
import X2.v;
import android.os.Parcelable$Creator;

public final class n extends i
{
    public static final Parcelable$Creator<n> CREATOR;
    public final String p;
    public final String q;
    public final v r;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public n a(final Parcel parcel) {
                return new n(parcel, null);
            }
            
            public n[] b(final int n) {
                return new n[n];
            }
        };
    }
    
    public n(final Parcel parcel) {
        this((String)a.e(parcel.readString()), parcel.readString(), v.V((Object[])a.e(parcel.createStringArray())));
    }
    
    public n(final String s, final String p3, final List list) {
        super(s);
        a.a(list.isEmpty() ^ true);
        this.p = p3;
        final v u = v.U(list);
        this.r = u;
        this.q = u.get(0);
    }
    
    public static List a(final String s) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            int i;
            if (s.length() >= 10) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
                i = Integer.parseInt(s.substring(8, 10));
            }
            else if (s.length() >= 7) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                i = Integer.parseInt(s.substring(5, 7));
            }
            else {
                if (s.length() < 4) {
                    return list;
                }
                i = Integer.parseInt(s.substring(0, 4));
            }
            list.add(i);
            return list;
        }
        catch (NumberFormatException ex) {
            return new ArrayList();
        }
    }
    
    @Override
    public void D(final w.b b) {
        final String o = super.o;
        o.hashCode();
        final int hashCode = o.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2590194: {
                if (!o.equals("TYER")) {
                    break;
                }
                n = 22;
                break;
            }
            case 2583398: {
                if (!o.equals("TRCK")) {
                    break;
                }
                n = 21;
                break;
            }
            case 2581514: {
                if (!o.equals("TPE3")) {
                    break;
                }
                n = 20;
                break;
            }
            case 2581513: {
                if (!o.equals("TPE2")) {
                    break;
                }
                n = 19;
                break;
            }
            case 2581512: {
                if (!o.equals("TPE1")) {
                    break;
                }
                n = 18;
                break;
            }
            case 2575251: {
                if (!o.equals("TIT2")) {
                    break;
                }
                n = 17;
                break;
            }
            case 2571565: {
                if (!o.equals("TEXT")) {
                    break;
                }
                n = 16;
                break;
            }
            case 2570410: {
                if (!o.equals("TDRL")) {
                    break;
                }
                n = 15;
                break;
            }
            case 2570401: {
                if (!o.equals("TDRC")) {
                    break;
                }
                n = 14;
                break;
            }
            case 2569891: {
                if (!o.equals("TDAT")) {
                    break;
                }
                n = 13;
                break;
            }
            case 2569358: {
                if (!o.equals("TCON")) {
                    break;
                }
                n = 12;
                break;
            }
            case 2569357: {
                if (!o.equals("TCOM")) {
                    break;
                }
                n = 11;
                break;
            }
            case 2567331: {
                if (!o.equals("TALB")) {
                    break;
                }
                n = 10;
                break;
            }
            case 83552: {
                if (!o.equals("TYE")) {
                    break;
                }
                n = 9;
                break;
            }
            case 83536: {
                if (!o.equals("TXT")) {
                    break;
                }
                n = 8;
                break;
            }
            case 83378: {
                if (!o.equals("TT2")) {
                    break;
                }
                n = 7;
                break;
            }
            case 83341: {
                if (!o.equals("TRK")) {
                    break;
                }
                n = 6;
                break;
            }
            case 83255: {
                if (!o.equals("TP3")) {
                    break;
                }
                n = 5;
                break;
            }
            case 83254: {
                if (!o.equals("TP2")) {
                    break;
                }
                n = 4;
                break;
            }
            case 83253: {
                if (!o.equals("TP1")) {
                    break;
                }
                n = 3;
                break;
            }
            case 82897: {
                if (!o.equals("TDA")) {
                    break;
                }
                n = 2;
                break;
            }
            case 82878: {
                if (!o.equals("TCM")) {
                    break;
                }
                n = 1;
                break;
            }
            case 82815: {
                if (!o.equals("TAL")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        Label_1242: {
            switch (n) {
                default: {}
                case 15: {
                    final List a = a(this.r.get(0));
                    final int size = a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            b.i0(a.get(2));
                        }
                        b.j0(a.get(1));
                    }
                    b.k0(a.get(0));
                }
                case 14: {
                    final List a2 = a(this.r.get(0));
                    final int size2 = a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            b.f0(a2.get(2));
                        }
                        b.g0(a2.get(1));
                    }
                    b.h0(a2.get(0));
                }
                case 12: {
                    final Integer o2 = f.o(this.r.get(0));
                    CharSequence a3;
                    if (o2 == null) {
                        a3 = this.r.get(0);
                    }
                    else {
                        a3 = j.a(o2);
                        if (a3 == null) {
                            return;
                        }
                    }
                    b.b0(a3);
                }
                case 9:
                case 22: {
                    break Label_1242;
                }
                case 8:
                case 16: {
                    break Label_1242;
                }
                case 7:
                case 17: {
                    break Label_1242;
                }
                case 6:
                case 21: {
                    break Label_1242;
                }
                case 5:
                case 20: {
                    break Label_1242;
                }
                case 4:
                case 19: {
                    break Label_1242;
                }
                case 3:
                case 18: {
                    break Label_1242;
                }
                case 2:
                case 13: {
                    break Label_1242;
                }
                case 1:
                case 11: {
                    break Label_1242;
                }
                case 0:
                case 10: {
                    Label_1261: {
                        break Label_1261;
                        while (true) {
                            while (true) {
                                try {
                                    b.h0(Integer.parseInt(this.r.get(0)));
                                    return;
                                    b.P(this.r.get(0));
                                    return;
                                    final String[] b2 = M.b1(this.r.get(0), "/");
                                    final int int1 = Integer.parseInt(b2[0]);
                                    // iftrue(Label_1282:, b2.length <= 1)
                                    Block_33: {
                                        break Block_33;
                                        final Integer value;
                                        b.q0(int1).p0(value);
                                        return;
                                        b.U(this.r.get(0));
                                        return;
                                        b.N(this.r.get(0));
                                        return;
                                        b.r0(this.r.get(0));
                                        return;
                                        try {
                                            final String s = this.r.get(0);
                                            b.g0(Integer.parseInt(s.substring(2, 4))).f0(Integer.parseInt(s.substring(0, 2)));
                                            return;
                                            b.O(this.r.get(0));
                                            return;
                                            b.T(this.r.get(0));
                                            return;
                                        }
                                        catch (StringIndexOutOfBoundsException ex) {
                                            return;
                                        }
                                    }
                                    final Integer value = Integer.parseInt(b2[1]);
                                    continue;
                                    b.n0(this.r.get(0));
                                    return;
                                }
                                catch (NumberFormatException ex2) {}
                                Label_1282: {
                                    final Integer value = null;
                                }
                                continue;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (n.class != o.getClass()) {
            return false;
        }
        final n n = (n)o;
        return M.c(super.o, n.o) && M.c(this.p, n.p) && this.r.equals(n.r);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.o.hashCode();
        final String p = this.p;
        int hashCode2;
        if (p != null) {
            hashCode2 = p.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return ((527 + hashCode) * 31 + hashCode2) * 31 + this.r.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.o);
        sb.append(": description=");
        sb.append(this.p);
        sb.append(": values=");
        sb.append(this.r);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.o);
        parcel.writeString(this.p);
        parcel.writeStringArray((String[])this.r.toArray(new String[0]));
    }
}
