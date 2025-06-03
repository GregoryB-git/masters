.class public final Lx0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lx0/Z;

.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:LX2/v;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lx0/Z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ld0/J;

    .line 5
    .line 6
    invoke-direct {v0, v2}, Lx0/Z;-><init>([Ld0/J;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lx0/Z;->d:Lx0/Z;

    .line 10
    .line 11
    invoke-static {v1}, Lg0/M;->w0(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lx0/Z;->e:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public varargs constructor <init>([Ld0/J;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LX2/v;->V([Ljava/lang/Object;)LX2/v;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lx0/Z;->b:LX2/v;

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    iput p1, p0, Lx0/Z;->a:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lx0/Z;->f()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Ld0/J;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0}, Lx0/Z;->e(Ld0/J;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ld0/J;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget p0, p0, Ld0/J;->c:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public b(I)Ld0/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/Z;->b:LX2/v;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ld0/J;

    .line 8
    .line 9
    return-object p1
.end method

.method public c()LX2/v;
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/Z;->b:LX2/v;

    .line 2
    .line 3
    new-instance v1, Lx0/Y;

    .line 4
    .line 5
    invoke-direct {v1}, Lx0/Y;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LX2/E;->k(Ljava/util/List;LW2/g;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LX2/v;->U(Ljava/util/Collection;)LX2/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public d(Ld0/J;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/Z;->b:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LX2/v;->indexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, -0x1

    .line 11
    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lx0/Z;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Lx0/Z;

    .line 18
    .line 19
    iget v2, p0, Lx0/Z;->a:I

    .line 20
    .line 21
    iget v3, p1, Lx0/Z;->a:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lx0/Z;->b:LX2/v;

    .line 26
    .line 27
    iget-object p1, p1, Lx0/Z;->b:LX2/v;

    .line 28
    .line 29
    invoke-virtual {v2, p1}, LX2/v;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v0, v1

    .line 37
    :goto_0
    return v0

    .line 38
    :cond_3
    :goto_1
    return v1
.end method

.method public final f()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lx0/Z;->b:LX2/v;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_2

    .line 9
    .line 10
    add-int/lit8 v1, v0, 0x1

    .line 11
    .line 12
    move v2, v1

    .line 13
    :goto_1
    iget-object v3, p0, Lx0/Z;->b:LX2/v;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_1

    .line 20
    .line 21
    iget-object v3, p0, Lx0/Z;->b:LX2/v;

    .line 22
    .line 23
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ld0/J;

    .line 28
    .line 29
    iget-object v4, p0, Lx0/Z;->b:LX2/v;

    .line 30
    .line 31
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Ld0/J;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "TrackGroupArray"

    .line 49
    .line 50
    const-string v5, ""

    .line 51
    .line 52
    invoke-static {v4, v5, v3}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v0, v1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    return-void
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lx0/Z;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx0/Z;->b:LX2/v;

    .line 6
    .line 7
    invoke-virtual {v0}, LX2/v;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lx0/Z;->c:I

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lx0/Z;->c:I

    .line 14
    .line 15
    return v0
.end method
