package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements n9.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3713b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f3712a = i10;
        this.f3713b = obj;
    }

    @Override // n9.i
    public final Object apply(Object obj) {
        switch (this.f3712a) {
            case 0:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f3713b;
                firebaseFirestore.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                ((Executor) obj).execute(new x0.f(16, firebaseFirestore, taskCompletionSource));
                return taskCompletionSource.getTask();
            case 1:
                List list = (List) this.f3713b;
                g9.u uVar = (g9.u) obj;
                uVar.d();
                return uVar.f6090d.a(new w.g(17, uVar, list));
            default:
                g9.u uVar2 = (g9.u) obj;
                g9.f0 f0Var = ((com.google.firebase.firestore.i) this.f3713b).f3189a;
                uVar2.d();
                n9.a aVar = uVar2.f6090d;
                return aVar.f11322a.a(new g9.s(uVar2, f0Var, 1));
        }
    }
}
