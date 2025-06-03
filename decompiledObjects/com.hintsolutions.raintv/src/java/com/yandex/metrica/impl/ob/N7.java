/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.B7;
import com.yandex.metrica.impl.ob.C7;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Yl;
import com.yandex.metrica.impl.ob.i4;
import com.yandex.metrica.impl.ob.m7;
import com.yandex.metrica.impl.ob.p7;
import com.yandex.metrica.impl.ob.z7;

class n7
implements Yl<String, Bundle, m7> {
    @NonNull
    private final z7 a;
    @NonNull
    private final C7 b;

    public n7() {
        this(new z7(), new C7());
    }

    @VisibleForTesting
    public n7(@NonNull z7 z72, @NonNull C7 c72) {
        this.a = z72;
        this.b = c72;
    }

    @Override
    public m7 a(@NonNull String object, @NonNull Bundle object2) {
        i4 i42;
        Object object3;
        object3 = TextUtils.isEmpty((CharSequence)object) || !object2.containsKey("arg_df") || !object2.containsKey("arg_ct") || TextUtils.isEmpty((CharSequence)(object3 = object2.getString("arg_df"))) ? null : new p7((String)object, (String)object3, object2.getLong("arg_ct"));
        if (object3 != null && !TextUtils.isEmpty((CharSequence)(object = object2.getString("arg_cd"))) && (i42 = this.a.a((String)object)) != null) {
            Object object4;
            block12: {
                object4 = this.b;
                object2 = object2.getString("arg_rc");
                object = object2;
                if (object2 == null) {
                    object = "";
                }
                object4.getClass();
                object4 = new String(Base64.decode((String)object, (int)0));
                object2 = new Gl.a((String)object4);
                object4 = object2.optString("arg_ee", "");
                object = object2.has("arg_hv") ? object2.getString("arg_hv") : null;
                object2 = object4;
                if (TextUtils.isEmpty((CharSequence)object4)) {
                    object2 = null;
                }
                object4 = object;
                if (!TextUtils.isEmpty((CharSequence)object)) break block12;
                object4 = null;
            }
            try {
                B7 b72 = new B7((String)object2, (String)object4);
                object = b72;
            }
            catch (Exception exception) {
                try {
                    object = new B7(null, null);
                }
                catch (Exception exception2) {
                    object = new B7(null, null);
                }
            }
            return new m7((p7)object3, i42, (B7)object);
        }
        return null;
    }
}

