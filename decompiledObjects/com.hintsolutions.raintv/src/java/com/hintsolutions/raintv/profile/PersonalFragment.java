/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.fragment.app.DialogFragment
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  retrofit2.adapter.rxjava.HttpException
 *  ru.tvrain.core.data.LinkInfo
 *  ru.tvrain.core.data.RainUser
 *  ru.tvrain.core.data.UserInfo
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.profile.LinkDialogFragment;
import com.hintsolutions.raintv.utils.CommonUtils;
import okhttp3.ResponseBody;
import retrofit2.adapter.rxjava.HttpException;
import ru.tvrain.core.data.LinkInfo;
import ru.tvrain.core.data.RainUser;
import ru.tvrain.core.data.UserInfo;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class PersonalFragment
extends BaseFragment
implements LinkDialogFragment.LinkDialogListener {
    @BindView(value=2131296580)
    public EditText emailEditText;
    @BindView(value=2131296629)
    public EditText firstnameEditText;
    @BindView(value=2131296727)
    public EditText lastnameEditText;
    @BindView(value=2131297163)
    public Button linkButton;
    private Handler mHandler;
    private LinkDialogFragment mLinkDialogFragment;
    private OnFragmentInteractionListener mListener;
    private String mOid;
    @BindView(value=2131297310)
    public TextView userid;
    @BindView(value=2131296363)
    public TextView versionView;

    public static /* synthetic */ void b(PersonalFragment personalFragment, Throwable throwable) {
        personalFragment.lambda$save$6(throwable);
    }

    public static /* synthetic */ void c(PersonalFragment personalFragment, UserInfo userInfo) {
        personalFragment.lambda$setUserInfo$1(userInfo);
    }

    public static /* synthetic */ boolean d(PersonalFragment personalFragment, Message message) {
        return personalFragment.lambda$onCreateView$0(message);
    }

    public static /* synthetic */ void e(PersonalFragment personalFragment, LinkInfo linkInfo) {
        personalFragment.lambda$startlinking$3(linkInfo);
    }

    public static /* synthetic */ void f(PersonalFragment personalFragment, ResponseBody responseBody) {
        personalFragment.lambda$save$5(responseBody);
    }

    public static /* synthetic */ void g(PersonalFragment personalFragment, Throwable throwable) {
        personalFragment.lambda$link$8(throwable);
    }

    public static /* synthetic */ void h(Throwable throwable) {
        PersonalFragment.lambda$startlinking$4(throwable);
    }

    public static /* synthetic */ void i(Throwable throwable) {
        PersonalFragment.lambda$setUserInfo$2(throwable);
    }

    public static /* synthetic */ void j(PersonalFragment personalFragment, RainUser rainUser) {
        personalFragment.lambda$link$7(rainUser);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$link$7(RainUser rainUser) {
        try {
            this.userManager.authorize(rainUser);
            if (this.getActivity() != null) {
                Toast.makeText((Context)this.getActivity(), (CharSequence)"\u0410\u043a\u043a\u0430\u0443\u043d\u0442\u044b \u043f\u0440\u0438\u0432\u044f\u0437\u0430\u043d\u044b", (int)0).show();
                this.mListener.onUserAuthorized();
            }
            this.mLinkDialogFragment.dismiss();
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$link$8(Throwable throwable) {
        try {
            block7: {
                block6: {
                    int n4 = ((HttpException)throwable).response().code();
                    if (n4 == 401) break block6;
                    if (n4 != 404) {
                        if (n4 == 406 && this.getActivity() != null) {
                            Toast.makeText((Context)this.getActivity(), (CharSequence)"\u0414\u043e\u0441\u0442\u0438\u0433\u043d\u0443\u0442 \u043f\u0440\u0435\u0434\u0435\u043b \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u0430 \u043f\u0440\u0438\u0432\u044f\u0437\u044b\u0432\u0430\u0435\u043c\u044b\u0445 \u0443\u0441\u0442\u0440\u043e\u0439\u0441\u0442\u0432", (int)1).show();
                        }
                        break block7;
                    } else if (this.getActivity() != null) {
                        Toast.makeText((Context)this.getActivity(), (CharSequence)"\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f \u043d\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442 \u0438\u043b\u0438 \u0438\u0441\u0442\u0435\u043a \u0441\u0440\u043e\u043a \u0436\u0438\u0437\u043d\u0438 \u043f\u043e \u0442\u0430\u0439\u043c\u0430\u0443\u0442\u0443", (int)1).show();
                    }
                    break block7;
                }
                this.mHandler.sendEmptyMessageDelayed(0, 3000L);
            }
            this.mLinkDialogFragment.dismiss();
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    private /* synthetic */ boolean lambda$onCreateView$0(Message message) {
        if (this.getActivity() != null) {
            try {
                this.link();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return false;
    }

    private /* synthetic */ void lambda$save$5(ResponseBody responseBody) {
        if (this.getActivity() != null) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)"\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0430", (int)0).show();
            responseBody = new Intent((Context)this.getActivity(), MainActivity.class);
            this.getActivity().startActivity((Intent)responseBody);
            this.getActivity().finish();
        }
    }

    private /* synthetic */ void lambda$save$6(Throwable object) {
        if (this.getActivity() != null) {
            try {
                object = this.getRetrofitErrorMessage((Throwable)object);
            }
            catch (Exception exception) {
                object = "\u041e\u0448\u0438\u0431\u043a\u0430 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u044f";
            }
            Toast.makeText((Context)this.getActivity(), (CharSequence)object, (int)0).show();
            this.activityInterface.getTagManager().logError("Personal", "save", (String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$setUserInfo$1(UserInfo object) {
        this.userManager.setRainUserInfo((UserInfo)object);
        try {
            if (this.getActivity() == null) return;
            if (object == null) return;
            this.userid.setText((CharSequence)this.getActivity().getResources().getString(2131755640));
            this.userid.append((CharSequence)String.valueOf((Object)((UserInfo)object).id));
            String string = ((UserInfo)object).firstname;
            if (string != null) {
                this.firstnameEditText.setText((CharSequence)string);
            }
            if ((string = ((UserInfo)object).lastname) != null) {
                this.lastnameEditText.setText((CharSequence)string);
            }
            if ((string = ((UserInfo)object).email) != null) {
                this.emailEditText.setText((CharSequence)string);
            }
            if (((UserInfo)object).quickauth.booleanValue()) {
                this.linkButton.setVisibility(0);
                this.emailEditText.setVisibility(8);
                this.firstnameEditText.setVisibility(8);
                this.lastnameEditText.setVisibility(8);
                this.getActivity().findViewById(2131297076).setVisibility(8);
            } else {
                this.linkButton.setVisibility(8);
            }
            object = this.mListener;
            if (object == null) return;
            object.hideProgress();
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    private static /* synthetic */ void lambda$setUserInfo$2(Throwable throwable) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$startlinking$3(LinkInfo linkInfo) {
        try {
            this.mOid = linkInfo.oid;
            this.showCode(linkInfo.code);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    private static /* synthetic */ void lambda$startlinking$4(Throwable throwable) {
    }

    private void setUserInfo() {
        this.addSubscription(this.rainApi.getCurrentUser(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new r3(this, 2), (Action1)new v1(19)));
    }

    private void showCode(String string) {
        LinkDialogFragment linkDialogFragment;
        this.mLinkDialogFragment = linkDialogFragment = new LinkDialogFragment();
        linkDialogFragment.setListener(this);
        linkDialogFragment = new Bundle();
        linkDialogFragment.putString("code", string);
        this.mLinkDialogFragment.setArguments((Bundle)linkDialogFragment);
        this.mLinkDialogFragment.show(this.getChildFragmentManager(), "link");
    }

    public void link() {
        this.addSubscription(this.rainApi.link(this.getAuthorization(), CommonUtils.getDeviceUid((Context)this.getActivity()), this.mOid).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new r3(this, 0), (Action1)new r3(this, 1)));
    }

    @OnClick(value={2131296617})
    public void linkFacebook() {
    }

    @OnClick(value={2131297297})
    public void linkTwitter() {
    }

    @OnClick(value={2131297341})
    public void linkVk() {
    }

    @OnClick(value={2131296760})
    public void logout() {
        if (this.getActivity() != null && this.getActivity() instanceof MainActivity) {
            ((MainActivity)this.getActivity()).logout();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.mListener = (OnFragmentInteractionListener)activity;
            return;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.toString());
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492976, viewGroup, false);
        this.unbinder = ButterKnife.bind((Object)this, (View)layoutInflater);
        this.mHandler = new Handler((Handler.Callback)new q3(this));
        try {
            viewGroup = this.getActivity().getPackageManager().getPackageInfo(this.getActivity().getApplicationContext().getPackageName(), 0);
            bundle = this.versionView;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("v. ");
            stringBuilder.append(String.valueOf((Object)viewGroup.versionName));
            bundle.setText((CharSequence)stringBuilder.toString());
            return layoutInflater;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return layoutInflater;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialogFragment) {
        this.mLinkDialogFragment.dismiss();
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialogFragment) {
        try {
            this.link();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onPause() {
        this.mHandler.removeCallbacksAndMessages(null);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.mListener.showProgress();
        this.setUserInfo();
    }

    @OnClick(value={2131297076})
    public void save() {
        String string = this.firstnameEditText.getText().toString();
        String string2 = this.lastnameEditText.getText().toString();
        this.addSubscription(this.rainApi.putUserInfo(this.getAuthorization(), string, string2, null, null, null, null, null).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new r3(this, 4), (Action1)new r3(this, 5)));
    }

    @OnClick(value={2131297163})
    public void startlinking() {
        this.addSubscription(this.rainApi.startlinking(this.getAuthorization(), "New year").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new r3(this, 3), (Action1)new v1(20)));
    }
}

