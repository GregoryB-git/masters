/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.twitter.sdk.android.core.models.HashtagEntity
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.MentionEntity
 *  com.twitter.sdk.android.core.models.SymbolEntity
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.core.models.UrlEntity
 *  com.twitter.sdk.android.tweetui.FormattedMediaEntity
 *  com.twitter.sdk.android.tweetui.internal.util.HtmlEntities
 *  com.twitter.sdk.android.tweetui.internal.util.HtmlEntities$Unescaped
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.tweetui.FormattedMediaEntity;
import com.twitter.sdk.android.tweetui.FormattedTweetText;
import com.twitter.sdk.android.tweetui.FormattedUrlEntity;
import com.twitter.sdk.android.tweetui.internal.util.HtmlEntities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class TweetTextUtils {
    private TweetTextUtils() {
    }

    public static void adjustEntitiesWithOffsets(List<? extends FormattedUrlEntity> iterator, List<Integer> list) {
        if (iterator != null && list != null) {
            for (FormattedUrlEntity formattedUrlEntity : iterator) {
                int n = formattedUrlEntity.start;
                int n2 = 0;
                Iterator iterator2 = list.iterator();
                while (iterator2.hasNext() && (Integer)iterator2.next() - n2 <= n) {
                    ++n2;
                }
                formattedUrlEntity.start += n2;
                formattedUrlEntity.end += n2;
            }
        }
    }

    public static void adjustIndicesForEscapedChars(List<? extends FormattedUrlEntity> object, List<int[]> list) {
        if (object != null && list != null && !list.isEmpty()) {
            int n = list.size();
            Iterator iterator = object.iterator();
            int n2 = 0;
            int n3 = 0;
            while (iterator.hasNext()) {
                object = (FormattedUrlEntity)iterator.next();
                int n4 = 0;
                int n5 = n2;
                while (n2 < n) {
                    int n6;
                    int n7;
                    int[] nArray = (int[])list.get(n2);
                    int n8 = nArray[0];
                    int n9 = nArray[1];
                    int n10 = n9 - n8;
                    if (n9 < object.start) {
                        n7 = n3 + n10;
                        n8 = n5 + 1;
                        n6 = n4;
                    } else {
                        n8 = n5;
                        n7 = n3;
                        n6 = n4;
                        if (n9 < object.end) {
                            n6 = n4 + n10;
                            n7 = n3;
                            n8 = n5;
                        }
                    }
                    ++n2;
                    n5 = n8;
                    n3 = n7;
                    n4 = n6;
                }
                n2 = object.start;
                object.start = n2 - (n4 += n3);
                object.end -= n4;
                n2 = n5;
            }
        }
    }

    public static void adjustIndicesForSupplementaryChars(StringBuilder stringBuilder, FormattedTweetText formattedTweetText) {
        ArrayList arrayList = new ArrayList();
        int n = stringBuilder.length();
        for (int i = 0; i < n - 1; ++i) {
            if (!Character.isHighSurrogate((char)stringBuilder.charAt(i)) || !Character.isLowSurrogate((char)stringBuilder.charAt(i + 1))) continue;
            arrayList.add((Object)i);
        }
        TweetTextUtils.adjustEntitiesWithOffsets(formattedTweetText.urlEntities, (List<Integer>)arrayList);
        TweetTextUtils.adjustEntitiesWithOffsets(formattedTweetText.mediaEntities, (List<Integer>)arrayList);
        TweetTextUtils.adjustEntitiesWithOffsets(formattedTweetText.hashtagEntities, (List<Integer>)arrayList);
        TweetTextUtils.adjustEntitiesWithOffsets(formattedTweetText.mentionEntities, (List<Integer>)arrayList);
        TweetTextUtils.adjustEntitiesWithOffsets(formattedTweetText.symbolEntities, (List<Integer>)arrayList);
    }

    public static void convertEntities(FormattedTweetText formattedTweetText, Tweet object) {
        Object object2;
        List<HashtagEntity> list = object.entities;
        if (list == null) {
            return;
        }
        list = list.urls;
        if (list != null) {
            object2 = list.iterator();
            while (object2.hasNext()) {
                list = FormattedUrlEntity.createFormattedUrlEntity((UrlEntity)object2.next());
                formattedTweetText.urlEntities.add(list);
            }
        }
        if ((list = object.entities.media) != null) {
            list = list.iterator();
            while (list.hasNext()) {
                object2 = new FormattedMediaEntity((MediaEntity)list.next());
                formattedTweetText.mediaEntities.add(object2);
            }
        }
        if ((list = object.entities.hashtags) != null) {
            list = list.iterator();
            while (list.hasNext()) {
                object2 = FormattedUrlEntity.createFormattedUrlEntity((HashtagEntity)list.next());
                formattedTweetText.hashtagEntities.add(object2);
            }
        }
        if ((list = object.entities.userMentions) != null) {
            list = list.iterator();
            while (list.hasNext()) {
                object2 = FormattedUrlEntity.createFormattedUrlEntity((MentionEntity)list.next());
                formattedTweetText.mentionEntities.add(object2);
            }
        }
        if ((object = object.entities.symbols) != null) {
            list = object.iterator();
            while (list.hasNext()) {
                object = FormattedUrlEntity.createFormattedUrlEntity((SymbolEntity)list.next());
                formattedTweetText.symbolEntities.add(object);
            }
        }
    }

    public static void format(FormattedTweetText formattedTweetText, Tweet tweet) {
        if (TextUtils.isEmpty((CharSequence)tweet.text)) {
            return;
        }
        HtmlEntities.Unescaped unescaped = HtmlEntities.HTML40.unescape(tweet.text);
        tweet = new StringBuilder(unescaped.unescaped);
        TweetTextUtils.adjustIndicesForEscapedChars(formattedTweetText.urlEntities, (List<int[]>)unescaped.indices);
        TweetTextUtils.adjustIndicesForEscapedChars(formattedTweetText.mediaEntities, (List<int[]>)unescaped.indices);
        TweetTextUtils.adjustIndicesForEscapedChars(formattedTweetText.hashtagEntities, (List<int[]>)unescaped.indices);
        TweetTextUtils.adjustIndicesForEscapedChars(formattedTweetText.mentionEntities, (List<int[]>)unescaped.indices);
        TweetTextUtils.adjustIndicesForEscapedChars(formattedTweetText.symbolEntities, (List<int[]>)unescaped.indices);
        TweetTextUtils.adjustIndicesForSupplementaryChars((StringBuilder)tweet, formattedTweetText);
        formattedTweetText.text = tweet.toString();
    }

    public static FormattedTweetText formatTweetText(Tweet tweet) {
        if (tweet == null) {
            return null;
        }
        FormattedTweetText formattedTweetText = new FormattedTweetText();
        TweetTextUtils.convertEntities(formattedTweetText, tweet);
        TweetTextUtils.format(formattedTweetText, tweet);
        return formattedTweetText;
    }
}

