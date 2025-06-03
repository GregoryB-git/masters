package m9;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10875d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.f10872a = i10;
        this.f10873b = obj;
        this.f10874c = obj2;
        this.f10875d = obj3;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f10872a) {
            case 0:
                v vVar = (v) this.f10873b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f10874c;
                Object obj = this.f10875d;
                vVar.getClass();
                eb.e eVar = (eb.e) task.getResult();
                eVar.e(new u(vVar, taskCompletionSource), vVar.a());
                eVar.c(2);
                eVar.d(obj);
                eVar.b();
                break;
            default:
                xa.b bVar = (xa.b) this.f10873b;
                MethodChannel.Result result = (MethodChannel.Result) this.f10874c;
                l3.l lVar = (l3.l) this.f10875d;
                bVar.getClass();
                if (!task.isSuccessful()) {
                    Log.w("InAppReviewPlugin", "onComplete: Unsuccessfully requested review flow");
                    result.error("error", "In-App Review API unavailable", null);
                    break;
                } else {
                    Log.i("InAppReviewPlugin", "onComplete: Successfully requested review flow");
                    bVar.b(result, lVar, (j7.b) task.getResult());
                    break;
                }
        }
    }
}
