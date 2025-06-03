/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.recyclerview.widget.DefaultItemAnimator
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.mikepenz.fastadapter.FastAdapter
 *  com.mikepenz.fastadapter.IItem
 *  com.mikepenz.fastadapter.adapters.ItemAdapter
 *  com.mikepenz.materialdrawer.MiniDrawer$1
 *  com.mikepenz.materialdrawer.model.MiniDrawerItem
 *  com.mikepenz.materialdrawer.model.MiniProfileDrawerItem
 *  com.mikepenz.materialdrawer.model.PrimaryDrawerItem
 *  com.mikepenz.materialdrawer.model.ProfileDrawerItem
 *  com.mikepenz.materialdrawer.model.SecondaryDrawerItem
 *  com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.materialdrawer;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerUtils;
import com.mikepenz.materialdrawer.MiniDrawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.interfaces.ICrossfader;
import com.mikepenz.materialdrawer.model.MiniDrawerItem;
import com.mikepenz.materialdrawer.model.MiniProfileDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class MiniDrawer {
    public static final int ITEM = 2;
    public static final int PROFILE = 1;
    private AccountHeader mAccountHeader;
    public FastAdapter<IDrawerItem> mAdapter;
    private LinearLayout mContainer;
    private ICrossfader mCrossFader;
    private Drawer mDrawer;
    private boolean mEnableProfileClick = true;
    private boolean mEnableSelectedMiniDrawerItemBackground = false;
    private boolean mInRTL = false;
    private boolean mIncludeSecondaryDrawerItems = false;
    private boolean mInnerShadow = false;
    public ItemAdapter<IDrawerItem> mItemAdapter;
    private OnMiniDrawerItemClickListener mOnMiniDrawerItemClickListener;
    private FastAdapter.OnLongClickListener<IDrawerItem> mOnMiniDrawerItemLongClickListener;
    private FastAdapter.OnClickListener<IDrawerItem> mOnMiniDrawerItemOnClickListener;
    public boolean mPositionBasedStateManagement = true;
    private RecyclerView mRecyclerView;

    public static /* synthetic */ OnMiniDrawerItemClickListener access$000(MiniDrawer miniDrawer) {
        return miniDrawer.mOnMiniDrawerItemClickListener;
    }

    public static /* synthetic */ AccountHeader access$100(MiniDrawer miniDrawer) {
        return miniDrawer.mAccountHeader;
    }

    public static /* synthetic */ Drawer access$200(MiniDrawer miniDrawer) {
        return miniDrawer.mDrawer;
    }

    public static /* synthetic */ List access$300(MiniDrawer miniDrawer) {
        return miniDrawer.getDrawerItems();
    }

    public static /* synthetic */ ICrossfader access$400(MiniDrawer miniDrawer) {
        return miniDrawer.mCrossFader;
    }

    private List<IDrawerItem> getDrawerItems() {
        List<IDrawerItem> list = this.mDrawer.getOriginalDrawerItems() != null ? this.mDrawer.getOriginalDrawerItems() : this.mDrawer.getDrawerItems();
        return list;
    }

    public View build(Context context) {
        Object object;
        this.mContainer = object = new LinearLayout(context);
        if (this.mInnerShadow) {
            if (!this.mInRTL) {
                object.setBackgroundResource(R.drawable.material_drawer_shadow_left);
            } else {
                object.setBackgroundResource(R.drawable.material_drawer_shadow_right);
            }
        }
        object = new RecyclerView(context);
        this.mRecyclerView = object;
        this.mContainer.addView((View)object, -1, -1);
        this.mRecyclerView.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        this.mRecyclerView.setFadingEdgeLength(0);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(context));
        this.mAdapter = new FastAdapter();
        this.mItemAdapter = new ItemAdapter();
        this.mAdapter.withSelectable(true);
        this.mAdapter.withAllowDeselection(false);
        this.mAdapter.withPositionBasedStateManagement(this.mPositionBasedStateManagement);
        this.mRecyclerView.setAdapter((RecyclerView.Adapter)this.mItemAdapter.wrap(this.mAdapter));
        object = this.mDrawer;
        if (object != null && (object = object.mDrawerBuilder) != null && (object.mFullscreen || object.mTranslucentStatusBar)) {
            object = this.mRecyclerView;
            object.setPadding(object.getPaddingLeft(), UIUtils.getStatusBarHeight(context), this.mRecyclerView.getPaddingRight(), this.mRecyclerView.getPaddingBottom());
        }
        if ((object = this.mDrawer) != null && (object = object.mDrawerBuilder) != null && (object.mFullscreen || object.mTranslucentNavigationBar) && context.getResources().getConfiguration().orientation == 1) {
            object = this.mRecyclerView;
            object.setPadding(object.getPaddingLeft(), this.mRecyclerView.getPaddingTop(), this.mRecyclerView.getPaddingRight(), UIUtils.getNavigationBarHeight(context));
        }
        this.createItems();
        return this.mContainer;
    }

    public void createItems() {
        int n;
        this.mItemAdapter.clear();
        Object object = this.mAccountHeader;
        if (object != null && ((AccountHeader)object).getAccountHeaderBuilder().mProfileImagesVisible && (object = this.mAccountHeader.getActiveProfile()) instanceof IDrawerItem) {
            this.mItemAdapter.add((IItem[])new IDrawerItem[]{this.generateMiniDrawerItem((IDrawerItem)object)});
            n = 1;
        } else {
            n = 0;
        }
        int n2 = -1;
        if (this.mDrawer != null && this.getDrawerItems() != null) {
            int n3 = this.getDrawerItems().size();
            int n4 = 0;
            for (int i = 0; i < n3; ++i) {
                object = this.generateMiniDrawerItem((IDrawerItem)this.getDrawerItems().get(i));
                int n5 = n2;
                int n6 = n4;
                if (object != null) {
                    if (object.isSelected()) {
                        n2 = n4;
                    }
                    this.mItemAdapter.add((IItem[])new IDrawerItem[]{object});
                    n6 = n4 + 1;
                    n5 = n2;
                }
                n2 = n5;
                n4 = n6;
            }
            if (n2 >= 0) {
                this.mAdapter.select(n2 + n);
            }
        }
        if ((object = this.mOnMiniDrawerItemOnClickListener) != null) {
            this.mAdapter.withOnClickListener((FastAdapter.OnClickListener)object);
        } else {
            this.mAdapter.withOnClickListener((FastAdapter.OnClickListener)new 1(this));
        }
        this.mAdapter.withOnLongClickListener(this.mOnMiniDrawerItemLongClickListener);
        this.mRecyclerView.scrollToPosition(0);
    }

    public IDrawerItem generateMiniDrawerItem(IDrawerItem iDrawerItem) {
        boolean bl = iDrawerItem instanceof SecondaryDrawerItem;
        MiniDrawerItem miniDrawerItem = null;
        if (bl) {
            if (this.mIncludeSecondaryDrawerItems) {
                miniDrawerItem = new MiniDrawerItem((SecondaryDrawerItem)iDrawerItem).withEnableSelectedBackground(this.mEnableSelectedMiniDrawerItemBackground);
            }
            return miniDrawerItem;
        }
        if (iDrawerItem instanceof PrimaryDrawerItem) {
            return new MiniDrawerItem((PrimaryDrawerItem)iDrawerItem).withEnableSelectedBackground(this.mEnableSelectedMiniDrawerItemBackground);
        }
        if (iDrawerItem instanceof ProfileDrawerItem) {
            iDrawerItem = new MiniProfileDrawerItem((ProfileDrawerItem)iDrawerItem);
            iDrawerItem.withEnabled(this.mEnableProfileClick);
            return iDrawerItem;
        }
        return null;
    }

    public AccountHeader getAccountHeader() {
        return this.mAccountHeader;
    }

    public FastAdapter<IDrawerItem> getAdapter() {
        return this.mAdapter;
    }

    public ICrossfader getCrossFader() {
        return this.mCrossFader;
    }

    public Drawer getDrawer() {
        return this.mDrawer;
    }

    public ItemAdapter<IDrawerItem> getItemAdapter() {
        return this.mItemAdapter;
    }

    public int getMiniDrawerType(IDrawerItem iDrawerItem) {
        if (iDrawerItem instanceof MiniProfileDrawerItem) {
            return 1;
        }
        if (iDrawerItem instanceof MiniDrawerItem) {
            return 2;
        }
        return -1;
    }

    public FastAdapter.OnLongClickListener getOnMiniDrawerItemLongClickListener() {
        return this.mOnMiniDrawerItemLongClickListener;
    }

    public FastAdapter.OnClickListener getOnMiniDrawerItemOnClickListener() {
        return this.mOnMiniDrawerItemOnClickListener;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public boolean onItemClick(IDrawerItem iDrawerItem) {
        if (iDrawerItem.isSelectable()) {
            ICrossfader iCrossfader = this.mCrossFader;
            if (iCrossfader != null && iCrossfader.isCrossfaded()) {
                this.mCrossFader.crossfade();
            }
            this.setSelection(iDrawerItem.getIdentifier());
            return false;
        }
        return true;
    }

    public void onProfileClick() {
        Object object = this.mCrossFader;
        if (object != null && object.isCrossfaded()) {
            this.mCrossFader.crossfade();
        }
        if ((object = this.mAccountHeader) != null && (object = ((AccountHeader)object).getActiveProfile()) instanceof IDrawerItem) {
            this.mItemAdapter.set(0, (IItem)this.generateMiniDrawerItem((IDrawerItem)object));
        }
    }

    public void setSelection(long l) {
        int n = this.mAdapter.getItemCount();
        for (int i = 0; i < n; ++i) {
            IDrawerItem iDrawerItem = (IDrawerItem)this.mAdapter.getItem(i);
            if (iDrawerItem.getIdentifier() != l || iDrawerItem.isSelected()) continue;
            this.mAdapter.deselect();
            this.mAdapter.select(i);
        }
    }

    public void updateItem(long l) {
        if (this.mDrawer != null && this.mAdapter != null && this.mItemAdapter.getAdapterItems() != null && l != -1L) {
            IDrawerItem iDrawerItem = DrawerUtils.getDrawerItem(this.getDrawerItems(), l);
            for (int i = 0; i < this.mItemAdapter.getAdapterItems().size(); ++i) {
                IDrawerItem iDrawerItem2;
                if (((IDrawerItem)this.mItemAdapter.getAdapterItems().get(i)).getIdentifier() != iDrawerItem.getIdentifier() || (iDrawerItem2 = this.generateMiniDrawerItem(iDrawerItem)) == null) continue;
                this.mItemAdapter.set(i, (IItem)iDrawerItem2);
            }
        }
    }

    public MiniDrawer withAccountHeader(@NonNull AccountHeader accountHeader) {
        this.mAccountHeader = accountHeader;
        return this;
    }

    public MiniDrawer withCrossFader(@NonNull ICrossfader iCrossfader) {
        this.mCrossFader = iCrossfader;
        return this;
    }

    public MiniDrawer withDrawer(@NonNull Drawer drawer) {
        this.mDrawer = drawer;
        return this;
    }

    public MiniDrawer withEnableProfileClick(boolean bl) {
        this.mEnableProfileClick = bl;
        return this;
    }

    public MiniDrawer withEnableSelectedMiniDrawerItemBackground(boolean bl) {
        this.mEnableSelectedMiniDrawerItemBackground = bl;
        return this;
    }

    public MiniDrawer withInRTL(boolean bl) {
        this.mInRTL = bl;
        return this;
    }

    public MiniDrawer withIncludeSecondaryDrawerItems(boolean bl) {
        this.mIncludeSecondaryDrawerItems = bl;
        return this;
    }

    public MiniDrawer withInnerShadow(boolean bl) {
        this.mInnerShadow = bl;
        return this;
    }

    public MiniDrawer withOnMiniDrawerItemClickListener(OnMiniDrawerItemClickListener onMiniDrawerItemClickListener) {
        this.mOnMiniDrawerItemClickListener = onMiniDrawerItemClickListener;
        return this;
    }

    public MiniDrawer withOnMiniDrawerItemLongClickListener(FastAdapter.OnLongClickListener<IDrawerItem> onLongClickListener) {
        this.mOnMiniDrawerItemLongClickListener = onLongClickListener;
        return this;
    }

    public MiniDrawer withOnMiniDrawerItemOnClickListener(FastAdapter.OnClickListener<IDrawerItem> onClickListener) {
        this.mOnMiniDrawerItemOnClickListener = onClickListener;
        return this;
    }

    public MiniDrawer withPositionBasedStateManagement(boolean bl) {
        this.mPositionBasedStateManagement = bl;
        return this;
    }

    public static interface OnMiniDrawerItemClickListener {
        public boolean onItemClick(View var1, int var2, IDrawerItem var3, int var4);
    }
}

