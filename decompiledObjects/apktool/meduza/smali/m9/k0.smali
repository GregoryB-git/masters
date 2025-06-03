.class public final Lm9/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lma/h;

.field public final b:Z

.field public final c:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lma/h;ZLt8/e;Lt8/e;Lt8/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lma/h;",
            "Z",
            "Lt8/e<",
            "Lj9/i;",
            ">;",
            "Lt8/e<",
            "Lj9/i;",
            ">;",
            "Lt8/e<",
            "Lj9/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/k0;->a:Lma/h;

    iput-boolean p2, p0, Lm9/k0;->b:Z

    iput-object p3, p0, Lm9/k0;->c:Lt8/e;

    iput-object p4, p0, Lm9/k0;->d:Lt8/e;

    iput-object p5, p0, Lm9/k0;->e:Lt8/e;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    const-class v1, Lm9/k0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lm9/k0;

    iget-boolean v1, p0, Lm9/k0;->b:Z

    iget-boolean v2, p1, Lm9/k0;->b:Z

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lm9/k0;->a:Lma/h;

    iget-object v2, p1, Lm9/k0;->a:Lma/h;

    invoke-virtual {v1, v2}, Lma/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Lm9/k0;->c:Lt8/e;

    iget-object v2, p1, Lm9/k0;->c:Lt8/e;

    invoke-virtual {v1, v2}, Lt8/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Lm9/k0;->d:Lt8/e;

    iget-object v2, p1, Lm9/k0;->d:Lt8/e;

    invoke-virtual {v1, v2}, Lt8/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    :cond_5
    iget-object v0, p0, Lm9/k0;->e:Lt8/e;

    iget-object p1, p1, Lm9/k0;->e:Lt8/e;

    invoke-virtual {v0, p1}, Lt8/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm9/k0;->a:Lma/h;

    invoke-virtual {v0}, Lma/h;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lm9/k0;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm9/k0;->c:Lt8/e;

    invoke-virtual {v1}, Lt8/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lm9/k0;->d:Lt8/e;

    invoke-virtual {v0}, Lt8/e;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm9/k0;->e:Lt8/e;

    invoke-virtual {v1}, Lt8/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
