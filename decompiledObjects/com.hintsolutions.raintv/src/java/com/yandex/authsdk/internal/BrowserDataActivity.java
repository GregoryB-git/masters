/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package com.yandex.authsdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.authsdk.internal.BrowserLoginActivity;

public class BrowserDataActivity
extends Activity {
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent((Context)this, BrowserLoginActivity.class);
        bundle.setData(this.getIntent().getData());
        bundle.addFlags(0x14000000);
        this.startActivity((Intent)bundle);
        this.finish();
    }
}

