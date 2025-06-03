.class public abstract La0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/o$c;,
        La0/o$d;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:La0/o$d;

.field public f:Landroid/media/VolumeProvider;


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, La0/o;-><init>(IIILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La0/o;->a:I

    iput p2, p0, La0/o;->b:I

    iput p3, p0, La0/o;->d:I

    iput-object p4, p0, La0/o;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, La0/o;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, La0/o;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La0/o;->f:Landroid/media/VolumeProvider;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1e

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, La0/o$a;

    .line 12
    .line 13
    iget v4, p0, La0/o;->a:I

    .line 14
    .line 15
    iget v5, p0, La0/o;->b:I

    .line 16
    .line 17
    iget v6, p0, La0/o;->d:I

    .line 18
    .line 19
    iget-object v7, p0, La0/o;->c:Ljava/lang/String;

    .line 20
    .line 21
    move-object v2, v0

    .line 22
    move-object v3, p0

    .line 23
    invoke-direct/range {v2 .. v7}, La0/o$a;-><init>(La0/o;IIILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iput-object v0, p0, La0/o;->f:Landroid/media/VolumeProvider;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v0, La0/o$b;

    .line 30
    .line 31
    iget v1, p0, La0/o;->a:I

    .line 32
    .line 33
    iget v2, p0, La0/o;->b:I

    .line 34
    .line 35
    iget v3, p0, La0/o;->d:I

    .line 36
    .line 37
    invoke-direct {v0, p0, v1, v2, v3}, La0/o$b;-><init>(La0/o;III)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    iget-object v0, p0, La0/o;->f:Landroid/media/VolumeProvider;

    .line 42
    .line 43
    return-object v0
.end method

.method public abstract d(I)V
.end method

.method public abstract e(I)V
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iput p1, p0, La0/o;->d:I

    .line 2
    .line 3
    invoke-virtual {p0}, La0/o;->c()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/media/VolumeProvider;

    .line 8
    .line 9
    invoke-static {v0, p1}, La0/o$c;->a(Landroid/media/VolumeProvider;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
