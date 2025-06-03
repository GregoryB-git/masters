package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {

    @NonNull
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public Matrix f14927a;

        /* renamed from: b, reason: collision with root package name */
        public Rect f14928b;

        /* renamed from: c, reason: collision with root package name */
        public float[] f14929c;

        /* renamed from: d, reason: collision with root package name */
        public b f14930d;

        public a(Matrix matrix) {
            this.f14930d = b.TRANSFORM;
            this.f14927a = matrix;
        }

        public Matrix a() {
            return this.f14927a;
        }

        public a(Rect rect) {
            this.f14930d = b.CLIP_RECT;
            this.f14928b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f14930d = b.CLIP_RRECT;
            this.f14928b = rect;
            this.f14929c = fArr;
        }
    }

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i7, int i8, int i9, int i10, float[] fArr) {
        Rect rect = new Rect(i7, i8, i9, i10);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i7, int i8, int i9, int i10) {
        Rect rect = new Rect(i7, i8, i9, i10);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
