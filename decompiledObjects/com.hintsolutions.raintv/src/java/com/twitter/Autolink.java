/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package com.twitter;

import com.twitter.Extractor;
import com.twitter.Regex;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Autolink {
    public static final String DEFAULT_CASHTAG_CLASS = "tweet-url cashtag";
    public static final String DEFAULT_CASHTAG_URL_BASE = "https://twitter.com/#!/search?q=%24";
    public static final String DEFAULT_HASHTAG_CLASS = "tweet-url hashtag";
    public static final String DEFAULT_HASHTAG_URL_BASE = "https://twitter.com/#!/search?q=%23";
    public static final String DEFAULT_INVISIBLE_TAG_ATTRS = "style='position:absolute;left:-9999px;'";
    public static final String DEFAULT_LIST_CLASS = "tweet-url list-slug";
    public static final String DEFAULT_LIST_URL_BASE = "https://twitter.com/";
    public static final String DEFAULT_USERNAME_CLASS = "tweet-url username";
    public static final String DEFAULT_USERNAME_URL_BASE = "https://twitter.com/";
    public String cashtagClass;
    public String cashtagUrlBase;
    private Extractor extractor;
    public String hashtagClass;
    public String hashtagUrlBase;
    public String invisibleTagAttrs;
    public LinkAttributeModifier linkAttributeModifier = null;
    public LinkTextModifier linkTextModifier = null;
    public String listClass;
    public String listUrlBase;
    public boolean noFollow = true;
    public String symbolTag = null;
    public String textWithSymbolTag = null;
    public String urlClass = null;
    public String urlTarget = null;
    public String usernameClass;
    public boolean usernameIncludeSymbol = false;
    public String usernameUrlBase;

    public Autolink() {
        Extractor extractor;
        this.extractor = extractor = new Extractor();
        this.urlClass = null;
        this.listClass = DEFAULT_LIST_CLASS;
        this.usernameClass = DEFAULT_USERNAME_CLASS;
        this.hashtagClass = DEFAULT_HASHTAG_CLASS;
        this.cashtagClass = DEFAULT_CASHTAG_CLASS;
        this.usernameUrlBase = "https://twitter.com/";
        this.listUrlBase = "https://twitter.com/";
        this.hashtagUrlBase = DEFAULT_HASHTAG_URL_BASE;
        this.cashtagUrlBase = DEFAULT_CASHTAG_URL_BASE;
        this.invisibleTagAttrs = DEFAULT_INVISIBLE_TAG_ATTRS;
        extractor.setExtractURLWithoutProtocol(false);
    }

    private static CharSequence escapeHTML(CharSequence charSequence) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length() * 2);
        for (int i = 0; i < charSequence.length(); ++i) {
            char c = charSequence.charAt(i);
            if (c != '\"') {
                if (c != '<') {
                    if (c != '>') {
                        if (c != '&') {
                            if (c != '\'') {
                                stringBuilder.append(c);
                                continue;
                            }
                            stringBuilder.append("&#39;");
                            continue;
                        }
                        stringBuilder.append("&amp;");
                        continue;
                    }
                    stringBuilder.append("&gt;");
                    continue;
                }
                stringBuilder.append("&lt;");
                continue;
            }
            stringBuilder.append("&quot;");
        }
        return stringBuilder;
    }

    public String autoLink(String string2) {
        string2 = this.escapeBrackets(string2);
        return this.autoLinkEntities(string2, this.extractor.extractEntitiesWithIndices(string2));
    }

    public String autoLinkCashtags(String string2) {
        return this.autoLinkEntities(string2, this.extractor.extractCashtagsWithIndices(string2));
    }

    public String autoLinkEntities(String string2, List<Extractor.Entity> iterator) {
        StringBuilder stringBuilder = new StringBuilder(string2.length() * 2);
        iterator = iterator.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            Extractor.Entity entity = (Extractor.Entity)iterator.next();
            stringBuilder.append(string2.subSequence(n, entity.start));
            n = 1.$SwitchMap$com$twitter$Extractor$Entity$Type[entity.type.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n == 4) {
                            this.linkToCashtag(entity, string2, stringBuilder);
                        }
                    } else {
                        this.linkToMentionAndList(entity, string2, stringBuilder);
                    }
                } else {
                    this.linkToHashtag(entity, string2, stringBuilder);
                }
            } else {
                this.linkToURL(entity, string2, stringBuilder);
            }
            n = entity.end;
        }
        stringBuilder.append(string2.subSequence(n, string2.length()));
        return stringBuilder.toString();
    }

    public String autoLinkHashtags(String string2) {
        return this.autoLinkEntities(string2, this.extractor.extractHashtagsWithIndices(string2));
    }

    public String autoLinkURLs(String string2) {
        return this.autoLinkEntities(string2, this.extractor.extractURLsWithIndices(string2));
    }

    public String autoLinkUsernamesAndLists(String string2) {
        return this.autoLinkEntities(string2, this.extractor.extractMentionsOrListsWithIndices(string2));
    }

    public String escapeBrackets(String string2) {
        int n = string2.length();
        if (n == 0) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder(n + 16);
        for (int i = 0; i < n; ++i) {
            char c = string2.charAt(i);
            if (c == '>') {
                stringBuilder.append("&gt;");
                continue;
            }
            if (c == '<') {
                stringBuilder.append("&lt;");
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public String getCashtagClass() {
        return this.cashtagClass;
    }

    public String getCashtagUrlBase() {
        return this.cashtagUrlBase;
    }

    public String getHashtagClass() {
        return this.hashtagClass;
    }

    public String getHashtagUrlBase() {
        return this.hashtagUrlBase;
    }

    public String getListClass() {
        return this.listClass;
    }

    public String getListUrlBase() {
        return this.listUrlBase;
    }

    public String getUrlClass() {
        return this.urlClass;
    }

    public String getUsernameClass() {
        return this.usernameClass;
    }

    public String getUsernameUrlBase() {
        return this.usernameUrlBase;
    }

    public boolean isNoFollow() {
        return this.noFollow;
    }

    public void linkToCashtag(Extractor.Entity entity, String string2, StringBuilder stringBuilder) {
        string2 = entity.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.cashtagUrlBase);
        stringBuilder2.append((Object)string2);
        linkedHashMap.put((Object)"href", (Object)stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("$");
        stringBuilder2.append((Object)string2);
        linkedHashMap.put((Object)"title", (Object)stringBuilder2.toString());
        linkedHashMap.put((Object)"class", (Object)this.cashtagClass);
        this.linkToTextWithSymbol(entity, "$", string2, (Map<String, String>)linkedHashMap, stringBuilder);
    }

    public void linkToHashtag(Extractor.Entity entity, String string2, StringBuilder stringBuilder) {
        CharSequence charSequence = string2.subSequence(entity.getStart().intValue(), entity.getStart() + 1);
        String string3 = entity.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.hashtagUrlBase);
        stringBuilder2.append((Object)string3);
        linkedHashMap.put((Object)"href", (Object)stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("#");
        stringBuilder2.append((Object)string3);
        linkedHashMap.put((Object)"title", (Object)stringBuilder2.toString());
        if (Regex.RTL_CHARACTERS.matcher((CharSequence)string2).find()) {
            string2 = new StringBuilder();
            string2.append(this.hashtagClass);
            string2.append(" rtl");
            linkedHashMap.put((Object)"class", (Object)string2.toString());
        } else {
            linkedHashMap.put((Object)"class", (Object)this.hashtagClass);
        }
        this.linkToTextWithSymbol(entity, charSequence, string3, (Map<String, String>)linkedHashMap, stringBuilder);
    }

    public void linkToMentionAndList(Extractor.Entity entity, String string2, StringBuilder stringBuilder) {
        String string3 = entity.getValue();
        CharSequence charSequence = string2.subSequence(entity.getStart().intValue(), entity.getStart() + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (entity.listSlug != null) {
            string2 = z2.t(string3);
            string2.append(entity.listSlug);
            string2 = string2.toString();
            linkedHashMap.put((Object)"class", (Object)this.listClass);
            string3 = new StringBuilder();
            string3.append(this.listUrlBase);
            string3.append(string2);
            linkedHashMap.put((Object)"href", (Object)string3.toString());
        } else {
            linkedHashMap.put((Object)"class", (Object)this.usernameClass);
            string2 = new StringBuilder();
            string2.append(this.usernameUrlBase);
            string2.append(string3);
            linkedHashMap.put((Object)"href", (Object)string2.toString());
            string2 = string3;
        }
        this.linkToTextWithSymbol(entity, charSequence, string2, (Map<String, String>)linkedHashMap, stringBuilder);
    }

    public void linkToText(Extractor.Entity entity, CharSequence charSequence2, Map<String, String> map, StringBuilder stringBuilder) {
        LinkAttributeModifier linkAttributeModifier;
        if (this.noFollow) {
            map.put((Object)"rel", (Object)"nofollow");
        }
        if ((linkAttributeModifier = this.linkAttributeModifier) != null) {
            linkAttributeModifier.modify(entity, map);
        }
        LinkTextModifier linkTextModifier = this.linkTextModifier;
        linkAttributeModifier = charSequence2;
        if (linkTextModifier != null) {
            linkAttributeModifier = linkTextModifier.modify(entity, charSequence2);
        }
        stringBuilder.append("<a");
        for (CharSequence charSequence2 : map.entrySet()) {
            stringBuilder.append(" ");
            stringBuilder.append(Autolink.escapeHTML((CharSequence)charSequence2.getKey()));
            stringBuilder.append("=\"");
            stringBuilder.append(Autolink.escapeHTML((CharSequence)charSequence2.getValue()));
            stringBuilder.append("\"");
        }
        stringBuilder.append(">");
        stringBuilder.append((CharSequence)linkAttributeModifier);
        stringBuilder.append("</a>");
    }

    public void linkToTextWithSymbol(Extractor.Entity entity, CharSequence charSequence, CharSequence charSequence2, Map<String, String> map, StringBuilder stringBuilder) {
        String string2 = this.symbolTag;
        boolean bl = true;
        if (string2 != null && string2.length() != 0) {
            string2 = this.symbolTag;
            string2 = String.format((String)"<%s>%s</%s>", (Object[])new Object[]{string2, charSequence, string2});
        } else {
            string2 = charSequence;
        }
        CharSequence charSequence3 = Autolink.escapeHTML(charSequence2);
        String string3 = this.textWithSymbolTag;
        charSequence2 = charSequence3;
        if (string3 != null) {
            if (string3.length() == 0) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = this.textWithSymbolTag;
                charSequence2 = String.format((String)"<%s>%s</%s>", (Object[])new Object[]{charSequence2, charSequence3, charSequence2});
            }
        }
        boolean bl2 = bl;
        if (!this.usernameIncludeSymbol) {
            bl2 = !Regex.AT_SIGNS.matcher(charSequence).matches() ? bl : false;
        }
        if (bl2) {
            charSequence = new StringBuilder();
            charSequence.append(string2.toString());
            charSequence.append((Object)charSequence2);
            this.linkToText(entity, charSequence.toString(), map, stringBuilder);
        } else {
            stringBuilder.append((CharSequence)string2);
            this.linkToText(entity, charSequence2, map, stringBuilder);
        }
    }

    public void linkToURL(Extractor.Entity entity, String string2, StringBuilder stringBuilder) {
        String string3 = entity.getValue();
        CharSequence charSequence = Autolink.escapeHTML(string3);
        String string4 = entity.displayURL;
        string2 = charSequence;
        if (string4 != null) {
            string2 = charSequence;
            if (entity.expandedURL != null) {
                charSequence = "\u2026";
                String string5 = string4.replace((CharSequence)"\u2026", (CharSequence)"");
                int n = entity.expandedURL.indexOf(string5);
                if (n != -1) {
                    String string6 = entity.expandedURL.substring(0, n);
                    String string7 = entity.expandedURL.substring(string5.length() + n);
                    string2 = entity.displayURL.startsWith("\u2026") ? "\u2026" : "";
                    if (!entity.displayURL.endsWith("\u2026")) {
                        charSequence = "";
                    }
                    String string8 = z2.s(z2.t("<span "), this.invisibleTagAttrs, ">");
                    string4 = new StringBuilder("<span class='tco-ellipsis'>");
                    string4.append(string2);
                    string4.append(string8);
                    string4.append("&nbsp;</span></span>");
                    string4.append(string8);
                    string4.append(Autolink.escapeHTML(string6));
                    string4.append("</span>");
                    string4.append("<span class='js-display-url'>");
                    string4.append(Autolink.escapeHTML(string5));
                    string4.append("</span>");
                    string4.append(string8);
                    string4.append(Autolink.escapeHTML(string7));
                    string4.append("</span>");
                    string4.append("<span class='tco-ellipsis'>");
                    string4.append(string8);
                    string4.append("&nbsp;</span>");
                    string4.append((String)charSequence);
                    string4.append("</span>");
                    string2 = string4;
                } else {
                    string2 = entity.displayURL;
                }
            }
        }
        charSequence = new LinkedHashMap();
        charSequence.put((Object)"href", (Object)string3.toString());
        string4 = this.urlClass;
        if (string4 != null) {
            charSequence.put((Object)"class", (Object)string4);
        }
        if ((string4 = this.urlClass) != null && string4.length() != 0) {
            charSequence.put((Object)"class", (Object)this.urlClass);
        }
        if ((string4 = this.urlTarget) != null && string4.length() != 0) {
            charSequence.put((Object)"target", (Object)this.urlTarget);
        }
        this.linkToText(entity, string2, (Map<String, String>)charSequence, stringBuilder);
    }

    public void setCashtagClass(String string2) {
        this.cashtagClass = string2;
    }

    public void setCashtagUrlBase(String string2) {
        this.cashtagUrlBase = string2;
    }

    public void setHashtagClass(String string2) {
        this.hashtagClass = string2;
    }

    public void setHashtagUrlBase(String string2) {
        this.hashtagUrlBase = string2;
    }

    public void setLinkAttributeModifier(LinkAttributeModifier linkAttributeModifier) {
        this.linkAttributeModifier = linkAttributeModifier;
    }

    public void setLinkTextModifier(LinkTextModifier linkTextModifier) {
        this.linkTextModifier = linkTextModifier;
    }

    public void setListClass(String string2) {
        this.listClass = string2;
    }

    public void setListUrlBase(String string2) {
        this.listUrlBase = string2;
    }

    public void setNoFollow(boolean bl) {
        this.noFollow = bl;
    }

    public void setSymbolTag(String string2) {
        this.symbolTag = string2;
    }

    public void setTextWithSymbolTag(String string2) {
        this.textWithSymbolTag = string2;
    }

    public void setUrlClass(String string2) {
        this.urlClass = string2;
    }

    public void setUrlTarget(String string2) {
        this.urlTarget = string2;
    }

    public void setUsernameClass(String string2) {
        this.usernameClass = string2;
    }

    public void setUsernameIncludeSymbol(boolean bl) {
        this.usernameIncludeSymbol = bl;
    }

    public void setUsernameUrlBase(String string2) {
        this.usernameUrlBase = string2;
    }

    public static interface LinkAttributeModifier {
        public void modify(Extractor.Entity var1, Map<String, String> var2);
    }

    public static interface LinkTextModifier {
        public CharSequence modify(Extractor.Entity var1, CharSequence var2);
    }
}

