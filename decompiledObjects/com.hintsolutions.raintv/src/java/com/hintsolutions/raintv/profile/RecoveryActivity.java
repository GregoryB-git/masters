/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
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
 *  okhttp3.ResponseBody
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.profile;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.BaseActivity;
import okhttp3.ResponseBody;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class RecoveryActivity
extends BaseActivity {
    @BindView(value=2131296580)
    public EditText emailEditText;

    public static /* synthetic */ void A(RecoveryActivity recoveryActivity, ResponseBody responseBody) {
        recoveryActivity.lambda$emailPasswAuth$0(responseBody);
    }

    private /* synthetic */ void lambda$emailPasswAuth$0(ResponseBody responseBody) {
        Toast.makeText((Context)this, (CharSequence)"\u0412\u0430\u043c \u043d\u0430 \u043f\u043e\u0447\u0442\u0443 \u0431\u044b\u043b\u043e \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u043e \u043f\u0438\u0441\u044c\u043c\u043e", (int)1).show();
        this.tagManager.logOpenView("LostPassword/success");
        this.finish();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$emailPasswAuth$1(Throwable object) {
        void var1_6;
        String string = "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0432\u043e\u0441\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c.";
        try {
            String string2 = this.getRetrofitErrorMessage((Throwable)object);
            if (string2.contains((CharSequence)"[email]")) {
                String string3 = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 e-mail.";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0432\u043e\u0441\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c.");
                stringBuilder.append(string2);
                String string4 = stringBuilder.toString();
            }
        }
        catch (Exception exception) {
            String string5 = string;
        }
        Toast.makeText((Context)this, (CharSequence)var1_6, (int)1).show();
        this.tagManager.logError("LostPassword", "emailPasswAuth", (String)var1_6);
    }

    public static /* synthetic */ void z(RecoveryActivity recoveryActivity, Throwable throwable) {
        recoveryActivity.lambda$emailPasswAuth$1(throwable);
    }

    @OnClick(value={2131297049})
    public void emailPasswAuth() {
        String string = this.emailEditText.getText().toString();
        this.addSubscription(this.rainApi.passrecovery(string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new a4(this, 0), (Action1)new a4(this, 1)));
    }

    @Override
    public int getLayoutResource() {
        return 2131492906;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.tagManager.logOpenView("LostPassword");
    }
}

