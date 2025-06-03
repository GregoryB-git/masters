/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.regex.Matcher
 */
package com.twitter;

import com.twitter.Regex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

public class Extractor {
    public boolean extractURLWithoutProtocol = true;

    private List<Entity> extractHashtagsWithIndices(String iterator, boolean bl) {
        if (iterator != null && iterator.length() != 0) {
            char c;
            Object object;
            block6: {
                object = iterator.toCharArray();
                int n = ((char[])object).length;
                char c2 = '\u0000';
                int n2 = 0;
                while (true) {
                    c = c2;
                    if (n2 >= n) break block6;
                    c = object[n2];
                    if (c == '#' || c == '\uff03') break;
                    ++n2;
                }
                c = '\u0001';
            }
            if (c == '\u0000') {
                return Collections.emptyList();
            }
            object = new ArrayList();
            Matcher matcher = Regex.VALID_HASHTAG.matcher((CharSequence)iterator);
            while (matcher.find()) {
                String string2 = iterator.substring(matcher.end());
                if (Regex.INVALID_HASHTAG_MATCH_END.matcher((CharSequence)string2).find()) continue;
                object.add((Object)new Entity(matcher, Entity.Type.HASHTAG, 3));
            }
            if (bl && !(iterator = this.extractURLsWithIndices((String)iterator)).isEmpty()) {
                object.addAll(iterator);
                this.removeOverlappingEntities((List<Entity>)object);
                iterator = object.iterator();
                while (iterator.hasNext()) {
                    if (((Entity)iterator.next()).getType() == Entity.Type.HASHTAG) continue;
                    iterator.remove();
                }
            }
            return object;
        }
        return Collections.emptyList();
    }

    private void removeOverlappingEntities(List<Entity> object) {
        Collections.sort(object, (Comparator)new Comparator<Entity>(this){
            public final Extractor this$0;
            {
                this.this$0 = extractor;
            }

            public int compare(Entity entity, Entity entity2) {
                return entity.start - entity2.start;
            }
        });
        if (!object.isEmpty()) {
            Iterator iterator = object.iterator();
            object = (Entity)iterator.next();
            while (iterator.hasNext()) {
                Entity entity = (Entity)iterator.next();
                if (((Entity)object).getEnd() > entity.getStart()) {
                    iterator.remove();
                    continue;
                }
                object = entity;
            }
        }
    }

