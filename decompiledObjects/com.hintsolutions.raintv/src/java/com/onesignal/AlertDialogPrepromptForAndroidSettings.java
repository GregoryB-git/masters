/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  com.onesignal.R$string
 *  j
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.onesignal.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\r"}, d2={"Lcom/onesignal/AlertDialogPrepromptForAndroidSettings;", "", "()V", "show", "", "activity", "Landroid/app/Activity;", "titlePrefix", "", "previouslyDeniedPostfix", "callback", "Lcom/onesignal/AlertDialogPrepromptForAndroidSettings$Callback;", "Callback", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class AlertDialogPrepromptForAndroidSettings {
    @NotNull
    public static final AlertDialogPrepromptForAndroidSettings INSTANCE = new AlertDialogPrepromptForAndroidSettings();

    private AlertDialogPrepromptForAndroidSettings() {
    }

    public static /* synthetic */ void a(Callback callback, DialogInterface dialogInterface, int n) {
        AlertDialogPrepromptForAndroidSettings.show$lambda-1(callback, dialogInterface, n);
    }

    public static /* synthetic */ void b(Callback callback, DialogInterface dialogInterface, int n) {
        AlertDialogPrepromptForAndroidSettings.show$lambda-0(callback, dialogInterface, n);
    }

    private static final void show$lambda-0(Callback callback, DialogInterface dialogInterface, int n) {
        Intrinsics.checkNotNullParameter((Object)callback, (String)"$callback");
        callback.onAccept();
    }

    private static final void show$lambda-1(Callback callback, DialogInterface dialogInterface, int n) {
        Intrinsics.checkNotNullParameter((Object)callback, (String)"$callback");
        callback.onDecline();
    }

    public final void show(@NotNull Activity activity, @NotNull String string2, @NotNull String string3, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"titlePrefix");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"previouslyDeniedPostfix");
        Intrinsics.checkNotNullParameter((Object)callback, (String)"callback");
        String string4 = activity.getString(R.string.permission_not_available_title);
        Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"activity.getString(R.str\u2026sion_not_available_title)");
        string2 = String.format((String)string4, (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"java.lang.String.format(this, *args)");
        string4 = activity.getString(R.string.permission_not_available_message);
        Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"activity.getString(R.str\u2026on_not_available_message)");
        string3 = String.format((String)string4, (Object[])Arrays.copyOf((Object[])new Object[]{string3}, (int)1));
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"java.lang.String.format(this, *args)");
        new AlertDialog.Builder((Context)activity).setTitle((CharSequence)string2).setMessage((CharSequence)string3).setPositiveButton(R.string.permission_not_available_open_settings_option, (DialogInterface.OnClickListener)new j(callback, 0)).setNegativeButton(17039369, (DialogInterface.OnClickListener)new j(callback, 1)).show();
    }

    @Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2={"Lcom/onesignal/AlertDialogPrepromptForAndroidSettings$Callback;", "", "onAccept", "", "onDecline", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static interface Callback {
        public void onAccept();

        public void onDecline();
    }
}

