/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout$LayoutParams
 *  androidx.drawerlayout.widget.DrawerLayout$LayoutParams
 *  com.mikepenz.fastadapter.IItem
 *  com.mikepenz.materialdrawer.model.AbstractDrawerItem
 *  com.mikepenz.materialdrawer.model.ContainerDrawerItem
 *  com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.util.List
 */
package com.mikepenz.materialdrawer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.ContainerDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Selectable;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

class DrawerUtils {
    private static void addStickyFooterDivider(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setMinimumHeight((int)UIUtils.convertDpToPixel(1.0f, context));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes(context, R.attr.material_drawer_divider, R.color.material_drawer_divider));
        viewGroup.addView((View)linearLayout, (ViewGroup.LayoutParams)layoutParams);
    }

    public static ViewGroup buildStickyDrawerItemFooter(Context context, DrawerBuilder drawerBuilder, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes(context, R.attr.material_drawer_background, R.color.material_drawer_background));
        if (drawerBuilder.mStickyFooterDivider) {
            DrawerUtils.addStickyFooterDivider(context, (ViewGroup)linearLayout);
        }
        DrawerUtils.fillStickyDrawerItemFooter(drawerBuilder, (ViewGroup)linearLayout, onClickListener);
        return linearLayout;
    }

    public static void fillStickyDrawerItemFooter(DrawerBuilder drawerBuilder, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        for (IDrawerItem iDrawerItem : drawerBuilder.mStickyDrawerItems) {
            drawerBuilder = iDrawerItem.generateView(viewGroup.getContext(), viewGroup);
            drawerBuilder.setTag(iDrawerItem);
            if (iDrawerItem.isEnabled()) {
                drawerBuilder.setOnClickListener(onClickListener);
            }
            viewGroup.addView((View)drawerBuilder);
            DrawerUIUtils.setDrawerVerticalPadding((View)drawerBuilder);
        }
        viewGroup.setPadding(0, 0, 0, 0);
    }

    public static IDrawerItem getDrawerItem(List<IDrawerItem> iterator, long l) {
        if (l >= 0L) {
            for (IDrawerItem iDrawerItem : iterator) {
                if (iDrawerItem.getIdentifier() != l) continue;
                return iDrawerItem;
            }
        }
        return null;
    }

    public static IDrawerItem getDrawerItem(List<IDrawerItem> iDrawerItem2, Object object) {
        if (object != null) {
            for (IDrawerItem iDrawerItem2 : iDrawerItem2) {
                if (!object.equals(iDrawerItem2.getTag())) continue;
                return iDrawerItem2;
            }
        }
        return null;
    }

    public static int getPositionByIdentifier(DrawerBuilder drawerBuilder, long l) {
        if (l >= 0L) {
            for (int i = 0; i < drawerBuilder.getAdapter().getItemCount(); ++i) {
                if (((IDrawerItem)drawerBuilder.getAdapter().getItem(i)).getIdentifier() != l) continue;
                return i;
            }
        }
        return -1;
    }

    public static int getStickyFooterPositionByIdentifier(DrawerBuilder drawerBuilder, long l) {
        ViewGroup viewGroup;
        if (l >= 0L && (viewGroup = drawerBuilder.mStickyFooterView) != null && viewGroup instanceof LinearLayout) {
            viewGroup = (LinearLayout)viewGroup;
            int n = 0;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                Object object = viewGroup.getChildAt(i).getTag();
                int n2 = n;
                if (object == null) {
                    n2 = n;
                    if (drawerBuilder.mStickyFooterDivider) {
                        n2 = n + 1;
                    }
                }
                if (object != null && object instanceof IDrawerItem && ((IDrawerItem)object).getIdentifier() == l) {
                    return i - n2;
                }
                n = n2;
            }
        }
        return -1;
    }

    public static void handleFooterView(DrawerBuilder drawerBuilder, View.OnClickListener onClickListener) {
        Context context = drawerBuilder.mSliderLayout.getContext();
        ViewGroup viewGroup = drawerBuilder.mStickyDrawerItems;
        if (viewGroup != null && viewGroup.size() > 0) {
            drawerBuilder.mStickyFooterView = DrawerUtils.buildStickyDrawerItemFooter(context, drawerBuilder, onClickListener);
        }
        if (drawerBuilder.mStickyFooterView != null) {
            onClickListener = new RelativeLayout.LayoutParams(-1, -2);
            onClickListener.addRule(12, 1);
            viewGroup = drawerBuilder.mStickyFooterView;
            int n = R.id.material_drawer_sticky_footer;
            viewGroup.setId(n);
            drawerBuilder.mSliderLayout.addView((View)drawerBuilder.mStickyFooterView, (ViewGroup.LayoutParams)onClickListener);
            if (drawerBuilder.mTranslucentNavigationBar || drawerBuilder.mFullscreen) {
                drawerBuilder.mStickyFooterView.setPadding(0, 0, 0, UIUtils.getNavigationBarHeight(context));
            }
            onClickListener = (RelativeLayout.LayoutParams)drawerBuilder.mRecyclerView.getLayoutParams();
            onClickListener.addRule(2, n);
            drawerBuilder.mRecyclerView.setLayoutParams((ViewGroup.LayoutParams)onClickListener);
            if (drawerBuilder.mStickyFooterShadow) {
                onClickListener = new View(context);
                drawerBuilder.mStickyFooterShadowView = onClickListener;
                onClickListener.setBackgroundResource(R.drawable.material_drawer_shadow_top);
                drawerBuilder.mSliderLayout.addView(drawerBuilder.mStickyFooterShadowView, -1, context.getResources().getDimensionPixelSize(R.dimen.material_drawer_sticky_footer_elevation));
                onClickListener = (RelativeLayout.LayoutParams)drawerBuilder.mStickyFooterShadowView.getLayoutParams();
                onClickListener.addRule(2, n);
                drawerBuilder.mStickyFooterShadowView.setLayoutParams((ViewGroup.LayoutParams)onClickListener);
            }
            onClickListener = drawerBuilder.mRecyclerView;
            onClickListener.setPadding(onClickListener.getPaddingLeft(), drawerBuilder.mRecyclerView.getPaddingTop(), drawerBuilder.mRecyclerView.getPaddingRight(), context.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding));
        }
        if (drawerBuilder.mFooterView != null) {
            if (drawerBuilder.mRecyclerView != null) {
                if (drawerBuilder.mFooterDivider) {
                    drawerBuilder.getFooterAdapter().add((IItem[])new IDrawerItem[]{new ContainerDrawerItem().withView(drawerBuilder.mFooterView).withViewPosition(ContainerDrawerItem.Position.BOTTOM)});
                } else {
                    drawerBuilder.getFooterAdapter().add((IItem[])new IDrawerItem[]{new ContainerDrawerItem().withView(drawerBuilder.mFooterView).withViewPosition(ContainerDrawerItem.Position.NONE)});
                }
            } else {
                throw new RuntimeException("can't use a footerView without a recyclerView");
            }
        }
    }

    public static void handleHeaderView(DrawerBuilder drawerBuilder) {
        Object object = drawerBuilder.mAccountHeader;
        if (object != null) {
            if (drawerBuilder.mAccountHeaderSticky) {
                drawerBuilder.mStickyHeaderView = ((AccountHeader)object).getView();
            } else {
                drawerBuilder.mHeaderView = ((AccountHeader)object).getView();
                object = drawerBuilder.mAccountHeader.mAccountHeaderBuilder;
                drawerBuilder.mHeaderDivider = ((AccountHeaderBuilder)object).mDividerBelowHeader;
                drawerBuilder.mHeaderPadding = ((AccountHeaderBuilder)object).mPaddingBelowHeader;
            }
        }
        if (drawerBuilder.mStickyHeaderView != null) {
            object = new RelativeLayout.LayoutParams(-1, -2);
            object.addRule(10, 1);
            View view = drawerBuilder.mStickyHeaderView;
            int n = R.id.material_drawer_sticky_header;
            view.setId(n);
            drawerBuilder.mSliderLayout.addView(drawerBuilder.mStickyHeaderView, 0, (ViewGroup.LayoutParams)object);
            object = (RelativeLayout.LayoutParams)drawerBuilder.mRecyclerView.getLayoutParams();
            object.addRule(3, n);
            drawerBuilder.mRecyclerView.setLayoutParams((ViewGroup.LayoutParams)object);
            drawerBuilder.mStickyHeaderView.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes((Context)drawerBuilder.mActivity, R.attr.material_drawer_background, R.color.material_drawer_background));
            if (drawerBuilder.mStickyHeaderShadow) {
                drawerBuilder.mStickyHeaderView.setElevation(UIUtils.convertDpToPixel(4.0f, (Context)drawerBuilder.mActivity));
            }
            drawerBuilder.mRecyclerView.setPadding(0, 0, 0, 0);
        }
        if (drawerBuilder.mHeaderView != null) {
            if (drawerBuilder.mRecyclerView != null) {
                if (drawerBuilder.mHeaderPadding) {
                    drawerBuilder.getHeaderAdapter().add((IItem[])new IDrawerItem[]{new ContainerDrawerItem().withView(drawerBuilder.mHeaderView).withHeight(drawerBuilder.mHeiderHeight).withDivider(drawerBuilder.mHeaderDivider).withViewPosition(ContainerDrawerItem.Position.TOP)});
                } else {
                    drawerBuilder.getHeaderAdapter().add((IItem[])new IDrawerItem[]{new ContainerDrawerItem().withView(drawerBuilder.mHeaderView).withHeight(drawerBuilder.mHeiderHeight).withDivider(drawerBuilder.mHeaderDivider).withViewPosition(ContainerDrawerItem.Position.NONE)});
                }
                object = drawerBuilder.mRecyclerView;
                object.setPadding(object.getPaddingLeft(), 0, drawerBuilder.mRecyclerView.getPaddingRight(), drawerBuilder.mRecyclerView.getPaddingBottom());
            } else {
                throw new RuntimeException("can't use a headerView without a recyclerView");
            }
        }
    }

    public static void onFooterDrawerItemClick(DrawerBuilder drawerBuilder, IDrawerItem iDrawerItem, View view, Boolean object) {
        boolean bl = false;
        boolean bl2 = false;
        int n = iDrawerItem != null && iDrawerItem instanceof Selectable && !iDrawerItem.isSelectable() ? 0 : 1;
        if (n != 0) {
            drawerBuilder.resetStickyFooterSelection();
            view.setActivated(true);
            view.setSelected(true);
            drawerBuilder.getAdapter().deselect();
            ViewGroup viewGroup = drawerBuilder.mStickyFooterView;
            if (viewGroup != null && viewGroup instanceof LinearLayout) {
                viewGroup = (LinearLayout)viewGroup;
                for (n = 0; n < viewGroup.getChildCount(); ++n) {
                    if (viewGroup.getChildAt(n) != view) continue;
                    drawerBuilder.mCurrentStickyFooterSelection = n;
                    break;
                }
            }
        }
        if (object != null) {
            if (object.booleanValue()) {
                bl = bl2;
                if (iDrawerItem instanceof AbstractDrawerItem) {
                    object = (AbstractDrawerItem)iDrawerItem;
                    bl = bl2;
                    if (object.getOnDrawerItemClickListener() != null) {
                        bl = object.getOnDrawerItemClickListener().onItemClick(view, -1, iDrawerItem);
                    }
                }
                if ((object = drawerBuilder.mOnDrawerItemClickListener) != null) {
                    bl = object.onItemClick(view, -1, iDrawerItem);
                }
            }
            if (!bl) {
                drawerBuilder.closeDrawerDelayed();
            }
        }
    }

    public static DrawerLayout.LayoutParams processDrawerLayoutParams(DrawerBuilder drawerBuilder, DrawerLayout.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int n;
            Integer n2 = drawerBuilder.mDrawerGravity;
            if (n2 != null && (n2 == 5 || drawerBuilder.mDrawerGravity == 0x800005)) {
                layoutParams.rightMargin = 0;
                layoutParams.setMarginEnd(0);
                n2 = drawerBuilder.mActivity.getResources();
                n = R.dimen.material_drawer_margin;
                layoutParams.leftMargin = n2.getDimensionPixelSize(n);
                layoutParams.setMarginEnd(drawerBuilder.mActivity.getResources().getDimensionPixelSize(n));
            }
            layoutParams.width = (n = drawerBuilder.mDrawerWidth) > -1 ? n : DrawerUIUtils.getOptimalDrawerWidth((Context)drawerBuilder.mActivity);
        }
        return layoutParams;
    }

    public static void rebuildStickyFooterView(DrawerBuilder drawerBuilder) {
        if (drawerBuilder.mSliderLayout != null) {
            ViewGroup viewGroup = drawerBuilder.mStickyFooterView;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                if (drawerBuilder.mStickyFooterDivider) {
                    DrawerUtils.addStickyFooterDivider(drawerBuilder.mStickyFooterView.getContext(), drawerBuilder.mStickyFooterView);
                }
                DrawerUtils.fillStickyDrawerItemFooter(drawerBuilder, drawerBuilder.mStickyFooterView, new View.OnClickListener(drawerBuilder){
                    public final DrawerBuilder val$drawer;
                    {
                        this.val$drawer = drawerBuilder;
                    }

                    public void onClick(View view) {
                        IDrawerItem iDrawerItem = (IDrawerItem)view.getTag();
                        DrawerUtils.onFooterDrawerItemClick(this.val$drawer, iDrawerItem, view, Boolean.TRUE);
                    }
                });
                drawerBuilder.mStickyFooterView.setVisibility(0);
            } else {
                DrawerUtils.handleFooterView(drawerBuilder, new View.OnClickListener(drawerBuilder){
                    public final DrawerBuilder val$drawer;
                    {
                        this.val$drawer = drawerBuilder;
                    }

                    public void onClick(View view) {
                        IDrawerItem iDrawerItem = (IDrawerItem)view.getTag();
                        DrawerUtils.onFooterDrawerItemClick(this.val$drawer, iDrawerItem, view, Boolean.TRUE);
                    }
                });
            }
            DrawerUtils.setStickyFooterSelection(drawerBuilder, drawerBuilder.mCurrentStickyFooterSelection, Boolean.FALSE);
        }
    }

    public static void setStickyFooterSelection(DrawerBuilder drawerBuilder, int n, Boolean bl) {
        ViewGroup viewGroup;
        if (n > -1 && (viewGroup = drawerBuilder.mStickyFooterView) != null && viewGroup instanceof LinearLayout) {
            viewGroup = (LinearLayout)viewGroup;
            int n2 = n;
            if (drawerBuilder.mStickyFooterDivider) {
                n2 = n + 1;
            }
            if (viewGroup.getChildCount() > n2 && n2 >= 0) {
                DrawerUtils.onFooterDrawerItemClick(drawerBuilder, (IDrawerItem)viewGroup.getChildAt(n2).getTag(), viewGroup.getChildAt(n2), bl);
            }
        }
    }
}

