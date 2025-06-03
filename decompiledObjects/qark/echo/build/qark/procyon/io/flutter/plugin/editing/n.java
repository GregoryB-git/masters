// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import android.view.textservice.SuggestionsInfo;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.textservice.SentenceSuggestionsInfo;
import java.util.Locale;
import android.view.textservice.TextInfo;
import android.os.Bundle;
import F5.e;
import E5.k;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.view.textservice.SpellCheckerSession$SpellCheckerSessionListener;
import D5.u;

public class n implements b, SpellCheckerSession$SpellCheckerSessionListener
{
    public final u a;
    public final TextServicesManager b;
    public SpellCheckerSession c;
    public k.d d;
    
    public n(final TextServicesManager b, final u a) {
        this.b = b;
        (this.a = a).b((u.b)this);
    }
    
    @Override
    public void a(final String s, final String s2, final k.d d) {
        if (this.d != null) {
            d.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.d = d;
        this.c(s, s2);
    }
    
    public void b() {
        this.a.b(null);
        final SpellCheckerSession c = this.c;
        if (c != null) {
            c.close();
        }
    }
    
    public void c(final String s, final String s2) {
        final Locale b = e.b(s);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession((Bundle)null, b, (SpellCheckerSession$SpellCheckerSessionListener)this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[] { new TextInfo(s2) }, 5);
    }
    
    public void onGetSentenceSuggestions(final SentenceSuggestionsInfo[] array) {
        Object o;
        ArrayList<HashMap<String, Integer>> list;
        if (array.length == 0) {
            o = this.d;
            list = new ArrayList<HashMap<String, Integer>>();
        }
        else {
            final ArrayList<HashMap<String, Integer>> list2 = new ArrayList<HashMap<String, Integer>>();
            final SentenceSuggestionsInfo sentenceSuggestionsInfo = array[0];
            if (sentenceSuggestionsInfo == null) {
                o = this.d;
                list = new ArrayList<HashMap<String, Integer>>();
            }
            else {
                for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); ++i) {
                    final SuggestionsInfo suggestionsInfo = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
                    final int suggestionsCount = suggestionsInfo.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        final HashMap<String, Integer> e = new HashMap<String, Integer>();
                        final int offset = sentenceSuggestionsInfo.getOffsetAt(i);
                        final int length = sentenceSuggestionsInfo.getLengthAt(i);
                        e.put("startIndex", offset);
                        e.put("endIndex", length + offset);
                        final ArrayList<String> value = new ArrayList<String>();
                        int n;
                        for (int j = n = 0; j < suggestionsCount; ++j) {
                            final String suggestion = suggestionsInfo.getSuggestionAt(j);
                            if (!suggestion.equals("")) {
                                value.add(suggestion);
                                n = 1;
                            }
                        }
                        if (n != 0) {
                            e.put("suggestions", (Integer)value);
                            list2.add(e);
                        }
                    }
                }
                final k.d d = this.d;
                list = list2;
                o = d;
            }
        }
        ((k.d)o).a(list);
        this.d = null;
    }
    
    public void onGetSuggestions(final SuggestionsInfo[] array) {
    }
}
