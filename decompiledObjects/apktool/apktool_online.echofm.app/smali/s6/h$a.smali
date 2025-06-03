.class public final Ls6/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/h;->a(Ls6/b;Lg6/p;)Ls6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ls6/b;

.field public final synthetic p:Lg6/p;


# direct methods
.method public constructor <init>(Ls6/b;Lg6/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/h$a;->o:Ls6/b;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/h$a;->p:Lg6/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ls6/c;LX5/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/s;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ls6/h$a;->o:Ls6/b;

    .line 7
    .line 8
    new-instance v2, Ls6/h$b;

    .line 9
    .line 10
    iget-object v3, p0, Ls6/h$a;->p:Lg6/p;

    .line 11
    .line 12
    invoke-direct {v2, v0, p1, v3}, Ls6/h$b;-><init>(Lkotlin/jvm/internal/s;Ls6/c;Lg6/p;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2, p2}, Ls6/b;->a(Ls6/c;LX5/d;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 27
    .line 28
    return-object p1
.end method
