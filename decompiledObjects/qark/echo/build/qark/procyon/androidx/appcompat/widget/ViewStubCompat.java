// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import e.i;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import android.view.View;

public final class ViewStubCompat extends View
{
    public int o;
    public int p;
    public WeakReference q;
    public LayoutInflater r;
    
    public ViewStubCompat(@NonNull final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ViewStubCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.o = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.S2, n, 0);
        this.p = obtainStyledAttributes.getResourceId(i.V2, -1);
        this.o = obtainStyledAttributes.getResourceId(i.U2, 0);
        this.setId(obtainStyledAttributes.getResourceId(i.T2, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    public View a() {
        final ViewParent parent = this.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.o != 0) {
            final ViewGroup viewGroup = (ViewGroup)parent;
            LayoutInflater layoutInflater = this.r;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.getContext());
            }
            final View inflate = layoutInflater.inflate(this.o, viewGroup, false);
            final int p = this.p;
            if (p != -1) {
                inflate.setId(p);
            }
            final int indexOfChild = viewGroup.indexOfChild((View)this);
            viewGroup.removeViewInLayout((View)this);
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            }
            else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.q = new WeakReference(inflate);
            return inflate;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    
    public void dispatchDraw(final Canvas canvas) {
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public int getInflatedId() {
        return this.p;
    }
    
    public LayoutInflater getLayoutInflater() {
        return this.r;
    }
    
    public int getLayoutResource() {
        return this.o;
    }
    
    public void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setInflatedId(final int p) {
        this.p = p;
    }
    
    public void setLayoutInflater(final LayoutInflater r) {
        this.r = r;
    }
    
    public void setLayoutResource(final int o) {
        this.o = o;
    }
    
    public void setOnInflateListener(final a a) {
    }
    
    public void setVisibility(final int n) {
        final WeakReference q = this.q;
        if (q == null) {
            super.setVisibility(n);
            if (n == 0 || n == 4) {
                this.a();
            }
            return;
        }
        final View view = q.get();
        if (view != null) {
            view.setVisibility(n);
            return;
        }
        throw new IllegalStateException("setVisibility called on un-referenced view");
    }
    
    public interface a
    {
    }
}
