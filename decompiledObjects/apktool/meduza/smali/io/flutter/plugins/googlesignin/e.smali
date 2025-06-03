.class public final synthetic Lio/flutter/plugins/googlesignin/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/googlesignin/e;->a:I

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/e;->b:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/googlesignin/e;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/e;->b:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->c(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/e;->b:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi$-CC;->g(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