    public List<String> extractCashtags(String string2) {
        if (string2 != null && string2.length() != 0) {
            ArrayList arrayList = new ArrayList();
            string2 = this.extractCashtagsWithIndices(string2).iterator();
            while (string2.hasNext()) {
                arrayList.add((Object)((Entity)string2.next()).value);
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<Entity> extractCashtagsWithIndices(String string2) {
        if (string2 != null && string2.length() != 0) {
            if (string2.indexOf(36) == -1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            string2 = Regex.VALID_CASHTAG.matcher((CharSequence)string2);
            while (string2.find()) {
                arrayList.add((Object)new Entity((Matcher)string2, Entity.Type.CASHTAG, 3));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<Entity> extractEntitiesWithIndices(String string2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.extractURLsWithIndices(string2));
        arrayList.addAll(this.extractHashtagsWithIndices(string2, false));
        arrayList.addAll(this.extractMentionsOrListsWithIndices(string2));
        arrayList.addAll(this.extractCashtagsWithIndices(string2));
        this.removeOverlappingEntities((List<Entity>)arrayList);
        return arrayList;
    }

    public List<String> extractHashtags(String string2) {
        if (string2 != null && string2.length() != 0) {
            ArrayList arrayList = new ArrayList();
            string2 = this.extractHashtagsWithIndices(string2).iterator();
            while (string2.hasNext()) {
                arrayList.add((Object)((Entity)string2.next()).value);
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<Entity> extractHashtagsWithIndices(String string2) {
        return this.extractHashtagsWithIndices(string2, true);
    }

    public List<String> extractMentionedScreennames(String string2) {
        if (string2 != null && string2.length() != 0) {
            ArrayList arrayList = new ArrayList();
            string2 = this.extractMentionedScreennamesWithIndices(string2).iterator();
            while (string2.hasNext()) {
                arrayList.add((Object)((Entity)string2.next()).value);
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<Entity> extractMentionedScreennamesWithIndices(String object2) {
        ArrayList arrayList = new ArrayList();
        for (Object object2 : this.extractMentionsOrListsWithIndices((String)object2)) {
            if (((Entity)object2).listSlug != null) continue;
            arrayList.add(object2);
        }
        return arrayList;
    }

    public List<Entity> extractMentionsOrListsWithIndices(String string2) {
        if (string2 != null && string2.length() != 0) {
            char c;
            Object object;
            block5: {
                object = string2.toCharArray();
                int n = ((char[])object).length;
                char c2 = '\u0000';
                int n2 = 0;
                while (true) {
                    c = c2;
                    if (n2 >= n) break block5;
                    c = object[n2];
                    if (c == '@' || c == '\uff20') break;
                    ++n2;
                }
                c = '\u0001';
            }
            if (c == '\u0000') {
                return Collections.emptyList();
            }
            object = new ArrayList();
            Matcher matcher = Regex.VALID_MENTION_OR_LIST.matcher((CharSequence)string2);
            while (matcher.find()) {
                String string3 = string2.substring(matcher.end());
                if (Regex.INVALID_MENTION_MATCH_END.matcher((CharSequence)string3).find()) continue;
                if (matcher.group(4) == null) {
                    object.add((Object)new Entity(matcher, Entity.Type.MENTION, 3));
                    continue;
                }
                object.add((Object)new Entity(matcher.start(3) - 1, matcher.end(4), matcher.group(3), matcher.group(4), Entity.Type.MENTION));
            }
            return object;
        }
        return Collections.emptyList();
    }

    public String extractReplyScreenname(String string2) {
        if (string2 == null) {
            return null;
        }
        Matcher matcher = Regex.VALID_REPLY.matcher((CharSequence)string2);
        if (matcher.find()) {
            if (Regex.INVALID_MENTION_MATCH_END.matcher((CharSequence)(string2 = string2.substring(matcher.end()))).find()) {
                return null;
            }
            return matcher.group(1);
        }
        return null;
    }

    public List<String> extractURLs(String string2) {
        if (string2 != null && string2.length() != 0) {
            ArrayList arrayList = new ArrayList();
            string2 = this.extractURLsWithIndices(string2).iterator();
            while (string2.hasNext()) {
                arrayList.add((Object)((Entity)string2.next()).value);
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<Entity> extractURLsWithIndices(String string2) {
        int n;
        if (string2 != null && string2.length() != 0 && string2.indexOf(n = this.extractURLWithoutProtocol ? 46 : 58) != -1) {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Regex.VALID_URL.matcher((CharSequence)string2);
            while (matcher.find()) {
                if (matcher.group(4) == null && (!this.extractURLWithoutProtocol || Regex.INVALID_URL_WITHOUT_PROTOCOL_MATCH_BEGIN.matcher((CharSequence)matcher.group(2)).matches())) continue;
                string2 = matcher.group(3);
                int n2 = matcher.start(3);
                n = matcher.end(3);
                Matcher matcher2 = Regex.VALID_TCO_URL.matcher((CharSequence)string2);
                if (matcher2.find()) {
                    string2 = matcher2.group();
                    n = string2.length() + n2;
                }
                arrayList.add((Object)new Entity(n2, n, string2, Entity.Type.URL));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public boolean isExtractURLWithoutProtocol() {
        return this.extractURLWithoutProtocol;
    }

    public void modifyIndicesFromUTF16ToToUnicode(String object, List<Entity> iterator) {
        object = new IndexConverter((String)object);
        for (Entity entity : iterator) {
            entity.start = ((IndexConverter)object).codeUnitsToCodePoints(entity.start);
            entity.end = ((IndexConverter)object).codeUnitsToCodePoints(entity.end);
        }
    }

    public void modifyIndicesFromUnicodeToUTF16(String object, List<Entity> object22) {
        object = new IndexConverter((String)object);
        for (Object object22 : object22) {
            object22.start = ((IndexConverter)object).codePointsToCodeUnits(object22.start);
            object22.end = ((IndexConverter)object).codePointsToCodeUnits(object22.end);
        }
    }

    public void setExtractURLWithoutProtocol(boolean bl) {
        this.extractURLWithoutProtocol = bl;
    }

    public static class Entity {
        public String displayURL = null;
        public int end;
        public String expandedURL = null;
        public final String listSlug;
        public int start;
        public final Type type;
        public final String value;

        public Entity(int n, int n2, String string2, Type type) {
            this(n, n2, string2, null, type);
        }

        public Entity(int n, int n2, String string2, String string3, Type type) {
            this.start = n;
            this.end = n2;
            this.value = string2;
            this.listSlug = string3;
            this.type = type;
        }

        public Entity(Matcher matcher, Type type, int n) {
            this(matcher, type, n, -1);
        }

        public Entity(Matcher matcher, Type type, int n, int n2) {
            this(matcher.start(n) + n2, matcher.end(n), matcher.group(n), type);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Entity)) {
                return false;
            }
            object = (Entity)object;
            return this.type.equals((Object)((Entity)object).type) && this.start == ((Entity)object).start && this.end == ((Entity)object).end && this.value.equals((Object)((Entity)object).value);
        }

        public String getDisplayURL() {
            return this.displayURL;
        }

        public Integer getEnd() {
            return this.end;
        }

        public String getExpandedURL() {
            return this.expandedURL;
        }

        public String getListSlug() {
            return this.listSlug;
        }

        public Integer getStart() {
            return this.start;
        }

        public Type getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int n = this.type.hashCode();
            return this.value.hashCode() + n + this.start + this.end;
        }

        public void setDisplayURL(String string2) {
            this.displayURL = string2;
        }

        public void setExpandedURL(String string2) {
            this.expandedURL = string2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.value);
            stringBuilder.append("(");
            stringBuilder.append((Object)this.type);
            stringBuilder.append(") [");
            stringBuilder.append(this.start);
            stringBuilder.append(",");
            return z2.q(stringBuilder, this.end, "]");
        }

        public static final class Type
        extends Enum<Type> {
            private static final Type[] $VALUES;
            public static final /* enum */ Type CASHTAG;
            public static final /* enum */ Type HASHTAG;
            public static final /* enum */ Type MENTION;
            public static final /* enum */ Type URL;

            static {
                Type type;
                Type type2;
                Type type3;
                Type type4;
                URL = type4 = new Type();
                HASHTAG = type3 = new Type();
                MENTION = type2 = new Type();
                CASHTAG = type = new Type();
                $VALUES = new Type[]{type4, type3, type2, type};
            }

            public static Type valueOf(String string2) {
                return (Type)Enum.valueOf(Type.class, (String)string2);
            }

            public static Type[] values() {
                return (Type[])$VALUES.clone();
            }
        }
    }

    public static final class IndexConverter {
        public int charIndex = 0;
        public int codePointIndex = 0;
        public final String text;

        public IndexConverter(String string2) {
            this.text = string2;
        }

        public int codePointsToCodeUnits(int n) {
            int n2;
            this.charIndex = n2 = this.text.offsetByCodePoints(this.charIndex, n - this.codePointIndex);
            this.codePointIndex = n;
            return n2;
        }

        public int codeUnitsToCodePoints(int n) {
            int n2 = this.charIndex;
            if (n < n2) {
                this.codePointIndex -= this.text.codePointCount(n, n2);
            } else {
                int n3 = this.codePointIndex;
                this.codePointIndex = this.text.codePointCount(n2, n) + n3;
            }
            this.charIndex = n;
            if (n > 0 && Character.isSupplementaryCodePoint((int)this.text.codePointAt(n - 1))) {
                --this.charIndex;
            }
            return this.codePointIndex;
        }
    }
}

