// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Path$Direction;
import android.graphics.RectF;
import android.graphics.Rect;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;
import androidx.annotation.Keep;

@Keep
public class FlutterMutatorsStack
{
    private List<Path> finalClippingPaths;
    private Matrix finalMatrix;
    @NonNull
    private List<a> mutators;
    
    public FlutterMutatorsStack() {
        this.mutators = new ArrayList<a>();
        this.finalMatrix = new Matrix();
        this.finalClippingPaths = new ArrayList<Path>();
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
    
    public void pushClipRRect(final int n, final int n2, final int n3, final int n4, final float[] array) {
        final Rect rect = new Rect(n, n2, n3, n4);
        this.mutators.add(new a(rect, array));
        final Path path = new Path();
        path.addRoundRect(new RectF(rect), array, Path$Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }
    
    public void pushClipRect(final int n, final int n2, final int n3, final int n4) {
        final Rect rect = new Rect(n, n2, n3, n4);
        this.mutators.add(new a(rect));
        final Path path = new Path();
        path.addRect(new RectF(rect), Path$Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }
    
    public void pushTransform(final float[] values) {
        final Matrix matrix = new Matrix();
        matrix.setValues(values);
        final a a = new a(matrix);
        this.mutators.add(a);
        this.finalMatrix.preConcat(a.a());
    }
    
    public class a
    {
        public Matrix a;
        public Rect b;
        public float[] c;
        public b d;
        
        public a(final Matrix a) {
            this.d = FlutterMutatorsStack.b.r;
            this.a = a;
        }
        
        public a(final Rect b) {
            this.d = FlutterMutatorsStack.b.o;
            this.b = b;
        }
        
        public a(final Rect b, final float[] c) {
            this.d = FlutterMutatorsStack.b.p;
            this.b = b;
            this.c = c;
        }
        
        public Matrix a() {
            return this.a;
        }
    }
    
    public enum b
    {
        o("CLIP_RECT", 0), 
        p("CLIP_RRECT", 1), 
        q("CLIP_PATH", 2), 
        r("TRANSFORM", 3), 
        s("OPACITY", 4);
        
        static {
            t = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o, b.p, b.q, b.r, b.s };
        }
    }
}
