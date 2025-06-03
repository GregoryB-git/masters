.class public final Lio/flutter/plugins/firebase/messaging/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/messaging/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:I

.field public final synthetic c:Lio/flutter/plugins/firebase/messaging/a;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/a;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/a$d;->c:Lio/flutter/plugins/firebase/messaging/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/a$d;->a:Landroid/content/Intent;

    iput p3, p0, Lio/flutter/plugins/firebase/messaging/a$d;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/a$d;->c:Lio/flutter/plugins/firebase/messaging/a;

    iget v1, p0, Lio/flutter/plugins/firebase/messaging/a$d;->b:I

    invoke-virtual {v0, v1}, Landroid/app/Service;->stopSelf(I)V

    return-void
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/a$d;->a:Landroid/content/Intent;

    return-object v0
.end method
