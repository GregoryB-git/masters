// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B2;

import java.util.List;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Parcel;

public abstract class c
{
    public static int a(final Parcel parcel) {
        return r(parcel, 20293);
    }
    
    public static void b(final Parcel parcel, final int n) {
        s(parcel, n);
    }
    
    public static void c(final Parcel parcel, final int n, final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static void d(final Parcel parcel, final int n, final Boolean b, final boolean b2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static void e(final Parcel parcel, int r, final Bundle bundle, final boolean b) {
        if (bundle == null) {
            if (b) {
                t(parcel, r, 0);
            }
            return;
        }
        r = r(parcel, r);
        parcel.writeBundle(bundle);
        s(parcel, r);
    }
    
    public static void f(final Parcel parcel, final int n, final Double n2, final boolean b) {
        if (n2 == null) {
            if (b) {
                t(parcel, n, 0);
            }
            return;
        }
        t(parcel, n, 8);
        parcel.writeDouble((double)n2);
    }
    
    public static void g(final Parcel parcel, final int n, final Float n2, final boolean b) {
        if (n2 == null) {
            if (b) {
                t(parcel, n, 0);
            }
            return;
        }
        t(parcel, n, 4);
        parcel.writeFloat((float)n2);
    }
    
    public static void h(final Parcel parcel, int r, final IBinder binder, final boolean b) {
        if (binder == null) {
            if (b) {
                t(parcel, r, 0);
            }
            return;
        }
        r = r(parcel, r);
        parcel.writeStrongBinder(binder);
        s(parcel, r);
    }
    
    public static void i(final Parcel parcel, final int n, final int n2) {
        t(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void j(final Parcel parcel, int r, final int[] array, final boolean b) {
        if (array == null) {
            if (b) {
                t(parcel, r, 0);
            }
            return;
        }
        r = r(parcel, r);
        parcel.writeIntArray(array);
        s(parcel, r);
    }
    
    public static void k(final Parcel parcel, final int n, final long n2) {
        t(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void l(final Parcel parcel, final int n, final Long n2, final boolean b) {
        if (n2 == null) {
            if (b) {
                t(parcel, n, 0);
            }
            return;
        }
        t(parcel, n, 8);
        parcel.writeLong((long)n2);
    }
    
    public static void m(final Parcel parcel, int r, final Parcelable parcelable, final int n, final boolean b) {
        if (parcelable == null) {
            if (b) {
                t(parcel, r, 0);
            }
            return;
        }
        r = r(parcel, r);
        parcelable.writeToParcel(parcel, n);
        s(parcel, r);
    }
    
    public static void n(final Parcel parcel, int r, final String s, final boolean b) {
        if (s == null) {
            if (b) {
                t(parcel, r, 0);
            }
            return;
        }
        r = r(parcel, r);
        parcel.writeString(s);
        s(parcel, r);
    }
    
    public static void o(final Parcel parcel, int r, final List list, final boolean b) {
        if (list == null) {
            if (b) {
                t(parcel, r, 0);
            }
            return;
        }
        r = r(parcel, r);
        parcel.writeStringList(list);
        s(parcel, r);
    }
    
    public static void p(final Parcel parcel, int i, final Parcelable[] array, final int n, final boolean b) {
        if (array == null) {
            if (b) {
                t(parcel, i, 0);
            }
            return;
        }
        final int r = r(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                u(parcel, parcelable, n);
            }
        }
        s(parcel, r);
    }
    
    public static void q(final Parcel parcel, int i, final List list, final boolean b) {
        if (list == null) {
            if (b) {
                t(parcel, i, 0);
            }
            return;
        }
        final int r = r(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                u(parcel, parcelable, 0);
            }
        }
        s(parcel, r);
    }
    
    public static int r(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    public static void s(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void t(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | n2 << 16);
    }
    
    public static void u(final Parcel parcel, final Parcelable parcelable, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
}
