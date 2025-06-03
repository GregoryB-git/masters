.class public final LX2/T$b;
.super LX2/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final transient q:LX2/w;

.field public final transient r:LX2/v;


# direct methods
.method public constructor <init>(LX2/w;LX2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX2/T$b;->q:LX2/w;

    .line 5
    .line 6
    iput-object p2, p0, LX2/T$b;->r:LX2/v;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()LX2/v;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/T$b;->r:LX2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LX2/T$b;->q:LX2/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LX2/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    return p1
.end method

.method public d([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/T$b;->a()LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LX2/v;->d([Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/T$b;->q()LX2/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public q()LX2/g0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/T$b;->a()LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX2/v;->q()LX2/g0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, LX2/T$b;->q:LX2/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/y;->writeReplace()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
