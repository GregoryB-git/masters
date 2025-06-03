/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.FrameLayout
 *  androidx.annotation.NonNull
 *  androidx.appcompat.app.ActionBarDrawerToggle
 *  androidx.appcompat.widget.Toolbar
 *  androidx.drawerlayout.widget.DrawerLayout
 *  androidx.drawerlayout.widget.DrawerLayout$LayoutParams
 *  androidx.recyclerview.widget.RecyclerView
 *  com.mikepenz.fastadapter.FastAdapter
 *  com.mikepenz.fastadapter.IItem
 *  com.mikepenz.fastadapter.adapters.FooterAdapter
 *  com.mikepenz.fastadapter.adapters.HeaderAdapter
 *  com.mikepenz.fastadapter.adapters.ItemAdapter
 *  com.mikepenz.materialdrawer.holder.DimenHolder
 *  com.mikepenz.materialdrawer.holder.ImageHolder
 *  com.mikepenz.materialdrawer.holder.StringHolder
 *  com.mikepenz.materialdrawer.model.AbstractDrawerItem
 *  com.mikepenz.materialdrawer.model.ContainerDrawerItem
 *  com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
 *  com.mikepenz.materialize.view.ScrimInsetsRelativeLayout
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.adapters.FooterAdapter;
import com.mikepenz.fastadapter.adapters.HeaderAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.DrawerUtils;
import com.mikepenz.materialdrawer.MiniDrawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.holder.ImageHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.ContainerDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Badgeable;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Iconable;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;
import com.mikepenz.materialize.Materialize;
import com.mikepenz.materialize.view.ScrimInsetsRelativeLayout;
import java.util.ArrayList;
import java.util.List;

public class Drawer {
    public static final String BUNDLE_DRAWER_CONTENT_SWITCHED = "bundle_drawer_content_switched";
    public static final String BUNDLE_DRAWER_CONTENT_SWITCHED_APPENDED = "bundle_drawer_content_switched_appended";
    public static final String BUNDLE_SELECTION = "_selection";
    public static final String BUNDLE_SELECTION_APPENDED = "_selection_appended";
    public static final String BUNDLE_STICKY_FOOTER_SELECTION = "bundle_sticky_footer_selection";
    public static final String BUNDLE_STICKY_FOOTER_SELECTION_APPENDED = "bundle_sticky_footer_selection_appended";
    public static final String PREF_USER_LEARNED_DRAWER = "navigation_drawer_learned";
    public static final String PREF_USER_OPENED_DRAWER_BY_DRAGGING = "navigation_drawer_dragged_open";
    private FrameLayout mContentView;
    public final DrawerBuilder mDrawerBuilder;
    private List<IDrawerItem> originalDrawerItems;
    private Bundle originalDrawerState;
    private OnDrawerItemClickListener originalOnDrawerItemClickListener;
    private OnDrawerItemLongClickListener originalOnDrawerItemLongClickListener;

    public Drawer(DrawerBuilder drawerBuilder) {
        this.mDrawerBuilder = drawerBuilder;
    }

    private View getStickyFooterShadow() {
        return this.mDrawerBuilder.mStickyFooterShadowView;
    }

    private void setItems(@NonNull List<IDrawerItem> list, boolean bl) {
        if (this.originalDrawerItems != null && !bl) {
            this.originalDrawerItems = list;
        }
        this.mDrawerBuilder.getItemAdapter().setNewList(list);
    }

    public void addItem(@NonNull IDrawerItem iDrawerItem) {
        this.mDrawerBuilder.getItemAdapter().add((IItem[])new IDrawerItem[]{iDrawerItem});
    }

    public void addItemAtPosition(@NonNull IDrawerItem iDrawerItem, int n) {
        this.mDrawerBuilder.getItemAdapter().add(n, (IItem[])new IDrawerItem[]{iDrawerItem});
    }

    public void addItems(IDrawerItem ... iDrawerItemArray) {
        this.mDrawerBuilder.getItemAdapter().add((IItem[])iDrawerItemArray);
    }

    public void addItemsAtPosition(int n, IDrawerItem ... iDrawerItemArray) {
        this.mDrawerBuilder.getItemAdapter().add(n, (IItem[])iDrawerItemArray);
    }

