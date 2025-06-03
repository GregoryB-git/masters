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
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Map
 */
package S0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.M;
import g0.a;
import g0.o;
import java.util.List;
import java.util.Map;

public final class b
implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final boolean s;
    public final int t;

    public b(int n8, String string2, String string3, String string4, boolean bl, int n9) {
        boolean bl2 = n9 == -1 || n9 > 0;
        a.a(bl2);
        this.o = n8;
        this.p = string2;
        this.q = string3;
        this.r = string4;
        this.s = bl;
        this.t = n9;
    }

    public b(Parcel parcel) {
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = M.T0(parcel);
        this.t = parcel.readInt();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static b a(Map object) {
        Object var11_10;
        int n8;
        Object object4;
        int n10;
        boolean bl;
        Object object3;
        int n9;
        Object object2;
        block24 : {
            int n13;
            int n11;
            int n12;
            block23 : {
                block17 : {
                    block21 : {
                        block22 : {
                            object2 = (List)object.get((Object)"icy-br");
                            n13 = 1;
                            n11 = -1;
                            if (object2 == null) break block21;
                            object2 = (String)object2.get(0);
                            try {
                                n12 = Integer.parseInt((String)object2);
                            }
                            catch (NumberFormatException numberFormatException) {}
                            n8 = n12 * 1000;
                            if (n8 <= 0) break block22;
                            n12 = 1;
                            break block17;
                        }
                        try {
                            object3 = new StringBuilder();
                            object3.append("Invalid bitrate: ");
                            object3.append((String)object2);
                            o.h("IcyHeaders", object3.toString());
                            n12 = 0;
                            n8 = -1;
                            break block17;
                        }
                        catch (NumberFormatException numberFormatException) {}
                    }
                    n12 = 0;
                    n9 = -1;
                    break block23;
                    n8 = -1;
                    object3 = new StringBuilder();
                    object3.append("Invalid bitrate header: ");
                    object3.append((String)object2);
                    o.h("IcyHeaders", object3.toString());
                    n12 = 0;
                }
                n9 = n8;
            }
            object2 = (List)object.get((Object)"icy-genre");
            var11_10 = null;
            if (object2 != null) {
                object2 = (String)object2.get(0);
                n12 = 1;
            } else {
                object2 = null;
            }
            object3 = (List)object.get((Object)"icy-name");
            if (object3 != null) {
                object3 = (String)object3.get(0);
                n12 = 1;
            } else {
                object3 = null;
            }
            object4 = (List)object.get((Object)"icy-url");
            if (object4 != null) {
                object4 = (String)object4.get(0);
                n12 = 1;
            } else {
                object4 = null;
            }
            List list = (List)object.get((Object)"icy-pub");
            if (list != null) {
                bl = ((String)list.get(0)).equals((Object)"1");
                n12 = 1;
            } else {
                bl = false;
            }
            object = (List)object.get((Object)"icy-metaint");
            n10 = n12;
            n8 = n11;
            if (object != null) {
                block19 : {
                    block18 : {
                        object = (String)object.get(0);
                        n8 = Integer.parseInt((String)object);
                        if (n8 <= 0) break block18;
                        n12 = n13;
                        n11 = n8;
                        break block19;
                    }
                    try {
                        list = new StringBuilder();
                        list.append("Invalid metadata interval: ");
                        list.append((String)object);
                        o.h("IcyHeaders", list.toString());
                    }
                    catch (NumberFormatException numberFormatException) {}
                }
                n10 = n12;
                n8 = n11;
                break block24;
                catch (NumberFormatException numberFormatException) {
                    n8 = n11;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid metadata interval: ");
                stringBuilder.append((String)object);
                o.h("IcyHeaders", stringBuilder.toString());
                n10 = n12;
            }
        }
        object = var11_10;
        if (n10 == 0) return object;
        return new b(n9, (String)object2, (String)object3, (String)object4, bl, n8);
    }

    @Override
    public void D(w.b b8) {
        String string2 = this.q;
        if (string2 != null) {
            b8.l0(string2);
        }
        if ((string2 = this.p) != null) {
            b8.b0(string2);
        }
    }

    @Override
    public /* synthetic */ byte[] M() {
        return y.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            object = (b)object;
            if (this.o == object.o && M.c(this.p, object.p) && M.c(this.q, object.q) && M.c(this.r, object.r) && this.s == object.s && this.t == object.t) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IcyHeaders: name=\"");
        stringBuilder.append(this.q);
        stringBuilder.append("\", genre=\"");
        stringBuilder.append(this.p);
        stringBuilder.append("\", bitrate=");
        stringBuilder.append(this.o);
        stringBuilder.append(", metadataInterval=");
        stringBuilder.append(this.t);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        M.j1(parcel, this.s);
        parcel.writeInt(this.t);
    }

}

