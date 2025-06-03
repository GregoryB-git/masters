// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import androidx.lifecycle.d;
import android.util.Log;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
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
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        this.o = parcel.createIntArray();
        this.p = parcel.createStringArrayList();
        this.q = parcel.createIntArray();
        this.r = parcel.createIntArray();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        final Parcelable$Creator char_SEQUENCE_CREATOR = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.w = (CharSequence)char_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.x = parcel.readInt();
        this.y = (CharSequence)char_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.z = parcel.createStringArrayList();
        this.A = parcel.createStringArrayList();
        this.B = (parcel.readInt() != 0);
    }
    
    public b(final a a) {
        final int size = a.c.size();
        this.o = new int[size * 5];
        if (a.i) {
            this.p = new ArrayList(size);
            this.q = new int[size];
            this.r = new int[size];
            int index = 0;
            int n = 0;
            while (true) {
                final int n2 = n;
                if (index >= size) {
                    break;
                }
                final v.a a2 = a.c.get(index);
                this.o[n2] = a2.a;
                final ArrayList p = this.p;
                final Fragment b = a2.b;
                String t;
                if (b != null) {
                    t = b.t;
                }
                else {
                    t = null;
                }
                p.add(t);
                final int[] o = this.o;
                o[n2 + 1] = a2.c;
                o[n2 + 2] = a2.d;
                o[n2 + 3] = a2.e;
                n = n2 + 5;
                o[n2 + 4] = a2.f;
                this.q[index] = a2.g.ordinal();
                this.r[index] = a2.h.ordinal();
                ++index;
            }
            this.s = a.h;
            this.t = a.k;
            this.u = a.v;
            this.v = a.l;
            this.w = a.m;
            this.x = a.n;
            this.y = a.o;
            this.z = a.p;
            this.A = a.q;
            this.B = a.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public a a(final n n) {
        final a obj = new a(n);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            final int n4 = n2;
            if (n4 >= this.o.length) {
                break;
            }
            final v.a a = new v.a();
            final int[] o = this.o;
            final int n5 = n4 + 1;
            a.a = o[n4];
            if (n.D0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(obj);
                sb.append(" op #");
                sb.append(n3);
                sb.append(" base fragment #");
                sb.append(this.o[n5]);
                Log.v("FragmentManager", sb.toString());
            }
            final String s = this.p.get(n3);
            Fragment f0;
            if (s != null) {
                f0 = n.f0(s);
            }
            else {
                f0 = null;
            }
            a.b = f0;
            a.g = d.c.values()[this.q[n3]];
            a.h = d.c.values()[this.r[n3]];
            final int[] o2 = this.o;
            final int n6 = o2[n5];
            a.c = n6;
            final int n7 = o2[n4 + 2];
            a.d = n7;
            final int n8 = o2[n4 + 3];
            a.e = n8;
            n2 = n4 + 5;
            final int n9 = o2[n4 + 4];
            a.f = n9;
            obj.d = n6;
            obj.e = n7;
            obj.f = n8;
            obj.g = n9;
            obj.e(a);
            ++n3;
        }
        obj.h = this.s;
        obj.k = this.t;
        obj.v = this.u;
        obj.i = true;
        obj.l = this.v;
        obj.m = this.w;
        obj.n = this.x;
        obj.o = this.y;
        obj.p = this.z;
        obj.q = this.A;
        obj.r = this.B;
        obj.m(1);
        return obj;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
