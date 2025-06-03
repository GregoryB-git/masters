.class public final synthetic Lio/flutter/plugins/sharedpreferences/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/sharedpreferences/d;->a:I

    iput-object p1, p0, Lio/flutter/plugins/sharedpreferences/d;->b:Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/sharedpreferences/d;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/d;->b:Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/sharedpreferences/e;->e(Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/d;->b:Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/sharedpreferences/e;->i(Lio/flutter/plugins/sharedpreferences/Messages$SharedPreferencesApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
