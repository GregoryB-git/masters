.class public LX2/d$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/d$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final o:Ljava/util/Iterator;

.field public final p:Ljava/util/Collection;

.field public final synthetic q:LX2/d$j;


# direct methods
.method public constructor <init>(LX2/d$j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX2/d$j$a;->q:LX2/d$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LX2/d$j;->p:Ljava/util/Collection;

    iput-object p1, p0, LX2/d$j$a;->p:Ljava/util/Collection;

    invoke-static {p1}, LX2/d;->i(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LX2/d$j$a;->o:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(LX2/d$j;Ljava/util/Iterator;)V
    .locals 0

    .line 2
    iput-object p1, p0, LX2/d$j$a;->q:LX2/d$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LX2/d$j;->p:Ljava/util/Collection;

    iput-object p1, p0, LX2/d$j$a;->p:Ljava/util/Collection;

    iput-object p2, p0, LX2/d$j$a;->o:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/d$j$a;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LX2/d$j$a;->o:Ljava/util/Iterator;

    .line 5
    .line 6
    return-object v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LX2/d$j$a;->q:LX2/d$j;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/d$j;->i()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX2/d$j$a;->q:LX2/d$j;

    .line 7
    .line 8
    iget-object v0, v0, LX2/d$j;->p:Ljava/util/Collection;

    .line 9
    .line 10
    iget-object v1, p0, LX2/d$j$a;->p:Ljava/util/Collection;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/d$j$a;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LX2/d$j$a;->o:Ljava/util/Iterator;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/d$j$a;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LX2/d$j$a;->o:Ljava/util/Iterator;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 1
    iget-object v0, p0, LX2/d$j$a;->o:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX2/d$j$a;->q:LX2/d$j;

    .line 7
    .line 8
    iget-object v0, v0, LX2/d$j;->s:LX2/d;

    .line 9
    .line 10
    invoke-static {v0}, LX2/d;->k(LX2/d;)I

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LX2/d$j$a;->q:LX2/d$j;

    .line 14
    .line 15
    invoke-virtual {v0}, LX2/d$j;->k()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
