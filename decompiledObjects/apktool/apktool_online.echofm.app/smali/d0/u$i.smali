.class public final Ld0/u$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld0/u$i$a;
    }
.end annotation


# static fields
.field public static final d:Ld0/u$i;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld0/u$i$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/u$i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ld0/u$i$a;->d()Ld0/u$i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ld0/u$i;->d:Ld0/u$i;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lg0/M;->w0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ld0/u$i;->e:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0}, Lg0/M;->w0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Ld0/u$i;->f:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Lg0/M;->w0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Ld0/u$i;->g:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ld0/u$i$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ld0/u$i$a;->a(Ld0/u$i$a;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ld0/u$i;->a:Landroid/net/Uri;

    invoke-static {p1}, Ld0/u$i$a;->b(Ld0/u$i$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ld0/u$i;->b:Ljava/lang/String;

    invoke-static {p1}, Ld0/u$i$a;->c(Ld0/u$i$a;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Ld0/u$i;->c:Landroid/os/Bundle;

    return-void
.end method

.method public synthetic constructor <init>(Ld0/u$i$a;Ld0/u$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ld0/u$i;-><init>(Ld0/u$i$a;)V

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Ld0/u$i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ld0/u$i;

    .line 12
    .line 13
    iget-object v1, p0, Ld0/u$i;->a:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v3, p1, Ld0/u$i;->a:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    iget-object v1, p0, Ld0/u$i;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Ld0/u$i;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    iget-object v1, p0, Ld0/u$i;->c:Landroid/os/Bundle;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    move v1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move v1, v2

    .line 40
    :goto_0
    iget-object p1, p1, Ld0/u$i;->c:Landroid/os/Bundle;

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    move p1, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move p1, v2

    .line 47
    :goto_1
    if-ne v1, p1, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move v0, v2

    .line 51
    :goto_2
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/u$i;->a:Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Ld0/u$i;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Ld0/u$i;->c:Landroid/os/Bundle;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    const/4 v1, 0x1

    .line 33
    :goto_2
    add-int/2addr v0, v1

    .line 34
    return v0
.end method