    public void addStickyFooterItem(@NonNull IDrawerItem iDrawerItem) {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        if (drawerBuilder.mStickyDrawerItems == null) {
            drawerBuilder.mStickyDrawerItems = new ArrayList();
        }
        this.mDrawerBuilder.mStickyDrawerItems.add((Object)iDrawerItem);
        DrawerUtils.rebuildStickyFooterView(this.mDrawerBuilder);
    }

    public void addStickyFooterItemAtPosition(@NonNull IDrawerItem iDrawerItem, int n) {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        if (drawerBuilder.mStickyDrawerItems == null) {
            drawerBuilder.mStickyDrawerItems = new ArrayList();
        }
        this.mDrawerBuilder.mStickyDrawerItems.add(n, (Object)iDrawerItem);
        DrawerUtils.rebuildStickyFooterView(this.mDrawerBuilder);
    }

    public void closeDrawer() {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        DrawerLayout drawerLayout = drawerBuilder.mDrawerLayout;
        if (drawerLayout != null) {
            drawerLayout.closeDrawer(drawerBuilder.mDrawerGravity.intValue());
        }
    }

    public void deselect() {
        this.getAdapter().deselect();
    }

    public void deselect(long l) {
        this.getAdapter().deselect(this.getPosition(l));
    }

    public ActionBarDrawerToggle getActionBarDrawerToggle() {
        return this.mDrawerBuilder.mActionBarDrawerToggle;
    }

    public FastAdapter<IDrawerItem> getAdapter() {
        return this.mDrawerBuilder.mAdapter;
    }

    public FrameLayout getContent() {
        DrawerLayout drawerLayout;
        if (this.mContentView == null && (drawerLayout = this.mDrawerBuilder.mDrawerLayout) != null) {
            this.mContentView = (FrameLayout)drawerLayout.findViewById(R.id.content_layout);
        }
        return this.mContentView;
    }

    public int getCurrentSelectedPosition() {
        int n = this.mDrawerBuilder.mAdapter.getSelections().size() == 0 ? -1 : (Integer)this.mDrawerBuilder.mAdapter.getSelections().iterator().next();
        return n;
    }

    public long getCurrentSelection() {
        IDrawerItem iDrawerItem = this.mDrawerBuilder.getDrawerItem(this.getCurrentSelectedPosition());
        if (iDrawerItem != null) {
            return iDrawerItem.getIdentifier();
        }
        return -1L;
    }

    public int getCurrentStickyFooterSelectedPosition() {
        return this.mDrawerBuilder.mCurrentStickyFooterSelection;
    }

    public DrawerBuilder getDrawerBuilder() {
        return this.mDrawerBuilder;
    }

    public IDrawerItem getDrawerItem(long l) {
        return (IDrawerItem)this.getAdapter().getItem(this.getPosition(l));
    }

    public IDrawerItem getDrawerItem(Object object) {
        return DrawerUtils.getDrawerItem(this.getDrawerItems(), object);
    }

    public List<IDrawerItem> getDrawerItems() {
        return this.mDrawerBuilder.getItemAdapter().getAdapterItems();
    }

    public DrawerLayout getDrawerLayout() {
        return this.mDrawerBuilder.mDrawerLayout;
    }

    public View getFooter() {
        return this.mDrawerBuilder.mFooterView;
    }

    public FooterAdapter<IDrawerItem> getFooterAdapter() {
        return this.mDrawerBuilder.mFooterAdapter;
    }

    public View getHeader() {
        return this.mDrawerBuilder.mHeaderView;
    }

    public HeaderAdapter<IDrawerItem> getHeaderAdapter() {
        return this.mDrawerBuilder.mHeaderAdapter;
    }

    public ItemAdapter<IDrawerItem> getItemAdapter() {
        return this.mDrawerBuilder.mItemAdapter;
    }

    public Materialize getMaterialize() {
        return this.mDrawerBuilder.mMaterialize;
    }

