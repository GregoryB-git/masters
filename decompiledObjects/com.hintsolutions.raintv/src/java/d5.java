/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.util.Util
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 */
import com.google.android.exoplayer2.util.Util;
import java.util.concurrent.ThreadFactory;

public final class d5
implements ThreadFactory {
    public final String a;

    public /* synthetic */ d5(String string2) {
        this.a = string2;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.a((String)this.a, (Runnable)runnable);
    }
}

