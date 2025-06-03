/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.preference.PreferenceManager
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DimenRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.IdRes
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.MenuRes
 *  androidx.annotation.NonNull
 *  androidx.appcompat.app.ActionBarDrawerToggle
 *  androidx.appcompat.view.SupportMenuInflater
 *  androidx.appcompat.view.menu.MenuBuilder
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.content.ContextCompat
 *  androidx.drawerlayout.widget.DrawerLayout
 *  androidx.drawerlayout.widget.DrawerLayout$DrawerListener
 *  androidx.drawerlayout.widget.DrawerLayout$LayoutParams
 *  androidx.recyclerview.widget.DefaultItemAnimator
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.mikepenz.fastadapter.FastAdapter
 *  com.mikepenz.fastadapter.IItem
 *  com.mikepenz.fastadapter.IItemAdapter
 *  com.mikepenz.fastadapter.adapters.FooterAdapter
 *  com.mikepenz.fastadapter.adapters.HeaderAdapter
 *  com.mikepenz.fastadapter.adapters.ItemAdapter
 *  com.mikepenz.iconics.utils.Utils
 *  com.mikepenz.materialdrawer.DrawerBuilder$1
 *  com.mikepenz.materialdrawer.DrawerBuilder$3
 *  com.mikepenz.materialdrawer.DrawerBuilder$4
 *  com.mikepenz.materialdrawer.DrawerBuilder$6
 *  com.mikepenz.materialdrawer.DrawerBuilder$7
 *  com.mikepenz.materialdrawer.holder.DimenHolder
 *  com.mikepenz.materialdrawer.model.DividerDrawerItem
 *  com.mikepenz.materialdrawer.model.PrimaryDrawerItem
 *  com.mikepenz.materialdrawer.model.SecondaryDrawerItem
 *  com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
 *  com.mikepenz.materialize.view.ScrimInsetsRelativeLayout
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.IItemAdapter;
import com.mikepenz.fastadapter.adapters.FooterAdapter;
import com.mikepenz.fastadapter.adapters.HeaderAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.iconics.utils.Utils;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.DrawerUtils;
import com.mikepenz.materialdrawer.MiniDrawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialize.Materialize;
import com.mikepenz.materialize.MaterializeBuilder;
import com.mikepenz.materialize.util.UIUtils;
import com.mikepenz.materialize.view.ScrimInsetsRelativeLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawerBuilder {
    public AccountHeader mAccountHeader;
    public boolean mAccountHeaderSticky = false;
    public ActionBarDrawerToggle mActionBarDrawerToggle;
    public boolean mActionBarDrawerToggleEnabled = true;
    public Activity mActivity;
    public FastAdapter<IDrawerItem> mAdapter;
    public RecyclerView.Adapter mAdapterWrapper;
    public boolean mAnimateActionBarDrawerToggle = false;
    public boolean mAppended = false;
    public boolean mCloseOnClick = true;
    public int mCurrentStickyFooterSelection = -1;
    public View mCustomView;
    public int mDelayDrawerClickEvent = 0;
    public int mDelayOnDrawerClose = 50;
    public Boolean mDisplayBelowStatusBar;
    public Integer mDrawerGravity = 0x800003;
    public DrawerLayout mDrawerLayout;
    public int mDrawerWidth = -1;
    public boolean mFireInitialOnClick = false;
    public FooterAdapter<IDrawerItem> mFooterAdapter;
    public boolean mFooterClickable = false;
    public boolean mFooterDivider = true;
    public View mFooterView;
    public boolean mFullscreen = false;
    public boolean mGenerateMiniDrawer = false;
    public boolean mHasStableIds = false;
    public HeaderAdapter<IDrawerItem> mHeaderAdapter = new HeaderAdapter();
    public boolean mHeaderDivider = true;
    public boolean mHeaderPadding = true;
    public View mHeaderView;
    public DimenHolder mHeiderHeight = null;
    private boolean mInnerShadow = false;
    public ItemAdapter<IDrawerItem> mItemAdapter = new ItemAdapter();
    public RecyclerView.ItemAnimator mItemAnimator;
    public boolean mKeepStickyItemsVisible = false;
    public RecyclerView.LayoutManager mLayoutManager;
    public Materialize mMaterialize;
    public MiniDrawer mMiniDrawer = null;
    public boolean mMultiSelect = false;
    public Drawer.OnDrawerItemClickListener mOnDrawerItemClickListener;
    public Drawer.OnDrawerItemLongClickListener mOnDrawerItemLongClickListener;
    public Drawer.OnDrawerListener mOnDrawerListener;
    public Drawer.OnDrawerNavigationListener mOnDrawerNavigationListener;
    public boolean mPositionBasedStateManagement = true;
    public RecyclerView mRecyclerView;
    public ViewGroup mRootView;
    public Bundle mSavedInstance;
    public boolean mScrollToTopAfterClick = false;
    public long mSelectedItemIdentifier = 0L;
    public int mSelectedItemPosition = 0;
    public boolean mShowDrawerOnFirstLaunch = false;
    public boolean mShowDrawerUntilDraggedOpened = false;
    public int mSliderBackgroundColor = 0;
    public int mSliderBackgroundColorRes = -1;
    public Drawable mSliderBackgroundDrawable = null;
    public int mSliderBackgroundDrawableRes = -1;
    public ScrimInsetsRelativeLayout mSliderLayout;
    public List<IDrawerItem> mStickyDrawerItems;
    public boolean mStickyFooterDivider = false;
    public boolean mStickyFooterShadow = true;
    public View mStickyFooterShadowView;
    public ViewGroup mStickyFooterView;
    public boolean mStickyHeaderShadow = true;
    public View mStickyHeaderView;
    public boolean mSystemUIHidden = false;
    public Toolbar mToolbar;
    public boolean mTranslucentNavigationBar = false;
    public boolean mTranslucentNavigationBarProgrammatically = false;
    public boolean mTranslucentStatusBar = true;
    public boolean mUsed = false;

    public DrawerBuilder() {
        this.mFooterAdapter = new FooterAdapter();
        this.mItemAnimator = new DefaultItemAnimator();
        this.mStickyDrawerItems = new ArrayList();
        this.getAdapter();
    }

    public DrawerBuilder(@NonNull Activity activity) {
        this.mFooterAdapter = new FooterAdapter();
        this.mItemAnimator = new DefaultItemAnimator();
        this.mStickyDrawerItems = new ArrayList();
        this.mRootView = (ViewGroup)activity.findViewById(0x1020002);
        this.mActivity = activity;
        this.mLayoutManager = new LinearLayoutManager((Context)activity);
        this.getAdapter();
    }

    private void addMenuItems(Menu menu, boolean bl) {
        int n = R.id.material_drawer_menu_default_group;
        for (int i = 0; i < menu.size(); ++i) {
            DividerDrawerItem dividerDrawerItem;
            MenuItem menuItem = menu.getItem(i);
            int n2 = n;
            if (!bl) {
                n2 = n;
                if (menuItem.getGroupId() != n) {
                    n2 = n;
                    if (menuItem.getGroupId() != 0) {
                        n2 = menuItem.getGroupId();
                        dividerDrawerItem = new DividerDrawerItem();
                        this.getItemAdapter().add((IItem[])new IDrawerItem[]{dividerDrawerItem});
                    }
                }
            }
            if (menuItem.hasSubMenu()) {
                dividerDrawerItem = (IDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(menuItem.getTitle().toString())).withIcon(menuItem.getIcon())).withIdentifier((long)menuItem.getItemId())).withEnabled(menuItem.isEnabled())).withSelectable(false);
                this.getItemAdapter().add((IItem[])new IDrawerItem[]{dividerDrawerItem});
                this.addMenuItems((Menu)menuItem.getSubMenu(), true);
            } else if (menuItem.getGroupId() == 0 && !bl) {
                menuItem = (IDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(menuItem.getTitle().toString())).withIcon(menuItem.getIcon())).withIdentifier((long)menuItem.getItemId())).withEnabled(menuItem.isEnabled());
                this.getItemAdapter().add((IItem[])new IDrawerItem[]{menuItem});
            } else {
                menuItem = (IDrawerItem)((SecondaryDrawerItem)((SecondaryDrawerItem)((SecondaryDrawerItem)new SecondaryDrawerItem().withName(menuItem.getTitle().toString())).withIcon(menuItem.getIcon())).withIdentifier((long)menuItem.getItemId())).withEnabled(menuItem.isEnabled());
                this.getItemAdapter().add((IItem[])new IDrawerItem[]{menuItem});
            }
            n = n2;
        }
    }

    private void createContent() {
        long l;
        int n;
        View view = this.mCustomView;
        int n2 = -1;
        if (view != null) {
            view = new LinearLayout.LayoutParams(-1, -1);
            view.weight = 1.0f;
            this.mSliderLayout.addView(this.mCustomView, (ViewGroup.LayoutParams)view);
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        view = recyclerView;
        if (recyclerView == null) {
            view = LayoutInflater.from((Context)this.mActivity).inflate(R.layout.material_drawer_recycler_view, (ViewGroup)this.mSliderLayout, false);
            this.mRecyclerView = recyclerView = (RecyclerView)view.findViewById(R.id.material_drawer_recycler_view);
            recyclerView.setItemAnimator(this.mItemAnimator);
            this.mRecyclerView.setFadingEdgeLength(0);
            this.mRecyclerView.setClipToPadding(false);
            this.mRecyclerView.setLayoutManager(this.mLayoutManager);
            recyclerView = this.mDisplayBelowStatusBar;
            n = (recyclerView == null || recyclerView.booleanValue()) && !this.mSystemUIHidden ? UIUtils.getStatusBarHeight((Context)this.mActivity) : 0;
            int n3 = this.mActivity.getResources().getConfiguration().orientation;
            n3 = (this.mTranslucentNavigationBar || this.mFullscreen) && !this.mSystemUIHidden && (n3 == 1 || n3 == 2 && DrawerUIUtils.isSystemBarOnBottom((Context)this.mActivity)) ? UIUtils.getNavigationBarHeight((Context)this.mActivity) : 0;
            this.mRecyclerView.setPadding(0, n, 0, n3);
        }
        recyclerView = new LinearLayout.LayoutParams(-1, -1);
        recyclerView.weight = 1.0f;
        this.mSliderLayout.addView(view, (ViewGroup.LayoutParams)recyclerView);
        if (this.mInnerShadow) {
            view = this.mSliderLayout.findViewById(R.id.material_drawer_inner_shadow);
            view.setVisibility(0);
            view.bringToFront();
            if (this.mDrawerGravity == 0x800003) {
                view.setBackgroundResource(R.drawable.material_drawer_shadow_left);
            } else {
                view.setBackgroundResource(R.drawable.material_drawer_shadow_right);
            }
        }
        if ((n = this.mSliderBackgroundColor) != 0) {
            this.mSliderLayout.setBackgroundColor(n);
        } else {
            n = this.mSliderBackgroundColorRes;
            if (n != -1) {
                this.mSliderLayout.setBackgroundColor(ContextCompat.getColor((Context)this.mActivity, (int)n));
            } else {
                view = this.mSliderBackgroundDrawable;
                if (view != null) {
                    UIUtils.setBackground((View)this.mSliderLayout, (Drawable)view);
                } else {
                    n = this.mSliderBackgroundDrawableRes;
                    if (n != -1) {
                        UIUtils.setBackground((View)this.mSliderLayout, n);
                    }
                }
            }
        }
        DrawerUtils.handleHeaderView(this);
        DrawerUtils.handleFooterView(this, new View.OnClickListener(this){
            public final DrawerBuilder this$0;
            {
                this.this$0 = drawerBuilder;
            }

            public void onClick(View view) {
                IDrawerItem iDrawerItem = (IDrawerItem)view.getTag();
                DrawerUtils.onFooterDrawerItemClick(this.this$0, iDrawerItem, view, Boolean.TRUE);
            }
        });
        this.mAdapter.withMultiSelect(this.mMultiSelect);
        if (this.mMultiSelect) {
            this.mAdapter.withSelectOnLongClick(false);
            this.mAdapter.withAllowDeselection(true);
        }
        if ((view = this.mAdapterWrapper) == null) {
            this.mRecyclerView.setAdapter(this.mAdapter);
        } else {
            this.mRecyclerView.setAdapter((RecyclerView.Adapter)view);
        }
        if (this.mSelectedItemPosition == 0 && (l = this.mSelectedItemIdentifier) != 0L) {
            this.mSelectedItemPosition = DrawerUtils.getPositionByIdentifier(this, l);
        }
        if (this.mHeaderView != null && this.mSelectedItemPosition == 0) {
            this.mSelectedItemPosition = 1;
        }
        this.mAdapter.deselect();
        this.mAdapter.select(this.mSelectedItemPosition);
        this.mAdapter.withOnClickListener((FastAdapter.OnClickListener)new 6(this));
        this.mAdapter.withOnLongClickListener((FastAdapter.OnLongClickListener)new 7(this));
        view = this.mRecyclerView;
        if (view != null) {
            view.scrollToPosition(0);
        }
        if ((view = this.mSavedInstance) != null) {
            if (!this.mAppended) {
                this.mAdapter.withSavedInstanceState((Bundle)view, "_selection");
                DrawerUtils.setStickyFooterSelection(this, this.mSavedInstance.getInt("bundle_sticky_footer_selection", -1), null);
            } else {
                this.mAdapter.withSavedInstanceState((Bundle)view, "_selection_appended");
                DrawerUtils.setStickyFooterSelection(this, this.mSavedInstance.getInt("bundle_sticky_footer_selection_appended", -1), null);
            }
        }
        if (this.mFireInitialOnClick && this.mOnDrawerItemClickListener != null) {
            n = this.mAdapter.getSelections().size() == 0 ? n2 : (Integer)this.mAdapter.getSelections().iterator().next();
            this.mOnDrawerItemClickListener.onItemClick(null, n, this.getDrawerItem(n));
        }
    }

    private void handleShowOnLaunch() {
        Activity activity = this.mActivity;
        if (activity != null && this.mDrawerLayout != null) {
            activity = PreferenceManager.getDefaultSharedPreferences((Context)activity);
            if (this.mShowDrawerOnFirstLaunch && !activity.getBoolean("navigation_drawer_learned", false)) {
                this.mDrawerLayout.openDrawer((View)this.mSliderLayout);
                activity = activity.edit();
                activity.putBoolean("navigation_drawer_learned", true);
                activity.apply();
            } else if (this.mShowDrawerUntilDraggedOpened && !activity.getBoolean("navigation_drawer_dragged_open", false)) {
                this.mDrawerLayout.openDrawer((View)this.mSliderLayout);
                this.mDrawerLayout.addDrawerListener((DrawerLayout.DrawerListener)new 1(this, (SharedPreferences)activity));
            }
        }
    }

    public DrawerBuilder addDrawerItems(IDrawerItem ... iDrawerItemArray) {
        this.getItemAdapter().add((IItem[])iDrawerItemArray);
        return this;
    }

    public DrawerBuilder addStickyDrawerItems(IDrawerItem ... iDrawerItemArray) {
        if (this.mStickyDrawerItems == null) {
            this.mStickyDrawerItems = new ArrayList();
        }
        Collections.addAll(this.mStickyDrawerItems, (Object[])iDrawerItemArray);
        return this;
    }

    public Drawer append(@NonNull Drawer drawer) {
        if (!this.mUsed) {
            if (this.mDrawerGravity != null) {
                this.mUsed = true;
                this.mAppended = true;
                this.mDrawerLayout = drawer.getDrawerLayout();
                drawer = (ScrimInsetsRelativeLayout)this.mActivity.getLayoutInflater().inflate(R.layout.material_drawer_slider, (ViewGroup)this.mDrawerLayout, false);
                this.mSliderLayout = drawer;
                drawer.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes((Context)this.mActivity, R.attr.material_drawer_background, R.color.material_drawer_background));
                drawer = (DrawerLayout.LayoutParams)this.mSliderLayout.getLayoutParams();
                ((DrawerLayout.LayoutParams)drawer).gravity = this.mDrawerGravity;
                drawer = DrawerUtils.processDrawerLayoutParams(this, (DrawerLayout.LayoutParams)drawer);
                this.mSliderLayout.setLayoutParams((ViewGroup.LayoutParams)drawer);
                this.mSliderLayout.setId(R.id.material_drawer_slider_layout);
                this.mDrawerLayout.addView((View)this.mSliderLayout, 1);
                this.createContent();
                Drawer drawer2 = new Drawer(this);
                drawer = this.mSavedInstance;
                if (drawer != null && drawer.getBoolean("bundle_drawer_content_switched_appended", false)) {
                    this.mAccountHeader.toggleSelectionList((Context)this.mActivity);
                }
                this.mActivity = null;
                return drawer2;
            }
            throw new RuntimeException("please set the gravity for the drawer");
        }
        throw new RuntimeException("you must not reuse a DrawerBuilder builder");
    }

    public Drawer build() {
        if (!this.mUsed) {
            if (this.mActivity != null) {
                this.mUsed = true;
                if (this.mDrawerLayout == null) {
                    this.withDrawerLayout(-1);
                }
                this.mMaterialize = new MaterializeBuilder().withActivity(this.mActivity).withRootView(this.mRootView).withFullscreen(this.mFullscreen).withSystemUIHidden(this.mSystemUIHidden).withUseScrimInsetsLayout(false).withTransparentStatusBar(this.mTranslucentStatusBar).withTranslucentNavigationBarProgrammatically(this.mTranslucentNavigationBarProgrammatically).withContainer((ViewGroup)this.mDrawerLayout).build();
                this.handleDrawerNavigation(this.mActivity, false);
                Drawer drawer = this.buildView();
                this.mSliderLayout.setId(R.id.material_drawer_slider_layout);
                this.mDrawerLayout.addView((View)this.mSliderLayout, 1);
                return drawer;
            }
            throw new RuntimeException("please pass an activity");
        }
        throw new RuntimeException("you must not reuse a DrawerBuilder builder");
    }

    public Drawer buildForFragment() {
        if (!this.mUsed) {
            if (this.mActivity != null) {
                if (this.mRootView != null) {
                    int n;
                    View view;
                    int n2;
                    this.mUsed = true;
                    if (this.mDrawerLayout == null) {
                        this.withDrawerLayout(-1);
                    }
                    if ((n2 = (n2 = (view = this.mRootView.getChildAt(0)).getId()) == (n = R.id.materialize_root) ? 1 : 0) == 0) {
                        this.mRootView.removeView(view);
                    } else {
                        this.mRootView.removeAllViews();
                    }
                    Object object = new FrameLayout.LayoutParams(-1, -1);
                    this.mRootView.addView((View)this.mDrawerLayout, (ViewGroup.LayoutParams)object);
                    this.mDrawerLayout.setId(n);
                    this.handleDrawerNavigation(this.mActivity, false);
                    object = this.buildView();
                    this.mDrawerLayout.addView(view, 0);
                    this.mSliderLayout.setId(R.id.material_drawer_slider_layout);
                    this.mDrawerLayout.addView((View)this.mSliderLayout, 1);
                    return object;
                }
                throw new RuntimeException("please pass the view which should host the DrawerLayout");
            }
            throw new RuntimeException("please pass an activity");
        }
        throw new RuntimeException("you must not reuse a DrawerBuilder builder");
    }

    public Drawer buildView() {
        Object object;
        this.mSliderLayout = object = (ScrimInsetsRelativeLayout)this.mActivity.getLayoutInflater().inflate(R.layout.material_drawer_slider, (ViewGroup)this.mDrawerLayout, false);
        object.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes((Context)this.mActivity, R.attr.material_drawer_background, R.color.material_drawer_background));
        object = (DrawerLayout.LayoutParams)this.mSliderLayout.getLayoutParams();
        if (object != null) {
            object.gravity = this.mDrawerGravity;
            object = DrawerUtils.processDrawerLayoutParams(this, (DrawerLayout.LayoutParams)object);
            this.mSliderLayout.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        this.createContent();
        object = new Drawer(this);
        AccountHeader accountHeader = this.mAccountHeader;
        if (accountHeader != null) {
            accountHeader.setDrawer((Drawer)object);
        }
        if ((accountHeader = this.mSavedInstance) != null && accountHeader.getBoolean("bundle_drawer_content_switched", false)) {
            this.mAccountHeader.toggleSelectionList((Context)this.mActivity);
        }
        this.handleShowOnLaunch();
        if (!this.mAppended && this.mGenerateMiniDrawer) {
            this.mMiniDrawer = new MiniDrawer().withDrawer((Drawer)object).withAccountHeader(this.mAccountHeader).withPositionBasedStateManagement(this.mPositionBasedStateManagement);
        }
        this.mActivity = null;
        return object;
    }

    public boolean checkDrawerItem(int n, boolean bl) {
        bl = this.getAdapter().getItem(n) != null;
        return bl;
    }

    public void closeDrawerDelayed() {
        DrawerLayout drawerLayout;
        if (this.mCloseOnClick && (drawerLayout = this.mDrawerLayout) != null) {
            if (this.mDelayOnDrawerClose > -1) {
                new Handler().postDelayed(new Runnable(this){
                    public final DrawerBuilder this$0;
                    {
                        this.this$0 = drawerBuilder;
                    }

                    public void run() {
                        this.this$0.mDrawerLayout.closeDrawers();
                        DrawerBuilder drawerBuilder = this.this$0;
                        if (drawerBuilder.mScrollToTopAfterClick) {
                            drawerBuilder.mRecyclerView.smoothScrollToPosition(0);
                        }
                    }
                }, (long)this.mDelayOnDrawerClose);
            } else {
                drawerLayout.closeDrawers();
            }
        }
    }

    public FastAdapter<IDrawerItem> getAdapter() {
        if (this.mAdapter == null) {
            FastAdapter fastAdapter;
            this.mAdapter = fastAdapter = new FastAdapter();
            fastAdapter.withSelectable(true);
            this.mAdapter.withAllowDeselection(false);
            this.mAdapter.setHasStableIds(this.mHasStableIds);
            this.mAdapter.withPositionBasedStateManagement(this.mPositionBasedStateManagement);
            this.mHeaderAdapter.wrap((IAdapter)this.mItemAdapter.wrap((IAdapter)this.mFooterAdapter.wrap(this.mAdapter)));
        }
        return this.mAdapter;
    }

    public IDrawerItem getDrawerItem(int n) {
        return (IDrawerItem)this.getAdapter().getItem(n);
    }

    public IItemAdapter<IDrawerItem> getFooterAdapter() {
        return this.mFooterAdapter;
    }

    public IItemAdapter<IDrawerItem> getHeaderAdapter() {
        return this.mHeaderAdapter;
    }

    public IItemAdapter<IDrawerItem> getItemAdapter() {
        return this.mItemAdapter;
    }

    public void handleDrawerNavigation(Activity activity, boolean bl) {
        Toolbar toolbar;
        View.OnClickListener onClickListener = new View.OnClickListener(this){
            public final DrawerBuilder this$0;
            {
                this.this$0 = drawerBuilder;
            }

            public void onClick(View object) {
                DrawerBuilder drawerBuilder = this.this$0;
                boolean bl = drawerBuilder.mOnDrawerNavigationListener != null && (drawerBuilder = drawerBuilder.mActionBarDrawerToggle) != null && !drawerBuilder.isDrawerIndicatorEnabled() ? this.this$0.mOnDrawerNavigationListener.onNavigationClickListener((View)object) : false;
                if (!bl) {
                    object = this.this$0;
                    if (object.mDrawerLayout.isDrawerOpen(object.mDrawerGravity.intValue())) {
                        object = this.this$0;
                        object.mDrawerLayout.closeDrawer(object.mDrawerGravity.intValue());
                    } else {
                        object = this.this$0;
                        object.mDrawerLayout.openDrawer(object.mDrawerGravity.intValue());
                    }
                }
            }
        };
        if (bl) {
            this.mActionBarDrawerToggle = null;
        }
        if (this.mActionBarDrawerToggleEnabled && this.mActionBarDrawerToggle == null && (toolbar = this.mToolbar) != null) {
            activity = new 3(this, activity, this.mDrawerLayout, toolbar, R.string.material_drawer_open, R.string.material_drawer_close);
            this.mActionBarDrawerToggle = activity;
            activity.syncState();
        }
        if ((activity = this.mToolbar) != null) {
            activity.setNavigationOnClickListener(onClickListener);
        }
        if ((activity = this.mActionBarDrawerToggle) != null) {
            activity.setToolbarNavigationClickListener(onClickListener);
            this.mDrawerLayout.addDrawerListener((DrawerLayout.DrawerListener)this.mActionBarDrawerToggle);
        } else {
            this.mDrawerLayout.addDrawerListener((DrawerLayout.DrawerListener)new 4(this));
        }
    }

    public DrawerBuilder inflateMenu(@MenuRes int n) {
        SupportMenuInflater supportMenuInflater = new SupportMenuInflater((Context)this.mActivity);
        MenuBuilder menuBuilder = new MenuBuilder((Context)this.mActivity);
        supportMenuInflater.inflate(n, (Menu)menuBuilder);
        this.addMenuItems((Menu)menuBuilder, false);
        return this;
    }

    public void resetStickyFooterSelection() {
        if (this.mStickyFooterView instanceof LinearLayout) {
            for (int i = 0; i < this.mStickyFooterView.getChildCount(); ++i) {
                this.mStickyFooterView.getChildAt(i).setActivated(false);
                this.mStickyFooterView.getChildAt(i).setSelected(false);
            }
        }
    }

    public DrawerBuilder withAccountHeader(@NonNull AccountHeader accountHeader) {
        return this.withAccountHeader(accountHeader, false);
    }

    public DrawerBuilder withAccountHeader(@NonNull AccountHeader accountHeader, boolean bl) {
        this.mAccountHeader = accountHeader;
        this.mAccountHeaderSticky = bl;
        return this;
    }

    public DrawerBuilder withActionBarDrawerToggle(@NonNull ActionBarDrawerToggle actionBarDrawerToggle) {
        this.mActionBarDrawerToggleEnabled = true;
        this.mActionBarDrawerToggle = actionBarDrawerToggle;
        return this;
    }

    public DrawerBuilder withActionBarDrawerToggle(boolean bl) {
        this.mActionBarDrawerToggleEnabled = bl;
        return this;
    }

    public DrawerBuilder withActionBarDrawerToggleAnimated(boolean bl) {
        this.mAnimateActionBarDrawerToggle = bl;
        return this;
    }

    public DrawerBuilder withActivity(@NonNull Activity activity) {
        this.mRootView = (ViewGroup)activity.findViewById(0x1020002);
        this.mActivity = activity;
        this.mLayoutManager = new LinearLayoutManager((Context)activity);
        return this;
    }

    public DrawerBuilder withAdapter(@NonNull FastAdapter<IDrawerItem> fastAdapter) {
        this.mAdapter = fastAdapter;
        this.mHeaderAdapter.wrap((IAdapter)this.mItemAdapter.wrap((IAdapter)this.mFooterAdapter.wrap(fastAdapter)));
        return this;
    }

    public DrawerBuilder withAdapterWrapper(@NonNull RecyclerView.Adapter adapter) {
        if (this.mAdapter != null) {
            this.mAdapterWrapper = adapter;
            return this;
        }
        throw new RuntimeException("this adapter has to be set in conjunction to a normal adapter which is used inside this wrapper adapter");
    }

    public DrawerBuilder withCloseOnClick(boolean bl) {
        this.mCloseOnClick = bl;
        return this;
    }

    public DrawerBuilder withCustomView(@NonNull View view) {
        this.mCustomView = view;
        return this;
    }

    public DrawerBuilder withDelayDrawerClickEvent(int n) {
        this.mDelayDrawerClickEvent = n;
        return this;
    }

    public DrawerBuilder withDelayOnDrawerClose(int n) {
        this.mDelayOnDrawerClose = n;
        return this;
    }

    public DrawerBuilder withDisplayBelowStatusBar(boolean bl) {
        this.mDisplayBelowStatusBar = bl;
        return this;
    }

    public DrawerBuilder withDrawerGravity(int n) {
        this.mDrawerGravity = n;
        return this;
    }

    public DrawerBuilder withDrawerItems(@NonNull List<IDrawerItem> list) {
        this.getItemAdapter().set(list);
        return this;
    }

    public DrawerBuilder withDrawerLayout(@LayoutRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mDrawerLayout = n != -1 ? (DrawerLayout)activity.getLayoutInflater().inflate(n, this.mRootView, false) : (DrawerLayout)activity.getLayoutInflater().inflate(R.layout.material_drawer, this.mRootView, false);
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withDrawerLayout(@NonNull DrawerLayout drawerLayout) {
        this.mDrawerLayout = drawerLayout;
        return this;
    }

    public DrawerBuilder withDrawerWidthDp(int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mDrawerWidth = Utils.convertDpToPx((Context)activity, (float)n);
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withDrawerWidthPx(int n) {
        this.mDrawerWidth = n;
        return this;
    }

    public DrawerBuilder withDrawerWidthRes(@DimenRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mDrawerWidth = activity.getResources().getDimensionPixelSize(n);
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withFireOnInitialOnClick(boolean bl) {
        this.mFireInitialOnClick = bl;
        return this;
    }

    public DrawerBuilder withFooter(@LayoutRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (n != -1) {
                this.mFooterView = activity.getLayoutInflater().inflate(n, null, false);
            }
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withFooter(@NonNull View view) {
        this.mFooterView = view;
        return this;
    }

    public DrawerBuilder withFooterClickable(boolean bl) {
        this.mFooterClickable = bl;
        return this;
    }

    public DrawerBuilder withFooterDivider(boolean bl) {
        this.mFooterDivider = bl;
        return this;
    }

    public DrawerBuilder withFullscreen(boolean bl) {
        this.mFullscreen = bl;
        if (bl) {
            this.withTranslucentStatusBar(true);
            this.withTranslucentNavigationBar(false);
        }
        return this;
    }

    public DrawerBuilder withGenerateMiniDrawer(boolean bl) {
        this.mGenerateMiniDrawer = bl;
        return this;
    }

    public DrawerBuilder withHasStableIds(boolean bl) {
        this.mHasStableIds = bl;
        FastAdapter<IDrawerItem> fastAdapter = this.mAdapter;
        if (fastAdapter != null) {
            fastAdapter.setHasStableIds(bl);
        }
        return this;
    }

    public DrawerBuilder withHeader(@LayoutRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (n != -1) {
                this.mHeaderView = activity.getLayoutInflater().inflate(n, null, false);
            }
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withHeader(@NonNull View view) {
        this.mHeaderView = view;
        return this;
    }

    public DrawerBuilder withHeaderDivider(boolean bl) {
        this.mHeaderDivider = bl;
        return this;
    }

    public DrawerBuilder withHeaderHeight(DimenHolder dimenHolder) {
        this.mHeiderHeight = dimenHolder;
        return this;
    }

    public DrawerBuilder withHeaderPadding(boolean bl) {
        this.mHeaderPadding = bl;
        return this;
    }

    public DrawerBuilder withInnerShadow(boolean bl) {
        this.mInnerShadow = bl;
        return this;
    }

    public DrawerBuilder withItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        this.mItemAnimator = itemAnimator;
        return this;
    }

    public DrawerBuilder withKeepStickyItemsVisible(boolean bl) {
        this.mKeepStickyItemsVisible = bl;
        return this;
    }

    public DrawerBuilder withMultiSelect(boolean bl) {
        this.mMultiSelect = bl;
        return this;
    }

    public DrawerBuilder withOnDrawerItemClickListener(@NonNull Drawer.OnDrawerItemClickListener onDrawerItemClickListener) {
        this.mOnDrawerItemClickListener = onDrawerItemClickListener;
        return this;
    }

    public DrawerBuilder withOnDrawerItemLongClickListener(@NonNull Drawer.OnDrawerItemLongClickListener onDrawerItemLongClickListener) {
        this.mOnDrawerItemLongClickListener = onDrawerItemLongClickListener;
        return this;
    }

    public DrawerBuilder withOnDrawerListener(@NonNull Drawer.OnDrawerListener onDrawerListener) {
        this.mOnDrawerListener = onDrawerListener;
        return this;
    }

    public DrawerBuilder withOnDrawerNavigationListener(@NonNull Drawer.OnDrawerNavigationListener onDrawerNavigationListener) {
        this.mOnDrawerNavigationListener = onDrawerNavigationListener;
        return this;
    }

    public DrawerBuilder withPositionBasedStateManagement(boolean bl) {
        this.mPositionBasedStateManagement = bl;
        FastAdapter<IDrawerItem> fastAdapter = this.mAdapter;
        if (fastAdapter != null) {
            fastAdapter.withPositionBasedStateManagement(bl);
        }
        return this;
    }

    public DrawerBuilder withRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        return this;
    }

    public DrawerBuilder withRootView(@IdRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            return this.withRootView((ViewGroup)activity.findViewById(n));
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withRootView(@NonNull ViewGroup viewGroup) {
        this.mRootView = viewGroup;
        this.withTranslucentStatusBar(false);
        return this;
    }

    public DrawerBuilder withSavedInstance(Bundle bundle) {
        this.mSavedInstance = bundle;
        return this;
    }

    public DrawerBuilder withScrollToTopAfterClick(boolean bl) {
        this.mScrollToTopAfterClick = bl;
        return this;
    }

    public DrawerBuilder withSelectedItem(long l) {
        this.mSelectedItemIdentifier = l;
        return this;
    }

    public DrawerBuilder withSelectedItemByPosition(int n) {
        this.mSelectedItemPosition = n;
        return this;
    }

    public DrawerBuilder withShowDrawerOnFirstLaunch(boolean bl) {
        this.mShowDrawerOnFirstLaunch = bl;
        return this;
    }

    public DrawerBuilder withShowDrawerUntilDraggedOpened(boolean bl) {
        this.mShowDrawerUntilDraggedOpened = bl;
        return this;
    }

    public DrawerBuilder withSliderBackgroundColor(@ColorInt int n) {
        this.mSliderBackgroundColor = n;
        return this;
    }

    public DrawerBuilder withSliderBackgroundColorRes(@ColorRes int n) {
        this.mSliderBackgroundColorRes = n;
        return this;
    }

    public DrawerBuilder withSliderBackgroundDrawable(@NonNull Drawable drawable2) {
        this.mSliderBackgroundDrawable = drawable2;
        return this;
    }

    public DrawerBuilder withSliderBackgroundDrawableRes(@DrawableRes int n) {
        this.mSliderBackgroundDrawableRes = n;
        return this;
    }

    public DrawerBuilder withStickyDrawerItems(@NonNull List<IDrawerItem> list) {
        this.mStickyDrawerItems = list;
        return this;
    }

    public DrawerBuilder withStickyFooter(@LayoutRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (n != -1) {
                this.mStickyFooterView = (ViewGroup)activity.getLayoutInflater().inflate(n, null, false);
            }
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withStickyFooter(@NonNull ViewGroup viewGroup) {
        this.mStickyFooterView = viewGroup;
        return this;
    }

    public DrawerBuilder withStickyFooterDivider(boolean bl) {
        this.mStickyFooterDivider = bl;
        return this;
    }

    public DrawerBuilder withStickyFooterShadow(boolean bl) {
        this.mStickyFooterShadow = bl;
        return this;
    }

    public DrawerBuilder withStickyHeader(@LayoutRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (n != -1) {
                this.mStickyHeaderView = activity.getLayoutInflater().inflate(n, null, false);
            }
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public DrawerBuilder withStickyHeader(@NonNull View view) {
        this.mStickyHeaderView = view;
        return this;
    }

    public DrawerBuilder withStickyHeaderShadow(boolean bl) {
        this.mStickyHeaderShadow = bl;
        return this;
    }

    public DrawerBuilder withSystemUIHidden(boolean bl) {
        this.mSystemUIHidden = bl;
        if (bl) {
            this.withFullscreen(bl);
        }
        return this;
    }

    public DrawerBuilder withToolbar(@NonNull Toolbar toolbar) {
        this.mToolbar = toolbar;
        return this;
    }

    public DrawerBuilder withTranslucentNavigationBar(boolean bl) {
        this.mTranslucentNavigationBar = bl;
        if (!bl) {
            this.mTranslucentNavigationBarProgrammatically = false;
        }
        return this;
    }

    public DrawerBuilder withTranslucentNavigationBarProgrammatically(boolean bl) {
        this.mTranslucentNavigationBarProgrammatically = bl;
        if (bl) {
            this.mTranslucentNavigationBar = true;
        }
        return this;
    }

    public DrawerBuilder withTranslucentStatusBar(boolean bl) {
        this.mTranslucentStatusBar = bl;
        return this;
    }
}

