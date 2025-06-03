.class public LJ4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ4/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:LM4/l;

.field public q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ4/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LJ4/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ4/a;->q:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LJ4/a;->o:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, LJ4/a;->q:Z

    const-class v0, LM4/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, LM4/l;

    iput-object p1, p0, LJ4/a;->p:LM4/l;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;LJ4/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LJ4/a;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LM4/a;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ4/a;->q:Z

    iput-object p1, p0, LJ4/a;->o:Ljava/lang/String;

    invoke-virtual {p2}, LM4/a;->a()LM4/l;

    move-result-object p1

    iput-object p1, p0, LJ4/a;->p:LM4/l;

    return-void
.end method

.method public static b(Ljava/util/List;)[LN4/k;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v0, v0, [LN4/k;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, LJ4/a;

    .line 21
    .line 22
    invoke-virtual {v2}, LJ4/a;->a()LN4/k;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x1

    .line 27
    move v5, v1

    .line 28
    move v4, v3

    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ge v4, v6, :cond_2

    .line 34
    .line 35
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, LJ4/a;

    .line 40
    .line 41
    invoke-virtual {v6}, LJ4/a;->a()LN4/k;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, LJ4/a;

    .line 52
    .line 53
    invoke-virtual {v7}, LJ4/a;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    aput-object v6, v0, v1

    .line 60
    .line 61
    aput-object v2, v0, v4

    .line 62
    .line 63
    move v5, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    aput-object v6, v0, v4

    .line 66
    .line 67
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    if-nez v5, :cond_3

    .line 71
    .line 72
    aput-object v2, v0, v1

    .line 73
    .line 74
    :cond_3
    return-object v0
.end method

.method public static c(Ljava/lang/String;)LJ4/a;
    .locals 2

    .line 1
    const-string v0, "-"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, LJ4/a;

    .line 10
    .line 11
    new-instance v1, LM4/a;

    .line 12
    .line 13
    invoke-direct {v1}, LM4/a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, LJ4/a;-><init>(Ljava/lang/String;LM4/a;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, LJ4/a;->j()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v0, p0}, LJ4/a;->i(Z)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static j()Z
    .locals 5

    .line 1
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC4/a;->L()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0}, LC4/a;->D()D

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    cmpg-double v0, v1, v3

    .line 20
    .line 21
    if-gez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    return v0
.end method


# virtual methods
.method public a()LN4/k;
    .locals 2

    .line 1
    invoke-static {}, LN4/k;->a0()LN4/k$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LJ4/a;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, LN4/k$c;->E(Ljava/lang/String;)LN4/k$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v1, p0, LJ4/a;->q:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v1, LN4/l;->q:LN4/l;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LN4/k$c;->D(LN4/l;)LN4/k$c;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LN4/k;

    .line 25
    .line 26
    return-object v0
.end method

.method public d()LM4/l;
    .locals 1

    .line 1
    iget-object v0, p0, LJ4/a;->p:LM4/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ4/a;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()Z
    .locals 4

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v1, p0, LJ4/a;->p:LM4/l;

    .line 4
    .line 5
    invoke-virtual {v1}, LM4/l;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, LC4/a;->A()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    cmp-long v0, v0, v2

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ4/a;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJ4/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ4/a;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object p2, p0, LJ4/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, LJ4/a;->q:Z

    .line 7
    .line 8
    int-to-byte p2, p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, LJ4/a;->p:LM4/l;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
