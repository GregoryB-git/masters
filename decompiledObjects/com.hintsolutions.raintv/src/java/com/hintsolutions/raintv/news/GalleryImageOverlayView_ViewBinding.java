/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;

public class GalleryImageOverlayView_ViewBinding
implements Unbinder {
    private GalleryImageOverlayView target;
    private View view7f0900e2;
    private View view7f090361;

    @UiThread
    public GalleryImageOverlayView_ViewBinding(GalleryImageOverlayView galleryImageOverlayView) {
        this(galleryImageOverlayView, (View)galleryImageOverlayView);
    }

    @UiThread
    public GalleryImageOverlayView_ViewBinding(GalleryImageOverlayView galleryImageOverlayView, View view) {
        View view2;
        this.target = galleryImageOverlayView;
        galleryImageOverlayView.descriptionView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296536, (String)"field 'descriptionView'", TextView.class);
        galleryImageOverlayView.positionView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297014, (String)"field 'positionView'", TextView.class);
        galleryImageOverlayView.authorView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296374, (String)"field 'authorView'", TextView.class);
        galleryImageOverlayView.scrollView = (ScrollView)Utils.findRequiredViewAsType((View)view, (int)2131297089, (String)"field 'scrollView'", ScrollView.class);
        galleryImageOverlayView.scrollViewLimitLayout = Utils.findRequiredView((View)view, (int)2131297090, (String)"field 'scrollViewLimitLayout'");
        this.view7f0900e2 = view2 = Utils.findRequiredView((View)view, (int)2131296482, (String)"method 'onCloseClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, galleryImageOverlayView){
            public final GalleryImageOverlayView_ViewBinding this$0;
            public final GalleryImageOverlayView val$target;
            {
                this.this$0 = galleryImageOverlayView_ViewBinding;
                this.val$target = galleryImageOverlayView;
            }

            public void doClick(View view) {
                this.val$target.onCloseClicked();
            }
        });
        this.view7f090361 = view = Utils.findRequiredView((View)view, (int)2131297121, (String)"method 'onShareClick'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, galleryImageOverlayView){
            public final GalleryImageOverlayView_ViewBinding this$0;
            public final GalleryImageOverlayView val$target;
            {
                this.this$0 = galleryImageOverlayView_ViewBinding;
                this.val$target = galleryImageOverlayView;
            }

            public void doClick(View view) {
                this.val$target.onShareClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        GalleryImageOverlayView galleryImageOverlayView = this.target;
        if (galleryImageOverlayView != null) {
            this.target = null;
            galleryImageOverlayView.descriptionView = null;
            galleryImageOverlayView.positionView = null;
            galleryImageOverlayView.authorView = null;
            galleryImageOverlayView.scrollView = null;
            galleryImageOverlayView.scrollViewLimitLayout = null;
            this.view7f0900e2.setOnClickListener(null);
            this.view7f0900e2 = null;
            this.view7f090361.setOnClickListener(null);
            this.view7f090361 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

