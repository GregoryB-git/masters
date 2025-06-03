/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.yandex.metrica.impl.ob.t7$a
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Arrays
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Callable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.k7;
import com.yandex.metrica.impl.ob.l7;
import com.yandex.metrica.impl.ob.s7;
import com.yandex.metrica.impl.ob.t7;
import com.yandex.metrica.impl.ob.u7;
import com.yandex.metrica.impl.ob.wl;
import com.yandex.metrica.impl.ob.x7;
import com.yandex.metrica.impl.ob.y7;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@RequiresApi(api=21)
public class t7 {
    private static final Set<String> m;
    @NonNull
    private final Context a;
    @NonNull
    private final ICommonExecutor b;
    @Nullable
    private final File c;
    @NonNull
    private final List<String> d;
    @Nullable
    private final File e;
    @Nullable
    private final File f;
    @NonNull
    private final am<Void, String> g;
    @NonNull
    private final wl h;
    @NonNull
    private final s7 i;
    @NonNull
    private final Callable<String> j;
    @NonNull
    private final l7 k;
    @NonNull
    private final B0 l;

    static {
        HashSet hashSet;
        m = hashSet = new HashSet();
        hashSet.add((Object)"armeabi-v7a");
        hashSet.add((Object)"arm64-v8a");
        hashSet.add((Object)"x86");
        hashSet.add((Object)"x86_64");
    }

    private t7(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor, @NonNull List<String> list, @NonNull B0 b0, @Nullable File file, @Nullable File file2, @NonNull am<Void, String> am2, @NonNull Callable<String> callable, @NonNull wl wl2) {
        this(context, iCommonExecutor, list, file, file2, am2, callable, wl2, new s7(context, file2), new l7(), b0);
    }

    @VisibleForTesting
    public t7(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor, @NonNull List<String> list, @Nullable File file, @Nullable File file2, @NonNull am<Void, String> am2, @NonNull Callable<String> callable, @NonNull wl wl2, @NonNull s7 s72, @NonNull l7 l72, @NonNull B0 b0) {
        this.a = context;
        this.b = iCommonExecutor;
        this.d = list;
        this.c = file;
        this.e = context.getCacheDir();
        this.f = file2;
        this.g = am2;
        this.j = callable;
        this.h = wl2;
        this.i = s72;
        this.k = l72;
        this.l = b0;
    }

