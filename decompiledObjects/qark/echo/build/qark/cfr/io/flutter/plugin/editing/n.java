/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.textservice.SentenceSuggestionsInfo
 *  android.view.textservice.SpellCheckerSession
 *  android.view.textservice.SpellCheckerSession$SpellCheckerSessionListener
 *  android.view.textservice.SuggestionsInfo
 *  android.view.textservice.TextInfo
 *  android.view.textservice.TextServicesManager
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Locale
 */
package io.flutter.plugin.editing;

import D5.u;
import E5.k;
import F5.e;
import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class n
implements u.b,
SpellCheckerSession.SpellCheckerSessionListener {
    public final u a;
    public final TextServicesManager b;
    public SpellCheckerSession c;
    public k.d d;

    public n(TextServicesManager textServicesManager, u u8) {
        this.b = textServicesManager;
        this.a = u8;
        u8.b(this);
    }

    @Override
    public void a(String string2, String string3, k.d d8) {
        if (this.d != null) {
            d8.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.d = d8;
        this.c(string2, string3);
    }

    public void b() {
        this.a.b(null);
        SpellCheckerSession spellCheckerSession = this.c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String string2, String string3) {
        string2 = e.b(string2);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession(null, (Locale)string2, (SpellCheckerSession.SpellCheckerSessionListener)this, true);
        }
        string2 = new TextInfo(string3);
        this.c.getSentenceSuggestions(new TextInfo[]{string2}, 5);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] var1_1) {
        block7 : {
            block6 : {
                block5 : {
                    if (var1_1.length != 0) break block5;
                    var6_2 = this.d;
                    var1_1 = new ArrayList();
                    break block6;
                }
                var6_2 = new ArrayList();
                if ((var1_1 = var1_1[0]) == null) {
                    var6_2 = this.d;
                    var1_1 = new ArrayList();
                }
                break block7;
            }
lbl12: // 2 sources:
            do {
                var6_2.a(var1_1);
                this.d = null;
                return;
                break;
            } while (true);
        }
        for (var2_3 = 0; var2_3 < var1_1.getSuggestionsCount(); ++var2_3) {
            var7_7 = var1_1.getSuggestionsInfoAt(var2_3);
            var5_6 = var7_7.getSuggestionsCount();
            if (var5_6 <= 0) continue;
            var8_8 = new HashMap();
            var3_4 = var1_1.getOffsetAt(var2_3);
            var4_5 = var1_1.getLengthAt(var2_3);
            var8_8.put((Object)"startIndex", (Object)var3_4);
            var8_8.put((Object)"endIndex", (Object)(var4_5 + var3_4));
            var9_9 = new ArrayList();
            var4_5 = var3_4 = 0;
            while (var3_4 < var5_6) {
                var10_10 = var7_7.getSuggestionAt(var3_4);
                if (!var10_10.equals((Object)"")) {
                    var9_9.add((Object)var10_10);
                    var4_5 = 1;
                }
                ++var3_4;
            }
        }
        var7_7 = this.d;
        var1_1 = var6_2;
        var6_2 = var7_7;
        ** while (true)
    }

    public void onGetSuggestions(SuggestionsInfo[] arrsuggestionsInfo) {
    }
}

