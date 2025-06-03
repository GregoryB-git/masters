/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.SparseIntArray
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package v1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import t.a;
import v1.b;

public class c
extends b {
    public final SparseIntArray d = new SparseIntArray();
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i = -1;
    public int j;
    public int k = -1;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public c(Parcel parcel, int n8, int n9, String string2, a a8, a a9, a a10) {
        super(a8, a9, a10);
        this.e = parcel;
        this.f = n8;
        this.g = n9;
        this.j = n8;
        this.h = string2;
    }

    @Override
    public void A(byte[] arrby) {
        if (arrby != null) {
            this.e.writeInt(arrby.length);
            this.e.writeByteArray(arrby);
            return;
        }
        this.e.writeInt(-1);
    }

    @Override
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)this.e, (int)0);
    }

    @Override
    public void E(int n8) {
        this.e.writeInt(n8);
    }

    @Override
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override
    public void I(String string2) {
        this.e.writeString(string2);
    }

    @Override
    public void a() {
        int n8 = this.i;
        if (n8 >= 0) {
            n8 = this.d.get(n8);
            int n9 = this.e.dataPosition();
            this.e.setDataPosition(n8);
            this.e.writeInt(n9 - n8);
            this.e.setDataPosition(n9);
        }
    }

    @Override
    public b b() {
        int n8;
        Parcel parcel = this.e;
        int n9 = parcel.dataPosition();
        int n10 = n8 = this.j;
        if (n8 == this.f) {
            n10 = this.g;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h);
        stringBuilder.append("  ");
        return new c(parcel, n9, n10, stringBuilder.toString(), this.a, this.b, this.c);
    }

    @Override
    public boolean g() {
        if (this.e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public byte[] i() {
        int n8 = this.e.readInt();
        if (n8 < 0) {
            return null;
        }
        byte[] arrby = new byte[n8];
        this.e.readByteArray(arrby);
        return arrby;
    }

    @Override
    public CharSequence k() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override
    public boolean m(int n8) {
        boolean bl;
        do {
            int n9 = this.j;
            int n10 = this.g;
            bl = false;
            if (n9 >= n10) break;
            n9 = this.k;
            if (n9 == n8) {
                return true;
            }
            if (String.valueOf((int)n9).compareTo(String.valueOf((int)n8)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            n9 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += n9;
        } while (true);
        if (this.k == n8) {
            bl = true;
        }
        return bl;
    }

    @Override
    public int o() {
        return this.e.readInt();
    }

    @Override
    public Parcelable q() {
        return this.e.readParcelable(this.getClass().getClassLoader());
    }

    @Override
    public String s() {
        return this.e.readString();
    }

    @Override
    public void w(int n8) {
        this.a();
        this.i = n8;
        this.d.put(n8, this.e.dataPosition());
        this.E(0);
        this.E(n8);
    }

    @Override
    public void y(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }
}

