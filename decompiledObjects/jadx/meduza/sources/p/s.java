package p;

import a4.g;
import android.os.Bundle;
import android.util.Pair;
import androidx.profileinstaller.c;
import v3.z0;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12741d;

    public /* synthetic */ s(Object obj, int i10, Object obj2, int i11) {
        this.f12738a = i11;
        this.f12740c = obj;
        this.f12739b = i10;
        this.f12741d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12738a) {
            case 0:
                ((v) this.f12740c).onGreatestScrollPercentageIncreased(this.f12739b, (Bundle) this.f12741d);
                break;
            case 1:
                ((c.InterfaceC0016c) this.f12740c).b(this.f12739b, this.f12741d);
                break;
            case 2:
                z0.a aVar = (z0.a) this.f12740c;
                Pair pair = (Pair) this.f12741d;
                aVar.f15836b.f15830h.U(((Integer) pair.first).intValue(), (t.b) pair.second, this.f12739b);
                break;
            default:
                g.a aVar2 = (g.a) this.f12740c;
                a4.g gVar = (a4.g) this.f12741d;
                int i10 = this.f12739b;
                int i11 = aVar2.f180a;
                gVar.B();
                gVar.U(aVar2.f180a, aVar2.f181b, i10);
                break;
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, int i10, int i11) {
        this.f12738a = i11;
        this.f12740c = obj;
        this.f12741d = obj2;
        this.f12739b = i10;
    }
}
