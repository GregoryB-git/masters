/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.NonNull
 *  com.mikepenz.materialdrawer.holder.ImageHolder
 *  com.mikepenz.materialdrawer.model.interfaces.IProfile
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package com.mikepenz.materialdrawer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.holder.ImageHolder;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AccountHeader {
    public static final String BUNDLE_SELECTION_HEADER = "bundle_selection_header";
    public static final double NAVIGATION_DRAWER_ACCOUNT_ASPECT_RATIO = 0.5625;
    public final AccountHeaderBuilder mAccountHeaderBuilder;

    public AccountHeader(AccountHeaderBuilder accountHeaderBuilder) {
        this.mAccountHeaderBuilder = accountHeaderBuilder;
    }

    private int getPositionByIdentifier(long l) {
        int n;
        if (this.mAccountHeaderBuilder.mProfiles != null && l >= 0L) {
            for (n = 0; n < this.mAccountHeaderBuilder.mProfiles.size(); ++n) {
                if (this.mAccountHeaderBuilder.mProfiles.get(n) == null || ((IProfile)this.mAccountHeaderBuilder.mProfiles.get(n)).getIdentifier() != l) {
                    continue;
                }
                break;
            }
        } else {
            n = -1;
        }
        return n;
    }

    public void addProfile(@NonNull IProfile iProfile, int n) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        if (accountHeaderBuilder.mProfiles == null) {
            accountHeaderBuilder.mProfiles = new ArrayList();
        }
        this.mAccountHeaderBuilder.mProfiles.add(n, (Object)iProfile);
        this.mAccountHeaderBuilder.updateHeaderAndList();
    }

    public void addProfiles(IProfile ... iProfileArray) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        if (accountHeaderBuilder.mProfiles == null) {
            accountHeaderBuilder.mProfiles = new ArrayList();
        }
        Collections.addAll(this.mAccountHeaderBuilder.mProfiles, (Object[])iProfileArray);
        this.mAccountHeaderBuilder.updateHeaderAndList();
    }

    public void clear() {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        accountHeaderBuilder.mProfiles = null;
        accountHeaderBuilder.calculateProfiles();
        this.mAccountHeaderBuilder.buildProfiles();
    }

    public AccountHeaderBuilder getAccountHeaderBuilder() {
        return this.mAccountHeaderBuilder;
    }

    public IProfile getActiveProfile() {
        return this.mAccountHeaderBuilder.mCurrentProfile;
    }

    public ImageView getHeaderBackgroundView() {
        return this.mAccountHeaderBuilder.mAccountHeaderBackground;
    }

    public List<IProfile> getProfiles() {
        return this.mAccountHeaderBuilder.mProfiles;
    }

    public View getView() {
        return this.mAccountHeaderBuilder.mAccountHeaderContainer;
    }

    public boolean isSelectionListShown() {
        return this.mAccountHeaderBuilder.mSelectionListShown;
    }

    public void removeProfile(int n) {
        List<IProfile> list = this.mAccountHeaderBuilder.mProfiles;
        if (list != null && list.size() > n) {
            this.mAccountHeaderBuilder.mProfiles.remove(n);
        }
        this.mAccountHeaderBuilder.updateHeaderAndList();
    }

    public void removeProfile(@NonNull IProfile iProfile) {
        this.removeProfileByIdentifier(iProfile.getIdentifier());
    }

    public void removeProfileByIdentifier(long l) {
        int n = this.getPositionByIdentifier(l);
        if (n > -1) {
            this.mAccountHeaderBuilder.mProfiles.remove(n);
        }
        this.mAccountHeaderBuilder.updateHeaderAndList();
    }

    public Bundle saveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(BUNDLE_SELECTION_HEADER, this.mAccountHeaderBuilder.getCurrentSelection());
        }
        return bundle;
    }

    public void setActiveProfile(long l) {
        this.setActiveProfile(l, false);
    }

    public void setActiveProfile(long l, boolean bl) {
        Iterator iterator = this.mAccountHeaderBuilder.mProfiles;
        if (iterator != null) {
            for (IProfile iProfile : iterator) {
                if (iProfile == null || iProfile.getIdentifier() != l) continue;
                this.setActiveProfile(iProfile, bl);
                break;
            }
        }
    }

    public void setActiveProfile(IProfile iProfile) {
        this.setActiveProfile(iProfile, false);
    }

    public void setActiveProfile(IProfile iProfile, boolean bl) {
        OnAccountHeaderListener onAccountHeaderListener;
        boolean bl2 = this.mAccountHeaderBuilder.switchProfiles(iProfile);
        if (this.mAccountHeaderBuilder.mDrawer != null && this.isSelectionListShown()) {
            this.mAccountHeaderBuilder.mDrawer.setSelection(iProfile.getIdentifier(), false);
        }
        if (bl && (onAccountHeaderListener = this.mAccountHeaderBuilder.mOnAccountHeaderListener) != null) {
            onAccountHeaderListener.onProfileChanged(null, iProfile, bl2);
        }
    }

    public void setBackground(Drawable drawable2) {
        this.mAccountHeaderBuilder.mAccountHeaderBackground.setImageDrawable(drawable2);
    }

    public void setBackgroundRes(@DrawableRes int n) {
        this.mAccountHeaderBuilder.mAccountHeaderBackground.setImageResource(n);
    }

    public void setDrawer(Drawer drawer) {
        this.mAccountHeaderBuilder.mDrawer = drawer;
    }

    public void setHeaderBackground(ImageHolder imageHolder) {
        com.mikepenz.materialize.holder.ImageHolder.applyTo((com.mikepenz.materialize.holder.ImageHolder)imageHolder, this.mAccountHeaderBuilder.mAccountHeaderBackground);
    }

    public void setProfiles(List<IProfile> list) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        accountHeaderBuilder.mProfiles = list;
        accountHeaderBuilder.updateHeaderAndList();
    }

    public void setSelectionFirstLine(String string2) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        accountHeaderBuilder.mSelectionFirstLine = string2;
        accountHeaderBuilder.updateHeaderAndList();
    }

    public void setSelectionFirstLineShown(boolean bl) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        accountHeaderBuilder.mSelectionFirstLineShown = bl;
        accountHeaderBuilder.updateHeaderAndList();
    }

    public void setSelectionSecondLine(String string2) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        accountHeaderBuilder.mSelectionSecondLine = string2;
        accountHeaderBuilder.updateHeaderAndList();
    }

    public void setSelectionSecondLineShown(boolean bl) {
        AccountHeaderBuilder accountHeaderBuilder = this.mAccountHeaderBuilder;
        accountHeaderBuilder.mSelectionSecondLineShown = bl;
        accountHeaderBuilder.updateHeaderAndList();
    }

    public void toggleSelectionList(Context context) {
        this.mAccountHeaderBuilder.toggleSelectionList(context);
    }

    public void updateProfile(@NonNull IProfile iProfile) {
        this.updateProfileByIdentifier(iProfile);
    }

    @Deprecated
    public void updateProfileByIdentifier(@NonNull IProfile iProfile) {
        int n = this.getPositionByIdentifier(iProfile.getIdentifier());
        if (n > -1) {
            this.mAccountHeaderBuilder.mProfiles.set(n, (Object)iProfile);
            this.mAccountHeaderBuilder.updateHeaderAndList();
        }
    }

    public static interface OnAccountHeaderItemLongClickListener {
        public boolean onProfileLongClick(View var1, IProfile var2, boolean var3);
    }

    public static interface OnAccountHeaderListener {
        public boolean onProfileChanged(View var1, IProfile var2, boolean var3);
    }

    public static interface OnAccountHeaderProfileImageListener {
        public boolean onProfileImageClick(View var1, IProfile var2, boolean var3);

        public boolean onProfileImageLongClick(View var1, IProfile var2, boolean var3);
    }

    public static interface OnAccountHeaderSelectionViewClickListener {
        public boolean onClick(View var1, IProfile var2);
    }
}

