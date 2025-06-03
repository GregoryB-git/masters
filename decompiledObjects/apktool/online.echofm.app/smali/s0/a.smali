.class public final Ls0/a;
.super Lj0/k;
.source "SourceFile"

# interfaces
.implements Ls0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/a$b;,
        Ls0/a$c;
    }
.end annotation


# instance fields
.field public final o:Ls0/a$b;


# direct methods
.method public constructor <init>(Ls0/a$b;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    new-array v1, v0, [Lj0/i;

    new-array v0, v0, [Ls0/f;

    invoke-direct {p0, v1, v0}, Lj0/k;-><init>([Lj0/i;[Lj0/j;)V

    iput-object p1, p0, Ls0/a;->o:Ls0/a$b;

    return-void
.end method

.method public synthetic constructor <init>(Ls0/a$b;Ls0/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ls0/a;-><init>(Ls0/a$b;)V

    return-void
.end method

.method public static B([BI)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, p1, v0}, Li0/c;->a([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Ld0/A; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-object p0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    new-instance p1, Ls0/d;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Ls0/d;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :catch_1
    move-exception v0

    .line 15
    new-instance v1, Ls0/d;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "Could not decode image data with BitmapFactory. (data.length = "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    array-length p0, p0

    .line 28
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", input length = "

    .line 32
    .line 33
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ")"

    .line 40
    .line 41
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v1, p0, v0}, Ls0/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v1
.end method

.method public static synthetic x([BI)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ls0/a;->B([BI)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic y(Ls0/a;Lj0/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj0/k;->t(Lj0/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)Ls0/d;
    .locals 2

    .line 1
    new-instance v0, Ls0/d;

    .line 2
    .line 3
    const-string v1, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Ls0/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public C(Lj0/i;Ls0/f;Z)Ls0/d;
    .locals 2

    .line 1
    :try_start_0
    iget-object p3, p1, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {p3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Ls0/a;->o:Ls0/a$b;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    invoke-interface {v0, v1, p3}, Ls0/a$b;->a([BI)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    iput-object p3, p2, Ls0/f;->s:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    iget-wide v0, p1, Lj0/i;->t:J

    .line 45
    .line 46
    iput-wide v0, p2, Lj0/j;->p:J
    :try_end_0
    .catch Ls0/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return-object p1

    .line 50
    :catch_0
    move-exception p1

    .line 51
    return-object p1
.end method

.method public bridge synthetic a()Ls0/f;
    .locals 1

    .line 1
    invoke-super {p0}, Lj0/k;->o()Lj0/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ls0/f;

    .line 6
    .line 7
    return-object v0
.end method

.method public i()Lj0/i;
    .locals 2

    .line 1
    new-instance v0, Lj0/i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lj0/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic j()Lj0/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls0/a;->z()Ls0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Throwable;)Lj0/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls0/a;->A(Ljava/lang/Throwable;)Ls0/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic l(Lj0/i;Lj0/j;Z)Lj0/h;
    .locals 0

    .line 1
    check-cast p2, Ls0/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ls0/a;->C(Lj0/i;Ls0/f;Z)Ls0/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public z()Ls0/f;
    .locals 1

    .line 1
    new-instance v0, Ls0/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ls0/a$a;-><init>(Ls0/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
