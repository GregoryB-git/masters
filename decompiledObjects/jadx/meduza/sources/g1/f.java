package g1;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import g1.c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaSessionCompat.Token f5749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.e f5750b;

    public f(c.e eVar, MediaSessionCompat.Token token) {
        this.f5750b = eVar;
        this.f5749a = token;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.e eVar = this.f5750b;
        MediaSessionCompat.Token token = this.f5749a;
        if (!eVar.f5732a.isEmpty()) {
            IMediaSession a10 = token.a();
            if (a10 != null) {
                Iterator it = eVar.f5732a.iterator();
                while (it.hasNext()) {
                    ((Bundle) it.next()).putBinder("extra_session_binder", a10.asBinder());
                }
            }
            eVar.f5732a.clear();
        }
        eVar.f5733b.setSessionToken((MediaSession.Token) token.f491b);
    }
}
