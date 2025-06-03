package w1;

import E5.k;
import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import w1.C2074a;
import w1.q;
import w1.y;

/* loaded from: classes.dex */
public final class l implements k.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20308a;

    /* renamed from: b, reason: collision with root package name */
    public final C2074a f20309b;

    /* renamed from: c, reason: collision with root package name */
    public final q f20310c;

    /* renamed from: d, reason: collision with root package name */
    public final y f20311d;

    /* renamed from: e, reason: collision with root package name */
    public Activity f20312e;

    public l(Context context, C2074a c2074a, q qVar, y yVar) {
        this.f20308a = context;
        this.f20309b = c2074a;
        this.f20310c = qVar;
        this.f20311d = yVar;
    }

    public void i(Activity activity) {
        this.f20312e = activity;
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, final k.d dVar) {
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "checkServiceStatus":
                int parseInt = Integer.parseInt(jVar.f1671b.toString());
                y yVar = this.f20311d;
                Context context = this.f20308a;
                Objects.requireNonNull(dVar);
                yVar.a(parseInt, context, new y.a() { // from class: w1.c
                    @Override // w1.y.a
                    public final void a(int i7) {
                        k.d.this.a(Integer.valueOf(i7));
                    }
                }, new b() { // from class: w1.d
                    @Override // w1.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                break;
            case "shouldShowRequestPermissionRationale":
                int parseInt2 = Integer.parseInt(jVar.f1671b.toString());
                q qVar = this.f20310c;
                Activity activity = this.f20312e;
                Objects.requireNonNull(dVar);
                qVar.i(parseInt2, activity, new q.c() { // from class: w1.h
                    @Override // w1.q.c
                    public final void a(boolean z7) {
                        k.d.this.a(Boolean.valueOf(z7));
                    }
                }, new b() { // from class: w1.i
                    @Override // w1.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                break;
            case "checkPermissionStatus":
                int parseInt3 = Integer.parseInt(jVar.f1671b.toString());
                q qVar2 = this.f20310c;
                Context context2 = this.f20308a;
                Objects.requireNonNull(dVar);
                qVar2.e(parseInt3, context2, new q.a() { // from class: w1.e
                    @Override // w1.q.a
                    public final void a(int i7) {
                        k.d.this.a(Integer.valueOf(i7));
                    }
                });
                break;
            case "openAppSettings":
                C2074a c2074a = this.f20309b;
                Context context3 = this.f20308a;
                Objects.requireNonNull(dVar);
                c2074a.a(context3, new C2074a.InterfaceC0287a() { // from class: w1.j
                    @Override // w1.C2074a.InterfaceC0287a
                    public final void a(boolean z7) {
                        k.d.this.a(Boolean.valueOf(z7));
                    }
                }, new b() { // from class: w1.k
                    @Override // w1.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                break;
            case "requestPermissions":
                List list = (List) jVar.b();
                q qVar3 = this.f20310c;
                Activity activity2 = this.f20312e;
                Objects.requireNonNull(dVar);
                qVar3.h(list, activity2, new q.b() { // from class: w1.f
                    @Override // w1.q.b
                    public final void a(Map map) {
                        k.d.this.a(map);
                    }
                }, new b() { // from class: w1.g
                    @Override // w1.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                break;
            default:
                dVar.c();
                break;
        }
    }
}
