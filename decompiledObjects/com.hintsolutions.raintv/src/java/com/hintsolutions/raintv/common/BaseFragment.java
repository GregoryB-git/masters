/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toast
 *  androidx.annotation.Nullable
 *  androidx.fragment.app.Fragment
 *  butterknife.Unbinder
 *  com.google.android.material.snackbar.Snackbar
 *  com.google.firebase.crashlytics.FirebaseCrashlytics
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.UnknownHostException
 *  javax.inject.Inject
 *  retrofit2.adapter.rxjava.HttpException
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.services.CommonService
 *  ru.tvrain.core.services.EagleService
 *  ru.tvrain.core.services.RainService
 *  ru.tvrain.core.utils.ResponseHelper
 *  rx.Subscription
 *  rx.subscriptions.CompositeSubscription
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 *  tvrain.services.bus.BusProvider
 */
package com.hintsolutions.raintv.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.Unbinder;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.ActivityInterface;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.utils.Cache;
import java.net.UnknownHostException;
import javax.inject.Inject;
import retrofit2.adapter.rxjava.HttpException;
import ru.tvrain.core.Consts;
import ru.tvrain.core.services.CommonService;
import ru.tvrain.core.services.EagleService;
import ru.tvrain.core.services.RainService;
import ru.tvrain.core.utils.ResponseHelper;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;
import tvrain.services.bus.BusProvider;

public abstract class BaseFragment
extends Fragment
implements Consts {
    public ActivityInterface activityInterface;
    @Inject
    public AnalyticsManager analyticsManager;
    @Inject
    public Cache cache;
    @Inject
    public CommonService commonApi;
    private CompositeSubscription compositeSubscription;
    @Inject
    public EagleService eagleApi;
    public String hashView;
    @Inject
    public PrefsManager prefsManager;
    private MaterialDialog progressDialog;
    @Inject
    public RainService rainApi;
    public Unbinder unbinder;
    @Inject
    public UserManager userManager;

    public static /* synthetic */ void a(TaskCallback taskCallback, View view) {
        taskCallback.onActionCompleted();
    }

    private void unsubscribe() {
        CompositeSubscription compositeSubscription = this.compositeSubscription;
        if (compositeSubscription != null) {
            compositeSubscription.clear();
        }
    }

    public void addSubscription(Subscription subscription) {
        if (this.compositeSubscription == null) {
            this.compositeSubscription = new CompositeSubscription();
        }
        this.compositeSubscription.add(subscription);
    }

    public String getAuthorization() {
        return this.userManager.getAuthorization();
    }

    public int getHttpCode(Throwable throwable) {
        try {
            if (throwable instanceof HttpException) {
                return ((HttpException)throwable).response().code();
            }
            boolean bl = throwable instanceof UnknownHostException;
            return 404;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 200;
        }
    }

    public String getRetrofitErrorMessage(Throwable object) {
        try {
            String string = new String(((HttpException)object).response().errorBody().bytes());
            object = ResponseHelper.getErrorMessage((String)string);
            return object;
        }
        catch (Exception exception) {
            return ResponseHelper.getErrorMessage((String)"");
        }
    }

    public void hideProgressDialog() {
        block3: {
            MaterialDialog materialDialog = this.progressDialog;
            if (materialDialog == null) break block3;
            try {
                materialDialog.dismiss();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public boolean isTablet() {
        double d;
        boolean bl = false;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = (float)displayMetrics.heightPixels / displayMetrics.ydpi;
            float f2 = (float)displayMetrics.widthPixels / displayMetrics.xdpi;
            d = Math.sqrt((double)(f * f + f2 * f2));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        if (d >= 6.5) {
            bl = true;
        }
        return bl;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            if (context instanceof ActivityInterface) {
                this.activityInterface = (ActivityInterface)context;
            }
        }
        catch (Exception exception) {
            try {
                exception.printStackTrace();
            }
            catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
        try {
            BusProvider.getInstance().register((Object)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            RainApplication.getAppComponent().inject(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.hashView = this.analyticsManager.getHashHolder().getNewViewHash();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onDestroyView() {
        block3: {
            Unbinder unbinder = this.unbinder;
            if (unbinder == null) break block3;
            try {
                unbinder.unbind();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        super.onDestroyView();
    }

    public void onDetach() {
        try {
            BusProvider.getInstance().unregister((Object)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.unsubscribe();
        this.hideProgressDialog();
        super.onDetach();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void openUrl(String string) {
        try {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return;
            }
            String string2 = string;
            if (!string.startsWith("http://")) {
                string2 = string;
                if (!string.startsWith("https://")) {
                    string2 = new StringBuilder();
                    string2.append("http://");
                    string2.append(string);
                    string2 = string2.toString();
                }
            }
            string = new Intent("android.intent.action.VIEW");
            string.setData(Uri.parse((String)string2));
            this.startActivity((Intent)string);
            return;
        }
        catch (Exception exception) {
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
            exception.printStackTrace();
        }
    }

    public void shareString(String string) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showDialog(String string, String string2, TaskCallback taskCallback, boolean bl) {
        try {
            if (this.getActivity() != null) {
                ((BaseActivity)this.getActivity()).showDialog(string, string2, taskCallback, bl);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showErrorDialog(Throwable throwable) {
        try {
            if (this.getActivity() != null) {
                ((BaseActivity)this.getActivity()).showErrorDialog(throwable);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void showProgressDialog() {
        try {
            Object object = this.progressDialog;
            if (object != null && object.isShowing()) {
                return;
            }
            object = this.progressDialog;
            if (object != null) {
                ((MaterialDialog)object).show();
                return;
            }
            object = new MaterialDialog.Builder((Context)this.getActivity());
            this.progressDialog = ((MaterialDialog.Builder)object).content(2131755506).progress(true, 0).cancelable(false).show();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showSnackBar(View view, String string, String string2, int n2, TaskCallback taskCallback) {
        Snackbar.make((View)view, (CharSequence)string, (int)n2).setAction((CharSequence)string2, (View.OnClickListener)new c0(taskCallback, 0)).show();
    }

    public void showToast(String string) {
        try {
            if (this.getActivity() != null) {
                Toast.makeText((Context)this.getActivity(), (CharSequence)string, (int)1).show();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

