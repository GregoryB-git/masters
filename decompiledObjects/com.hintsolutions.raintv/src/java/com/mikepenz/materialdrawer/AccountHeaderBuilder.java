/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DimenRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.NonNull
 *  androidx.appcompat.content.res.AppCompatResources
 *  androidx.core.view.ViewCompat
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  com.mikepenz.materialdrawer.AccountHeaderBuilder$7
 *  com.mikepenz.materialdrawer.AccountHeaderBuilder$8
 *  com.mikepenz.materialdrawer.holder.ColorHolder
 *  com.mikepenz.materialdrawer.holder.DimenHolder
 *  com.mikepenz.materialdrawer.holder.ImageHolder
 *  com.mikepenz.materialdrawer.icons.MaterialDrawerFont$Icon
 *  com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
 *  com.mikepenz.materialdrawer.model.interfaces.IProfile
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Stack
 */
package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import com.mikepenz.fastadapter.IIdentifyable;
import com.mikepenz.fastadapter.utils.IdDistributor;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.holder.ImageHolder;
import com.mikepenz.materialdrawer.icons.MaterialDrawerFont;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialdrawer.view.BezelImageView;
import com.mikepenz.materialize.holder.StringHolder;
import com.mikepenz.materialize.util.UIUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class AccountHeaderBuilder {
    public View mAccountHeader;
    public ImageView mAccountHeaderBackground;
    public View mAccountHeaderContainer;
    public View mAccountHeaderTextSection;
    public int mAccountHeaderTextSectionBackgroundResource = -1;
    public ImageView mAccountSwitcherArrow;
    public Activity mActivity;
    public boolean mAlternativeProfileHeaderSwitching = false;
    public Boolean mCloseDrawerOnProfileListClick = null;
    public boolean mCompactStyle = false;
    public boolean mCurrentHiddenInList = false;
    public IProfile mCurrentProfile;
    public TextView mCurrentProfileEmail;
    public TextView mCurrentProfileName;
    public BezelImageView mCurrentProfileView;
    public boolean mDividerBelowHeader = true;
    public Drawer mDrawer;
    public Typeface mEmailTypeface;
    public ImageHolder mHeaderBackground;
    public ImageView.ScaleType mHeaderBackgroundScaleType = null;
    public DimenHolder mHeight;
    public Typeface mNameTypeface;
    public AccountHeader.OnAccountHeaderItemLongClickListener mOnAccountHeaderItemLongClickListener;
    public AccountHeader.OnAccountHeaderListener mOnAccountHeaderListener;
    public AccountHeader.OnAccountHeaderProfileImageListener mOnAccountHeaderProfileImageListener;
    public AccountHeader.OnAccountHeaderSelectionViewClickListener mOnAccountHeaderSelectionViewClickListener;
    public int mOnProfileClickDrawerCloseDelay = 100;
    public boolean mOnlyMainProfileImageVisible = false;
    public boolean mOnlySmallProfileImagesVisible = false;
    public boolean mPaddingBelowHeader = true;
    public IProfile mProfileFirst;
    public BezelImageView mProfileFirstView;
    public boolean mProfileImagesClickable = true;
    public boolean mProfileImagesVisible = true;
    public IProfile mProfileSecond;
    public BezelImageView mProfileSecondView;
    public IProfile mProfileThird;
    public BezelImageView mProfileThirdView;
    public List<IProfile> mProfiles;
    public boolean mResetDrawerOnProfileListClick = true;
    public Bundle mSavedInstance;
    public String mSelectionFirstLine;
    public boolean mSelectionFirstLineShown = true;
    public boolean mSelectionListEnabled = true;
    public boolean mSelectionListEnabledForSingleProfile = true;
    public boolean mSelectionListShown = false;
    public String mSelectionSecondLine;
    public boolean mSelectionSecondLineShown = true;
    public ColorHolder mTextColor;
    public boolean mThreeSmallProfileImages = false;
    public boolean mTranslucentStatusBar = true;
    public Typeface mTypeface;
    private View.OnClickListener onCurrentProfileClickListener = new View.OnClickListener(this){
        public final AccountHeaderBuilder this$0;
        {
            this.this$0 = accountHeaderBuilder;
        }

        public void onClick(View view) {
            this.this$0.onProfileImageClick(view, true);
        }
    };
    private View.OnLongClickListener onCurrentProfileLongClickListener;
    private Drawer.OnDrawerItemClickListener onDrawerItemClickListener;
    private Drawer.OnDrawerItemLongClickListener onDrawerItemLongClickListener;
    private View.OnClickListener onProfileClickListener = new View.OnClickListener(this){
        public final AccountHeaderBuilder this$0;
        {
            this.this$0 = accountHeaderBuilder;
        }

        public void onClick(View view) {
            this.this$0.onProfileImageClick(view, false);
        }
    };
    private View.OnLongClickListener onProfileLongClickListener;
    private View.OnClickListener onSelectionClickListener;

    public AccountHeaderBuilder() {
        this.onCurrentProfileLongClickListener = new View.OnLongClickListener(this){
            public final AccountHeaderBuilder this$0;
            {
                this.this$0 = accountHeaderBuilder;
            }

            public boolean onLongClick(View view) {
                if (this.this$0.mOnAccountHeaderProfileImageListener != null) {
                    IProfile iProfile = (IProfile)view.getTag(R.id.material_drawer_profile_header);
                    return this.this$0.mOnAccountHeaderProfileImageListener.onProfileImageLongClick(view, iProfile, true);
                }
                return false;
            }
        };
        this.onProfileLongClickListener = new View.OnLongClickListener(this){
            public final AccountHeaderBuilder this$0;
            {
                this.this$0 = accountHeaderBuilder;
            }

            public boolean onLongClick(View view) {
                if (this.this$0.mOnAccountHeaderProfileImageListener != null) {
                    IProfile iProfile = (IProfile)view.getTag(R.id.material_drawer_profile_header);
                    return this.this$0.mOnAccountHeaderProfileImageListener.onProfileImageLongClick(view, iProfile, false);
                }
                return false;
            }
        };
        this.onSelectionClickListener = new View.OnClickListener(this){
            public final AccountHeaderBuilder this$0;
            {
                this.this$0 = accountHeaderBuilder;
            }

            public void onClick(View view) {
                AccountHeader.OnAccountHeaderSelectionViewClickListener onAccountHeaderSelectionViewClickListener = this.this$0.mOnAccountHeaderSelectionViewClickListener;
                boolean bl = onAccountHeaderSelectionViewClickListener != null ? onAccountHeaderSelectionViewClickListener.onClick(view, (IProfile)view.getTag(R.id.material_drawer_profile_header)) : false;
                if (this.this$0.mAccountSwitcherArrow.getVisibility() == 0 && !bl) {
                    this.this$0.toggleSelectionList(view.getContext());
                }
            }
        };
        this.onDrawerItemClickListener = new 7(this);
        this.onDrawerItemLongClickListener = new 8(this);
    }

    public static /* synthetic */ void access$100(AccountHeaderBuilder accountHeaderBuilder, Context context) {
        accountHeaderBuilder.resetDrawerContent(context);
    }

    private void handleSelectionView(IProfile iProfile, boolean bl) {
        if (bl) {
            View view = this.mAccountHeaderContainer;
            ((FrameLayout)view).setForeground(AppCompatResources.getDrawable((Context)view.getContext(), (int)this.mAccountHeaderTextSectionBackgroundResource));
            this.mAccountHeaderContainer.setOnClickListener(this.onSelectionClickListener);
            this.mAccountHeaderContainer.setTag(R.id.material_drawer_profile_header, (Object)iProfile);
        } else {
            ((FrameLayout)this.mAccountHeaderContainer).setForeground(null);
            this.mAccountHeaderContainer.setOnClickListener(null);
        }
    }

    private void onProfileImageClick(View view, boolean bl) {
        IProfile iProfile = (IProfile)view.getTag(R.id.material_drawer_profile_header);
        AccountHeader.OnAccountHeaderProfileImageListener onAccountHeaderProfileImageListener = this.mOnAccountHeaderProfileImageListener;
        boolean bl2 = onAccountHeaderProfileImageListener != null ? onAccountHeaderProfileImageListener.onProfileImageClick(view, iProfile, bl) : false;
        if (!bl2) {
            this.onProfileClick(view, bl);
        }
    }

    private void resetDrawerContent(Context object) {
        object = this.mDrawer;
        if (object != null) {
            ((Drawer)object).resetDrawerContent();
        }
        this.mAccountSwitcherArrow.clearAnimation();
        ViewCompat.animate((View)this.mAccountSwitcherArrow).rotation(0.0f).start();
    }

    private void setHeaderHeight(int n) {
        View view = this.mAccountHeaderContainer;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams;
            if ((view = view.getLayoutParams()) != null) {
                view.height = n;
                this.mAccountHeaderContainer.setLayoutParams((ViewGroup.LayoutParams)view);
            }
            if ((view = this.mAccountHeaderContainer.findViewById(R.id.material_drawer_account_header)) != null) {
                layoutParams = view.getLayoutParams();
                layoutParams.height = n;
                view.setLayoutParams(layoutParams);
            }
            if ((view = this.mAccountHeaderContainer.findViewById(R.id.material_drawer_account_header_background)) != null) {
                layoutParams = view.getLayoutParams();
                layoutParams.height = n;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    private void setImageOrPlaceholder(ImageView imageView, ImageHolder imageHolder) {
        DrawerImageLoader.getInstance().cancelImage(imageView);
        DrawerImageLoader.IDrawerImageLoader iDrawerImageLoader = DrawerImageLoader.getInstance().getImageLoader();
        Context context = imageView.getContext();
        DrawerImageLoader.Tags tags = DrawerImageLoader.Tags.PROFILE;
        imageView.setImageDrawable(iDrawerImageLoader.placeholder(context, tags.name()));
        com.mikepenz.materialize.holder.ImageHolder.applyTo((com.mikepenz.materialize.holder.ImageHolder)imageHolder, imageView, tags.name());
    }

    public AccountHeaderBuilder addProfiles(IProfile ... iProfileArray) {
        if (this.mProfiles == null) {
            this.mProfiles = new ArrayList();
        }
        Collections.addAll(this.mProfiles, (Object[])IdDistributor.checkIds((IIdentifyable[])iProfileArray));
        return this;
    }

    public AccountHeader build() {
        if (this.mAccountHeaderContainer == null) {
            this.withAccountHeader(-1);
        }
        this.mAccountHeader = this.mAccountHeaderContainer.findViewById(R.id.material_drawer_account_header);
        int n = this.mActivity.getResources().getDimensionPixelSize(R.dimen.material_drawer_account_header_height);
        int n2 = UIUtils.getStatusBarHeight((Context)this.mActivity, true);
        DimenHolder dimenHolder = this.mHeight;
        int n3 = dimenHolder != null ? dimenHolder.asPixel((Context)this.mActivity) : (this.mCompactStyle ? this.mActivity.getResources().getDimensionPixelSize(R.dimen.material_drawer_account_header_height_compact) : (int)((double)DrawerUIUtils.getOptimalDrawerWidth((Context)this.mActivity) * 0.5625));
        int n4 = n3;
        if (this.mTranslucentStatusBar) {
            dimenHolder = this.mAccountHeader;
            dimenHolder.setPadding(dimenHolder.getPaddingLeft(), this.mAccountHeader.getPaddingTop() + n2, this.mAccountHeader.getPaddingRight(), this.mAccountHeader.getPaddingBottom());
            if (this.mCompactStyle) {
                n4 = n3 + n2;
            } else {
                n4 = n3;
                if (n3 - n2 <= n) {
                    n4 = n + n2;
                }
            }
        }
        this.setHeaderHeight(n4);
        dimenHolder = (ImageView)this.mAccountHeaderContainer.findViewById(R.id.material_drawer_account_header_background);
        this.mAccountHeaderBackground = dimenHolder;
        com.mikepenz.materialize.holder.ImageHolder.applyTo((com.mikepenz.materialize.holder.ImageHolder)this.mHeaderBackground, (ImageView)dimenHolder, DrawerImageLoader.Tags.ACCOUNT_HEADER.name());
        dimenHolder = this.mHeaderBackgroundScaleType;
        if (dimenHolder != null) {
            this.mAccountHeaderBackground.setScaleType((ImageView.ScaleType)dimenHolder);
        }
        n3 = com.mikepenz.materialize.holder.ColorHolder.color((com.mikepenz.materialize.holder.ColorHolder)this.mTextColor, (Context)this.mActivity, R.attr.material_drawer_header_selection_text, R.color.material_drawer_header_selection_text);
        this.mAccountHeaderTextSection = this.mCompactStyle ? this.mAccountHeader : this.mAccountHeaderContainer.findViewById(R.id.material_drawer_account_header_text_section);
        this.mAccountHeaderTextSectionBackgroundResource = UIUtils.getSelectableBackgroundRes((Context)this.mActivity);
        this.handleSelectionView(this.mCurrentProfile, true);
        dimenHolder = (ImageView)this.mAccountHeaderContainer.findViewById(R.id.material_drawer_account_header_text_switcher);
        this.mAccountSwitcherArrow = dimenHolder;
        dimenHolder.setImageDrawable((Drawable)new IconicsDrawable((Context)this.mActivity, (IIcon)MaterialDrawerFont.Icon.mdf_arrow_drop_down).sizeRes(R.dimen.material_drawer_account_header_dropdown).paddingRes(R.dimen.material_drawer_account_header_dropdown_padding).color(n3));
        this.mCurrentProfileView = (BezelImageView)this.mAccountHeader.findViewById(R.id.material_drawer_account_header_current);
        this.mCurrentProfileName = (TextView)this.mAccountHeader.findViewById(R.id.material_drawer_account_header_name);
        this.mCurrentProfileEmail = (TextView)this.mAccountHeader.findViewById(R.id.material_drawer_account_header_email);
        dimenHolder = this.mNameTypeface;
        if (dimenHolder != null) {
            this.mCurrentProfileName.setTypeface((Typeface)dimenHolder);
        } else {
            dimenHolder = this.mTypeface;
            if (dimenHolder != null) {
                this.mCurrentProfileName.setTypeface((Typeface)dimenHolder);
            }
        }
        dimenHolder = this.mEmailTypeface;
        if (dimenHolder != null) {
            this.mCurrentProfileEmail.setTypeface((Typeface)dimenHolder);
        } else {
            dimenHolder = this.mTypeface;
            if (dimenHolder != null) {
                this.mCurrentProfileEmail.setTypeface((Typeface)dimenHolder);
            }
        }
        this.mCurrentProfileName.setTextColor(n3);
        this.mCurrentProfileEmail.setTextColor(n3);
        this.mProfileFirstView = (BezelImageView)this.mAccountHeader.findViewById(R.id.material_drawer_account_header_small_first);
        this.mProfileSecondView = (BezelImageView)this.mAccountHeader.findViewById(R.id.material_drawer_account_header_small_second);
        this.mProfileThirdView = (BezelImageView)this.mAccountHeader.findViewById(R.id.material_drawer_account_header_small_third);
        this.calculateProfiles();
        this.buildProfiles();
        dimenHolder = this.mSavedInstance;
        if (dimenHolder != null && (n3 = dimenHolder.getInt("bundle_selection_header", -1)) != -1 && (dimenHolder = this.mProfiles) != null && n3 > -1 && n3 < dimenHolder.size()) {
            this.switchProfiles((IProfile)this.mProfiles.get(n3));
        }
        if ((dimenHolder = this.mDrawer) != null) {
            dimenHolder.setHeader(this.mAccountHeaderContainer, this.mPaddingBelowHeader, this.mDividerBelowHeader);
        }
        this.mActivity = null;
        return new AccountHeader(this);
    }

    public void buildDrawerSelectionList() {
        int n;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.mProfiles;
        int n2 = n = -1;
        if (iterator != null) {
            iterator = iterator.iterator();
            int n3 = 0;
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) break;
                IProfile iProfile = (IProfile)iterator.next();
                n2 = n;
                if (iProfile == this.mCurrentProfile) {
                    if (this.mCurrentHiddenInList) continue;
                    n2 = this.mDrawer.mDrawerBuilder.getItemAdapter().getGlobalPosition(n3);
                }
                if (iProfile instanceof IDrawerItem) {
                    iProfile = (IDrawerItem)iProfile;
                    iProfile.withSetSelected(false);
                    arrayList.add((Object)iProfile);
                }
                ++n3;
                n = n2;
            }
        }
        this.mDrawer.switchDrawerContent(this.onDrawerItemClickListener, this.onDrawerItemLongClickListener, (List<IDrawerItem>)arrayList, n2);
    }

    public void buildProfiles() {
        IProfile iProfile;
        this.mCurrentProfileView.setVisibility(4);
        this.mAccountHeaderTextSection.setVisibility(4);
        this.mAccountSwitcherArrow.setVisibility(8);
        this.mProfileFirstView.setVisibility(8);
        this.mProfileFirstView.setOnClickListener(null);
        this.mProfileSecondView.setVisibility(8);
        this.mProfileSecondView.setOnClickListener(null);
        this.mProfileThirdView.setVisibility(8);
        this.mProfileThirdView.setOnClickListener(null);
        this.mCurrentProfileName.setText((CharSequence)"");
        this.mCurrentProfileEmail.setText((CharSequence)"");
        if (!this.mCompactStyle) {
            iProfile = this.mAccountHeaderTextSection;
            iProfile.setPadding(0, 0, (int)UIUtils.convertDpToPixel(56.0f, iProfile.getContext()), 0);
        }
        this.handleSelectionView(this.mCurrentProfile, true);
        iProfile = this.mCurrentProfile;
        if (iProfile != null) {
            if ((this.mProfileImagesVisible || this.mOnlyMainProfileImageVisible) && !this.mOnlySmallProfileImagesVisible) {
                this.setImageOrPlaceholder(this.mCurrentProfileView, iProfile.getIcon());
                if (this.mProfileImagesClickable) {
                    this.mCurrentProfileView.setOnClickListener(this.onCurrentProfileClickListener);
                    this.mCurrentProfileView.setOnLongClickListener(this.onCurrentProfileLongClickListener);
                    this.mCurrentProfileView.disableTouchFeedback(false);
                } else {
                    this.mCurrentProfileView.disableTouchFeedback(true);
                }
                this.mCurrentProfileView.setVisibility(0);
                this.mCurrentProfileView.invalidate();
            } else if (this.mCompactStyle) {
                this.mCurrentProfileView.setVisibility(8);
            }
            this.mAccountHeaderTextSection.setVisibility(0);
            this.handleSelectionView(this.mCurrentProfile, true);
            this.mAccountSwitcherArrow.setVisibility(0);
            iProfile = this.mCurrentProfileView;
            int n = R.id.material_drawer_profile_header;
            iProfile.setTag(n, (Object)this.mCurrentProfile);
            StringHolder.applyTo((StringHolder)this.mCurrentProfile.getName(), this.mCurrentProfileName);
            StringHolder.applyTo((StringHolder)this.mCurrentProfile.getEmail(), this.mCurrentProfileEmail);
            iProfile = this.mProfileFirst;
            if (iProfile != null && this.mProfileImagesVisible && !this.mOnlyMainProfileImageVisible) {
                this.setImageOrPlaceholder(this.mProfileFirstView, iProfile.getIcon());
                this.mProfileFirstView.setTag(n, this.mProfileFirst);
                if (this.mProfileImagesClickable) {
                    this.mProfileFirstView.setOnClickListener(this.onProfileClickListener);
                    this.mProfileFirstView.setOnLongClickListener(this.onProfileLongClickListener);
                    this.mProfileFirstView.disableTouchFeedback(false);
                } else {
                    this.mProfileFirstView.disableTouchFeedback(true);
                }
                this.mProfileFirstView.setVisibility(0);
                this.mProfileFirstView.invalidate();
            }
            if ((iProfile = this.mProfileSecond) != null && this.mProfileImagesVisible && !this.mOnlyMainProfileImageVisible) {
                this.setImageOrPlaceholder(this.mProfileSecondView, iProfile.getIcon());
                this.mProfileSecondView.setTag(n, this.mProfileSecond);
                if (this.mProfileImagesClickable) {
                    this.mProfileSecondView.setOnClickListener(this.onProfileClickListener);
                    this.mProfileSecondView.setOnLongClickListener(this.onProfileLongClickListener);
                    this.mProfileSecondView.disableTouchFeedback(false);
                } else {
                    this.mProfileSecondView.disableTouchFeedback(true);
                }
                this.mProfileSecondView.setVisibility(0);
                this.mProfileSecondView.invalidate();
            }
            if ((iProfile = this.mProfileThird) != null && this.mThreeSmallProfileImages && this.mProfileImagesVisible && !this.mOnlyMainProfileImageVisible) {
                this.setImageOrPlaceholder(this.mProfileThirdView, iProfile.getIcon());
                this.mProfileThirdView.setTag(n, this.mProfileThird);
                if (this.mProfileImagesClickable) {
                    this.mProfileThirdView.setOnClickListener(this.onProfileClickListener);
                    this.mProfileThirdView.setOnLongClickListener(this.onProfileLongClickListener);
                    this.mProfileThirdView.disableTouchFeedback(false);
                } else {
                    this.mProfileThirdView.disableTouchFeedback(true);
                }
                this.mProfileThirdView.setVisibility(0);
                this.mProfileThirdView.invalidate();
            }
        } else {
            iProfile = this.mProfiles;
            if (iProfile != null && iProfile.size() > 0) {
                iProfile = (IProfile)this.mProfiles.get(0);
                this.mAccountHeaderTextSection.setTag(R.id.material_drawer_profile_header, (Object)iProfile);
                this.mAccountHeaderTextSection.setVisibility(0);
                this.handleSelectionView(this.mCurrentProfile, true);
                this.mAccountSwitcherArrow.setVisibility(0);
                iProfile = this.mCurrentProfile;
                if (iProfile != null) {
                    StringHolder.applyTo((StringHolder)iProfile.getName(), this.mCurrentProfileName);
                    StringHolder.applyTo((StringHolder)this.mCurrentProfile.getEmail(), this.mCurrentProfileEmail);
                }
            }
        }
        if (!this.mSelectionFirstLineShown) {
            this.mCurrentProfileName.setVisibility(8);
        }
        if (!TextUtils.isEmpty((CharSequence)this.mSelectionFirstLine)) {
            this.mCurrentProfileName.setText((CharSequence)this.mSelectionFirstLine);
            this.mAccountHeaderTextSection.setVisibility(0);
        }
        if (!this.mSelectionSecondLineShown) {
            this.mCurrentProfileEmail.setVisibility(8);
        }
        if (!TextUtils.isEmpty((CharSequence)this.mSelectionSecondLine)) {
            this.mCurrentProfileEmail.setText((CharSequence)this.mSelectionSecondLine);
            this.mAccountHeaderTextSection.setVisibility(0);
        }
        if (!this.mSelectionListEnabled || !this.mSelectionListEnabledForSingleProfile && this.mProfileFirst == null && ((iProfile = this.mProfiles) == null || iProfile.size() == 1)) {
            this.mAccountSwitcherArrow.setVisibility(8);
            this.handleSelectionView(null, false);
            if (!this.mCompactStyle) {
                iProfile = this.mAccountHeaderTextSection;
                iProfile.setPadding(0, 0, (int)UIUtils.convertDpToPixel(16.0f, iProfile.getContext()), 0);
            }
        }
        if (this.mOnAccountHeaderSelectionViewClickListener != null) {
            this.handleSelectionView(this.mCurrentProfile, true);
        }
    }

    public void calculateProfiles() {
        Stack stack;
        int n;
        if (this.mProfiles == null) {
            this.mProfiles = new ArrayList();
        }
        IProfile iProfile = this.mCurrentProfile;
        int n2 = 0;
        if (iProfile == null) {
            n2 = 0;
            for (n = 0; n < this.mProfiles.size(); ++n) {
                int n3 = n2;
                if (this.mProfiles.size() > n) {
                    n3 = n2;
                    if (((IProfile)this.mProfiles.get(n)).isSelectable()) {
                        if (n2 == 0 && this.mCurrentProfile == null) {
                            this.mCurrentProfile = (IProfile)this.mProfiles.get(n);
                        } else if (n2 == 1 && this.mProfileFirst == null) {
                            this.mProfileFirst = (IProfile)this.mProfiles.get(n);
                        } else if (n2 == 2 && this.mProfileSecond == null) {
                            this.mProfileSecond = (IProfile)this.mProfiles.get(n);
                        } else if (n2 == 3 && this.mProfileThird == null) {
                            this.mProfileThird = (IProfile)this.mProfiles.get(n);
                        }
                        n3 = n2 + 1;
                    }
                }
                n2 = n3;
            }
            return;
        }
        IProfile iProfile2 = this.mProfileFirst;
        IProfile iProfile3 = this.mProfileSecond;
        IProfile iProfile4 = this.mProfileThird;
        IProfile[] iProfileArray = new IProfile[4];
        Stack stack2 = new Stack();
        for (n = 0; n < this.mProfiles.size(); ++n) {
            int n4;
            block17: {
                stack = (IProfile)this.mProfiles.get(n);
                if (!stack.isSelectable()) continue;
                for (n4 = 0; n4 < 4; ++n4) {
                    if ((new IProfile[]{iProfile, iProfile2, iProfile3, iProfile4})[n4] != stack) continue;
                    iProfileArray[n4] = stack;
                    n4 = 1;
                    break block17;
                }
                n4 = 0;
            }
            if (n4 != 0) continue;
            stack2.push((Object)stack);
        }
        stack = new Stack();
        for (n = n2; n < 4; ++n) {
            iProfile = iProfileArray[n];
            if (iProfile != null) {
                stack.push((Object)iProfile);
                continue;
            }
            if (stack2.isEmpty()) continue;
            stack.push(stack2.pop());
        }
        stack2 = new Stack();
        while (!stack.empty()) {
            stack2.push(stack.pop());
        }
        this.mCurrentProfile = stack2.isEmpty() ? null : (IProfile)stack2.pop();
        this.mProfileFirst = stack2.isEmpty() ? null : (IProfile)stack2.pop();
        this.mProfileSecond = stack2.isEmpty() ? null : (IProfile)stack2.pop();
        this.mProfileThird = stack2.isEmpty() ? null : (IProfile)stack2.pop();
    }

    public int getCurrentSelection() {
        Iterator iterator;
        if (this.mCurrentProfile != null && (iterator = this.mProfiles) != null) {
            int n = 0;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                if ((IProfile)iterator.next() == this.mCurrentProfile) {
                    return n;
                }
                ++n;
            }
        }
        return -1;
    }

    public void onProfileClick(View object, boolean bl) {
        IProfile iProfile = (IProfile)object.getTag(R.id.material_drawer_profile_header);
        this.switchProfiles(iProfile);
        this.resetDrawerContent(object.getContext());
        Object object2 = this.mDrawer;
        if (object2 != null && ((Drawer)object2).getDrawerBuilder() != null && this.mDrawer.getDrawerBuilder().mMiniDrawer != null) {
            this.mDrawer.getDrawerBuilder().mMiniDrawer.onProfileClick();
        }
        boolean bl2 = false;
        object2 = this.mOnAccountHeaderListener;
        if (object2 != null) {
            bl2 = object2.onProfileChanged((View)object, iProfile, bl);
        }
        if (!bl2) {
            if (this.mOnProfileClickDrawerCloseDelay > 0) {
                new Handler().postDelayed(new Runnable(this){
                    public final AccountHeaderBuilder this$0;
                    {
                        this.this$0 = accountHeaderBuilder;
                    }

                    public void run() {
                        Drawer drawer = this.this$0.mDrawer;
                        if (drawer != null) {
                            drawer.closeDrawer();
                        }
                    }
                }, (long)this.mOnProfileClickDrawerCloseDelay);
            } else {
                object = this.mDrawer;
                if (object != null) {
                    ((Drawer)object).closeDrawer();
                }
            }
        }
    }

    public boolean switchProfiles(IProfile iProfile) {
        if (iProfile == null) {
            return false;
        }
        IProfile iProfile2 = this.mCurrentProfile;
        if (iProfile2 == iProfile) {
            return true;
        }
        boolean bl = this.mAlternativeProfileHeaderSwitching;
        int n = -1;
        if (bl) {
            if (this.mProfileFirst == iProfile) {
                n = 1;
            } else if (this.mProfileSecond == iProfile) {
                n = 2;
            } else if (this.mProfileThird == iProfile) {
                n = 3;
            }
            this.mCurrentProfile = iProfile;
            if (n == 1) {
                this.mProfileFirst = iProfile2;
            } else if (n == 2) {
                this.mProfileSecond = iProfile2;
            } else if (n == 3) {
                this.mProfileThird = iProfile2;
            }
        } else if (this.mProfiles != null) {
            iProfile2 = new ArrayList((Collection)Arrays.asList((Object[])new IProfile[]{this.mCurrentProfile, this.mProfileFirst, this.mProfileSecond, this.mProfileThird}));
            if (iProfile2.contains((Object)iProfile)) {
                block21: {
                    for (n = 0; n < 4; ++n) {
                        if (iProfile2.get(n) != iProfile) {
                            continue;
                        }
                        break block21;
                    }
                    n = -1;
                }
                if (n != -1) {
                    iProfile2.remove(n);
                    iProfile2.add(0, (Object)iProfile);
                    this.mCurrentProfile = (IProfile)iProfile2.get(0);
                    this.mProfileFirst = (IProfile)iProfile2.get(1);
                    this.mProfileSecond = (IProfile)iProfile2.get(2);
                    this.mProfileThird = (IProfile)iProfile2.get(3);
                }
            } else {
                this.mProfileThird = this.mProfileSecond;
                this.mProfileSecond = this.mProfileFirst;
                this.mProfileFirst = this.mCurrentProfile;
                this.mCurrentProfile = iProfile;
            }
        }
        if (this.mOnlySmallProfileImagesVisible) {
            this.mProfileThird = this.mProfileSecond;
            this.mProfileSecond = this.mProfileFirst;
            this.mProfileFirst = this.mCurrentProfile;
        }
        this.buildProfiles();
        return false;
    }

    public void toggleSelectionList(Context context) {
        Drawer drawer = this.mDrawer;
        if (drawer != null) {
            if (drawer.switchedDrawerContent()) {
                this.resetDrawerContent(context);
                this.mSelectionListShown = false;
            } else {
                this.buildDrawerSelectionList();
                this.mAccountSwitcherArrow.clearAnimation();
                ViewCompat.animate((View)this.mAccountSwitcherArrow).rotation(180.0f).start();
                this.mSelectionListShown = true;
            }
        }
    }

    public void updateHeaderAndList() {
        this.calculateProfiles();
        this.buildProfiles();
        if (this.mSelectionListShown) {
            this.buildDrawerSelectionList();
        }
    }

    public AccountHeaderBuilder withAccountHeader(@LayoutRes int n) {
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mAccountHeaderContainer = n != -1 ? activity.getLayoutInflater().inflate(n, null, false) : (this.mCompactStyle ? activity.getLayoutInflater().inflate(R.layout.material_drawer_compact_header, null, false) : activity.getLayoutInflater().inflate(R.layout.material_drawer_header, null, false));
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public AccountHeaderBuilder withAccountHeader(@NonNull View view) {
        this.mAccountHeaderContainer = view;
        return this;
    }

    public AccountHeaderBuilder withActivity(@NonNull Activity activity) {
        this.mActivity = activity;
        return this;
    }

    public AccountHeaderBuilder withAlternativeProfileHeaderSwitching(boolean bl) {
        this.mAlternativeProfileHeaderSwitching = bl;
        return this;
    }

    public AccountHeaderBuilder withCloseDrawerOnProfileListClick(boolean bl) {
        this.mCloseDrawerOnProfileListClick = bl;
        return this;
    }

    public AccountHeaderBuilder withCompactStyle(boolean bl) {
        this.mCompactStyle = bl;
        return this;
    }

    public AccountHeaderBuilder withCurrentProfileHiddenInList(boolean bl) {
        this.mCurrentHiddenInList = bl;
        return this;
    }

    public AccountHeaderBuilder withDividerBelowHeader(boolean bl) {
        this.mDividerBelowHeader = bl;
        return this;
    }

    public AccountHeaderBuilder withDrawer(@NonNull Drawer drawer) {
        this.mDrawer = drawer;
        drawer.getRecyclerView().setPadding(drawer.getRecyclerView().getPaddingLeft(), 0, drawer.getRecyclerView().getPaddingRight(), drawer.getRecyclerView().getPaddingBottom());
        return this;
    }

    public AccountHeaderBuilder withEmailTypeface(@NonNull Typeface typeface) {
        this.mEmailTypeface = typeface;
        return this;
    }

    public AccountHeaderBuilder withHeaderBackground(@DrawableRes int n) {
        this.mHeaderBackground = new ImageHolder(n);
        return this;
    }

    public AccountHeaderBuilder withHeaderBackground(Drawable drawable2) {
        this.mHeaderBackground = new ImageHolder(drawable2);
        return this;
    }

    public AccountHeaderBuilder withHeaderBackground(ImageHolder imageHolder) {
        this.mHeaderBackground = imageHolder;
        return this;
    }

    public AccountHeaderBuilder withHeaderBackgroundScaleType(ImageView.ScaleType scaleType) {
        this.mHeaderBackgroundScaleType = scaleType;
        return this;
    }

    public AccountHeaderBuilder withHeightDp(int n) {
        this.mHeight = DimenHolder.fromDp((int)n);
        return this;
    }

    public AccountHeaderBuilder withHeightPx(int n) {
        this.mHeight = DimenHolder.fromPixel((int)n);
        return this;
    }

    public AccountHeaderBuilder withHeightRes(@DimenRes int n) {
        this.mHeight = DimenHolder.fromResource((int)n);
        return this;
    }

    public AccountHeaderBuilder withNameTypeface(@NonNull Typeface typeface) {
        this.mNameTypeface = typeface;
        return this;
    }

    public AccountHeaderBuilder withOnAccountHeaderItemLongClickListener(AccountHeader.OnAccountHeaderItemLongClickListener onAccountHeaderItemLongClickListener) {
        this.mOnAccountHeaderItemLongClickListener = onAccountHeaderItemLongClickListener;
        return this;
    }

    public AccountHeaderBuilder withOnAccountHeaderListener(AccountHeader.OnAccountHeaderListener onAccountHeaderListener) {
        this.mOnAccountHeaderListener = onAccountHeaderListener;
        return this;
    }

    public AccountHeaderBuilder withOnAccountHeaderProfileImageListener(AccountHeader.OnAccountHeaderProfileImageListener onAccountHeaderProfileImageListener) {
        this.mOnAccountHeaderProfileImageListener = onAccountHeaderProfileImageListener;
        return this;
    }

    public AccountHeaderBuilder withOnAccountHeaderSelectionViewClickListener(AccountHeader.OnAccountHeaderSelectionViewClickListener onAccountHeaderSelectionViewClickListener) {
        this.mOnAccountHeaderSelectionViewClickListener = onAccountHeaderSelectionViewClickListener;
        return this;
    }

    public AccountHeaderBuilder withOnProfileClickDrawerCloseDelay(int n) {
        this.mOnProfileClickDrawerCloseDelay = n;
        return this;
    }

    public AccountHeaderBuilder withOnlyMainProfileImageVisible(boolean bl) {
        this.mOnlyMainProfileImageVisible = bl;
        return this;
    }

    public AccountHeaderBuilder withOnlySmallProfileImagesVisible(boolean bl) {
        this.mOnlySmallProfileImagesVisible = bl;
        return this;
    }

    public AccountHeaderBuilder withPaddingBelowHeader(boolean bl) {
        this.mPaddingBelowHeader = bl;
        return this;
    }

    public AccountHeaderBuilder withProfileImagesClickable(boolean bl) {
        this.mProfileImagesClickable = bl;
        return this;
    }

    public AccountHeaderBuilder withProfileImagesVisible(boolean bl) {
        this.mProfileImagesVisible = bl;
        return this;
    }

    public AccountHeaderBuilder withProfiles(@NonNull List<IProfile> list) {
        this.mProfiles = IdDistributor.checkIds(list);
        return this;
    }

    public AccountHeaderBuilder withResetDrawerOnProfileListClick(boolean bl) {
        this.mResetDrawerOnProfileListClick = bl;
        return this;
    }

    public AccountHeaderBuilder withSavedInstance(Bundle bundle) {
        this.mSavedInstance = bundle;
        return this;
    }

    public AccountHeaderBuilder withSelectionFirstLine(String string2) {
        this.mSelectionFirstLine = string2;
        return this;
    }

    public AccountHeaderBuilder withSelectionFirstLineShown(boolean bl) {
        this.mSelectionFirstLineShown = bl;
        return this;
    }

    @Deprecated
    public AccountHeaderBuilder withSelectionFistLineShown(boolean bl) {
        this.mSelectionFirstLineShown = bl;
        return this;
    }

    public AccountHeaderBuilder withSelectionListEnabled(boolean bl) {
        this.mSelectionListEnabled = bl;
        return this;
    }

    public AccountHeaderBuilder withSelectionListEnabledForSingleProfile(boolean bl) {
        this.mSelectionListEnabledForSingleProfile = bl;
        return this;
    }

    public AccountHeaderBuilder withSelectionSecondLine(String string2) {
        this.mSelectionSecondLine = string2;
        return this;
    }

    public AccountHeaderBuilder withSelectionSecondLineShown(boolean bl) {
        this.mSelectionSecondLineShown = bl;
        return this;
    }

    public AccountHeaderBuilder withTextColor(@ColorInt int n) {
        this.mTextColor = ColorHolder.fromColor((int)n);
        return this;
    }

    public AccountHeaderBuilder withTextColorRes(@ColorRes int n) {
        this.mTextColor = ColorHolder.fromColorRes((int)n);
        return this;
    }

    public AccountHeaderBuilder withThreeSmallProfileImages(boolean bl) {
        this.mThreeSmallProfileImages = bl;
        return this;
    }

    public AccountHeaderBuilder withTranslucentStatusBar(boolean bl) {
        this.mTranslucentStatusBar = bl;
        return this;
    }

    public AccountHeaderBuilder withTypeface(@NonNull Typeface typeface) {
        this.mTypeface = typeface;
        return this;
    }
}

