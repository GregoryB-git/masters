/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import androidx.lifecycle.d;
import java.util.ArrayList;

public final class b
implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final ArrayList A;
    public final boolean B;
    public final int[] o;
    public final ArrayList p;
    public final int[] q;
    public final int[] r;
    public final int s;
    public final String t;
    public final int u;
    public final int v;
    public final CharSequence w;
    public final int x;
    public final CharSequence y;
    public final ArrayList z;

    public b(Parcel parcel) {
        this.o = parcel.createIntArray();
        this.p = parcel.createStringArrayList();
        this.q = parcel.createIntArray();
        this.r = parcel.createIntArray();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.w = (CharSequence)creator.createFromParcel(parcel);
        this.x = parcel.readInt();
        this.y = (CharSequence)creator.createFromParcel(parcel);
        this.z = parcel.createStringArrayList();
        this.A = parcel.createStringArrayList();
        boolean bl = parcel.readInt() != 0;
        this.B = bl;
    }

    public b(a a8) {
        int n8 = a8.c.size();
        this.o = new int[n8 * 5];
        if (a8.i) {
            this.p = new ArrayList(n8);
            this.q = new int[n8];
            this.r = new int[n8];
            int n9 = 0;
            int n10 = 0;
            do {
                int n11 = n10;
                if (n9 >= n8) break;
                v.a a9 = (v.a)a8.c.get(n9);
                this.o[n11] = a9.a;
                ArrayList arrayList = this.p;
                Object object = a9.b;
                object = object != null ? object.t : null;
                arrayList.add(object);
                object = this.o;
                object[n11 + 1] = a9.c;
                object[n11 + 2] = a9.d;
                object[n11 + 3] = a9.e;
                n10 = n11 + 5;
                object[n11 + 4] = a9.f;
                this.q[n9] = a9.g.ordinal();
                this.r[n9] = a9.h.ordinal();
                ++n9;
            } while (true);
            this.s = a8.h;
            this.t = a8.k;
            this.u = a8.v;
            this.v = a8.l;
            this.w = a8.m;
            this.x = a8.n;
            this.y = a8.o;
            this.z = a8.p;
            this.A = a8.q;
            this.B = a8.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /*
     * Enabled aggressive block sorting
     */
    public a a(n n8) {
        a a8 = new a(n8);
        int n9 = 0;
        int n10 = 0;
        do {
            int n11;
            int n12;
            int n13;
            int n14;
            if ((n13 = n9) >= this.o.length) {
                a8.h = this.s;
                a8.k = this.t;
                a8.v = this.u;
                a8.i = true;
                a8.l = this.v;
                a8.m = this.w;
                a8.n = this.x;
                a8.o = this.y;
                a8.p = this.z;
                a8.q = this.A;
                a8.r = this.B;
                a8.m(1);
                return a8;
            }
            v.a a9 = new v.a();
            Object object = this.o;
            n9 = n13 + 1;
            a9.a = object[n13];
            if (n.D0(2)) {
                object = new StringBuilder();
                object.append("Instantiate ");
                object.append((Object)a8);
                object.append(" op #");
                object.append(n10);
                object.append(" base fragment #");
                object.append(this.o[n9]);
                Log.v((String)"FragmentManager", (String)object.toString());
            }
            object = (object = (String)this.p.get(n10)) != null ? n8.f0((String)object) : null;
            a9.b = object;
            a9.g = d.c.values()[this.q[n10]];
            a9.h = d.c.values()[this.r[n10]];
            object = this.o;
            a9.c = n14 = object[n9];
            a9.d = n11 = object[n13 + 2];
            a9.e = n12 = object[n13 + 3];
            n9 = n13 + 5;
            a9.f = n13 = object[n13 + 4];
            a8.d = n14;
            a8.e = n11;
            a8.f = n12;
            a8.g = n13;
            a8.e(a9);
            ++n10;
        } while (true);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

}

