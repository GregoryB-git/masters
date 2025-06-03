.class public final LP/m$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ls6/b;


# direct methods
.method public constructor <init>(Ls6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/m$g$b;->o:Ls6/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ls6/c;LX5/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LP/m$g$b;->o:Ls6/b;

    .line 2
    .line 3
    new-instance v1, LP/m$g$b$a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LP/m$g$b$a;-><init>(Ls6/c;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, Ls6/b;->a(Ls6/c;LX5/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 20
    .line 21
    return-object p1
.end method
