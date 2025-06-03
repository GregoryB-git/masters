.class public final synthetic Ll5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/n;


# instance fields
.field public final synthetic a:Lcom/ryanheise/audioservice/a;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/audioservice/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/i;->a:Lcom/ryanheise/audioservice/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onNewIntent(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll5/i;->a:Lcom/ryanheise/audioservice/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/a;->a(Lcom/ryanheise/audioservice/a;Landroid/content/Intent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