    public MiniDrawer getMiniDrawer() {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        if (drawerBuilder.mMiniDrawer == null) {
            drawerBuilder.mMiniDrawer = new MiniDrawer().withDrawer(this).withAccountHeader(this.mDrawerBuilder.mAccountHeader).withPositionBasedStateManagement(this.mDrawerBuilder.mPositionBasedStateManagement);
        }
        return this.mDrawerBuilder.mMiniDrawer;
    }

    public OnDrawerItemClickListener getOnDrawerItemClickListener() {
        return this.mDrawerBuilder.mOnDrawerItemClickListener;
    }

    public OnDrawerItemLongClickListener getOnDrawerItemLongClickListener() {
        return this.mDrawerBuilder.mOnDrawerItemLongClickListener;
    }

    public OnDrawerNavigationListener getOnDrawerNavigationListener() {
        return this.mDrawerBuilder.mOnDrawerNavigationListener;
    }

    public List<IDrawerItem> getOriginalDrawerItems() {
        return this.originalDrawerItems;
    }

    public int getPosition(long l) {
        return DrawerUtils.getPositionByIdentifier(this.mDrawerBuilder, l);
    }

    public int getPosition(@NonNull IDrawerItem iDrawerItem) {
        return this.getPosition(iDrawerItem.getIdentifier());
    }

    public RecyclerView getRecyclerView() {
        return this.mDrawerBuilder.mRecyclerView;
    }

    public ScrimInsetsRelativeLayout getSlider() {
        return this.mDrawerBuilder.mSliderLayout;
    }

    public View getStickyFooter() {
        return this.mDrawerBuilder.mStickyFooterView;
    }

    public int getStickyFooterPosition(long l) {
        return DrawerUtils.getStickyFooterPositionByIdentifier(this.mDrawerBuilder, l);
    }

    public int getStickyFooterPosition(@NonNull IDrawerItem iDrawerItem) {
        return this.getStickyFooterPosition(iDrawerItem.getIdentifier());
    }

    public View getStickyHeader() {
        return this.mDrawerBuilder.mStickyHeaderView;
    }

    public boolean isDrawerOpen() {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        DrawerLayout drawerLayout = drawerBuilder.mDrawerLayout;
        if (drawerLayout != null && drawerBuilder.mSliderLayout != null) {
            return drawerLayout.isDrawerOpen(drawerBuilder.mDrawerGravity.intValue());
        }
        return false;
    }

    public void openDrawer() {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        DrawerLayout drawerLayout = drawerBuilder.mDrawerLayout;
        if (drawerLayout != null && drawerBuilder.mSliderLayout != null) {
            drawerLayout.openDrawer(drawerBuilder.mDrawerGravity.intValue());
        }
    }

    public void removeAllItems() {
        this.mDrawerBuilder.getItemAdapter().clear();
    }

    public void removeAllStickyFooterItems() {
        ViewGroup viewGroup = this.mDrawerBuilder.mStickyDrawerItems;
        if (viewGroup != null) {
            viewGroup.clear();
        }
        if ((viewGroup = this.mDrawerBuilder.mStickyFooterView) != null) {
            viewGroup.setVisibility(8);
        }
    }

    public void removeHeader() {
        this.mDrawerBuilder.getHeaderAdapter().clear();
    }

    public void removeItem(long l) {
        int n = this.getPosition(l);
        if (this.mDrawerBuilder.checkDrawerItem(n, false)) {
            this.mDrawerBuilder.getItemAdapter().remove(n);
        }
    }

    public void removeItemByPosition(int n) {
        if (this.mDrawerBuilder.checkDrawerItem(n, false)) {
            this.mDrawerBuilder.getItemAdapter().remove(n);
        }
    }

    public void removeItems(long ... lArray) {
        if (lArray != null) {
            int n = lArray.length;
            for (int i = 0; i < n; ++i) {
                this.removeItem(lArray[i]);
            }
        }
    }

    public void removeStickyFooterItemAtPosition(int n) {
        List<IDrawerItem> list = this.mDrawerBuilder.mStickyDrawerItems;
        if (list != null && list.size() > n) {
            this.mDrawerBuilder.mStickyDrawerItems.remove(n);
        }
        DrawerUtils.rebuildStickyFooterView(this.mDrawerBuilder);
    }

    public void resetDrawerContent() {
        if (this.switchedDrawerContent()) {
            Object object;
            this.setOnDrawerItemClickListener(this.originalOnDrawerItemClickListener);
            this.setOnDrawerItemLongClickListener(this.originalOnDrawerItemLongClickListener);
            this.setItems(this.originalDrawerItems, true);
            this.getAdapter().withSavedInstanceState(this.originalDrawerState);
            this.originalOnDrawerItemClickListener = null;
            this.originalOnDrawerItemLongClickListener = null;
            this.originalDrawerItems = null;
            this.originalDrawerState = null;
            this.mDrawerBuilder.mRecyclerView.smoothScrollToPosition(0);
            if (this.getStickyFooter() != null) {
                this.getStickyFooter().setVisibility(0);
            }
            if (this.getStickyFooterShadow() != null) {
                this.getStickyFooterShadow().setVisibility(0);
            }
            if ((object = this.mDrawerBuilder.mAccountHeader) != null && (object = ((AccountHeader)object).mAccountHeaderBuilder) != null) {
                ((AccountHeaderBuilder)object).mSelectionListShown = false;
            }
        }
    }

    public Bundle saveInstanceState(Bundle bundle) {
        Object object = bundle;
        if (bundle != null) {
            object = this.mDrawerBuilder;
            if (!object.mAppended) {
                object = object.mAdapter.saveInstanceState(bundle, BUNDLE_SELECTION);
                object.putInt(BUNDLE_STICKY_FOOTER_SELECTION, this.mDrawerBuilder.mCurrentStickyFooterSelection);
                object.putBoolean(BUNDLE_DRAWER_CONTENT_SWITCHED, this.switchedDrawerContent());
            } else {
                object = object.mAdapter.saveInstanceState(bundle, BUNDLE_SELECTION_APPENDED);
                object.putInt(BUNDLE_STICKY_FOOTER_SELECTION_APPENDED, this.mDrawerBuilder.mCurrentStickyFooterSelection);
                object.putBoolean(BUNDLE_DRAWER_CONTENT_SWITCHED_APPENDED, this.switchedDrawerContent());
            }
        }
        return object;
    }

    public void setActionBarDrawerToggle(@NonNull ActionBarDrawerToggle actionBarDrawerToggle) {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        drawerBuilder.mActionBarDrawerToggleEnabled = true;
        drawerBuilder.mActionBarDrawerToggle = actionBarDrawerToggle;
        drawerBuilder.handleDrawerNavigation(null, false);
    }

    public void setFullscreen(boolean bl) {
        Materialize materialize = this.mDrawerBuilder.mMaterialize;
        if (materialize != null) {
            materialize.setFullscreen(bl);
        }
    }

