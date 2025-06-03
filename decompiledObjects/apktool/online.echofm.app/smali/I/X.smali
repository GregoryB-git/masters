.class public final LI/X;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/X$d;,
        LI/X$e;,
        LI/X$c;,
        LI/X$b;,
        LI/X$a;
    }
.end annotation


# instance fields
.field public final a:LI/X$e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance p2, LI/X$d;

    .line 11
    .line 12
    invoke-direct {p2, p1, p0}, LI/X$d;-><init>(Landroid/view/Window;LI/X;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, LI/X;->a:LI/X$e;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/16 v1, 0x1a

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, LI/X$c;

    .line 23
    .line 24
    invoke-direct {v0, p1, p2}, LI/X$c;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v0, p0, LI/X;->a:LI/X$e;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v0, LI/X$b;

    .line 31
    .line 32
    invoke-direct {v0, p1, p2}, LI/X$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/X;->a:LI/X$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/X$e;->a(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/X;->a:LI/X$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/X$e;->b(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
