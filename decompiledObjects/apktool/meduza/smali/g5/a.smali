.class public final Lg5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly4/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/a$b;,
        Lg5/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly4/a<",
        "Lg5/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Lg5/a$a;

.field public final f:[Lg5/a$b;

.field public final g:J

.field public final h:J


# direct methods
.method public constructor <init>(IIJJIZLg5/a$a;[Lg5/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg5/a;->a:I

    iput p2, p0, Lg5/a;->b:I

    iput-wide p3, p0, Lg5/a;->g:J

    iput-wide p5, p0, Lg5/a;->h:J

    iput p7, p0, Lg5/a;->c:I

    iput-boolean p8, p0, Lg5/a;->d:Z

    iput-object p9, p0, Lg5/a;->e:Lg5/a$a;

    iput-object p10, p0, Lg5/a;->f:[Lg5/a$b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Object;
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly4/c;

    iget-object v6, p0, Lg5/a;->f:[Lg5/a$b;

    iget v7, v5, Ly4/c;->b:I

    aget-object v6, v6, v7

    if-eq v6, v3, :cond_0

    if-eqz v3, :cond_0

    new-array v7, v2, [Lv3/i0;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lv3/i0;

    invoke-virtual {v3, v7}, Lg5/a$b;->a([Lv3/i0;)Lg5/a$b;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_0
    iget-object v3, v6, Lg5/a$b;->j:[Lv3/i0;

    iget v5, v5, Ly4/c;->c:I

    aget-object v3, v3, v5

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move-object v3, v6

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    new-array v0, v2, [Lv3/i0;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv3/i0;

    invoke-virtual {v3, v0}, Lg5/a$b;->a([Lv3/i0;)Lg5/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    new-array v0, v2, [Lg5/a$b;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, [Lg5/a$b;

    new-instance p1, Lg5/a;

    iget v1, p0, Lg5/a;->a:I

    iget v2, p0, Lg5/a;->b:I

    iget-wide v3, p0, Lg5/a;->g:J

    iget-wide v5, p0, Lg5/a;->h:J

    iget v7, p0, Lg5/a;->c:I

    iget-boolean v8, p0, Lg5/a;->d:Z

    iget-object v9, p0, Lg5/a;->e:Lg5/a$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v10}, Lg5/a;-><init>(IIJJIZLg5/a$a;[Lg5/a$b;)V

    return-object p1
.end method
