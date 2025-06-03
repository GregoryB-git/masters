.class public final Lz4/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# static fields
.field public static final d:Lz4/j0;

.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:Lo7/l0;

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz4/j0;

    const/4 v1, 0x0

    new-array v2, v1, [Lz4/i0;

    invoke-direct {v0, v2}, Lz4/j0;-><init>([Lz4/i0;)V

    sput-object v0, Lz4/j0;->d:Lz4/j0;

    invoke-static {v1}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lz4/j0;->e:Ljava/lang/String;

    new-instance v0, Le0/e;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Le0/e;-><init>(I)V

    return-void
.end method

.method public varargs constructor <init>([Lz4/i0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lo7/t;->q([Ljava/lang/Object;)Lo7/l0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lz4/j0;->b:Lo7/l0;

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    iput p1, p0, Lz4/j0;->a:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    :goto_0
    iget-object v0, p0, Lz4/j0;->b:Lo7/l0;

    .line 15
    .line 16
    iget v0, v0, Lo7/l0;->d:I

    .line 17
    .line 18
    if-ge p1, v0, :cond_2

    .line 19
    .line 20
    add-int/lit8 v0, p1, 0x1

    .line 21
    .line 22
    move v1, v0

    .line 23
    :goto_1
    iget-object v2, p0, Lz4/j0;->b:Lo7/l0;

    .line 24
    .line 25
    iget v3, v2, Lo7/l0;->d:I

    .line 26
    .line 27
    if-ge v1, v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2, p1}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lz4/i0;

    .line 34
    .line 35
    iget-object v3, p0, Lz4/j0;->b:Lo7/l0;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Lz4/i0;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v3, "Multiple identical TrackGroups added to one TrackGroupArray."

    .line 50
    .line 51
    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v3, "TrackGroupArray"

    .line 55
    .line 56
    const-string v4, ""

    .line 57
    .line 58
    invoke-static {v3, v4, v2}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move p1, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final a(I)Lz4/i0;
    .locals 1

    iget-object v0, p0, Lz4/j0;->b:Lo7/l0;

    invoke-virtual {v0, p1}, Lo7/l0;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz4/i0;

    return-object p1
.end method

.method public final b(Lz4/i0;)I
    .locals 1

    iget-object v0, p0, Lz4/j0;->b:Lo7/l0;

    invoke-virtual {v0, p1}, Lo7/t;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lz4/j0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lz4/j0;

    iget v2, p0, Lz4/j0;->a:I

    iget v3, p1, Lz4/j0;->a:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lz4/j0;->b:Lo7/l0;

    iget-object p1, p1, Lz4/j0;->b:Lo7/l0;

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
    .locals 1

    iget v0, p0, Lz4/j0;->c:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lz4/j0;->b:Lo7/l0;

    invoke-virtual {v0}, Lo7/t;->hashCode()I

    move-result v0

    iput v0, p0, Lz4/j0;->c:I

    :cond_0
    iget v0, p0, Lz4/j0;->c:I

    return v0
.end method
