.class public final Ls0/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final b:Ls0/a$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls0/b;

    .line 5
    .line 6
    invoke-direct {v0}, Ls0/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ls0/a$c;->b:Ls0/a$b;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic c([BI)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ls0/a$c;->e([BI)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e([BI)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ls0/a;->x([BI)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(Ld0/q;)I
    .locals 1

    .line 1
    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {v0}, Ld0/z;->p(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object p1, p1, Ld0/q;->n:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lg0/M;->y0(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    :goto_0
    invoke-static {p1}, Lk0/Z0;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    return p1

    .line 29
    :cond_2
    :goto_2
    const/4 p1, 0x0

    .line 30
    invoke-static {p1}, Lk0/Z0;->a(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public bridge synthetic b()Ls0/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls0/a$c;->d()Ls0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Ls0/a;
    .locals 3

    .line 1
    new-instance v0, Ls0/a;

    .line 2
    .line 3
    iget-object v1, p0, Ls0/a$c;->b:Ls0/a$b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ls0/a;-><init>(Ls0/a$b;Ls0/a$a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
