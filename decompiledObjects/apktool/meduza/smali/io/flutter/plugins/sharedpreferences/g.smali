.class public final synthetic Lio/flutter/plugins/sharedpreferences/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/sharedpreferences/g;->a:I

    iput-object p1, p0, Lio/flutter/plugins/sharedpreferences/g;->b:Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/sharedpreferences/g;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/g;->b:Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi$Companion;->f(Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/g;->b:Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi$Companion;->c(Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/g;->b:Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi$Companion;->n(Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
