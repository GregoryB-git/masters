.class public Lya/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;

.field public b:Lio/flutter/plugin/common/EventChannel;

.field public c:Lya/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "dev.fluttercommunity.plus/connectivity"

    invoke-direct {v1, v0, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v1, p0, Lya/d;->a:Lio/flutter/plugin/common/MethodChannel;

    new-instance v1, Lio/flutter/plugin/common/EventChannel;

    const-string v2, "dev.fluttercommunity.plus/connectivity_status"

    invoke-direct {v1, v0, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v1, p0, Lya/d;->b:Lio/flutter/plugin/common/EventChannel;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    new-instance v1, Lya/a;

    invoke-direct {v1, v0}, Lya/a;-><init>(Landroid/net/ConnectivityManager;)V

    new-instance v0, Lya/c;

    invoke-direct {v0, v1}, Lya/c;-><init>(Lya/a;)V

    new-instance v2, Lya/b;

    invoke-direct {v2, p1, v1}, Lya/b;-><init>(Landroid/content/Context;Lya/a;)V

    iput-object v2, p0, Lya/d;->c:Lya/b;

    iget-object p1, p0, Lya/d;->a:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iget-object p1, p0, Lya/d;->b:Lio/flutter/plugin/common/EventChannel;

    iget-object v0, p0, Lya/d;->c:Lya/b;

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    return-void
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    iget-object p1, p0, Lya/d;->a:Lio/flutter/plugin/common/MethodChannel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iget-object p1, p0, Lya/d;->b:Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iget-object p1, p0, Lya/d;->c:Lya/b;

    invoke-virtual {p1, v0}, Lya/b;->onCancel(Ljava/lang/Object;)V

    iput-object v0, p0, Lya/d;->a:Lio/flutter/plugin/common/MethodChannel;

    iput-object v0, p0, Lya/d;->b:Lio/flutter/plugin/common/EventChannel;

    iput-object v0, p0, Lya/d;->c:Lya/b;

    return-void
.end method
