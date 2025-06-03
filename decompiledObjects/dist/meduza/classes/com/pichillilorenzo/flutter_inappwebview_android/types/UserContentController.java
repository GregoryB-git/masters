package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.text.TextUtils;
import android.webkit.WebView;
import c2.e;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import f;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import x6.b;

public class UserContentController
  implements Disposable
{
  private static final String CONTENT_WORLDS_GENERATOR_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();";
  private static final String CONTENT_WORLD_WRAPPER_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = 'flutter_inappwebview_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#flutter_inappwebview_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();";
  private static final String DOCUMENT_READY_WRAPPER_JS_SOURCE = "if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
  public static final String LOG_TAG = "UserContentController";
  private static final String USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentEndLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentEndLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
  private static final String USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentStartLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentStartLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
  private final Set<ContentWorld> contentWorlds = new HashSet() {};
  private e contentWorldsCreatorScript;
  private final Map<UserScriptInjectionTime, LinkedHashSet<PluginScript>> pluginScripts = new HashMap() {};
  private final Map<UserScript, e> scriptHandlerMap = new HashMap();
  private final Map<UserScriptInjectionTime, LinkedHashSet<UserScript>> userOnlyScripts = new HashMap() {};
  public WebView webView;
  
  public UserContentController(WebView paramWebView)
  {
    webView = paramWebView;
  }
  
  public static String escapeCode(String paramString)
  {
    return JSONObject.quote(paramString);
  }
  
  public static String escapeContentWorldName(String paramString)
  {
    return paramString.replaceAll("'", "\\\\'");
  }
  
  private void updateContentWorldsCreatorScript()
  {
    String str = generateContentWorldsCreatorCode();
    if (b.c0("DOCUMENT_START_SCRIPT"))
    {
      Object localObject = contentWorldsCreatorScript;
      if (localObject != null) {
        ((e)localObject).remove();
      }
      if (!str.isEmpty())
      {
        localObject = webView;
        if (localObject != null) {
          contentWorldsCreatorScript = p.a((WebView)localObject, str, new HashSet() {});
        }
      }
    }
  }
  
  public boolean addPluginScript(PluginScript paramPluginScript)
  {
    Object localObject = paramPluginScript.getContentWorld();
    if (localObject != null) {
      contentWorlds.add(localObject);
    }
    updateContentWorldsCreatorScript();
    if ((webView != null) && (paramPluginScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START) && (b.c0("DOCUMENT_START_SCRIPT")))
    {
      localObject = p.a(webView, wrapSourceCodeInContentWorld(paramPluginScript.getContentWorld(), paramPluginScript.getSource()), paramPluginScript.getAllowedOriginRules());
      scriptHandlerMap.put(paramPluginScript, localObject);
    }
    return ((LinkedHashSet)pluginScripts.get(paramPluginScript.getInjectionTime())).add(paramPluginScript);
  }
  
  public void addPluginScripts(List<PluginScript> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      addPluginScript((PluginScript)paramList.next());
    }
  }
  
  public boolean addUserOnlyScript(UserScript paramUserScript)
  {
    Object localObject = paramUserScript.getContentWorld();
    if (localObject != null) {
      contentWorlds.add(localObject);
    }
    updateContentWorldsCreatorScript();
    if ((webView != null) && (paramUserScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START) && (b.c0("DOCUMENT_START_SCRIPT")))
    {
      localObject = p.a(webView, wrapSourceCodeInContentWorld(paramUserScript.getContentWorld(), paramUserScript.getSource()), paramUserScript.getAllowedOriginRules());
      scriptHandlerMap.put(paramUserScript, localObject);
    }
    return ((LinkedHashSet)userOnlyScripts.get(paramUserScript.getInjectionTime())).add(paramUserScript);
  }
  
  public void addUserOnlyScripts(List<UserScript> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      addUserOnlyScript((UserScript)paramList.next());
    }
  }
  
  public boolean containsPluginScript(PluginScript paramPluginScript)
  {
    return getPluginScriptAsList().contains(paramPluginScript);
  }
  
  public boolean containsPluginScriptByGroupName(String paramString)
  {
    Iterator localIterator = getPluginScriptAsList().iterator();
    while (localIterator.hasNext()) {
      if (Util.objEquals(paramString, ((PluginScript)localIterator.next()).getGroupName())) {
        return true;
      }
    }
    return false;
  }
  
  public boolean containsUserOnlyScript(UserScript paramUserScript)
  {
    return getUserOnlyScriptAsList().contains(paramUserScript);
  }
  
  public boolean containsUserOnlyScriptByGroupName(String paramString)
  {
    Iterator localIterator = getUserOnlyScriptAsList().iterator();
    while (localIterator.hasNext()) {
      if (Util.objEquals(paramString, ((UserScript)localIterator.next()).getGroupName())) {
        return true;
      }
    }
    return false;
  }
  
  public void dispose()
  {
    if (b.c0("DOCUMENT_START_SCRIPT"))
    {
      e locale = contentWorldsCreatorScript;
      if (locale != null) {
        locale.remove();
      }
    }
    removeAllUserOnlyScripts();
    removeAllPluginScripts();
    webView = null;
  }
  
  public String generateCodeForDocumentStart()
  {
    UserScriptInjectionTime localUserScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_START;
    StringBuilder localStringBuilder = f.l("");
    localStringBuilder.append(generatePluginScriptsCodeAt(localUserScriptInjectionTime));
    localStringBuilder = f.l(localStringBuilder.toString());
    localStringBuilder.append(generateContentWorldsCreatorCode());
    localStringBuilder = f.l(localStringBuilder.toString());
    localStringBuilder.append(generateUserOnlyScriptsCodeAt(localUserScriptInjectionTime));
    return "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentStartLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentStartLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}".replace("$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", localStringBuilder.toString());
  }
  
  public String generateCodeForScriptEvaluation(String paramString, ContentWorld paramContentWorld)
  {
    Object localObject1 = paramString;
    if (paramContentWorld != null)
    {
      localObject1 = paramString;
      if (!paramContentWorld.equals(ContentWorld.PAGE))
      {
        localObject1 = new StringBuilder();
        if (!contentWorlds.contains(paramContentWorld))
        {
          contentWorlds.add(paramContentWorld);
          StringBuilder localStringBuilder = new StringBuilder();
          Object localObject2 = getPluginScriptsRequiredInAllContentWorlds().iterator();
          while (((Iterator)localObject2).hasNext()) {
            localStringBuilder.append(((PluginScript)((Iterator)localObject2).next()).getSource());
          }
          localObject2 = f.l("'");
          ((StringBuilder)localObject2).append(escapeContentWorldName(paramContentWorld.getName()));
          ((StringBuilder)localObject2).append("'");
          ((StringBuilder)localObject1).append("(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();".replace("$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY", ((StringBuilder)localObject2).toString()).replace("$IN_APP_WEBVIEW_JSON_SOURCE_ENCODED", escapeCode(localStringBuilder.toString())));
          ((StringBuilder)localObject1).append(";");
        }
        ((StringBuilder)localObject1).append(wrapSourceCodeInContentWorld(paramContentWorld, paramString));
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    return (String)localObject1;
  }
  
  public String generateContentWorldsCreatorCode()
  {
    if (contentWorlds.size() == 1) {
      return "";
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    Object localObject = getPluginScriptsRequiredInAllContentWorlds().iterator();
    while (((Iterator)localObject).hasNext()) {
      localStringBuilder1.append(((PluginScript)((Iterator)localObject).next()).getSource());
    }
    localObject = new ArrayList();
    Iterator localIterator = contentWorlds.iterator();
    while (localIterator.hasNext())
    {
      ContentWorld localContentWorld = (ContentWorld)localIterator.next();
      if (!localContentWorld.equals(ContentWorld.PAGE))
      {
        StringBuilder localStringBuilder2 = f.l("'");
        localStringBuilder2.append(escapeContentWorldName(localContentWorld.getName()));
        localStringBuilder2.append("'");
        ((ArrayList)localObject).add(localStringBuilder2.toString());
      }
    }
    return "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();".replace("$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY", TextUtils.join(", ", (Iterable)localObject)).replace("$IN_APP_WEBVIEW_JSON_SOURCE_ENCODED", escapeCode(localStringBuilder1.toString()));
  }
  
  public String generatePluginScriptsCodeAt(UserScriptInjectionTime paramUserScriptInjectionTime)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = getPluginScriptsAt(paramUserScriptInjectionTime).iterator();
    while (localIterator.hasNext())
    {
      paramUserScriptInjectionTime = (PluginScript)localIterator.next();
      Object localObject = f.l(";");
      ((StringBuilder)localObject).append(paramUserScriptInjectionTime.getSource());
      localObject = ((StringBuilder)localObject).toString();
      localStringBuilder.append(wrapSourceCodeInContentWorld(paramUserScriptInjectionTime.getContentWorld(), (String)localObject));
    }
    return localStringBuilder.toString();
  }
  
  public String generateUserOnlyScriptsCodeAt(UserScriptInjectionTime paramUserScriptInjectionTime)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = getUserOnlyScriptsAt(paramUserScriptInjectionTime).iterator();
    while (localIterator.hasNext())
    {
      paramUserScriptInjectionTime = (UserScript)localIterator.next();
      Object localObject = f.l(";");
      ((StringBuilder)localObject).append(paramUserScriptInjectionTime.getSource());
      localObject = ((StringBuilder)localObject).toString();
      localStringBuilder.append(wrapSourceCodeInContentWorld(paramUserScriptInjectionTime.getContentWorld(), (String)localObject));
    }
    return localStringBuilder.toString();
  }
  
  public String generateWrappedCodeForDocumentEnd()
  {
    UserScriptInjectionTime localUserScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_END;
    boolean bool = b.c0("DOCUMENT_START_SCRIPT");
    Object localObject = "";
    if (!bool)
    {
      localObject = f.l("");
      ((StringBuilder)localObject).append(generateCodeForDocumentStart());
      localObject = ((StringBuilder)localObject).toString();
    }
    localObject = f.l((String)localObject);
    ((StringBuilder)localObject).append(generatePluginScriptsCodeAt(localUserScriptInjectionTime));
    localObject = f.l(((StringBuilder)localObject).toString());
    ((StringBuilder)localObject).append(generateUserOnlyScriptsCodeAt(localUserScriptInjectionTime));
    return "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentEndLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentEndLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}".replace("$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", ((StringBuilder)localObject).toString());
  }
  
  public String generateWrappedCodeForDocumentStart()
  {
    return Util.replaceAll("if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}", "$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", generateCodeForDocumentStart());
  }
  
  public LinkedHashSet<ContentWorld> getContentWorlds()
  {
    return new LinkedHashSet(contentWorlds);
  }
  
  public LinkedHashSet<PluginScript> getPluginScriptAsList()
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Iterator localIterator = pluginScripts.values().iterator();
    while (localIterator.hasNext()) {
      localLinkedHashSet.addAll((LinkedHashSet)localIterator.next());
    }
    return localLinkedHashSet;
  }
  
  public LinkedHashSet<PluginScript> getPluginScriptsAt(UserScriptInjectionTime paramUserScriptInjectionTime)
  {
    return new LinkedHashSet((Collection)pluginScripts.get(paramUserScriptInjectionTime));
  }
  
  public LinkedHashSet<PluginScript> getPluginScriptsRequiredInAllContentWorlds()
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Iterator localIterator = getPluginScriptsAt(UserScriptInjectionTime.AT_DOCUMENT_START).iterator();
    while (localIterator.hasNext())
    {
      PluginScript localPluginScript = (PluginScript)localIterator.next();
      if (localPluginScript.isRequiredInAllContentWorlds()) {
        localLinkedHashSet.add(localPluginScript);
      }
    }
    return localLinkedHashSet;
  }
  
  public LinkedHashSet<UserScript> getUserOnlyScriptAsList()
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Iterator localIterator = userOnlyScripts.values().iterator();
    while (localIterator.hasNext()) {
      localLinkedHashSet.addAll((LinkedHashSet)localIterator.next());
    }
    return localLinkedHashSet;
  }
  
  public LinkedHashSet<UserScript> getUserOnlyScriptsAt(UserScriptInjectionTime paramUserScriptInjectionTime)
  {
    return new LinkedHashSet((Collection)userOnlyScripts.get(paramUserScriptInjectionTime));
  }
  
  public void removeAllPluginScripts()
  {
    if (b.c0("DOCUMENT_START_SCRIPT"))
    {
      Iterator localIterator = ((LinkedHashSet)pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)).iterator();
      while (localIterator.hasNext())
      {
        PluginScript localPluginScript = (PluginScript)localIterator.next();
        e locale = (e)scriptHandlerMap.get(localPluginScript);
        if (locale != null)
        {
          locale.remove();
          scriptHandlerMap.remove(localPluginScript);
        }
      }
    }
    ((LinkedHashSet)pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)).clear();
    ((LinkedHashSet)pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END)).clear();
  }
  
  public void removeAllUserOnlyScripts()
  {
    if (b.c0("DOCUMENT_START_SCRIPT"))
    {
      Iterator localIterator = ((LinkedHashSet)userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)).iterator();
      while (localIterator.hasNext())
      {
        UserScript localUserScript = (UserScript)localIterator.next();
        e locale = (e)scriptHandlerMap.get(localUserScript);
        if (locale != null)
        {
          locale.remove();
          scriptHandlerMap.remove(localUserScript);
        }
      }
    }
    ((LinkedHashSet)userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)).clear();
    ((LinkedHashSet)userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END)).clear();
  }
  
  public boolean removePluginScript(PluginScript paramPluginScript)
  {
    if (b.c0("DOCUMENT_START_SCRIPT"))
    {
      e locale = (e)scriptHandlerMap.get(paramPluginScript);
      if (locale != null)
      {
        locale.remove();
        scriptHandlerMap.remove(paramPluginScript);
      }
      updateContentWorldsCreatorScript();
    }
    return ((LinkedHashSet)pluginScripts.get(paramPluginScript.getInjectionTime())).remove(paramPluginScript);
  }
  
  public void removePluginScriptsByGroupName(String paramString)
  {
    Iterator localIterator = getPluginScriptAsList().iterator();
    while (localIterator.hasNext())
    {
      PluginScript localPluginScript = (PluginScript)localIterator.next();
      if (Util.objEquals(paramString, localPluginScript.getGroupName())) {
        removePluginScript(localPluginScript);
      }
    }
  }
  
  public boolean removeUserOnlyScript(UserScript paramUserScript)
  {
    if (b.c0("DOCUMENT_START_SCRIPT"))
    {
      e locale = (e)scriptHandlerMap.get(paramUserScript);
      if (locale != null)
      {
        locale.remove();
        scriptHandlerMap.remove(paramUserScript);
      }
      updateContentWorldsCreatorScript();
    }
    return ((LinkedHashSet)userOnlyScripts.get(paramUserScript.getInjectionTime())).remove(paramUserScript);
  }
  
  public boolean removeUserOnlyScriptAt(int paramInt, UserScriptInjectionTime paramUserScriptInjectionTime)
  {
    return removeUserOnlyScript((UserScript)new ArrayList((Collection)userOnlyScripts.get(paramUserScriptInjectionTime)).get(paramInt));
  }
  
  public void removeUserOnlyScriptsByGroupName(String paramString)
  {
    Iterator localIterator = getUserOnlyScriptAsList().iterator();
    while (localIterator.hasNext())
    {
      UserScript localUserScript = (UserScript)localIterator.next();
      if (Util.objEquals(paramString, localUserScript.getGroupName())) {
        removeUserOnlyScript(localUserScript);
      }
    }
  }
  
  public void resetContentWorlds()
  {
    contentWorlds.clear();
    contentWorlds.add(ContentWorld.PAGE);
    Iterator localIterator = getPluginScriptAsList().iterator();
    ContentWorld localContentWorld;
    while (localIterator.hasNext())
    {
      localContentWorld = ((PluginScript)localIterator.next()).getContentWorld();
      contentWorlds.add(localContentWorld);
    }
    localIterator = getUserOnlyScriptAsList().iterator();
    while (localIterator.hasNext())
    {
      localContentWorld = ((UserScript)localIterator.next()).getContentWorld();
      contentWorlds.add(localContentWorld);
    }
  }
  
  public String wrapSourceCodeInContentWorld(ContentWorld paramContentWorld, String paramString)
  {
    String str = paramString;
    if (paramContentWorld != null) {
      if (paramContentWorld.equals(ContentWorld.PAGE)) {
        str = paramString;
      } else {
        str = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = 'flutter_inappwebview_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#flutter_inappwebview_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();".replace("$IN_APP_WEBVIEW_CONTENT_WORLD_NAME", escapeContentWorldName(paramContentWorld.getName())).replace("$IN_APP_WEBVIEW_JSON_SOURCE_ENCODED", escapeCode(paramString));
      }
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */