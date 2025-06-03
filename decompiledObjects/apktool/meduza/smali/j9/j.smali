.class public final Lj9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lj9/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lt8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/g;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt8/c;Lt8/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/g;",
            ">;",
            "Lt8/e<",
            "Lj9/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/j;->a:Lt8/c;

    iput-object p2, p0, Lj9/j;->b:Lt8/e;

    return-void
.end method


# virtual methods
.method public final a(Lj9/g;)Lj9/j;
    .locals 3

    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj9/j;->h(Lj9/i;)Lj9/j;

    move-result-object v0

    iget-object v1, v0, Lj9/j;->a:Lt8/c;

    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lt8/c;->n(Ljava/lang/Object;Ljava/lang/Object;)Lt8/c;

    move-result-object v1

    iget-object v0, v0, Lj9/j;->b:Lt8/e;

    invoke-virtual {v0, p1}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    move-result-object p1

    new-instance v0, Lj9/j;

    invoke-direct {v0, v1, p1}, Lj9/j;-><init>(Lt8/c;Lt8/e;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    const-class v2, Lj9/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lj9/j;

    invoke-virtual {p0}, Lj9/j;->size()I

    move-result v2

    invoke-virtual {p1}, Lj9/j;->size()I

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lj9/j;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-virtual {p1}, Lj9/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    move-object v3, v2

    check-cast v3, Lt8/e$a;

    invoke-virtual {v3}, Lt8/e$a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Lt8/e$a;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj9/g;

    move-object v4, p1

    check-cast v4, Lt8/e$a;

    invoke-virtual {v4}, Lt8/e$a;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj9/g;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public final h(Lj9/i;)Lj9/j;
    .locals 2

    iget-object v0, p0, Lj9/j;->a:Lt8/c;

    invoke-virtual {v0, p1}, Lt8/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj9/g;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, p0, Lj9/j;->a:Lt8/c;

    invoke-virtual {v1, p1}, Lt8/c;->p(Ljava/lang/Object;)Lt8/c;

    move-result-object p1

    iget-object v1, p0, Lj9/j;->b:Lt8/e;

    invoke-virtual {v1, v0}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    move-result-object v0

    new-instance v1, Lj9/j;

    invoke-direct {v1, p1, v0}, Lj9/j;-><init>(Lt8/c;Lt8/e;)V

    return-object v1
.end method

.method public final hashCode()I
    .locals 4

    invoke-virtual {p0}, Lj9/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    move-object v2, v0

    check-cast v2, Lt8/e$a;

    invoke-virtual {v2}, Lt8/e$a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lt8/e$a;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj9/g;

    mul-int/lit8 v1, v1, 0x1f

    invoke-interface {v2}, Lj9/g;->getKey()Lj9/i;

    move-result-object v3

    invoke-virtual {v3}, Lj9/i;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    invoke-interface {v2}, Lj9/g;->getData()Lj9/n;

    move-result-object v1

    invoke-virtual {v1}, Lj9/n;->hashCode()I

    move-result v1

    add-int/2addr v1, v3

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lj9/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj9/j;->b:Lt8/e;

    invoke-virtual {v0}, Lt8/e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lj9/j;->a:Lt8/c;

    invoke-virtual {v0}, Lt8/c;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lj9/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    move-object v3, v1

    check-cast v3, Lt8/e$a;

    invoke-virtual {v3}, Lt8/e$a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lt8/e$a;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj9/g;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
