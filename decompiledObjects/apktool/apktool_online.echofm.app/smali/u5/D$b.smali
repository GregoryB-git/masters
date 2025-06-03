.class public Lu5/D$b;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu5/D;


# direct methods
.method public constructor <init>(Lu5/D;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/D$b;->a:Lu5/D;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public onChange(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu5/D$b;->a:Lu5/D;

    .line 5
    .line 6
    invoke-static {p1}, Lu5/D;->f(Lu5/D;)Lio/flutter/embedding/engine/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "FlutterView"

    .line 14
    .line 15
    const-string v0, "System settings changed. Sending user settings to Flutter."

    .line 16
    .line 17
    invoke-static {p1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lu5/D$b;->a:Lu5/D;

    .line 21
    .line 22
    invoke-virtual {p1}, Lu5/D;->B()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
