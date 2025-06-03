// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v1;

import android.os.Parcelable;
import android.text.TextUtils;
import t.a;
import android.os.Parcel;
import android.util.SparseIntArray;

public class c extends b
{
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;
    
    public c(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }
    
    public c(final Parcel e, final int n, final int g, final String h, final a a, final a a2, final a a3) {
        super(a, a2, a3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = e;
        this.f = n;
        this.g = g;
        this.j = n;
        this.h = h;
    }
    
    @Override
    public void A(final byte[] array) {
        if (array != null) {
            this.e.writeInt(array.length);
            this.e.writeByteArray(array);
            return;
        }
        this.e.writeInt(-1);
    }
    
    @Override
    public void C(final CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }
    
    @Override
    public void E(final int n) {
        this.e.writeInt(n);
    }
    
    @Override
    public void G(final Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }
    
    @Override
    public void I(final String s) {
        this.e.writeString(s);
    }
    
    @Override
    public void a() {
        final int i = this.i;
        if (i >= 0) {
            final int value = this.d.get(i);
            final int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(value);
            this.e.writeInt(dataPosition - value);
            this.e.setDataPosition(dataPosition);
        }
    }
    
    @Override
    public b b() {
        final Parcel e = this.e;
        final int dataPosition = e.dataPosition();
        int n;
        if ((n = this.j) == this.f) {
            n = this.g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append("  ");
        return new c(e, dataPosition, n, sb.toString(), super.a, super.b, super.c);
    }
    
    @Override
    public boolean g() {
        return this.e.readInt() != 0;
    }
    
    @Override
    public byte[] i() {
        final int int1 = this.e.readInt();
        if (int1 < 0) {
            return null;
        }
        final byte[] array = new byte[int1];
        this.e.readByteArray(array);
        return array;
    }
    
    @Override
    public CharSequence k() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }
    
    @Override
    public boolean m(final int i) {
        while (true) {
            final int j = this.j;
            final int g = this.g;
            boolean b = false;
            if (j >= g) {
                if (this.k == i) {
                    b = true;
                }
                return b;
            }
            final int k = this.k;
            if (k == i) {
                return true;
            }
            if (String.valueOf(k).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            final int int1 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += int1;
        }
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
    public void w(final int i) {
        this.a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        this.E(0);
        this.E(i);
    }
    
    @Override
    public void y(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
