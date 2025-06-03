.class public final Lr0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/j;


# instance fields
.field public final a:Lr0/j;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lr0/j;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr0/e;->a:Lr0/j;

    .line 5
    .line 6
    iput-object p2, p0, Lr0/e;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lr0/g;Lr0/f;)LB0/p$a;
    .locals 2

    .line 1
    new-instance v0, Lv0/b;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/e;->a:Lr0/j;

    .line 4
    .line 5
    invoke-interface {v1, p1, p2}, Lr0/j;->a(Lr0/g;Lr0/f;)LB0/p$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Lr0/e;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, Lv0/b;-><init>(LB0/p$a;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public b()LB0/p$a;
    .locals 3

    .line 1
    new-instance v0, Lv0/b;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/e;->a:Lr0/j;

    .line 4
    .line 5
    invoke-interface {v1}, Lr0/j;->b()LB0/p$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lr0/e;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lv0/b;-><init>(LB0/p$a;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
