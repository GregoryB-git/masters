/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  com.twitter.sdk.android.tweetui.FormattedMediaEntity
 *  com.twitter.sdk.android.tweetui.TweetTextLinkifier$2
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.regex.Pattern
 */
package com.twitter.sdk.android.tweetui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.twitter.sdk.android.core.models.ModelUtils;
import com.twitter.sdk.android.tweetui.FormattedMediaEntity;
import com.twitter.sdk.android.tweetui.FormattedTweetText;
import com.twitter.sdk.android.tweetui.FormattedUrlEntity;
import com.twitter.sdk.android.tweetui.LinkClickListener;
import com.twitter.sdk.android.tweetui.TweetTextLinkifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

final class TweetTextLinkifier {
    public static final Pattern QUOTED_STATUS_URL = Pattern.compile((String)"^https?://twitter\\.com(/#!)?/\\w+/status/\\d+$");
    public static final Pattern VINE_URL = Pattern.compile((String)"^https?://vine\\.co(/#!)?/v/\\w+$");

    private TweetTextLinkifier() {
    }

    private static void addUrlEntities(SpannableStringBuilder spannableStringBuilder, List<FormattedUrlEntity> iterator, FormattedUrlEntity formattedUrlEntity, LinkClickListener linkClickListener, int n, int n2) {
        if (iterator != null && !iterator.isEmpty()) {
            int n3 = 0;
            for (FormattedUrlEntity formattedUrlEntity2 : iterator) {
                int n4 = formattedUrlEntity2.start - n3;
                int n5 = formattedUrlEntity2.end - n3;
                if (n4 < 0 || n5 > spannableStringBuilder.length()) continue;
                if (formattedUrlEntity != null && formattedUrlEntity.start == formattedUrlEntity2.start) {
                    spannableStringBuilder.replace(n4, n5, (CharSequence)"");
                    n3 = n5 - n4 + n3;
                    continue;
                }
                if (TextUtils.isEmpty((CharSequence)formattedUrlEntity2.displayUrl)) continue;
                spannableStringBuilder.replace(n4, n5, (CharSequence)formattedUrlEntity2.displayUrl);
                int n6 = n5 - (formattedUrlEntity2.displayUrl.length() + n4);
                n3 += n6;
                spannableStringBuilder.setSpan((Object)new 2(n2, n, false, linkClickListener, formattedUrlEntity2), n4, n5 - n6, 33);
            }
        }
    }

    public static FormattedUrlEntity getEntityToStrip(String string2, List<FormattedUrlEntity> object, boolean bl, boolean bl2) {
        if (object.isEmpty()) {
            return null;
        }
        object = (FormattedUrlEntity)object.get(object.size() - 1);
        if (TweetTextLinkifier.stripLtrMarker(string2).endsWith(object.url) && (TweetTextLinkifier.isPhotoEntity(object) || bl && TweetTextLinkifier.isQuotedStatus(object) || bl2 && TweetTextLinkifier.isVineCard(object))) {
            return object;
        }
        return null;
    }

    public static boolean isPhotoEntity(FormattedUrlEntity formattedUrlEntity) {
        boolean bl = formattedUrlEntity instanceof FormattedMediaEntity && "photo".equals((Object)((FormattedMediaEntity)formattedUrlEntity).type);
        return bl;
    }

    public static boolean isQuotedStatus(FormattedUrlEntity formattedUrlEntity) {
        return QUOTED_STATUS_URL.matcher((CharSequence)formattedUrlEntity.expandedUrl).find();
    }

    public static boolean isVineCard(FormattedUrlEntity formattedUrlEntity) {
        return VINE_URL.matcher((CharSequence)formattedUrlEntity.expandedUrl).find();
    }

    public static CharSequence linkifyUrls(FormattedTweetText formattedTweetText, LinkClickListener linkClickListener, int n, int n2, boolean bl, boolean bl2) {
        if (formattedTweetText == null) {
            return null;
        }
        if (TextUtils.isEmpty((CharSequence)formattedTweetText.text)) {
            return formattedTweetText.text;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)formattedTweetText.text);
        List<FormattedUrlEntity> list = TweetTextLinkifier.mergeAndSortEntities(ModelUtils.getSafeList(formattedTweetText.urlEntities), ModelUtils.getSafeList(formattedTweetText.mediaEntities), ModelUtils.getSafeList(formattedTweetText.hashtagEntities), ModelUtils.getSafeList(formattedTweetText.mentionEntities), ModelUtils.getSafeList(formattedTweetText.symbolEntities));
        TweetTextLinkifier.addUrlEntities(spannableStringBuilder, list, TweetTextLinkifier.getEntityToStrip(formattedTweetText.text, list, bl, bl2), linkClickListener, n, n2);
        return TweetTextLinkifier.trimEnd((CharSequence)spannableStringBuilder);
    }

    public static List<FormattedUrlEntity> mergeAndSortEntities(List<FormattedUrlEntity> arrayList, List<FormattedMediaEntity> list, List<FormattedUrlEntity> list2, List<FormattedUrlEntity> list3, List<FormattedUrlEntity> list4) {
        arrayList = new ArrayList(arrayList);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        arrayList.addAll(list4);
        Collections.sort((List)arrayList, (Comparator)new Comparator<FormattedUrlEntity>(){

            public int compare(FormattedUrlEntity formattedUrlEntity, FormattedUrlEntity formattedUrlEntity2) {
                if (formattedUrlEntity == null && formattedUrlEntity2 != null) {
                    return -1;
                }
                if (formattedUrlEntity != null && formattedUrlEntity2 == null) {
                    return 1;
                }
                if (formattedUrlEntity == null && formattedUrlEntity2 == null) {
                    return 0;
                }
                int n = formattedUrlEntity.start;
                int n2 = formattedUrlEntity2.start;
                if (n < n2) {
                    return -1;
                }
                if (n > n2) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    public static String stripLtrMarker(String string2) {
        String string3 = string2;
        if (string2.endsWith(Character.toString((char)'\u200e'))) {
            string3 = string2.substring(0, string2.length() - 1);
        }
        return string3;
    }

    public static CharSequence trimEnd(CharSequence charSequence) {
        int n;
        for (n = charSequence.length(); n > 0 && charSequence.charAt(n - 1) <= ' '; --n) {
        }
        CharSequence charSequence2 = charSequence;
        if (n < charSequence.length()) {
            charSequence2 = charSequence.subSequence(0, n);
        }
        return charSequence2;
    }
}

