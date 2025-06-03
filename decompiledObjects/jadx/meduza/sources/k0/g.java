package k0;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import dc.l;
import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class g extends j implements l<PendingIntent, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f8830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HiddenActivity hiddenActivity, int i10) {
        super(1);
        this.f8830a = hiddenActivity;
        this.f8831b = i10;
    }

    @Override // dc.l
    public final rb.h invoke(PendingIntent pendingIntent) {
        PendingIntent pendingIntent2 = pendingIntent;
        i.e(pendingIntent2, "result");
        try {
            HiddenActivity hiddenActivity = this.f8830a;
            hiddenActivity.f972b = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f8831b, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            HiddenActivity hiddenActivity2 = this.f8830a;
            ResultReceiver resultReceiver = hiddenActivity2.f971a;
            i.b(resultReceiver);
            hiddenActivity2.a(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
        }
        return rb.h.f13851a;
    }
}
