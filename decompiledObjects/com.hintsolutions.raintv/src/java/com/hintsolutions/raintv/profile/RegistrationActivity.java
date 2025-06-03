/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.widget.EditText
 *  android.widget.Toast
 *  butterknife.BindView
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  ru.tvrain.core.data.RainUser
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.profile;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.utils.CommonUtils;
import ru.tvrain.core.data.RainUser;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class RegistrationActivity
extends BaseActivity {
    @BindView(value=2131296580)
    public EditText emailEditText;
    @BindView(value=2131296629)
    public EditText firstnameEditText;
    @BindView(value=2131296998)
    public EditText password1EditText;
    @BindView(value=2131296999)
    public EditText password2EditText;

    public static /* synthetic */ void A(RegistrationActivity registrationActivity, Throwable throwable) {
        registrationActivity.lambda$registration$1(throwable);
    }

    private /* synthetic */ void lambda$registration$0(RainUser rainUser) {
        try {
            this.trackCompleteRegister(rainUser);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.userManager.authorize(rainUser);
        this.setResult(-1);
        this.tagManager.logOpenView("Register/success");
        this.finish();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$registration$1(Throwable object) {
        void var1_10;
        block8: {
            String string = "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f.";
            try {
                String string2 = this.getRetrofitErrorMessage((Throwable)object);
                if (string2.contains((CharSequence)"[firstname]")) {
                    String string3 = "\u041d\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u0438\u043c\u044f.";
                    break block8;
                }
                if (string2.contains((CharSequence)"[email]")) {
                    String string4 = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 e-mail.";
                    break block8;
                }
                if (string2.contains((CharSequence)"[password1]")) {
                    String string5 = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u043f\u0430\u0440\u043e\u043b\u044c.";
                    break block8;
                }
                if (string2.contains((CharSequence)"[password2]")) {
                    String string6 = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u043f\u043e\u0432\u0442\u043e\u0440\u044b\u0439 \u043f\u0430\u0440\u043e\u043b\u044c.";
                    break block8;
                }
                if (string2.contains((CharSequence)"\u0443\u0436\u0435 \u0437\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d")) {
                    String string7 = "\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c \u0443\u0436\u0435 \u0437\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d";
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f.");
                    stringBuilder.append(string2);
                    String string8 = stringBuilder.toString();
                }
            }
            catch (Exception exception) {
                String string9 = string;
            }
        }
        Toast.makeText((Context)this, (CharSequence)var1_10, (int)1).show();
        this.tagManager.logError("Register", "registration", (String)var1_10);
    }

    private void trackCompleteRegister(RainUser rainUser) {
    }

    private boolean validate() {
        boolean bl;
        block2: {
            bl = TextUtils.isEmpty((CharSequence)CommonUtils.getStringFromEditText(this.firstnameEditText)) ^ true;
            boolean bl2 = TextUtils.isEmpty((CharSequence)CommonUtils.getStringFromEditText(this.emailEditText));
            boolean bl3 = false;
            if (bl2) {
                bl = false;
            }
            if (TextUtils.isEmpty((CharSequence)CommonUtils.getStringFromEditText(this.password1EditText))) {
                bl = false;
            }
            if (!TextUtils.isEmpty((CharSequence)CommonUtils.getStringFromEditText(this.password2EditText))) break block2;
            bl = bl3;
        }
        return bl;
    }

    public static /* synthetic */ void z(RegistrationActivity registrationActivity, RainUser rainUser) {
        registrationActivity.lambda$registration$0(rainUser);
    }

    @Override
    public int getLayoutResource() {
        return 2131492907;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.tagManager.logOpenView("Registration");
    }

    @OnClick(value={2131297053})
    public void registration() {
        if (this.validate()) {
            Object object = this.firstnameEditText.getText().toString();
            Object object2 = this.emailEditText.getText().toString();
            String string = this.password1EditText.getText().toString();
            String string2 = this.password2EditText.getText().toString();
            try {
                string = this.rainApi.registration(this.getAuthorization(), (String)object, (String)object2, string, string2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                object = new b4(this, 0);
                object2 = new b4(this, 1);
                this.addSubscription(string.subscribe((Action1)object, (Action1)object2));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

