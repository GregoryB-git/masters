package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;

public class OnLoadResourceJS
{
  public static final String FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE = "flutter_inappwebview._useOnLoadResource";
  public static final PluginScript ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT = new PluginScript("IN_APP_WEBVIEW_ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT", "window.flutter_inappwebview._useOnLoadResource = true;(function() {   var observer = new PerformanceObserver(function(list) {       list.getEntries().forEach(function(entry) {         if (flutter_inappwebview._useOnLoadResource == null || flutter_inappwebview._useOnLoadResource == true) {           var resource = {             'url': entry.name,             'initiatorType': entry.initiatorType,             'startTime': entry.startTime,             'duration': entry.duration           };           window.flutter_inappwebview.callHandler('onLoadResource', resource);         }       });   });   observer.observe({entryTypes: ['resource']});})();", UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null);
  public static final String ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT";
  public static final String ON_LOAD_RESOURCE_JS_SOURCE = "window.flutter_inappwebview._useOnLoadResource = true;(function() {   var observer = new PerformanceObserver(function(list) {       list.getEntries().forEach(function(entry) {         if (flutter_inappwebview._useOnLoadResource == null || flutter_inappwebview._useOnLoadResource == true) {           var resource = {             'url': entry.name,             'initiatorType': entry.initiatorType,             'startTime': entry.startTime,             'duration': entry.duration           };           window.flutter_inappwebview.callHandler('onLoadResource', resource);         }       });   });   observer.observe({entryTypes: ['resource']});})();";
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */