.class public LX2/k;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/k$h;,
        LX2/k$g;,
        LX2/k$d;,
        LX2/k$f;,
        LX2/k$e;
    }
.end annotation


# static fields
.field public static final x:Ljava/lang/Object;


# instance fields
.field public transient o:Ljava/lang/Object;

.field public transient p:[I

.field public transient q:[Ljava/lang/Object;

.field public transient r:[Ljava/lang/Object;

.field public transient s:I

.field public transient t:I

.field public transient u:Ljava/util/Set;

.field public transient v:Ljava/util/Set;

.field public transient w:Ljava/util/Collection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX2/k;->x:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    invoke-virtual {p0, v0}, LX2/k;->E(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(LX2/k;)I
    .locals 0

    .line 1
    iget p0, p0, LX2/k;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(LX2/k;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/k;->G(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LX2/k;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LX2/k;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(LX2/k;)I
    .locals 2

    .line 1
    iget v0, p0, LX2/k;->t:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iput v1, p0, LX2/k;->t:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic f(LX2/k;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LX2/k;->V(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(LX2/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/k;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LX2/k;->x:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic i(LX2/k;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/k;->D(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic j(LX2/k;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/k;->W(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(LX2/k;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, LX2/k;->B()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic l(LX2/k;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic m(LX2/k;)[I
    .locals 0

    .line 1
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static r()LX2/k;
    .locals 1

    .line 1
    new-instance v0, LX2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, LX2/k;->E(I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {p0, v2, v3}, LX2/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    new-instance p1, Ljava/io/InvalidObjectException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "Invalid size: "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LX2/k;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LX2/k;->y()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public A(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget v0, p0, LX2/k;->t:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, -0x1

    .line 9
    :goto_0
    return p1
.end method

.method public final B()I
    .locals 2

    .line 1
    iget v0, p0, LX2/k;->s:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int v0, v1, v0

    .line 7
    .line 8
    sub-int/2addr v0, v1

    .line 9
    return v0
.end method

.method public C()V
    .locals 1

    .line 1
    iget v0, p0, LX2/k;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    iput v0, p0, LX2/k;->s:I

    .line 6
    .line 7
    return-void
.end method

.method public final D(Ljava/lang/Object;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, LX2/k;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {p1}, LX2/s;->c(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, LX2/k;->B()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    and-int v4, v0, v2

    .line 22
    .line 23
    invoke-static {v3, v4}, LX2/l;->h(Ljava/lang/Object;I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    invoke-static {v0, v2}, LX2/l;->b(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 35
    .line 36
    invoke-virtual {p0, v3}, LX2/k;->x(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4, v2}, LX2/l;->b(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ne v5, v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v3}, LX2/k;->G(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {p1, v5}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    return v3

    .line 57
    :cond_3
    invoke-static {v4, v2}, LX2/l;->c(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    return v1
.end method

.method public E(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    const-string v2, "Expected size must be >= 0"

    .line 8
    .line 9
    invoke-static {v1, v2}, LW2/m;->e(ZLjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const v1, 0x3fffffff    # 1.9999999f

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1}, La3/f;->f(III)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, LX2/k;->s:I

    .line 20
    .line 21
    return-void
.end method

.method public F(ILjava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p4, v0, p5}, LX2/l;->d(III)I

    .line 3
    .line 4
    .line 5
    move-result p4

    .line 6
    invoke-virtual {p0, p1, p4}, LX2/k;->S(II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, LX2/k;->U(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p3}, LX2/k;->V(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final G(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method public H()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LX2/k$a;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LX2/k$a;-><init>(LX2/k;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public I(II)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0}, LX2/k;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    add-int/lit8 v5, v4, -0x1

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    if-ge p1, v5, :cond_2

    .line 26
    .line 27
    aget-object v8, v2, v5

    .line 28
    .line 29
    aput-object v8, v2, p1

    .line 30
    .line 31
    aget-object v9, v3, v5

    .line 32
    .line 33
    aput-object v9, v3, p1

    .line 34
    .line 35
    aput-object v7, v2, v5

    .line 36
    .line 37
    aput-object v7, v3, v5

    .line 38
    .line 39
    aget v2, v1, v5

    .line 40
    .line 41
    aput v2, v1, p1

    .line 42
    .line 43
    aput v6, v1, v5

    .line 44
    .line 45
    invoke-static {v8}, LX2/s;->c(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    and-int/2addr v2, p2

    .line 50
    invoke-static {v0, v2}, LX2/l;->h(Ljava/lang/Object;I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ne v3, v4, :cond_0

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-static {v0, v2, p1}, LX2/l;->i(Ljava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 63
    .line 64
    aget v0, v1, v3

    .line 65
    .line 66
    invoke-static {v0, p2}, LX2/l;->c(II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    invoke-static {v0, p1, p2}, LX2/l;->d(III)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    aput p1, v1, v3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move v3, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    aput-object v7, v2, p1

    .line 84
    .line 85
    aput-object v7, v3, p1

    .line 86
    .line 87
    aput v6, v1, p1

    .line 88
    .line 89
    :goto_1
    return-void
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->o:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final K(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, LX2/k;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, LX2/k;->x:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0}, LX2/k;->B()I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p1

    .line 29
    move v2, v7

    .line 30
    invoke-static/range {v0 .. v6}, LX2/l;->f(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v0, -0x1

    .line 35
    if-ne p1, v0, :cond_1

    .line 36
    .line 37
    sget-object p1, LX2/k;->x:Ljava/lang/Object;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, LX2/k;->W(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, p1, v7}, LX2/k;->I(II)V

    .line 45
    .line 46
    .line 47
    iget p1, p0, LX2/k;->t:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, -0x1

    .line 50
    .line 51
    iput p1, p0, LX2/k;->t:I

    .line 52
    .line 53
    invoke-virtual {p0}, LX2/k;->C()V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public final L()[I
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->p:[I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast v0, [I

    .line 7
    .line 8
    return-object v0
.end method

.method public final M()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->q:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast v0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method public final N()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->o:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final O()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->r:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast v0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method public P(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LX2/k;->p:[I

    .line 10
    .line 11
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LX2/k;->q:[Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LX2/k;->r:[Ljava/lang/Object;

    .line 30
    .line 31
    return-void
.end method

.method public final Q(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-le p1, v0, :cond_0

    .line 7
    .line 8
    ushr-int/lit8 p1, v0, 0x1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-int/2addr p1, v0

    .line 16
    or-int/2addr p1, v1

    .line 17
    const v1, 0x3fffffff    # 1.9999999f

    .line 18
    .line 19
    .line 20
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, LX2/k;->P(I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final R(IIII)I
    .locals 8

    .line 1
    invoke-static {p2}, LX2/l;->a(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p2, p2, -0x1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    and-int/2addr p3, p2

    .line 10
    add-int/lit8 p4, p4, 0x1

    .line 11
    .line 12
    invoke-static {v0, p3, p4}, LX2/l;->i(Ljava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-gt v1, p1, :cond_2

    .line 25
    .line 26
    invoke-static {p3, v1}, LX2/l;->h(Ljava/lang/Object;I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_1
    if-eqz v2, :cond_1

    .line 31
    .line 32
    add-int/lit8 v3, v2, -0x1

    .line 33
    .line 34
    aget v4, p4, v3

    .line 35
    .line 36
    invoke-static {v4, p1}, LX2/l;->b(II)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    or-int/2addr v5, v1

    .line 41
    and-int v6, v5, p2

    .line 42
    .line 43
    invoke-static {v0, v6}, LX2/l;->h(Ljava/lang/Object;I)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static {v0, v6, v2}, LX2/l;->i(Ljava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v7, p2}, LX2/l;->d(III)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aput v2, p4, v3

    .line 55
    .line 56
    invoke-static {v4, p1}, LX2/l;->c(II)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iput-object v0, p0, LX2/k;->o:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p0, p2}, LX2/k;->T(I)V

    .line 67
    .line 68
    .line 69
    return p2
.end method

.method public final S(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aput p2, v0, p1

    .line 6
    .line 7
    return-void
.end method

.method public final T(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    rsub-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iget v0, p0, LX2/k;->s:I

    .line 8
    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    invoke-static {v0, p1, v1}, LX2/l;->d(III)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, LX2/k;->s:I

    .line 16
    .line 17
    return-void
.end method

.method public final U(ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aput-object p2, v0, p1

    .line 6
    .line 7
    return-void
.end method

.method public final V(ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aput-object p2, v0, p1

    .line 6
    .line 7
    return-void
.end method

.method public final W(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method public X()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LX2/k$c;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LX2/k$c;-><init>(LX2/k;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public clear()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LX2/k;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, LX2/k;->C()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, LX2/k;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x3

    .line 24
    const v5, 0x3fffffff    # 1.9999999f

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v4, v5}, La3/f;->f(III)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, LX2/k;->s:I

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, LX2/k;->o:Ljava/lang/Object;

    .line 37
    .line 38
    :goto_0
    iput v2, p0, LX2/k;->t:I

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v3, p0, LX2/k;->t:I

    .line 46
    .line 47
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v3, p0, LX2/k;->t:I

    .line 55
    .line 56
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, LX2/l;->g(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget v1, p0, LX2/k;->t:I

    .line 71
    .line 72
    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :goto_1
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, LX2/k;->D(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget v2, p0, LX2/k;->t:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0, v1}, LX2/k;->W(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1, v2}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->v:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LX2/k;->s()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LX2/k;->v:Ljava/util/Set;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, LX2/k;->D(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-virtual {p0, p1}, LX2/k;->n(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, LX2/k;->W(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->u:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LX2/k;->u()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LX2/k;->u:Ljava/util/Set;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public n(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(II)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    return p1
.end method

.method public p()I
    .locals 3

    .line 1
    invoke-virtual {p0}, LX2/k;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Arrays already allocated"

    .line 6
    .line 7
    invoke-static {v0, v1}, LW2/m;->p(ZLjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, LX2/k;->s:I

    .line 11
    .line 12
    invoke-static {v0}, LX2/l;->j(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, LX2/l;->a(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, LX2/k;->o:Ljava/lang/Object;

    .line 21
    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, LX2/k;->T(I)V

    .line 25
    .line 26
    .line 27
    new-array v1, v0, [I

    .line 28
    .line 29
    iput-object v1, p0, LX2/k;->p:[I

    .line 30
    .line 31
    new-array v1, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v1, p0, LX2/k;->q:[Ljava/lang/Object;

    .line 34
    .line 35
    new-array v1, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v1, p0, LX2/k;->r:[Ljava/lang/Object;

    .line 38
    .line 39
    return v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, LX2/k;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LX2/k;->p()I

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, LX2/k;->M()[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, LX2/k;->O()[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v4, p0, LX2/k;->t:I

    .line 34
    .line 35
    add-int/lit8 v9, v4, 0x1

    .line 36
    .line 37
    invoke-static {p1}, LX2/s;->c(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-virtual {p0}, LX2/k;->B()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    and-int v5, v7, v3

    .line 46
    .line 47
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v6, v5}, LX2/l;->h(Ljava/lang/Object;I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    if-le v9, v3, :cond_2

    .line 58
    .line 59
    :goto_0
    invoke-static {v3}, LX2/l;->e(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p0, v3, v0, v7, v4}, LX2/k;->R(IIII)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    move v8, v0

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    invoke-virtual {p0}, LX2/k;->N()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v5, v9}, LX2/l;->i(Ljava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-static {v7, v3}, LX2/l;->b(II)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v8, 0x0

    .line 82
    :goto_1
    add-int/lit8 v6, v6, -0x1

    .line 83
    .line 84
    aget v10, v0, v6

    .line 85
    .line 86
    invoke-static {v10, v3}, LX2/l;->b(II)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    if-ne v11, v5, :cond_4

    .line 91
    .line 92
    aget-object v11, v1, v6

    .line 93
    .line 94
    invoke-static {p1, v11}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_4

    .line 99
    .line 100
    aget-object p1, v2, v6

    .line 101
    .line 102
    aput-object p2, v2, v6

    .line 103
    .line 104
    invoke-virtual {p0, v6}, LX2/k;->n(I)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_4
    invoke-static {v10, v3}, LX2/l;->c(II)I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    if-nez v11, :cond_7

    .line 115
    .line 116
    const/16 v1, 0x9

    .line 117
    .line 118
    if-lt v8, v1, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0}, LX2/k;->q()Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :cond_5
    if-le v9, v3, :cond_6

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_6
    invoke-static {v10, v9, v3}, LX2/l;->d(III)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    aput v1, v0, v6

    .line 137
    .line 138
    :goto_2
    move v8, v3

    .line 139
    :goto_3
    invoke-virtual {p0, v9}, LX2/k;->Q(I)V

    .line 140
    .line 141
    .line 142
    move-object v3, p0

    .line 143
    move-object v5, p1

    .line 144
    move-object v6, p2

    .line 145
    invoke-virtual/range {v3 .. v8}, LX2/k;->F(ILjava/lang/Object;Ljava/lang/Object;II)V

    .line 146
    .line 147
    .line 148
    iput v9, p0, LX2/k;->t:I

    .line 149
    .line 150
    invoke-virtual {p0}, LX2/k;->C()V

    .line 151
    .line 152
    .line 153
    const/4 p1, 0x0

    .line 154
    return-object p1

    .line 155
    :cond_7
    move v6, v11

    .line 156
    goto :goto_1
.end method

.method public q()Ljava/util/Map;
    .locals 4

    .line 1
    invoke-virtual {p0}, LX2/k;->B()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LX2/k;->t(I)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LX2/k;->z()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    :goto_0
    if-ltz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, LX2/k;->G(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0, v1}, LX2/k;->W(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1}, LX2/k;->A(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object v0, p0, LX2/k;->o:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, LX2/k;->p:[I

    .line 37
    .line 38
    iput-object v1, p0, LX2/k;->q:[Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, LX2/k;->r:[Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p0}, LX2/k;->C()V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, LX2/k;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, LX2/k;->x:Ljava/lang/Object;

    .line 17
    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    :cond_1
    return-object p1
.end method

.method public s()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, LX2/k$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LX2/k$d;-><init>(LX2/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, LX2/k;->t:I

    .line 13
    .line 14
    :goto_0
    return v0
.end method

.method public t(I)Ljava/util/Map;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public u()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, LX2/k$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LX2/k$f;-><init>(LX2/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public v()Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, LX2/k$h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LX2/k$h;-><init>(LX2/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k;->w:Ljava/util/Collection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LX2/k;->v()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LX2/k;->w:Ljava/util/Collection;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public w()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, LX2/k;->o:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final x(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->L()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method public y()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->w()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LX2/k$b;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LX2/k$b;-><init>(LX2/k;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public z()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/k;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method
