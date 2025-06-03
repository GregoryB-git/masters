package Y1;

import Y1.u;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C2146B;
import x1.EnumC2155h;

/* loaded from: classes.dex */
public final class r extends D {

    /* renamed from: s, reason: collision with root package name */
    public final String f7452s;

    /* renamed from: t, reason: collision with root package name */
    public final EnumC2155h f7453t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f7451u = new b(null);

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new r(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i7) {
            return new r[i7];
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
    public r(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7452s = "instagram_login";
        this.f7453t = EnumC2155h.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Y1.A
    public String f() {
        return this.f7452s;
    }

    @Override // Y1.A
    public int o(u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        u.c cVar = u.f7470A;
        String a7 = cVar.a();
        O1.E e7 = O1.E.f3721a;
        Context i7 = d().i();
        if (i7 == null) {
            i7 = C2146B.l();
        }
        String a8 = request.a();
        Set n7 = request.n();
        boolean t7 = request.t();
        boolean p7 = request.p();
        EnumC0712e g7 = request.g();
        if (g7 == null) {
            g7 = EnumC0712e.NONE;
        }
        Intent j7 = O1.E.j(i7, a8, n7, a7, t7, p7, g7, c(request.b()), request.c(), request.l(), request.o(), request.q(), request.v());
        a("e2e", a7);
        return B(j7, cVar.b()) ? 1 : 0;
    }

    @Override // Y1.D
    public EnumC2155h u() {
        return this.f7453t;
    }

    @Override // Y1.A, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7452s = "instagram_login";
        this.f7453t = EnumC2155h.INSTAGRAM_APPLICATION_WEB;
    }
}