    public t7(@NonNull Context context, @NonNull B0 b0, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, b0, iCommonExecutor, (List<String>)Arrays.asList((Object[])new String[]{"libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"}));
    }

    private t7(@NonNull Context context, @NonNull B0 b0, @NonNull ICommonExecutor iCommonExecutor, @NonNull List<String> list) {
        this(context, iCommonExecutor, list, b0, b0.a(b0.a(context), (String)list.get(0)), b0.b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), (am<Void, String>)new a(), new Callable<String>(){

            public Object call() throws Exception {
                return CrashpadHelper.getLibDirInsideApk();
            }
        }, new wl(m));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Nullable
    private x7 a() {
        block6: {
            block5: {
                block8: {
                    block7: {
                        var3_1 /* !! */  = this.c;
                        var1_2 = var3_1 /* !! */  == null || !var3_1 /* !! */ .exists();
                        var4_3 = null;
                        if (!var1_2) break block6;
                        SystemClock.elapsedRealtime();
                        var3_1 /* !! */  = new StringBuilder();
                        var3_1 /* !! */ .append("-");
                        var3_1 /* !! */ .append(this.g.a(null));
                        var6_4 = var3_1 /* !! */ .toString();
                        var5_5 = this.h.a();
                        var3_1 /* !! */  = var4_3;
                        if (var5_5 == null) break block5;
                        var3_1 /* !! */  = this.f;
                        if (var3_1 /* !! */  == null) ** GOTO lbl-1000
                        if (!var3_1 /* !! */ .exists()) {
                            ** if (!this.f.mkdirs() || (var3_1 /* !! */  = this.e) == null || !var3_1 /* !! */ .setExecutable((boolean)true, (boolean)false)) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var2_6 = this.f.setExecutable((boolean)true, (boolean)false);
                                ** GOTO lbl27
                            }
                        }
                        break block7;
lbl-1000:
                        // 2 sources

                        {
                            var2_6 = false;
                        }
                        break block8;
                    }
                    var2_6 = true;
                }
                var3_1 /* !! */  = var4_3;
                if (var2_6) {
                    var3_1 /* !! */  = new /* Unavailable Anonymous Inner Class!! */;
                    this.b.execute(new u7(this, (am)var3_1 /* !! */ ));
                    var7_7 = this.d.iterator();
                    do {
                        var3_1 /* !! */  = var4_3;
                        if (!var7_7.hasNext()) break block5;
                        var3_1 /* !! */  = (String)var7_7.next();
                        var3_1 /* !! */  = this.i.a(String.format((String)"lib/%s/%s", (Object[])new Object[]{var5_5, var3_1 /* !! */ }), z2.o((String)var3_1 /* !! */ , var6_4));
                        SystemClock.elapsedRealtime();
                    } while (var3_1 /* !! */  == null);
                    var3_1 /* !! */  = new x7((String)var3_1 /* !! */ , false, null);
                }
            }
            return var3_1 /* !! */ ;
        }
        return new x7(this.c.getAbsolutePath(), false, null);
    }

    @Nullable
    private File c() {
        String string;
        File file = null;
        try {
            string = (String)this.j.call();
        }
        catch (Throwable throwable) {
            string = null;
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.l.getClass();
            file = new File(string);
        }
        return file;
    }

    @VisibleForTesting
    public void a(@NonNull am<File, Boolean> am2) {
        File[] fileArray = this.f;
        if (fileArray == null) {
            return;
        }
        if ((fileArray = fileArray.listFiles()) == null) {
            return;
        }
        for (File file : fileArray) {
            if (!am2.a(file).booleanValue()) continue;
            file.delete();
        }
    }

    @Nullable
    @WorkerThread
    public x7 b() {
        boolean bl = A2.a(29);
        Iterator iterator = null;
        Object object = null;
        if (bl) {
            Object object2;
            block11: {
                File file = this.c();
                object2 = object;
                if (file != null) {
                    iterator = this.d.iterator();
                    do {
                        object2 = object;
                        if (!iterator.hasNext()) break block11;
                        object2 = (String)iterator.next();
                        this.l.getClass();
                    } while (!(object2 = new File(file, (String)object2)).exists());
                    object2 = new x7(object2.getAbsolutePath(), true, null);
                }
            }
            return object2;
        }
        if (A2.a(23)) {
            Object object3;
            block12: {
                object3 = this.k;
                Context context = this.a;
                object = this.h.a();
                object3.getClass();
                try {
                    object3 = y7.a(context, (String)object);
                    object = new k7((String)object3[0], (String)object3[1], Environment.getDataDirectory().getAbsolutePath());
                }
                catch (Throwable throwable) {
                    object = null;
                }
                object3 = iterator;
                if (object != null) {
                    File file = this.c();
                    if (file == null) {
                        object3 = new x7("stub", false, (k7)object);
                    } else {
                        context = this.d.iterator();
                        do {
                            object3 = iterator;
                            if (!context.hasNext()) break block12;
                            object3 = (String)context.next();
                            this.l.getClass();
                        } while (!(object3 = new File(file, (String)object3)).exists());
                        object3 = new x7(object3.getAbsolutePath(), false, (k7)object);
                    }
                }
            }
            if (object3 != null && object3.d != null) {
                object = new /* Unavailable Anonymous Inner Class!! */;
                this.b.execute(new u7(this, (am)object));
                return object3;
            }
            return this.a();
        }
        return this.a();
    }
}

