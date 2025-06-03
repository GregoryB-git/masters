package b;

import android.content.Intent;
import android.content.IntentSender;
import b.j;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f1600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f1601c;

    public i(j.a aVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f1601c = aVar;
        this.f1599a = i10;
        this.f1600b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1601c.a(this.f1599a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1600b));
    }
}
