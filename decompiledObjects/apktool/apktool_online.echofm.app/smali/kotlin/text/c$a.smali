.class public final Lkotlin/text/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lh6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:I

.field public p:I

.field public q:I

.field public r:Ll6/c;

.field public s:I

.field public final synthetic t:Lkotlin/text/c;


# direct methods
.method public constructor <init>(Lkotlin/text/c;)V
    .locals 2

    iput-object p1, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lkotlin/text/c$a;->o:I

    invoke-static {p1}, Lkotlin/text/c;->d(Lkotlin/text/c;)I

    move-result v0

    invoke-static {p1}, Lkotlin/text/c;->b(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Ll6/d;->d(III)I

    move-result p1

    iput p1, p0, Lkotlin/text/c$a;->p:I

    iput p1, p0, Lkotlin/text/c$a;->q:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    iget v0, p0, Lkotlin/text/c$a;->q:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, Lkotlin/text/c$a;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Lkotlin/text/c$a;->r:Ll6/c;

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v0}, Lkotlin/text/c;->c(Lkotlin/text/c;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, Lkotlin/text/c$a;->s:I

    add-int/2addr v0, v3

    iput v0, p0, Lkotlin/text/c$a;->s:I

    iget-object v4, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->c(Lkotlin/text/c;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, Lkotlin/text/c$a;->q:I

    iget-object v4, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->b(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    :cond_2
    new-instance v0, Ll6/c;

    iget v1, p0, Lkotlin/text/c$a;->p:I

    iget-object v4, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->b(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/s;->x(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Ll6/c;-><init>(II)V

    :goto_0
    iput-object v0, p0, Lkotlin/text/c$a;->r:Ll6/c;

    :goto_1
    iput v2, p0, Lkotlin/text/c$a;->q:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v0}, Lkotlin/text/c;->a(Lkotlin/text/c;)Lg6/p;

    move-result-object v0

    iget-object v4, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->b(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, Lkotlin/text/c$a;->q:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lg6/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV5/m;

    if-nez v0, :cond_4

    new-instance v0, Ll6/c;

    iget v1, p0, Lkotlin/text/c$a;->p:I

    iget-object v4, p0, Lkotlin/text/c$a;->t:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->b(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/s;->x(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Ll6/c;-><init>(II)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LV5/m;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, LV5/m;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, Lkotlin/text/c$a;->p:I

    invoke-static {v4, v2}, Ll6/d;->g(II)Ll6/c;

    move-result-object v4

    iput-object v4, p0, Lkotlin/text/c$a;->r:Ll6/c;

    add-int/2addr v2, v0

    iput v2, p0, Lkotlin/text/c$a;->p:I

    if-nez v0, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v2, v1

    goto :goto_1

    :goto_2
    iput v3, p0, Lkotlin/text/c$a;->o:I

    :goto_3
    return-void
.end method

.method public d()Ll6/c;
    .locals 3

    .line 1
    iget v0, p0, Lkotlin/text/c$a;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lkotlin/text/c$a;->b()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lkotlin/text/c$a;->o:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lkotlin/text/c$a;->r:Ll6/c;

    .line 14
    .line 15
    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lkotlin/text/c$a;->r:Ll6/c;

    .line 22
    .line 23
    iput v1, p0, Lkotlin/text/c$a;->o:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lkotlin/text/c$a;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lkotlin/text/c$a;->b()V

    :cond_0
    iget v0, p0, Lkotlin/text/c$a;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/text/c$a;->d()Ll6/c;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
