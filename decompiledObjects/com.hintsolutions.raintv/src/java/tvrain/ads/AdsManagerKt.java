/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package tvrain.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"fbTestDevice1", "", "getFbTestDevice1", "()Ljava/lang/String;", "fbTestDevice2", "getFbTestDevice2", "googleTestDevice1", "getGoogleTestDevice1", "googleTestDevice2", "getGoogleTestDevice2", "loadFacebookAd", "", "getLoadFacebookAd", "()Z", "setLoadFacebookAd", "(Z)V", "transitionsCounter", "", "getTransitionsCounter", "()I", "setTransitionsCounter", "(I)V", "app_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class AdsManagerKt {
    @NotNull
    private static final String fbTestDevice1 = "603f6bac6a540b29c48bddc91553d5e5";
    @NotNull
    private static final String fbTestDevice2 = "263618230328502e14872a9d05176075";
    @NotNull
    private static final String googleTestDevice1 = "2B977B6EA518A8D430B33BAA2C09AAD8";
    @NotNull
    private static final String googleTestDevice2 = "C12F0CDF46EFFBE3C8E3DD38E18C6DEB";
    private static boolean loadFacebookAd;
    private static int transitionsCounter;

    @NotNull
    public static final String getFbTestDevice1() {
        return fbTestDevice1;
    }

    @NotNull
    public static final String getFbTestDevice2() {
        return fbTestDevice2;
    }

    @NotNull
    public static final String getGoogleTestDevice1() {
        return googleTestDevice1;
    }

    @NotNull
    public static final String getGoogleTestDevice2() {
        return googleTestDevice2;
    }

    public static final boolean getLoadFacebookAd() {
        return loadFacebookAd;
    }

    public static final int getTransitionsCounter() {
        return transitionsCounter;
    }

    public static final void setLoadFacebookAd(boolean bl) {
        loadFacebookAd = bl;
    }

    public static final void setTransitionsCounter(int n3) {
        transitionsCounter = n3;
    }
}

