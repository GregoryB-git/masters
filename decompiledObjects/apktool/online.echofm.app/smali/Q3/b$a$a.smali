.class public LQ3/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/b$a;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LQ3/b$a;


# direct methods
.method public constructor <init>(LQ3/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/b$a$a;->o:LQ3/b$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()LQ3/b;
    .locals 4

    .line 1
    iget-object v0, p0, LQ3/b$a$a;->o:LQ3/b$a;

    .line 2
    .line 3
    iget-object v0, v0, LQ3/b$a;->o:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ld4/m;

    .line 10
    .line 11
    new-instance v1, LQ3/b;

    .line 12
    .line 13
    iget-object v2, p0, LQ3/b$a$a;->o:LQ3/b$a;

    .line 14
    .line 15
    iget-object v2, v2, LQ3/b$a;->p:LQ3/b;

    .line 16
    .line 17
    invoke-static {v2}, LQ3/b;->a(LQ3/b;)LQ3/e;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0}, Ld4/m;->c()Ld4/b;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ld4/b;->e()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, LQ3/e;->W(Ljava/lang/String;)LQ3/e;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0}, Ld4/m;->d()Ld4/n;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ld4/i;->d(Ld4/n;)Ld4/i;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v1, v2, v0}, LQ3/b;-><init>(LQ3/e;Ld4/i;)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b$a$a;->o:LQ3/b$a;

    .line 2
    .line 3
    iget-object v0, v0, LQ3/b$a;->o:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/b$a$a;->b()LQ3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "remove called on immutable collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
