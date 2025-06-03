// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class s implements Parcelable
{
    public static final Parcelable$Creator<s> CREATOR;
    public Bundle A;
    public final String o;
    public final String p;
    public final boolean q;
    public final int r;
    public final int s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final Bundle x;
    public final boolean y;
    public final int z;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public s a(final Parcel parcel) {
                return new s(parcel);
            }
            
            public s[] b(final int n) {
                return new s[n];
            }
        };
    }
    
    public s(final Parcel parcel) {
        this.o = parcel.readString();
        this.p = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.q = (int1 != 0);
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = (parcel.readInt() != 0);
        this.v = (parcel.readInt() != 0);
        this.w = (parcel.readInt() != 0);
        this.x = parcel.readBundle();
        this.y = (parcel.readInt() != 0 && b);
        this.A = parcel.readBundle();
        this.z = parcel.readInt();
    }
    
    public s(final Fragment fragment) {
        this.o = fragment.getClass().getName();
        this.p = fragment.t;
        this.q = fragment.B;
        this.r = fragment.K;
        this.s = fragment.L;
        this.t = fragment.M;
        this.u = fragment.P;
        this.v = fragment.A;
        this.w = fragment.O;
        this.x = fragment.u;
        this.y = fragment.N;
        this.z = fragment.f0.ordinal();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.o);
        sb.append(" (");
        sb.append(this.p);
        sb.append(")}:");
        if (this.q) {
            sb.append(" fromLayout");
        }
        if (this.s != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.s));
        }
        final String t = this.t;
        if (t != null && !t.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.t);
        }
        if (this.u) {
            sb.append(" retainInstance");
        }
        if (this.v) {
            sb.append(" removing");
        }
        if (this.w) {
            sb.append(" detached");
        }
        if (this.y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
