/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.MotionEvent
 *  android.view.View
 *  com.facebook.drawee.view.DraweeView
 *  java.lang.Exception
 *  java.lang.Object
 *  me.relex.photodraweeview.Attacher
 */
package me.relex.photodraweeview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.drawee.view.DraweeView;
import me.relex.photodraweeview.Attacher;

public class DefaultOnDoubleTapListener
implements GestureDetector.OnDoubleTapListener {
    private Attacher mAttacher;

    public DefaultOnDoubleTapListener(Attacher attacher) {
        this.setPhotoDraweeViewAttacher(attacher);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Attacher attacher = this.mAttacher;
        if (attacher == null) {
            return false;
        }
        try {
            float f7 = attacher.getScale();
            float f9 = motionEvent.getX();
            float f10 = motionEvent.getY();
            if (f7 < this.mAttacher.getMediumScale()) {
                motionEvent = this.mAttacher;
                motionEvent.setScale(motionEvent.getMediumScale(), f9, f10, true);
                return true;
            } else if (f7 >= this.mAttacher.getMediumScale() && f7 < this.mAttacher.getMaximumScale()) {
                motionEvent = this.mAttacher;
                motionEvent.setScale(motionEvent.getMaximumScale(), f9, f10, true);
                return true;
            } else {
                motionEvent = this.mAttacher;
                motionEvent.setScale(motionEvent.getMinimumScale(), f9, f10, true);
            }
            return true;
        }
        catch (Exception exception) {
            return true;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        float f7;
        float f9;
        Attacher attacher = this.mAttacher;
        if (attacher == null) {
            return false;
        }
        DraweeView draweeView = attacher.getDraweeView();
        if (draweeView == null) {
            return false;
        }
        if (this.mAttacher.getOnPhotoTapListener() != null && (attacher = this.mAttacher.getDisplayRect()) != null && attacher.contains(f9 = motionEvent.getX(), f7 = motionEvent.getY())) {
            f9 = (f9 - attacher.left) / attacher.width();
            f7 = (f7 - attacher.top) / attacher.height();
            this.mAttacher.getOnPhotoTapListener().onPhotoTap((View)draweeView, f9, f7);
            return true;
        }
        if (this.mAttacher.getOnViewTapListener() != null) {
            this.mAttacher.getOnViewTapListener().onViewTap((View)draweeView, motionEvent.getX(), motionEvent.getY());
            return true;
        }
        return false;
    }

    public void setPhotoDraweeViewAttacher(Attacher attacher) {
        this.mAttacher = attacher;
    }
}

