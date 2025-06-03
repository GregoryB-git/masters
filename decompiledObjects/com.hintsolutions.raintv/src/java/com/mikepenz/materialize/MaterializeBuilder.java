/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.IdRes
 *  androidx.core.content.ContextCompat
 *  com.mikepenz.materialize.view.ScrimInsetsFrameLayout
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 */
package com.mikepenz.materialize;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.core.content.ContextCompat;
import com.mikepenz.materialize.Materialize;
import com.mikepenz.materialize.R;
import com.mikepenz.materialize.util.UIUtils;
import com.mikepenz.materialize.view.IScrimInsetsLayout;
import com.mikepenz.materialize.view.ScrimInsetsFrameLayout;

public class MaterializeBuilder {
    public Activity mActivity;
    public ViewGroup mContainer = null;
    public ViewGroup.LayoutParams mContainerLayoutParams = null;
    public ViewGroup mContentRoot;
    public boolean mFullscreen = false;
    public boolean mNavigationBarPadding = false;
    public ViewGroup mRootView;
    public IScrimInsetsLayout mScrimInsetsLayout;
    public int mStatusBarColor = 0;
    public int mStatusBarColorRes = -1;
    public boolean mStatusBarPadding = false;
    public boolean mSystemUIHidden = false;
    public boolean mTintNavigationBar = false;
    public boolean mTintStatusBar = true;
    public boolean mTranslucentNavigationBarProgrammatically = false;
    public boolean mTranslucentStatusBarProgrammatically = false;
    public boolean mTransparentNavigationBar = false;
    public boolean mTransparentStatusBar = false;
    public boolean mUseScrimInsetsLayout = true;

    public MaterializeBuilder() {
    }

    public MaterializeBuilder(Activity activity) {
        this.mRootView = (ViewGroup)activity.findViewById(0x1020002);
        this.mActivity = activity;
    }

    public Materialize build() {
        block18: {
            block22: {
                int n;
                int n2;
                block21: {
                    Activity activity;
                    block19: {
                        block20: {
                            int n3;
                            activity = this.mActivity;
                            if (activity == null) break block18;
                            if (!this.mUseScrimInsetsLayout) break block19;
                            this.mScrimInsetsLayout = (ScrimInsetsFrameLayout)activity.getLayoutInflater().inflate(R.layout.materialize, this.mRootView, false);
                            activity = this.mRootView;
                            if (activity == null || activity.getChildCount() == 0) break block20;
                            activity = this.mRootView.getChildAt(0);
                            n2 = activity.getId();
                            n2 = n2 == (n = R.id.materialize_root) ? 1 : 0;
                            int n4 = this.mStatusBarColor;
                            if (n4 == 0 && (n3 = this.mStatusBarColorRes) != -1) {
                                this.mStatusBarColor = ContextCompat.getColor((Context)this.mActivity, (int)n3);
                            } else if (n4 == 0) {
                                this.mStatusBarColor = UIUtils.getThemeColorFromAttrOrRes((Context)this.mActivity, R.attr.colorPrimaryDark, R.color.materialize_primary_dark);
                            }
                            this.mScrimInsetsLayout.setInsetForeground(this.mStatusBarColor);
                            this.mScrimInsetsLayout.setTintStatusBar(this.mTintStatusBar);
                            this.mScrimInsetsLayout.setTintNavigationBar(this.mTintNavigationBar);
                            IScrimInsetsLayout iScrimInsetsLayout = this.mScrimInsetsLayout;
                            boolean bl = !this.mFullscreen && !this.mSystemUIHidden;
                            iScrimInsetsLayout.setSystemUIVisible(bl);
                            if (n2 == 0) {
                                this.mRootView.removeView((View)activity);
                            } else {
                                this.mRootView.removeAllViews();
                            }
                            iScrimInsetsLayout = new FrameLayout.LayoutParams(-1, -1);
                            this.mScrimInsetsLayout.getView().addView((View)activity, (ViewGroup.LayoutParams)iScrimInsetsLayout);
                            this.mContentRoot = this.mScrimInsetsLayout.getView();
                            activity = this.mContainer;
                            if (activity != null) {
                                this.mContentRoot = activity;
                                activity.addView((View)this.mScrimInsetsLayout.getView(), new ViewGroup.LayoutParams(-1, -1));
                            }
                            this.mContentRoot.setId(n);
                            if (this.mContainerLayoutParams == null) {
                                this.mContainerLayoutParams = new ViewGroup.LayoutParams(-1, -1);
                            }
                            this.mRootView.addView((View)this.mContentRoot, this.mContainerLayoutParams);
                            break block21;
                        }
                        throw new RuntimeException("You have to set your layout for this activity with setContentView() first. Or you build the drawer on your own with .buildView()");
                    }
                    if (this.mContainer == null) break block22;
                    activity = this.mRootView.getChildAt(0);
                    this.mRootView.removeView((View)activity);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    this.mContainer.addView((View)activity, (ViewGroup.LayoutParams)layoutParams);
                    if (this.mContainerLayoutParams == null) {
                        this.mContainerLayoutParams = new ViewGroup.LayoutParams(-1, -1);
                    }
                    this.mRootView.addView((View)this.mContainer, this.mContainerLayoutParams);
                }
                if (this.mSystemUIHidden) {
                    this.mActivity.getWindow().getDecorView().setSystemUiVisibility(5894);
                }
                if (this.mTranslucentStatusBarProgrammatically) {
                    UIUtils.setTranslucentStatusFlag(this.mActivity, false);
                }
                if (this.mTranslucentNavigationBarProgrammatically) {
                    UIUtils.setTranslucentNavigationFlag(this.mActivity, true);
                }
                if (this.mTransparentStatusBar || this.mTransparentNavigationBar) {
                    this.mActivity.getWindow().addFlags(Integer.MIN_VALUE);
                }
                if (this.mTransparentStatusBar) {
                    UIUtils.setTranslucentStatusFlag(this.mActivity, false);
                    this.mActivity.getWindow().setStatusBarColor(0);
                }
                if (this.mTransparentNavigationBar) {
                    UIUtils.setTranslucentNavigationFlag(this.mActivity, true);
                    this.mActivity.getWindow().setNavigationBarColor(0);
                }
                n2 = this.mStatusBarPadding ? UIUtils.getStatusBarHeight((Context)this.mActivity) : 0;
                n = this.mNavigationBarPadding ? UIUtils.getNavigationBarHeight((Context)this.mActivity) : 0;
                if (this.mStatusBarPadding || this.mNavigationBarPadding) {
                    this.mScrimInsetsLayout.getView().setPadding(0, n2, 0, n);
                }
                this.mActivity = null;
                return new Materialize(this);
            }
            throw new RuntimeException("please pass a container");
        }
        throw new RuntimeException("please pass an activity");
    }