    public void setGravity(int n) {
        DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams)this.getSlider().getLayoutParams();
        layoutParams.gravity = n;
        this.getSlider().setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.mDrawerBuilder.mDrawerGravity = n;
    }

    public void setHeader(@NonNull View view) {
        this.setHeader(view, true, true);
    }

    public void setHeader(@NonNull View view, boolean bl) {
        this.setHeader(view, true, bl);
    }

    public void setHeader(@NonNull View view, boolean bl, boolean bl2) {
        this.setHeader(view, bl, bl2, null);
    }

    public void setHeader(@NonNull View view, boolean bl, boolean bl2, DimenHolder dimenHolder) {
        this.mDrawerBuilder.getHeaderAdapter().clear();
        if (bl) {
            this.mDrawerBuilder.getHeaderAdapter().add((IItem[])new IDrawerItem[]{new ContainerDrawerItem().withView(view).withDivider(bl2).withHeight(dimenHolder).withViewPosition(ContainerDrawerItem.Position.TOP)});
        } else {
            this.mDrawerBuilder.getHeaderAdapter().add((IItem[])new IDrawerItem[]{new ContainerDrawerItem().withView(view).withDivider(bl2).withHeight(dimenHolder).withViewPosition(ContainerDrawerItem.Position.NONE)});
        }
        view = this.mDrawerBuilder.mRecyclerView;
        view.setPadding(view.getPaddingLeft(), 0, this.mDrawerBuilder.mRecyclerView.getPaddingRight(), this.mDrawerBuilder.mRecyclerView.getPaddingBottom());
    }

    public void setItemAtPosition(@NonNull IDrawerItem iDrawerItem, int n) {
        this.mDrawerBuilder.getItemAdapter().add(n, (IItem[])new IDrawerItem[]{iDrawerItem});
    }

    public void setItems(@NonNull List<IDrawerItem> list) {
        this.setItems(list, false);
    }

    public void setOnDrawerItemClickListener(OnDrawerItemClickListener onDrawerItemClickListener) {
        this.mDrawerBuilder.mOnDrawerItemClickListener = onDrawerItemClickListener;
    }

    public void setOnDrawerItemLongClickListener(OnDrawerItemLongClickListener onDrawerItemLongClickListener) {
        this.mDrawerBuilder.mOnDrawerItemLongClickListener = onDrawerItemLongClickListener;
    }

    public void setOnDrawerNavigationListener(OnDrawerNavigationListener onDrawerNavigationListener) {
        this.mDrawerBuilder.mOnDrawerNavigationListener = onDrawerNavigationListener;
    }

    public boolean setSelection(long l) {
        return this.setSelectionAtPosition(this.getPosition(l), true);
    }

    public boolean setSelection(long l, boolean bl) {
        return this.setSelectionAtPosition(this.getPosition(l), bl);
    }

    public boolean setSelection(@NonNull IDrawerItem iDrawerItem) {
        return this.setSelectionAtPosition(this.getPosition(iDrawerItem), true);
    }

    public boolean setSelection(@NonNull IDrawerItem iDrawerItem, boolean bl) {
        return this.setSelectionAtPosition(this.getPosition(iDrawerItem), bl);
    }

    public boolean setSelectionAtPosition(int n) {
        return this.setSelectionAtPosition(n, true);
    }

    public boolean setSelectionAtPosition(int n, boolean bl) {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        if (drawerBuilder.mRecyclerView != null) {
            drawerBuilder.mAdapter.deselect();
            this.mDrawerBuilder.mAdapter.select(n, false);
            if (bl && n >= 0) {
                Object object;
                drawerBuilder = (IDrawerItem)this.mDrawerBuilder.mAdapter.getItem(n);
                if (drawerBuilder instanceof AbstractDrawerItem && (object = (AbstractDrawerItem)drawerBuilder).getOnDrawerItemClickListener() != null) {
                    object.getOnDrawerItemClickListener().onItemClick(null, n, (IDrawerItem)drawerBuilder);
                }
                if ((object = this.mDrawerBuilder.mOnDrawerItemClickListener) != null) {
                    object.onItemClick(null, n, (IDrawerItem)drawerBuilder);
                }
            }
            this.mDrawerBuilder.resetStickyFooterSelection();
        }
        return false;
    }

    public void setStickyFooterItemAtPosition(@NonNull IDrawerItem iDrawerItem, int n) {
        List<IDrawerItem> list = this.mDrawerBuilder.mStickyDrawerItems;
        if (list != null && list.size() > n) {
            this.mDrawerBuilder.mStickyDrawerItems.set(n, (Object)iDrawerItem);
        }
        DrawerUtils.rebuildStickyFooterView(this.mDrawerBuilder);
    }

    public void setStickyFooterSelection(long l, boolean bl) {
        this.setStickyFooterSelectionAtPosition(this.getStickyFooterPosition(l), bl);
    }

    public void setStickyFooterSelectionAtPosition(int n) {
        this.setStickyFooterSelectionAtPosition(n, true);
    }

    public void setStickyFooterSelectionAtPosition(int n, boolean bl) {
        DrawerUtils.setStickyFooterSelection(this.mDrawerBuilder, n, bl);
    }

    public void setToolbar(@NonNull Activity activity, @NonNull Toolbar toolbar) {
        this.setToolbar(activity, toolbar, false);
    }

    public void setToolbar(@NonNull Activity activity, @NonNull Toolbar toolbar, boolean bl) {
        DrawerBuilder drawerBuilder = this.mDrawerBuilder;
        drawerBuilder.mToolbar = toolbar;
        drawerBuilder.handleDrawerNavigation(activity, bl);
    }

    public void switchDrawerContent(@NonNull OnDrawerItemClickListener onDrawerItemClickListener, OnDrawerItemLongClickListener onDrawerItemLongClickListener, @NonNull List<IDrawerItem> list, int n) {
        if (!this.switchedDrawerContent()) {
            this.originalOnDrawerItemClickListener = this.getOnDrawerItemClickListener();
            this.originalOnDrawerItemLongClickListener = this.getOnDrawerItemLongClickListener();
            this.originalDrawerState = this.getAdapter().saveInstanceState(new Bundle());
            this.getAdapter().collapse(false);
            this.originalDrawerItems = this.getDrawerItems();
        }
        this.setOnDrawerItemClickListener(onDrawerItemClickListener);
        this.setOnDrawerItemLongClickListener(onDrawerItemLongClickListener);
        this.setItems(list, true);
        this.setSelectionAtPosition(n, false);
        if (!this.mDrawerBuilder.mKeepStickyItemsVisible) {
            if (this.getStickyFooter() != null) {
                this.getStickyFooter().setVisibility(8);
            }
            if (this.getStickyFooterShadow() != null) {
                this.getStickyFooterShadow().setVisibility(8);
            }
        }
    }

    public boolean switchedDrawerContent() {
        boolean bl = this.originalOnDrawerItemClickListener != null || this.originalDrawerItems != null || this.originalDrawerState != null;
        return bl;
    }

    public void updateBadge(long l, StringHolder stringHolder) {
        Object object = this.getDrawerItem(l);
        if (object instanceof Badgeable) {
            object = (Badgeable)object;
            object.withBadge(stringHolder);
            this.updateItem((IDrawerItem)object);
        }
    }

    public void updateIcon(long l, ImageHolder imageHolder) {
        Object object = this.getDrawerItem(l);
        if (object instanceof Iconable) {
            object = (Iconable)object;
            object.withIcon(imageHolder);
            this.updateItem((IDrawerItem)object);
        }
    }

    public void updateItem(@NonNull IDrawerItem iDrawerItem) {
        this.updateItemAtPosition(iDrawerItem, this.getPosition(iDrawerItem));
    }

    public void updateItemAtPosition(@NonNull IDrawerItem iDrawerItem, int n) {
        if (this.mDrawerBuilder.checkDrawerItem(n, false)) {
            this.mDrawerBuilder.getItemAdapter().set(n, (IItem)iDrawerItem);
        }
    }

    public void updateName(long l, StringHolder stringHolder) {
        Object object = this.getDrawerItem(l);
        if (object instanceof Nameable) {
            object = (Nameable)object;
            object.withName(stringHolder);
            this.updateItem((IDrawerItem)object);
        }
    }

    public void updateStickyFooterItem(@NonNull IDrawerItem iDrawerItem) {
        this.updateStickyFooterItemAtPosition(iDrawerItem, this.getStickyFooterPosition(iDrawerItem));
    }

    public void updateStickyFooterItemAtPosition(@NonNull IDrawerItem iDrawerItem, int n) {
        List<IDrawerItem> list = this.mDrawerBuilder.mStickyDrawerItems;
        if (list != null && list.size() > n) {
            this.mDrawerBuilder.mStickyDrawerItems.set(n, (Object)iDrawerItem);
        }
        DrawerUtils.rebuildStickyFooterView(this.mDrawerBuilder);
    }

    public static interface OnDrawerItemClickListener {
        public boolean onItemClick(View var1, int var2, IDrawerItem var3);
    }

    public static interface OnDrawerItemLongClickListener {
        public boolean onItemLongClick(View var1, int var2, IDrawerItem var3);
    }

    public static interface OnDrawerItemSelectedListener {
        public void onItemSelected(AdapterView<?> var1, View var2, int var3, long var4, IDrawerItem var6);

        public void onNothingSelected(AdapterView<?> var1);
    }

    public static interface OnDrawerListener {
        public void onDrawerClosed(View var1);

        public void onDrawerOpened(View var1);

        public void onDrawerSlide(View var1, float var2);
    }

    public static interface OnDrawerNavigationListener {
        public boolean onNavigationClickListener(View var1);
    }
}

