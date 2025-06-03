/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.widget.TextView
 *  butterknife.BindView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.programs;

import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import com.hintsolutions.raintv.common.BaseActivity;

public class TeleshowInfoActivity
extends BaseActivity {
    public static final String ARG_TEXT = "text";
    @BindView(value=2131297202)
    public TextView text;

    @Override
    public int getLayoutResource() {
        return 2131492912;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.text.setText((CharSequence)this.getIntent().getStringExtra(ARG_TEXT));
    }
}

