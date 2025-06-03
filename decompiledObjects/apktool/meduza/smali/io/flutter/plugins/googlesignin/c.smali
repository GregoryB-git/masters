.class public final synthetic Lio/flutter/plugins/googlesignin/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/c;->a:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/c;->a:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->e(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
