.class public final Lb1/z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/c0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/z;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb1/z;


# direct methods
.method public constructor <init>(Lb1/z;)V
    .locals 0

    iput-object p1, p0, Lb1/z$b;->a:Lb1/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb1/z$b;->a:Lb1/z;

    .line 2
    .line 3
    iget v1, v0, Lb1/z;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    add-int/2addr v1, v2

    .line 7
    iput v1, v0, Lb1/z;->a:I

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-boolean v1, v0, Lb1/z;->d:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lb1/z;->f:Lb1/p;

    .line 16
    .line 17
    sget-object v2, Lb1/k$a;->ON_START:Lb1/k$a;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lb1/p;->f(Lb1/k$a;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, v0, Lb1/z;->d:Z

    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final onCreate()V
    .locals 0

    return-void
.end method

.method public final onResume()V
    .locals 1

    iget-object v0, p0, Lb1/z$b;->a:Lb1/z;

    invoke-virtual {v0}, Lb1/z;->a()V

    return-void
.end method
