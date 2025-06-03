// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import android.content.Intent;
import java.util.Collection;
import android.content.Context;
import O1.E;
import O1.f;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;

public final class s extends D
{
    @NotNull
    public static final Parcelable$Creator<s> CREATOR;
    public static final b t;
    public final String s;
    
    static {
        t = new b(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public s a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new s(parcel);
            }
            
            public s[] b(final int n) {
                return new s[n];
            }
        };
    }
    
    public s(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
        this.s = "katana_proxy_auth";
    }
    
    public s(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
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
    public int o(final u.e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        final t j = e.j();
        final boolean b = B.r && f.a() != null && j.e();
        final String a = u.A.a();
        final E a2 = E.a;
        final androidx.fragment.app.e i = this.d().i();
        final String a3 = e.a();
        final Set n = e.n();
        final boolean t = e.t();
        final boolean p = e.p();
        e e2;
        if ((e2 = e.g()) == null) {
            e2 = e.p;
        }
        final String c = this.c(e.b());
        final String c2 = e.c();
        final String l = e.l();
        final boolean o = e.o();
        final boolean q = e.q();
        final boolean v = e.v();
        final String m = e.m();
        final String d = e.d();
        final Y1.a e3 = e.e();
        String name;
        if (e3 == null) {
            name = null;
        }
        else {
            name = e3.name();
        }
        final List n2 = E.n((Context)i, a3, n, a, t, p, e2, c, c2, b, l, o, q, v, m, d, name);
        this.a("e2e", a);
        final Iterator<Intent> iterator = n2.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            ++n3;
            if (this.B(iterator.next(), u.A.b())) {
                return n3;
            }
        }
        return 0;
    }
    
    public static final class b
    {
    }
}
