/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.twitter.sdk.android.core.models.User
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.core.internal;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.User;

public final class UserUtils {
    private UserUtils() {
    }

    public static CharSequence formatScreenName(CharSequence charSequence) {
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            return "";
        }
        if (charSequence.charAt(0) == '@') {
            return charSequence;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        stringBuilder.append((Object)charSequence);
        return stringBuilder.toString();
    }

    public static String getProfileImageUrlHttps(User object, AvatarSize avatarSize) {
        String string2;
        if (object != null && (string2 = object.profileImageUrlHttps) != null) {
            object = string2;
            if (avatarSize != null) {
                if (string2 == null) {
                    object = string2;
                } else {
                    int n = 1.$SwitchMap$com$twitter$sdk$android$core$internal$UserUtils$AvatarSize[avatarSize.ordinal()];
                    if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5) {
                        return string2;
                    }
                    object = string2.replace((CharSequence)AvatarSize.NORMAL.getSuffix(), (CharSequence)avatarSize.getSuffix());
                }
            }
            return object;
        }
        return null;
    }

    public static final class AvatarSize
    extends Enum<AvatarSize> {
        private static final AvatarSize[] $VALUES;
        public static final /* enum */ AvatarSize BIGGER;
        public static final /* enum */ AvatarSize MINI;
        public static final /* enum */ AvatarSize NORMAL;
        public static final /* enum */ AvatarSize ORIGINAL;
        public static final /* enum */ AvatarSize REASONABLY_SMALL;
        private final String suffix;

        static {
            AvatarSize avatarSize;
            AvatarSize avatarSize2;
            AvatarSize avatarSize3;
            AvatarSize avatarSize4;
            AvatarSize avatarSize5;
            NORMAL = avatarSize5 = new AvatarSize("_normal");
            BIGGER = avatarSize4 = new AvatarSize("_bigger");
            MINI = avatarSize3 = new AvatarSize("_mini");
            ORIGINAL = avatarSize2 = new AvatarSize("_original");
            REASONABLY_SMALL = avatarSize = new AvatarSize("_reasonably_small");
            $VALUES = new AvatarSize[]{avatarSize5, avatarSize4, avatarSize3, avatarSize2, avatarSize};
        }

        private AvatarSize(String string3) {
            this.suffix = string3;
        }

        public static AvatarSize valueOf(String string2) {
            return (AvatarSize)Enum.valueOf(AvatarSize.class, (String)string2);
        }

        public static AvatarSize[] values() {
            return (AvatarSize[])$VALUES.clone();
        }

        public String getSuffix() {
            return this.suffix;
        }
    }
}

