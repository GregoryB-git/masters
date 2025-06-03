.class public final Lt8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lt8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/c<",
            "TT;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x19

    if-ge v1, v2, :cond_1

    .line 2
    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Ljava/lang/Object;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lt8/b;

    invoke-direct {p1, p2, v2, v1}, Lt8/b;-><init>(Ljava/util/Comparator;[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 3
    :cond_1
    invoke-static {p1, v0, p2}, Lt8/k$a;->b(Ljava/util/List;Ljava/util/Map;Ljava/util/Comparator;)Lt8/k;

    move-result-object p1

    .line 4
    :goto_1
    iput-object p1, p0, Lt8/e;->a:Lt8/c;

    return-void
.end method

.method public constructor <init>(Lt8/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/c<",
            "TT;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/e;->a:Lt8/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lt8/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lt8/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lt8/e;

    iget-object v1, p0, Lt8/e;->a:Lt8/c;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lt8/c;->n(Ljava/lang/Object;Ljava/lang/Object;)Lt8/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lt8/e;-><init>(Lt8/c;)V

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lt8/e;->a:Lt8/c;

    invoke-virtual {v0, p1}, Lt8/c;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lt8/e;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lt8/e;

    iget-object v0, p0, Lt8/e;->a:Lt8/c;

    iget-object p1, p1, Lt8/e;->a:Lt8/c;

    invoke-virtual {v0, p1}, Lt8/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final h(Li9/c;)Lt8/e$a;
    .locals 2

    new-instance v0, Lt8/e$a;

    iget-object v1, p0, Lt8/e;->a:Lt8/c;

    invoke-virtual {v1, p1}, Lt8/c;->o(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    invoke-direct {v0, p1}, Lt8/e$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lt8/e;->a:Lt8/c;

    invoke-virtual {v0}, Lt8/c;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i(Ljava/lang/Object;)Lt8/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lt8/e<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lt8/e;->a:Lt8/c;

    invoke-virtual {v0, p1}, Lt8/c;->p(Ljava/lang/Object;)Lt8/c;

    move-result-object p1

    iget-object v0, p0, Lt8/e;->a:Lt8/c;

    if-ne p1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lt8/e;

    invoke-direct {v0, p1}, Lt8/e;-><init>(Lt8/c;)V

    :goto_0
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lt8/e$a;

    iget-object v1, p0, Lt8/e;->a:Lt8/c;

    invoke-virtual {v1}, Lt8/c;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lt8/e$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lt8/e;->a:Lt8/c;

    invoke-virtual {v0}, Lt8/c;->size()I

    move-result v0

    return v0
.end method
