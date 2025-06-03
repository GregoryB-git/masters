package io.flutter.plugin.editing;

import D5.u;
import D5.u.b;
import E5.k.d;
import F5.e;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;

public class n
  implements u.b, SpellCheckerSession.SpellCheckerSessionListener
{
  public final u a;
  public final TextServicesManager b;
  public SpellCheckerSession c;
  public k.d d;
  
  public n(TextServicesManager paramTextServicesManager, u paramu)
  {
    b = paramTextServicesManager;
    a = paramu;
    paramu.b(this);
  }
  
  public void a(String paramString1, String paramString2, k.d paramd)
  {
    if (d != null)
    {
      paramd.b("error", "Previous spell check request still pending.", null);
      return;
    }
    d = paramd;
    c(paramString1, paramString2);
  }
  
  public void b()
  {
    a.b(null);
    SpellCheckerSession localSpellCheckerSession = c;
    if (localSpellCheckerSession != null) {
      localSpellCheckerSession.close();
    }
  }
  
  public void c(String paramString1, String paramString2)
  {
    paramString1 = e.b(paramString1);
    if (c == null) {
      c = b.newSpellCheckerSession(null, paramString1, this, true);
    }
    paramString1 = new TextInfo(paramString2);
    c.getSentenceSuggestions(new TextInfo[] { paramString1 }, 5);
  }
  
  public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] paramArrayOfSentenceSuggestionsInfo)
  {
    Object localObject1;
    if (paramArrayOfSentenceSuggestionsInfo.length == 0)
    {
      localObject1 = d;
      paramArrayOfSentenceSuggestionsInfo = new ArrayList();
    }
    for (;;)
    {
      ((k.d)localObject1).a(paramArrayOfSentenceSuggestionsInfo);
      d = null;
      return;
      localObject1 = new ArrayList();
      Object localObject2 = paramArrayOfSentenceSuggestionsInfo[0];
      if (localObject2 == null)
      {
        localObject1 = d;
        paramArrayOfSentenceSuggestionsInfo = new ArrayList();
      }
      else
      {
        for (int i = 0; i < ((SentenceSuggestionsInfo)localObject2).getSuggestionsCount(); i++)
        {
          SuggestionsInfo localSuggestionsInfo = ((SentenceSuggestionsInfo)localObject2).getSuggestionsInfoAt(i);
          int j = localSuggestionsInfo.getSuggestionsCount();
          if (j > 0)
          {
            HashMap localHashMap = new HashMap();
            int k = ((SentenceSuggestionsInfo)localObject2).getOffsetAt(i);
            int m = ((SentenceSuggestionsInfo)localObject2).getLengthAt(i);
            localHashMap.put("startIndex", Integer.valueOf(k));
            localHashMap.put("endIndex", Integer.valueOf(m + k));
            paramArrayOfSentenceSuggestionsInfo = new ArrayList();
            m = 0;
            k = m;
            while (m < j)
            {
              String str = localSuggestionsInfo.getSuggestionAt(m);
              if (!str.equals(""))
              {
                paramArrayOfSentenceSuggestionsInfo.add(str);
                k = 1;
              }
              m++;
            }
            if (k != 0)
            {
              localHashMap.put("suggestions", paramArrayOfSentenceSuggestionsInfo);
              ((ArrayList)localObject1).add(localHashMap);
            }
          }
        }
        localObject2 = d;
        paramArrayOfSentenceSuggestionsInfo = (SentenceSuggestionsInfo[])localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  public void onGetSuggestions(SuggestionsInfo[] paramArrayOfSuggestionsInfo) {}
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */