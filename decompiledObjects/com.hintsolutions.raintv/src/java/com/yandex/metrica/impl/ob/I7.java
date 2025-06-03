/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.io.FileUtils;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.W8;
import com.yandex.metrica.impl.ob.Z6;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.a7;
import com.yandex.metrica.impl.ob.d7;
import com.yandex.metrica.impl.ob.h7;
import com.yandex.metrica.impl.ob.o6;
import java.io.File;
import java.io.FilenameFilter;

@Deprecated
public class i7
implements Z6<File> {
    @NonNull
    private final Context a;
    @Nullable
    private final File b;
    @NonNull
    private final W8 c;
    @NonNull
    private final B0 d;
    @NonNull
    private final d7 e;
    @NonNull
    private final a7<String> f;
    @NonNull
    private final ICommonExecutor g;

    @VisibleForTesting
    public i7(@NonNull Context context, @NonNull B0 b0, @NonNull d7 d72, @NonNull a7<String> a72, @NonNull ICommonExecutor iCommonExecutor, @NonNull W8 w82) {
        this.a = context;
        this.d = b0;
        this.b = b0.b(context);
        this.e = d72;
        this.f = a72;
        this.g = iCommonExecutor;
        this.c = w82;
    }

    @Override
    private void a(@Nullable File fileArray) {
        int n2 = 0;
        if (fileArray != null && fileArray.exists()) {
            if ((fileArray = fileArray.listFiles((FilenameFilter)new h7(this))) == null) {
                fileArray = new File[]{};
            }
        } else {
            fileArray = new File[]{};
        }
        int n3 = fileArray.length;
        while (n2 < n3) {
            File file = fileArray[n2];
            c c5 = new c(this.f);
            this.g.execute(new o6<String>(file, this.e, new a(), c5));
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        i7 i72 = this;
        synchronized (i72) {
            block5: {
                File file;
                block6: {
                    if (!FileUtils.needToUseNoBackup() || (file = this.d.b(this.a.getFilesDir(), "YandexMetricaNativeCrashes")) == null) break block5;
                    if (!this.c.o()) break block6;
                    boolean bl2 = file.exists();
                    if (!bl2) break block5;
                    try {
                        file.delete();
                    }
                    catch (Throwable throwable) {}
                }
                this.a(file);
                this.c.p();
            }
            this.a(this.b);
            return;
        }
    }

    @Override
    public void a(@NonNull Object object) {
        File file = (File)object;
        object = new b(this.f);
        this.g.execute(new o6<String>(file, this.e, new a(), (Zl<String>)object));
    }

    public static class a
    implements Zl<File> {
        @Override
        public void b(@NonNull Object object) {
            ((File)object).delete();
        }
    }

    public static class b
    implements Zl<String> {
        @NonNull
        private final a7<String> a;

        public b(@NonNull a7<String> a72) {
            this.a = a72;
        }

        @Override
        public void b(@NonNull Object object) {
            if (!TextUtils.isEmpty((CharSequence)(object = (String)object))) {
                this.a.b((String)object);
            }
        }
    }

    public static class c
    implements Zl<String> {
        @NonNull
        private final a7<String> a;

        public c(@NonNull a7<String> a72) {
            this.a = a72;
        }

        @Override
        public void b(@NonNull Object object) {
            if (!TextUtils.isEmpty((CharSequence)(object = (String)object))) {
                this.a.a((String)object);
            }
        }
    }
}

