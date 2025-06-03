.class public abstract Lk9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/a$a;,
        Lk9/a$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lka/d0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lka/d0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lk9/a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lka/d0;Lka/d0;)Lka/d0;
    .locals 0

    invoke-virtual {p0, p1}, Lk9/a;->d(Lka/d0;)Lka/d0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lu7/m;Lka/d0;)Lka/d0;
    .locals 0

    invoke-virtual {p0, p2}, Lk9/a;->d(Lka/d0;)Lka/d0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lka/d0;)Lka/d0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract d(Lka/d0;)Lka/d0;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lk9/a;

    iget-object v0, p0, Lk9/a;->a:Ljava/util/List;

    iget-object p1, p1, Lk9/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk9/a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
