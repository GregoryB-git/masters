/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.appcompat.widget.Toolbar
 *  androidx.fragment.app.Fragment
 *  butterknife.BindView
 *  java.lang.Object
 *  java.lang.Override
 */
package com.hintsolutions.raintv.profile;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.profile.SavedVideosFragment;

public class SavedVideosActivity
extends BaseActivity {
    @BindView(value=2131297244)
    public Toolbar toolbar;

    private void setupToolbar() {
        this.setSupportActionBar(this.toolbar);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            this.getSupportActionBar().setDisplayUseLogoEnabled(false);
        }
    }

    @Override
    public int getLayoutResource() {
        return 2131492908;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setupToolbar();
        this.getSupportFragmentManager().beginTransaction().replace(2131296504, (Fragment)new SavedVideosFragment()).commitAllowingStateLoss();
    }
}

