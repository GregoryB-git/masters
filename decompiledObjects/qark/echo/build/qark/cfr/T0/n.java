/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.StringIndexOutOfBoundsException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package T0;

import T0.i;
import T0.j;
import X2.v;
import a3.f;
import android.os.Parcel;
import android.os.Parcelable;
import d0.w;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class n
extends i {
    public static final Parcelable.Creator<n> CREATOR = new Parcelable.Creator(){

        public n a(Parcel parcel) {
            return new n(parcel, null);
        }

        public n[] b(int n8) {
            return new n[n8];
        }
    };
    public final String p;
    public final String q;
    public final v r;

    public n(Parcel parcel) {
        this((String)a.e(parcel.readString()), parcel.readString(), v.V((String[])a.e(parcel.createStringArray())));
    }

    public /* synthetic */ n(Parcel parcel,  a8) {
        this(parcel);
    }

    public n(String object, String string2, List list) {
        super((String)object);
        a.a(list.isEmpty() ^ true);
        this.p = string2;
        this.r = object = v.U((Collection)list);
        this.q = (String)object.get(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List a(String string2) {
        ArrayList arrayList = new ArrayList();
        try {
            int n8;
            if (string2.length() >= 10) {
                arrayList.add((Object)Integer.parseInt((String)string2.substring(0, 4)));
                arrayList.add((Object)Integer.parseInt((String)string2.substring(5, 7)));
                n8 = Integer.parseInt((String)string2.substring(8, 10));
            } else if (string2.length() >= 7) {
                arrayList.add((Object)Integer.parseInt((String)string2.substring(0, 4)));
                n8 = Integer.parseInt((String)string2.substring(5, 7));
            } else {
                if (string2.length() < 4) return arrayList;
                n8 = Integer.parseInt((String)string2.substring(0, 4));
            }
            arrayList.add((Object)n8);
            return arrayList;
        }
        catch (NumberFormatException numberFormatException) {
            return new ArrayList();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void D(w.b b8) {
        Object object = this.o;
        object.hashCode();
        int n8 = object.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 2590194: {
                if (!object.equals((Object)"TYER")) break;
                n9 = 22;
                break;
            }
            case 2583398: {
                if (!object.equals((Object)"TRCK")) break;
                n9 = 21;
                break;
            }
            case 2581514: {
                if (!object.equals((Object)"TPE3")) break;
                n9 = 20;
                break;
            }
            case 2581513: {
                if (!object.equals((Object)"TPE2")) break;
                n9 = 19;
                break;
            }
            case 2581512: {
                if (!object.equals((Object)"TPE1")) break;
                n9 = 18;
                break;
            }
            case 2575251: {
                if (!object.equals((Object)"TIT2")) break;
                n9 = 17;
                break;
            }
            case 2571565: {
                if (!object.equals((Object)"TEXT")) break;
                n9 = 16;
                break;
            }
            case 2570410: {
                if (!object.equals((Object)"TDRL")) break;
                n9 = 15;
                break;
            }
            case 2570401: {
                if (!object.equals((Object)"TDRC")) break;
                n9 = 14;
                break;
            }
            case 2569891: {
                if (!object.equals((Object)"TDAT")) break;
                n9 = 13;
                break;
            }
            case 2569358: {
                if (!object.equals((Object)"TCON")) break;
                n9 = 12;
                break;
            }
            case 2569357: {
                if (!object.equals((Object)"TCOM")) break;
                n9 = 11;
                break;
            }
            case 2567331: {
                if (!object.equals((Object)"TALB")) break;
                n9 = 10;
                break;
            }
            case 83552: {
                if (!object.equals((Object)"TYE")) break;
                n9 = 9;
                break;
            }
            case 83536: {
                if (!object.equals((Object)"TXT")) break;
                n9 = 8;
                break;
            }
            case 83378: {
                if (!object.equals((Object)"TT2")) break;
                n9 = 7;
                break;
            }
            case 83341: {
                if (!object.equals((Object)"TRK")) break;
                n9 = 6;
                break;
            }
            case 83255: {
                if (!object.equals((Object)"TP3")) break;
                n9 = 5;
                break;
            }
            case 83254: {
                if (!object.equals((Object)"TP2")) break;
                n9 = 4;
                break;
            }
            case 83253: {
                if (!object.equals((Object)"TP1")) break;
                n9 = 3;
                break;
            }
            case 82897: {
                if (!object.equals((Object)"TDA")) break;
                n9 = 2;
                break;
            }
            case 82878: {
                if (!object.equals((Object)"TCM")) break;
                n9 = 1;
                break;
            }
            case 82815: {
                if (!object.equals((Object)"TAL")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return;
            }
            case 15: {
                object = n.a((String)this.r.get(0));
                n9 = object.size();
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            return;
                        }
                        b8.i0((Integer)object.get(2));
                    }
                    b8.j0((Integer)object.get(1));
                }
                b8.k0((Integer)object.get(0));
                return;
            }
            case 14: {
                object = n.a((String)this.r.get(0));
                n9 = object.size();
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            return;
                        }
                        b8.f0((Integer)object.get(2));
                    }
                    b8.g0((Integer)object.get(1));
                }
                b8.h0((Integer)object.get(0));
                return;
            }
            case 12: {
                object = f.o((String)this.r.get(0));
                if (object == null) {
                    object = (CharSequence)this.r.get(0);
                } else if ((object = j.a(object.intValue())) == null) return;
                b8.b0((CharSequence)object);
                return;
            }
            case 9: 
            case 22: {
                b8.h0(Integer.parseInt((String)((String)this.r.get(0))));
                return;
            }
            case 8: 
            case 16: {
                b8.r0((CharSequence)this.r.get(0));
                return;
            }
            case 7: 
            case 17: {
                b8.n0((CharSequence)this.r.get(0));
                return;
            }
            case 6: 
            case 21: {
                object = M.b1((String)this.r.get(0), "/");
                n9 = Integer.parseInt((String)object[0]);
                object = object.length > 1 ? Integer.valueOf((int)Integer.parseInt((String)object[1])) : null;
            }
            case 5: 
            case 20: {
                b8.U((CharSequence)this.r.get(0));
                return;
            }
            case 4: 
            case 19: {
                b8.N((CharSequence)this.r.get(0));
                return;
            }
            case 3: 
            case 18: {
                b8.P((CharSequence)this.r.get(0));
                return;
            }
            case 2: 
            case 13: {
                object = (String)this.r.get(0);
                n9 = Integer.parseInt((String)object.substring(2, 4));
                n8 = Integer.parseInt((String)object.substring(0, 2));
                b8.g0(n9).f0(n8);
                return;
            }
            case 1: 
            case 11: {
                b8.T((CharSequence)this.r.get(0));
                return;
            }
            case 0: 
            case 10: {
                b8.O((CharSequence)this.r.get(0));
                return;
            }
        }
        catch (NumberFormatException | StringIndexOutOfBoundsException numberFormatException) {
            return;
        }
        b8.q0(n9).p0((Integer)object);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (n.class != object.getClass()) {
                return false;
            }
            object = (n)object;
            if (M.c(this.o, object.o) && M.c(this.p, object.p) && this.r.equals((Object)object.r)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.o.hashCode();
        String string2 = this.p;
        int n9 = string2 != null ? string2.hashCode() : 0;
        return ((527 + n8) * 31 + n9) * 31 + this.r.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(": description=");
        stringBuilder.append(this.p);
        stringBuilder.append(": values=");
        stringBuilder.append((Object)this.r);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeStringArray((String[])this.r.toArray(new String[0]));
    }

}

