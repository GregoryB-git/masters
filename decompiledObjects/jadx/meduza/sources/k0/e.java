package k0;

import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import dc.l;
import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class e extends j implements l<d6.c, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f8826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HiddenActivity hiddenActivity, int i10) {
        super(1);
        this.f8826a = hiddenActivity;
        this.f8827b = i10;
    }

    @Override // dc.l
    public final rb.h invoke(d6.c cVar) {
        d6.c cVar2 = cVar;
        try {
            HiddenActivity hiddenActivity = this.f8826a;
            hiddenActivity.f972b = true;
            hiddenActivity.startIntentSenderForResult(cVar2.f3557a.getIntentSender(), this.f8827b, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            HiddenActivity hiddenActivity2 = this.f8826a;
            ResultReceiver resultReceiver = hiddenActivity2.f971a;
            i.b(resultReceiver);
            hiddenActivity2.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e10.getMessage());
        }
        return rb.h.f13851a;
    }
}
