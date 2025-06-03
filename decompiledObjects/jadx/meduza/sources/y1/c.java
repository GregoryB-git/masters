package y1;

import android.animation.Animator;
import y1.d;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f17319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17320b;

    public c(d dVar, d.a aVar) {
        this.f17320b = dVar;
        this.f17319a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.f17320b.a(1.0f, this.f17319a, true);
        d.a aVar = this.f17319a;
        aVar.f17338k = aVar.f17333e;
        aVar.f17339l = aVar.f;
        aVar.f17340m = aVar.f17334g;
        aVar.a((aVar.f17337j + 1) % aVar.f17336i.length);
        d dVar = this.f17320b;
        if (!dVar.f) {
            dVar.f17328e += 1.0f;
            return;
        }
        dVar.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        d.a aVar2 = this.f17319a;
        if (aVar2.f17341n) {
            aVar2.f17341n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17320b.f17328e = 0.0f;
    }
}
