/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package A2;

import A2.l;
import A2.v;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class r
extends a {
    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new v();
    public final int o;
    public List p;

    public r(int n8, List list) {
        this.o = n8;
        this.p = list;
    }

    public final int a() {
        return this.o;
    }

    public final List d() {
        return this.p;
    }

    public final void f(l l8) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add((Object)l8);
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.q(parcel, 2, this.p, false);
        c.b(parcel, n8);
    }
}

