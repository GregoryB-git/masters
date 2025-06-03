/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import com.hintsolutions.raintv.views.RainFooterViewItem;

public class RainFooterViewItem_ViewBinding
implements Unbinder {
    private RainFooterViewItem target;
    private View view7f090072;
    private View view7f090169;
    private View view7f090411;
    private View view7f09043d;
    private View view7f090451;

    @UiThread
    public RainFooterViewItem_ViewBinding(RainFooterViewItem rainFooterViewItem, View view) {
        this.target = rainFooterViewItem;
        View view2 = view.findViewById(2131296617);
        if (view2 != null) {
            this.view7f090169 = view2;
            view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, rainFooterViewItem){
                public final RainFooterViewItem_ViewBinding this$0;
                public final RainFooterViewItem val$target;
                {
                    this.this$0 = rainFooterViewItem_ViewBinding;
                    this.val$target = rainFooterViewItem;
                }

                public void doClick(View view) {
                    this.val$target.openRainFacebook();
                }
            });
        }
        if ((view2 = view.findViewById(2131297297)) != null) {
            this.view7f090411 = view2;
            view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, rainFooterViewItem){
                public final RainFooterViewItem_ViewBinding this$0;
                public final RainFooterViewItem val$target;
                {
                    this.this$0 = rainFooterViewItem_ViewBinding;
                    this.val$target = rainFooterViewItem;
                }

                public void doClick(View view) {
                    this.val$target.openRainTwitter();
                }
            });
        }
        if ((view2 = view.findViewById(2131297341)) != null) {
            this.view7f09043d = view2;
            view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, rainFooterViewItem){
                public final RainFooterViewItem_ViewBinding this$0;
                public final RainFooterViewItem val$target;
                {
                    this.this$0 = rainFooterViewItem_ViewBinding;
                    this.val$target = rainFooterViewItem;
                }

                public void doClick(View view) {
                    this.val$target.openRainVk();
                }
            });
        }
        if ((view2 = view.findViewById(2131297361)) != null) {
            this.view7f090451 = view2;
            view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, rainFooterViewItem){
                public final RainFooterViewItem_ViewBinding this$0;
                public final RainFooterViewItem val$target;
                {
                    this.this$0 = rainFooterViewItem_ViewBinding;
                    this.val$target = rainFooterViewItem;
                }

                public void doClick(View view) {
                    this.val$target.openRainYoutube();
                }
            });
        }
        if ((view = view.findViewById(2131296370)) != null) {
            this.view7f090072 = view;
            view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, rainFooterViewItem){
                public final RainFooterViewItem_ViewBinding this$0;
                public final RainFooterViewItem val$target;
                {
                    this.this$0 = rainFooterViewItem_ViewBinding;
                    this.val$target = rainFooterViewItem;
                }

                public void doClick(View view) {
                    this.val$target.startAudioLiveActivity();
                }
            });
        }
    }

    @CallSuper
    public void unbind() {
        if (this.target != null) {
            this.target = null;
            View view = this.view7f090169;
            if (view != null) {
                view.setOnClickListener(null);
                this.view7f090169 = null;
            }
            if ((view = this.view7f090411) != null) {
                view.setOnClickListener(null);
                this.view7f090411 = null;
            }
            if ((view = this.view7f09043d) != null) {
                view.setOnClickListener(null);
                this.view7f09043d = null;
            }
            if ((view = this.view7f090451) != null) {
                view.setOnClickListener(null);
                this.view7f090451 = null;
            }
            if ((view = this.view7f090072) != null) {
                view.setOnClickListener(null);
                this.view7f090072 = null;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

