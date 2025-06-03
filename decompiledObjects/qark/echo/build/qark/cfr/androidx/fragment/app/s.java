/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d;

public final class s
implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new Parcelable.Creator(){

        public s a(Parcel parcel) {
            return new s(parcel);
        }

        public s[] b(int n8) {
            return new s[n8];
        }
    };
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

    public s(Parcel parcel) {
        this.o = parcel.readString();
        this.p = parcel.readString();
        int n8 = parcel.readInt();
        boolean bl = true;
        boolean bl2 = n8 != 0;
        this.q = bl2;
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        bl2 = parcel.readInt() != 0;
        this.u = bl2;
        bl2 = parcel.readInt() != 0;
        this.v = bl2;
        bl2 = parcel.readInt() != 0;
        this.w = bl2;
        this.x = parcel.readBundle();
        bl2 = parcel.readInt() != 0 ? bl : false;
        this.y = bl2;
        this.A = parcel.readBundle();
        this.z = parcel.readInt();
    }

    public s(Fragment fragment) {
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

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentState{");
        stringBuilder.append(this.o);
        stringBuilder.append(" (");
        stringBuilder.append(this.p);
        stringBuilder.append(")}:");
        if (this.q) {
            stringBuilder.append(" fromLayout");
        }
        if (this.s != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString((int)this.s));
        }
        if ((string2 = this.t) != null && !string2.isEmpty()) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.t);
        }
        if (this.u) {
            stringBuilder.append(" retainInstance");
        }
        if (this.v) {
            stringBuilder.append(" removing");
        }
        if (this.w) {
            stringBuilder.append(" detached");
        }
        if (this.y) {
            stringBuilder.append(" hidden");
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

}

