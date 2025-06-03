package k0;

import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import d6.i;
import dc.l;
import ec.j;

/* loaded from: classes.dex */
public final class f extends j implements l<i, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f8828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HiddenActivity hiddenActivity, int i10) {
        super(1);
        this.f8828a = hiddenActivity;
        this.f8829b = i10;
    }

    @Override // dc.l
    public final rb.h invoke(i iVar) {
        i iVar2 = iVar;
        try {
            HiddenActivity hiddenActivity = this.f8828a;
            hiddenActivity.f972b = true;
            hiddenActivity.startIntentSenderForResult(iVar2.f3568a.getIntentSender(), this.f8829b, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            HiddenActivity hiddenActivity2 = this.f8828a;
            ResultReceiver resultReceiver = hiddenActivity2.f971a;
            ec.i.b(resultReceiver);
            hiddenActivity2.a(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
        }
        return rb.h.f13851a;
    }
}
