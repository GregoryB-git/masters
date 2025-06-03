package x5;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import x5.d;
import x5.j;

/* loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f17188c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f17190e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f17186a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f17187b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f17189d = 25.0f;
    public volatile float f = 3.1415927f;

    public interface a {
    }

    public k(Context context, j.a aVar) {
        this.f17188c = aVar;
        this.f17190e = new GestureDetector(context, this);
    }

    @Override // x5.d.a
    public final void a(float[] fArr, float f) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f17186a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f10) {
        float x10 = (motionEvent2.getX() - this.f17186a.x) / this.f17189d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f17186a;
        float f11 = (y10 - pointF.y) / this.f17189d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f17187b;
        pointF2.x -= (cos * x10) - (sin * f11);
        float f12 = (cos * f11) + (sin * x10) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        a aVar = this.f17188c;
        PointF pointF3 = this.f17187b;
        j.a aVar2 = (j.a) aVar;
        synchronized (aVar2) {
            float f13 = pointF3.y;
            aVar2.f17181o = f13;
            Matrix.setRotateM(aVar2.f17180e, 0, -f13, (float) Math.cos(aVar2.f17182p), (float) Math.sin(aVar2.f17182p), 0.0f);
            Matrix.setRotateM(aVar2.f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return j.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f17190e.onTouchEvent(motionEvent);
    }
}
