/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  okhttp3.ResponseBody
 *  rx.functions.Action1
 */
package com.hintsolutions.raintv.profile;

import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.profile.AuthorizationActivity;
import com.hintsolutions.raintv.profile.SavedVideosFragment;
import java.io.File;
import okhttp3.ResponseBody;
import rx.functions.Action1;

public final class b
implements TaskCallback,
Action1 {
    public final Object a;
    public final Object b;

    public /* synthetic */ b(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final void call(Object object) {
        SavedVideosFragment.e((SavedVideosFragment)((Object)this.a), (File)this.b, (ResponseBody)object);
    }

    @Override
    public final void onActionCompleted() {
        AuthorizationActivity.finishSocialLogin.1.a((AuthorizationActivity)this.a, (String)this.b);
    }
}

