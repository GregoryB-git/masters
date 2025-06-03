package i6;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import l6.i1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7590a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7593d;

    public /* synthetic */ n(Context context, a aVar, CountDownLatch countDownLatch) {
        this.f7591b = context;
        this.f7592c = aVar;
        this.f7593d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Task b10;
        switch (this.f7590a) {
            case 0:
                a aVar = (a) this.f7592c;
                if (TextUtils.isEmpty(aVar.D())) {
                    b10 = Tasks.forResult(null);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", aVar.D());
                    Integer valueOf = aVar.f7564a.hasExtra("google.product_id") ? Integer.valueOf(aVar.f7564a.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.f7591b;
                    bundle.putBoolean("supports_message_handled", true);
                    z a10 = z.a(context);
                    synchronized (a10) {
                        i10 = a10.f7625d;
                        a10.f7625d = i10 + 1;
                    }
                    b10 = a10.b(new w(i10, 2, bundle));
                }
                final CountDownLatch countDownLatch = (CountDownLatch) this.f7593d;
                b10.addOnCompleteListener(new Executor() { // from class: i6.l
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new OnCompleteListener() { // from class: i6.m
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        countDownLatch.countDown();
                    }
                });
                return;
            default:
                i1 i1Var = (i1) this.f7593d;
                if (i1Var.f9693b > 0) {
                    l6.f fVar = (l6.f) this.f7591b;
                    Bundle bundle2 = i1Var.f9694c;
                    fVar.onCreate(bundle2 != null ? bundle2.getBundle((String) this.f7592c) : null);
                }
                if (((i1) this.f7593d).f9693b >= 2) {
                    ((l6.f) this.f7591b).onStart();
                }
                if (((i1) this.f7593d).f9693b >= 3) {
                    ((l6.f) this.f7591b).onResume();
                }
                if (((i1) this.f7593d).f9693b >= 4) {
                    ((l6.f) this.f7591b).onStop();
                }
                if (((i1) this.f7593d).f9693b >= 5) {
                    ((l6.f) this.f7591b).onDestroy();
                    return;
                }
                return;
        }
    }

    public n(i1 i1Var, l6.f fVar, String str) {
        this.f7591b = fVar;
        this.f7592c = str;
        this.f7593d = i1Var;
    }
}
