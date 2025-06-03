.class public final Lp6/E$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/E;->a(LX5/g;LX5/g;Z)LX5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lkotlin/jvm/internal/u;

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/u;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp6/E$b;->o:Lkotlin/jvm/internal/u;

    .line 2
    .line 3
    iput-boolean p2, p0, Lp6/E$b;->p:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LX5/g;LX5/g$b;)LX5/g;
    .locals 0

    .line 1
    invoke-interface {p1, p2}, LX5/g;->k(LX5/g;)LX5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LX5/g;

    .line 2
    .line 3
    check-cast p2, LX5/g$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lp6/E$b;->a(LX5/g;LX5/g$b;)LX5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
