/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.net.IDN
 *  java.text.BreakIterator
 *  java.text.Collator
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 *  java.util.TreeSet
 *  okhttp3.HttpUrl
 */
package com.twitter.sdk.android.tweetui;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.TweetEntities;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.FilterValues;
import com.twitter.sdk.android.tweetui.TimelineFilter;
import java.net.IDN;
import java.text.BreakIterator;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.HttpUrl;

public class BasicTimelineFilter
implements TimelineFilter {
    private final Set<String> handleConstraints;
    private final Set<String> hashTagConstraints;
    private final Set<String> keywordConstraints;
    private final Set<String> urlConstraints;
    private final BreakIterator wordIterator;

    public BasicTimelineFilter(FilterValues filterValues) {
        this(filterValues, Locale.getDefault());
    }

    public BasicTimelineFilter(FilterValues object, Locale locale) {
        Object object2 = new Comparator<String>(locale){
            private final Collator collator;
            {
                locale = Collator.getInstance((Locale)locale);
                this.collator = locale;
                locale.setStrength(0);
            }

            public int compare(String string2, String string3) {
                return this.collator.compare(string2, string3);
            }
        };
        this.wordIterator = BreakIterator.getWordInstance((Locale)locale);
        this.keywordConstraints = locale = new TreeSet((Comparator)object2);
        locale.addAll(((FilterValues)object).keywords);
        this.hashTagConstraints = new TreeSet((Comparator)object2);
        locale = ((FilterValues)object).hashtags.iterator();
        while (locale.hasNext()) {
            object2 = BasicTimelineFilter.normalizeHashtag((String)locale.next());
            this.hashTagConstraints.add(object2);
        }
        this.handleConstraints = new HashSet(((FilterValues)object).handles.size());
        locale = ((FilterValues)object).handles.iterator();
        while (locale.hasNext()) {
            object2 = BasicTimelineFilter.normalizeHandle((String)locale.next());
            this.handleConstraints.add(object2);
        }
        this.urlConstraints = new HashSet(((FilterValues)object).urls.size());
        locale = ((FilterValues)object).urls.iterator();
        while (locale.hasNext()) {
            object = BasicTimelineFilter.normalizeUrl((String)locale.next());
            this.urlConstraints.add(object);
        }
    }

    public static String normalizeHandle(String string2) {
        String string3;
        block5: {
            block4: {
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    return string2;
                }
                char c = string2.charAt(0);
                if (c == '@') break block4;
                string3 = string2;
                if (c != '\uff20') break block5;
            }
            string3 = string2.substring(1, string2.length());
        }
        return string3.toLowerCase(Locale.US);
    }

    public static String normalizeHashtag(String string2) {
        String string3;
        block5: {
            block4: {
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    return string2;
                }
                char c = string2.charAt(0);
                if (c == '#' || c == '\uff03') break block4;
                string3 = string2;
                if (c != '$') break block5;
            }
            string3 = string2.substring(1, string2.length());
        }
        return string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String normalizeUrl(String string2) {
        String string3;
        HttpUrl httpUrl;
        try {
            httpUrl = HttpUrl.parse((String)string2);
            string3 = IDN.toASCII((String)string2).toLowerCase(Locale.US);
            if (httpUrl == null) return string3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return string2;
        }
        if (httpUrl.host() != null) return httpUrl.host().toLowerCase(Locale.US);
        return string3;
    }

    public boolean containsMatchingHashtag(List<HashtagEntity> object2) {
        for (Object object2 : object2) {
            if (!this.hashTagConstraints.contains((Object)object2.text)) continue;
            return true;
        }
        return false;
    }

    public boolean containsMatchingMention(List<MentionEntity> iterator) {
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            String string2 = BasicTimelineFilter.normalizeHandle(((MentionEntity)iterator.next()).screenName);
            if (!this.handleConstraints.contains((Object)string2)) continue;
            return true;
        }
        return false;
    }

    public boolean containsMatchingScreenName(String string2) {
        string2 = BasicTimelineFilter.normalizeHandle(string2);
        return this.handleConstraints.contains((Object)string2);
    }

    public boolean containsMatchingSymbol(List<SymbolEntity> object2) {
        for (Object object2 : object2) {
            if (!this.hashTagConstraints.contains((Object)object2.text)) continue;
            return true;
        }
        return false;
    }

    public boolean containsMatchingText(Tweet tweet) {
        this.wordIterator.setText(tweet.text);
        int n = this.wordIterator.first();
        int n2 = this.wordIterator.next();
        while (n2 != -1) {
            String string2 = tweet.text.substring(n, n2);
            if (this.keywordConstraints.contains((Object)string2)) {
                return true;
            }
            int n3 = this.wordIterator.next();
            n = n2;
            n2 = n3;
        }
        return false;
    }

    public boolean containsMatchingUrl(List<UrlEntity> object) {
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = BasicTimelineFilter.normalizeUrl(((UrlEntity)iterator.next()).expandedUrl);
            if (!this.urlConstraints.contains(object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public List<Tweet> filter(List<Tweet> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            Tweet tweet = (Tweet)list.get(i);
            if (this.shouldFilterTweet(tweet)) continue;
            arrayList.add((Object)tweet);
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public boolean shouldFilterTweet(Tweet tweet) {
        Object object = tweet.user;
        if (object != null && this.containsMatchingScreenName(((User)object).screenName)) {
            return true;
        }
        object = tweet.entities;
        if (object != null && (this.containsMatchingHashtag(((TweetEntities)object).hashtags) || this.containsMatchingSymbol(tweet.entities.symbols) || this.containsMatchingUrl(tweet.entities.urls) || this.containsMatchingMention(tweet.entities.userMentions))) {
            return true;
        }
        return this.containsMatchingText(tweet);
    }

    @Override
    public int totalFilters() {
        int n = this.keywordConstraints.size();
        int n2 = this.hashTagConstraints.size();
        int n3 = this.urlConstraints.size();
        return this.handleConstraints.size() + (n3 + (n2 + n));
    }
}

