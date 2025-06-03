package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.localization.LocalizationPlugin;
import java.util.ArrayList;
import java.util.HashMap;

public class SpellCheckPlugin
  implements SpellCheckChannel.SpellCheckMethodHandler, SpellCheckerSession.SpellCheckerSessionListener
{
  public static final String END_INDEX_KEY = "endIndex";
  private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
  public static final String START_INDEX_KEY = "startIndex";
  public static final String SUGGESTIONS_KEY = "suggestions";
  private final SpellCheckChannel mSpellCheckChannel;
  private SpellCheckerSession mSpellCheckerSession;
  private final TextServicesManager mTextServicesManager;
  public MethodChannel.Result pendingResult;
  
  public SpellCheckPlugin(TextServicesManager paramTextServicesManager, SpellCheckChannel paramSpellCheckChannel)
  {
    mTextServicesManager = paramTextServicesManager;
    mSpellCheckChannel = paramSpellCheckChannel;
    paramSpellCheckChannel.setSpellCheckMethodHandler(this);
  }
  
  public void destroy()
  {
    mSpellCheckChannel.setSpellCheckMethodHandler(null);
    SpellCheckerSession localSpellCheckerSession = mSpellCheckerSession;
    if (localSpellCheckerSession != null) {
      localSpellCheckerSession.close();
    }
  }
  
  public void initiateSpellCheck(String paramString1, String paramString2, MethodChannel.Result paramResult)
  {
    if (pendingResult != null)
    {
      paramResult.error("error", "Previous spell check request still pending.", null);
      return;
    }
    pendingResult = paramResult;
    performSpellCheck(paramString1, paramString2);
  }
  
  public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] paramArrayOfSentenceSuggestionsInfo)
  {
    Object localObject1;
    if (paramArrayOfSentenceSuggestionsInfo.length == 0)
    {
      localObject1 = pendingResult;
      paramArrayOfSentenceSuggestionsInfo = new ArrayList();
    }
    for (;;)
    {
      ((MethodChannel.Result)localObject1).success(paramArrayOfSentenceSuggestionsInfo);
      pendingResult = null;
      return;
      localObject1 = new ArrayList();
      SentenceSuggestionsInfo localSentenceSuggestionsInfo = paramArrayOfSentenceSuggestionsInfo[0];
      if (localSentenceSuggestionsInfo == null)
      {
        localObject1 = pendingResult;
        paramArrayOfSentenceSuggestionsInfo = new ArrayList();
      }
      else
      {
        for (int i = 0; i < localSentenceSuggestionsInfo.getSuggestionsCount(); i++)
        {
          SuggestionsInfo localSuggestionsInfo = localSentenceSuggestionsInfo.getSuggestionsInfoAt(i);
          int j = localSuggestionsInfo.getSuggestionsCount();
          if (j > 0)
          {
            HashMap localHashMap = new HashMap();
            int k = localSentenceSuggestionsInfo.getOffsetAt(i);
            int m = localSentenceSuggestionsInfo.getLengthAt(i);
            localHashMap.put("startIndex", Integer.valueOf(k));
            localHashMap.put("endIndex", Integer.valueOf(m + k));
            localObject2 = new ArrayList();
            k = 0;
            m = k;
            while (k < j)
            {
              paramArrayOfSentenceSuggestionsInfo = localSuggestionsInfo.getSuggestionAt(k);
              if (!paramArrayOfSentenceSuggestionsInfo.equals(""))
              {
                ((ArrayList)localObject2).add(paramArrayOfSentenceSuggestionsInfo);
                m = 1;
              }
              k++;
            }
            if (m != 0)
            {
              localHashMap.put("suggestions", localObject2);
              ((ArrayList)localObject1).add(localHashMap);
            }
          }
        }
        Object localObject2 = pendingResult;
        paramArrayOfSentenceSuggestionsInfo = (SentenceSuggestionsInfo[])localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  public void onGetSuggestions(SuggestionsInfo[] paramArrayOfSuggestionsInfo) {}
  
  public void performSpellCheck(String paramString1, String paramString2)
  {
    paramString1 = LocalizationPlugin.localeFromString(paramString1);
    if (mSpellCheckerSession == null) {
      mSpellCheckerSession = mTextServicesManager.newSpellCheckerSession(null, paramString1, this, true);
    }
    paramString1 = new TextInfo(paramString2);
    mSpellCheckerSession.getSentenceSuggestions(new TextInfo[] { paramString1 }, 5);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.SpellCheckPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */