package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new x1();

    /* renamed from: a, reason: collision with root package name */
    public final b7.a f1986a;

    public static class a extends Exception {
        public a(int i10) {
            super(a0.j.h("Algorithm with COSE value ", i10, " not supported"));
        }
    }

    public o(b7.a aVar) {
        this.f1986a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i10) {
        b0 b0Var;
        if (i10 == -262) {
            b0Var = b0.RS1;
        } else {
            b0[] values = b0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.f1989a == i10) {
                            b0Var = pVar;
                        }
                    }
                    throw new a(i10);
                }
                b0 b0Var2 = values[i11];
                if (b0Var2.f1927a == i10) {
                    b0Var = b0Var2;
                    break;
                }
                i11++;
            }
        }
        return new o(b0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.f1986a.f() == ((o) obj).f1986a.f();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1986a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1986a.f());
    }
}
