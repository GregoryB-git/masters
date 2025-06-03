/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.activity.ComponentActivity
 *  androidx.lifecycle.SavedStateHandle
 *  androidx.savedstate.SavedStateRegistry$SavedStateProvider
 *  java.lang.Object
 */
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;

public final class d4
implements SavedStateRegistry.SavedStateProvider {
    public final int a;
    public final Object b;

    public /* synthetic */ d4(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final Bundle saveState() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return SavedStateHandle.a((SavedStateHandle)((SavedStateHandle)this.b));
            }
            case 0: {
                return SavedStateHandle.a((SavedStateHandle)((SavedStateHandle)this.b));
            }
        }
        return ComponentActivity.b((ComponentActivity)((ComponentActivity)this.b));
    }
}

