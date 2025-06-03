package Y1;

import O1.C0443f;
import Y1.u;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C2146B;

/* loaded from: classes.dex */
public final class s extends D {

    /* renamed from: s, reason: collision with root package name */
    public final String f7455s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f7454t = new b(null);

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new s(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i7) {
            return new s[i7];
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7455s = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Y1.A
    public String f() {
        return this.f7455s;
    }

    @Override // Y1.A
    public boolean n() {
        return true;
    }

    @Override // Y1.A
    public int o(u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        boolean z7 = C2146B.f20879r && C0443f.a() != null && request.j().e();
        String a7 = u.f7470A.a();
        O1.E e7 = O1.E.f3721a;
        androidx.fragment.app.e i7 = d().i();
        String a8 = request.a();
        Set n7 = request.n();
        boolean t7 = request.t();
        boolean p7 = request.p();
        EnumC0712e g7 = request.g();
        if (g7 == null) {
            g7 = EnumC0712e.NONE;
        }
        EnumC0712e enumC0712e = g7;
        String c7 = c(request.b());
        String c8 = request.c();
        String l7 = request.l();
        boolean o7 = request.o();
        boolean q7 = request.q();
        boolean v7 = request.v();
        String m7 = request.m();
        String d7 = request.d();
        EnumC0708a e8 = request.e();
        List n8 = O1.E.n(i7, a8, n7, a7, t7, p7, enumC0712e, c7, c8, z7, l7, o7, q7, v7, m7, d7, e8 == null ? null : e8.name());
        a("e2e", a7);
        Iterator it = n8.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8++;
            if (B((Intent) it.next(), u.f7470A.b())) {
                return i8;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7455s = "katana_proxy_auth";
    }
}
