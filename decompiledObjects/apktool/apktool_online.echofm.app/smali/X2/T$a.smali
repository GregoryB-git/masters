.class public LX2/T$a;
.super LX2/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final transient q:LX2/w;

.field public final transient r:[Ljava/lang/Object;

.field public final transient s:I

.field public final transient t:I


# direct methods
.method public constructor <init>(LX2/w;[Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX2/T$a;->q:LX2/w;

    .line 5
    .line 6
    iput-object p2, p0, LX2/T$a;->r:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, LX2/T$a;->s:I

    .line 9
    .line 10
    iput p4, p0, LX2/T$a;->t:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic e0(LX2/T$a;)I
    .locals 0

    .line 1
    iget p0, p0, LX2/T$a;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f0(LX2/T$a;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LX2/T$a;->r:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g0(LX2/T$a;)I
    .locals 0

    .line 1
    iget p0, p0, LX2/T$a;->s:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public V()LX2/v;
    .locals 1

    .line 1
    new-instance v0, LX2/T$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LX2/T$a$a;-><init>(LX2/T$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LX2/T$a;->q:LX2/w;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, LX2/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    :cond_0
    return v1
.end method

.method public d([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/y;->a()LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LX2/v;->d([Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/T$a;->q()LX2/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public q()LX2/g0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/y;->a()LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX2/v;->q()LX2/g0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, LX2/T$a;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/y;->writeReplace()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
