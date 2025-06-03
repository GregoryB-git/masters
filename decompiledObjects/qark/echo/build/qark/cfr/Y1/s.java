/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Set
 */
package Y1;

import O1.E;
import O1.f;
import Y1.D;
import Y1.a;
import Y1.e;
import Y1.t;
import Y1.u;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import x1.B;

public final class s
extends D {
    @NotNull
    public static final Parcelable.Creator<s> CREATOR;
    public static final b t;
    public final String s;

    static {
        t = new b(null);
        CREATOR = new Parcelable.Creator(){

            public s a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new s(parcel);
            }

            public s[] b(int n8) {
                return new s[n8];
            }
        };
    }

    public s(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        super(u8);
        this.s = "katana_proxy_auth";
    }

    public s(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "source");
        super(parcel);
        this.s = "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public String f() {
        return this.s;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public int o(u.e object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "request");
        Object object3 = object.j();
        boolean bl = B.r && f.a() != null && object3.e();
        String string2 = u.A.a();
        object3 = E.a;
        androidx.fragment.app.e e8 = this.d().i();
        String string3 = object.a();
        Set set = object.n();
        boolean bl2 = object.t();
        boolean bl3 = object.p();
        object3 = object2 = object.g();
        if (object2 == null) {
            object3 = e.p;
        }
        object2 = this.c(object.b());
        String string4 = object.c();
        String string5 = object.l();
        boolean bl4 = object.o();
        boolean bl5 = object.q();
        boolean bl6 = object.v();
        String string6 = object.m();
        String string7 = object.d();
        object = (object = object.e()) == null ? null : object.name();
        object = E.n((Context)e8, string3, (Collection)set, string2, bl2, bl3, (e)((Object)object3), (String)object2, string4, bl, string5, bl4, bl5, bl6, string6, string7, (String)object);
        this.a("e2e", string2);
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            int n9;
            n8 = n9 = n8 + 1;
            if (!this.B((Intent)object.next(), u.A.b())) continue;
            return n9;
        }
        return 0;
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

}

