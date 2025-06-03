package k0;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import dc.l;
import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class h extends j implements l<PendingIntent, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f8832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HiddenActivity hiddenActivity, int i10) {
        super(1);
        this.f8832a = hiddenActivity;
        this.f8833b = i10;
    }

    @Override // dc.l
    public final rb.h invoke(PendingIntent pendingIntent) {
        PendingIntent pendingIntent2 = pendingIntent;
        try {
            HiddenActivity hiddenActivity = this.f8832a;
            hiddenActivity.f972b = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f8833b, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            HiddenActivity hiddenActivity2 = this.f8832a;
            ResultReceiver resultReceiver = hiddenActivity2.f971a;
            i.b(resultReceiver);
            hiddenActivity2.a(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
        }
        return rb.h.f13851a;
    }
}
