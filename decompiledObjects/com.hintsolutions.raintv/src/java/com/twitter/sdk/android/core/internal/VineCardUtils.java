/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.ImageValue;
import com.twitter.sdk.android.core.models.UserValue;

public class VineCardUtils {
    public static final String PLAYER_CARD = "player";
    public static final String VINE_CARD = "vine";
    public static final long VINE_USER_ID = 586671909L;

    private VineCardUtils() {
    }

    public static ImageValue getImageValue(Card card) {
        return (ImageValue)card.bindingValues.get("player_image");
    }

    public static String getPublisherId(Card card) {
        return ((UserValue)card.bindingValues.get((String)"site")).idStr;
    }

    public static String getStreamUrl(Card card) {
        return (String)card.bindingValues.get("player_stream_url");
    }

    public static boolean isVine(Card card) {
        boolean bl = (PLAYER_CARD.equals((Object)card.name) || VINE_CARD.equals((Object)card.name)) && VineCardUtils.isVineUser(card);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean isVineUser(Card object) {
        object = (UserValue)((Card)object).bindingValues.get("site");
        if (object == null) return false;
        try {
            long l = Long.parseLong((String)((UserValue)object).idStr);
            if (l != 586671909L) return false;
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}

