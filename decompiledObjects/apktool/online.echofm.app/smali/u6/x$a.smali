.class public final Lu6/x$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu6/x;->a(Lg6/l;Ljava/lang/Object;LX5/g;)Lg6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lg6/l;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:LX5/g;


# direct methods
.method public constructor <init>(Lg6/l;Ljava/lang/Object;LX5/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu6/x$a;->o:Lg6/l;

    .line 2
    .line 3
    iput-object p2, p0, Lu6/x$a;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lu6/x$a;->q:LX5/g;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lu6/x$a;->o:Lg6/l;

    .line 2
    .line 3
    iget-object v0, p0, Lu6/x$a;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lu6/x$a;->q:LX5/g;

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lu6/x;->b(Lg6/l;Ljava/lang/Object;LX5/g;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu6/x$a;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method
