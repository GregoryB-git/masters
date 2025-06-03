.class public final Lma/h$a;
.super Lma/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lma/h;->s()Lma/h$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:I

.field public final b:I

.field public final synthetic c:Lma/h;


# direct methods
.method public constructor <init>(Lma/h;)V
    .locals 1

    iput-object p1, p0, Lma/h$a;->c:Lma/h;

    invoke-direct {p0}, Lma/h$b;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lma/h$a;->a:I

    invoke-virtual {p1}, Lma/h;->size()I

    move-result p1

    iput p1, p0, Lma/h$a;->b:I

    return-void
.end method


# virtual methods
.method public final f()B
    .locals 2

    iget v0, p0, Lma/h$a;->a:I

    iget v1, p0, Lma/h$a;->b:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lma/h$a;->a:I

    iget-object v1, p0, Lma/h$a;->c:Lma/h;

    invoke-virtual {v1, v0}, Lma/h;->p(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lma/h$a;->a:I

    iget v1, p0, Lma/h$a;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
