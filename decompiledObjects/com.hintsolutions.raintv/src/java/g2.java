/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputContentInfo
 *  java.lang.Object
 */
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

public final class g2 {
    public static /* bridge */ /* synthetic */ boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int n, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, n, bundle);
    }
}

