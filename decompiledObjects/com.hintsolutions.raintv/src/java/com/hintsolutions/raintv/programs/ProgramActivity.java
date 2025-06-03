/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.widget.TextView
 *  androidx.fragment.app.Fragment
 *  butterknife.BindView
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.utils.PojoHelper
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.services.bus.BusProvider
 */
package com.hintsolutions.raintv.programs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.programs.TeleshowFragment;
import com.hintsolutions.raintv.programs.TeleshowInfoActivity;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.utils.PojoHelper;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.services.bus.BusProvider;

public class ProgramActivity
extends BaseActivity {
    private int mId;
    private Program mProgram;
    private Menu menu;
    @BindView(value=2131297172)
    public TextView subscriptionBar;

    public static /* synthetic */ void A(ProgramActivity programActivity) {
        programActivity.lambda$onOptionsItemSelected$0();
    }

    public static /* synthetic */ void B(ProgramActivity programActivity, ResponseBody responseBody) {
        programActivity.lambda$getPrograms$1(responseBody);
    }

    private void getPrograms() {
        this.addSubscription(this.rainApi.programsById(this.getAuthorization(), null, null, String.valueOf((int)this.mId)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new s4(this, 10), (Action1)new v1(21)));
    }

    private /* synthetic */ void lambda$getPrograms$1(ResponseBody responseBody) {
        this.mProgram = (Program)PojoHelper.objectFromResponse((ResponseBody)responseBody, (int)this.mId, Program.class);
        this.updateMenuFavorite();
    }

    private static /* synthetic */ void lambda$getPrograms$2(Throwable throwable) {
    }

    private /* synthetic */ void lambda$onOptionsItemSelected$0() {
        this.updateMenuFavorite();
    }

    private void openInfoActivity() {
        if (this.mProgram != null) {
            Intent intent = new Intent((Context)this, TeleshowInfoActivity.class);
            Program program = this.mProgram;
            String string = program.detail_text;
            if (string == null) {
                string = program.preview_text;
            }
            intent.putExtra("text", string);
            this.startActivity(intent);
        }
    }

    private void updateMenuFavorite() {
        if (this.mProgram != null) {
            MenuItem menuItem = this.menu.findItem(2131296312);
            int n4 = this.mProgram.isFavorite() ? 2131231293 : 2131231292;
            menuItem.setIcon(n4);
        }
    }

    public static /* synthetic */ void z(Throwable throwable) {
        ProgramActivity.lambda$getPrograms$2(throwable);
    }

    @Override
    public int getLayoutResource() {
        return 2131492904;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mId = this.getIntent().getIntExtra("id", 0);
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.getSupportFragmentManager().beginTransaction().replace(2131296501, (Fragment)TeleshowFragment.newInstance(this.mId, true)).commitAllowingStateLoss();
        this.getPrograms();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        this.getMenuInflater().inflate(2131558404, menu);
        this.updateMenuFavorite();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n4 = menuItem.getItemId();
        if (n4 != 2131296312) {
            if (n4 != 2131296324) {
                return super.onOptionsItemSelected(menuItem);
            }
            this.openInfoActivity();
            return true;
        }
        this.toggleProgramFav(this.mProgram, true, new h0(this, 6));
        return true;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}

