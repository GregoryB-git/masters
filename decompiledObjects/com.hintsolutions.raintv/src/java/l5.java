/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioFocusRequest
 *  android.media.AudioManager
 *  android.telephony.CellSignalStrengthLte
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.Window$Callback
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.telephony.CellSignalStrengthLte;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import java.util.Collection;

public final class l5 {
    public static /* bridge */ /* synthetic */ float a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static /* bridge */ /* synthetic */ int b(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssnr();
    }

    public static /* bridge */ /* synthetic */ Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n) {
        return context.registerReceiver(broadcastReceiver, intentFilter, n);
    }

    public static /* bridge */ /* synthetic */ void d(int n, View view) {
        view.setNextClusterForwardId(n);
    }

    public static /* bridge */ /* synthetic */ void e(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ void f(View view, Collection collection, int n) {
        view.addKeyboardNavigationClusters(collection, n);
    }

    public static /* bridge */ /* synthetic */ void g(View view, String[] stringArray) {
        view.setAutofillHints(stringArray);
    }

    public static /* bridge */ /* synthetic */ void h(Window.Callback callback, boolean bl) {
        callback.onPointerCaptureChanged(bl);
    }

    public static /* bridge */ /* synthetic */ boolean i(View view) {
        return view.isFocusedByDefault();
    }

    public static /* bridge */ /* synthetic */ float j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static /* bridge */ /* synthetic */ int k(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getCqi();
    }

    public static /* bridge */ /* synthetic */ void l(int n, View view) {
        view.setImportantForAutofill(n);
    }

    public static /* bridge */ /* synthetic */ boolean m(View view) {
        return view.hasExplicitFocusable();
    }

    public static /* bridge */ /* synthetic */ int n(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRsrq();
    }

    public static /* bridge */ /* synthetic */ boolean o(View view) {
        return view.isKeyboardNavigationCluster();
    }
}

