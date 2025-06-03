// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import android.os.Parcelable;
import java.util.Arrays;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d extends i
{
    public static final Parcelable$Creator<d> CREATOR;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final String[] s;
    public final i[] t;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public d a(final Parcel parcel) {
                return new d(parcel);
            }
            
            public d[] b(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final Parcel parcel) {
        super("CTOC");
        this.p = (String)M.i(parcel.readString());
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        int i = 0;
        this.q = (byte1 != 0);
        this.r = (parcel.readByte() != 0 && b);
        this.s = (String[])M.i(parcel.createStringArray());
        final int int1 = parcel.readInt();
        this.t = new i[int1];
        while (i < int1) {
            this.t[i] = (i)parcel.readParcelable(i.class.getClassLoader());
            ++i;
        }
    }
    
    public d(final String p5, final boolean q, final boolean r, final String[] s, final i[] t) {
        super("CTOC");
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (d.class != o.getClass()) {
            return false;
        }
        final d d = (d)o;
        return this.q == d.q && this.r == d.r && M.c(this.p, d.p) && Arrays.equals(this.s, d.s) && Arrays.equals(this.t, d.t);
    }
    
    @Override
    public int hashCode() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeByte((byte)(byte)(this.q ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.r ? 1 : 0));
        parcel.writeStringArray(this.s);
        parcel.writeInt(this.t.length);
        final i[] t = this.t;
        int length;
        for (length = t.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)t[i], 0);
        }
    }
}
