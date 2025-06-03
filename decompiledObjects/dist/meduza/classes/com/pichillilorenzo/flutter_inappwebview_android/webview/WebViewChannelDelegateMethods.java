package com.pichillilorenzo.flutter_inappwebview_android.webview;

public enum WebViewChannelDelegateMethods
{
  static
  {
    getTitle = new WebViewChannelDelegateMethods("getTitle", 1);
    getProgress = new WebViewChannelDelegateMethods("getProgress", 2);
    loadUrl = new WebViewChannelDelegateMethods("loadUrl", 3);
    postUrl = new WebViewChannelDelegateMethods("postUrl", 4);
    loadData = new WebViewChannelDelegateMethods("loadData", 5);
    loadFile = new WebViewChannelDelegateMethods("loadFile", 6);
    evaluateJavascript = new WebViewChannelDelegateMethods("evaluateJavascript", 7);
    injectJavascriptFileFromUrl = new WebViewChannelDelegateMethods("injectJavascriptFileFromUrl", 8);
    injectCSSCode = new WebViewChannelDelegateMethods("injectCSSCode", 9);
    injectCSSFileFromUrl = new WebViewChannelDelegateMethods("injectCSSFileFromUrl", 10);
    reload = new WebViewChannelDelegateMethods("reload", 11);
    goBack = new WebViewChannelDelegateMethods("goBack", 12);
    canGoBack = new WebViewChannelDelegateMethods("canGoBack", 13);
    goForward = new WebViewChannelDelegateMethods("goForward", 14);
    canGoForward = new WebViewChannelDelegateMethods("canGoForward", 15);
    goBackOrForward = new WebViewChannelDelegateMethods("goBackOrForward", 16);
    canGoBackOrForward = new WebViewChannelDelegateMethods("canGoBackOrForward", 17);
    stopLoading = new WebViewChannelDelegateMethods("stopLoading", 18);
    isLoading = new WebViewChannelDelegateMethods("isLoading", 19);
    takeScreenshot = new WebViewChannelDelegateMethods("takeScreenshot", 20);
    setSettings = new WebViewChannelDelegateMethods("setSettings", 21);
    getSettings = new WebViewChannelDelegateMethods("getSettings", 22);
    close = new WebViewChannelDelegateMethods("close", 23);
    show = new WebViewChannelDelegateMethods("show", 24);
    hide = new WebViewChannelDelegateMethods("hide", 25);
    isHidden = new WebViewChannelDelegateMethods("isHidden", 26);
    getCopyBackForwardList = new WebViewChannelDelegateMethods("getCopyBackForwardList", 27);
    startSafeBrowsing = new WebViewChannelDelegateMethods("startSafeBrowsing", 28);
    clearCache = new WebViewChannelDelegateMethods("clearCache", 29);
    clearSslPreferences = new WebViewChannelDelegateMethods("clearSslPreferences", 30);
    findAll = new WebViewChannelDelegateMethods("findAll", 31);
    findNext = new WebViewChannelDelegateMethods("findNext", 32);
    clearMatches = new WebViewChannelDelegateMethods("clearMatches", 33);
    scrollTo = new WebViewChannelDelegateMethods("scrollTo", 34);
    scrollBy = new WebViewChannelDelegateMethods("scrollBy", 35);
    pause = new WebViewChannelDelegateMethods("pause", 36);
    resume = new WebViewChannelDelegateMethods("resume", 37);
    pauseTimers = new WebViewChannelDelegateMethods("pauseTimers", 38);
    resumeTimers = new WebViewChannelDelegateMethods("resumeTimers", 39);
    printCurrentPage = new WebViewChannelDelegateMethods("printCurrentPage", 40);
    getContentHeight = new WebViewChannelDelegateMethods("getContentHeight", 41);
    getContentWidth = new WebViewChannelDelegateMethods("getContentWidth", 42);
    zoomBy = new WebViewChannelDelegateMethods("zoomBy", 43);
    getOriginalUrl = new WebViewChannelDelegateMethods("getOriginalUrl", 44);
    getZoomScale = new WebViewChannelDelegateMethods("getZoomScale", 45);
    getSelectedText = new WebViewChannelDelegateMethods("getSelectedText", 46);
    getHitTestResult = new WebViewChannelDelegateMethods("getHitTestResult", 47);
    pageDown = new WebViewChannelDelegateMethods("pageDown", 48);
    pageUp = new WebViewChannelDelegateMethods("pageUp", 49);
    saveWebArchive = new WebViewChannelDelegateMethods("saveWebArchive", 50);
    zoomIn = new WebViewChannelDelegateMethods("zoomIn", 51);
    zoomOut = new WebViewChannelDelegateMethods("zoomOut", 52);
    clearFocus = new WebViewChannelDelegateMethods("clearFocus", 53);
    setContextMenu = new WebViewChannelDelegateMethods("setContextMenu", 54);
    requestFocusNodeHref = new WebViewChannelDelegateMethods("requestFocusNodeHref", 55);
    requestImageRef = new WebViewChannelDelegateMethods("requestImageRef", 56);
    getScrollX = new WebViewChannelDelegateMethods("getScrollX", 57);
    getScrollY = new WebViewChannelDelegateMethods("getScrollY", 58);
    getCertificate = new WebViewChannelDelegateMethods("getCertificate", 59);
    clearHistory = new WebViewChannelDelegateMethods("clearHistory", 60);
    addUserScript = new WebViewChannelDelegateMethods("addUserScript", 61);
    removeUserScript = new WebViewChannelDelegateMethods("removeUserScript", 62);
    removeUserScriptsByGroupName = new WebViewChannelDelegateMethods("removeUserScriptsByGroupName", 63);
    removeAllUserScripts = new WebViewChannelDelegateMethods("removeAllUserScripts", 64);
    callAsyncJavaScript = new WebViewChannelDelegateMethods("callAsyncJavaScript", 65);
    isSecureContext = new WebViewChannelDelegateMethods("isSecureContext", 66);
    createWebMessageChannel = new WebViewChannelDelegateMethods("createWebMessageChannel", 67);
    postWebMessage = new WebViewChannelDelegateMethods("postWebMessage", 68);
    addWebMessageListener = new WebViewChannelDelegateMethods("addWebMessageListener", 69);
    canScrollVertically = new WebViewChannelDelegateMethods("canScrollVertically", 70);
    canScrollHorizontally = new WebViewChannelDelegateMethods("canScrollHorizontally", 71);
    isInFullscreen = new WebViewChannelDelegateMethods("isInFullscreen", 72);
    clearFormData = new WebViewChannelDelegateMethods("clearFormData", 73);
  }
  
  private WebViewChannelDelegateMethods() {}
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */