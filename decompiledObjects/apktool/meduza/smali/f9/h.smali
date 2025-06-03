.class public final Lf9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/c;


# instance fields
.field public final a:Lj9/i;

.field public final b:Lj9/q;

.field public final c:Z

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/i;Lj9/q;ZLjava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/h;->a:Lj9/i;

    iput-object p2, p0, Lf9/h;->b:Lj9/q;

    iput-boolean p3, p0, Lf9/h;->c:Z

    iput-object p4, p0, Lf9/h;->d:Ljava/util/List;

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

    if-eqz p1, :cond_5

    const-class v1, Lf9/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lf9/h;

    iget-boolean v1, p0, Lf9/h;->c:Z

    iget-boolean v2, p1, Lf9/h;->c:Z

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lf9/h;->a:Lj9/i;

    iget-object v2, p1, Lf9/h;->a:Lj9/i;

    invoke-virtual {v1, v2}, Lj9/i;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Lf9/h;->b:Lj9/q;

    iget-object v2, p1, Lf9/h;->b:Lj9/q;

    invoke-virtual {v1, v2}, Lj9/q;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    iget-object v0, p0, Lf9/h;->d:Ljava/util/List;

    iget-object p1, p1, Lf9/h;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lf9/h;->a:Lj9/i;

    invoke-virtual {v0}, Lj9/i;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf9/h;->b:Lj9/q;

    invoke-virtual {v1}, Lj9/q;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lf9/h;->c:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lf9/h;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
