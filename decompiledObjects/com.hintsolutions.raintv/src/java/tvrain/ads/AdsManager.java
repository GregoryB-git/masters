/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.ads;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.ads.AdsManagerKt;
import tvrain.managers.UserManager;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Ltvrain/ads/AdsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "userManager", "Ltvrain/managers/UserManager;", "destroyAds", "", "incrementTransitionsCounter", "loadFacebookInterstitialAd", "loadGoogleInterstitialAd", "requestNewInterstitial", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class AdsManager {
    @NotNull
    private final Context context;
    @Nullable
    private UserManager userManager;

    public AdsManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        this.context = context;
    }

    private final void destroyAds() {
    }

    private final void loadFacebookInterstitialAd() {
    }

    private final void loadGoogleInterstitialAd() {
    }

    private final void requestNewInterstitial() {
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void incrementTransitionsCounter(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter((Object)userManager, (String)"userManager");
        this.userManager = userManager;
        AdsManagerKt.setTransitionsCounter(AdsManagerKt.getTransitionsCounter() + 1);
        if (AdsManagerKt.getTransitionsCounter() % 5 == 1) {
            if (AdsManagerKt.getLoadFacebookAd()) {
                AdsManagerKt.setLoadFacebookAd(false);
                try {
                    this.loadFacebookInterstitialAd();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            } else {
                AdsManagerKt.setLoadFacebookAd(true);
                try {
                    this.loadGoogleInterstitialAd();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}

