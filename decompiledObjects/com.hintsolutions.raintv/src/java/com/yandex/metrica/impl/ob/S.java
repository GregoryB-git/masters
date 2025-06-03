/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Nl;
import com.yandex.metrica.impl.ob.Om;
import com.yandex.metrica.impl.ob.Pl;
import java.util.Map;

public class s {
    private Nl a;
    private long b;
    private boolean c;
    @NonNull
    private final Om d;

    @VisibleForTesting
    public s(String string, long l8, @NonNull Om om2) {
        this.b = l8;
        try {
            Nl nl2;
            this.a = nl2 = new Nl(string);
        }
        catch (Throwable throwable) {
            this.a = new Nl();
        }
        this.d = om2;
    }

    public s(String string, long l8, @NonNull Pl pl2) {
        this(string, l8, new Om(pl2, "[App Environment]"));
    }

    public a a() {
        s s3 = this;
        synchronized (s3) {
            if (this.c) {
                ++this.b;
                this.c = false;
            }
            a a2 = new a(Gl.g((Map)this.a), this.b);
            return a2;
        }
    }

    public void a(@NonNull Pair<String, String> pair) {
        s s3 = this;
        synchronized (s3) {
            if (this.d.b(this.a, (String)pair.first, (String)pair.second)) {
                this.c = true;
            }
            return;
        }
    }

    public void b() {
        s s3 = this;
        synchronized (s3) {
            Nl nl2;
            this.a = nl2 = new Nl();
            return;
        }
    }

    public String toString() {
        s s3 = this;
        synchronized (s3) {
            Object object = new StringBuilder("Map size ");
            object.append(this.a.size());
            object.append(". Is changed ");
            object.append(this.c);
            object.append(". Current revision ");
            object.append(this.b);
            object = object.toString();
            return object;
        }
    }

    public static final class a {
        public final String a;
        public final long b;

        public a(String string, long l8) {
            this.a = string;
            this.b = l8;
        }

        public boolean equals(Object object) {
            block5: {
                boolean bl;
                block7: {
                    block8: {
                        Object object2;
                        block6: {
                            bl = true;
                            if (this == object) {
                                return true;
                            }
                            if (object == null || a.class != object.getClass()) break block5;
                            object2 = (a)object;
                            if (this.b != ((a)object2).b) {
                                return false;
                            }
                            object = this.a;
                            object2 = ((a)object2).a;
                            if (object == null) break block6;
                            if (object.equals(object2)) break block7;
                            break block8;
                        }
                        if (object2 == null) break block7;
                    }
                    bl = false;
                }
                return bl;
            }
            return false;
        }

        public int hashCode() {
            String string = this.a;
            int n4 = string != null ? string.hashCode() : 0;
            long l8 = this.b;
            return n4 * 31 + (int)(l8 ^ l8 >>> 32);
        }
    }
}

