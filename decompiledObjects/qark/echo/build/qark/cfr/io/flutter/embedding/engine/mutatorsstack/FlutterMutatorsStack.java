/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
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
public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    @NonNull
    private List<a> mutators = new ArrayList();

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int n8, int n9, int n10, int n11, float[] arrf) {
        Rect rect = new Rect(n8, n9, n10, n11);
        a a8 = new a(this, rect, arrf);
        this.mutators.add((Object)a8);
        a8 = new Path();
        a8.addRoundRect(new RectF(rect), arrf, Path.Direction.CCW);
        a8.transform(this.finalMatrix);
        this.finalClippingPaths.add((Object)a8);
    }

    public void pushClipRect(int n8, int n9, int n10, int n11) {
        Rect rect = new Rect(n8, n9, n10, n11);
        a a8 = new a(this, rect);
        this.mutators.add((Object)a8);
        a8 = new Path();
        a8.addRect(new RectF(rect), Path.Direction.CCW);
        a8.transform(this.finalMatrix);
        this.finalClippingPaths.add((Object)a8);
    }

    public void pushTransform(float[] object) {
        Matrix matrix = new Matrix();
        matrix.setValues((float[])object);
        object = new a(this, matrix);
        this.mutators.add(object);
        this.finalMatrix.preConcat(object.a());
    }

    public class a {
        public Matrix a;
        public Rect b;
        public float[] c;
        public b d;
        public final /* synthetic */ FlutterMutatorsStack e;

        public a(FlutterMutatorsStack flutterMutatorsStack, Matrix matrix) {
            this.e = flutterMutatorsStack;
            this.d = b.r;
            this.a = matrix;
        }

        public a(FlutterMutatorsStack flutterMutatorsStack, Rect rect) {
            this.e = flutterMutatorsStack;
            this.d = b.o;
            this.b = rect;
        }

        public a(FlutterMutatorsStack flutterMutatorsStack, Rect rect, float[] arrf) {
            this.e = flutterMutatorsStack;
            this.d = b.p;
            this.b = rect;
            this.c = arrf;
        }

        public Matrix a() {
            return this.a;
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* enum */ b p = new b();
        public static final /* enum */ b q = new b();
        public static final /* enum */ b r = new b();
        public static final /* enum */ b s = new b();
        public static final /* synthetic */ b[] t;

        static {
            t = b.c();
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o, p, q, r, s};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])t.clone();
        }
    }

}

