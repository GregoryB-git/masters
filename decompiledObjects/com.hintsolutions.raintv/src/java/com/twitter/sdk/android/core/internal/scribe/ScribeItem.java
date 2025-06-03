/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.core.models.User
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.User;
import java.io.Serializable;

public class ScribeItem
implements Serializable {
    public static final int TYPE_MESSAGE = 6;
    public static final int TYPE_TWEET = 0;
    public static final int TYPE_USER = 3;
    @SerializedName(value="card_event")
    public final CardEvent cardEvent;
    @SerializedName(value="description")
    public final String description;
    @SerializedName(value="id")
    public final Long id;
    @SerializedName(value="item_type")
    public final Integer itemType;
    @SerializedName(value="media_details")
    public final MediaDetails mediaDetails;

    private ScribeItem(Integer n, Long l, String string2, CardEvent cardEvent, MediaDetails mediaDetails) {
        this.itemType = n;
        this.id = l;
        this.description = string2;
        this.cardEvent = cardEvent;
        this.mediaDetails = mediaDetails;
    }

    public /* synthetic */ ScribeItem(Integer n, Long l, String string2, CardEvent cardEvent, MediaDetails mediaDetails, 1 var6_6) {
        this(n, l, string2, cardEvent, mediaDetails);
    }

    public static MediaDetails createCardDetails(long l, Card card) {
        return new MediaDetails(l, 4, Long.valueOf((String)VineCardUtils.getPublisherId(card)));
    }

    public static MediaDetails createMediaDetails(long l, MediaEntity mediaEntity) {
        return new MediaDetails(l, ScribeItem.getMediaType(mediaEntity), mediaEntity.id);
    }

    public static ScribeItem fromMediaEntity(long l, MediaEntity mediaEntity) {
        return new Builder().setItemType(0).setId(l).setMediaDetails(ScribeItem.createMediaDetails(l, mediaEntity)).build();
    }

    public static ScribeItem fromMessage(String string2) {
        return new Builder().setItemType(6).setDescription(string2).build();
    }

    public static ScribeItem fromTweet(Tweet tweet) {
        return new Builder().setItemType(0).setId(tweet.id).build();
    }

    public static ScribeItem fromTweetCard(long l, Card card) {
        return new Builder().setItemType(0).setId(l).setMediaDetails(ScribeItem.createCardDetails(l, card)).build();
    }

    public static ScribeItem fromUser(User user) {
        return new Builder().setItemType(3).setId(user.id).build();
    }

    public static int getMediaType(MediaEntity mediaEntity) {
        if ("animated_gif".equals((Object)mediaEntity.type)) {
            return 3;
        }
        return 1;
    }

    public boolean equals(Object object) {
        block8: {
            boolean bl;
            block10: {
                block11: {
                    block9: {
                        bl = true;
                        if (this == object) {
                            return true;
                        }
                        if (object == null || this.getClass() != object.getClass()) break block8;
                        object = (ScribeItem)object;
                        Object object2 = this.itemType;
                        if (object2 != null ? !object2.equals((Object)((ScribeItem)object).itemType) : ((ScribeItem)object).itemType != null) {
                            return false;
                        }
                        object2 = this.id;
                        if (object2 != null ? !object2.equals((Object)((ScribeItem)object).id) : ((ScribeItem)object).id != null) {
                            return false;
                        }
                        object2 = this.description;
                        if (object2 != null ? !object2.equals((Object)((ScribeItem)object).description) : ((ScribeItem)object).description != null) {
                            return false;
                        }
                        object2 = this.cardEvent;
                        if (object2 != null ? !((CardEvent)object2).equals(((ScribeItem)object).cardEvent) : ((ScribeItem)object).cardEvent != null) {
                            return false;
                        }
                        object2 = this.mediaDetails;
                        object = ((ScribeItem)object).mediaDetails;
                        if (object2 == null) break block9;
                        if (((MediaDetails)object2).equals(object)) break block10;
                        break block11;
                    }
                    if (object == null) break block10;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        Object object = this.itemType;
        int n = 0;
        int n2 = object != null ? object.hashCode() : 0;
        object = this.id;
        int n3 = object != null ? object.hashCode() : 0;
        object = this.description;
        int n4 = object != null ? object.hashCode() : 0;
        object = this.cardEvent;
        int n5 = object != null ? ((CardEvent)object).hashCode() : 0;
        object = this.mediaDetails;
        if (object != null) {
            n = ((MediaDetails)object).hashCode();
        }
        return (((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n;
    }

    public static class Builder {
        private CardEvent cardEvent;
        private String description;
        private Long id;
        private Integer itemType;
        private MediaDetails mediaDetails;

        public ScribeItem build() {
            return new ScribeItem(this.itemType, this.id, this.description, this.cardEvent, this.mediaDetails, null);
        }

        public Builder setCardEvent(CardEvent cardEvent) {
            this.cardEvent = cardEvent;
            return this;
        }

        public Builder setDescription(String string2) {
            this.description = string2;
            return this;
        }

        public Builder setId(long l) {
            this.id = l;
            return this;
        }

        public Builder setItemType(int n) {
            this.itemType = n;
            return this;
        }

        public Builder setMediaDetails(MediaDetails mediaDetails) {
            this.mediaDetails = mediaDetails;
            return this;
        }
    }

    public static class CardEvent
    implements Serializable {
        @SerializedName(value="promotion_card_type")
        public final int promotionCardType;

        public CardEvent(int n) {
            this.promotionCardType = n;
        }

        public boolean equals(Object object) {
            boolean bl = true;
            if (this == object) {
                return true;
            }
            if (object != null && this.getClass() == object.getClass()) {
                object = (CardEvent)object;
                if (this.promotionCardType != ((CardEvent)object).promotionCardType) {
                    bl = false;
                }
                return bl;
            }
            return false;
        }

        public int hashCode() {
            return this.promotionCardType;
        }
    }

    public static class MediaDetails
    implements Serializable {
        public static final String GIF_TYPE = "animated_gif";
        public static final int TYPE_AMPLIFY = 2;
        public static final int TYPE_ANIMATED_GIF = 3;
        public static final int TYPE_CONSUMER = 1;
        public static final int TYPE_VINE = 4;
        @SerializedName(value="content_id")
        public final long contentId;
        @SerializedName(value="media_type")
        public final int mediaType;
        @SerializedName(value="publisher_id")
        public final long publisherId;

        public MediaDetails(long l, int n, long l2) {
            this.contentId = l;
            this.mediaType = n;
            this.publisherId = l2;
        }

        public boolean equals(Object object) {
            boolean bl = true;
            if (this == object) {
                return true;
            }
            if (object != null && this.getClass() == object.getClass()) {
                object = (MediaDetails)object;
                if (this.contentId != ((MediaDetails)object).contentId) {
                    return false;
                }
                if (this.mediaType != ((MediaDetails)object).mediaType) {
                    return false;
                }
                if (this.publisherId != ((MediaDetails)object).publisherId) {
                    bl = false;
                }
                return bl;
            }
            return false;
        }

        public int hashCode() {
            long l = this.contentId;
            int n = (int)(l ^ l >>> 32);
            int n2 = this.mediaType;
            l = this.publisherId;
            return (n * 31 + n2) * 31 + (int)(l >>> 32 ^ l);
        }
    }
}

