package r3;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import r3.t;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements t.a, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13582d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
        this.f13579a = i10;
        this.f13580b = obj;
        this.f13581c = obj2;
        this.f13582d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175 A[SYNTHETIC] */
    @Override // r3.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.r.apply(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        String str;
        switch (this.f13579a) {
            case 2:
                Task task = (Task) this.f13580b;
                o9.b bVar = (o9.b) this.f13581c;
                Task task2 = (Task) this.f13582d;
                ec.i.e(task, "$authToken");
                ec.i.e(bVar, "this$0");
                ec.i.e(task2, "$appCheckToken");
                return Tasks.forResult(new o9.n((String) task.getResult(), bVar.f12082b.get().a(), (String) task2.getResult()));
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f13580b;
                String str2 = (String) this.f13581c;
                a.C0055a c0055a = (a.C0055a) this.f13582d;
                String str3 = (String) obj;
                com.google.firebase.messaging.a e10 = FirebaseMessaging.e(firebaseMessaging.f3234c);
                String f = firebaseMessaging.f();
                aa.r rVar = firebaseMessaging.f3240j;
                synchronized (rVar) {
                    if (rVar.f358b == null) {
                        rVar.d();
                    }
                    str = rVar.f358b;
                }
                synchronized (e10) {
                    String a10 = a.C0055a.a(System.currentTimeMillis(), str3, str);
                    if (a10 != null) {
                        SharedPreferences.Editor edit = e10.f3247a.edit();
                        edit.putString(com.google.firebase.messaging.a.a(f, str2), a10);
                        edit.commit();
                    }
                }
                if (c0055a == null || !str3.equals(c0055a.f3249a)) {
                    firebaseMessaging.i(str3);
                }
                return Tasks.forResult(str3);
        }
    }
}
