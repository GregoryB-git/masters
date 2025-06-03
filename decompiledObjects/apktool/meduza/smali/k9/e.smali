.class public final Lk9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj9/l;

.field public final b:Lk9/p;


# direct methods
.method public constructor <init>(Lj9/l;Lk9/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/e;->a:Lj9/l;

    iput-object p2, p0, Lk9/e;->b:Lk9/p;

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

    if-eqz p1, :cond_3

    const-class v1, Lk9/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lk9/e;

    iget-object v1, p0, Lk9/e;->a:Lj9/l;

    iget-object v2, p1, Lk9/e;->a:Lj9/l;

    invoke-virtual {v1, v2}, Lj9/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Lk9/e;->b:Lk9/p;

    iget-object p1, p1, Lk9/e;->b:Lk9/p;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lk9/e;->a:Lj9/l;

    invoke-virtual {v0}, Lj9/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk9/e;->b:Lk9/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