    public MaterializeBuilder withActivity(Activity activity) {
        this.mRootView = (ViewGroup)activity.findViewById(0x1020002);
        this.mActivity = activity;
        return this;
    }

    public MaterializeBuilder withContainer(ViewGroup viewGroup) {
        this.mContainer = viewGroup;
        return this;
    }

    public MaterializeBuilder withContainer(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        this.mContainer = viewGroup;
        this.mContainerLayoutParams = layoutParams;
        return this;
    }

    public MaterializeBuilder withContainerLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.mContainerLayoutParams = layoutParams;
        return this;
    }

    public MaterializeBuilder withFullscreen(boolean bl) {
        this.mFullscreen = bl;
        if (bl) {
            this.withTranslucentNavigationBarProgrammatically(true);
            this.withTintedStatusBar(false);
            this.withTintedNavigationBar(false);
        }
        return this;
    }

    public MaterializeBuilder withNavigationBarPadding(boolean bl) {
        this.mNavigationBarPadding = bl;
        return this;
    }

    public MaterializeBuilder withRootView(@IdRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            return this.withRootView((ViewGroup)activity.findViewById(n));
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public MaterializeBuilder withRootView(ViewGroup viewGroup) {
        this.mRootView = viewGroup;
        return this;
    }

    public MaterializeBuilder withStatusBarColor(@ColorInt int n) {
        this.mStatusBarColor = n;
        return this;
    }

    public MaterializeBuilder withStatusBarColorRes(@ColorRes int n) {
        this.mStatusBarColorRes = n;
        return this;
    }

    public MaterializeBuilder withStatusBarPadding(boolean bl) {
        this.mStatusBarPadding = bl;
        return this;
    }

    public MaterializeBuilder withSystemUIHidden(boolean bl) {
        this.mSystemUIHidden = bl;
        if (bl) {
            this.withFullscreen(bl);
        }
        return this;
    }

    public MaterializeBuilder withTintedNavigationBar(boolean bl) {
        this.mTintNavigationBar = bl;
        if (bl) {
            this.withTranslucentNavigationBarProgrammatically(true);
        }
        return this;
    }

    public MaterializeBuilder withTintedStatusBar(boolean bl) {
        this.mTintStatusBar = bl;
        return this;
    }

    public MaterializeBuilder withTranslucentNavigationBarProgrammatically(boolean bl) {
        this.mTranslucentNavigationBarProgrammatically = bl;
        return this;
    }

    public MaterializeBuilder withTranslucentStatusBarProgrammatically(boolean bl) {
        this.mTranslucentStatusBarProgrammatically = bl;
        return this;
    }

    public MaterializeBuilder withTransparentNavigationBar(boolean bl) {
        this.mTransparentNavigationBar = bl;
        return this;
    }

    public MaterializeBuilder withTransparentStatusBar(boolean bl) {
        this.mTransparentStatusBar = bl;
        return this;
    }

    public MaterializeBuilder withUseScrimInsetsLayout(boolean bl) {
        this.mUseScrimInsetsLayout = bl;
        return this;
    }
}

