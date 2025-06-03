/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.text.Layout
 *  android.text.Spanned
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.TextView
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.annotation.SuppressLint;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.twitter.sdk.android.tweetui.internal.HighlightedClickableSpan;

public class SpanClickHandler {
    private HighlightedClickableSpan highlightedClickableSpan;
    private Layout layout;
    private float left;
    private float top;
    private final View view;

    public SpanClickHandler(View view, Layout layout2) {
        this.view = view;
        this.layout = layout2;
    }

    public static /* synthetic */ Layout access$002(SpanClickHandler spanClickHandler, Layout layout2) {
        spanClickHandler.layout = layout2;
        return layout2;
    }

    public static /* synthetic */ float access$102(SpanClickHandler spanClickHandler, float f2) {
        spanClickHandler.left = f2;
        return f2;
    }

    public static /* synthetic */ float access$202(SpanClickHandler spanClickHandler, float f2) {
        spanClickHandler.top = f2;
        return f2;
    }

    private void deselectSpan() {
        HighlightedClickableSpan highlightedClickableSpan = this.highlightedClickableSpan;
        if (highlightedClickableSpan != null && highlightedClickableSpan.isSelected()) {
            highlightedClickableSpan.select(false);
            this.highlightedClickableSpan = null;
            this.invalidate();
        }
    }

    public static void enableClicksOnSpans(TextView textView) {
        textView.setOnTouchListener(new View.OnTouchListener(new SpanClickHandler((View)textView, null)){
            public final SpanClickHandler val$helper;
            {
                this.val$helper = spanClickHandler;
            }

            @SuppressLint(value={"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Object object = (view = (TextView)view).getLayout();
                if (object != null) {
                    SpanClickHandler.access$002(this.val$helper, object);
                    object = this.val$helper;
                    int n = view.getTotalPaddingLeft();
                    SpanClickHandler.access$102((SpanClickHandler)object, view.getScrollX() + n);
                    object = this.val$helper;
                    n = view.getTotalPaddingTop();
                    SpanClickHandler.access$202((SpanClickHandler)object, view.getScrollY() + n);
                    return this.val$helper.handleTouchEvent(motionEvent);
                }
                return false;
            }
        });
    }

    private void invalidate() {
        View view = this.view;
        float f2 = this.left;
        int n = (int)f2;
        int n3 = (int)this.top;
        int n4 = (int)f2;
        int n5 = this.layout.getWidth();
        int n6 = (int)this.top;
        view.invalidate(n, n3, n5 + n4, this.layout.getHeight() + n6);
    }

    private void selectSpan(HighlightedClickableSpan highlightedClickableSpan) {
        highlightedClickableSpan.select(true);
        this.highlightedClickableSpan = highlightedClickableSpan;
        this.invalidate();
    }

    public boolean handleTouchEvent(MotionEvent object) {
        Object object2 = this.layout.getText();
        object2 = object2 instanceof Spanned ? (Spanned)object2 : null;
        if (object2 == null) {
            return false;
        }
        int n = object.getAction() & 0xFF;
        int n3 = (int)(object.getX() - this.left);
        int n4 = (int)(object.getY() - this.top);
        if (n3 >= 0 && n3 < this.layout.getWidth() && n4 >= 0 && n4 < this.layout.getHeight()) {
            float f2 = n3;
            if (!(f2 < this.layout.getLineLeft(n4 = this.layout.getLineForVertical(n4))) && !(f2 > this.layout.getLineRight(n4))) {
                if (n == 0) {
                    n = this.layout.getOffsetForHorizontal(n4, f2);
                    object = (HighlightedClickableSpan[])object2.getSpans(n, n, HighlightedClickableSpan.class);
                    if (((Object)object).length > 0) {
                        this.selectSpan((HighlightedClickableSpan)object[0]);
                        return true;
                    }
                } else if (n == 1 && (object = this.highlightedClickableSpan) != null) {
                    object.onClick(this.view);
                    this.deselectSpan();
                    return true;
                }
                return false;
            }
            this.deselectSpan();
            return false;
        }
        this.deselectSpan();
        return false;
    }
}

