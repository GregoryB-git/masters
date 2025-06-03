package b;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1585a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1586b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1587c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1588d;

    public b(BackEvent backEvent) {
        ec.i.e(backEvent, "backEvent");
        a aVar = a.f1558a;
        float d10 = aVar.d(backEvent);
        float e10 = aVar.e(backEvent);
        float b10 = aVar.b(backEvent);
        int c10 = aVar.c(backEvent);
        this.f1585a = d10;
        this.f1586b = e10;
        this.f1587c = b10;
        this.f1588d = c10;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BackEventCompat{touchX=");
        l10.append(this.f1585a);
        l10.append(", touchY=");
        l10.append(this.f1586b);
        l10.append(", progress=");
        l10.append(this.f1587c);
        l10.append(", swipeEdge=");
        l10.append(this.f1588d);
        l10.append('}');
        return l10.toString();
    }
}
