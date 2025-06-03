/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  com.google.firebase.crashlytics.FirebaseCrashlytics
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.AuthPendingEnd
 */
package com.hintsolutions.raintv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.video.PlaylistActivity;
import com.squareup.otto.Subscribe;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.AuthPendingEnd;

public class DeepLinkingActivity
extends BaseActivity {
    /*
     * Exception decompiling
     */
    private void handleUrl(Uri var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 4[TRYBLOCK]
         *     at kb.j.B1(SourceFile:159)
         *     at kb.j.X0(SourceFile:49)
         *     at kb.i.Z0(SourceFile:40)
         *     at ib.f.d(SourceFile:217)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void processIntent() {
        try {
            if (this.getIntent().getData() != null) {
                Uri uri = this.getIntent().getData();
                if (uri == null) return;
                this.handleUrl(uri);
                return;
            }
            this.startMainActivity();
            return;
        }
        catch (Exception exception) {
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void showNews(String object, String string) {
        block5: {
            block7: {
                Exception exception2;
                Object var4_4;
                block6: {
                    boolean bl;
                    block4: {
                        var4_4 = null;
                        if (object != null) {
                            try {
                                if (object.split("-").length <= 1) break block4;
                                object = object.split("-");
                                object = object[((String[])object).length - 1];
                                break block5;
                            }
                            catch (Exception exception2) {
                                break block6;
                            }
                        }
                    }
                    if (object == null || (bl = object.contains((CharSequence)"-"))) break block7;
                    break block5;
                }
                exception2.printStackTrace();
                object = var4_4;
                break block5;
            }
            object = null;
        }
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.showNewsActivity(Integer.parseInt((String)object), string);
            this.finish();
            return;
        }
        this.startMainActivity();
    }

    private void startMainActivity() {
        try {
            Intent intent = new Intent((Context)this, MainActivity.class);
            intent.addFlags(0x14000000);
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.finish();
    }

    private void startMainActivityRC() {
        try {
            Intent intent = new Intent((Context)this, MainActivity.class);
            intent.addFlags(0x14000000);
            intent.putExtra("rain_country", true);
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.finish();
    }

    private void startPlaylistActivity(String string, String string2) {
        Intent intent = new Intent((Context)this, PlaylistActivity.class);
        intent.putExtra("code", string);
        if (string2 != null) {
            intent.putExtra("link", string2);
        }
        this.startActivity(intent);
    }

    @Override
    public int getLayoutResource() {
        return 2131492956;
    }

    @Subscribe
    public void onAuthPendingEnd(AuthPendingEnd authPendingEnd) {
        this.processIntent();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.mAuthDone) {
            this.processIntent();
        } else {
            this.startMainActivity();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        try {
            BusProvider.getInstance().unregister(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
    }
}

