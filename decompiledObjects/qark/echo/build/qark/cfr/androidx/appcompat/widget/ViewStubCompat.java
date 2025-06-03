/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import e.i;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
extends View {
    public int o = 0;
    public int p;
    public WeakReference q;
    public LayoutInflater r;

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        context = context.obtainStyledAttributes(attributeSet, i.S2, n8, 0);
        this.p = context.getResourceId(i.V2, -1);
        this.o = context.getResourceId(i.U2, 0);
        this.setId(context.getResourceId(i.T2, -1));
        context.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    public View a() {
        ViewParent viewParent = this.getParent();
        if (viewParent instanceof ViewGroup) {
            if (this.o != 0) {
                ViewGroup viewGroup = (ViewGroup)viewParent;
                viewParent = this.r;
                if (viewParent == null) {
                    viewParent = LayoutInflater.from((Context)this.getContext());
                }
                viewParent = viewParent.inflate(this.o, viewGroup, false);
                int n8 = this.p;
                if (n8 != -1) {
                    viewParent.setId(n8);
                }
                n8 = viewGroup.indexOfChild((View)this);
                viewGroup.removeViewInLayout((View)this);
                ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView((View)viewParent, n8, layoutParams);
                } else {
                    viewGroup.addView((View)viewParent, n8);
                }
                this.q = new WeakReference((Object)viewParent);
                return viewParent;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
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

    public void onMeasure(int n8, int n9) {
        this.setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int n8) {
        this.p = n8;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.r = layoutInflater;
    }

    public void setLayoutResource(int n8) {
        this.o = n8;
    }

    public void setOnInflateListener(a a8) {
    }

    public void setVisibility(int n8) {
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            if ((weakReference = (View)weakReference.get()) != null) {
                weakReference.setVisibility(n8);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(n8);
        if (n8 == 0 || n8 == 4) {
            this.a();
        }
    }

    public static interface a {
    }

}

