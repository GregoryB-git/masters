.class public Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/PrintJS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PRINT_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

.field public static final PRINT_JS_PLUGIN_SCRIPT_GROUP_NAME:Ljava/lang/String; = "IN_APP_WEBVIEW_PRINT_JS_PLUGIN_SCRIPT"

.field public static final PRINT_JS_SOURCE:Ljava/lang/String; = "window.print = function() {  if (window.top == null || window.top === window) {     window.flutter_inappwebview.callHandler(\'onPrintRequest\', window.location.href);  } else {     window.top.print();  }};"


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v7, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;->AT_DOCUMENT_START:Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;

    const-string v1, "IN_APP_WEBVIEW_PRINT_JS_PLUGIN_SCRIPT"

    const-string v2, "window.print = function() {  if (window.top == null || window.top === window) {     window.flutter_inappwebview.callHandler(\'onPrintRequest\', window.location.href);  } else {     window.top.print();  }};"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;Lcom/pichillilorenzo/flutter_inappwebview_android/types/ContentWorld;ZLjava/util/Set;)V

    sput-object v7, Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/PrintJS;->PRINT_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
