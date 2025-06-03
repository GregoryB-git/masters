package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import sa.e;

/* loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.a f14276a;

    public c(e.a aVar) {
        this.f14276a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f14276a.g("onBecomingNoisy", new Object[0]);
        }
    }
}
