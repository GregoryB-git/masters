.class public final synthetic Lta/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;


# instance fields
.field public final synthetic a:Lcom/ryanheise/audioservice/b;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/audioservice/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta/b;->a:Lcom/ryanheise/audioservice/b;

    return-void
.end method


# virtual methods
.method public final onNewIntent(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lta/b;->a:Lcom/ryanheise/audioservice/b;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/ryanheise/audioservice/b;->o()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
