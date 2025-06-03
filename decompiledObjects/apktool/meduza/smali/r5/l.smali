.class public final Lr5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# static fields
.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Le0/d;


# instance fields
.field public final a:Lz4/i0;

.field public final b:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lr5/l;->c:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lr5/l;->d:Ljava/lang/String;

    new-instance v0, Le0/d;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    sput-object v0, Lr5/l;->e:Le0/d;

    return-void
.end method

.method public constructor <init>(Lz4/i0;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz4/i0;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p1, Lz4/i0;->a:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lr5/l;->a:Lz4/i0;

    invoke-static {p2}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p1

    iput-object p1, p0, Lr5/l;->b:Lo7/t;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lr5/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lr5/l;

    iget-object v2, p0, Lr5/l;->a:Lz4/i0;

    iget-object v3, p1, Lr5/l;->a:Lz4/i0;

    invoke-virtual {v2, v3}, Lz4/i0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lr5/l;->b:Lo7/t;

    iget-object p1, p1, Lr5/l;->b:Lo7/t;

    invoke-virtual {v2, p1}, Lo7/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lr5/l;->a:Lz4/i0;

    invoke-virtual {v0}, Lz4/i0;->hashCode()I

    move-result v0

    iget-object v1, p0, Lr5/l;->b:Lo7/t;

    invoke-virtual {v1}, Lo7/t;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method
