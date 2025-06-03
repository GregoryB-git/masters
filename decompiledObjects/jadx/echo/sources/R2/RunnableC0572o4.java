package R2;

import android.net.Uri;

/* renamed from: R2.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0572o4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5446o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Uri f5447p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5448q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f5449r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0544k4 f5450s;

    public RunnableC0572o4(C0544k4 c0544k4, boolean z7, Uri uri, String str, String str2) {
        this.f5450s = c0544k4;
        this.f5446o = z7;
        this.f5447p = uri;
        this.f5448q = str;
        this.f5449r = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0544k4.a(this.f5450s, this.f5446o, this.f5447p, this.f5448q, this.f5449r);
    }
}
