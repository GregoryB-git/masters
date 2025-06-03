/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class c {
    public static int a(Parcel parcel) {
        return c.r(parcel, 20293);
    }

    public static void b(Parcel parcel, int n8) {
        c.s(parcel, n8);
    }

    public static void c(Parcel parcel, int n8, boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static void d(Parcel parcel, int n8, Boolean bl, boolean bl2) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static void e(Parcel parcel, int n8, Bundle bundle, boolean bl) {
        if (bundle == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeBundle(bundle);
        c.s(parcel, n8);
    }

    public static void f(Parcel parcel, int n8, Double d8, boolean bl) {
        if (d8 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 8);
        parcel.writeDouble(d8.doubleValue());
    }

    public static void g(Parcel parcel, int n8, Float f8, boolean bl) {
        if (f8 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 4);
        parcel.writeFloat(f8.floatValue());
    }

    public static void h(Parcel parcel, int n8, IBinder iBinder, boolean bl) {
        if (iBinder == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeStrongBinder(iBinder);
        c.s(parcel, n8);
    }

    public static void i(Parcel parcel, int n8, int n9) {
        c.t(parcel, n8, 4);
        parcel.writeInt(n9);
    }

    public static void j(Parcel parcel, int n8, int[] arrn, boolean bl) {
        if (arrn == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeIntArray(arrn);
        c.s(parcel, n8);
    }

    public static void k(Parcel parcel, int n8, long l8) {
        c.t(parcel, n8, 8);
        parcel.writeLong(l8);
    }

    public static void l(Parcel parcel, int n8, Long l8, boolean bl) {
        if (l8 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 8);
        parcel.writeLong(l8.longValue());
    }

    public static void m(Parcel parcel, int n8, Parcelable parcelable, int n9, boolean bl) {
        if (parcelable == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcelable.writeToParcel(parcel, n9);
        c.s(parcel, n8);
    }

    public static void n(Parcel parcel, int n8, String string2, boolean bl) {
        if (string2 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeString(string2);
        c.s(parcel, n8);
    }

    public static void o(Parcel parcel, int n8, List list, boolean bl) {
        if (list == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeStringList(list);
        c.s(parcel, n8);
    }

    public static void p(Parcel parcel, int n8, Parcelable[] arrparcelable, int n9, boolean bl) {
        if (arrparcelable == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        int n10 = c.r(parcel, n8);
        int n11 = arrparcelable.length;
        parcel.writeInt(n11);
        for (n8 = 0; n8 < n11; ++n8) {
            Parcelable parcelable = arrparcelable[n8];
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            c.u(parcel, parcelable, n9);
        }
        c.s(parcel, n10);
    }

    public static void q(Parcel parcel, int n8, List list, boolean bl) {
        if (list == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        int n9 = c.r(parcel, n8);
        int n10 = list.size();
        parcel.writeInt(n10);
        for (n8 = 0; n8 < n10; ++n8) {
            Parcelable parcelable = (Parcelable)list.get(n8);
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            c.u(parcel, parcelable, 0);
        }
        c.s(parcel, n9);
    }

    public static int r(Parcel parcel, int n8) {
        parcel.writeInt(n8 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void s(Parcel parcel, int n8) {
        int n9 = parcel.dataPosition();
        parcel.setDataPosition(n8 - 4);
        parcel.writeInt(n9 - n8);
        parcel.setDataPosition(n9);
    }

    public static void t(Parcel parcel, int n8, int n9) {
        parcel.writeInt(n8 | n9 << 16);
    }

    public static void u(Parcel parcel, Parcelable parcelable, int n8) {
        int n9 = parcel.dataPosition();
        parcel.writeInt(1);
        int n10 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, n8);
        n8 = parcel.dataPosition();
        parcel.setDataPosition(n9);
        parcel.writeInt(n8 - n10);
        parcel.setDataPosition(n8);
    }
}

