package y1;

import android.animation.ValueAnimator;
import y1.d;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f17317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17318b;

    public b(d dVar, d.a aVar) {
        this.f17318b = dVar;
        this.f17317a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f17318b;
        d.a aVar = this.f17317a;
        dVar.getClass();
        d.c(floatValue, aVar);
        this.f17318b.a(floatValue, this.f17317a, false);
        this.f17318b.invalidateSelf();
    }
}
