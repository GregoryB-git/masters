.class public final Lio/flutter/plugins/firebase/messaging/a$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/messaging/a;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/a$a;->a:Lio/flutter/plugins/firebase/messaging/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .line 1
    :goto_0
    iget-object p1, p0, Lio/flutter/plugins/firebase/messaging/a$a;->a:Lio/flutter/plugins/firebase/messaging/a;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/messaging/a;->a()Lio/flutter/plugins/firebase/messaging/a$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/a$a;->a:Lio/flutter/plugins/firebase/messaging/a;

    invoke-interface {p1}, Lio/flutter/plugins/firebase/messaging/a$f;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/messaging/a;->g(Landroid/content/Intent;)V

    invoke-interface {p1}, Lio/flutter/plugins/firebase/messaging/a$f;->a()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/flutter/plugins/firebase/messaging/a$a;->a:Lio/flutter/plugins/firebase/messaging/a;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/messaging/a;->i()V

    return-void
.end method

.method public c(Ljava/lang/Void;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/flutter/plugins/firebase/messaging/a$a;->a:Lio/flutter/plugins/firebase/messaging/a;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/messaging/a;->i()V

    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/messaging/a$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/messaging/a$a;->b(Ljava/lang/Void;)V

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/messaging/a$a;->c(Ljava/lang/Void;)V

    return-void
.end method
