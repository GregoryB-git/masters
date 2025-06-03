package xa;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.functions.FlutterFirebaseFunctionsPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f17231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17232c;

    public /* synthetic */ a(Object obj, MethodChannel.Result result, int i10) {
        this.f17230a = i10;
        this.f17232c = obj;
        this.f17231b = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Boolean bool;
        switch (this.f17230a) {
            case 0:
                b bVar = (b) this.f17232c;
                MethodChannel.Result result = this.f17231b;
                bVar.getClass();
                if (task.isSuccessful()) {
                    Log.i("InAppReviewPlugin", "onComplete: Successfully requested review flow");
                    bVar.f17236d = (j7.b) task.getResult();
                    bool = Boolean.TRUE;
                } else {
                    Log.w("InAppReviewPlugin", "onComplete: Unsuccessfully requested review flow");
                    bool = Boolean.FALSE;
                }
                result.success(bool);
                break;
            default:
                ((FlutterFirebaseFunctionsPlugin) this.f17232c).lambda$onMethodCall$1(this.f17231b, task);
                break;
        }
    }
}
