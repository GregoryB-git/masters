package b0;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import w.g;
import w.h;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0787c extends h.f {

    /* renamed from: f, reason: collision with root package name */
    public MediaSessionCompat.Token f9957f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f9958g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f9959h;

    /* renamed from: i, reason: collision with root package name */
    public int f9960i;

    /* renamed from: j, reason: collision with root package name */
    public PendingIntent f9961j;

    /* renamed from: e, reason: collision with root package name */
    public int[] f9956e = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9962k = false;

    @Override // w.h.f
    public void b(g gVar) {
        AbstractC0785a.d(gVar.a(), Build.VERSION.SDK_INT >= 34 ? AbstractC0785a.b(AbstractC0786b.a(AbstractC0785a.a(), this.f9959h, this.f9960i, this.f9961j, Boolean.valueOf(this.f9962k)), this.f9956e, this.f9957f) : AbstractC0785a.b(AbstractC0785a.a(), this.f9956e, this.f9957f));
    }

    @Override // w.h.f
    public RemoteViews d(g gVar) {
        return null;
    }

    @Override // w.h.f
    public RemoteViews e(g gVar) {
        return null;
    }

    public C0787c h(PendingIntent pendingIntent) {
        this.f9958g = pendingIntent;
        return this;
    }

    public C0787c i(MediaSessionCompat.Token token) {
        this.f9957f = token;
        return this;
    }

    public C0787c j(int... iArr) {
        this.f9956e = iArr;
        return this;
    }

    public C0787c k(boolean z7) {
        return this;
    }
}
