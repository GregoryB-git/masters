.class public Lv3/o0$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/o0$j$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lv3/o0$j$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lv3/o0$j$a;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object v0, p0, Lv3/o0$j;->a:Landroid/net/Uri;

    .line 7
    .line 8
    iget-object v0, p1, Lv3/o0$j$a;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lv3/o0$j;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p1, Lv3/o0$j$a;->c:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lv3/o0$j;->c:Ljava/lang/String;

    .line 15
    .line 16
    iget v0, p1, Lv3/o0$j$a;->d:I

    .line 17
    .line 18
    iput v0, p0, Lv3/o0$j;->d:I

    .line 19
    .line 20
    iget v0, p1, Lv3/o0$j$a;->e:I

    .line 21
    .line 22
    iput v0, p0, Lv3/o0$j;->e:I

    .line 23
    .line 24
    iget-object v0, p1, Lv3/o0$j$a;->f:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v0, p0, Lv3/o0$j;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p1, p1, Lv3/o0$j$a;->g:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p1, p0, Lv3/o0$j;->g:Ljava/lang/String;

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv3/o0$j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv3/o0$j;

    iget-object v1, p0, Lv3/o0$j;->a:Landroid/net/Uri;

    iget-object v3, p1, Lv3/o0$j;->a:Landroid/net/Uri;

    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$j;->b:Ljava/lang/String;

    iget-object v3, p1, Lv3/o0$j;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$j;->c:Ljava/lang/String;

    iget-object v3, p1, Lv3/o0$j;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lv3/o0$j;->d:I

    iget v3, p1, Lv3/o0$j;->d:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lv3/o0$j;->e:I

    iget v3, p1, Lv3/o0$j;->e:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lv3/o0$j;->f:Ljava/lang/String;

    iget-object v3, p1, Lv3/o0$j;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$j;->g:Ljava/lang/String;

    iget-object p1, p1, Lv3/o0$j;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lv3/o0$j;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$j;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$j;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv3/o0$j;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv3/o0$j;->e:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$j;->f:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$j;->g:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method
