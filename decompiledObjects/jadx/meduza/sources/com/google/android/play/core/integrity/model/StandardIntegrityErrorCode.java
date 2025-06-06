package com.google.android.play.core.integrity.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface StandardIntegrityErrorCode {
    public static final int API_NOT_AVAILABLE = -1;
    public static final int APP_NOT_INSTALLED = -5;
    public static final int APP_UID_MISMATCH = -7;
    public static final int CANNOT_BIND_TO_SERVICE = -9;
    public static final int CLIENT_TRANSIENT_ERROR = -18;
    public static final int CLOUD_PROJECT_NUMBER_IS_INVALID = -16;
    public static final int GOOGLE_SERVER_UNAVAILABLE = -12;
    public static final int INTEGRITY_TOKEN_PROVIDER_INVALID = -19;
    public static final int INTERNAL_ERROR = -100;
    public static final int NETWORK_ERROR = -3;
    public static final int NO_ERROR = 0;
    public static final int PLAY_SERVICES_NOT_FOUND = -6;
    public static final int PLAY_SERVICES_VERSION_OUTDATED = -15;
    public static final int PLAY_STORE_NOT_FOUND = -2;
    public static final int PLAY_STORE_VERSION_OUTDATED = -14;
    public static final int REQUEST_HASH_TOO_LONG = -17;
    public static final int TOO_MANY_REQUESTS = -8;
}
