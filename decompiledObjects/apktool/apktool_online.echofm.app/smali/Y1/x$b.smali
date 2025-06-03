.class public final LY1/x$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY1/x;->P1(Landroidx/fragment/app/e;)Lg6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:LY1/x;

.field public final synthetic p:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(LY1/x;Landroidx/fragment/app/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY1/x$b;->o:LY1/x;

    .line 2
    .line 3
    iput-object p2, p0, LY1/x$b;->p:Landroidx/fragment/app/e;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/result/a;)V
    .locals 3

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/activity/result/a;->b()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LY1/x$b;->o:LY1/x;

    .line 14
    .line 15
    invoke-virtual {v0}, LY1/x;->O1()LY1/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, LY1/u;->A:LY1/u$c;

    .line 20
    .line 21
    invoke-virtual {v1}, LY1/u$c;->b()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, Landroidx/activity/result/a;->b()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p1}, Landroidx/activity/result/a;->a()Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, v1, v2, p1}, LY1/u;->v(IILandroid/content/Intent;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p1, p0, LY1/x$b;->p:Landroidx/fragment/app/e;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/activity/result/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY1/x$b;->a(Landroidx/activity/result/a;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method
