/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Arrays
 */
package T0;

import T0.i;
import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

public final class d
extends i {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator(){

        public d a(Parcel parcel) {
            return new d(parcel);
        }

        public d[] b(int n8) {
            return new d[n8];
        }
    };
    public final String p;
    public final boolean q;
    public final boolean r;
    public final String[] s;
    public final i[] t;

    public d(Parcel parcel) {
        super("CTOC");
        this.p = (String)M.i(parcel.readString());
        int n8 = parcel.readByte();
        boolean bl = true;
        boolean bl2 = n8 != 0;
        this.q = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.r = bl2;
        this.s = (String[])M.i(parcel.createStringArray());
        n8 = parcel.readInt();
        this.t = new i[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            this.t[i8] = (i)parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String string2, boolean bl, boolean bl2, String[] arrstring, i[] arri) {
        super("CTOC");
        this.p = string2;
        this.q = bl;
        this.r = bl2;
        this.s = arrstring;
        this.t = arri;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (d.class != object.getClass()) {
                return false;
            }
            object = (d)object;
            if (this.q == object.q && this.r == object.r && M.c(this.p, object.p) && Arrays.equals((Object[])this.s, (Object[])object.s) && Arrays.equals((Object[])this.t, (Object[])object.t)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.p);
        parcel.writeByte((byte)(this.q ? 1 : 0));
        parcel.writeByte((byte)(this.r ? 1 : 0));
        parcel.writeStringArray(this.s);
        parcel.writeInt(this.t.length);
        i[] arri = this.t;
        int n9 = arri.length;
        for (n8 = 0; n8 < n9; ++n8) {
            parcel.writeParcelable((Parcelable)arri[n8], 0);
        }
    }

}

