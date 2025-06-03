.class public final synthetic Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lio/flutter/plugin/common/MessageCodec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/flutter/plugin/common/MessageCodec<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApiCodec;->INSTANCE:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApiCodec;

    return-object v0
.end method

.method public static synthetic b(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlesignin/Messages$InitParams;

    :try_start_0
    invoke-interface {p0, p1}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->init(Lio/flutter/plugins/googlesignin/Messages$InitParams;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lio/flutter/plugins/googlesignin/Messages;->wrapError(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lio/flutter/plugin/common/BasicMessageChannel$Reply;->reply(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$1;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$1;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->signInSilently(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$2;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$2;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->signIn(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    new-instance v2, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$3;

    invoke-direct {v2, v0, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$3;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, v1, p1, v2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$4;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$4;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$5;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$5;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->disconnect(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static synthetic h(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-interface {p0}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->isSignedIn()Ljava/lang/Boolean;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lio/flutter/plugins/googlesignin/Messages;->wrapError(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/BasicMessageChannel$Reply;->reply(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v1, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$6;

    invoke-direct {v1, v0, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$6;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->clearAuthCache(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance v1, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$7;

    invoke-direct {v1, v0, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$7;-><init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    invoke-interface {p0, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->requestScopes(Ljava/util/List;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public static k(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;)V
    .locals 5

    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.GoogleSignInApi.init"

    invoke-direct {v0, p0, v2, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    new-instance v3, Lio/flutter/plugins/googlesignin/d;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/d;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_0
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.GoogleSignInApi.signInSilently"

    invoke-direct {v0, p0, v4, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_1

    new-instance v3, Lio/flutter/plugins/googlesignin/e;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/e;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_1
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.GoogleSignInApi.signIn"

    invoke-direct {v0, p0, v4, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_2

    new-instance v3, Lio/flutter/plugins/googlesignin/f;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/f;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_2
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.GoogleSignInApi.getAccessToken"

    invoke-direct {v0, p0, v4, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_3

    new-instance v3, Lio/flutter/plugins/googlesignin/g;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/g;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_3
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    const-string v3, "dev.flutter.pigeon.GoogleSignInApi.signOut"

    invoke-direct {v0, p0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    new-instance v3, Lio/flutter/plugins/googlesignin/d;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/d;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_4
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.GoogleSignInApi.disconnect"

    invoke-direct {v0, p0, v4, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_5

    new-instance v3, Lio/flutter/plugins/googlesignin/e;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/e;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_5
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.GoogleSignInApi.isSignedIn"

    invoke-direct {v0, p0, v4, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_6

    new-instance v3, Lio/flutter/plugins/googlesignin/f;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/f;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_6
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.GoogleSignInApi.clearAuthCache"

    invoke-direct {v0, p0, v4, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_7

    new-instance v3, Lio/flutter/plugins/googlesignin/g;

    invoke-direct {v3, p1, v1}, Lio/flutter/plugins/googlesignin/g;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_7
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-static {}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->a()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    const-string v3, "dev.flutter.pigeon.GoogleSignInApi.requestScopes"

    invoke-direct {v0, p0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    if-eqz p1, :cond_8

    new-instance p0, Lio/flutter/plugins/googlesignin/d;

    const/4 v1, 0x2

    invoke-direct {p0, p1, v1}, Lio/flutter/plugins/googlesignin/d;-><init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    :goto_8
    return-void
.end method
