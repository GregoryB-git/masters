package io.flutter.plugin.editing;

import D5.u;
import E5.k;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class n implements u.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final D5.u f15045a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f15046b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f15047c;

    /* renamed from: d, reason: collision with root package name */
    public k.d f15048d;

    public n(TextServicesManager textServicesManager, D5.u uVar) {
        this.f15046b = textServicesManager;
        this.f15045a = uVar;
        uVar.b(this);
    }

    @Override // D5.u.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f15048d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.f15048d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f15045a.b(null);
        SpellCheckerSession spellCheckerSession = this.f15047c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b7 = F5.e.b(str);
        if (this.f15047c == null) {
            this.f15047c = this.f15046b.newSpellCheckerSession(null, b7, this, true);
        }
        this.f15047c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f15048d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            if (sentenceSuggestionsInfo == null) {
                dVar = this.f15048d;
                arrayList = new ArrayList();
            } else {
                for (int i7 = 0; i7 < sentenceSuggestionsInfo.getSuggestionsCount(); i7++) {
                    SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i7);
                    int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        HashMap hashMap = new HashMap();
                        int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i7);
                        int lengthAt = sentenceSuggestionsInfo.getLengthAt(i7) + offsetAt;
                        hashMap.put("startIndex", Integer.valueOf(offsetAt));
                        hashMap.put("endIndex", Integer.valueOf(lengthAt));
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = false;
                        for (int i8 = 0; i8 < suggestionsCount; i8++) {
                            String suggestionAt = suggestionsInfoAt.getSuggestionAt(i8);
                            if (!suggestionAt.equals("")) {
                                arrayList2.add(suggestionAt);
                                z7 = true;
                            }
                        }
                        if (z7) {
                            hashMap.put("suggestions", arrayList2);
                            arrayList.add(hashMap);
                        }
                    }
                }
                dVar = this.f15048d;
            }
        }
        dVar.a(arrayList);
        this.f15048d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
