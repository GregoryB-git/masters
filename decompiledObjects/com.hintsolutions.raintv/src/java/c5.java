/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 *  okhttp3.internal.Util
 */
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

public final class c5
implements ThreadFactory {
    public final String a;
    public final boolean b;

    public /* synthetic */ c5(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.a((String)this.a, (boolean)this.b, (Runnable)runnable);
    }
}

