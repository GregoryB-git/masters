.class public Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;,
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;,
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;,
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$ErrorConvertingMethodChannelResult;,
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$IDelegate;
    }
.end annotation


# instance fields
.field private activityPluginBinding:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

.field private delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

.field private messenger:Lio/flutter/plugin/common/BinaryMessenger;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private attachToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->setActivity(Landroid/app/Activity;)V

    return-void
.end method

.method private dispose()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    if-eqz v1, :cond_0

    invoke-static {v1, v0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->k(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;)V

    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    :cond_0
    return-void
.end method

.method private disposeActivity()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->setActivity(Landroid/app/Activity;)V

    iput-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-void
.end method


# virtual methods
.method public initInstance(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-direct {v0, p2, p3}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;)V

    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-static {p1, v0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->k(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;)V

    return-void
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->attachToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    invoke-direct {v1}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;-><init>()V

    invoke-virtual {p0, v0, p1, v1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->initInstance(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->disposeActivity()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->disposeActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->dispose()V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 10

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "signOut"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "requestScopes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_2
    const-string v1, "getTokens"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_3
    const-string v1, "disconnect"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "clearAuthCache"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "init"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_6
    const-string v1, "isSignedIn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_7
    const-string v1, "signInSilently"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_8
    const-string v1, "signIn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x0

    :goto_0
    const-string v0, "scopes"

    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_1

    :pswitch_0
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signOut(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {v0, p2, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestScopes(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_2
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "shouldRecoverAuth"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {v1, p2, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getTokens(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Z)V

    goto/16 :goto_1

    :pswitch_3
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->disconnect(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_4
    const-string v0, "token"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {v0, p2, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->clearAuthCache(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    const-string v1, "signInOption"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    const-string v0, "hostedDomain"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    const-string v0, "clientId"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    const-string v0, "serverClientId"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    const-string v0, "forceCodeForRefreshToken"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    move-object v3, p2

    invoke-virtual/range {v2 .. v9}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->init(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    :pswitch_6
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->isSignedIn(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_7
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInSilently(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_8
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->delegate:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signIn(Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x35ca943e -> :sswitch_8
        -0x260b317c -> :sswitch_7
        -0x1cb23755 -> :sswitch_6
        0x316510 -> :sswitch_5
        0x1705aed -> :sswitch_4
        0x1f9d589c -> :sswitch_3
        0x3157a890 -> :sswitch_2
        0x52b6040e -> :sswitch_1
        0x7c782451 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;->attachToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method
