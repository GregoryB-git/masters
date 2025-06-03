/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.concurrent.ExecutorsRegistrar
 *  com.google.firebase.inject.Provider
 *  java.lang.Object
 */
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;

public final class k1
implements Provider {
    public final int a;

    public /* synthetic */ k1(int n4) {
        this.a = n4;
    }

    public final Object get() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return ExecutorsRegistrar.c();
            }
            case 1: {
                return ExecutorsRegistrar.d();
            }
            case 0: {
                return ExecutorsRegistrar.g();
            }
        }
        return ExecutorsRegistrar.b();
    }
}

